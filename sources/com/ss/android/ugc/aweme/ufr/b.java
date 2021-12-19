package com.ss.android.ugc.aweme.ufr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141656a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92575);
    }

    static final class a<T> implements w<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141657a = new a();

        static {
            Covode.recordClassIndex(92576);
        }

        a() {
        }

        @Override // f.a.w
        public final void subscribe(v<d> vVar) {
            l.c(vVar, "");
            vVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ufr.b$b  reason: collision with other inner class name */
    public static final class C3766b<T> implements w<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3766b f141658a = new C3766b();

        static {
            Covode.recordClassIndex(92577);
        }

        C3766b() {
        }

        @Override // f.a.w
        public final void subscribe(v<d> vVar) {
            l.c(vVar, "");
            vVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements w<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141659a = new c();

        static {
            Covode.recordClassIndex(92578);
        }

        c() {
        }

        @Override // f.a.w
        public final void subscribe(v<d> vVar) {
            l.c(vVar, "");
            vVar.a();
        }
    }

    public static t<d> b(Context context, Class<? extends a> cls, String str, String str2, String str3) {
        l.c(context, "");
        l.c(cls, "");
        l.c(str2, "");
        l.c(str3, "");
        if (TextUtils.isEmpty(str)) {
            t<d> a2 = t.a(a.f141657a);
            l.a((Object) a2, "");
            return a2;
        }
        if (str == null) {
            l.a();
        }
        return h.a(context, cls, str, str2, str3);
    }

    public static t<d> a(Context context, Class<? extends a> cls, String str, String str2, String str3, boolean z) {
        l.c(context, "");
        l.c(cls, "");
        l.c(str2, "");
        l.c(str3, "");
        if (TextUtils.isEmpty(str)) {
            t<d> a2 = t.a(c.f141659a);
            l.a((Object) a2, "");
            return a2;
        }
        h hVar = new h();
        if (str == null) {
            l.a();
        }
        return hVar.a(context, cls, str, str2, str3, true, true, z, null);
    }

    public static t<d> a(Context context, Class<? extends a> cls, String str, String str2, String str3, boolean z, boolean z2, Map<String, String> map) {
        l.c(context, "");
        l.c(cls, "");
        l.c(str2, "");
        l.c(str3, "");
        if (TextUtils.isEmpty(str)) {
            t<d> a2 = t.a(C3766b.f141658a);
            l.a((Object) a2, "");
            return a2;
        }
        h hVar = new h();
        if (str == null) {
            l.a();
        }
        return hVar.a(context, cls, str, str2, str3, z, false, z2, map);
    }
}
