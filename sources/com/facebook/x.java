package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class x extends OutputStream implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Map<GraphRequest, aa> f49237a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f49238b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f49239c;

    /* renamed from: d  reason: collision with root package name */
    private GraphRequest f49240d;

    /* renamed from: e  reason: collision with root package name */
    private aa f49241e;

    static {
        Covode.recordClassIndex(30785);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        a(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        a((long) bArr.length);
    }

    x(Handler handler) {
        MethodCollector.i(3810);
        this.f49239c = handler;
        MethodCollector.o(3810);
    }

    @Override // com.facebook.z
    public final void a(GraphRequest graphRequest) {
        aa aaVar;
        this.f49240d = graphRequest;
        if (graphRequest != null) {
            aaVar = this.f49237a.get(graphRequest);
        } else {
            aaVar = null;
        }
        this.f49241e = aaVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f49241e == null) {
            aa aaVar = new aa(this.f49239c, this.f49240d);
            this.f49241e = aaVar;
            this.f49237a.put(this.f49240d, aaVar);
        }
        this.f49241e.a(j2);
        this.f49238b = (int) (((long) this.f49238b) + j2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        a((long) i3);
    }
}
