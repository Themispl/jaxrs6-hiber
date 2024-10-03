package gr.aueb.cf.schoolapp.mapper;

import gr.aueb.cf.schoolapp.core.enums.RoleType;
import gr.aueb.cf.schoolapp.dto.*;
import gr.aueb.cf.schoolapp.model.Teacher;
import gr.aueb.cf.schoolapp.model.User;
import gr.aueb.cf.schoolapp.security.SecUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapper {
    private  Mapper(){}

    public static Teacher mapToTeacher(TeacherInsertDTO dto){
            return new Teacher(null, dto.getVat(), dto.getFirstName(), dto.getLastName());
    }
    public static Teacher mapToTeacher(TeacherUpdateDTO dto){
        return new Teacher(null, dto.getVat(), dto.getFirstname(), dto.getLastname());
    }

    public static TeacherReadOnlyDTO mapToTeacherReadOnlyDTO(Teacher teacher){
        return new TeacherReadOnlyDTO(teacher.getId(), teacher.getVat(), teacher.getFirstname(), teacher.getLastname());
    }

    public static List<TeacherReadOnlyDTO> mapToTeacherReadOnlyDTO(List<Teacher> teachers){
        return teachers.stream().map(Mapper::mapToTeacherReadOnlyDTO).collect(Collectors.toList());
    }

    public static Map<String, Object> mapToCritiria(TeacherFiltersDTO filtersDTO){
        Map<String, Object> filters = new HashMap<>();
        if(!(filtersDTO.getFirstName() == null) && !(filtersDTO.getFirstName().isEmpty())){
            filters.put("firstName", filtersDTO.getFirstName());
        }

        if(!(filtersDTO.getLastName() == null) && !(filtersDTO.getLastName().isEmpty())){
            filters.put("lastName", filtersDTO.getLastName());
        }

        if(!(filtersDTO.getVat() == null) && !(filtersDTO.getVat().isEmpty())){
            filters.put("vat", filtersDTO.getVat());
        }
        return filters;
    }

    public static User mapToUser(UserInsertDTO dto){
        return new User(null, dto.getUsername(), SecUtil.hasPassword(dto.getPassword()), RoleType.valueOf(dto.getRole()));
    }

    public static UserReadOnlyDTO mapToUserReadOnlyDTO(User user){
        return new UserReadOnlyDTO(user.getId(), user.getUsername(), user.getPassword(), user.getRoleType().name());
    }
}
