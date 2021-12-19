package com.ss.android.ugc.aweme.shortvideo.v;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f132463a;

    static {
        Covode.recordClassIndex(86716);
    }

    b(a aVar) {
        this.f132463a = aVar;
    }

    public final void run() {
        a aVar = this.f132463a;
        if (aVar.f132389a != null) {
            aVar.f132389a.onProgressUpdate(aVar.f132390b.a(0, aVar.f132392d.f118623a.get()), false);
        }
    }
}
