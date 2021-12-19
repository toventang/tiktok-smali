package com.ss.android.ugc.aweme.deeplink.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.a.b;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.m;
import com.ss.android.ugc.aweme.deeplink.n;
import com.ss.android.ugc.aweme.deeplink.p;
import com.ss.android.ugc.aweme.deeplink.q;
import com.ss.android.ugc.aweme.deeplink.u;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import h.f.b.l;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1852a f79450a = new C1852a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f79451c;

    static {
        Covode.recordClassIndex(49359);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.c.a$a  reason: collision with other inner class name */
    public static final class C1852a {
        static {
            Covode.recordClassIndex(49360);
        }

        private C1852a() {
        }

        public /* synthetic */ C1852a(byte b2) {
            this();
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean a(d dVar) {
        com.ss.android.ugc.aweme.deeplink.a.a aVar;
        String str;
        Object a2;
        String str2;
        l.d(dVar, "");
        if (!c.f79478h) {
            c.c("AppLinkNode");
        }
        u.a("AppLinkNode");
        Intent intent = dVar.f79466f;
        Uri data = intent.getData();
        if (data == null) {
            c.a("uri_parse", 2001, null, "");
        } else if (TextUtils.equals("http", data.getScheme()) || TextUtils.equals("https", data.getScheme())) {
            Bundle a3 = a(intent);
            if (!(a3 == null || (((a2 = a(a3, "android.intent.extra.REFERRER")) == null || (str2 = a2.toString()) == null) && (str2 = a(intent, "android.intent.extra.REFERRER_NAME")) == null))) {
                dVar.f79463c.h(str2);
            }
            p pVar = dVar.f79463c;
            String uri = data.toString();
            l.b(uri, "");
            pVar.i(uri);
            dVar.f79463c.c("applink");
            try {
                String host = data.getHost();
                String path = data.getPath();
                if (n.a.a(host, path) || q.a.a(data) || n.a.a(data)) {
                    UgCommonServiceImpl.j().h().a();
                    Context applicationContext = dVar.f79464d.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    aVar = new com.ss.android.ugc.aweme.deeplink.a.d(applicationContext, true);
                    c.a("short_to_long");
                    Activity activity = dVar.f79464d;
                    l.d(activity, "");
                    if (!q.a.a() && !z.f105220a.b(activity)) {
                        a(activity, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity));
                        this.f79451c = true;
                    }
                    this.f79452b = true;
                } else if (n.a.b(host, path)) {
                    aVar = new b();
                    if (c.f79479i) {
                        str = "personalize_link";
                    } else if (l.a((Object) c.f79477g, (Object) "short_to_long")) {
                        str = "short_to_semantic";
                    } else {
                        str = "semantic";
                    }
                    c.a(str);
                } else {
                    aVar = new com.ss.android.ugc.aweme.deeplink.a.c();
                }
                Uri a4 = aVar.a(data);
                if (a4 != null || (!(aVar instanceof com.ss.android.ugc.aweme.deeplink.a.c) && (a4 = new com.ss.android.ugc.aweme.deeplink.a.c().a(data)) != null)) {
                    if (!this.f79452b) {
                        l.d(a4, "");
                        dVar.f79465e = a4;
                        dVar.f79463c.a("link_direct");
                        dVar.f79463c.b("google");
                        c.d(a4.getHost() + "/" + a4.getPath());
                    }
                } else if (!in.d()) {
                    Activity activity2 = dVar.f79464d;
                    if (m.f79501a.a(activity2, "from_app_link", true)) {
                        c.a("login", 2005, data, "");
                    } else {
                        c.a("uri_parse", 2003, data, "");
                        String a5 = SecLinkServiceImpl.b().a(data.toString(), "deeplink");
                        if (a5 == null) {
                            a5 = data.toString();
                            l.b(a5, "");
                        }
                        Intent awemeWebIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAwemeWebIntent(activity2, data.buildUpon().appendQueryParameter("url", a5).build(), true, false);
                        if (awemeWebIntent != null) {
                            a(activity2, awemeWebIntent);
                        }
                    }
                }
                if ((!this.f79452b || !q.a.a()) && !this.f79451c) {
                    c.b("AppLinkNode");
                } else {
                    dVar.f79464d.finish();
                    c.f79478h = true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            c.a("uri_parse", 2002, data, "");
        }
        return true;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }
}
