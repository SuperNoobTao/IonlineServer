package dao.Impl;

import bean.QuestionBean;
import dao.DAO;

import java.util.List;

/**
 * Created by falling on 2016/4/16.
 */
public class QuestionDAOImpl extends DAO<QuestionBean> {

    /**
     * 获取问题列表
     * @return
     */
    public List<QuestionBean> getAllQuestion(){
//        String sql ="select * from questionTable order by id DESC";
        String sql = "SELECT u.student_name,q.time,q.question,q.student_number,q.id ,count_answer(q.id) replynum,u.school,u.sex" +
                "   FROM questiontable q ,usertable u" +
                "  WHERE q.student_number = u.student_number" +
                "  order by id DESC";
        return getForList(sql);
    }

    /**
     * 获取我的问题列表
     * @return
     * @param student_number
     */
    public List<QuestionBean> getMyQuestion(String student_number){
//        String sql ="select * from questionTable order by id DESC";
        String sql = "SELECT u.student_name,q.time,q.question,q.student_number,q.id ,count_answer(q.id) replynum,u.school,u.sex" +
                "   FROM questiontable q ,usertable u" +
                "  WHERE q.student_number = u.student_number" +
                " AND q.student_number = ?" +
                "  order by id DESC";
        return getForList(sql,student_number);
    }

    /**
     * 提问
     * @param bean
     * @return
     */
    public  boolean insert(QuestionBean bean){
        String sql = "insert into questionTable(student_number,question,time) values(?,?,now())";
        return update(sql,bean.getStudent_number(),bean.getQuestion());
    }

}
