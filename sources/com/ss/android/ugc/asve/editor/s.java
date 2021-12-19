package com.ss.android.ugc.asve.editor;

import android.os.HandlerThread;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s {
    public static final a u = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    HandlerThread f62065a;

    /* renamed from: b  reason: collision with root package name */
    public x f62066b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f62067c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public VEListener.v f62068d;

    /* renamed from: e  reason: collision with root package name */
    final VEListener.v f62069e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    volatile VEListener.aj f62070f;

    /* renamed from: g  reason: collision with root package name */
    volatile VEListener.p f62071g;

    /* renamed from: h  reason: collision with root package name */
    volatile r f62072h;

    /* renamed from: i  reason: collision with root package name */
    volatile r f62073i;

    /* renamed from: j  reason: collision with root package name */
    volatile VEListener.aa f62074j;

    /* renamed from: k  reason: collision with root package name */
    boolean f62075k;

    /* renamed from: l  reason: collision with root package name */
    int f62076l = -1;

    /* renamed from: m  reason: collision with root package name */
    boolean f62077m;
    boolean n = true;
    int o = -1;
    int p;
    boolean q = true;
    boolean r = true;
    final String s;
    final SurfaceView t;

    static {
        Covode.recordClassIndex(38153);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38154);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final x a() {
        x xVar = this.f62066b;
        if (xVar == null) {
            l.a("veEditor");
        }
        return xVar;
    }

    static final class b implements VEListener.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f62078a;

        static {
            Covode.recordClassIndex(38155);
        }

        b(s sVar) {
            this.f62078a = sVar;
        }

        @Override // com.ss.android.vesdk.VEListener.v
        public final void a() {
            VEListener.v vVar;
            if (this.f62078a.f62067c.compareAndSet(false, true) && (vVar = this.f62078a.f62068d) != null) {
                vVar.a();
            }
        }
    }

    public s(String str, SurfaceView surfaceView) {
        l.d(str, "");
        this.s = str;
        this.t = surfaceView;
    }
}
