package rodrigo.com.almacenapp.Services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rodrigo.com.almacenapp.Models.Producto;

/**
 * Created by Alumno on 4/05/2018.
 */

public interface ApiService {

    String API_BASE_URL = "https://productos-api2-rodrigoxxman.c9users.io/";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();

}

