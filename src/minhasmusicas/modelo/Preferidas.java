package minhasmusicas.modelo;

public class Preferidas {

    public void Inclui(Audio audio){
        if(audio.getClassificacao() > 9){
            System.out.println(audio.getTitulo()+ "é sucesso");
        }else{
            System.out.println(audio.getTitulo() + "é um dos mais escutados");
        }
    }
}
