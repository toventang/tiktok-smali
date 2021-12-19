package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttvecamera.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class g {
    AtomicBoolean A = new AtomicBoolean(false);
    public Map<String, Bundle> B = new HashMap();
    protected Map<Integer, Bundle> C = new HashMap();
    protected PrivacyCert D = null;
    protected com.ss.android.ttvecamera.c.a E;
    public boolean n;
    public l o;
    protected boolean p;
    public a q;
    public Handler r;
    public Context s;
    public com.ss.android.ttvecamera.j.c t;
    public int u;
    protected int v;
    protected int w = -1;
    protected float x;
    public int y;
    protected c z;

    public interface a {
        static {
            Covode.recordClassIndex(37875);
        }

        void a(int i2, int i3);

        void a(int i2, int i3, String str);

        void a(int i2, String str);

        void a(g gVar);

        void a(String str);

        void b(int i2, String str);

        void b(String str);

        void c(int i2, String str);

        void d(int i2, String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(37876);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(37877);
        }

        TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(37878);
        }
    }

    static {
        Covode.recordClassIndex(37874);
    }

    public static boolean H() {
        return true;
    }

    public int B() {
        return -1;
    }

    public abstract TEFrameSizei a(float f2, TEFrameSizei tEFrameSizei);

    public abstract void a();

    public void a(float f2) {
    }

    public abstract void a(float f2, l.p pVar);

    public void a(int i2, int i3) {
    }

    public abstract void a(int i2, int i3, l.AbstractC1345l lVar);

    public void a(long j2) {
    }

    public void a(Bundle bundle) {
    }

    public void a(PrivacyCert privacyCert) {
    }

    public abstract void a(l.AbstractC1345l lVar);

    public abstract void a(l.n nVar);

    public abstract void a(l.p pVar);

    public abstract void a(l.p pVar, boolean z2);

    public abstract void a(n nVar);

    public abstract void a(String str);

    public abstract void a(boolean z2);

    public abstract void b();

    public void b(float f2) {
    }

    public abstract void b(float f2, l.p pVar);

    public abstract void b(int i2);

    public void b(boolean z2) {
    }

    public void c() {
    }

    public abstract void c(int i2);

    public abstract void c(boolean z2);

    public void d() {
    }

    public abstract void d(int i2);

    /* access modifiers changed from: protected */
    public void d(boolean z2) {
    }

    public abstract int e();

    public void e(int i2) {
    }

    public int[] f() {
        return null;
    }

    public void g() {
    }

    public int[] h() {
        return null;
    }

    public abstract int i();

    public int j() {
        return -1;
    }

    public abstract float[] l();

    public abstract void m();

    public abstract void n();

    public abstract boolean p();

    public boolean q() {
        return false;
    }

    public abstract boolean r();

    public abstract boolean s();

    /* access modifiers changed from: protected */
    public void u() {
    }

    public int v() {
        return -1;
    }

    public int w() {
        return -1;
    }

    public void y() {
    }

    public float z() {
        return -1.0f;
    }

    public void a(com.ss.android.ttvecamera.i.a aVar, l.c cVar) {
        new UnsupportedOperationException("unsupport capture burst, camera type:" + e());
    }

    public int[] A() {
        return new int[]{-1, -1};
    }

    public float[] D() {
        return new float[]{-1.0f, -1.0f};
    }

    public final int G() {
        if (this.A.getAndSet(false)) {
            i();
        }
        return this.w;
    }

    public long[] C() {
        return new long[]{-1, -1};
    }

    public int[] k() {
        TEFrameSizei tEFrameSizei = this.o.q;
        return new int[]{tEFrameSizei.f61374a, tEFrameSizei.f61375b};
    }

    public boolean o() {
        if (this.o.H == null || !this.o.H.a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Bundle t() {
        Bundle bundle;
        if (this.B.containsKey(this.o.F)) {
            bundle = this.B.get(this.o.F);
        } else {
            bundle = new Bundle();
            this.B.put(this.o.F, bundle);
        }
        bundle.putInt("facing", this.o.f61802e);
        return bundle;
    }

    public void b(PrivacyCert privacyCert) {
        o.b("TECameraBase", "close...");
    }

    public void a(int i2) {
        o.a("TECameraBase", "scene mode: ".concat(String.valueOf(i2)));
    }

    public int a(l lVar, PrivacyCert privacyCert) {
        this.y = lVar.v;
        o.a("TECameraBase", "set start preview retry count: " + this.y);
        return 0;
    }

    public static Exception a(Exception exc, int i2) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i2);
    }

    public g(Context context, a aVar, Handler handler, c cVar) {
        com.ss.android.ttvecamera.c.a aVar2 = new com.ss.android.ttvecamera.c.a();
        this.E = aVar2;
        this.s = context;
        this.q = aVar;
        this.r = handler;
        this.z = cVar;
        com.ss.android.ttvecamera.c.b bVar = new com.ss.android.ttvecamera.c.b();
        if (!aVar2.f61459c) {
            if (aVar2.f61457a == null) {
                aVar2.f61457a = new ArrayList();
            }
            if (aVar2.f61458b == null) {
                aVar2.f61458b = bVar;
            }
            aVar2.f61459c = true;
        }
    }
}
