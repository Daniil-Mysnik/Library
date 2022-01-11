package com.dantes.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class EditTeacher extends EditUser {
    String cathedra;
    String degree;
    Integer experience;
}
