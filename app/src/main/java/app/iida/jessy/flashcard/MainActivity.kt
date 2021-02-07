package app.iida.jessy.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //まず、それぞれの単語を作る
        val apple = Word(R.drawable.apple_icon, "りんご")
        val banana = Word(R.drawable.banana_icon, "バナナ")
        val orange = Word(R.drawable.orange_icon, "オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon, "いちご")

        //作ったメソッドを実行する
        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)

    }

    private fun addWord(word: Word) {
        val container = findViewById<LinearLayout>(R.id.container)

        //インスタンスを生成する
        val nameTextView = TextView(this)

        //TextViewクラスのtextプロパディに代入する
        nameTextView.text = word.name

        //containerにTextVierを追加する
        //container.addView(nameTextView)

        //LinearLayoutインスタンスを生成する
        val layout = LinearLayout(this)

        //LinearLayoutの方向をHORIZONTALに設定する
        layout.orientation = LinearLayout.HORIZONTAL

        //ImageViewのインスタンスを生成
        val imageView = ImageView(this)

        //appleが持っているリソースIDを使って、画像をImageViewに設定する
        imageView.setImageResource(word.resId)

        //小さな枠にImageViewとTextViewを入れる
        layout.addView(imageView)
        layout.addView(nameTextView)

        //全体の枠に小さな枠を入れる
        container.addView(layout)
    }

}
