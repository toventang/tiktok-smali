package com.airbnb.lottie.g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f5598a = false;

    /* renamed from: b  reason: collision with root package name */
    public float f5599b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5600c;

    /* renamed from: d  reason: collision with root package name */
    private long f5601d;

    /* renamed from: e  reason: collision with root package name */
    private C0075a f5602e = new C0075a();

    /* renamed from: f  reason: collision with root package name */
    private C0075a f5603f = new C0075a();

    /* renamed from: g  reason: collision with root package name */
    private C0075a f5604g = new C0075a();

    /* renamed from: h  reason: collision with root package name */
    private C0075a f5605h = new C0075a();

    /* renamed from: i  reason: collision with root package name */
    private C0075a f5606i = new C0075a();

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<b> f5607j;

    /* renamed from: k  reason: collision with root package name */
    private long f5608k = 0;

    /* renamed from: l  reason: collision with root package name */
    private long f5609l = 0;

    public interface b {
        static {
            Covode.recordClassIndex(2336);
        }
    }

    static {
        Covode.recordClassIndex(2334);
    }

    public final void a() {
        if (this.f5600c) {
            this.f5603f.a(this.f5601d);
        }
    }

    public final void b() {
        if (this.f5600c) {
            this.f5604g.a(this.f5601d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.g.a$a  reason: collision with other inner class name */
    public static class C0075a {

        /* renamed from: a  reason: collision with root package name */
        public long f5610a;

        /* renamed from: b  reason: collision with root package name */
        public long f5611b;

        /* renamed from: c  reason: collision with root package name */
        private long f5612c;

        /* renamed from: d  reason: collision with root package name */
        private long f5613d;

        static {
            Covode.recordClassIndex(2335);
        }

        public final int a() {
            int i2;
            long j2 = this.f5610a;
            long j3 = j2 - this.f5611b;
            if (j3 > 0) {
                i2 = (int) (((((float) ((this.f5612c - this.f5613d) * 1000000000)) * 1.0f) / ((float) j3)) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f5611b = j2;
            this.f5613d = this.f5612c;
            return i2;
        }

        public final void a(long j2) {
            if (j2 != this.f5610a) {
                long j3 = this.f5612c + 1;
                this.f5612c = j3;
                this.f5610a = j2;
                if (this.f5611b == 0) {
                    this.f5611b = j2;
                    this.f5613d = j3;
                }
            }
        }
    }

    protected a() {
    }

    public final void a(b bVar) {
        if (bVar == null) {
            this.f5607j = null;
        } else {
            this.f5607j = new WeakReference<>(bVar);
        }
    }

    public final void b(boolean z) {
        if (this.f5600c && z) {
            this.f5606i.a(this.f5601d);
        }
    }

    public final void a(boolean z) {
        if (this.f5600c && z) {
            this.f5605h.a(this.f5601d);
        }
    }

    public final void a(long j2) {
        WeakReference<b> weakReference;
        if (this.f5600c) {
            this.f5601d = j2;
            this.f5602e.a(j2);
            if (this.f5598a && this.f5602e.f5610a - this.f5602e.f5611b >= 1000000000 && (weakReference = this.f5607j) != null && weakReference.get() != null) {
                this.f5602e.a();
                this.f5603f.a();
                this.f5605h.a();
                this.f5606i.a();
                this.f5604g.a();
                this.f5599b = 0.0f;
            }
        }
    }
}
