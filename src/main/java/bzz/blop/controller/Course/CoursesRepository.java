package bzz.blop.controller.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursesRepository extends CrudRepository <Course, String> {
    // נבנה פונקציה שלא קיימת באינטרפייס כדי למשוך את הנתונים מהקלאס שיורש
     List<Course> findByTopicId (String topicId);



    //CrudRepository ע"י הקלאס הזה אפשר לרשת את כל המתודות שנמצאות ב-
    //אלו מתודות של שאילתות שיקלו על המשיכה עדכון והוצאה של המידע מהטבלה
    //Course - שנוצרה ב
    //נשים לב שיש לשלוח שני משתנים אחד הטבלה שבנויה בקלאס נפרד והמפתח הראשי הסוג שלו
}
