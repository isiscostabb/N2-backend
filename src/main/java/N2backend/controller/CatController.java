
//requesição | resposta

package N2backend.controller;

import N2backend.service.CatService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cat")
public class CatController {

    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/http")
    @ResponseBody
    public String getHttpCat(@RequestParam("status_code") int statusCode) {
        String url = catService.getCatImageUrl(statusCode);
        return "<html>" +
                "<body>" +
                "<h1>HTTP Status Cat " + statusCode + "</h1>" +
                "<img src='" + url + "' alt='HTTP Cat'/>" +
                "</body>" +
                "</html>";
    }
}