package com.bytedance.ies.bullet.service.f.a.b;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.k;
import com.bytedance.ies.bullet.service.f.a.b.l;
import com.bytedance.ies.bullet.service.f.a.b.r;
import com.bytedance.ies.bullet.service.f.a.b.s;
import java.util.LinkedHashMap;
import java.util.Map;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final e<t> f32729a;

    /* renamed from: b  reason: collision with root package name */
    public static final e<k> f32730b;

    /* renamed from: c  reason: collision with root package name */
    public static final e<r> f32731c;

    /* renamed from: d  reason: collision with root package name */
    public static final e<l> f32732d;

    /* renamed from: e  reason: collision with root package name */
    public static final u f32733e = new u();

    /* renamed from: f  reason: collision with root package name */
    private static final e<s> f32734f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f32735g;

    private u() {
    }

    static {
        Covode.recordClassIndex(19464);
        n nVar = new n(t.class);
        f32729a = nVar;
        n nVar2 = new n(s.class);
        f32734f = nVar2;
        n nVar3 = new n(k.class);
        f32730b = nVar3;
        n nVar4 = new n(r.class);
        f32731c = nVar4;
        n nVar5 = new n(l.class);
        f32732d = nVar5;
        nVar.a(Uri.class, new C0706u());
        nVar.a(Uri.Builder.class, new w());
        nVar2.a(Uri.class, new x());
        nVar2.a(Uri.Builder.class, new y());
        nVar3.a(Uri.class, new z());
        nVar3.a(Uri.Builder.class, new aa());
        nVar4.a(Uri.class, new ab());
        nVar4.a(Uri.Builder.class, new ac());
        nVar5.a(Uri.class, new ad());
        nVar5.a(Uri.Builder.class, new v());
        nVar.a(Map.class, new k());
        nVar.a(Map.class, new m());
        nVar2.a(Map.class, new n());
        nVar2.a(Map.class, new o());
        nVar3.a(Map.class, new p());
        nVar3.a(Map.class, new q());
        nVar4.a(Map.class, new r());
        nVar4.a(Map.class, new s());
        nVar5.a(Map.class, new t());
        nVar5.a(Map.class, new l());
        nVar.a(Bundle.class, new a());
        nVar.a(Bundle.class, new c());
        nVar2.a(Bundle.class, new d());
        nVar2.a(Bundle.class, new e());
        nVar3.a(Bundle.class, new f());
        nVar3.a(Bundle.class, new g());
        nVar4.a(Bundle.class, new h());
        nVar4.a(Bundle.class, new i());
        nVar5.a(Bundle.class, new j());
        nVar5.a(Bundle.class, new b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("white", "#FFFFFFFF");
        linkedHashMap.put("black", "#FF000000");
        linkedHashMap.put("transparent", "#00000000");
        f32735g = linkedHashMap;
    }

    public static t a(String str) {
        t tVar = new t(-2);
        try {
            Map<String, String> map = f32735g;
            if (map.keySet().contains(str)) {
                return new t(Color.parseColor(map.get(str)));
            }
            if (h.m.p.b(str, "#", false)) {
                str = h.m.p.a(str, 1);
            }
            int length = str.length();
            if (length == 3) {
                if (str.length() == 3) {
                    str = "FF" + str.charAt(0) + str.charAt(0) + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2);
                }
                return new t(Color.parseColor("#".concat(String.valueOf(str))));
            } else if (length == 6) {
                return new t(Color.parseColor("#FF".concat(String.valueOf(str))));
            } else {
                if (length != 8) {
                    return tVar;
                }
                if (str.length() == 8) {
                    str = h.m.p.k(str) + h.m.p.b(str, 2);
                }
                return new t(Color.parseColor("#".concat(String.valueOf(str))));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.m<Bundle, String, t> {
        static {
            Covode.recordClassIndex(19465);
        }

        public a() {
            super(2);
        }

        public final t invoke(Bundle bundle, String str) {
            String string;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            h.f.b.l.a((Object) string, "");
            return u.a(string);
        }
    }

    public static final class ab extends h.f.b.m implements h.f.a.m<Uri, String, r> {
        static {
            Covode.recordClassIndex(19467);
        }

        public ab() {
            super(2);
        }

        public final r invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return r.a.a(a2);
            }
            return null;
        }
    }

    public static final class ad extends h.f.b.m implements h.f.a.m<Uri, String, l> {
        static {
            Covode.recordClassIndex(19469);
        }

        public ad() {
            super(2);
        }

        public final l invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return l.a.a(a2);
            }
            return null;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.m<Bundle, String, s> {
        static {
            Covode.recordClassIndex(19472);
        }

        public d() {
            super(2);
        }

        public final s invoke(Bundle bundle, String str) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (bundle.containsKey(str)) {
                return s.a.a(bundle.getInt(str));
            }
            return null;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.m<Bundle, String, k> {
        static {
            Covode.recordClassIndex(19474);
        }

        public f() {
            super(2);
        }

        public final k invoke(Bundle bundle, String str) {
            String string;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            h.f.b.l.a((Object) string, "");
            return k.a.a(string);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.m<Bundle, String, r> {
        static {
            Covode.recordClassIndex(19476);
        }

        public h() {
            super(2);
        }

        public final r invoke(Bundle bundle, String str) {
            String string;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            h.f.b.l.a((Object) string, "");
            return r.a.a(string);
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.m<Bundle, String, l> {
        static {
            Covode.recordClassIndex(19478);
        }

        public j() {
            super(2);
        }

        public final l invoke(Bundle bundle, String str) {
            String string;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            h.f.b.l.a((Object) string, "");
            return l.a.a(string);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, t> {
        static {
            Covode.recordClassIndex(19479);
        }

        public k() {
            super(2);
        }

        public final t invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return u.a(str2);
                }
            }
            return null;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, s> {
        static {
            Covode.recordClassIndex(19482);
        }

        public n() {
            super(2);
        }

        public final s invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return s.a.a(str2);
                }
            }
            return null;
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, k> {
        static {
            Covode.recordClassIndex(19484);
        }

        public p() {
            super(2);
        }

        public final k invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return k.a.a(str2);
                }
            }
            return null;
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, r> {
        static {
            Covode.recordClassIndex(19486);
        }

        public r() {
            super(2);
        }

        public final r invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return r.a.a(str2);
                }
            }
            return null;
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, l> {
        static {
            Covode.recordClassIndex(19488);
        }

        public t() {
            super(2);
        }

        public final l invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return l.a.a(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.u$u  reason: collision with other inner class name */
    public static final class C0706u extends h.f.b.m implements h.f.a.m<Uri, String, t> {
        static {
            Covode.recordClassIndex(19489);
        }

        public C0706u() {
            super(2);
        }

        public final t invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return u.a(a2);
            }
            return null;
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.m<Uri, String, s> {
        static {
            Covode.recordClassIndex(19492);
        }

        public x() {
            super(2);
        }

        public final s invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return s.a.a(a2);
            }
            return null;
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.m<Uri, String, k> {
        static {
            Covode.recordClassIndex(19494);
        }

        public z() {
            super(2);
        }

        public final k invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return k.a.a(a2);
            }
            return null;
        }
    }

    public static final class aa extends h.f.b.m implements h.f.a.q<Uri.Builder, String, k, Uri.Builder> {
        static {
            Covode.recordClassIndex(19466);
        }

        public aa() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, k kVar) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String value = kVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    public static final class ac extends h.f.b.m implements h.f.a.q<Uri.Builder, String, r, Uri.Builder> {
        static {
            Covode.recordClassIndex(19468);
        }

        public ac() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, r rVar) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String value = rVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.q<Bundle, String, l, Bundle> {
        static {
            Covode.recordClassIndex(19470);
        }

        public b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, l lVar) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putString(str, lVar.getVALUE());
            return bundle;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.q<Bundle, String, t, Bundle> {
        static {
            Covode.recordClassIndex(19471);
        }

        public c() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, t tVar) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putString(str, String.valueOf(tVar.f32728a));
            return bundle;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.q<Bundle, String, s, Bundle> {
        static {
            Covode.recordClassIndex(19473);
        }

        public e() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, s sVar) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putInt(str, sVar.getVALUE());
            return bundle;
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.q<Bundle, String, k, Bundle> {
        static {
            Covode.recordClassIndex(19475);
        }

        public g() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, k kVar) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putString(str, kVar.getVALUE());
            return bundle;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.q<Bundle, String, r, Bundle> {
        static {
            Covode.recordClassIndex(19477);
        }

        public i() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, r rVar) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putString(str, rVar.getVALUE());
            return bundle;
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, l, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19480);
        }

        public l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, l lVar) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = h.f.b.ad.h(map);
            String value = lVar.getVALUE();
            if (value != null) {
                h2.put(str, value);
            }
            return h2;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, t, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19481);
        }

        public m() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, t tVar) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = h.f.b.ad.h(map);
            String valueOf = String.valueOf(tVar.f32728a);
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, s, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19483);
        }

        public o() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, s sVar) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = h.f.b.ad.h(map);
            String valueOf = String.valueOf(sVar.getVALUE());
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, k, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19485);
        }

        public q() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, k kVar) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = h.f.b.ad.h(map);
            String value = kVar.getVALUE();
            if (value != null) {
                h2.put(str, value);
            }
            return h2;
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, r, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19487);
        }

        public s() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, r rVar) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = h.f.b.ad.h(map);
            String value = rVar.getVALUE();
            if (value != null) {
                h2.put(str, value);
            }
            return h2;
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.q<Uri.Builder, String, l, Uri.Builder> {
        static {
            Covode.recordClassIndex(19490);
        }

        public v() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, l lVar) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String value = lVar.getVALUE();
            if (value != null) {
                builder.appendQueryParameter(str, value);
            }
            return builder;
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.q<Uri.Builder, String, t, Uri.Builder> {
        static {
            Covode.recordClassIndex(19491);
        }

        public w() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, t tVar) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(tVar.f32728a);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.q<Uri.Builder, String, s, Uri.Builder> {
        static {
            Covode.recordClassIndex(19493);
        }

        public y() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, s sVar) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(sVar.getVALUE());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }
}
