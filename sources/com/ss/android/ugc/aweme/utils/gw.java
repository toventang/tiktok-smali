package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.o;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.json.JSONObject;

public class gw {

    /* renamed from: a  reason: collision with root package name */
    public static final String f143035a = "RELEASE";

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f143036b = {"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "from_user_id", "push_user_id", "share_user_id", "star_uid"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f143037e = {"com.tellh.me.ele.", "com.ixigua.", "com.ss.", "com.bytedance."};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f143038f = {"com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "com.ss.android.ugc.aweme.live.LiveDummyActivity"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f143039g = {"com.bytedance.ies.web.jsbridge", "com.ss.android.ugc.aweme.bullet", "com.ss.android.ugc.aweme.crossplatform", "com.ss.android.ugc.aweme.web.jsbridge", "com.ss.android.ugc.aweme.fe.method", "com.bytedance.android.live.browser.jsbridge"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f143040h = {"/api/ad/splash"};

    /* renamed from: i  reason: collision with root package name */
    private static volatile gw f143041i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f143042j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f143043k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f143044l;

    /* renamed from: c  reason: collision with root package name */
    public boolean f143045c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f143046d;

    /* renamed from: m  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f143047m = new ConcurrentHashMap<>();
    private final LinkedList<String> n;
    private String o;
    private Keva p;

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str) && !TextUtils.equals("-1", str) && !TextUtils.isEmpty(str2)) {
            this.f143047m.put(str, str2);
        }
    }

    public static boolean b() {
        if (f143042j || f143043k || f143044l) {
            return true;
        }
        return false;
    }

    public static gw a() {
        MethodCollector.i(577);
        if (f143041i == null) {
            synchronized (gw.class) {
                try {
                    if (f143041i == null) {
                        f143041i = new gw();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(577);
                    throw th;
                }
            }
        }
        gw gwVar = f143041i;
        MethodCollector.o(577);
        return gwVar;
    }

    static {
        Covode.recordClassIndex(93612);
    }

    private gw() {
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        LinkedList<String> linkedList;
        String str = d.s;
        if (TextUtils.isEmpty(str)) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("local_test");
        }
        f143043k = equalsIgnoreCase;
        String str2 = d.s;
        if (TextUtils.isEmpty(str2)) {
            equalsIgnoreCase2 = false;
        } else {
            equalsIgnoreCase2 = str2.equalsIgnoreCase("lark_inhouse");
        }
        f143044l = equalsIgnoreCase2;
        f143042j = false;
        Keva repo = Keva.getRepo("aweme_network");
        this.p = repo;
        this.f143045c = repo.getBoolean("strict_mode", f143042j);
        this.f143046d = this.p.getBoolean("request_with_compile_mode", f143042j);
        this.o = this.p.getString("lastInputEmailPrefix", "");
        if (b()) {
            linkedList = new LinkedList<>();
        } else {
            linkedList = null;
        }
        this.n = linkedList;
    }

    public static void a(HttpUrl httpUrl) {
        if (httpUrl != null && !b()) {
            try {
                a(httpUrl.encodedPath(), false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean d(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        if (!this.f143045c || str.contains("passport")) {
            return false;
        }
        return true;
    }

    public final String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("0", str) || TextUtils.equals("-1", str)) {
            return null;
        }
        return this.f143047m.get(str);
    }

    public final void a(Uri uri) {
        if (uri != null) {
            String str = "";
            try {
                str = URLDecoder.decode(uri.toString(), "UTF-8");
            } catch (Exception e2) {
                e2.printStackTrace();
            } finally {
                a(str);
            }
        }
    }

    public final void a(String str) {
        if (this.n != null && !TextUtils.isEmpty(str)) {
            if (this.n.size() == 6) {
                this.n.pollLast();
            }
            this.n.offerFirst(str);
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null && jSONObject.length() > 0) {
            try {
                String[] strArr = f143036b;
                for (String str2 : strArr) {
                    String optString = jSONObject.optString(str2);
                    String optString2 = jSONObject.optString("sec_".concat(String.valueOf(str2)));
                    if (!d(optString) && d(optString2)) {
                        a(str, b());
                        return;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("pages", m.a());
        if (z) {
            jSONObject.put("backtrace", m.a(f143037e));
        }
        o.a("log_miss_sec_uid", jSONObject);
    }

    public static void a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            try {
                a(str, b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
