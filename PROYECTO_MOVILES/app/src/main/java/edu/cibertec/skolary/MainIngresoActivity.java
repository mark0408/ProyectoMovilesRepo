package edu.cibertec.skolary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainIngresoActivity extends AppCompatActivity {

    private Button Btnprevia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ingreso);


        Btnprevia = (Button)findViewById(R.id.btnCompraPrevia);
        Btnprevia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity_compras();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnBuscar: openActivity_new_usuario();break;
            case R.id.mnlistar: openActivity_pedido_detalle();break;

        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnlistar: openActivity_new_usuario();break;
            case R.id.mnBuscar: openActivity_usuario();break;

        }
        return super.onOptionsItemSelected(item);
    }*/
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
    public void openActivity_pedido_detalle()
    {
        Intent intent = new Intent(this,pedidoDetalle.class);
        startActivity(intent);
    }

    public void openActivity_compras()
    {
        Intent intent = new Intent(this,Compras.class);
        startActivity(intent);
    }

}
