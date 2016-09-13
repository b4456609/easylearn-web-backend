package soselab.easylearn.dto;

/**
 * Created by bernie on 2016/9/13.
 */
public class UserDTO {
    private String name;
    private String id;

    public UserDTO(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public UserDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
