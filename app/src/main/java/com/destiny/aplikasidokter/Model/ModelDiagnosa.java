package com.destiny.aplikasidokter.Model;

import java.util.ArrayList;

public class ModelDiagnosa {
    public static String[][] data = new String[][]{
            {"G1",
                    "Nama Gejala 1",
                    "Pertanyaan Pertama"
            },
            {"G2",
                    "Nama Gejala G2",
                    "Pertanyaan Gejala Tidak"
            },
            {"G3",
                    "Nama Gejala G3",
                    "Pertanyaan Gejala Ya"
            },
            {"G4",
                    "Nama Gejala Ya",
                    "Pertanyaan Gejala Ya"
            },
            {"G5",
                    "Nama Gejala Ya",
                    "Pertanyaan Gejala Ya"
            }
    };
    public static ArrayList<DataModel> getListData(){
        DataModel dm = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            dm = new DataModel();
            dm.setMedis(aData[0]);
            dm.setGejala(aData[1]);
            dm.setPertanyaan(aData[2]);
            list.add(dm);
        }

        return list;
    }
}
