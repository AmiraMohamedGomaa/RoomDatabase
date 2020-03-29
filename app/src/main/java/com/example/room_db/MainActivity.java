package com.example.room_db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   public static FragmentManager fragmentManager;
    public static DB_Student db_student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        fragmentManager=getSupportFragmentManager();
        //allowMainThreadQueries() -->this method allow
       db_student= Room.databaseBuilder(getApplicationContext(),DB_Student.class,"Studentdb").allowMainThreadQueries().build();

        if(findViewById( R.id.fragmetContainer )!=null){
            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add( R.id.fragmetContainer ,new HomeFragment()).commit();
        }
    }
}
