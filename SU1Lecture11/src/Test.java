public class Test {
    public static void main(String[] args) {
        AccountType savingsAccount = new AccountType("Savings Account", "Long term holdings", "Restricted");
        Account account = new Account(savingsAccount);
        System.out.println(account.toString());
        System.out.println("==================================");

        account.depositAmount(2000);
        System.out.println(account.toString());
        System.out.println("==================================");

        account.depositAmount(500);
        System.out.println(account.toString());
        System.out.println("==================================");
    }
}
