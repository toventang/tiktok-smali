package com.ss.android.ugc.aweme.ug.f;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.deeplink.p;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final b f141835d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static Map<Uri, a> f141836e = new LinkedHashMap();

    private b() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f141837a;

        /* renamed from: b  reason: collision with root package name */
        public final long f141838b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f141839c;

        static {
            Covode.recordClassIndex(92700);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f141837a == aVar.f141837a && this.f141838b == aVar.f141838b && this.f141839c == aVar.f141839c;
        }

        public final String toString() {
            return "DeepLinkMobParams(isLongLink=" + this.f141837a + ", shortToLongDuration=" + this.f141838b + ", isShortToLongEndOnBackground=" + this.f141839c + ")";
        }

        public final int hashCode() {
            boolean z = this.f141837a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            long j2 = this.f141838b;
            int i6 = ((i3 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            if (!this.f141839c) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public a(boolean z, long j2, boolean z2) {
            this.f141837a = z;
            this.f141838b = j2;
            this.f141839c = z2;
        }
    }

    static {
        Covode.recordClassIndex(92699);
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public final void a() {
        r.a("deep_link_short2long_launch", new d().a("is_cold_launch", Boolean.valueOf(this.f141828a)).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public final void b() {
        r.a("launch_log", new d().a("launch_method", "link_direct").a("c_launch_method", "deep_link_short_link_fallback").a("is_cold_launch", c()).a("from_channel", "short_link").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public final void a(boolean z) {
        r.a("deep_link_short2long_success", new d().a("is_cold_launch", Boolean.valueOf(this.f141828a)).a("is_bg", z ? 1 : 0).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.ug.e
    public final void a(Uri uri, boolean z, long j2, boolean z2) {
        l.d(uri, "");
        f141836e.put(uri, new a(z, j2, z2));
    }

    @Override // com.ss.android.ugc.aweme.ug.f.a, com.ss.android.ugc.aweme.ug.e
    public final void a(Uri uri, boolean z, p pVar, boolean z2, long j2, boolean z3) {
        Uri uri2 = uri;
        l.d(uri2, "");
        l.d(pVar, "");
        super.a(uri2, z, pVar, z2, j2, z3);
        a aVar = f141836e.get(uri2);
        if (aVar == null) {
            aVar = new a(z2, j2, z3);
        }
        if (aVar.f141837a) {
            uri2 = uri2;
            com.ss.android.f.b.a(com.bytedance.ies.ugc.appcontext.d.a()).a(a(uri2, z, "deep_link", (p) null, false, false));
        } else {
            com.ss.android.f.b.a(com.bytedance.ies.ugc.appcontext.d.a()).a(a(uri2, z, "deep_link_short_link", pVar, true, aVar.f141839c));
        }
        f141836e.remove(uri2);
    }

    private final Uri a(Uri uri, boolean z, String str, p pVar, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        String queryParameter = uri.getQueryParameter("gd_label");
        if (queryParameter == null || queryParameter.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            queryParameter = uri.getQueryParameter("launch_method");
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "link_direct";
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", queryParameter).appendQueryParameter("c_launch_method", str).appendQueryParameter("is_cold_launch", c()).appendQueryParameter("is_from_noti", String.valueOf(z)).appendQueryParameter("needlaunchlog", "true");
        if (pVar != null) {
            appendQueryParameter.appendQueryParameter("page_source", pVar.f79519b);
            appendQueryParameter.appendQueryParameter("enter_to", pVar.f79520c);
            appendQueryParameter.appendQueryParameter("platform", pVar.f79521d);
            appendQueryParameter.appendQueryParameter("from_user_id", pVar.f79522e);
            if (hk.a(pVar.f79524g)) {
                appendQueryParameter.appendQueryParameter("link_id", pVar.f79524g);
            }
            if (hk.a(pVar.f79525h)) {
                appendQueryParameter.appendQueryParameter("referrer_url", pVar.f79525h);
            }
            if (hk.a(pVar.f79526i)) {
                appendQueryParameter.appendQueryParameter("params_url", pVar.f79526i);
            }
            if (hk.a(pVar.f79523f)) {
                appendQueryParameter.appendQueryParameter("to_user_id", pVar.f79523f);
            }
        }
        if (z2) {
            if (z3) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            appendQueryParameter.appendQueryParameter("c_short_link_is_bg", str2);
        }
        Uri build = appendQueryParameter.build();
        l.b(build, "");
        return build;
    }
}
