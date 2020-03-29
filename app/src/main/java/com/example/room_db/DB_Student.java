package com.example.room_db;
  import androidx.room.Database;
  import androidx.room.RoomDatabase;

@Database( entities = {Student.class},version = 1,exportSchema = false)
public abstract class DB_Student extends RoomDatabase {

    public abstract StudentDao studentDao();

}
