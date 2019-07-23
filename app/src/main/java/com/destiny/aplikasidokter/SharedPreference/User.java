package com.destiny.aplikasidokter.SharedPreference;

public class User {
    private String username;
    private String person;
    private String nama;
    private String umur;
    private String gambar;
    public User(){

    }
    public User(String username,String person){
        this.username=username;
        this.person=person;
    }
    public User(String nama,String umur,String gambar){
        this.nama=nama;
        this.umur=umur;
        this.gambar=gambar;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}