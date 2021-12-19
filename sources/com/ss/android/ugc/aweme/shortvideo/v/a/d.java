package com.ss.android.ugc.aweme.shortvideo.v.a;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f132462a;

    static {
        Covode.recordClassIndex(86715);
    }

    d(a aVar) {
        this.f132462a = aVar;
    }

    public final void run() {
        a aVar = this.f132462a;
        int a2 = aVar.f132417e.a(4, aVar.f132422j.f118623a.get());
        if (aVar.f132414b != null) {
            aVar.f132414b.onProgressUpdate(a2, false);
        }
    }
}
