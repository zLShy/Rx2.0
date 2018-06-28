package bean;

/**
 * Created by zhangli on 2018/6/27.
 */

public class Subjects {
    private String title, year, id,name;

    public Subjects(String title, String year, String id,String name) {
        this.title = title;
        this.year = year;
        this.id = id;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
