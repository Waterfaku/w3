package com.example.w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate = load UI to memory
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Show the UI
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener{
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0

            if(age == 0) {//less than 17
                premium +=60
            }

            else if(age == 1){
                premium +=70

                if(gender == binding.radioButtonMale.id){
                    premium += 50
                }

                if(smoker){
                    premium += 100
                }
            }

            else if(age == 2){
                premium +=90

                if(gender == binding.radioButtonMale.id){
                    premium += 100
                }

                if(smoker){
                    premium += 150
                }
            }

            else if(age == 3){
                premium +=120

                if(gender == binding.radioButtonMale.id){
                    premium += 150
                }

                if(smoker){
                    premium += 200
                }
            }

            else if(age == 4){
                premium +=150

                if(gender == binding.radioButtonMale.id){
                    premium += 150
                }

                if(smoker){
                    premium += 200
                }
            }

            else if(age == 5){
                premium +=150

                if(gender == binding.radioButtonMale.id){
                    premium += 200
                }

                if(smoker){
                    premium += 300
                }
            }

            binding.textViewPremium.text = premium.toString()
        }

        binding.buttonReset.setOnClickListener{

        }
    }
}