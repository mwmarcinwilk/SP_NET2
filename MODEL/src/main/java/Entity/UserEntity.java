package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin_User_Table")
public class UserEntity {

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

}
