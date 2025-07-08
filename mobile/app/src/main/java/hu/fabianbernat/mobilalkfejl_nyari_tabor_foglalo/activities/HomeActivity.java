package hu.fabianbernat.mobilalkfejl_nyari_tabor_foglalo.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import static android.os.Build.VERSION_CODES.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        CarouselView carouselView = findViewById(R.id.carouselView);
        int[] images = { R.drawable.bernath1, R.drawable.bernath2, R.drawable.tricolor, R.drawable.hungary_map };

        carouselView.setPageCount(images.length);
        carouselView.setImageListener((position, imageView) -> imageView.setImageResource(images[position]));

        carouselView.setImageClickListener(position -> {
            if (position == 0 || position == 1) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fabbernat.github.io"));
                startActivity(browserIntent);
            }
        });

    }
}
