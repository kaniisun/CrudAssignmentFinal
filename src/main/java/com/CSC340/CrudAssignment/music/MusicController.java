/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CSC340.CrudAssignment.music;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author sreyk
 */
@Controller
public class MusicController {

    @Autowired
    private MusicService service;

    @GetMapping("/")
    public String music() {
        return "music";
    }

    @PostMapping("/user")
    public String userRegister(@ModelAttribute Music music, Model model) {
        System.out.println(music.toString());

        model.addAttribute("name", music.getUser());

        return "musicPage";
    }

    @GetMapping("/user/music-page")
    public String page(Model model) {
        List<Music> listSongs = service.listAll();
        model.addAttribute("listSongs", listSongs);
        return "manageSongs";
    }

    @GetMapping("/user/add-song")
    public String add(Model model) {
        model.addAttribute("pageTitle", "Add Song");
        return "addSong";
    }

    @PostMapping("/user/add")
    public String saveAdd(Music music) {
        service.save(music);
        return "redirect:/user/music-page";
    }

    @GetMapping("/user/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        Music music = service.get(id);
        model.addAttribute("music", music);
        return "updateSong";
    }

    @PostMapping("/user/update")
    public String upateProduct(Music music) {
        service.save(music);
        return "redirect:/user/music-page";
    }

    @GetMapping("/user/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return "redirect:/user/music-page";
    }

}
