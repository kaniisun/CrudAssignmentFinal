/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CSC340.CrudAssignment.music;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sreyk
 */

public interface MusicRepository extends CrudRepository<Music, Integer>{
    public Long countById(Integer id);
}
