package sg.edu.rp.c346.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var number1 = ""
    var number2 = ""
    var change = false
    var op = ""
    var total = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        var msg = ""
        val btnSelected = view as Button
        if (change == false) {
            when (btnSelected.id) {

                button11.id -> number1 = number1 + "1"
                button12.id -> number1 = number1 + "2"
                button13.id -> number1 = number1 + "3"

                button7.id -> number1 = number1 +"4"
                button8.id -> number1 = number1 + "5"
                button9.id -> number1 = number1 + "6"

                button3.id -> number1 = number1 + "7"
                button4.id -> number1 = number1 + "8"
                button5.id -> number1 = number1 + "9"

                button15.id -> number1 = number1 + "0"
                button16.id -> number1 = number1 + "."


            }

            textView.text = "$number1"

        } else {
            when (btnSelected.id) {
                button11.id -> number2 = number2 + "1"
                button12.id -> number2 = number2 + "2"
                button13.id -> number2 = number2 + "3"

                button7.id -> number2 = number2  +"4"
                button8.id -> number2 = number2  + "5"
                button9.id -> number2 = number2  + "6"

                button3.id -> number2 = number2  + "7"
                button4.id -> number2 = number2  + "8"
                button5.id -> number2 = number2  + "9"

                button15.id -> number2 = number2  + "0"
                button16.id -> number2 = number2  + "."

            }

            textView.text = "$number2"
        }


    }



    fun btnOpOnClick(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {

            button2.id -> op = "/"
            button6.id -> op = "*"
            button10.id -> op = "-"
            button14.id -> op = "+"
            button17.id -> op = "="
        }
        change = true
        textView.text = ""
    }

    fun btnAcOnClick(view: View){
        number1 = ""
        number2 = ""
        textView.text = ""
    }

    fun btnEqualOnClick(view: View){
        if (op == "+"){
            total = number1.toDouble() + number2.toDouble()
        } else if (op == "*"){
            total = number1.toDouble() * number2.toDouble()
        } else if (op == "/"){
            total = number1.toDouble() / number2.toDouble()
        } else if (op == "-"){
            total = number1.toDouble() - number2.toDouble()
        }

        textView.text = total.toString()
        number1 = ""
        number2 = ""

    }

}