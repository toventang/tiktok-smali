package com.ss.android.socialbase.downloader.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.segment.a;
import java.io.InputStream;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f60571a;

    /* renamed from: b  reason: collision with root package name */
    private final a f60572b;

    static {
        Covode.recordClassIndex(37419);
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final void a(a aVar) {
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final void b() {
        g.a(this.f60571a);
    }

    @Override // com.ss.android.socialbase.downloader.h.b
    public final a a() {
        MethodCollector.i(12654);
        a aVar = this.f60572b;
        aVar.f60899c = this.f60571a.read(aVar.f60897a);
        a aVar2 = this.f60572b;
        MethodCollector.o(12654);
        return aVar2;
    }

    public c(InputStream inputStream, int i2) {
        this.f60571a = inputStream;
        this.f60572b = new a(i2);
    }
}
