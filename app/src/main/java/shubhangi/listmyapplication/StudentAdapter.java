package shubhangi.listmyapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import shubhangi.listmyapplication.data.Student;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    List<Student> studentList;
    public StudentAdapter(List<Student> studentList){

        this.studentList = studentList;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_list,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        Student student = studentList.get(position);
        holder.txtName.setText("Name :"+student.getName());
        holder.txtAddress.setText("Address :"+student.getAddress());
        holder.txtPhone.setText("Phone :"+student.getPhone());
        holder.txtClass.setText("Class :"+student.getClass());
        holder.txtCollege.setText("CollegeName :"+student.getCollegename());




    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
