package com.ss.android.ugc.aweme.bullet.utils;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.af;
import com.bytedance.ies.bullet.service.base.ai;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.z;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f69544a = new c();

    public static final class b implements z {
        static {
            Covode.recordClassIndex(42891);
        }

        b() {
        }

        @Override // com.bytedance.ies.bullet.service.base.g
        public final Uri a(Uri uri, Bundle bundle) {
            l.d(uri, "");
            l.d(bundle, "");
            IBulletService f2 = BulletService.f();
            String uri2 = uri.toString();
            l.b(uri2, "");
            Uri parse = Uri.parse(f2.b(uri2));
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Boolean> rnFallback = inst.getRnFallback();
            l.b(rnFallback, "");
            Boolean c2 = rnFallback.c();
            l.b(c2, "");
            if (c2.booleanValue()) {
                Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
                l.b(build, "");
                return build;
            }
            l.b(parse, "");
            return parse;
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(42889);
    }

    public static final class a implements ai {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.api.a f69545a;

        static {
            Covode.recordClassIndex(42890);
        }

        a(com.ss.android.ugc.aweme.bullet.api.a aVar) {
            this.f69545a = aVar;
        }

        @Override // com.bytedance.ies.bullet.service.base.g
        public final Uri a(Uri uri, Bundle bundle) {
            Uri a2;
            l.d(uri, "");
            l.d(bundle, "");
            IBulletService f2 = BulletService.f();
            String uri2 = uri.toString();
            l.b(uri2, "");
            String b2 = f2.b(uri2);
            com.ss.android.ugc.aweme.bullet.api.a aVar = this.f69545a;
            if (aVar != null && (a2 = aVar.a(b2, bundle)) != null) {
                return a2;
            }
            Uri parse = Uri.parse(b2);
            l.b(parse, "");
            return parse;
        }
    }

    public static final Uri a(String str) {
        l.d(str, "");
        return a(str, null);
    }

    public static final String b(String str) {
        if (str == null) {
            return "";
        }
        return String.valueOf(a(Uri.parse(str)));
    }

    private static Uri a(Uri uri) {
        if (uri == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        l.b(buildUpon, "");
        if (!TextUtils.isEmpty(uri.getQueryParameter("hybrid_sdk_version"))) {
            return uri;
        }
        if (!TextUtils.isEmpty(null)) {
            buildUpon.appendQueryParameter("package_name", null);
        }
        buildUpon.appendQueryParameter("hybrid_sdk_version", "bullet");
        return buildUpon.build();
    }

    public static final Uri a(String str, String str2) {
        List list;
        l.d(str, "");
        if (str2 != null) {
            list = n.a(str2);
        } else {
            list = null;
        }
        return a(str, list, null, null);
    }

    public static final String b(String str, String str2) {
        if (str == null) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null && !TextUtils.isEmpty(parse.getQueryParameter(str2))) {
            Uri.Builder buildUpon = parse.buildUpon();
            l.b(buildUpon, "");
            buildUpon.clearQuery();
            for (String str3 : parse.getQueryParameterNames()) {
                if (!l.a((Object) str3, (Object) str2)) {
                    for (String str4 : parse.getQueryParameters(str3)) {
                        buildUpon.appendQueryParameter(str3, str4);
                    }
                }
            }
            parse = buildUpon.build();
        }
        return String.valueOf(parse);
    }

    public static final Uri a(Uri uri, String str, String str2) {
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        l.b(buildUpon, "");
        buildUpon.clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (!l.a((Object) str3, (Object) str)) {
                for (String str4 : uri.getQueryParameters(str3)) {
                    buildUpon.appendQueryParameter(str3, str4);
                }
            } else {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        return buildUpon.build();
    }

    public static final Uri a(String str, List<String> list, Bundle bundle, com.ss.android.ugc.aweme.bullet.api.a aVar) {
        l.d(str, "");
        af afVar = (af) e.a.a().a(af.class);
        if (afVar != null) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new a(aVar));
            arrayList.add(new b());
            Uri a2 = afVar.a(parse, bundle, list, arrayList);
            if (a2 != null) {
                return a2;
            }
        }
        Uri build = new com.bytedance.ies.bullet.service.f.a.a.a().b().build();
        l.b(build, "");
        return build;
    }
}
