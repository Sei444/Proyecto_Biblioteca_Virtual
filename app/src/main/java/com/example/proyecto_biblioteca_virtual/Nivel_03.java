package com.example.proyecto_biblioteca_virtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Snapshot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;


public class Nivel_03 extends AppCompatActivity {


    private TextView tb;
    int numB = 10;
    int i;
    String url;

    FirebaseFirestore mFirestore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_03);

        mFirestore = FirebaseFirestore.getInstance();

        final String nivel = getIntent().getStringExtra("nivel");
        final String materia = getIntent().getStringExtra("Materia");

        setContentView(R.layout.activity_nivel_03);
        LinearLayout Botones = (LinearLayout) findViewById(R.id.Botones);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT );

        tb = (TextView) findViewById(R.id.textoprueba);

        obtenerDatos(nivel, materia,Botones,lp);

    }

    private void obtenerDatos(String nivel, String materia, final LinearLayout botones, final LinearLayout.LayoutParams lp){



        mFirestore.collection(nivel).document(materia).get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {

                if (documentSnapshot.exists()){
                    for (i = 1; i < numB; i++) {

                        String res = String.valueOf(i);
                        String documentos = documentSnapshot.getString(res);
                        String Mat = documentSnapshot.getId();

                        crearBoton(documentos, botones, lp);


                    }
                }
            }
        });
    }

    public void crearBoton(String documentos, LinearLayout botones, LinearLayout.LayoutParams lp){
        Button button = new Button(Nivel_03.this);
        button.setLayoutParams(lp);
        button.setText(documentos);
        url = documentos;
        button.setOnClickListener(new ButtonsOnCLickListener());
        botones.addView(button);
    }

    class ButtonsOnCLickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent nivel_4 = new Intent(Nivel_03.this , Ver_o_Descargar.class);
            nivel_4.putExtra("Url", url);
            startActivity(nivel_4);
            Toast.makeText(getApplicationContext(),"Pulsado",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}
