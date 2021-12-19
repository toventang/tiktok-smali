package androidx.core.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

public interface u {
    static {
        Covode.recordClassIndex(872);
    }

    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
