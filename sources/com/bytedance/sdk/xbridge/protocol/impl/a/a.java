package com.bytedance.sdk.xbridge.protocol.impl.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.bytedance.sdk.xbridge.protocol.d.e;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static String f43962b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f43963c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final b f43964d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public k f43965a;

    public static final class b {
        static {
            Covode.recordClassIndex(26869);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public enum c {
        LYNX("lynx"),
        H5("h5");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(26870);
        }

        private c(String str) {
            this.type = str;
        }
    }

    static {
        Covode.recordClassIndex(26866);
    }

    public a(Context context, C1070a aVar, List<String> list, List<String> list2) {
        l.c(context, "");
        l.c(aVar, "");
        l.c(list, "");
        l.c(list2, "");
        String str = aVar.f43967a;
        String str2 = aVar.f43969c;
        final String str3 = aVar.f43968b;
        String str4 = aVar.f43970d;
        String str5 = aVar.f43971e;
        String str6 = aVar.f43972f;
        f43962b = str3;
        f43963c = str5;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", str);
        if (str.length() == 0) {
            e.a("BDXBridgeSDKMonitor", "did is empty! check it!");
        }
        jSONObject.put("host_aid", str3);
        jSONObject.put("app_version", str2);
        jSONObject.put("update_version_code", str4);
        jSONObject.put("channel", str5);
        jSONObject.put("sdk_version", str6);
        SDKMonitorUtils.b("292472", list);
        SDKMonitorUtils.a("292472", list2);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        SDKMonitorUtils.a(applicationContext, "292472", jSONObject, new k.a() {
            /* class com.bytedance.sdk.xbridge.protocol.impl.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26867);
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
            public final String a() {
                return "";
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
            public final Map<String, String> b() {
                HashMap hashMap = new HashMap();
                hashMap.put("host_aid", str3);
                return hashMap;
            }
        });
        k a2 = SDKMonitorUtils.a("292472");
        l.a((Object) a2, "");
        this.f43965a = a2;
    }

    /* renamed from: com.bytedance.sdk.xbridge.protocol.impl.a.a$a  reason: collision with other inner class name */
    public static final class C1070a {

        /* renamed from: a  reason: collision with root package name */
        public final String f43967a;

        /* renamed from: b  reason: collision with root package name */
        public final String f43968b;

        /* renamed from: c  reason: collision with root package name */
        public final String f43969c;

        /* renamed from: d  reason: collision with root package name */
        public final String f43970d;

        /* renamed from: e  reason: collision with root package name */
        public final String f43971e;

        /* renamed from: f  reason: collision with root package name */
        public final String f43972f;

        static {
            Covode.recordClassIndex(26868);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1070a)) {
                return false;
            }
            C1070a aVar = (C1070a) obj;
            return l.a(this.f43967a, aVar.f43967a) && l.a(this.f43968b, aVar.f43968b) && l.a(this.f43969c, aVar.f43969c) && l.a(this.f43970d, aVar.f43970d) && l.a(this.f43971e, aVar.f43971e) && l.a(this.f43972f, aVar.f43972f);
        }

        public final int hashCode() {
            String str = this.f43967a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f43968b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f43969c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f43970d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f43971e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f43972f;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode5 + i2;
        }

        public final String toString() {
            return "APPInfo4Monitor(deviceID=" + this.f43967a + ", hostAID=" + this.f43968b + ", appVersion=" + this.f43969c + ", update_version_code=" + this.f43970d + ", channel=" + this.f43971e + ", sdkVersion=" + this.f43972f + ")";
        }

        private C1070a(String str, String str2, String str3, String str4, String str5) {
            l.c(str, "");
            l.c(str2, "");
            l.c(str3, "");
            l.c(str5, "");
            this.f43967a = str;
            this.f43968b = str2;
            this.f43969c = str3;
            this.f43970d = str4;
            this.f43971e = str5;
            this.f43972f = null;
        }

        public /* synthetic */ C1070a(String str, String str2, String str3, String str4, String str5, byte b2) {
            this(str, str2, str3, str4, str5);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f43974a;

        /* renamed from: b  reason: collision with root package name */
        public final Integer f43975b;

        /* renamed from: c  reason: collision with root package name */
        public final String f43976c;

        /* renamed from: d  reason: collision with root package name */
        public final String f43977d;

        /* renamed from: e  reason: collision with root package name */
        public final String f43978e;

        /* renamed from: f  reason: collision with root package name */
        public final Long f43979f;

        /* renamed from: g  reason: collision with root package name */
        public final String f43980g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f43981h;

        /* renamed from: i  reason: collision with root package name */
        public final Long f43982i;

        /* renamed from: j  reason: collision with root package name */
        public final Long f43983j;

        /* renamed from: k  reason: collision with root package name */
        public final Long f43984k;

        /* renamed from: l  reason: collision with root package name */
        public final Long f43985l;

        /* renamed from: m  reason: collision with root package name */
        public final Integer f43986m;
        public final Long n;
        public final Long o;
        public final Long p;
        public final Long q;

        /* renamed from: com.bytedance.sdk.xbridge.protocol.impl.a.a$d$a  reason: collision with other inner class name */
        public static final class C1071a {

            /* renamed from: a  reason: collision with root package name */
            public String f43987a;

            /* renamed from: b  reason: collision with root package name */
            public Integer f43988b;

            /* renamed from: c  reason: collision with root package name */
            public String f43989c;

            /* renamed from: d  reason: collision with root package name */
            public String f43990d;

            /* renamed from: e  reason: collision with root package name */
            public String f43991e;

            /* renamed from: f  reason: collision with root package name */
            public Long f43992f;

            /* renamed from: g  reason: collision with root package name */
            public String f43993g;

            /* renamed from: h  reason: collision with root package name */
            public Integer f43994h;

            /* renamed from: i  reason: collision with root package name */
            public Long f43995i;

            /* renamed from: j  reason: collision with root package name */
            public Long f43996j;

            /* renamed from: k  reason: collision with root package name */
            public Long f43997k;

            /* renamed from: l  reason: collision with root package name */
            public Long f43998l;

            /* renamed from: m  reason: collision with root package name */
            public Integer f43999m;
            public Long n;
            public Long o;
            public Long p;
            public Long q;

            static {
                Covode.recordClassIndex(26872);
            }
        }

        static {
            Covode.recordClassIndex(26871);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.f43974a, dVar.f43974a) && l.a(this.f43975b, dVar.f43975b) && l.a(this.f43976c, dVar.f43976c) && l.a(this.f43977d, dVar.f43977d) && l.a(this.f43978e, dVar.f43978e) && l.a(this.f43979f, dVar.f43979f) && l.a(this.f43980g, dVar.f43980g) && l.a(this.f43981h, dVar.f43981h) && l.a(this.f43982i, dVar.f43982i) && l.a(this.f43983j, dVar.f43983j) && l.a(this.f43984k, dVar.f43984k) && l.a(this.f43985l, dVar.f43985l) && l.a(this.f43986m, dVar.f43986m) && l.a(this.n, dVar.n) && l.a(this.o, dVar.o) && l.a(this.p, dVar.p) && l.a(this.q, dVar.q);
        }

        public final int hashCode() {
            String str = this.f43974a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.f43975b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str2 = this.f43976c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f43977d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f43978e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Long l2 = this.f43979f;
            int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
            String str5 = this.f43980g;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Integer num2 = this.f43981h;
            int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Long l3 = this.f43982i;
            int hashCode9 = (hashCode8 + (l3 != null ? l3.hashCode() : 0)) * 31;
            Long l4 = this.f43983j;
            int hashCode10 = (hashCode9 + (l4 != null ? l4.hashCode() : 0)) * 31;
            Long l5 = this.f43984k;
            int hashCode11 = (hashCode10 + (l5 != null ? l5.hashCode() : 0)) * 31;
            Long l6 = this.f43985l;
            int hashCode12 = (hashCode11 + (l6 != null ? l6.hashCode() : 0)) * 31;
            Integer num3 = this.f43986m;
            int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Long l7 = this.n;
            int hashCode14 = (hashCode13 + (l7 != null ? l7.hashCode() : 0)) * 31;
            Long l8 = this.o;
            int hashCode15 = (hashCode14 + (l8 != null ? l8.hashCode() : 0)) * 31;
            Long l9 = this.p;
            int hashCode16 = (hashCode15 + (l9 != null ? l9.hashCode() : 0)) * 31;
            Long l10 = this.q;
            if (l10 != null) {
                i2 = l10.hashCode();
            }
            return hashCode16 + i2;
        }

        public final String toString() {
            return "MonitorModel(method=" + this.f43974a + ", code=" + this.f43975b + ", appID=" + this.f43976c + ", channel=" + this.f43977d + ", containerType=" + this.f43978e + ", duration=" + this.f43979f + ", url=" + this.f43980g + ", request_data_length=" + this.f43981h + ", request_send_timestamp=" + this.f43982i + ", request_receive_timestamp=" + this.f43983j + ", request_decode_duration=" + this.f43984k + ", request_duration=" + this.f43985l + ", response_data_length=" + this.f43986m + ", response_encode_duration=" + this.n + ", response_send_timestamp=" + this.o + ", response_receive_timestamp=" + this.p + ", response_duration=" + this.q + ")";
        }

        public d(String str, Integer num, String str2, String str3, String str4, Long l2, String str5, Integer num2, Long l3, Long l4, Long l5, Long l6, Integer num3, Long l7, Long l8, Long l9, Long l10) {
            this.f43974a = str;
            this.f43975b = num;
            this.f43976c = str2;
            this.f43977d = str3;
            this.f43978e = str4;
            this.f43979f = l2;
            this.f43980g = str5;
            this.f43981h = num2;
            this.f43982i = l3;
            this.f43983j = l4;
            this.f43984k = l5;
            this.f43985l = l6;
            this.f43986m = num3;
            this.n = l7;
            this.o = l8;
            this.p = l9;
            this.q = l10;
        }
    }
}
