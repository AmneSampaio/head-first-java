package com.amne.java.chapter1;

import java.util.Random;

public class PhraseOMatic {

    public static void main(String[] args) {
        /*String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot",
                "B-to-B", "win-win", "frontend", "web-based", "pervasive",
                "smart", "sixsigma", " critical-path", "dynamic"};*/
        String[] wordListOne = {"um sol", "uma lua", "uma estrela",
                "um cometa", "um astro", "uma supernova", "um foguete",
                "um buraco negro", "uma galaxia", "um universo", "um sistema solar", "um meteoro"};
        /*String[] wordListTwo = {"empowered", "sticky", "value-added",
                "oriented", "centric", "distributed", "clustered",
                "branded", "outside-the-box", "positioned", "networked",
                "focused", "leveraged", "aligned", "targeted", "shared",
                "cooperative", "accelerated"};*/
        String[] wordListTwo = {"azul", "verde", "vermelho",
                "roxo", "amarelo", "preto", "branco",
                "colorido", "rosa", "lilás", "pincelado com magia",
                "numa aquarela", "com uma paleta", "pintado numa tela", "secando num cavalete",
                "iluminando o céu", "esculpido numa resina", "com um laço de uma fita"};
        /*String[] wordListThree = {"process", "tippingpoint", "solution",
                "architecture", "core competency", "strategy", "mindshare",
                "portal", "space", "vision", "paradigm", "mission"};*/
        String[] wordListThree = {"lindo demais", "brilhante", "maravilhoso",
                "exuberante", "incrível", "fora de sério", "surreal", "que parece uma pintura",
                "extasiante", "sem igual", "imponente", "energizante"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random random = new Random();

        int rand1 = (int) (random.nextInt() * oneLength);
        int rand2 = (int) (random.nextInt() * twoLength);
        int rand3 = (int) (random.nextInt() * threeLength);

        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // System.out.println("What we need is a " + phrase);
        System.out.println("Hoje sonhei com " + phrase);
    }


}
