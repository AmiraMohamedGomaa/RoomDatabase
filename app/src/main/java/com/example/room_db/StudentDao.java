package com.example.room_db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public interface StudentDao {
    @Insert
    public void addStudent(Student student);

  @Query("select * from Student")
    public List<Student> getStudents();

  @Delete
  public void deleteStudent(Student student);

  @Update
  public void UpdateStudent(Student student);
}
