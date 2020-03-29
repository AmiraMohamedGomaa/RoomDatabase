package com.example.room_db;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DeleteStudentFragment extends Fragment {
    private EditText delId;
    private Button delStudent;

    public DeleteStudentFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate( R.layout.fragment_delete_student, container, false );
        delId=v.findViewById( R.id.del_id );
        delStudent=v.findViewById( R.id.btn_delete_stud );

      delStudent.setOnClickListener( new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int id=Integer.parseInt( delId.getText().toString() );
              Student student =new Student();
              student.setId( id );
              MainActivity.db_student.studentDao().deleteStudent( student );
              Toast.makeText( getActivity(),"Student Successfully Deleted....",Toast.LENGTH_LONG ).show();
              delId.setText( " " );
          }
      } );

        return v;
    }

}
