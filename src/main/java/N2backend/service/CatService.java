
//lógica (retornar resultado com base no link da API)

package N2backend.service;

import org.springframework.stereotype.Service;

@Service
public class CatService {

    public String getCatImageUrl(int statusCode) {
        return "https://http.cat/" + statusCode;
    }
}
