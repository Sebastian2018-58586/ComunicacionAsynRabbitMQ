package co.edu.univalle.productoservice;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/enviar")
    public String enviarProductos(@RequestBody List<ProductoDTO> productos) {
        productoService.enviarListaProductos(productos);
        return "Productos enviados con éxito al pedido-service";
    }

}
