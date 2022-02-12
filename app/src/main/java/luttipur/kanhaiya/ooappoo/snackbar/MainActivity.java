package luttipur.kanhaiya.ooappoo.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab,fab2;
    CoordinatorLayout snack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.floatingActionButton);
        fab2 = findViewById(R.id.floatingActionButton2);
        snack = findViewById(R.id.snack);
    }

    public void showSnackBar(View view) {
        Snackbar snackbar = Snackbar.make(view,"You Just Clicked the snackbar Button", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    public void showSnackBarActionBtn(View view) {
        Snackbar snackbar = Snackbar.make(view,"SnackBar with Action Button",Snackbar.LENGTH_LONG);
        snackbar.setDuration(10000);
        snackbar.setAnchorView(fab);
        snackbar.setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do something
            }
        });
        snackbar.show();
    }

    public void showSnackBarActionBtn2(View view) {
        Snackbar snackbar = Snackbar.make(snack,"SnackBar with Action Button type2",Snackbar.LENGTH_LONG);
        snackbar.setDuration(10000);
        snackbar.setAnchorView(fab);
        snackbar.setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do something
            }
        });
        snackbar.show();
    }

    public void showSnackBarActionBtn3(View view) {
        Snackbar snackbar = Snackbar.make(snack,"SnackBar with Action Button type3",Snackbar.LENGTH_LONG);
        snackbar.setDuration(10000);
        snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
        snackbar.setAnchorView(fab2);
        snackbar.setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do something
            }
        });
        snackbar.show();
    }
}