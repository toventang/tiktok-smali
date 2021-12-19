package com.ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final int f145433a;

    /* renamed from: b  reason: collision with root package name */
    private final int f145434b;

    /* renamed from: c  reason: collision with root package name */
    private final int f145435c;

    /* renamed from: d  reason: collision with root package name */
    private final int f145436d;

    /* renamed from: e  reason: collision with root package name */
    private final int f145437e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler.Callback f145438f;

    static {
        Covode.recordClassIndex(95095);
    }

    b(int i2, int i3, int i4, int i5, int i6, Handler.Callback callback) {
        this.f145433a = i2;
        this.f145434b = i3;
        this.f145435c = i4;
        this.f145436d = i5;
        this.f145437e = i6;
        this.f145438f = callback;
    }

    public final boolean handleMessage(Message message) {
        return a.a(this.f145433a, this.f145434b, this.f145435c, this.f145436d, this.f145437e, this.f145438f, message);
    }
}
