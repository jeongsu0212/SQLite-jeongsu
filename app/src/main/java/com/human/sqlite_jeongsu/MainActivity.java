package com.human.sqlite_jeongsu;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //현재클래스에서 사용할 멤버변수 생성(아래)
    private DatabaseHelper mdatabaseHelper;
    private SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //신규 데이터베이스 생성 (아래)
        //=데이터베이스헬퍼클래스의 생성자 메서드 실행.
        mdatabaseHelper = new DatabaseHelper(this,"student.db", null, 1);
    }
}