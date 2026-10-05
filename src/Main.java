import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // CABEÇALHO
        System.out.println("======================================");
        System.out.println("          QUIZ - POKÉMON");
        System.out.println("======================================");
        System.out.println("Aluno: Pedro Henrique Lima Guimarães");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Faculdade: Centro Universitario Alfredo Nasser");
        System.out.println("======================================");
        System.out.println();

        // Lista que armazenará as 15 questões
        List<Questao> questoes = new ArrayList<>();

        // QUESTÃO 1
        Questao questao1 = new Questao();
        questao1.pergunta = "1. Qual é o tipo do Pokémon Pikachu?";
        questao1.opcaoA = "A) Água";
        questao1.opcaoB = "B) Fogo";
        questao1.opcaoC = "C) Elétrico";
        questao1.opcaoD = "D) Planta";
        questao1.opcaoE = "E) Psíquico";
        questao1.correta = "C";
        questoes.add(questao1);

        // QUESTÃO 2
        Questao questao2 = new Questao();
        questao2.pergunta = "2. Qual é o tipo principal do Pokémon Charmander?";
        questao2.opcaoA = "A) Água";
        questao2.opcaoB = "B) Fogo";
        questao2.opcaoC = "C) Planta";
        questao2.opcaoD = "D) Elétrico";
        questao2.opcaoE = "E) Gelo";
        questao2.correta = "B";
        questoes.add(questao2);

        // QUESTÃO 3
        Questao questao3 = new Questao();
        questao3.pergunta = "3. Qual Pokémon é conhecido como um Pokémon Tartaruga?";
        questao3.opcaoA = "A) Bulbasaur";
        questao3.opcaoB = "B) Charmander";
        questao3.opcaoC = "C) Squirtle";
        questao3.opcaoD = "D) Pikachu";
        questao3.opcaoE = "E) Eevee";
        questao3.correta = "C";
        questoes.add(questao3);

        // QUESTÃO 4
        Questao questao4 = new Questao();
        questao4.pergunta = "4. Qual é a primeira evolução do Charmander?";
        questao4.opcaoA = "A) Charizard";
        questao4.opcaoB = "B) Charmeleon";
        questao4.opcaoC = "C) Blastoise";
        questao4.opcaoD = "D) Venusaur";
        questao4.opcaoE = "E) Dragonite";
        questao4.correta = "B";
        questoes.add(questao4);

        // QUESTÃO 5
        Questao questao5 = new Questao();
        questao5.pergunta = "5. Qual Pokémon possui várias possibilidades de evolução?";
        questao5.opcaoA = "A) Eevee";
        questao5.opcaoB = "B) Snorlax";
        questao5.opcaoC = "C) Pikachu";
        questao5.opcaoD = "D) Mew";
        questao5.opcaoE = "E) Gengar";
        questao5.correta = "A";
        questoes.add(questao5);

        // QUESTÃO 6
        Questao questao6 = new Questao();
        questao6.pergunta = "6. Qual Pokémon aparece na capa de Pokémon Red?";
        questao6.opcaoA = "A) Mewtwo";
        questao6.opcaoB = "B) Lugia";
        questao6.opcaoC = "C) Rayquaza";
        questao6.opcaoD = "D) Ho-Oh";
        questao6.opcaoE = "E) Dialga";
        questao6.correta = "A";
        questoes.add(questao6);

        // QUESTÃO 7
        Questao questao7 = new Questao();
        questao7.pergunta = "7. Qual é o tipo do Pikachu?";
        questao7.opcaoA = "A) Fogo";
        questao7.opcaoB = "B) Água";
        questao7.opcaoC = "C) Elétrico";
        questao7.opcaoD = "D) Pedra";
        questao7.opcaoE = "E) Voador";
        questao7.correta = "C";
        questoes.add(questao7);

        // QUESTÃO 8
        Questao questao8 = new Questao();
        questao8.pergunta = "8. Qual Pokémon é conhecido por dormir durante grande parte do tempo?";
        questao8.opcaoA = "A) Snorlax";
        questao8.opcaoB = "B) Pikachu";
        questao8.opcaoC = "C) Squirtle";
        questao8.opcaoD = "D) Lucario";
        questao8.opcaoE = "E) Machop";
        questao8.correta = "A";
        questoes.add(questao8);

        // QUESTÃO 9
        Questao questao9 = new Questao();
        questao9.pergunta = "9. Qual é a evolução final do Bulbasaur?";
        questao9.opcaoA = "A) Ivysaur";
        questao9.opcaoB = "B) Venusaur";
        questao9.opcaoC = "C) Vileplume";
        questao9.opcaoD = "D) Victreebel";
        questao9.opcaoE = "E) Meganium";
        questao9.correta = "B";
        questoes.add(questao9);

        // QUESTÃO 10
        Questao questao10 = new Questao();
        questao10.pergunta = "10. Qual Pokémon foi criado artificialmente a partir do DNA de Mew?";
        questao10.opcaoA = "A) Mewtwo";
        questao10.opcaoB = "B) Celebi";
        questao10.opcaoC = "C) Jirachi";
        questao10.opcaoD = "D) Deoxys";
        questao10.opcaoE = "E) Arceus";
        questao10.correta = "A";
        questoes.add(questao10);

        // QUESTÃO 11
        Questao questao11 = new Questao();
        questao11.pergunta = "11. Qual objeto é utilizado para capturar Pokémon?";
        questao11.opcaoA = "A) Potion";
        questao11.opcaoB = "B) Poké Ball";
        questao11.opcaoC = "C) Pokédex";
        questao11.opcaoD = "D) Bike";
        questao11.opcaoE = "E) Escape Rope";
        questao11.correta = "B";
        questoes.add(questao11);

        // QUESTÃO 12
        Questao questao12 = new Questao();
        questao12.pergunta = "12. Qual dos Pokémon abaixo é do tipo Dragão?";
        questao12.opcaoA = "A) Dragonite";
        questao12.opcaoB = "B) Pikachu";
        questao12.opcaoC = "C) Snorlax";
        questao12.opcaoD = "D) Blastoise";
        questao12.opcaoE = "E) Gengar";
        questao12.correta = "A";
        questoes.add(questao12);

        // QUESTÃO 13
        Questao questao13 = new Questao();
        questao13.pergunta = "13. Quem é o Professor responsável por entregar Pokémon iniciais em Kanto?";
        questao13.opcaoA = "A) Professor Oak";
        questao13.opcaoB = "B) Brock";
        questao13.opcaoC = "C) Giovanni";
        questao13.opcaoD = "D) Misty";
        questao13.opcaoE = "E) Gary";
        questao13.correta = "A";
        questoes.add(questao13);

        // QUESTÃO 14
        Questao questao14 = new Questao();
        questao14.pergunta = "14. Qual é o tipo do Pokémon Squirtle?";
        questao14.opcaoA = "A) Fogo";
        questao14.opcaoB = "B) Planta";
        questao14.opcaoC = "C) Água";
        questao14.opcaoD = "D) Elétrico";
        questao14.opcaoE = "E) Psíquico";
        questao14.correta = "C";
        questoes.add(questao14);

        // QUESTÃO 15
        Questao questao15 = new Questao();
        questao15.pergunta = "15. Qual é o nome do protagonista principal do anime Pokémon?";
        questao15.opcaoA = "A) Brock";
        questao15.opcaoB = "B) Gary";
        questao15.opcaoC = "C) Ash";
        questao15.opcaoD = "D) James";
        questao15.opcaoE = "E) Giovanni";
        questao15.correta = "C";
        questoes.add(questao15);

        // EXECUÇÃO DO QUIZ
        int acertos = 0;

        for (Questao questao : questoes) {
            questao.escrevaQuestao();

            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        // RESULTADO FINAL
        double porcentagem = ((double) acertos / questoes.size()) * 100;

        System.out.println("======================================");
        System.out.println("           RESULTADO FINAL");
        System.out.println("======================================");
        System.out.println("Total de questões: " + questoes.size());
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);
        System.out.println();
        System.out.println("Obrigado por participar do Quiz!");
        System.out.println("======================================");
    }
}