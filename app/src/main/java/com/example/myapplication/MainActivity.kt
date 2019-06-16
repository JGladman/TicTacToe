package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var curTurn = 0
    var gameOver = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun tileClicked(view: View){
        val btn = findViewById<Button>(view.id)

        if (!gameOver) {
            if (curTurn % 2 == 0) {
                btn.text = "X"
            } else {
                btn.text = "O"
            }

            btn.isEnabled = false

            curTurn++

            checkEnd()
        }
    }

    fun checkEnd(){
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val txt = findViewById<TextView>(R.id.gameStatus)

        // Testing win conditions starting from first button
        if (btn1.text == "X") {
            if (btn1.text == btn2.text && btn2.text == btn3.text) {
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
            else if (btn1.text == btn4.text && btn4.text == btn7.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
            else if (btn1.text == btn5.text && btn5.text == btn9.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
        }
        else if (btn1.text == "O"){
            if (btn1.text == btn2.text && btn2.text == btn3.text) {
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
            else if (btn1.text == btn4.text && btn4.text == btn7.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
            else if (btn1.text == btn5.text && btn5.text == btn9.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
        }

        // Testing win condition for second row
        if (btn4.text == "X"){
            if (btn4.text == btn5.text && btn5.text == btn6.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
        }
        if (btn4.text == "O"){
            if (btn4.text == btn5.text && btn5.text == btn6.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
        }

        // Testing win condition for third row
        if (btn7.text == "X"){
            if (btn7.text == btn8.text && btn8.text == btn9.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
        }
        if (btn7.text == "O"){
            if (btn7.text == btn8.text && btn8.text == btn9.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
        }

        // Testing win condition for second column
        if (btn2.text == "X"){
            if (btn2.text == btn5.text && btn5.text == btn8.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
        }
        if (btn2.text == "O"){
            if (btn2.text == btn5.text && btn5.text == btn8.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
        }

        // Testing win conditions for 3rd tile
        if (btn3.text == "X"){
            if (btn3.text == btn6.text && btn6.text == btn9.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
            else if (btn3.text == btn5.text && btn5.text == btn7.text){
                txt.text = "Player 1 Wins!"
                gameOver = true
            }
        }
        if (btn3.text == "O"){
            if (btn3.text == btn6.text && btn6.text == btn9.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
            else if (btn3.text == btn5.text && btn5.text == btn7.text){
                txt.text = "Player 2 Wins!"
                gameOver = true
            }
        }

        if (curTurn == 9){
            txt.text = "The Game is Tied!"
        }
    }

    fun resetGame(view: View){
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val txt = findViewById<TextView>(R.id.gameStatus)

        btn1.text = ""
        btn1.isEnabled = true
        btn2.text = ""
        btn2.isEnabled = true
        btn3.text = ""
        btn3.isEnabled = true
        btn4.text = ""
        btn4.isEnabled = true
        btn5.text = ""
        btn5.isEnabled = true
        btn6.text = ""
        btn6.isEnabled = true
        btn7.text = ""
        btn7.isEnabled = true
        btn8.text = ""
        btn8.isEnabled = true
        btn9.text = ""
        btn9.isEnabled = true

        txt.text = "Game in Progress..."

        gameOver = false
        curTurn = 0
    }
}
