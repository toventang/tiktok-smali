package com.ss.android.ugc.aweme.shortvideo.v.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.b.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f132459a;

    /* renamed from: b  reason: collision with root package name */
    private final a f132460b;

    static {
        Covode.recordClassIndex(86713);
    }

    b(a aVar, a aVar2) {
        this.f132459a = aVar;
        this.f132460b = aVar2;
    }

    public final void run() {
        a aVar = this.f132459a;
        a aVar2 = this.f132460b;
        if (aVar.f132414b != null) {
            aVar.f132414b.onProgressUpdate(aVar.f132417e.a(0, aVar2.f118623a.get()), false);
        }
    }
}
