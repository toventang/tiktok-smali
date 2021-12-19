package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f96270e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f96271a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f96272b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f96273c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f96274d = "";

    /* renamed from: f  reason: collision with root package name */
    private Integer f96275f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f96276g;

    /* renamed from: h  reason: collision with root package name */
    private List<Long> f96277h = z.INSTANCE;

    /* renamed from: i  reason: collision with root package name */
    private final int f96278i;

    /* renamed from: j  reason: collision with root package name */
    private final int f96279j;

    /* renamed from: k  reason: collision with root package name */
    private final int f96280k;

    /* renamed from: l  reason: collision with root package name */
    private final String f96281l;

    static {
        Covode.recordClassIndex(60969);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60970);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(int i2, int i3, int i4, String str) {
            l.d(str, "");
            return new e(i2, i3, i4, str);
        }
    }

    public final d a() {
        return new d(this.f96278i, this.f96279j, this.f96280k, this.f96281l, this.f96271a, this.f96275f, this.f96272b, this.f96273c, this.f96274d, this.f96276g, this.f96277h);
    }

    public e(int i2, int i3, int i4, String str) {
        l.d(str, "");
        this.f96278i = i2;
        this.f96279j = i3;
        this.f96280k = i4;
        this.f96281l = str;
    }
}
