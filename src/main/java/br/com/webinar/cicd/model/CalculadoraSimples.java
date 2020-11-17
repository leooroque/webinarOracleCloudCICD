package br.com.webinar.cicd.model;

public class CalculadoraSimples {

    

    public double calcular(CalculoSimples detalhes) throws ArithmeticException {
        double result = 0;
        switch(detalhes.getOperation()){
            case "+":  
                result =  detalhes.getFirstnum()+detalhes.getSecondnum();
            break;
            case "-":
                result = detalhes.getFirstnum()-detalhes.getSecondnum();
            break;
            case "*":
                result = detalhes.getFirstnum()*detalhes.getSecondnum();
            break;
            case "/":
            if(detalhes.getFirstnum() <= 0){
                throw new ArithmeticException("Divisão por zero");
            } else{
                result = detalhes.getFirstnum()/detalhes.getSecondnum();
            }
            break;
        }
        return result;
    }
}