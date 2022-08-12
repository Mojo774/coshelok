package com.sirius.koshelek.converter;

import com.sirius.koshelek.db.entity.User;
import com.sirius.koshelek.model.request.UserRequest;
import com.sirius.koshelek.model.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper
public interface UserConverter {

    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);
}
