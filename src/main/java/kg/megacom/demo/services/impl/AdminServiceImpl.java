package kg.megacom.demo.services.impl;

import kg.megacom.demo.dao.*;
import kg.megacom.demo.models.entities.*;
import kg.megacom.demo.services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private CoursesRepo coursesRepo;

    @Autowired
    private TeachersRepo teachersRepo;

    @Autowired
    private StudentsRepo studentsRepo;

    @Autowired
    private RolesRepo rolesRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Courses saveCourses(Courses courses) {
        return coursesRepo.save(courses);
    }

    @Override
    public Students saveStudents(Students students) {
         return studentsRepo.save(students);

    }

    @Override
    public Teachers saveTeachers(Teachers teachers) {
        return teachersRepo.save(teachers);
    }

    @Override
    public Users saveUsers(Users users) {
        return userRepo.save(users);
    }

    @Override
    public Roles saveRoles(Roles roles) {
        return rolesRepo.save(roles);
    }

    @Override
    public List<Courses> getListCourses() {
        return coursesRepo.findAll();
    }

    @Override
    public List<Teachers> getListTeacher() {
        return teachersRepo.findAll();
    }

    @Override
    public List<Students> getListStudents() {
        return studentsRepo.findAll();
    }

    @Override
    public List<Users> getListUsers() {
        return userRepo.findAll();
    }

    @Override
    public List<Roles> getListRoles() {
        return rolesRepo.findAll();
    }
}
