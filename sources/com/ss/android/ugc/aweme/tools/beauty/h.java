package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f139003a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(90924);
    }

    public static float a(a aVar) {
        l.d(aVar, "");
        if (!aVar.f139004a) {
            return ((((float) (aVar.f139008e - aVar.f139009f)) / 100.0f) * ((float) aVar.f139011h)) + ((float) aVar.f139009f);
        }
        if (aVar.f139011h >= 0) {
            return (((float) aVar.f139011h) / 50.0f) * ((float) aVar.f139008e);
        }
        return (((float) aVar.f139011h) / -50.0f) * ((float) aVar.f139009f);
    }

    public static a b(a aVar) {
        l.d(aVar, "");
        a aVar2 = new a(false, 0, 0, 0, 0, 0.0f, 0, 511);
        boolean z = true;
        if (aVar.f139004a) {
            aVar2.f139006c = 50;
            aVar2.f139007d = -50;
            if (aVar.f139010g >= 0.0f) {
                aVar2.f139011h = (int) (((aVar.f139010g / ((float) aVar.f139008e)) * 50.0f) + 0.5f);
            } else {
                aVar2.f139011h = -((int) (((aVar.f139010g / ((float) aVar.f139009f)) * 50.0f) + 0.5f));
            }
            if (aVar2.f139011h != 0) {
                z = false;
            }
            aVar2.f139012i = z;
        } else {
            aVar2.f139006c = 100;
            aVar2.f139007d = 0;
            aVar2.f139011h = (int) ((((aVar.f139010g - ((float) aVar.f139009f)) / ((float) (aVar.f139008e - aVar.f139009f))) * 100.0f) + 0.5f);
            if (aVar2.f139011h != 0) {
                z = false;
            }
            aVar2.f139012i = z;
        }
        return aVar2;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f139004a;

        /* renamed from: b  reason: collision with root package name */
        public int f139005b;

        /* renamed from: c  reason: collision with root package name */
        public int f139006c;

        /* renamed from: d  reason: collision with root package name */
        public int f139007d;

        /* renamed from: e  reason: collision with root package name */
        public int f139008e;

        /* renamed from: f  reason: collision with root package name */
        public int f139009f;

        /* renamed from: g  reason: collision with root package name */
        public float f139010g;

        /* renamed from: h  reason: collision with root package name */
        public int f139011h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f139012i;

        static {
            Covode.recordClassIndex(90925);
        }

        public a() {
            this(false, 0, 0, 0, 0, 0.0f, 0, 511);
        }

        private a(boolean z, int i2, int i3, int i4, int i5, float f2, int i6) {
            this.f139004a = z;
            this.f139005b = i2;
            this.f139006c = i3;
            this.f139007d = 0;
            this.f139008e = i4;
            this.f139009f = i5;
            this.f139010g = f2;
            this.f139011h = i6;
            this.f139012i = false;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z, int i2, int i3, int i4, int i5, float f2, int i6, int i7) {
            this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? 100 : i2, (i7 & 4) != 0 ? 100 : i3, (i7 & 16) == 0 ? i4 : 100, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0.0f : f2, (i7 & 128) != 0 ? 0 : i6);
        }
    }
}
