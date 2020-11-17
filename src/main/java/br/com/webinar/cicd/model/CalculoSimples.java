package br.com.webinar.cicd.model;

public class CalculoSimples {

    double firstnum;
    double secondnum;
    String operation;

    public CalculoSimples() {
    };

    public CalculoSimples(double firstnum, double secondnum, String operation ){
        this.firstnum = firstnum;
        this.secondnum = secondnum;
        this.operation = operation;
    }

    public void setFirstnum(double firstnum){
        this.firstnum = firstnum;
    }

    public void setSecondenum(double secondnum){
        this.secondnum = secondnum;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public double getFirstnum(){
        return this.firstnum;
    }

    public double getSecondnum(){
        return this.secondnum;
    }

    public String getOperation(){
        return this.operation;
    }

}