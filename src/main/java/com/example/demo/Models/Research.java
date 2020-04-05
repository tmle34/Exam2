package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "research")
public class Research{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "Name")
    public String name;
    @Column(name = "Description")
    public String description;
    @Column(name = "Symptoms")
    public String symptoms;
    @Column(name = "Mortalityrate")
    public String mortalityrate;
    @Column(name = "Duration")
    public String duration;
    @Column(name = "Image")
    public String image;
    public int getId(){
        return id;
    }
    public Research(){

    }
    public Research(String name, String description,String symptoms,String mortalityrate, String duration, String image){
        this.name = name;
        this.description = description ;
        this.symptoms = symptoms;
        this.mortalityrate = mortalityrate;
        this.duration = duration;
        this.image = image;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate= mortalityrate;
    }

    public String getImage(){ return image;}
    public void setImage(String image){this.image = image;}



}
