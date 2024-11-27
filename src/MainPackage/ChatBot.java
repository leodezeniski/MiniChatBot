package MainPackage;

import java.util.Random;

public class ChatBot {

    // Atributos
    private String nome = "Meu nome é Mini ChatBot";
    private String[] captarSaudacao = { "ola", "Ola", "Olá", "olá", "oi", "eai", "Eai", "Oi" };
    private String[] saudacoes = { "Olá! O que vamos fazer hoje?", "Oi, como posso ajudar?",
            "Eai, como posso te ajudar hoje?" };
    private String[] estadoEmocional = { "Estou ótimo, como posso te ajudar?", "Estou bem, obrigado por perguntar!",
            "Tudo certo comigo!" };
    private String[] respostaPadrao = { "Não entendi o que você disse, poderia repetir?",
            "Parece que não captei sua mensagem...", "Pode repetir?", "Fale novamente, por favor..." };
    private String[] sentimento = { "está", "Está", "esta", "Esta", "tudo", "Tudo", "bem", "ta" };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getSaudacoes() {
        return saudacoes;
    }

    public void setSaudacoes(String[] saudações) {
        this.saudacoes = saudações;
    }

    public String getEstadoEmocional() {
        return respostaAleatorica(estadoEmocional);
    }

    public void setEstadoEmocional(String[] estadoEmocional) {
        this.estadoEmocional = estadoEmocional;
    }

    public String[] getRespostaPadrao() {
        return respostaPadrao;
    }

    public String getRespostaOficial() {
        return respostaAleatorica(respostaPadrao);
    }

    public void setRespostaOficial(String[] respostaPadrao) {
        this.respostaPadrao = respostaPadrao;
    }

    public String[] getSentimento() {
        return sentimento;
    }

    public void setSentimento(String[] sentimento) {
        this.sentimento = sentimento;
    }

    public String[] getCaptarSaudacao() {
        return captarSaudacao;
    }

    public void setCaptarSaudacao(String[] captarSaudacao) {
        this.captarSaudacao = captarSaudacao;
    }

    public void setRespostaPadrao(String[] respostaPadrao) {
        this.respostaPadrao = respostaPadrao;
    }

    // Métodos
    private String respostaAleatorica(String[] respostas) {
        Random random = new Random();
        int index = random.nextInt(respostas.length);
        return respostas[index];
    }

    public String saudacao(String mensagem) { // Respondera a sua saudação
        for (String saudacao : getCaptarSaudacao()) {
            if (mensagem.toLowerCase().contains(saudacao.toLowerCase())) {
                return respostaAleatorica(getSaudacoes());
            }
        }
        return null;
    }

    public String nome(String mensagem) { // Diz o nome dele
        if (mensagem.toLowerCase().contains("nome".toLowerCase())) {
            return "Meu nome é " + getNome();
        }
        return null;
    }

    public String comoEsta(String mensagem) { // Responde se está bem ou não
        for (String palavraChave : getSentimento()) {
            if (mensagem.toLowerCase().contains(palavraChave.toLowerCase())) {
                return getEstadoEmocional();
            }
        }
        return null;
    }

    public String naoEntendi() {
        return respostaAleatorica(getRespostaPadrao());
    }

    public String apresentacao() { // Se apresenta dizendo quem é
        return respostaAleatorica(saudacoes);
    }
}