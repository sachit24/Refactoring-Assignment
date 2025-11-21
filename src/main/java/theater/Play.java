package theater;

/**
 * Represents a theatrical play with a name and genre type.
 * <p>
 * This class encapsulates the basic information about a play that might be
 * performed in a theater, including its title and the type of performance.
 * </p>
 *
 * @author [Your Name]
 * @version 1.0
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
