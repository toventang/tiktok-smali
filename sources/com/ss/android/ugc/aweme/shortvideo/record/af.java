package com.ss.android.ugc.aweme.shortvideo.record;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f130039a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130040b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f130041c;

    static {
        Covode.recordClassIndex(85328);
    }

    af(u uVar, int i2, Bitmap bitmap) {
        this.f130039a = uVar;
        this.f130040b = i2;
        this.f130041c = bitmap;
    }

    public final void run() {
        this.f130039a.a(this.f130040b, this.f130041c);
    }
}
