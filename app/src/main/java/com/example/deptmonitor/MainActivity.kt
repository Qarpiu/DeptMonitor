package com.example.deptmonitor

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import androidx.room.Room
import com.example.deptmonitor.dal.context.AppDatabase
import com.example.deptmonitor.dal.context.SeedData
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    companion object DatabaseSetup{
        lateinit var database : AppDatabase;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            database = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "dept_monitor.db").build();
            Seeder(findViewById(R.id.temp)).execute();
        }
        catch(e: Exception){
            print(e.localizedMessage);
        }
    }
     class Seeder(tv: TextView) : AsyncTask<Void, Void, Void>() {

         var tv : TextView

         init{
             this.tv = tv;
         }

         override fun doInBackground(vararg params: Void?): Void? {
             val seeder = SeedData(MainActivity.DatabaseSetup.database)
             seeder.invoke()
//             val deptor = database.deptorDao().findByName("Karol");
//             tv.setText("Imie " + deptor.name + ", kwota: " + deptor.dept_amount)
             return null;
         }


     }
}
