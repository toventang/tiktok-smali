package com.bytedance.android.livesdk.service.c.a;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0452a f21298b = new C0452a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f21299a;

    /* renamed from: c  reason: collision with root package name */
    private long f21300c;

    /* renamed from: d  reason: collision with root package name */
    private long f21301d;

    /* renamed from: e  reason: collision with root package name */
    private LongSparseArray<Long> f21302e = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(12562);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a  reason: collision with other inner class name */
    public static final class C0452a {

        /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a$a  reason: collision with other inner class name */
        public static final class C0453a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f21303a = new a();

            /* renamed from: b  reason: collision with root package name */
            public static final C0454a f21304b = new C0454a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a$a$a  reason: collision with other inner class name */
            public static final class C0454a {
                static {
                    Covode.recordClassIndex(12565);
                }

                private C0454a() {
                }

                public /* synthetic */ C0454a(byte b2) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12564);
            }
        }

        static {
            Covode.recordClassIndex(12563);
        }

        private C0452a() {
        }

        public /* synthetic */ C0452a(byte b2) {
            this();
        }
    }

    public final void a() {
        String str;
        if (this.f21300c != 0) {
            b a2 = b.a.a("gift_dynamic_preview_success").a("zip_show_duration", com.bytedance.android.livesdk.utils.a.a.a() - this.f21301d).a("gift_id", this.f21300c);
            if (a.C0445a.C0446a.f21161a.f21160a) {
                str = "call";
            } else {
                str = "click";
            }
            a2.a("show_type", str).a().b();
            this.f21300c = 0;
        }
    }

    private final void a(long j2) {
        this.f21300c = j2;
        this.f21301d = com.bytedance.android.livesdk.utils.a.a.a();
    }

    public final void a(long j2, int i2) {
        this.f21302e.put(j2, Long.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        a(j2);
        this.f21299a = i2;
    }

    public static void a(long j2, String str) {
        String str2;
        l.d(str, "");
        b a2 = b.a.a("gift_dynamic_preview_fail").a().a("gift_id", j2);
        if (a.C0445a.C0446a.f21161a.f21160a) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        a2.a("show_type", str2).a("error_code", str).b();
    }

    public final void a(long j2, boolean z) {
        String str;
        String str2;
        long a2 = com.bytedance.android.livesdk.utils.a.a.a();
        Long l2 = this.f21302e.get(j2, Long.valueOf(a2));
        l.b(l2, "");
        b a3 = b.a.a("gift_zip_load_time").a().a("gift_id", j2).a("zip_load_time", a2 - l2.longValue());
        if (a.C0445a.C0446a.f21161a.f21160a) {
            str = "call";
        } else {
            str = "click";
        }
        b a4 = a3.a("show_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a4.a("is_zip_local", str2).b();
    }
}
