package com.example.proyecto_biblioteca_virtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Nivel_03 extends AppCompatActivity {
    private TextView tv1;

    private TextView tv2;
    DatabaseReference mDatabaseReference = FirebaseDatabase.getInstance().getReference();

    DatabaseReference mRootChild = mDatabaseReference.child("Nivel_A");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_03);

        tv2 = (TextView) findViewById(R.id.tv2);

        tv1 = (TextView) findViewById(R.id.tv1);
        String nivel = getIntent().getStringExtra("nivel");
        String materia = getIntent().getStringExtra("Materia");
        tv1.setText(nivel+ "->" + materia);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mRootChild.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String Nivel_A = dataSnapshot.getValue().toString();
                tv2.setText(Nivel_A);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
