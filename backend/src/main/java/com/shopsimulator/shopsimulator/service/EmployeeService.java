package com.shopsimulator.shopsimulator.service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.shopsimulator.shopsimulator.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class EmployeeService {

    public static  final String EMPLOYEE_COLLECTION_NAME = "EMPLOYEE";
    public static final String BONUS_COLLECTION_NAME = "BONUS";

    public String saveEmployee(Employee employee) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = db.collection(EMPLOYEE_COLLECTION_NAME)
                .document(employee.getName()).set(employee);

        return "Success in adding " + employee.getName();
    }

    public String deleteEmployee(String name) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionApiFuture = db.collection(EMPLOYEE_COLLECTION_NAME).document(name).delete();
        return "Employee named " + name + " has been removed from the company";
    }

    public Employee getEmployeeDetails(String name) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        DocumentReference employeeReference = db.collection(EMPLOYEE_COLLECTION_NAME).document(name);

        ApiFuture <DocumentSnapshot> futurePromise = employeeReference.get();

        DocumentSnapshot empInfoFromDB = futurePromise.get();

        Employee currentEmployee = null;
        if(empInfoFromDB.exists()) {
            currentEmployee = empInfoFromDB.toObject(Employee.class);
            return currentEmployee;
        } else {
            return null;
        }
    }

    public List<Employee> getAllEmployeeDetails() throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        Iterable<DocumentReference> empListReference = db.collection(EMPLOYEE_COLLECTION_NAME).listDocuments();

        Iterator<DocumentReference> iterator = empListReference.iterator();

        List<Employee> employeeList = new ArrayList<>();

        Employee employee = null;

        while(iterator.hasNext()) {

            DocumentReference nextIterator = iterator.next();

            ApiFuture<DocumentSnapshot> future = nextIterator.get();

            DocumentSnapshot empInfo = future.get();

            employee = empInfo.toObject(Employee.class);

            employeeList.add(employee);
        }
        return employeeList;
    }


}
