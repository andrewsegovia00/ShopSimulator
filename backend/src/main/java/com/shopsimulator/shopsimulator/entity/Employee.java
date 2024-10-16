package com.shopsimulator.shopsimulator.entity;
import com.google.cloud.firestore.DocumentReference;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String id;
    private String description;
    private List<String> bonusIds;
    private List<String> likedEmployeeIds;
    private List<String> dislikedEmployeeIds;

    public Employee (){}

    public Employee(String name, String empId, String empDescription) {
        this.name = name;
        this.id = empId;
        this.description = empDescription;
        this.bonusIds = new ArrayList<>();
        this.likedEmployeeIds = new ArrayList<>();
        this.dislikedEmployeeIds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getBonusIds() {
        return bonusIds;
    }

    public void setBonusIds(List<String> bonusIds) {
        this.bonusIds = bonusIds;
    }

    public List<String> getLikedEmployeeIds() {
        return likedEmployeeIds;
    }

    public void setLikedEmployeeIds(List<String> likedEmployeeIds) {
        this.likedEmployeeIds = likedEmployeeIds;
    }

    public List<String> getDislikedEmployeeIds() {
        return dislikedEmployeeIds;
    }

    public void setDislikedEmployeeIds(List<String> dislikedEmployeeIds) {
        this.dislikedEmployeeIds = dislikedEmployeeIds;
    }

}
