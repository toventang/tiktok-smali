package com.ss.android.ugc.aweme.deeplink.d;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.newmedia.d.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.UUID;

public final class c {

    /* renamed from: a */
    public static long f79471a;

    /* renamed from: b */
    public static long f79472b;

    /* renamed from: c */
    public static boolean f79473c;

    /* renamed from: d */
    public static String f79474d;

    /* renamed from: e */
    public static String f79475e;

    /* renamed from: f */
    public static String f79476f = "old";

    /* renamed from: g */
    public static String f79477g = "normal_deeplink";

    /* renamed from: h */
    public static boolean f79478h;

    /* renamed from: i */
    public static boolean f79479i;

    /* renamed from: j */
    public static final c f79480j = new c();

    /* renamed from: k */
    private static long f79481k;

    /* renamed from: l */
    private static long f79482l;

    /* renamed from: m */
    private static HashMap<String, Long> f79483m = new HashMap<>();
    private static String n = "";

    private c() {
    }

    static {
        Covode.recordClassIndex(49375);
    }

    public static boolean a() {
        if (l.a((Object) f79477g, (Object) "normal_deeplink") || l.a((Object) f79477g, (Object) "semantic")) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        l.d(str, "");
        f79477g = str;
    }

    public static final void d(String str) {
        l.d(str, "");
        f79475e = str;
    }

    private static boolean b(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("shortlink", str)) {
            return true;
        }
        return false;
    }

    public static final void c(String str) {
        l.d(str, "");
        f79483m.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private static void b(Intent intent) {
        l.d(intent, "");
        boolean equals = TextUtils.equals(b(intent, "dl_from"), "af");
        String str = "facebook";
        boolean equals2 = TextUtils.equals(b(intent, "dl_from"), str);
        boolean b2 = b.b(intent, "is_from_self");
        boolean b3 = b.b(intent, "from_notification");
        if (equals) {
            str = "appsflyer";
        } else if (!equals2) {
            if (b3) {
                str = "push";
            } else if (b2) {
                str = "self";
            } else {
                str = "other";
            }
        }
        f79474d = str;
    }

    private static String c(Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("params_url");
            if (!TextUtils.isEmpty(queryParameter)) {
                String queryParameter2 = Uri.parse(queryParameter).getQueryParameter("utm_source");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    return queryParameter2;
                }
            }
        }
        return null;
    }

    private static final void d(Uri uri) {
        if (uri != null) {
            UgCommonServiceImpl.j().h().a(uri, a(), f79472b - f79471a, f79473c);
        }
        f79474d = null;
        f79475e = null;
        f79481k = 0;
        f79482l = 0;
        f79477g = "normal_deeplink";
        f79471a = 0;
        f79472b = 0;
        f79478h = false;
        f79479i = false;
        f79483m.clear();
    }

    public static final void a(Intent intent) {
        String str;
        String str2;
        l.d(intent, "");
        Uri data = intent.getData();
        if (!b(data) && !intent.getBooleanExtra("is_short_link", false)) {
            f79481k = System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            n = uuid;
            if (data == null || (str = data.getQueryParameter("sharer_biz")) == null) {
                str = "";
            }
            l.b(str, "");
            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
            if (data != null) {
                str2 = data.toString();
            } else {
                str2 = null;
            }
            r.a("deep_link_start", cVar.a("url", str2).a(StringSet.type, f79474d).a("startTime", Long.valueOf(f79481k)).a("linkVersion", f79476f).a("event_id", n).a("sharer_biz", str).a());
        }
    }

    public static final void b(String str) {
        l.d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        Long l2 = f79483m.get(str);
        if (l2 == null) {
            l2 = 0L;
        }
        l.b(l2, "");
        r.a("deep_link_node_info", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, f79474d).a("enter_to", f79475e).a("node_name", str).a("cost_time", Long.valueOf(currentTimeMillis - l2.longValue())).a("link_version", f79476f).a());
    }

    private static void a(Uri uri) {
        if (uri != null) {
            String a2 = l.a(uri.getHost(), (Object) uri.getPath());
            if (p.b(a2, "user/homepage", false)) {
                a2 = "mine";
            } else if (p.b(a2, "discovery", false)) {
                a2 = "discovery";
            } else if (p.b(a2, "user/find_friends", false)) {
                a2 = "friends";
            } else if (p.b(a2, "profile", false)) {
                a2 = "others_homepage";
            } else if (p.b(a2, "detail", false) || p.b(a2, "item", false)) {
                a2 = "detail";
            } else if (p.b(a2, "live", false)) {
                a2 = "live";
            } else if (p.b(a2, "notification", false)) {
                a2 = "notification";
            } else if (p.b(a2, "challenge/detail", false)) {
                a2 = "challenge_detail";
            } else if (p.b(a2, "music/detail", false)) {
                a2 = "music_detail";
            } else if (p.b(a2, "webview", false)) {
                a2 = "webview";
            } else if (p.b(a2, "messages/group", false)) {
                a2 = "message_group";
            }
            f79475e = a2;
        }
    }

    private static String b(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void a(Intent intent, String str) {
        l.d(intent, "");
        l.d(str, "");
        b(intent);
        a(intent.getData());
        f79476f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r5.length() == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        if (r5 != null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r12, int r13, android.net.Uri r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.d.c.a(java.lang.String, int, android.net.Uri, java.lang.String):void");
    }
}
