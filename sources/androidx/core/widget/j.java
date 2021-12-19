package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

public interface j {
    static {
        Covode.recordClassIndex(909);
    }

    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
