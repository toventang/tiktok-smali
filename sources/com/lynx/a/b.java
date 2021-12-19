package com.lynx.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f55045a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55046b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55047c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55048d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap.Config f55049e;

    static {
        Covode.recordClassIndex(34553);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f55050a;

        /* renamed from: b  reason: collision with root package name */
        public int f55051b;

        /* renamed from: c  reason: collision with root package name */
        public int f55052c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap.Config f55053d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f55054e;

        static {
            Covode.recordClassIndex(34554);
        }

        public final b a() {
            return new b(this.f55050a, this.f55051b, this.f55053d, this.f55052c, this.f55054e, (byte) 0);
        }
    }

    private b(int i2, int i3, Bitmap.Config config, int i4, boolean z) {
        this.f55045a = i2 <= 0 ? -1 : i2;
        this.f55046b = i3 <= 0 ? -1 : i3;
        this.f55049e = config == null ? Bitmap.Config.ARGB_8888 : config;
        this.f55048d = i4 < 0 ? 0 : i4;
        this.f55047c = z;
    }

    /* synthetic */ b(int i2, int i3, Bitmap.Config config, int i4, boolean z, byte b2) {
        this(i2, i3, config, i4, z);
    }
}
