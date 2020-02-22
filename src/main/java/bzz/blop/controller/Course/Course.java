package bzz.blop.controller.Course;

import bzz.blop.controller.Topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // על ידי הכנסת האנוטיישן אינטטי אנחנו מצפים מספרינג שיצור טבלה עם הערכים למטה
public class Course {


    @Id // משמש כפריימרי קיי נוכל לשים בשורה רלוונטית לפי צורך
    private String id;
    private String name;
    private String description;
    @ManyToOne //חייבים להגדיר עוד מפתח ראשי לטופיק מהמחלקה שיורשים ממנה
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description,String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
        // ניצור משתנה עזר כדי לדעת את האיי די של הטופיק ככה נחסוך למשתמש בהזנה של הטופיק
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public Topic getTopic(){
        return topic;
    }
}
