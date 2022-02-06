package com.emin.entity;

public class Musteri {

    /**
     * POJO -> Plain Old Java Object
     * Tüm deişkenleri erişime kapatıp
     * methotlar ile erişime açıyoruz.
     *
     */

    private  long id;
    private  String ad;
    private  String soyad;

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }


    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}

