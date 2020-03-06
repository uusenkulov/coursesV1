package kg.megacom.demo.services;

import kg.megacom.demo.models.entities.*;


import java.util.List;

public interface AdminService {

    Courses saveCourses (Courses courses);
    Students saveStudents(Students students);
    Teachers saveTeachers(Teachers teachers);
    Users saveUsers(Users users);
    Roles saveRoles(Roles roles);

    List<Courses> getListCourses();
    List<Teachers> getListTeacher();
    List<Students> getListStudents();
    List<Users> getListUsers();
    List<Roles> getListRoles();

}
