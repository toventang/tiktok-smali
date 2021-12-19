package com.ss.android.ugc.aweme.im.sdk.relations.data.b;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class c {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Boolean f102980a;

    /* renamed from: b  reason: collision with root package name */
    public String f102981b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f102982c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f102983d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f102984e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f102985f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f102986g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f102987h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f102988i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f102989j;

    /* renamed from: k  reason: collision with root package name */
    public b f102990k;

    /* renamed from: l  reason: collision with root package name */
    public final int f102991l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f102992m;

    public enum b {
        LONG_PRESS,
        NORMAL;

        static {
            Covode.recordClassIndex(66020);
        }
    }

    static {
        Covode.recordClassIndex(66018);
    }

    public c() {
        this(false, 3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66019);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (this.f102991l == 1) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i2 = this.f102991l;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        return false;
    }

    public c(int i2, boolean z) {
        this.f102991l = i2;
        this.f102992m = z;
        this.f102982c = true;
        this.f102983d = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z, int i2) {
        this(0, (i2 & 2) != 0 ? false : z);
    }
}
