package au.federation.a30333504.fedunigraphicsdemos30333504;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import au.federation.a30333504.fedunigraphicsdemos30333504.piano.PianoActivity;
import au.federation.a30333504.fedunigraphicsdemos30333504.smoke.SmokeActivity;
import au.federation.a30333504.fedunigraphicsdemos30333504.snow.SnowActivity;

public class MainActivity extends AppCompatActivity {

    ListView mainMenuListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainMenuListView =findViewById(R.id.menuListView);
        String[] menuItems=getResources().getStringArray(R.array.mainMenuItems);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_view_menu_items,menuItems);
        mainMenuListView.setAdapter(adapter);
        mainMenuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ChangeActivity(position);
        }
        });
    }
    private void ChangeActivity(int SwitchPos)
    {
        switch (SwitchPos)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, SnowActivity.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, SmokeActivity.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, PianoActivity.class));
                break;
        }
    }
}
