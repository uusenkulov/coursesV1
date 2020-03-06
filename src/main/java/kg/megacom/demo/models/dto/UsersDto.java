package kg.megacom.demo.models.entities;

import lombok.Data;


@Data
public class UsersDto {

    private Long id;
    private String name;
    private String login;
    private String password;

    private Roles role;

}
