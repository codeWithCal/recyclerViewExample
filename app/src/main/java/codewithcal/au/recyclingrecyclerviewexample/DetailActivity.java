package codewithcal.au.recyclingrecyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity
{
    private ImageView recycleImage;
    private TextView recycleText;

    Recycling selectedRecycling;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setUpViews();
        getRecycling();
    }

    private void setUpViews()
    {
        recycleImage = (ImageView) findViewById(R.id.recycleDetailImage);
        recycleText = (TextView) findViewById(R.id.recycleDetailText);
    }

    private void getRecycling()
    {
        Intent prevIntent = getIntent();
        int position = prevIntent.getIntExtra("position",0);
        selectedRecycling = MainActivity.recyclingArrayList.get(position);
        recycleImage.setImageResource(selectedRecycling.getImage());
        recycleText.setText(selectedRecycling.getName());
    }
}