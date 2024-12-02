public class AccountType {
    private String accountType;
    private String description;
    private String conditions;

    public AccountType (String accountType, String description, String conditions){
        this.accountType = accountType;
        this.description = description;
        this.conditions = conditions;
    }

    public String getAccountType() {
        return accountType;
    }
}
