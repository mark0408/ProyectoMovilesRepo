package edu.cibertec.skolary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aviso extends AppCompatActivity {


     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso);
        button = (Button)findViewById(R.id.btnQR);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity_new_abrir_qr();
            }
        });
    }

    public void openActivity_new_abrir_qr()
    {
        Intent intent = new Intent(this,qr.class);
        startActivity(intent);
    }

}
