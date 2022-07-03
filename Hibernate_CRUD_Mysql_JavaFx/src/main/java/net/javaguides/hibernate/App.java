package net.javaguides.hibernate;

import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.module.Student;

public class App extends Application {
    public static void main(String args[]) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/one.fxml"));
            primaryStage.initStyle(StageStyle.DECORATED);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	 //StudentDao studentdao= new StudentDao();
	 
	 //save student
	 //Student student=new Student("niki","nik","nik@abv.bg");
	// studentdao.saveStudent(student);
	 
	 //test update student
	 //student.setFirstname("Niksan");
	 //studentdao.updateStudent(student);

	
	 //test getStudentsbyID
	 //Student student2=studentdao.getStudentsByID(student.getId());
	 
	 //test getallSTudents
	 //List<Student> students=studentdao.getAllStudents();
	 //students.forEach(student1->System.out.println(student1.getId()));
	 
	 //test delete student
     //studentDao.deleteStudent(1);
 }
