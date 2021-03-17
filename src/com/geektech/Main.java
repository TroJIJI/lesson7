package com.geektech;

public class Main {

    public static void main(String[] args) {
        Magic magic= new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] superPower = {magic,medic,warrior};
        for (int i = 0; i < superPower.length; i++) {
            superPower[i].applySuperAbility("cуперспособность:");

        }
    }
}
