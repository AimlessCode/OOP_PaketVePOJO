package com.emin;

import com.emin.entity.Musteri;

public class Runner {
    public static void main(String[] args) {

    Musteri musteri =new Musteri();
    /**
     * nesne içerisindeki değerkleri serttler methotları ile deiştitisiniz.
     */

    musteri.setAd("Emin");
    musteri.setSoyad("Hoca");
    musteri.setId(2);

        /**
         * Nesne içinde var olan değerleri almak için getter methodları
         * kullanılır.
         */

        System.out.println("Muşteri id    : "+musteri.getId());
        System.out.println("Muşteri ad    : "+musteri.getAd());
        System.out.println("Muşteri soyad : "+musteri.getSoyad());

    }

}
