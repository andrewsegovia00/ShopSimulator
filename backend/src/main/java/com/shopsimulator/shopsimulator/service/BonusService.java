package com.shopsimulator.shopsimulator.service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.Write;
import com.shopsimulator.shopsimulator.entity.Bonus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class BonusService {

    public static final String BONUS_COLLECTION = "BONUS";

    public String saveBonus(Bonus bonus) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = db.collection(BONUS_COLLECTION)
                .document(bonus.getName()).create(bonus);

        return collectionApiFuture.get().getUpdateTime().toString();
    }

    public String deleteBonus(String bonus) throws Exception, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> documentApiFuture = db.collection(BONUS_COLLECTION).document(bonus).delete();
        return "Bonus " + " has beene removed from the database";
    }

    public Bonus getBonusDetails(String name) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        DocumentReference documentReference = db.collection(BONUS_COLLECTION).document(name);

        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        Bonus bonus = null;
        if(document.exists()){
            bonus = document.toObject(Bonus.class);
            return bonus;
        } else {
            return null;
        }
   }

   public List<Bonus> getAllBonusDetails() throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

       Iterable<DocumentReference> documentReference = db.collection(BONUS_COLLECTION).listDocuments();

       Iterator<DocumentReference> iterator = documentReference.iterator();

       List<Bonus> bonusList = new ArrayList<>();

       Bonus bonus = null;

       while(iterator.hasNext()){
           DocumentReference documentReferenceIterator = iterator.next();

           ApiFuture<DocumentSnapshot> future = documentReferenceIterator.get();

           DocumentSnapshot document = future.get();

           bonus = document.toObject((Bonus.class));
           bonusList.add(bonus);
       }
       return bonusList;
   }

}
