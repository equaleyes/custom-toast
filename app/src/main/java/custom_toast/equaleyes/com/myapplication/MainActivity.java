package custom_toast.equaleyes.com.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import custom_toast.equaleyes.com.myapplication.databinding.ActivityMainBinding;
import custom_toast.equaleyes.com.myapplication.views.CustomToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_success:
                CustomToast.makeText(this, "Successful toast", Toast.LENGTH_LONG, "#00FF00").show();
                break;

            case R.id.btn_failed:
                CustomToast.makeText(this, "Error toast", Toast.LENGTH_LONG, "#FF0000").show();
                break;
        }
    }
}
