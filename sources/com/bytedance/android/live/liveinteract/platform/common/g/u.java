package com.bytedance.android.live.liveinteract.platform.common.g;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12012a;

    /* renamed from: b  reason: collision with root package name */
    public static c f12013b;

    /* renamed from: c  reason: collision with root package name */
    public static b f12014c;

    /* renamed from: d  reason: collision with root package name */
    public static a f12015d;

    /* renamed from: e  reason: collision with root package name */
    public static Map<String, String> f12016e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public static Map<String, String> f12017f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public static f.a.b.b f12018g;

    /* renamed from: h  reason: collision with root package name */
    public static final u f12019h = new u();

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12025a = new f();

        static {
            Covode.recordClassIndex(6555);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f12027a = new h();

        static {
            Covode.recordClassIndex(6557);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public enum a {
        INVITER("inviter"),
        INVITEE("invitee");
        
        private String key = "anchor_type";
        private String value;

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(6550);
        }

        public final void setKey(String str) {
            l.d(str, "");
            this.key = str;
        }

        public final void setValue(String str) {
            l.d(str, "");
            this.value = str;
        }

        private a(String str) {
            this.value = str;
        }
    }

    public enum b {
        ANCHOR_LINKMIC("anchor"),
        AUDIENCE_LINKMIC("audience");
        
        private String key = "connection_type";
        private String value;

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(6551);
        }

        public final void setKey(String str) {
            l.d(str, "");
            this.key = str;
        }

        public final void setValue(String str) {
            l.d(str, "");
            this.value = str;
        }

        private b(String str) {
            this.value = str;
        }
    }

    public enum c {
        ANCHOR("anchor"),
        AUDIENCE("audience");
        
        private String key = "user_type";
        private String value;

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(6552);
        }

        public final void setKey(String str) {
            l.d(str, "");
            this.key = str;
        }

        public final void setValue(String str) {
            l.d(str, "");
            this.value = str;
        }

        private c(String str) {
            this.value = str;
        }
    }

    private u() {
    }

    public static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12023a = new d();

        static {
            Covode.recordClassIndex(6553);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public static void a() {
            Long l2;
            Long l3;
            u.f12013b = c.ANCHOR;
            u.f12014c = b.ANCHOR_LINKMIC;
            Long l4 = null;
            if (b.a.a().q) {
                u.f12015d = a.INVITER;
                Map<String, String> map = u.f12016e;
                com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
                if (b2 != null) {
                    l3 = Long.valueOf(b2.c());
                } else {
                    l3 = null;
                }
                map.put("inviter_id", String.valueOf(l3));
                Map<String, String> map2 = u.f12017f;
                com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
                if (a2 != null) {
                    l4 = Long.valueOf(a2.f9941f);
                }
                map2.put("invitee_id", String.valueOf(l4.longValue()));
                return;
            }
            u.f12015d = a.INVITEE;
            Map<String, String> map3 = u.f12016e;
            com.bytedance.android.live.liveinteract.api.a.b a3 = b.a.a();
            if (a3 != null) {
                l2 = Long.valueOf(a3.f9941f);
            } else {
                l2 = null;
            }
            map3.put("inviter_id", String.valueOf(l2.longValue()));
            Map<String, String> map4 = u.f12017f;
            com.bytedance.android.livesdk.at.f b3 = com.bytedance.android.livesdk.userservice.u.a().b();
            if (b3 != null) {
                l4 = Long.valueOf(b3.c());
            }
            map4.put("invitee_id", String.valueOf(l4));
        }
    }

    static {
        Covode.recordClassIndex(6549);
    }

    public static final void a() {
        f12012a = false;
        f12013b = null;
        f12014c = null;
        f12015d = null;
        f12016e.clear();
        f12017f.clear();
        f.a.b.b bVar = f12018g;
        if (bVar != null) {
            bVar.dispose();
        }
        f12018g = null;
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12026a;

        static {
            Covode.recordClassIndex(6556);
        }

        public g(c cVar) {
            this.f12026a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String value;
            HashMap hashMap = new HashMap();
            hashMap.put(this.f12026a.getKey(), this.f12026a.getValue());
            b bVar = u.f12014c;
            String str2 = "";
            if (bVar == null || (str = bVar.getKey()) == null) {
                str = str2;
            }
            b bVar2 = u.f12014c;
            if (!(bVar2 == null || (value = bVar2.getValue()) == null)) {
                str2 = value;
            }
            hashMap.put(str, str2);
            String str3 = b.a.a().x;
            if (!TextUtils.isEmpty(str3)) {
                if (str3 == null) {
                    l.b();
                }
                hashMap.put("request_id", str3);
            }
            b.a.a("connection_onemin").a((Map<String, String>) hashMap).b();
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f12024a = new e();

        static {
            Covode.recordClassIndex(6554);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String value;
            HashMap hashMap = new HashMap();
            c cVar = u.f12013b;
            String str6 = "";
            if (cVar == null || (str = cVar.getKey()) == null) {
                str = str6;
            }
            c cVar2 = u.f12013b;
            if (cVar2 == null || (str2 = cVar2.getValue()) == null) {
                str2 = str6;
            }
            hashMap.put(str, str2);
            b bVar = u.f12014c;
            if (bVar == null || (str3 = bVar.getKey()) == null) {
                str3 = str6;
            }
            b bVar2 = u.f12014c;
            if (bVar2 == null || (str4 = bVar2.getValue()) == null) {
                str4 = str6;
            }
            hashMap.put(str3, str4);
            a aVar = u.f12015d;
            if (aVar == null || (str5 = aVar.getKey()) == null) {
                str5 = str6;
            }
            a aVar2 = u.f12015d;
            if (!(aVar2 == null || (value = aVar2.getValue()) == null)) {
                str6 = value;
            }
            hashMap.put(str5, str6);
            hashMap.putAll(u.f12016e);
            hashMap.putAll(u.f12017f);
            w.a(hashMap, b.a.a().p, true);
            String str7 = b.a.a().x;
            if (!TextUtils.isEmpty(str7)) {
                if (str7 == null) {
                    l.b();
                }
                hashMap.put("request_id", str7);
            }
            hashMap.put("event_type", String.valueOf(b.a.a().p.getType()));
            w.a(hashMap);
            b.a.a("connection_onemin").a((Map<String, String>) hashMap).b();
        }
    }
}
