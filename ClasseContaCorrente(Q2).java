public class ContaCorrente {
 private int numeroconta;
 private double saldo;
 
 public ContaCorrente(int nc, double s) {
     this.numeroconta = nc;
     this.saldo = s;
}
 public double getSaldo() {
     return saldo;
 }
 public void setSaldo(double saldo) {
     this.saldo = saldo;  
 }
 public void depositar(double valor) {
     if (valor > 0) {
         saldo += valor;
         System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
     } else {
         System.out.println("Valor de depósito inválido.");
     }
 }
 public void sacar(double valor) {
     if (valor > 0 && valor <= saldo) {
         saldo -= valor;
         System.out.println("Saque de R$" + valor + " realizado com sucesso.");
     } else {
         System.out.println("Valor de saque inválido ou saldo insuficiente.");
     }
 }
 public String toString() {
     return "Conta: " + numeroconta + "\n" +
             "Saldo: R$ " + saldo;
 }
	}
