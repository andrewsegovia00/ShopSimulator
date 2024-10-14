package com.shopsimulator.shopsimulator.firebaseConnection;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.io.FileInputStream;

@Service
public class FirebaseInitialization {

    @PostConstruct
    public void initialization() {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("backend/src/main/resources/servicekey.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (serviceAccount != null) {
                    serviceAccount.close();  // Ensure the stream is closed
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
