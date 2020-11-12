package com.example.e_money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.e_money.Adapters.SampleAdapter;
import com.example.e_money.Data.SampleData;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {
    RecyclerView recyclerView;
    List<SampleData> dataList;
    SampleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView txt_username = findViewById(R.id.txt_user_name);
        Bundle data = getIntent().getExtras();
        String username = data.getString("username");
        txt_username.setText(username);

        //
        recyclerView = findViewById(R.id.recycler);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        dataList = new ArrayList<>();

        dataList.add(new SampleData("Invest", R.drawable.undraw_investing));
        dataList.add(new SampleData("Convenience", R.drawable.undraw_mobile_payments_vftl));
        dataList.add(new SampleData("Link Bank Accounts", R.drawable.undraw_credit_card_re_blml));
        dataList.add(new SampleData("Finance", R.drawable.undraw_personal_finance_tqcd));
        adapter = new SampleAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }


}
