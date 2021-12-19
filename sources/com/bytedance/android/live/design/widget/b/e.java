package com.bytedance.android.live.design.widget.b;

import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.zhiliaoapp.musically.R;

public class e extends c<TextView> {

    /* renamed from: a  reason: collision with root package name */
    private final d f9591a;

    static {
        Covode.recordClassIndex(4863);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{16842804, 16842901, R.attr.uq, R.attr.a2g};
    }

    public final void b(int i2) {
        f(i2);
    }

    public final void a(int i2) {
        this.f9591a.a(i2);
    }

    public e(TextView textView) {
        super(textView);
        this.f9591a = new d(textView);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        int dimensionPixelSize;
        int resourceId;
        ((TextView) this.f9590h).setTypeface(a.a().a(typedArray.getInteger(2, 1)));
        if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
            this.f9591a.a(resourceId);
        }
        if (typedArray.hasValue(3)) {
            h.e((TextView) this.f9590h, typedArray.getDimensionPixelSize(3, 0));
        }
        if (typedArray.hasValue(1) && (dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1)) != -1) {
            ((TextView) this.f9590h).setTextSize(0, (float) dimensionPixelSize);
        }
    }
}
