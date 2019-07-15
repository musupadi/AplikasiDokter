package com.destiny.aplikasidokter.Model;

import java.util.List;

public class ResponseModel {
    String response,kode;
    String username,password,nama,umur;
    String medis,gejala,pertanyaan;
    List<DataModel> result;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public List<DataModel> getResult() {
        return result;
    }

    public void setResult(List<DataModel> result) {
        this.result = result;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getMedis() {
        return medis;
    }

    public void setMedis(String medis) {
        this.medis = medis;
    }
}
