package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

public interface e {
    static {
        Covode.recordClassIndex(791);
    }

    void setTint(int i2);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(PorterDuff.Mode mode);
}
