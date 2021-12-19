package com.bytedance.ies.bullet.service.f.a.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

public final class g {
    static {
        Covode.recordClassIndex(19540);
    }

    public static final class q extends h.f.b.m implements h.f.a.m<Uri, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f32740a = new q();

        static {
            Covode.recordClassIndex(19557);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            h.f.b.l.c(uri2, "");
            h.f.b.l.c(str, "");
            return uri2.getAuthority();
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.m<Uri, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f32742a = new s();

        static {
            Covode.recordClassIndex(19559);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            h.f.b.l.c(uri2, "");
            h.f.b.l.c(str, "");
            return uri2.getPath();
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.m<Uri, String, List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f32744a = new u();

        static {
            Covode.recordClassIndex(19561);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ List<String> invoke(Uri uri, String str) {
            Uri uri2 = uri;
            h.f.b.l.c(uri2, "");
            h.f.b.l.c(str, "");
            return uri2.getPathSegments();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.m<Uri, String, Boolean> {
        static {
            Covode.recordClassIndex(19541);
        }

        public a() {
            super(2);
        }

        public final Boolean invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return Boolean.valueOf(h.f.b.l.a((Object) a2, (Object) "1"));
            }
            return null;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.m<Uri, String, String> {
        static {
            Covode.recordClassIndex(19543);
        }

        public c() {
            super(2);
        }

        public final String invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return a2;
            }
            return null;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.m<Uri, String, List<? extends String>> {
        static {
            Covode.recordClassIndex(19545);
        }

        public e() {
            super(2);
        }

        public final List<? extends String> invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return h.m.p.b(a2, new String[]{","});
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.g$g  reason: collision with other inner class name */
    public static final class C0709g extends h.f.b.m implements h.f.a.m<Uri, String, Uri> {
        static {
            Covode.recordClassIndex(19547);
        }

        public C0709g() {
            super(2);
        }

        public final Uri invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return Uri.parse(a2);
            }
            return null;
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.m<Uri, String, Integer> {
        static {
            Covode.recordClassIndex(19550);
        }

        public j() {
            super(2);
        }

        public final Integer invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return h.m.p.e(a2);
            }
            return null;
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.m<Uri, String, Long> {
        static {
            Covode.recordClassIndex(19552);
        }

        public l() {
            super(2);
        }

        public final Long invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return h.m.p.g(a2);
            }
            return null;
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.m<Uri, String, Float> {
        static {
            Covode.recordClassIndex(19554);
        }

        public n() {
            super(2);
        }

        public final Float invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return h.m.p.c(a2);
            }
            return null;
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.m<Uri, String, Double> {
        static {
            Covode.recordClassIndex(19556);
        }

        public p() {
            super(2);
        }

        public final Double invoke(Uri uri, String str) {
            h.f.b.l.c(uri, "");
            h.f.b.l.c(str, "");
            String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, str);
            if (a2 != null) {
                return h.m.p.d(a2);
            }
            return null;
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.m<Uri, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f32746a = new w();

        static {
            Covode.recordClassIndex(19563);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            h.f.b.l.c(uri2, "");
            h.f.b.l.c(str, "");
            List<String> pathSegments = uri2.getPathSegments();
            if (pathSegments != null) {
                return h.a.n.h((List) pathSegments);
            }
            return null;
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.m<Uri, String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f32748a = new y();

        static {
            Covode.recordClassIndex(19565);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(Uri uri, String str) {
            Uri uri2 = uri;
            h.f.b.l.c(uri2, "");
            h.f.b.l.c(str, "");
            List<String> pathSegments = uri2.getPathSegments();
            if (pathSegments != null) {
                return h.a.n.j((List) pathSegments);
            }
            return null;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.q<Uri.Builder, String, String, Uri.Builder> {
        static {
            Covode.recordClassIndex(19544);
        }

        public d() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String str3 = str2;
            if (str3 != null) {
                builder.appendQueryParameter(str, str3);
            }
            return builder;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Double, Uri.Builder> {
        static {
            Covode.recordClassIndex(19542);
        }

        public b() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Double d2) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(d2.doubleValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.q<Uri.Builder, String, List<? extends String>, Uri.Builder> {
        static {
            Covode.recordClassIndex(19546);
        }

        public f() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, List<? extends String> list) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String a2 = h.a.n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            if (a2 != null) {
                builder.appendQueryParameter(str, a2);
            }
            return builder;
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Uri, Uri.Builder> {
        static {
            Covode.recordClassIndex(19548);
        }

        public h() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Uri uri) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(uri);
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Boolean, Uri.Builder> {
        static {
            Covode.recordClassIndex(19549);
        }

        public i() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Boolean bool) {
            String str2;
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            builder.appendQueryParameter(str, str2);
            return builder;
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Integer, Uri.Builder> {
        static {
            Covode.recordClassIndex(19551);
        }

        public k() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Integer num) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(num.intValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Long, Uri.Builder> {
        static {
            Covode.recordClassIndex(19553);
        }

        public m() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Long l2) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(l2.longValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.q<Uri.Builder, String, Float, Uri.Builder> {
        static {
            Covode.recordClassIndex(19555);
        }

        public o() {
            super(3);
        }

        public final Uri.Builder invoke(Uri.Builder builder, String str, Float f2) {
            h.f.b.l.c(builder, "");
            h.f.b.l.c(str, "");
            String valueOf = String.valueOf(f2.floatValue());
            if (valueOf != null) {
                builder.appendQueryParameter(str, valueOf);
            }
            return builder;
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f32741a = new r();

        static {
            Covode.recordClassIndex(19558);
        }

        r() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            h.f.b.l.c(builder2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(str3, "");
            builder2.authority(str3);
            return builder2;
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f32743a = new t();

        static {
            Covode.recordClassIndex(19560);
        }

        t() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            h.f.b.l.c(builder2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(str3, "");
            builder2.path(str3);
            return builder2;
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f32749a = new z();

        static {
            Covode.recordClassIndex(19566);
        }

        z() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, String str2) {
            Uri.Builder builder2 = builder;
            String str3 = str2;
            h.f.b.l.c(builder2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(str3, "");
            builder2.appendPath(str3);
            return builder2;
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.q<Uri.Builder, String, List<? extends String>, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f32745a = new v();

        static {
            Covode.recordClassIndex(19562);
        }

        v() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Uri.Builder invoke(Uri.Builder builder, String str, List<? extends String> list) {
            Uri.Builder builder2 = builder;
            List<? extends String> list2 = list;
            h.f.b.l.c(builder2, "");
            h.f.b.l.c(str, "");
            h.f.b.l.c(list2, "");
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                builder2.appendPath(it.next());
            }
            return builder2;
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.q<Uri.Builder, String, String, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f32747a = new x();

        static {
            Covode.recordClassIndex(19564);
        }

        x() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r1 != null) goto L_0x0028;
         */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ android.net.Uri.Builder invoke(android.net.Uri.Builder r7, java.lang.String r8, java.lang.String r9) {
            /*
                r6 = this;
                android.net.Uri$Builder r7 = (android.net.Uri.Builder) r7
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r5 = ""
                h.f.b.l.c(r7, r5)
                h.f.b.l.c(r8, r5)
                h.f.b.l.c(r9, r5)
                android.net.Uri r0 = r7.build()
                r4 = 1
                r3 = 0
                r2 = 0
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r0.getPath()
                if (r1 == 0) goto L_0x0027
                h.f.b.l.a(r1, r5)
                int r0 = r1.length()
                if (r0 != 0) goto L_0x0038
            L_0x0027:
                r1 = r2
            L_0x0028:
                r7.path(r9)
                if (r1 == 0) goto L_0x0033
                int r0 = r1.length()
                if (r0 != 0) goto L_0x0034
            L_0x0033:
                return r7
            L_0x0034:
                r7.appendPath(r1)
                goto L_0x0033
            L_0x0038:
                h.f.b.l.a(r1, r5)
                java.lang.String r0 = "/"
                boolean r0 = h.m.p.b(r1, r0, r3)
                if (r0 == 0) goto L_0x0027
                h.f.b.l.a(r1, r5)
                int r0 = r1.length()
                h.j.g r0 = h.j.h.a(r4, r0)
                java.lang.String r1 = h.m.p.a(r1, r0)
                if (r1 == 0) goto L_0x0027
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.f.a.c.g.x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
