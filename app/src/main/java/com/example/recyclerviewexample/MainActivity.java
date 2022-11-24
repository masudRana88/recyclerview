package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

// Step 1 : Make a Recycle View design (I make this in layout > count_row.xml)
// Step 2 : Connect this View design in Main Activity (Line 32 and setLayoutManager line 34)
// Step 3 : Make a Model class (For data type, This data type will be Arrry data type. I make this Called Contact_model.java);
// step 4 : Make a "ArrayList<>" in Main activity with model class data type (line 25)
// step 5 : Add damo data in arrylist(line 36 to 67)
// step 6 : make a coustom adapter (I make costom adapter called Recycle_contact_adapter.java) ==> Follow Costom_adepter Comments to make a coustom adepter
// step 7 : Than make a custom adapter object (line 71)
// And set this adepter in recycleView (line 73)




public class MainActivity extends AppCompatActivity {

    ArrayList<Contact_model> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContent);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));
        dataList.add(new Contact_model(R.drawable.man,"Mahim","123456789"));
        dataList.add(new Contact_model(R.drawable.man,"Mamun","098765443"));
        dataList.add(new Contact_model(R.drawable.man,"Lima","87234891806"));
        dataList.add(new Contact_model(R.drawable.man,"Jibon","87230640364"));



        Recycle_Contact_Adapter adapter = new Recycle_Contact_Adapter(this,dataList);

        recyclerView.setAdapter(adapter);

    }
}