package bzz.blop.controller.Course;

import bzz.blop.controller.Topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired // אנוטיישן שיודע שצריך ליצא מקלאס אחר
    private CoursesService coursesService; // נגדיר משתנה כדי למשוך פונקציות של הסרוויס

    @RequestMapping(value = "/topic/{id}/courses",method = RequestMethod.GET)// שם של הדף שנקרא לו, בנוסף נגדיר את הפעולה הרצויה
    public List<Course> getAllCourses(String topicId){
        coursesService.findByTopicId(topicId);
        return coursesService.getAllCourses();
    }

    // אם שם הארגומנט שונה מהסטרינג שנרצה לקבל נכניס אנוטיישן בצמוד
    // @PathVariable {same-name} String id
    @RequestMapping(value = "/topic/{topicId}/courses/{id}",method = RequestMethod.GET)
    public Course getCourse(@PathVariable String id){
        return coursesService.getCourse(id);
    }
    //הוספת ערך לתוך הדאטה
    //יקבל נתיב מאיזה קלאס ומשתנה, נשתמש במשתנה הגלובלי ונוסיף לפי פונקציה שהכנו מראש
    // @RequestBody נוסיף אנוטיישן ריקווסט באדי כדי שהמשתנה ידע איפה הוא נכנס ומספר המשתנים הנכונים שמכילים אותו
    @RequestMapping(value = "/topic/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        coursesService.addCourse(course);
    }

    @RequestMapping(value = "/topic/{topicId}/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        coursesService.updateCourse(course);
    }

    @RequestMapping(value = "/topic/{topicId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id){
        coursesService.deleteCourse(id);
    }
}
