package com.recyclebin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circImg;
    TextView tvfullName,tvphoneNo,tvaddress,tvemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg=findViewById(R.id.circImg);
        tvfullName=findViewById(R.id.tvfullName);
        tvphoneNo=findViewById(R.id.tvphoneNo);
        tvaddress=findViewById(R.id.tvaddress);
        tvemail=findViewById(R.id.tvemail);

        Bundle bundle=getIntent().getExtras();
        if (bundle !=null){

            circImg.setImageResource(bundle.getInt("image"));
            tvfullName.setText(bundle.getString("name"));
            tvphoneNo.setText(bundle.getString("phone"));
            tvaddress.setText(bundle.getString("address"));
            tvemail.setText(bundle.getString("email"));
        }

    }
}
