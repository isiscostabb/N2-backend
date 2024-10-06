
//requesição | resposta

package N2backend.controller;

import N2backend.service.CatService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class CatController {

    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cat")
    public String getCatMessage() {
        return "Vamos verificar o status http com gatos!";
    }

    @PostMapping("/http")
    @ResponseBody
    public Map<String, Object> getHttpCat(@RequestBody Map<String, Integer> requestBody) {
        int statusCode = requestBody.get("status_code");
        String url = catService.getCatImageUrl(statusCode);

        Map<String, Object> response = new HashMap<>();
        response.put("status_code", statusCode);
        response.put("message", "HTTP Status Cat " + statusCode);
        response.put("cat_image_url", url);

        return response;
    }

    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("projeto", "N2 backend");
        sobre.put("estudante", "Isis Costa Bez Birolo");
        return sobre;
    }
}
