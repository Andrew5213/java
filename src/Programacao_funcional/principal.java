package Programacao_funcional;

import Programacao_funcional.Enditities.Product;
import Programacao_funcional.util.UpperCaseName;
import Services.ProductServices;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class principal {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //List<String> names =list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
       // names.forEach(System.out::println);
        ProductServices ps = new ProductServices();
        double sum = ps.filteredSum(list,p->p.getName().charAt(0)=='T');
        System.out.println("sum ="+ String.format("%.2f",sum));
    }
}
