package gr.aueb.cf.schoolapp.service;

import gr.aueb.cf.schoolapp.dto.TeacherInsertDTO;
import gr.aueb.cf.schoolapp.dto.TeacherReadOnlyDTO;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Map;


public interface ITeacherService {

    TeacherReadOnlyDTO insertTeacher(TeacherInsertDTO insertdto) throws Exception;
    TeacherReadOnlyDTO updateTeacher(TeacherReadOnlyDTO updateddto) throws EntityNotFoundException;
    void deleteTeacher(Object id) throws EntityNotFoundException;
    TeacherReadOnlyDTO getTeacherById(Object id) throws EntityNotFoundException;
    List<TeacherReadOnlyDTO> getAllTeachers() ;
    List<TeacherReadOnlyDTO> getTeacherByCritiria(Map<String,Object> critiria) ;
}
