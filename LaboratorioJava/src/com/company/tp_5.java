package com.company;

public class tp_5 {
    public static void main(String[] args){
        //divido terminos de la operacion combinada
        float termino1Combinada;
        float termino2Combinada;
        float resultadoCombinada;
        //resuelvo cada termino en su varible
        termino1Combinada = ((6/5)-(2/3)*(7/2)+(2/30));
        termino2Combinada = ((1/3)/5);
        //divido terminos
        resultadoCombinada = termino1Combinada/termino2Combinada;
        //muestro por consola el resultado (da infinity por la division cero)
        System.out.println("El resultado de la operacion combinada propuesta por el trabajo practico es: "+resultadoCombinada);
    }
}
