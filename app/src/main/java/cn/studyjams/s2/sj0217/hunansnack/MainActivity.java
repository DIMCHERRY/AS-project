package cn.studyjams.s2.sj0217.hunansnack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        Bundle bundle = new Bundle();
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, bundle);

        button1 = (Button) findViewById(R.id.spm);
        button2 = (Button) findViewById(R.id.jsnrf);
        button3 = (Button) findViewById(R.id.djyt);
        button4 = (Button) findViewById(R.id.qfdyf);
        button5 = (Button) findViewById(R.id.sl);
        button6 = (Button) findViewById(R.id.hszt);
        button7 = (Button) findViewById(R.id.sm);
        button8 = (Button) findViewById(R.id.tybb);
        button9 = (Button) findViewById(R.id.kwx);
        button10 = (Button) findViewById(R.id.cj);
        // 添加Button事件，当点击此按钮，进行页面的跳转

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main2Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main3Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main4Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main5Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main6Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main7Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main8Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main9Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main10Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建Intent对象
                Intent intent = new Intent();
                // 设置要跳转的页面
                intent.setClass(MainActivity.this, Main11Activity.class);

                // 开始Activity
                startActivity(intent);

            }
        });

    }
    public boolean onOptionItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
