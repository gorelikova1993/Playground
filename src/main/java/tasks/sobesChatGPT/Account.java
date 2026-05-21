package tasks.sobesChatGPT;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private BigDecimal balance;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public BigDecimal getBalance() {
        return balance;
    }
    
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
