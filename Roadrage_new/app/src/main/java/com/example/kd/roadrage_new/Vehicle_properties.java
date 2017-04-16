package com.example.kd.roadrage_new;

/**
 * Created by kd on 15-04-2017.
 */

public class Vehicle_properties {

    public int width;
    public int height;

    public Vehicle_properties(int vehicle_type)
    {
        switch (vehicle_type)
        {

            case 0: //car 1
                this.width = 150;
                this.height = 284;
                break;
            case 1: //car 2
                this.width = 150;
                this.height = 284;
                break;
            case 2: //car 2
                this.width = 150;
                this.height = 284;
                break;
            case 3: //car 2
                this.width = 150;
                this.height = 284;
                break;
            case 4: //car 2
                this.width = 150;
                this.height = 284;
                break;
            case 5: //car 2
                this.width = 150;
                this.height = 284;
                break;
            case 11: //truck1
                this.width = 200;
                this.height = 500;
                break;
            case 12: //truck2
                this.width = 200;
                this.height = 500;
                break;
            case 13: //police car
                this.width = 200;
                this.height = 390;
                break;
            default: //truck1
                this.width = 200;
                this.height = 500;
                break;

        }

    }

}
