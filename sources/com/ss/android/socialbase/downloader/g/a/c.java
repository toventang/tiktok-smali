package com.ss.android.socialbase.downloader.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.g.g;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c implements g {

    /* renamed from: f  reason: collision with root package name */
    private static final ArrayList<String> f60505f;

    /* renamed from: a  reason: collision with root package name */
    public List<HttpHeader> f60506a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f60507b;

    /* renamed from: c  reason: collision with root package name */
    long f60508c;

    /* renamed from: d  reason: collision with root package name */
    protected final Object f60509d;

    /* renamed from: e  reason: collision with root package name */
    boolean f60510e;

    /* renamed from: g  reason: collision with root package name */
    private int f60511g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f60512h;

    /* renamed from: i  reason: collision with root package name */
    private g f60513i;

    @Override // com.ss.android.socialbase.downloader.g.g
    public final int a() {
        return this.f60511g;
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public final void b() {
        g gVar = this.f60513i;
        if (gVar != null) {
            gVar.b();
        }
    }

    public final void c() {
        MethodCollector.i(14017);
        synchronized (this.f60509d) {
            try {
                if (this.f60512h && this.f60507b == null) {
                    this.f60509d.wait();
                }
            } finally {
                MethodCollector.o(14017);
            }
        }
    }

    static {
        Covode.recordClassIndex(37395);
        ArrayList<String> arrayList = new ArrayList<>(6);
        f60505f = arrayList;
        arrayList.add("Content-Length");
        arrayList.add("Content-Range");
        arrayList.add("Transfer-Encoding");
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    @Override // com.ss.android.socialbase.downloader.g.g
    public final String a(String str) {
        Map<String, String> map = this.f60507b;
        if (map != null) {
            return map.get(str);
        }
        g gVar = this.f60513i;
        if (gVar != null) {
            return gVar.a(str);
        }
        return null;
    }
}
