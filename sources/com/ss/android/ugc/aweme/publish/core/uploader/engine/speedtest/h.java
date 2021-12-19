package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import h.z;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f118704b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    long f118705a;

    /* renamed from: c  reason: collision with root package name */
    private final int f118706c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f118707d;

    static {
        Covode.recordClassIndex(77121);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77122);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private h(int i2) {
        this.f118706c = i2;
        this.f118707d = false;
    }

    public /* synthetic */ h(int i2, byte b2) {
        this(i2);
    }

    /* access modifiers changed from: private */
    public void a(int i2, h.f.a.a<z> aVar) {
        boolean z;
        l.d(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f118705a > ((long) i2)) {
            z = true;
        } else {
            z = false;
        }
        String str = "allow:" + z + " gap:" + (currentTimeMillis - this.f118705a) + " filterGap:" + i2;
        if (z) {
            if (this.f118707d) {
                this.f118705a = currentTimeMillis;
            }
            aVar.invoke();
            return;
        }
        bj.a("InvokeFilter ".concat(String.valueOf(str)));
    }
}
