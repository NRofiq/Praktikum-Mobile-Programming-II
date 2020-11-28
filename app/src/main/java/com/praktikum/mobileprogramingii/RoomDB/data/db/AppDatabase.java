package com.praktikum.mobileprogramingii.RoomDB.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.praktikum.mobileprogramingii.RoomDB.data.dao.MahasiswaDao;
import com.praktikum.mobileprogramingii.RoomDB.data.model.Mahasiswa;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao userDao();
}
