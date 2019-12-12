package com.example.proyecto_biblioteca_virtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class Ver_o_Descargar extends AppCompatActivity {

    Button down;
    Button upload;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    String zelda;



    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_o__descargar);

        final String link = getIntent().getStringExtra("url");
        zelda = link;

        down = findViewById(R.id.btleer);
        down.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                download();
            }
        });
    }

    public void Leerpdf(View view) {
        Intent leerpdf = new Intent(this, Leer_pdf.class);
        startActivity(leerpdf);

    }

    public void download(){

        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("Algebra/Historia_de_Internet.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {

                String url = uri.toString();
                downloadFiles(Ver_o_Descargar.this, "historia", ".pdf", DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    public void downloadFiles(Context context, String fileName, String fileExtension, String destinationDirectory, String url){

        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName+fileExtension);

        downloadManager.enqueue(request);

    }


}
