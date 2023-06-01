package com.example.hierarchy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    open class Vehicle(Brand:String, Color:String) {
        var brand: String = Brand
        var color: String = Color
        open fun drive(){
            println("Driving the vehicle!!")
        }
    }

    //derived class
    class Car(Brand: String, Color: String, noDoors: Int): Vehicle(Brand, Color) {
        var numberofDoors: Int = noDoors
        override fun drive() {
            println("Driving the car with $numberofDoors doors")
        }
    }

    //derived class
    class Motorcycle(Brand: String, Color: String, HasSidecar: Boolean): Vehicle(Brand, Color) {
        var hasSidecar: Boolean = HasSidecar
        override fun drive() {
            println("Has Sidecar: $hasSidecar")
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var car = Car("Honda", "Black", 4)
        println("----------------------------------------------------------------------------")
        car.drive()
//        Toast.makeText(this,,Toast.LENGTH_LONG).show()
        var motorcycle = Motorcycle("Honda", "Black", HasSidecar = true)
        println("----------------------------------------------------------------------------")
        motorcycle.drive()
    }



}