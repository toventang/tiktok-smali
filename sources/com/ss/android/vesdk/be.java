package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ax;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    public VESize f151070a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f151071b;

    /* renamed from: c  reason: collision with root package name */
    public String f151072c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f151073d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap.CompressFormat f151074e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f151075f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f151076g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f151077h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f151078i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f151079j;

    /* renamed from: k  reason: collision with root package name */
    public ax.e f151080k;

    /* renamed from: l  reason: collision with root package name */
    public ax.d f151081l;

    /* renamed from: m  reason: collision with root package name */
    public ax.f f151082m;

    static {
        Covode.recordClassIndex(99348);
    }

    private be() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final be f151083a = new be((byte) 0);

        static {
            Covode.recordClassIndex(99349);
        }

        public final a a(Bitmap.CompressFormat compressFormat) {
            this.f151083a.f151074e = compressFormat;
            return this;
        }

        public final a b(boolean z) {
            this.f151083a.f151078i = z;
            return this;
        }

        public final a a(VESize vESize) {
            this.f151083a.f151070a = vESize;
            return this;
        }

        public final a a(ax.e eVar) {
            this.f151083a.f151080k = eVar;
            return this;
        }

        public final a a(String str) {
            this.f151083a.f151072c = str;
            return this;
        }

        public final a a(boolean z) {
            this.f151083a.f151071b = z;
            return this;
        }
    }

    /* synthetic */ be(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof be)) {
            be beVar = (be) obj;
            if (this.f151071b == beVar.f151071b && this.f151072c.equals(beVar.f151072c) && this.f151073d == beVar.f151073d && this.f151074e == beVar.f151074e && this.f151070a.equals(beVar.f151070a) && this.f151075f == beVar.f151075f && this.f151076g == beVar.f151076g && this.f151077h == beVar.f151077h && this.f151078i == beVar.f151078i && this.f151079j == beVar.f151079j) {
                return true;
            }
            return false;
        }
        return false;
    }
}
