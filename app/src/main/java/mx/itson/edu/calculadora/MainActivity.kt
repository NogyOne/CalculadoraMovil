package mx.itson.edu.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numTop: TextView = findViewById(R.id.numOne)
        val numDown: TextView = findViewById(R.id.numTwo)
        val result: Button = findViewById(R.id.btnResult)
        val clear: Button = findViewById(R.id.btnClear)
        val plus: Button = findViewById(R.id.btnPlus)
        val times: Button = findViewById(R.id.btnTimes)
        val less: Button = findViewById(R.id.btnLess)
        val div: Button = findViewById(R.id.btnDiv)
        var operation: Char = '+'

        val numOne: Button = findViewById(R.id.btnOne)
        val numTwo: Button = findViewById(R.id.btnTwo)
        val numThree: Button = findViewById(R.id.btnThree)
        val numFour: Button = findViewById(R.id.btnFour)
        val numFive: Button = findViewById(R.id.btnFive)
        val numSix: Button = findViewById(R.id.btnSix)
        val numSeven: Button = findViewById(R.id.btnSeven)
        val numEight: Button = findViewById(R.id.btnEight)
        val numNine: Button = findViewById(R.id.btnNine)
        val numZero: Button = findViewById(R.id.btnZero)

        var resultado: Int
        var num1: Int = 0
        var num2: Int = 0


        clear.setOnClickListener {
            numDown.setText("")
            numTop.setText("")
        }

        result.setOnClickListener() {
            if(numTop.text.isEmpty() && numDown.text.isEmpty()){
                numTop.setText("")
            }else{
                num2 = numDown.text.toString().toInt()
                when (operation) {
                    '+' -> (numTop.setText((num1 + num2).toString()))
                    '*' -> (numTop.setText((num1 * num2).toString()))
                    '-' -> (numTop.setText((num1 - num2).toString()))
                    '/' -> (numTop.setText((num1 / num2).toString()))
                }
                numDown.setText("")
            }
        }


        //EVENTOS DE LOS NÚMEROS
        numOne.setOnClickListener{
            numDown.setText("" + numDown.text + "1")
        }

        numTwo.setOnClickListener{
            numDown.setText("" + numDown.text + "2")
        }

        numThree.setOnClickListener{
            numDown.setText("" + numDown.text + "3")
        }

        numFour.setOnClickListener{
            numDown.setText("" + numDown.text + "4")
        }

        numFive.setOnClickListener{
            numDown.setText("" + numDown.text + "5")
        }

        numSix.setOnClickListener{
            numDown.setText("" + numDown.text + "6")
        }

        numSeven.setOnClickListener{
            numDown.setText("" + numDown.text + "7")
        }

        numEight.setOnClickListener{
            numDown.setText("" + numDown.text + "8")
        }

        numNine.setOnClickListener{
            numDown.setText("" + numDown.text + "9")
        }

        numZero.setOnClickListener{
            numDown.setText("" + numDown.text + "0")
        }


        //EVENTOS DE LAS OPERACIONES
        plus.setOnClickListener {
            operation = '+'
            if(numTop.text.isEmpty() && numDown.text.isEmpty()){
                numTop.setText("")
            }
            else if(numTop.text == ""){
                num1 = numDown.text.toString().toInt()
                numTop.setText("" + numDown.text + operation)
                numDown.setText("")
            }else{
                num1 = numTop.text.toString().toInt()
                numTop.setText("" + numTop.text + "+")
            }
        }

        times.setOnClickListener {
            operation = '*'
            if(numTop.text.isEmpty() && numDown.text.isEmpty()){
                numTop.setText("")
            }
            else if(numTop.text == ""){
                num1 = numDown.text.toString().toInt()
                numTop.setText("" + numDown.text + operation)
                numDown.setText("")
            }else{
                num1 = numTop.text.toString().toInt()
                numTop.setText("" + numTop.text + "*")
            }
        }

        less.setOnClickListener {
            operation = '-'
            if(numTop.text.isEmpty() && numDown.text.isEmpty()){
                numTop.setText("")
            }
            else if(numTop.text == ""){
                num1 = numDown.text.toString().toInt()
                numTop.setText("" + numDown.text + operation)
                numDown.setText("")
            }else{
                num1 = numTop.text.toString().toInt()
                numTop.setText("" + numTop.text + "-")
            }
        }

        div.setOnClickListener {
            operation = '/'
            if(numTop.text.isEmpty() && numDown.text.isEmpty()){
                numTop.setText("")
            }
            else if(numTop.text == ""){
                num1 = numDown.text.toString().toInt()
                numTop.setText("" + numDown.text + operation)
                numDown.setText("")
            }else{
                num1 = numTop.text.toString().toInt()
                numTop.setText("" + numTop.text + "/")
            }
        }
    }
}