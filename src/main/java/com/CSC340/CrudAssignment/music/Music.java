/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CSC340.CrudAssignment.music;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author sreyk
 */
@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    private String user;
    private String pass;
    private String songName;
    private String artist;
    
    public Music() {
        
    }

    public String getUser() {
        return user; 
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPass() {
        return pass; 
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSongName() {
        return songName;
    }
    
    public void setSongName(String songName) {
        this.songName = songName;
    }
    
        public String getArtist() {
        return artist;
    }  
        
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    @Override
    public String toString() {
        return "User [name=" + user + ", pass=" + pass + "]";
    }
}
