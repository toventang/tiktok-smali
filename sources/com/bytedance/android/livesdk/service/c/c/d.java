package com.bytedance.android.livesdk.service.c.c;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f21370f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f21371a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21372b;

    /* renamed from: c  reason: collision with root package name */
    public long f21373c;

    /* renamed from: d  reason: collision with root package name */
    public long f21374d;

    /* renamed from: e  reason: collision with root package name */
    public final f.a.b.a f21375e;

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f21376g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.c.d<a.b> f21377h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21378i;

    static {
        Covode.recordClassIndex(12590);
    }

    public static final class a {

        /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a$a  reason: collision with other inner class name */
        public static final class C0463a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f21379a = new d((byte) 0);

            /* renamed from: b  reason: collision with root package name */
            public static final C0464a f21380b = new C0464a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a$a$a  reason: collision with other inner class name */
            public static final class C0464a {
                static {
                    Covode.recordClassIndex(12593);
                }

                private C0464a() {
                }

                public /* synthetic */ C0464a(byte b2) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12592);
            }
        }

        static {
            Covode.recordClassIndex(12591);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public long f21381a;

            /* renamed from: b  reason: collision with root package name */
            public long f21382b;

            /* renamed from: c  reason: collision with root package name */
            public long f21383c = com.bytedance.android.livesdk.utils.a.a.a();

            /* renamed from: d  reason: collision with root package name */
            public long f21384d = com.bytedance.android.livesdk.utils.a.a.a();

            /* renamed from: e  reason: collision with root package name */
            public int f21385e;

            /* renamed from: f  reason: collision with root package name */
            public int f21386f;

            /* renamed from: g  reason: collision with root package name */
            public long f21387g;

            static {
                Covode.recordClassIndex(12594);
            }

            public b(long j2) {
                this.f21387g = j2;
            }
        }
    }

    public enum b {
        MESSAGE_ERROR(-10),
        ASSET_NOT_FOUND(-11),
        ASSET_ERROR(-12),
        FOUNDATION_ERROR(-13);
        
        private int errorCode;

        public final int getErrorCode() {
            return this.errorCode;
        }

        static {
            Covode.recordClassIndex(12595);
        }

        public final void setErrorCode(int i2) {
            this.errorCode = i2;
        }

        private b(int i2) {
            this.errorCode = i2;
        }
    }

    private d() {
        this.f21376g = new LinkedList<>();
        this.f21375e = new f.a.b.a();
        this.f21377h = new androidx.c.d<>();
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(int i2) {
        a.b a2 = this.f21377h.a((long) i2, null);
        if (a2 != null) {
            a2.f21381a = com.bytedance.android.livesdk.utils.a.a.a() - a2.f21383c;
            a2.f21385e = 1;
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f21389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f21390b;

        static {
            Covode.recordClassIndex(12596);
        }

        public c(d dVar, boolean z) {
            this.f21389a = dVar;
            this.f21390b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            d dVar = this.f21389a;
            boolean z = this.f21390b;
            HashMap hashMap = new HashMap();
            l.d(hashMap, "");
            String a2 = b.a();
            if (a2 == null) {
                a2 = "";
            }
            hashMap.put("cpu", a2);
            String b2 = b.b();
            if (b2 == null) {
                b2 = "";
            }
            hashMap.put("pss", b2);
            String a3 = b.a(z);
            if (a3 == null) {
                a3 = "";
            }
            hashMap.put("stream", a3);
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("gift_effect_performance_monitor").a((Map<String, String>) hashMap).a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc()).a("asset_id", dVar.f21373c);
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            String valueOf = String.valueOf(b3.c());
            Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
            if (map == null || (i2 = map.get("anchor_id")) == null) {
                i2 = 0;
            }
            a4.a("is_anchor", l.a(valueOf, i2) ? 1 : 0).a().b();
        }
    }

    public final void a(LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList) {
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        this.f21376g = linkedList;
    }

    public final void a(a.b bVar, int i2) {
        l.d(bVar, "");
        this.f21377h.b((long) i2, bVar);
    }

    public final void a(int i2, boolean z) {
        this.f21378i = z;
        a.b a2 = this.f21377h.a((long) i2, null);
        if (a2 != null) {
            a2.f21382b = com.bytedance.android.livesdk.utils.a.a.a() - a2.f21384d;
            a2.f21386f = 1;
        }
    }

    public final void a(b bVar, String str) {
        l.d(bVar, "");
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_effect_msg_load_fail").a("is_asset_local", this.f21371a ? 1 : 0).a("is_own_send", this.f21372b ? 1 : 0).a("asset_id", this.f21373c).a("error_code", String.valueOf(bVar.getErrorCode())).a("error_msg", str);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        b2.c();
        Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
        if (map == null || map.get("anchor_id") == null) {
            Integer.valueOf(0);
        }
        a2.a("is_anchor", 0).a().b();
    }

    public final void a(int i2, Long l2, Integer num, Long l3, Integer num2) {
        String str;
        a.b a2 = this.f21377h.a((long) i2, null);
        if (a2 != null) {
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("gift_plate_fadeout").a("tray_show_time", (Number) l3).a("combo_cnts", (Number) num).a("tray_show_cnts", (Number) num2).a("is_profile_icon_load_success", a2.f21385e).a("is_gift_icon_load_success", a2.f21386f).a("profile_icon_duration_ms", a2.f21381a).a("gift_icon_duration_ms", a2.f21382b).a("is_dynamic_icon", this.f21378i ? 1 : 0);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            b2.c();
            Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
            if (map == null || map.get("anchor_id") == null) {
                Integer.valueOf(0);
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("is_anchor", 0);
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            l.b(b3, "");
            long c2 = b3.c();
            if (l2 != null && l2.longValue() == c2) {
                str = "1";
            } else {
                str = "0";
            }
            a4.a("is_own_send", str).a().b();
        }
    }
}
