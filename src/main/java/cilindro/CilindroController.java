package cilindro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CilindroController {

    @RequestMapping("/cilindro")
    public Cilindro cilindro(@RequestParam(value="altura") double altura, @RequestParam(value="radio") double radio) {
        return new Cilindro(altura, radio);
    }


}
