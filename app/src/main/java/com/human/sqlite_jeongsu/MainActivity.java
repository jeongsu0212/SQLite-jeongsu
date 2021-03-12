package com.human.sqlite_jeongsu;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.human.sqlite_jeongsu.DatabaseTables.StudentTable;
public class MainActivity extends AppCompatActivity {
    //현재클래스에서 사용할 멤버변수 생성(아래)
    private DatabaseHelper mdatabaseHelper;
    private SQLiteDatabase mSqliteDatabase;//sql템플릿(insert,select..)이 여기 포함.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //신규 데이터베이스 생성 (아래)
        //=데이터베이스헬퍼클래스의 생성자 메서드 실행.
        mdatabaseHelper = new DatabaseHelper(this,"school.db", null, 1);
        //데이터베이스 파일 만들기(아래)
        mSqliteDatabase = mdatabaseHelper.getWritableDatabase();
        //테스트로 mSqliteDatabase 객체를 이용해서 더미데이터 인서트 테스트
        //자바의 HashMap형식과 비슷한 안드로이드 데이터형 ContentValues형
        ContentValues contentValues = new ContentValues();
        contentValues.put(StudentTable.GRADE,2);
        contentValues.put(StudentTable.NUMBER,20210002);
        contentValues.put(StudentTable.NAME,"정수");
        mSqliteDatabase.insert(StudentTable.TABLE_NAME,null,contentValues);

    }
}