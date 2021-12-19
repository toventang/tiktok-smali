package com.ss.android.ugc.aweme.autoplay.c;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import h.f.b.l;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final View f67316a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f67317b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private int[] f67318c = new int[2];

    static {
        Covode.recordClassIndex(41460);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final boolean e() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final String d() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final Rect c() {
        this.f67316a.getLocationOnScreen(this.f67318c);
        Rect rect = this.f67317b;
        int[] iArr = this.f67318c;
        rect.set(iArr[0], iArr[1], iArr[0] + this.f67316a.getWidth(), this.f67318c[1] + this.f67316a.getHeight());
        return this.f67317b;
    }

    public a(View view) {
        l.d(view, "");
        this.f67316a = view;
    }
}
