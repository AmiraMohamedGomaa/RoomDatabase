package com.example.room_db;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class UpdateStudentFragment extends Fragment {
    private EditText StudentId,StudentName,StudentEmail;
    private Button btnupdate;

    public UpdateStudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate( R.layout.fragment_update_student, container, false );
        StudentId=v.findViewById( R.id.student_id );
        StudentName=v.findViewById( R.id.student_name );
        StudentEmail=v.findViewById( R.id.student_email );
        btnupdate=v.findViewById( R.id.btn_add );

        btnupdate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int studentid= Integer.parseInt( StudentId.getText().toString() );
                String studentname=StudentName.getText().toString();
                String studentemail=StudentEmail.getText().toString();

                Student student=new Student();
                student.setId( studentid );
                student.setName( studentname );
                student.setEmail(studentemail);

                MainActivity.db_student.studentDao().UpdateStudent( student);
                Toast.makeText( getActivity(),"Student Updated succsefuly ",Toast.LENGTH_LONG ).show();

                StudentId.setText( "" );
                StudentName.setText( "" );
                StudentEmail.setText( "" );
            }
        } );

       return v;
    }

}
