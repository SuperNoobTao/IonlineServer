package bean;

import java.util.Date;

/**
 * Created by falling on 2016/4/16.
 */
public class QuestionBean {
    private int id;
    private String student_number;
    private String question;
    private Date  time;


    private int replynum;
    private String student_name;
    private String school;
    private String sex;

    public QuestionBean() {}

    public QuestionBean(String student_number, String question) {
        this.student_number = student_number;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public int getReplynum() {
        return replynum;
    }

    public void setReplynum(int replynum) {
        this.replynum = replynum;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
