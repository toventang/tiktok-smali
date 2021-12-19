package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.awemepushlib.c.b;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap[] f145515a;

    /* renamed from: b  reason: collision with root package name */
    private final b f145516b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f145517c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap[] f145518d;

    /* renamed from: e  reason: collision with root package name */
    private final int f145519e;

    static {
        Covode.recordClassIndex(95144);
    }

    e(Bitmap[] bitmapArr, b bVar, Context context, Bitmap[] bitmapArr2, int i2) {
        this.f145515a = bitmapArr;
        this.f145516b = bVar;
        this.f145517c = context;
        this.f145518d = bitmapArr2;
        this.f145519e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MessageShowHandler.a(this.f145515a, this.f145516b, this.f145517c, this.f145518d, this.f145519e);
    }
}
