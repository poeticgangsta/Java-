package com.example.korselthymeleaf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LinjadheoraretSetRoutes {


    @GetMapping("/home")
    List Getmappingmethod() {
/*
        List<Linjatdheoraret.linjaDheOraret> infoELinjave = new ArrayList();
        infoELinjave.add(new Linjatdheoraret.linjaDheOraret("Korce, Tirane, Korce", "04:30, 06:45, 07:30, 08:30, 09:30, 10:30", "11:00,12:00,13:00,14:00,15:00, 16:00"));
        infoELinjave.add(new Linjatdheoraret.linjaDheOraret("Korce, Tirane, Korce", "04:30, 06:45, 07:30, 08:30, 09:30, 10:30", "11:00,12:00,13:00,14:00,15:00, 16:00"));
        infoELinjave.add(new Linjatdheoraret.linjaDheOraret("Korce, Tirane, Korce", "04:30, 06:45, 07:30, 08:30, 09:30, 10:30", "11:00,12:00,13:00,14:00,15:00, 16:00"));
        return infoELinjave;
     */

        List<List<>> listaElistaveTeRrugeve = new ArrayList<>(){
            List<Linjatdheoraret.linjaDheOraret> korceTirane = new ArrayList<>();
            korceTirane.add(new Linjatdheoraret.linjaDheOraret("Korce-Tirane-Korce", "Cdo Dite", "04:30, 06:45, 07:30, 08:30, 09:30, 10:30", "Cdo Dite", "11:00,12:00,13:00,14:00,15:00, 16:00"));

            List<Linjatdheoraret.linjaDheOraret> korceDurres = new ArrayList<>();
            korceDurres.add(new Linjatdheoraret.linjaDheOraret("Korce-Durres-Korce", "Cdo Dite", "09:30", "Cdo Dite", "14:00"));

            List<Linjatdheoraret.linjaDheOraret> korceLushnje = new ArrayList<>();
            korceLushnje.add(new Linjatdheoraret.linjaDheOraret("Korce-Lushnje-Korce", "Cdo dite", "08:00", "Cdo Dite", "15:40"));

            List<Linjatdheoraret.linjaDheOraret> korceVlore = new ArrayList<>();
            korceVlore.add(new Linjatdheoraret.linjaDheOraret("Korce-Vlore-Korce", "Cdo Dite", "09:00", "Cdo Dite", "07:15 (te nesermen)"));

            List<Linjatdheoraret.linjaDheOraret> korceBerat = new ArrayList<>();
            korceBerat.add(new Linjatdheoraret.linjaDheOraret("Korce-Berat-Korce", "Cdo Dite", "10:00", "Cdo Dite", "15:00"));

            List<Linjatdheoraret.linjaDheOraret> korceBilisht = new ArrayList<>();
            korceBilisht.add(new Linjatdheoraret.linjaDheOraret("Korce-Bilisht-Korce", "Cdo Dite", "07:30, 08:30, 09:30, 10:30", "Cdo Dite", "11:00, 12:00, 13:00, 14:00"));

            List<Linjatdheoraret.linjaDheOraret> korcePogradec = new ArrayList<>();
            korcePogradec.add(new Linjatdheoraret.linjaDheOraret("Korce-Pogradec-Korce", "Cdo Dite", "08:00, 09:00", "Cdo Dite", "11:30, 12:30"));

            List<Linjatdheoraret.linjaDheOraret> korceElbasan = new ArrayList<>();
            korceElbasan.add(new Linjatdheoraret.linjaDheOraret("Korce-Elbasan-Korce", "Cdo Dite", "07:00", "Cdo Dite", "11:00"));

            List<Linjatdheoraret.linjaDheOraret> korceSarande = new ArrayList<>();
            korceSarande.add(new Linjatdheoraret.linjaDheOraret("Korce-Sarande-Korce", "E hene & E Premte", "08:00", "E marte & E Shtune", "15:40"));

            List<Linjatdheoraret.linjaDheOraret> korceGjirokaster = new ArrayList<>();
            korceGjirokaster.add(new Linjatdheoraret.linjaDheOraret("Korce-Gjirokaster-Korce", "E Merkure & E Premte", "06:00", "E Enjte & E Shtune", "07:00"));

            return listaElistaveTeRrugeve;
        }

    }
}