package com.example.makananindonesia;

import java.util.ArrayList;

public class MakananData {
    private static String [] makananName = {
            "Rendang",
            "Sate",
            "Nasi Goreng",
            "Bakso",
            "Soto",
            "Rawon",
            "Gado Gado",
            "Nasi Padang",
            "Sambal",
            "Pempek"
    };

    private static String [] makananDetail = {
            "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau",
            "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu.",
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.",
            "Soto adalah sup tradisional Indonesia yang terutama terdiri dari kaldu, daging, dan sayuran.",
            "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek.",
            "Gado-gado adalah makanan khas Jakarta berisi sayur-sayuran yang direbus, irisan telur dan tahu, serta ditaburi bawang goreng dan kerupuk.",
            "Nasi padang adalah nasi putih yang disajikan dengan berbagai macam lauk-pauk khas Indonesia.",
            "Sambal adalah istilah besar yang dalam kuliner Indonesia merujuk pada saus maupun kondimen pedas.",
            "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.",
    };

    private static int[] makananImage = {
            R.drawable.rendang,
            R.drawable.sate,
            R.drawable.nasgor,
            R.drawable.bakso,
            R.drawable.soto,
            R.drawable.rawon,
            R.drawable.gado,
            R.drawable.padang,
            R.drawable.sambal,
            R.drawable.pempek
    };

    static ArrayList<Makanan> getListData(){
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position <makananName.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setName(makananName[position]);
            makanan.setDetail(makananDetail[position]);
            makanan.setPhoto(makananImage[position]);
            list.add(makanan);
        }
        return list;
    }

}
