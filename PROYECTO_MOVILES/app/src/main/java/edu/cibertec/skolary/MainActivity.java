package edu.cibertec.skolary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonIngresar,buttonRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIngresar = (Button)findViewById(R.id.btnAbrir);
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity_usuario();
            }
        });


       buttonRegistrarse = (Button) findViewById(R.id.btnRegistrar);
        buttonRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_new_usuario();
            }
        });
    }

    public void openActivity_usuario()
    {
        Intent intent = new Intent(this,Usuario.class);
        startActivity(intent);
    }
    public void openActivity_new_usuario()
    {
        Intent intent = new Intent(this,NewUsuario.class);
        startActivity(intent);
    }

    
}
