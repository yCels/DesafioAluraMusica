package minhasmusicas.principal;

import minhasmusicas.modelo.Musica;
import minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Like a Stone");
        minhaMusica.setCantor("AudiSlave");


        for(int i = 0; i <=1000;i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i <= 100 ; i ++ ){
            minhaMusica.curtir();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Meu Podcast");
        meuPodcast.setApresentador("Celso");


        for(int i = 0; i <=5000;i++){
            meuPodcast.reproduz();
        }

        for(int i = 0; i <=1000;i++){
            meuPodcast.curtir();
        }





    }


}
