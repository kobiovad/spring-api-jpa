package bzz.blop.controller.Topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository <Topic, String> {
    //CrudRepository ע"י הקלאס הזה אפשר לרשת את כל המתודות שנמצאות ב-
    //אלו מתודות של שאילתות שיקלו על המשיכה עדכון והוצאה של המידע מהטבלה
    //Course - שנוצרה ב
    //נשים לב שיש לשלוח שני משתנים אחד הטבלה שבנויה בקלאס נפרד והמפתח הראשי הסוג שלו
}
