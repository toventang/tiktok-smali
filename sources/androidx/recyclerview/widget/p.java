package androidx.recyclerview.widget;

import android.os.Build;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    static final o f4189a = new p();

    p() {
    }

    static {
        Covode.recordClassIndex(1617);
    }

    @Override // androidx.recyclerview.widget.o
    public final void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.bsz);
            if (tag instanceof Float) {
                v.a(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.bsz, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.o
    public final void a(RecyclerView recyclerView, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.bsz) == null) {
            Float valueOf = Float.valueOf(v.k(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float k2 = v.k(childAt);
                    if (k2 > f4) {
                        f4 = k2;
                    }
                }
            }
            v.a(view, 1.0f + f4);
            view.setTag(R.id.bsz, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
