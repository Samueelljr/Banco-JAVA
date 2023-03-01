import javax.sound.midi.Soundbank;
import javax.swing.SpinnerDateModel;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAdual(){
        System.out.print("Numero " + this.getNumConta());
        System.out.print("Tipo " + this.getTipo());
        System.out.print("Dono " + this.getDono());
        System.out.print("Saldo " + this.getSaldo());
        System.out.print("Status " + this.getStatus());
    }


    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.print("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois o saldo é positivo");
        } else {
            this.setStatus(false);
            System.out.print("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.print("Deposito realizado! " + this.dono);
        } else {
            System.out.print("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.print("Saque realizado com sucesso!");
            } else if (this.getSaldo() < v) {
                System.out.print("Saldo insuficiente.");
            } else {
                System.out.println("Impossivel sacar de uma conta fechada");
            }
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }


    // Métodos Especiais

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}























