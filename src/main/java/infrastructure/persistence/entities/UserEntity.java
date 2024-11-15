package infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class UserEntity {

    //int oder Long???
    //private oder protected???
    @Column(nullable = false) // is necessary???
    @Id
    private int userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany
    private List<AutomationRuleEntity> automationRules;

    public UserEntity() {

    }

    public UserEntity(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.automationRules = new ArrayList<>();
    }

    public void addAutomationRule(AutomationRuleEntity automationRule){
        automationRules.add(automationRule);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AutomationRuleEntity> getAutomationRules() {
        return automationRules;
    }

    public void setAutomationRules(List<AutomationRuleEntity> automationRules) {
        this.automationRules = automationRules;
    }
}
