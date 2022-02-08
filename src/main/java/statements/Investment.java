package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
        this.cost = 0.3;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public double getYield(int days) {
        return (days/365.0)*this.interestRate*this.fund/100.0;
    }

    public double close(int days) {
        double ret = (this.active) ? (this.fund + this.getYield(days))*(1.0-this.cost/100.0):0.0;
        this.active = false;
        return ret;
    }
}
