package sg.edu.rp.c346.id20042741.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.idTvTranslatedText);
        registerForContextMenu(tvTranslatedText);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(tvTranslatedText.getText().toString().equalsIgnoreCase("Hello")){
            if(item.getTitle().toString().equalsIgnoreCase("Italian")){
                tvTranslatedText.setText("Ciao");
            }
        }else{
            if(item.getTitle().toString().equalsIgnoreCase("English")){
                tvTranslatedText.setText("Hello");
            }
        }
        return super.onContextItemSelected(item);
    }
}