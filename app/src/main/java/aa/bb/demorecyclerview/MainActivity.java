package aa.bb.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView RV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RV=findViewById(R.id.RV);
        CustomAdapter CA = new CustomAdapter();
          //si scrol vertical
        //LinearLayoutManager LLM = new LinearLayoutManager(this);
         LinearLayoutManager LLM = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        RV.setLayoutManager(LLM);
        RV.setAdapter(CA);

    }
}