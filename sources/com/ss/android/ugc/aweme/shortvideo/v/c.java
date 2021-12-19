package com.ss.android.ugc.aweme.shortvideo.v;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.b.a.a;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f132465a;

    /* renamed from: b  reason: collision with root package name */
    private final int f132466b;

    /* renamed from: c  reason: collision with root package name */
    private final a f132467c;

    static {
        Covode.recordClassIndex(86718);
    }

    c(a aVar, int i2, a aVar2) {
        this.f132465a = aVar;
        this.f132466b = i2;
        this.f132467c = aVar2;
    }

    public final void run() {
        a aVar = this.f132465a;
        int a2 = aVar.f132390b.a(this.f132466b, this.f132467c.f118623a.get());
        if (aVar.f132389a != null) {
            aVar.f132389a.onProgressUpdate(a2, false);
        }
    }
}
