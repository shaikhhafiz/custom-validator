package com.hafiz.customvalidator.model;

import com.hafiz.customvalidator.validator.CreateValidateGroup;
import com.hafiz.customvalidator.validator.UpdateValidateGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class User {
  private String firstName;
  private String lastName;
  private String nickName;
  @NotBlank(groups = {CreateValidateGroup.class})
  private String email;
  @NotBlank(groups = {UpdateValidateGroup.class})
  private String phone;
}
