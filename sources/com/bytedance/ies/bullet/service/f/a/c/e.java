package com.bytedance.ies.bullet.service.f.a.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.ad;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class e {
    static {
        Covode.recordClassIndex(19512);
    }

    public static final class a extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Boolean> {
        static {
            Covode.recordClassIndex(19513);
        }

        public a() {
            super(2);
        }

        public final Boolean invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj == null || !(obj instanceof String)) {
                return null;
            }
            return Boolean.valueOf(h.f.b.l.a(obj, (Object) "1"));
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, String> {
        static {
            Covode.recordClassIndex(19515);
        }

        public c() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r4, r0)
                h.f.b.l.c(r5, r0)
                java.lang.Object r2 = r4.get(r5)
                r1 = 0
                if (r2 == 0) goto L_0x0013
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0014
            L_0x0013:
                return r1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.f.a.c.e.c.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Uri> {
        static {
            Covode.recordClassIndex(19519);
        }

        public g() {
            super(2);
        }

        public final Uri invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return Uri.parse(str2);
                }
            }
            return null;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, String> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(2);
            this.$specificKey = str;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r4, r0)
                h.f.b.l.c(r5, r0)
                java.lang.String r0 = r3.$specificKey
                java.lang.Object r2 = r4.get(r0)
                r1 = 0
                if (r2 == 0) goto L_0x0015
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0016
            L_0x0015:
                return r1
            L_0x0016:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.f.a.c.e.i.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, String> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(2);
            this.$specificKey = str;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(java.util.Map<?, ?> r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r4, r0)
                h.f.b.l.c(r5, r0)
                java.lang.String r0 = r3.$specificKey
                java.lang.Object r2 = r4.get(r0)
                r1 = 0
                if (r2 == 0) goto L_0x0015
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L_0x0016
            L_0x0015:
                return r1
            L_0x0016:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.f.a.c.e.k.invoke(java.util.Map, java.lang.String):java.lang.Object");
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Integer> {
        static {
            Covode.recordClassIndex(19528);
        }

        public p() {
            super(2);
        }

        public final Integer invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return h.m.p.e(str2);
                }
            }
            return null;
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Long> {
        static {
            Covode.recordClassIndex(19530);
        }

        public r() {
            super(2);
        }

        public final Long invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return h.m.p.g(str2);
                }
            }
            return null;
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Float> {
        static {
            Covode.recordClassIndex(19532);
        }

        public t() {
            super(2);
        }

        public final Float invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return h.m.p.c(str2);
                }
            }
            return null;
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, Double> {
        static {
            Covode.recordClassIndex(19534);
        }

        public v() {
            super(2);
        }

        public final Double invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return h.m.p.d(str2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.e$e  reason: collision with other inner class name */
    public static final class C0708e extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, List<? extends String>> {
        static {
            Covode.recordClassIndex(19517);
        }

        public C0708e() {
            super(2);
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(str);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return h.m.p.b(str2, new String[]{","});
                }
            }
            return null;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, List<? extends String>> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(2);
            this.$specificKey = str;
        }

        public final List<? extends String> invoke(Map<?, ?> map, String str) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Object obj = map.get(this.$specificKey);
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    h.f.b.l.a((Object) str3, "");
                    return h.m.p.b(str2, new String[]{str3});
                }
            }
            return null;
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f32736a = new w();

        static {
            Covode.recordClassIndex(19535);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Map<?, ?> map, String str) {
            Map<?, ?> map2 = map;
            h.f.b.l.c(map2, "");
            h.f.b.l.c(str, "");
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    h.f.b.l.a((Object) str3, "");
                    for (T t : h.m.p.b(str2, new String[]{str3})) {
                        if (!h.m.p.a((CharSequence) t)) {
                            return t;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.m<Map<?, ?>, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f32738a = new y();

        static {
            Covode.recordClassIndex(19537);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Map<?, ?> map, String str) {
            Map<?, ?> map2 = map;
            h.f.b.l.c(map2, "");
            h.f.b.l.c(str, "");
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    String str3 = File.separator;
                    h.f.b.l.a((Object) str3, "");
                    List<String> b2 = h.m.p.b(str2, new String[]{str3});
                    ListIterator<String> listIterator = b2.listIterator(b2.size());
                    while (listIterator.hasPrevious()) {
                        String previous = listIterator.previous();
                        if (!h.m.p.a((CharSequence) previous)) {
                            return previous;
                        }
                    }
                    throw new NoSuchElementException("List contains no element matching the predicate.");
                }
            }
            return null;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Double, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19514);
        }

        public b() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Double d2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String valueOf = String.valueOf(d2.doubleValue());
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, String, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19516);
        }

        public d() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            if (str2 != null) {
                h2.put(str, str2);
            }
            return h2;
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Uri, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19520);
        }

        public h() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Uri uri) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, String, Map<Object, Object>> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(3);
            this.$specificKey = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            if (str2 != null) {
                h2.put(this.$specificKey, str2);
            }
            return h2;
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Boolean, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19524);
        }

        public l() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Boolean bool) {
            String str2;
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            h2.put(str, str2);
            return h2;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, String, Map<Object, Object>> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(3);
            this.$specificKey = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            if (str2 != null) {
                h2.put(this.$specificKey, str2);
            }
            return h2;
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Integer, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19529);
        }

        public q() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Integer num) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Long, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19531);
        }

        public s() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Long l2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String valueOf = String.valueOf(l2.longValue());
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, Float, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19533);
        }

        public u() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, Float f2) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String valueOf = String.valueOf(f2.floatValue());
            if (valueOf != null) {
                h2.put(str, valueOf);
            }
            return h2;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {
        static {
            Covode.recordClassIndex(19518);
        }

        public f() {
            super(3);
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String a2 = h.a.n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            if (a2 != null) {
                h2.put(str, a2);
            }
            return h2;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, List<? extends String>, Map<Object, Object>> {
        final /* synthetic */ String $specificKey;

        static {
            Covode.recordClassIndex(19527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(3);
            this.$specificKey = str;
        }

        public final Map<Object, Object> invoke(Map<?, ?> map, String str, List<? extends String> list) {
            h.f.b.l.c(map, "");
            h.f.b.l.c(str, "");
            Map<Object, Object> h2 = ad.h(map);
            String str2 = File.separator;
            h.f.b.l.a((Object) str2, "");
            String a2 = h.a.n.a(list, str2, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            if (a2 != null) {
                h2.put(this.$specificKey, a2);
            }
            return h2;
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f32737a = new x();

        static {
            Covode.recordClassIndex(19536);
        }

        x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            Map<?, ?> map2 = map;
            String str3 = str2;
            h.f.b.l.c(map2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(str3, "");
            Map h2 = ad.h(map2);
            StringBuilder sb = new StringBuilder();
            if ((!h.m.p.a((CharSequence) str3)) && str3 != null) {
                sb.append(File.separator).append(h.m.p.b((CharSequence) str3).toString());
            }
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    String str5 = File.separator;
                    h.f.b.l.a((Object) str5, "");
                    if (!h.m.p.b(str4, str5, false)) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            h2.put("__PATH__", String.valueOf(sb));
            return h2;
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.q<Map<?, ?>, String, String, Map<Object, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f32739a = new z();

        static {
            Covode.recordClassIndex(19538);
        }

        z() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Map<Object, Object> invoke(Map<?, ?> map, String str, String str2) {
            Map<?, ?> map2 = map;
            String str3 = str2;
            h.f.b.l.c(map2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(str3, "");
            Map h2 = ad.h(map2);
            StringBuilder sb = new StringBuilder();
            Object obj = map2.get("__PATH__");
            if (obj != null) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str4 = (String) obj;
                if (str4 != null) {
                    String str5 = File.separator;
                    h.f.b.l.a((Object) str5, "");
                    if (!h.m.p.b(str4, str5, false)) {
                        sb.append(File.separator);
                    }
                    sb.append(str4);
                }
            }
            if ((!h.m.p.a((CharSequence) str3)) && str3 != null) {
                sb.append(File.separator).append(h.m.p.b((CharSequence) str3).toString());
            }
            h2.put("__PATH__", String.valueOf(sb));
            return h2;
        }
    }
}
