package crud.if21f.kostaja;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SesiLogin extends AppCompatActivity {

    private TextView panah_sesi, user1_sesi, user2_sesi, about_sesi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesilogin);

        panah_sesi = findViewById(R.id.panah_sesi);
        user1_sesi = findViewById(R.id.user1_sesi);
        user2_sesi = findViewById(R.id.user2_sesi);
        about_sesi = findViewById(R.id.about_sesi);

    }
}
