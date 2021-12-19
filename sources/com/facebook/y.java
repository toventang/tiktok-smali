package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.a.b.a;
import com.facebook.q;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class y extends FilterOutputStream implements z {

    /* renamed from: a  reason: collision with root package name */
    public final q f49242a;

    /* renamed from: b  reason: collision with root package name */
    public long f49243b;

    /* renamed from: c  reason: collision with root package name */
    public long f49244c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<GraphRequest, aa> f49245d;

    /* renamed from: e  reason: collision with root package name */
    private final long f49246e = m.f();

    /* renamed from: f  reason: collision with root package name */
    private long f49247f;

    /* renamed from: g  reason: collision with root package name */
    private aa f49248g;

    static {
        Covode.recordClassIndex(30786);
    }

    private void a() {
        if (this.f49243b > this.f49247f) {
            for (q.a aVar : this.f49242a.f49013e) {
                if (aVar instanceof q.b) {
                    Handler handler = this.f49242a.f49009a;
                    final q.b bVar = (q.b) aVar;
                    if (handler != null) {
                        handler.post(new Runnable() {
                            /* class com.facebook.y.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(30787);
                            }

                            public final void run() {
                                a.a(this);
                            }
                        });
                    }
                }
            }
            this.f49247f = this.f49243b;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        super.close();
        for (aa aaVar : this.f49245d.values()) {
            aaVar.a();
        }
        a();
    }

    @Override // com.facebook.z
    public final void a(GraphRequest graphRequest) {
        aa aaVar;
        if (graphRequest != null) {
            aaVar = this.f49245d.get(graphRequest);
        } else {
            aaVar = null;
        }
        this.f49248g = aaVar;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i2) {
        MethodCollector.i(1859);
        this.out.write(i2);
        a(1);
        MethodCollector.o(1859);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr) {
        MethodCollector.i(1853);
        this.out.write(bArr);
        a((long) bArr.length);
        MethodCollector.o(1853);
    }

    private void a(long j2) {
        aa aaVar = this.f49248g;
        if (aaVar != null) {
            aaVar.f46891b += j2;
            if (aaVar.f46891b >= aaVar.f46892c + aaVar.f46890a || aaVar.f46891b >= aaVar.f46893d) {
                aaVar.a();
            }
        }
        long j3 = this.f49243b + j2;
        this.f49243b = j3;
        if (j3 >= this.f49247f + this.f49246e || j3 >= this.f49244c) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        MethodCollector.i(1855);
        this.out.write(bArr, i2, i3);
        a((long) i3);
        MethodCollector.o(1855);
    }

    y(OutputStream outputStream, q qVar, Map<GraphRequest, aa> map, long j2) {
        super(outputStream);
        MethodCollector.i(1847);
        this.f49242a = qVar;
        this.f49245d = map;
        this.f49244c = j2;
        MethodCollector.o(1847);
    }
}
