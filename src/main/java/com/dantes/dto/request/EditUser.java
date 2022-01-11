package com.dantes.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class EditUser {
    String firstName;
    String lastName;
    String patronymic;
    String password;
    String phone;
    String email;
    String documentNumber;
}
