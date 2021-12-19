package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.awemepushlib.c.b;

final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145520a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap[] f145521b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap[] f145522c;

    /* renamed from: d  reason: collision with root package name */
    private final int f145523d;

    /* renamed from: e  reason: collision with root package name */
    private final b f145524e;

    static {
        Covode.recordClassIndex(95145);
    }

    f(Context context, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, int i2, b bVar) {
        this.f145520a = context;
        this.f145521b = bitmapArr;
        this.f145522c = bitmapArr2;
        this.f145523d = i2;
        this.f145524e = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return MessageShowHandler.a(this.f145520a, (Bitmap[]) this.f145521b[0], (Bitmap[]) this.f145522c[0], this.f145523d, this.f145524e);
    }
}
