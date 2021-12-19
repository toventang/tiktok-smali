package androidx.appcompat.c;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private Locale f1062a;

    static {
        Covode.recordClassIndex(306);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i2, Rect rect) {
    }

    public a(Context context) {
        this.f1062a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1062a);
        }
        return null;
    }
}
