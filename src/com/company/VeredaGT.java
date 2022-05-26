package com.company;

public class VeredaGT implements Vehicle {
    private String matricula;
    private float maxEnergy;
    private float energy;
    private int movementCount = 0;
    private float energyDelta;

    public VeredaGT( String matricula, float maxEnergy, float energyDelta){

        this.maxEnergy=maxEnergy;
        this.matricula=matricula;
        this.energyDelta=energyDelta;

    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = maxEnergy;
    }

    @Override
    public void move() {
        if (energy <= 0){

            energy = energy - energyDelta;
            movementCount ++;

        }else{

            System.out.println("el coche no se puede mover");

        }


    }

    @Override
    public String status() {
        return "El vehiculo " + matricula + " tiene un nivel de carga de " + energy + "y se ha movido " + movementCount + "veces.";
    }
}
