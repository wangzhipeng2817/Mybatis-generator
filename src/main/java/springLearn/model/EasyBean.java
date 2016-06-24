package springLearn.model;

/**
 * Created by wzp on 16-6-23.
 */
public class EasyBean {
    private String scope = "singleton";
    private String fullName;
    private String name;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
