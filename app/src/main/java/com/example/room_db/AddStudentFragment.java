package com.example.room_db;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentFragment extends Fragment  {
      private EditText StudentId,StudentName,StudentEmail;
      private Button btnadd;


    public AddStudentFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       // Inflate the layout for this fragment
        View v= inflater.inflate( R.layout.fragment_add_student, container, false );
           StudentId=v.findViewById( R.id.student_id );
           StudentName=v.findViewById( R.id.student_name );
           StudentEmail=v.findViewById( R.id.student_email );
           btnadd=v.findViewById( R.id.btn_add );


          btnadd.setOnClickListener( new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                   int studentid= Integer.parseInt( StudentId.getText().toString() );
                   String studentname=StudentName.getText().toString();
                   String studentemail=StudentEmail.getText().toString();


                   Student student=new Student();
                   student.setId( studentid );
                   student.setName( studentname );
                   student.setEmail(studentemail);

                   MainActivity.db_student.studentDao().addStudent( student);
                   Toast.makeText( getActivity(),"Student added succsefuly ",Toast.LENGTH_LONG ).show();

                  StudentId.setText( "" );
                   StudentName.setText( "" );
                   StudentEmail.setText( "" );

               }
           } );
        return v;
    }

}
