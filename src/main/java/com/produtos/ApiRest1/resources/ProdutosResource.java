package com.produtos.ApiRest1.resources;

import com.produtos.ApiRest1.models.Produtos;
import com.produtos.ApiRest1.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutosResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value="Retorna uma lista de produtos")
    public List<Produtos> listaProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    @ApiOperation(value="Retorna um produto único")
    public Produtos listaProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produtos")
    @ApiOperation(value="Salva um produto na lista")
    public Produtos salvaProduto(@RequestBody Produtos produtos){
        return produtoRepository.save(produtos);
    }

    @DeleteMapping("/produtos")
    @ApiOperation(value="Deleta um produto da lista")
    public void deletaProduto(@RequestBody Produtos produtos){
        produtoRepository.delete(produtos);
    }

    @PutMapping("/produtos")
    @ApiOperation(value="Atualiza as informações de um produto")
    public Produtos atualizaProduto(@RequestBody Produtos produtos){
       return produtoRepository.save(produtos);
    }
}
