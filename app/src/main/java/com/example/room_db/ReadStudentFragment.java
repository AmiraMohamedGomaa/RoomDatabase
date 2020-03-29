package com.example.room_db;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ReadStudentFragment extends Fragment {
     private TextView disInfo;

    public ReadStudentFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate( R.layout.fragment_read_student, container, false );
        disInfo=v.findViewById( R.id.tx_disInfo );

        List<Student> students=MainActivity.db_student.studentDao().getStudents();

        String info=" ";
        for(Student student : students){

            int id=student.getId();
            String name=student.getName();
            String email=student.getEmail();
          info=info+"\n\n"+" Id :"+id+"\n"+" Name :"+name+"\n"+" Email:"+email;
        }
             return v;
    }

}
