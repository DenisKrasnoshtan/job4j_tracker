package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Данный класс описывает работу простейшей банковской системы
 *
 * @author krasn
 * @version 1.0
 */
public class BankService {
    /**
     * Данная карта содержит список пользователей, ключом является
     * объект класса User, второй параметр - список счетов пользователя
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Данный метод добавляет пользователя в банковскую систему
     *
     * @param user - пользователь, который мы хотем добавить
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);

    }

    /**
     * Данный метод добавляет новый счет пользователю
     *
     * @param passport - пасспорт пользователя
     * @param account  - счет, который мы хотим добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }

        }
    }

    /**
     * Данный метод исчет пользователя по пасспорту
     *
     * @param passport - пасспорт пользователя,
     *                 которого мы ищем.
     * @return - возвращает пользователя, если он не найден, то null
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Данный метод исчет пользователя по реквизитам
     *
     * @param passport  - пасспорт пользователя
     * @param requisite - реквизиты пользователя
     * @return возвращает счет пользователя, либо null,
     * если пользователь не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account rsl = null;
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Данный метод реализует перевод денег от одного пользователя к другому
     *
     * @param srcPassport   - номер пасспорта отправителя
     * @param srcRequisite  - реквизиты счета отправителя
     * @param destPassport  - номер паспорта получателя
     * @param destRequisite - реквизиты получателя
     * @param amount        - количество переводимых денег
     * @return возвращает true, если перевод успешен, false, если неуспешен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srsAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        boolean rsl = srsAccount != null && destAccount != null
                && srsAccount.getBalance() >= amount;
        if (rsl) {
            srsAccount.setBalance(srsAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}