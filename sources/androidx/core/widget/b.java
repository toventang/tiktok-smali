package androidx.core.widget;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public interface b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2633d;

    int getAutoSizeMaxTextSize();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2);

    void setAutoSizeTextTypeWithDefaults(int i2);

    static {
        boolean z;
        Covode.recordClassIndex(900);
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f2633d = z;
    }
}
