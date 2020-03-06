package kg.megacom.demo.controllers;

import kg.megacom.demo.mappers.ClassMapper;
import kg.megacom.demo.models.entities.Courses;
import kg.megacom.demo.models.entities.CoursesDto;
import kg.megacom.demo.models.entities.Students;
import kg.megacom.demo.models.entities.StudentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kg.megacom.demo.services.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "/getcourses")
    public ResponseEntity<?> getCourses() {
        List<Courses> coursesList = adminService.getListCourses();
        List<CoursesDto> coursesDtoList = ClassMapper.INSTANCE.coursesToCoursesDto(coursesList);
        return  new ResponseEntity<>(coursesDtoList, HttpStatus.OK);
    }
    @PostMapping(value = "savecourses")
    public ResponseEntity<?> saveCourses(CoursesDto coursesDto) {
        Courses courses = ClassMapper.INSTANCE.coursesDtoToCourses(coursesDto);
        courses = adminService.saveCourses(courses);
        coursesDto = ClassMapper.INSTANCE.coursesToCoursesDto(courses);
        return  new ResponseEntity<>(courses, HttpStatus.OK);
    }
    @GetMapping(value = "getstudent")
    public ResponseEntity<?> getStudent() {
        List<Students> studentsList = adminService.getListStudents();
        List<StudentsDto> studentsDtos = ClassMapper.INSTANCE.studentsToStudentsDto(studentsList);
        return  new ResponseEntity<>(studentsDtos, HttpStatus.OK);
    }




}
