public class Personagem {
    String nome;
    int energia;


    Personagem( String nome, int energia){
        this.nome = nome;
        this.energia = energia;
    }

    void alterarEnergia(int alteração)
    {
        this.energia = this.energia + alteração;
        

        if ( this.energia > 100)
        {
            this.energia = 100;
        }
        else if( this.energia <0 )
        {
            this.energia = 0;
            System.out.println(" Tendo sua energia esgotada,  " + this.nome +
                                " acorda de um sonho extremamente estranho");
        }
    }
    
}
