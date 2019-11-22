package edu.cibertec.skolary.skolapi;

import edu.cibertec.skolary.responseDTO.ItemProductoResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SkolapiService {

    @GET("pokemon")
    Call<ItemProductoResponse> obtenerListadoProducto();
}
