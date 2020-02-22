package bzz.blop.controller.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>(); // יצירת ליסט שמכיל מערך
        coursesRepository.findAll().forEach(courses::add);  // בעזרת פיינד אול ולולאת פור איץ בצורת למדה נחלץ הכל
        return courses;
    }

    public Course getCourse(String id){
       return coursesRepository.findById(id).get();
       }

    public void addCourse(Course course){
        coursesRepository.save(course);
    }

    public void updateCourse(Course course) {
        coursesRepository.save(course);
    }

    public void deleteCourse(String id) {
        coursesRepository.deleteById(id);
    }


    public void findByTopicId(String topicId) {
        coursesRepository.findByTopicId(topicId);
    }
}

