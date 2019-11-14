package com.oguzhan.gsonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        val address = Address("Turkiye","Istanbul")

        val family = ArrayList<FamilyMember>()
        family.add(FamilyMember("Kardes",18))
        family.add(FamilyMember("Anne",46))
        family.add(FamilyMember("Baba",46))

        var employee = Employee("Oguzhan",22,"oguzhanoksel@gmail.com",address,family)
        val json = gson.toJson(employee)

        employee = gson.fromJson<Employee>(json,Employee::class.java)


                /*var json = "{\n" +
                "  \"address\": {\n" +
                "    \"city\": \"Istanbul\",\n" +
                "    \"country\": \"Turkiye\"\n" +
                "  },\n" +
                "  \"age\": 22,\n" +
                "  \"family\": [\n" +
                "    {\n" +
                "      \"age\": 18,\n" +
                "      \"role\": \"Kardes\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 46,\n" +
                "      \"role\": \"Anne\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 46,\n" +
                "      \"role\": \"Baba\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"first_name\": \"Oguzhan\",\n" +
                "  \"mail\": \"oguzhanoksel@gmail.com\"\n" +
                "}"*/



    }
}
