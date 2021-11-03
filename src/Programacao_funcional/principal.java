package Programacao_funcional;

import Programacao_funcional.Enditities.Product;
import Programacao_funcional.util.UpperCaseName;

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

        List<String> names =list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
