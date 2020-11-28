package com.praktikum.mobileprogramingii.RoomDB.data.db;

import android.app.Application;

import androidx.room.Room;

public class MyApp extends Application {

    public static com.praktikum.mobileprogramingii.RoomDB.data.db.AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                com.praktikum.mobileprogramingii.RoomDB.data.db.AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();
    }

}
