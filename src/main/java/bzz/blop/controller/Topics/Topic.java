package bzz.blop.controller.Topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // על ידי הכנסת האנוטיישן אינטטי אנחנו מצפים מספרינג שיצור טבלה עם הערכים למטה
public class Topic {

    @Id // משמש כפריימרי קיי נוכל לשים בשורה רלוונטית לפי צורך
    private String id;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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
}
