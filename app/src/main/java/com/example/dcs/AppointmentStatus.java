package com.example.dcs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AppointmentStatus extends AppCompatActivity {


    public ListView listViewBusestime;
    List<Bustime> busestime;
    DatabaseReference  databaseBustime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_status);

        databaseBustime = FirebaseDatabase.getInstance().getReference("AppointmentFixing");
        listViewBusestime = (ListView) findViewById(R.id.listViewappoints);

        busestime = new ArrayList<>();


        //checking whether they can book the ticket


        //adding an onclicklistener to button
  /*      buttonAddbustime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the method is defined below
                //this method is actually performing the write operation

                addBustime();

            }
            });

    }


    private void addBustime() {
        //getting the values to save
        String busstop1 = editTextbusstop1.getText().toString().trim();
        String busstoptime1 = editTextbusstoptime1.getText().toString().trim();
        String busstop2 = editTextbusstop2.getText().toString().trim();
        String busstoptime2 = editTextbusstoptime2.getText().toString().trim();
        String busstop3 = editTextbusstop3.getText().toString().trim();
        String busstoptime3 = editTextbusstoptime3.getText().toString().trim();


        //checking if the value is provided
        if (!TextUtils.isEmpty(busstop1)) {

            //getting a unique id using push().getKey() method
            //it will create a unique id and we will use it as the Primary Key for our name
            String id = databaseBustime.push().getKey();

            //creating an name Object
            Bustime bustime = new Bustime(id, busstop1,busstoptime1,busstop2,busstoptime2,busstop3,busstoptime3);

            //Saving the name
            databaseBustime.child(id).setValue(bustime);

            //setting edittext to blank again
            editTextbusstop1.setText("");
            editTextbusstoptime1.setText("");
            editTextbusstop2.setText("");
            editTextbusstoptime2.setText("");
            editTextbusstop3.setText("");
            editTextbusstoptime3.setText("");

            //displaying a success toast
            Toast.makeText(this, "BUS TIME ADDED", Toast.LENGTH_LONG).show();
        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_LONG).show();
        }*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        //attaching value event listener
        databaseBustime.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                //clearing the previous artist list
                busestime.clear();

                //iterating through all the nodes
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    //getting artist
                    Bustime busno = postSnapshot.getValue(Bustime.class);
                    //adding artist to the list
                    busestime.add(busno);
                }

                //creating adapter
                Bustimelist BustimeAdapter = new Bustimelist(AppointmentStatus.this, busestime);
                //attaching adapter to the listview
                listViewBusestime.setAdapter(BustimeAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}