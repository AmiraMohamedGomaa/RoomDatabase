package com.example.room_db;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
private Button btnAdd,btnRead,btnDelete,btnUpdate;

    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate( R.layout.fragment_home, container, false );
        btnAdd=v.findViewById( R.id.btn_add );
        btnAdd.setOnClickListener( this );
        btnRead=v.findViewById( R.id.btn_view );
        btnRead.setOnClickListener( this );
        btnDelete=v.findViewById( R.id.btn_delete );
        btnDelete.setOnClickListener(this);
        btnUpdate=v.findViewById( R.id.btn_update );
        btnUpdate.setOnClickListener( this );
         return v;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_add:
            MainActivity.fragmentManager.beginTransaction().replace( R.id.fragmetContainer, new AddStudentFragment())
                    .addToBackStack( null ).commit();
                      break;

            case R.id.btn_view:
                MainActivity.fragmentManager.beginTransaction().replace( R.id.fragmetContainer, new ReadStudentFragment())
                        .addToBackStack( null ).commit();
                         break;

            case R.id.btn_delete:
                MainActivity.fragmentManager.beginTransaction().replace( R.id.fragmetContainer, new DeleteStudentFragment())
                        .addToBackStack( null ).commit();
                break;

            case R.id.btn_update:
                MainActivity.fragmentManager.beginTransaction().replace( R.id.fragmetContainer, new UpdateStudentFragment())
                        .addToBackStack( null ).commit();
                break;
        }
    }
}
