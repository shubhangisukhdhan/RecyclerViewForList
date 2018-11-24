package shubhangi.listmyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import shubhangi.listmyapplication.data.Student;

public class MainActivity extends AppCompatActivity {
    RecyclerView clgStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clgStudent = findViewById(R.id.clgStudent);
        List<Student> studentList = fetchMockStudent();

        StudentAdapter studentAdapter = new StudentAdapter(studentList);

        clgStudent.setLayoutManager(new LinearLayoutManager(this));

        clgStudent.setAdapter(studentAdapter);

    }

    private List<Student> fetchMockStudent(){


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("shubhangi","chandan nagar","8421857597","MCA","MGM College"));
        studentList.add(new Student("Shilpa","chandan nagar","8421857597","MCA","MGM College"));
        studentList.add(new Student("Damini"," patana","8421857597","MCA","MGM College"));
        studentList.add(new Student("pooja","pimple gurav","8421857597","MCA","MGM College"));
        studentList.add(new Student("rupali","Kharadi nagar","8421857597","MCA","MGM College"));


        return studentList;
    }

}
