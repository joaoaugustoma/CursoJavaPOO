public class ControleDeBonificacao {
    private double totalBonus;

    public double getTotalBonus() {
        return totalBonus;
    }

    public double calculaTotalBonus(Funcionario f){
        return this.totalBonus = this.totalBonus + f.bonifica();
    }
}
