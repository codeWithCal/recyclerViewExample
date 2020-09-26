package codewithcal.au.recyclingrecyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecycleAdapter.OnItemListener
{
    RecyclerView recyclerView;
    public static ArrayList<Recycling> recyclingArrayList = new ArrayList<Recycling>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseList();
        setUpRecycler();
    }

    private void initialiseList()
    {
        Recycling can = new Recycling("0", "Can", R.drawable.can, "Aluminium");
        recyclingArrayList.add(can);

        Recycling cerealBox = new Recycling("1", "Cereal", R.drawable.cerealbox, "Cardboard");
        recyclingArrayList.add(cerealBox);

        Recycling envelope = new Recycling("2", "Envelope", R.drawable.envolope, "Paper");
        recyclingArrayList.add(envelope);

        Recycling newsPaper = new Recycling("3", "News Paper", R.drawable.newspaper, "Paper");
        recyclingArrayList.add(newsPaper);

        Recycling waterBottle = new Recycling("4", "Water Bottle", R.drawable.waterbottle, "Plastic");
        recyclingArrayList.add(waterBottle);

        Recycling wineBottle = new Recycling("5", "Wine Bottle", R.drawable.winebottle, "Glass");
        recyclingArrayList.add(wineBottle);

    }

    private void setUpRecycler()
    {
        recyclerView = (RecyclerView) findViewById(R.id.recyleview);
        RecycleAdapter recycleAdapter = new RecycleAdapter(recyclingArrayList, this);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recycleAdapter);

    }

    @Override
    public void onItemClick(int position)
    {
        Intent detailIntent = new Intent(this, DetailActivity.class);
        detailIntent.putExtra("position", position);
        startActivity(detailIntent);
    }
}