package com.ss.android.ugc.aweme.shortvideo.v.a;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f132461a;

    static {
        Covode.recordClassIndex(86714);
    }

    c(a aVar) {
        this.f132461a = aVar;
    }

    public final void run() {
        a aVar = this.f132461a;
        int a2 = aVar.f132417e.a(1, aVar.f132421i.f118623a.get());
        if (aVar.f132414b != null) {
            aVar.f132414b.onProgressUpdate(a2, false);
        }
    }
}
