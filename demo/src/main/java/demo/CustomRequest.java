package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters and setters
@AllArgsConstructor //Constructor parametrizado (con todos los atributos)
@NoArgsConstructor // Constructor sin parametros

public class CustomRequest {
    String data;

}
