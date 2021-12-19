package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public int f12434a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f12435b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f12436c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f12437d;

    static {
        Covode.recordClassIndex(6829);
    }

    public abstract void a(Canvas canvas, Paint paint);

    public abstract int b(Paint paint);

    public a(Context context) {
        l.d(context, "");
        this.f12437d = context;
        this.f12435b = context.getResources().getDimensionPixelSize(R.dimen.xu);
    }

    public final int a(Paint paint) {
        l.d(paint, "");
        if (this.f12434a < 0) {
            this.f12434a = b(paint);
        }
        return this.f12434a;
    }
}
