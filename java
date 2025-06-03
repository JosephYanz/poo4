//Atributos da classe Aluno
//nome
public class aluno {
  private String nome;
  private int idade;
  private int matricula;

  // construtor da classe Aluno(opcional)
  public aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    } // fim do construtor
  // métodos da classe Aluno

  public String Estudar() {
    return "Estudando";
  }

  public String Dormir() {
    return "Dormindo";
  }

  public String Comer() {
    return "Comendo";
  }

  // fazer o mesmo com calculadora , lâmpada e carro.

  public class calculadora {
    private int numero1;
    private int numero2;
    private int resultado;

    public calculadora(int numero1, int numero2, int resultado) {
      this.numero1 = numero1;
      this.numero2 = numero2;
      this.resultado = resultado;
    }

   public int somar() {
    return numero1 + numero2;
   }

   public int subtrair() {
       return numero1 - numero2;
   }

   public int multiplicar() {
       return numero1 * numero2;
   }

}

  // lâmpada (3 atributos e 3 metodos)

  public class lampada {
    private boolean ligada;
    private String cor;
    private int potencia;

    public lampada(boolean ligada, String cor, int potencia){
        this.ligada = ligada;
        this.cor = cor;
        this.potencia = potencia;
    }
    public void ligar(){
        ligada = true;
        System.out.println("Lâmpada ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Lâmpada desligada");
    }
    public void mudarCor(String novaCor){
        cor = novaCor;
        System.out.println("Cor da lâmpada mudada para " + novaCor);
    }

}

//carro (3 atributos e 3 metodos)  

public class carro {
    private String marca;
    private String modelo;
    private int ano;


    public carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void ligar(){
        System.out.println("Carro ligado"); 
    }
    public void desligar(){
        System.out.println("Carro desligado");
    }
    public void acelerar(){
        System.out.println("Carro acelerando");
    }

  }
}


//agora criar uma classe teste para instaciar cada objeto e cada metodo.

public class testeAluno {
    public static void main(String[] args){
        aluno aluno1 = new aluno("João", 20, 123456);
        System.out.println(aluno1.Estudar());
        System.out.println(aluno1.Dormir());
    }
    
}

public class testeCalculadora {
    public static void main(String[] args){
        calculadora calc1 = new calculadora(10, 5, 0);
        System.out.println(calc1.somar());
        System.out.println(calc1.subtrair());
        System.out.println(calc1.multiplicar());
    }
}

public class testeLampada {
    public static void main(String[] args){
        lampada lamp1 = new lampada(false, "branca", 60);
        lamp1.ligar();
        lamp1.mudarCor("amarela");
        lamp1.desligar();
    }
}

public class testeCarro {
    public static void main(String[] args) {
        carro carro1 = new carro("Ford", "Ka", 2020);
        carro1.ligar();
        carro1.acelerar();
    }
}
