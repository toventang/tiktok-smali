package com.ss.android.ugc.aweme.commercialize.utils.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.aj;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75641a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46652);
    }

    private static Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    private static List<String> a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://"));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        l.b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a$a  reason: collision with other inner class name */
    public static final class C1723a implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f75643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f75644c;

        static {
            Covode.recordClassIndex(46653);
        }

        C1723a(Context context, AwemeRawAd awemeRawAd, String str) {
            this.f75642a = context;
            this.f75643b = awemeRawAd;
            this.f75644c = str;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            if (z) {
                Context context = this.f75642a;
                AwemeRawAd awemeRawAd = this.f75643b;
                String str = this.f75644c;
                if (j.b(context, awemeRawAd)) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    hashMap.put("ad_extra_data", new f().b(hashMap2));
                    j.a(context, "deeplink_success", awemeRawAd, j.a(context, awemeRawAd, false, (Map<String, String>) hashMap));
                    new aj.a().a("draw_ad").a(System.currentTimeMillis() - 5000).a(awemeRawAd).a();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "deeplink_success", this.f75643b).a("url", this.f75644c).c();
                return;
            }
            j.a(this.f75642a, this.f75643b, this.f75644c, "user_canceled");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "deeplink_failed", this.f75643b).a("url", this.f75644c).a("fail_reason", "user_canceled").c();
        }
    }

    public static final boolean c(Context context, Uri uri) {
        if (context == null || uri == null || !w.a(uri) || h.a.n.c((Iterable) e(context, uri), (Iterable) a(context)).isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean d(Context context, Uri uri) {
        if (context == null || uri == null || w.a(uri) || e(context, uri).isEmpty()) {
            return false;
        }
        return true;
    }

    private static List<String> e(Context context, Uri uri) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(a(uri), 65536);
        l.b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    public static final boolean b(Context context, Uri uri) {
        if (context == null || uri == null || !d(context, uri)) {
            return false;
        }
        Intent a2 = a(uri);
        List<String> e2 = e(context, uri);
        if ((!e2.isEmpty()) && e2 != null) {
            a2.setPackage((String) h.a.n.k(e2).get(0));
            a2.addFlags(268435456);
            return w.a(context, a2);
        }
        return false;
    }

    public static final boolean a(Context context, Uri uri) {
        if (context == null || uri == null || !c(context, uri)) {
            return false;
        }
        Intent a2 = a(uri);
        Set c2 = h.a.n.c((Iterable) e(context, uri), (Iterable) a(context));
        if ((!c2.isEmpty()) && c2 != null) {
            a2.setPackage((String) h.a.n.k(c2).get(0));
            a2.addFlags(268435456);
            return w.a(context, a2);
        }
        return false;
    }

    public static final void a(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        l.d(context, "");
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        a(context, awemeRawAd, str);
    }

    public static final void b(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        l.d(context, "");
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        b(context, awemeRawAd, str);
    }

    public static final void a(Context context, AwemeRawAd awemeRawAd, String str) {
        l.d(context, "");
        j.a(context, awemeRawAd, str);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", awemeRawAd).a("url", str).c();
        j.b(context, awemeRawAd, str);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "deeplink_failed", awemeRawAd).a("url", str).a("fail_reason", "app_uninstalled").c();
    }

    public static final void b(Context context, AwemeRawAd awemeRawAd, String str) {
        l.d(context, "");
        j.a(context, awemeRawAd, str);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "open_url_app", awemeRawAd).a("url", str).c();
        w.a(new C1723a(context, awemeRawAd, str));
    }

    public static final void c(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        l.d(context, "");
        AwemeRawAd awemeRawAd2 = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        j.a(context, awemeRawAd, str, "allowlist_not_found");
        if (aweme != null) {
            awemeRawAd2 = aweme.getAwemeRawAd();
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "deeplink_failed", awemeRawAd2).a("url", str).a("fail_reason", "allowlist_not_found").c();
    }
}
