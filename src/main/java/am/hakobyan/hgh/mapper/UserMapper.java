package am.hakobyan.hgh.mapper;

import am.hakobyan.hgh.dto.UserDto;
import am.hakobyan.hgh.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "user.userEmail", target = "email")
    @Mapping(source ="user.userName", target = "login")
    UserDto userToDto(User user);

    @Mapping(source = "userDto.email", target="userEmail")
    @Mapping(source = "userDto.login", target = "userName")
    User dtoToUser(UserDto userDto);
}
