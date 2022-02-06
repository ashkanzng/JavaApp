package am.hakobyan.hgh.mapper;

import am.hakobyan.hgh.dto.TaskDto;
import am.hakobyan.hgh.entity.Task;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);


    @Mapping(source = "task.id", target = "id")
    TaskDto taskDto(Task task);

    @InheritInverseConfiguration
    Task dtoToTask(TaskDto taskDto);
}
