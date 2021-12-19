package androidx.emoji.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f2821a;

    static {
        Covode.recordClassIndex(994);
    }

    public a(View view, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a54}, 16842862, 0);
            this.f2821a = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }
}
