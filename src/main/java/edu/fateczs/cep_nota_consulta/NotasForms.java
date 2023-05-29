package edu.fateczs.cep_nota_consulta;

public class NotasForms {
    private float nota1;
    private float nota2;
    private float notaProj;

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNotaProj() {
        return notaProj;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public void setNotaProj(float notaProj) {
        this.notaProj = notaProj;
    }

    public float GerarMedia(){
        return (this.nota1 + this.nota2 + this.notaProj) / 3;
    }
    
}
