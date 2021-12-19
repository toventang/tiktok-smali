package androidx.emoji.widget;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji.a.a;
import com.bytedance.covode.number.Covode;

final class i implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private final TransformationMethod f2843a;

    static {
        Covode.recordClassIndex(1008);
    }

    i(TransformationMethod transformationMethod) {
        this.f2843a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2843a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || a.a().c() != 1) {
            return charSequence;
        }
        return a.a().a(charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f2843a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i2, rect);
        }
    }
}
