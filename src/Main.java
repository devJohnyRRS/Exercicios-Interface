interface Autenticável {
    boolean autentica(String senha);
}

class Funcionario implements Autenticável {
    private String senha;

    public Funcionario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}

class Secretário extends Funcionario {
    public Secretário(String senha) {
        super(senha);
    }
}

class Diretor extends Funcionario {
    public Diretor(String senha) {
        super(senha);
    }
}

class Gerente extends Funcionario {
    public Gerente(String senha) {
        super(senha);
    }
}

class Engenheiro extends Funcionario {
    public Engenheiro(String senha) {
        super(senha);
    }
}

class Cliente implements Autenticável {
    private String senha;

    public Cliente(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}

class SistemaInterno {
    public boolean login(Autenticável obj) {
        return obj.autentica("1234");
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaInterno si = new SistemaInterno();
        Gerente gerente = new Gerente("1234");

        boolean autenticou = si.login(gerente);

        System.out.println("Autenticou: " + autenticou);
    }
}