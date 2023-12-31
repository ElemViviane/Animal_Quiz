package br.com.animais;

public class Animal {
    //atributos da classe animal.
    private String nome;
    private String classe;
    private String familia;
    private Integer idade;
    private boolean estado;
    private Integer caloria;
    private Integer forca;

    //construtor inicial.
    public Animal(String nome, String classe, String familia, Integer idade, boolean estado,
                    Integer caloria, Integer forca){
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.caloria = caloria;
        this.forca = forca;
    }
    //construtor que já se inicia com esses valores.
    public Animal(String nome, String classe, String familia){
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.forca = 10;
        this.caloria = 10;
        this.idade = 0;
        this.estado = true;
    }
    //métodos get.
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getFamilia() {
        return familia;
    }

    public Integer getIdade() {
        return idade;
    }

    public boolean getEstado() {
        return estado;
    }

    public Integer getCaloria() {
        return caloria;
    }

    public Integer getForca() {
        return forca;
    }
    //método para quando o animal nascer.
    public String nasceu(){
        return "O animal se chama " + nome + " é da classe " + classe + " e da família " + familia + ". O animal " +
                "possuí força de " + forca + ", caloria de " + caloria + " e idade de " + idade;
    }
    //método para quando o animal comer.
    public String comer(){
        this.caloria += 10;
        this.forca -= 2;

        return "O animal comeu e agora sua força é de " + forca + " e suas calorias valem " + caloria;
    }
    //método para quando o animal correr.
    public String correr(){
        this.forca -= 5;
        this.caloria -= 5;

        return "O animal está correndo! Agora sua força é de " + forca + " e suas calorias valem " + caloria;
    }
    //método para quando o animal dormir.
    public String dormir(){
        this.forca += 10;
        this.caloria -= 2;

        return "O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias valem " + caloria;
    }
    //método para quando o animal morrer.
    public String morrer(){
        this.forca = 0;
        this.estado = false;

        return "O animal Morreu!";
    }
}
