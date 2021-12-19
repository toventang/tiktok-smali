package com.ss.android.ugc.aweme.ug.praise;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ug.praise.b;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f141955a;

    /* renamed from: b  reason: collision with root package name */
    public C3779a f141956b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f141957c;

    /* renamed from: d  reason: collision with root package name */
    private final b.EnumC3781b f141958d;

    static {
        Covode.recordClassIndex(92757);
    }

    public abstract C3779a b();

    public abstract void c();

    public final C3779a a() {
        C3779a aVar = this.f141956b;
        if (aVar == null) {
            l.a("dialogContent");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        r.a(str, new d().a("rating_window_type", this.f141958d.getValue()).f66730a);
    }

    static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public a(Context context, b.EnumC3781b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        this.f141957c = context;
        this.f141958d = bVar;
        this.f141955a = new c(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.a$a  reason: collision with other inner class name */
    public static final class C3779a {

        /* renamed from: a  reason: collision with root package name */
        public final String f141959a;

        /* renamed from: b  reason: collision with root package name */
        public final String f141960b;

        /* renamed from: c  reason: collision with root package name */
        public final String f141961c;

        /* renamed from: d  reason: collision with root package name */
        public final String f141962d;

        /* renamed from: e  reason: collision with root package name */
        public final String f141963e;

        static {
            Covode.recordClassIndex(92758);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3779a)) {
                return false;
            }
            C3779a aVar = (C3779a) obj;
            return l.a(this.f141959a, aVar.f141959a) && l.a(this.f141960b, aVar.f141960b) && l.a(this.f141961c, aVar.f141961c) && l.a(this.f141962d, aVar.f141962d) && l.a(this.f141963e, aVar.f141963e);
        }

        public final int hashCode() {
            String str = this.f141959a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f141960b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f141961c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f141962d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f141963e;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "DialogContent(title=" + this.f141959a + ", content=" + this.f141960b + ", feedbackStr=" + this.f141961c + ", positiveBtn=" + this.f141962d + ", packageName=" + this.f141963e + ")";
        }

        public C3779a(String str, String str2, String str3, String str4, String str5) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(str5, "");
            this.f141959a = str;
            this.f141960b = str2;
            this.f141961c = str3;
            this.f141962d = str4;
            this.f141963e = str5;
        }
    }
}
