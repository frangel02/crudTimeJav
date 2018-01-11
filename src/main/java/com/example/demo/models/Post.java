package com.example.demo.models;

import javax.persistence.*;

/**
 * Post Class
 * Created by frodriguez on 10/24/2017.
 */
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;

    public Post(){


    }
    public Post(String message){

        this.message = message;


    }

    public void setId(long id){

        this.id = id;
    }

    public long getId() {
        return id;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
