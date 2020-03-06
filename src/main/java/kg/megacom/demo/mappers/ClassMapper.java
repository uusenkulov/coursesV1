package kg.megacom.demo.mappers;

import kg.megacom.demo.models.entities.*;
import kg.megacom.demo.models.entities.CoursesDto;
import kg.megacom.demo.models.entities.RolesDto;
import kg.megacom.demo.models.entities.StudentsDto;
import kg.megacom.demo.models.entities.TeachersDto;
import kg.megacom.demo.models.entities.UsersDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    UsersDto userToUserDto (Users users);
    Users userDtoToUser (UsersDto usersDto);

    TeachersDto teachersToTeachersDto (Teachers teachers);
    Teachers teacherDtoToTeacher (TeachersDto teachersDto);

    RolesDto rolesToRolesDto(Roles roles);
    Roles rolesDtoToRoles(RolesDto rolesDto);

    List<StudentsDto>  studentsToStudentsDto(List<Students> students);
    List<Students> studentsDtoToStudents(List<StudentsDto> studentsDto);

    List<CoursesDto> coursesToCoursesDto(List<Courses> courses);
    List<Courses> coursesDtoToCourses(List<CoursesDto> coursesDto);

    CoursesDto coursesToCoursesDto(Courses courses);
    Courses coursesDtoToCourses(CoursesDto coursesDto);

}
