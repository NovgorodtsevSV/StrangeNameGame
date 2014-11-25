package com.StrangeNameGame;

import android.app.Activity;
import android.os.Bundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import org.json.JSONArray;

import java.security.acl.LastOwnerException;

public class MainACtivity extends Activity {


    ImageView image;

    /**
     * <p>Проверяет, допустимый ли ход.</p>
     * <p>Например, чтобы задать ход e2-e4, напишите isValidMove(5,2,5,4);
     * Чтобы записать рокировку, укажите, откуда и куда ходит король.
     * Например, для короткой рокировки чёрных запишите isValidMove(5,8,7,8);</p>
     *
     * @param fromCol Вертикаль, на которой находится фигура (1=a, 8=h)
     * @param fromRow Горизонталь, на которой находится фигура (1...8)
     * @param toCol   Вертикаль клетки, на которую выполняется ход (1=a, 8=h)
     * @param toRow   Горизонталь клетки, на которую выполняется ход (1...8)
     * @return true, если ход допустим, и false, если недопустим
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView3);
        image.setImageResource(R.drawable.putin);

        image = (ImageView) findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.putin);

        int pushMe = 2;
        int P = 2;
    }
}
