package com.destiny.aplikasidokter.Model;

public class ModelTHT {
    String photo, definisi,gejala,penyebab,pencegahan,pengobatan;

    public ModelTHT(){

    }

    public ModelTHT(String photo, String definisi, String gejala,String penyebab, String pencegahan,String pengobatan) {
        this.photo=photo;
        this.definisi=definisi;
        this.gejala=gejala;
        this.penyebab=penyebab;
        this.pencegahan=pencegahan;
        this.pengobatan=pengobatan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDefinisi() {
        return definisi;
    }

    public void setDefinisi(String definis) {
        this.definisi = definis;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public String getPenyebab() {
        return penyebab;
    }

    public void setPenyebab(String penyebab) {
        this.penyebab = penyebab;
    }

    public String getPencegahan() {
        return pencegahan;
    }

    public void setPencegahan(String pencegahan) {
        this.pencegahan = pencegahan;
    }

    public String getPengobatan() {
        return pengobatan;
    }

    public void setPengobatan(String pengobatan) {
        this.pengobatan = pengobatan;
    }
}

