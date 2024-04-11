/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CSC340.CrudAssignment.music;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sreyk
 */
@Service
public class MusicService {
    @Autowired private MusicRepository repo;
    
    public List<Music> listAll() {
        return (List<Music>) repo.findAll();
    }

    public void save(Music music) {
        repo.save(music);
    }
    
    public Music get(Integer id) {
        Optional<Music> result = repo.findById(id);
        return result.get();
    }
    
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
