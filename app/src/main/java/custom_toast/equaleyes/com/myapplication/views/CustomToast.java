package custom_toast.equaleyes.com.myapplication.views;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.widget.Toast;
import custom_toast.equaleyes.com.myapplication.R;
import custom_toast.equaleyes.com.myapplication.databinding.LayoutCustomToastBinding;

/**
 * Created by Blaž Vantur, Drugi Vid d.o.o.
 */

public class CustomToast {

    public static Toast makeText(Context context, String message, int duration, String color) {
        LayoutCustomToastBinding binding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.layout_custom_toast,
                null, false);
        binding.tvMessage.setText(message);

        int roundRadius = (int) convertDpToPixel(context, 35);

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(color));
        gradientDrawable.setCornerRadius(roundRadius);

        binding.content.setBackground(gradientDrawable);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(binding.getRoot());
        return toast;
    }

    public static float convertDpToPixel(Context context, float sizeInDp){
        return sizeInDp * context.getResources().getDisplayMetrics().density;
    }
}
