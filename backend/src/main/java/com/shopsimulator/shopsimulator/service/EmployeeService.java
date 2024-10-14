package com.shopsimulator.shopsimulator.service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.shopsimulator.shopsimulator.entity.Employee;
import java.util.concurrent.ExecutionException;

public class EmployeeService {

    public static  final String EMPLOYEE_COLLECTION_NAME = "EMPLOYEE";
    public static final String BONUS_COLLECTION_NAME = "BONUS";

    public String saveEmployee(Employee employee) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = db.collection(EMPLOYEE_COLLECTION_NAME)
                .document(employee.getName()).set(employee);

        return "Success in adding " + employee.getName();
    }


}
