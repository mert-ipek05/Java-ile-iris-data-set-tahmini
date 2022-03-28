package com.company;

import java.io.*;

import static java.lang.Double.parseDouble;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("iris.txt"); // dosyayı tanımlandı
        FileReader fileReader = new FileReader(file); // dosya okumak için değişken oluşurduk ve hangi dosyayı okuyacağımızı belirtdik
        String line;
        String[] dizi = new String[5];
        String[][] dizi2 = new String[150][5];
        BufferedReader br = new BufferedReader(fileReader); // okumak için tampon bellek ayırır
        int a = 0;
        while ((line = br.readLine()) != null) {
            dizi = line.split(",");

            for (int j = 0; j < 5; j++) {
                dizi2[a][j] = dizi[j];
            }
            a++;
        }
        br.close();

        /*Veri setinde ilk 50 tane bitkinin özellikleri setosa bitkisine ait bu yüzden il 50 verinin özelliklerinin ortalamasını
        alarak setosa bitkisinin ortalama özelliklerini bulacağım */

        //sepal-length ortalaması
        Double setosa_sl_toplam = 0.0;
        Double setosa_sl_ortalama;
        for (int i = 0; i < 50; i++) {
            setosa_sl_toplam += parseDouble(dizi2[i][0]);
        }
        setosa_sl_ortalama = setosa_sl_toplam / 50;
        System.out.println("Setosa sl:"+setosa_sl_ortalama);
        //sepal-width ortalaması
        Double setosa_sw_toplam = 0.0;
        Double setosa_sw_ortalama;
        for (int i = 0; i < 50; i++) {
            setosa_sw_toplam += parseDouble(dizi2[i][1]);
        }
        setosa_sw_ortalama = setosa_sw_toplam / 50;
        System.out.println("Setosa sw:"+setosa_sw_ortalama);
        //pental-length ortalaması
        Double setosa_pl_toplam = 0.0;
        Double setosa_pl_ortalama;
        for (int i = 0; i < 50; i++) {
            setosa_pl_toplam += parseDouble(dizi2[i][2]);
        }
        setosa_pl_ortalama = setosa_pl_toplam / 50;
        System.out.println("Setosa pl:"+setosa_pl_ortalama);
        //pental-width ortalaması
        Double setosa_pw_toplam = 0.0;
        Double setosa_pw_ortalama;
        for (int i = 0; i < 50; i++) {
            setosa_pw_toplam += parseDouble(dizi2[i][3]);
        }
        setosa_pw_ortalama = setosa_pw_toplam / 50;
        System.out.println("Setosa pw:"+setosa_pw_ortalama);
        //------------------------------------------------------------------------------------------------------------------------------
        /* veri setinde 51 ile 100 arasındaki çiçeklerin özellikleri versicolor*/

        //sepal-length ortalaması
        Double versicolor_sl_toplam = 0.0;
        Double versicolor_sl_ortalama;
        for (int i = 51; i < 100; i++) {
            versicolor_sl_toplam += parseDouble(dizi2[i][0]);
        }
        versicolor_sl_ortalama = versicolor_sl_toplam / 50;
        System.out.println("Versicolor sl:"+versicolor_sl_ortalama);
        //sepal-width ortalaması
        Double versicolor_sw_toplam = 0.0;
        Double versicolor_sw_ortalama;
        for (int i = 51; i < 100; i++) {
            versicolor_sw_toplam += parseDouble(dizi2[i][1]);
        }
        versicolor_sw_ortalama = versicolor_sw_toplam / 50;
        System.out.println("Versicolor sw:"+versicolor_sw_ortalama);
        //pental-length ortalaması
        Double versicolor_pl_toplam = 0.0;
        Double versicolor_pl_ortalama;
        for (int i = 51; i < 100; i++) {
            versicolor_pl_toplam += parseDouble(dizi2[i][2]);
        }
        versicolor_pl_ortalama = versicolor_pl_toplam / 50;
        System.out.println("Versicolor pl:"+versicolor_pl_ortalama);
        //pental-width ortalaması
        Double versicolor_pw_toplam = 0.0;
        Double versicolor_pw_ortalama;
        for (int i = 51; i < 100; i++) {
            versicolor_pw_toplam += parseDouble(dizi2[i][3]);
        }
        versicolor_pw_ortalama = versicolor_pw_toplam / 50;
        System.out.println("Versicolor pw:"+versicolor_pw_ortalama);
        //------------------------------------------------------------------------------------------------------------------------------
        /* veri setinde 101 ile 150 arasındaki çiçeklerin özellikleri virginica*/
        //sepal-length ortalaması
        Double virginica_sl_toplam = 0.0;
        Double virginica_sl_ortalama;
        for (int i = 100; i < 150; i++) {
            virginica_sl_toplam += parseDouble(dizi2[i][0]);
        }
        virginica_sl_ortalama = virginica_sl_toplam / 50;
        System.out.println("Virginica sl:"  + virginica_sl_ortalama);
        //sepal-width ortalaması
        Double virginica_sw_toplam = 0.0;
        Double virginica_sw_ortalama;
        for (int i = 100; i < 150; i++) {
            virginica_sw_toplam += parseDouble(dizi2[i][1]);
        }
        virginica_sw_ortalama = virginica_sw_toplam / 50;
        System.out.println("Virginica sw:"  + virginica_sw_ortalama);
        //pental-length ortalaması
        Double virginica_pl_toplam = 0.0;
        Double virginica_pl_ortalama;
        for (int i = 100; i < 150; i++) {
            virginica_pl_toplam += parseDouble(dizi2[i][2]);
        }
        virginica_pl_ortalama = virginica_pl_toplam / 50;
        System.out.println("Virginica pl:"  + virginica_pl_ortalama);
        //pental-width ortalaması
        Double virginica_pw_toplam = 0.0;
        Double virginica_pw_ortalama;
        for (int i = 100; i < 150; i++) {
            virginica_pw_toplam += parseDouble(dizi2[i][3]);
        }
        virginica_pw_ortalama = virginica_pw_toplam / 50;
        System.out.println("Virginica pw:"  + virginica_pw_ortalama);
        //-------------------------------------------karşılaştırmalar----------------------------------------------------------------------
        Double setosa_sl_yakınlıgı;
        Double setosa_sw_yakınlıgı;
        Double setosa_pl_yakınlıgı;
        Double setosa_pw_yakınlıgı;
        //------------------------
        Double versicolor_sl_yakınlıgı;
        Double versicolor_sw_yakınlıgı;
        Double versicolor_pl_yakınlıgı;
        Double versicolor_pw_yakınlıgı;
        //------------------------
        Double virginica_sl_yakınlıgı;
        Double virginica_sw_yakınlıgı;
        Double virginica_pl_yakınlıgı;
        Double virginica_pw_yakınlıgı;
        //-------------------------
        int setosa = 0;
        int versicolor = 0;
        int virginica = 0;

        Double setosa_sl = 0.0;
        Double versicolor_sl = 0.0;
        Double virginica_sl = 0.0;

        Double setosa_sw = 0.0;
        Double versicolor_sw = 0.0;
        Double virginica_sw = 0.0;

        Double setosa_pl = 0.0;
        Double versicolor_pl = 0.0;
        Double virginica_pl = 0.0;

        Double setosa_pw = 0.0;
        Double versicolor_pw = 0.0;
        Double virginica_pw = 0.0;

        Double setosa_yonelim = 0.0;
        Double versicolor_yonelim = 0.0;
        Double virginica_yonelim = 0.0;
        //-------------------------
        int dogru = 0;
        int yanlis = 0;
        for (int i = 0; i < 150; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    setosa_sl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - setosa_sl_ortalama);
                    versicolor_sl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - versicolor_sl_ortalama);
                    virginica_sl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - virginica_sl_ortalama);
                    if (setosa_sl_yakınlıgı < versicolor_sl_yakınlıgı && setosa_sl_yakınlıgı < virginica_sl_yakınlıgı) {
                        setosa += 1;
                        setosa_sl = setosa_sl_yakınlıgı;
                    }
                    if (versicolor_sl_yakınlıgı < setosa_sl_yakınlıgı && versicolor_sl_yakınlıgı < virginica_sl_yakınlıgı) {
                        versicolor += 1;
                        versicolor_sl = versicolor_sl_yakınlıgı;
                    }
                    if (virginica_sl_yakınlıgı < setosa_sl_yakınlıgı && virginica_sl_yakınlıgı < versicolor_sl_yakınlıgı) {
                        virginica += 1;
                        virginica_sl = virginica_sl_yakınlıgı;
                    }
                }
                if (j == 1) {
                    setosa_sw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - setosa_sw_ortalama);
                    versicolor_sw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - versicolor_sw_ortalama);
                    virginica_sw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - virginica_sw_ortalama);
                    if (setosa_sw_yakınlıgı < versicolor_sw_yakınlıgı && setosa_sw_yakınlıgı < virginica_sw_yakınlıgı) {
                        setosa += 1;
                        setosa_sw = setosa_sw_yakınlıgı;
                    }
                    if (versicolor_sw_yakınlıgı < setosa_sw_yakınlıgı && versicolor_sw_yakınlıgı < virginica_sw_yakınlıgı) {
                        versicolor += 1;
                        versicolor_sw = versicolor_sw_yakınlıgı;
                    }
                    if (virginica_sw_yakınlıgı < setosa_sw_yakınlıgı && virginica_sw_yakınlıgı < versicolor_sw_yakınlıgı) {
                        virginica += 1;
                        virginica_sw = virginica_sw_yakınlıgı;
                    }
                }
                if (j == 2) {
                    setosa_pl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - setosa_pl_ortalama);
                    versicolor_pl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - versicolor_pl_ortalama);
                    virginica_pl_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - virginica_pl_ortalama);
                    if (setosa_pl_yakınlıgı < versicolor_pl_yakınlıgı && setosa_pl_yakınlıgı < virginica_pl_yakınlıgı) {
                        setosa += 1;
                        setosa_pl = setosa_pl_yakınlıgı;
                    }
                    if (versicolor_pl_yakınlıgı < setosa_pl_yakınlıgı && versicolor_pl_yakınlıgı < virginica_pl_yakınlıgı) {
                        versicolor += 1;
                        versicolor_pl = versicolor_pl_yakınlıgı;
                    }
                    if (virginica_pl_yakınlıgı < setosa_pl_yakınlıgı && virginica_pl_yakınlıgı < versicolor_pl_yakınlıgı) {
                          virginica += 1;
                        virginica_pl = virginica_pl_yakınlıgı;
                    }
                }
                if (j == 3) {
                    setosa_pw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - setosa_pw_ortalama);
                    versicolor_pw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - versicolor_pw_ortalama);
                    virginica_pw_yakınlıgı = Math.abs(parseDouble(dizi2[i][j]) - virginica_pw_ortalama);
                    if (setosa_pw_yakınlıgı < versicolor_pw_yakınlıgı && setosa_pw_yakınlıgı < virginica_pw_yakınlıgı) {
                        setosa += 1;
                        setosa_pw = setosa_pw_yakınlıgı;
                    }
                    if (versicolor_pw_yakınlıgı < setosa_pw_yakınlıgı && versicolor_pw_yakınlıgı < virginica_pw_yakınlıgı) {
                        versicolor += 1;
                        setosa_pw = setosa_pw_yakınlıgı;
                    }
                    if (virginica_pw_yakınlıgı < setosa_pw_yakınlıgı && virginica_pw_yakınlıgı < versicolor_pw_yakınlıgı) {
                        virginica += 1;
                        virginica_pw = virginica_pw_yakınlıgı;
                    }
                }
                if (j == 4) {
                    if (setosa > versicolor && setosa > virginica) {
                        if ("Iris-setosa".equalsIgnoreCase(dizi2[i][j])) {
                            dogru += 1;
                        } else {
                            yanlis += 1;
                            System.out.println("Tahmin:Setosa Gerçek Veri:"+dizi2[i][j]);
                        }

                    }
                    if (versicolor > setosa && versicolor > virginica) {
                        if ("Iris-versicolor".equalsIgnoreCase(dizi2[i][j])) {
                            dogru += 1;
                        } else {
                            yanlis += 1;
                            System.out.println("Tahmin:Versicolor Gerçek Veri:"+dizi2[i][j]);
                        }
                    }
                    if (virginica > setosa && virginica > versicolor) {
                        if ("Iris-virginica".equalsIgnoreCase(dizi2[i][j])) {
                            dogru += 1;
                        } else {
                            yanlis += 1;
                            System.out.println("Tahmin:Virginica Gerçek Veri:"+dizi2[i][j]);
                        }
                    }
                    //aslında aşşağıdaki if e gerek yok setosa ve virginica nın değerleri biribirine yakın değil
                    //bu if e hiç girmedi belki veri sayısı çok olursa belki yararlı olur
                    if (setosa == 2 && virginica == 2) {
                        setosa_yonelim = setosa_sl + setosa_sw + setosa_pl + setosa_sw;
                        virginica_yonelim = virginica_sl + virginica_sw + virginica_pl + virginica_pw;
                        if (setosa_yonelim < virginica_yonelim) {
                            if ("Iris-setosa".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        } else {
                            if ("Iris-virginica".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        }
                    }
                    //aynı şekilde bu if e de hiç girmedi
                    if (setosa == 2 && versicolor == 2) {
                        setosa_yonelim = setosa_sl + setosa_sw + setosa_pl + setosa_sw;
                        versicolor_yonelim = versicolor_sl + versicolor_sw + versicolor_pl + versicolor_pw;
                        if (setosa_yonelim < versicolor_yonelim) {
                            if ("Iris-setosa".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        } else {
                            if ("Iris-versicolor".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        }
                    }
                    if (virginica == 2 && versicolor == 2) {
                        virginica_yonelim = Math.abs(parseDouble(dizi2[i][3])-virginica_pw_ortalama)+Math.abs(parseDouble(dizi2[i][2])-virginica_pl_ortalama);
                        versicolor_yonelim = Math.abs(parseDouble(dizi2[i][3])-versicolor_pw_ortalama)+Math.abs(parseDouble(dizi2[i][2])-versicolor_pl_ortalama);
                        if (versicolor_yonelim < virginica_yonelim) {
                            if ("Iris-versicolor".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        } else {
                            if ("Iris-virginica".equalsIgnoreCase(dizi2[i][j])) {
                                dogru += 1;
                            } else {
                                yanlis += 1;
                            }
                        }
                    }
                }
            }
            setosa = 0;
            versicolor = 0;
            virginica = 0;
        }
        Double basariOrani = Double.valueOf(dogru) / 150;
        System.out.println("Başarı Oranı: " + basariOrani);
        System.out.println("Yanlış tahmin sayısı:" + yanlis);
        System.out.println("Doğru tahmin sayısı: " + dogru);
    }
}
