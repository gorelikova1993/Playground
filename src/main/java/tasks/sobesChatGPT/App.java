package tasks.sobesChatGPT;

import java.math.BigDecimal;
//Требования:
//
//нельзя переводить отрицательную сумму
//нельзя переводить 0
//если денег недостаточно → exception
//после перевода деньги должны корректно измениться у обоих счетов
//использовать BigDecimal
//метод должен быть потокобезопасным

public class App {
    //антоация transactional
    public void transfer(Account from, Account to, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Отрацительная сумма");
        }
        //проверка на существование аккаунтов
        //if(from.getBalance < amount) ошибка
        //from.setBalance(from.getBalance - amount) //если у нас хибернейт или жпа можно не писать save
        //to.setBalance(to.getbalance + amount)
    }
}
