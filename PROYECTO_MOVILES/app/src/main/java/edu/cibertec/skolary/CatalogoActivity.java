package edu.cibertec.skolary;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import edu.cibertec.skolary.responseDTO.ItemProductoResponse;
import edu.cibertec.skolary.responseDTO.Producto;
import edu.cibertec.skolary.skolapi.SkolapiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CatalogoActivity extends AppCompatActivity {
    private static final String TAG = "SkolAPI";

    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        retrofit = new Retrofit.Builder()
                       .baseUrl("https://pokeapi.co/api/v2/")
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();
        obtenerDatos();
    }

    private void obtenerDatos(){
        SkolapiService service = retrofit.create(SkolapiService.class);
        Call<ItemProductoResponse> itemProductoResponseCall=service.obtenerListadoProducto();

        itemProductoResponseCall.enqueue(new Callback<ItemProductoResponse>() {
            @Override
            public void onResponse(Call<ItemProductoResponse> call, Response<ItemProductoResponse> response) {
                if(response.isSuccessful()){
                    ItemProductoResponse itemProductoResponse=response.body();
                    ArrayList<Producto> listaProducto = itemProductoResponse.getResults();

                    for (int i=0;i<listaProducto.size();i++){
                        Producto p = listaProducto.get(i);
                        Log.i(TAG," Pokemon:  "+ p.getName());
                    }

                }else{
                    Log.e(TAG, " onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ItemProductoResponse> call, Throwable t) {
                Log.e(TAG, " onFailure: " +t.getMessage());
            }
        });
    }

}
