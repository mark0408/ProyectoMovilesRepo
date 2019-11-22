package edu.cibertec.skolary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Usuario extends AppCompatActivity {

    private Button BUTTON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        BUTTON = (Button)findViewById(R.id.btnIngresarUser);
        BUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity_main_ingreso();
            }
        });


    }

    public void openActivity_main_ingreso()
    {
        Intent intent = new Intent(this,MainIngresoActivity.class);
        startActivity(intent);
    }
}
