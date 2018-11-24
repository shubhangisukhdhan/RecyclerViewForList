package shubhangi.listmyapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView txtName,txtAddress,txtPhone,txtClass,txtCollege;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);


        txtName = itemView.findViewById(R.id.txtName);
        txtAddress = itemView.findViewById(R.id.txtAddress);
        txtCollege = itemView.findViewById(R.id.txtCollege);
        txtPhone =itemView.findViewById(R.id.txtPhone);
        txtClass = itemView.findViewById(R.id.txtClass);

    }
}
