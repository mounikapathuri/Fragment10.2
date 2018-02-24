package com.example.mounikapathuri.fragmentlist102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    private String updateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();

      if(findViewById(R.id.frag1)!=null){
          getSupportFragmentManager().beginTransaction().add(R.id.frag1,fragmentOne).commit();
      }

        if(findViewById(R.id.frag2)!=null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frag2,fragmentTwo).commit();
        }
    }
    public String getUpdateText() {
        return updateText;
    }

    public void setUpdateText(String updateText) {
        this.updateText = updateText;
    }
    public void changeTextViewText(){
        //it will change text of text view
        ((TextView) fragmentTwo.getView().findViewById(R.id.tvLayout)).setText(getUpdateText());
    }


}
