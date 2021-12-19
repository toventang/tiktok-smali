package androidx.core.h.a;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f2479a;

    /* renamed from: b  reason: collision with root package name */
    private final d f2480b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2481c;

    static {
        Covode.recordClassIndex(809);
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2479a);
        d dVar = this.f2480b;
        int i2 = this.f2481c;
        int i3 = Build.VERSION.SDK_INT;
        dVar.f2484a.performAction(i2, bundle);
    }

    public a(int i2, d dVar, int i3) {
        this.f2479a = i2;
        this.f2480b = dVar;
        this.f2481c = i3;
    }
}
