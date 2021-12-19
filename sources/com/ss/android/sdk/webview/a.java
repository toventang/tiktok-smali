package com.ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.a.d;
import com.bytedance.ies.web.a.e;
import com.bytedance.ies.web.a.f;
import com.bytedance.ies.web.a.h;
import com.bytedance.ies.web.jsbridge2.x;
import com.ss.android.common.c.c;
import com.ss.android.sdk.webview.a.a;
import com.ss.android.sdk.webview.a.b;
import com.ss.android.sdk.webview.a.g;
import com.ss.android.sdk.webview.n;
import com.ss.android.ugc.aweme.base.utils.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a implements WeakHandler.IHandler, f, a.AbstractC1308a, b.a, n.a {
    private Handler A = new WeakHandler(this);
    private String B;
    private h C;
    private o D = null;
    private JSONArray E = new JSONArray();

    /* renamed from: a  reason: collision with root package name */
    protected e f60153a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<com.bytedance.ies.uikit.dialog.b> f60154b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<Context> f60155c;

    /* renamed from: d  reason: collision with root package name */
    protected List<String> f60156d;

    /* renamed from: e  reason: collision with root package name */
    protected e f60157e;

    /* renamed from: f  reason: collision with root package name */
    protected List<String> f60158f;

    /* renamed from: g  reason: collision with root package name */
    protected long f60159g;

    /* renamed from: h  reason: collision with root package name */
    protected String f60160h;

    /* renamed from: i  reason: collision with root package name */
    protected int f60161i;

    /* renamed from: j  reason: collision with root package name */
    protected String f60162j;

    /* renamed from: k  reason: collision with root package name */
    protected String f60163k;

    /* renamed from: l  reason: collision with root package name */
    public String f60164l;

    /* renamed from: m  reason: collision with root package name */
    public String f60165m;
    public long n;
    protected String o;
    protected String p;
    protected String q;
    protected String r;
    protected String s;
    protected String t;
    protected String u;
    protected Long v = 0L;
    protected String w = null;
    protected String x = null;
    public Boolean y = true;
    public com.ss.android.sdk.webview.a.e z;

    static {
        Covode.recordClassIndex(37160);
    }

    /* access modifiers changed from: protected */
    public abstract void b(e eVar, c cVar);

    public boolean b() {
        return false;
    }

    @Override // com.bytedance.ies.web.a.f
    public final boolean a(h hVar) {
        return "call".equals(hVar.f35530a) && "config".equals(hVar.f35532c) && !m.a(hVar.f35531b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0026 A[EDGE_INSN: B:49:0x0026->B:15:0x0026 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.a.a(java.lang.String):boolean");
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        com.bytedance.ies.uikit.dialog.b bVar;
        WeakReference<com.bytedance.ies.uikit.dialog.b> weakReference = this.f60154b;
        if (weakReference != null && (bVar = weakReference.get()) != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    public final void d() {
        this.f60155c = null;
        e eVar = this.f60153a;
        if (eVar != null) {
            com.bytedance.ies.web.a.a aVar = eVar.f60185b;
            if (aVar != null) {
                aVar.a();
            }
            x xVar = eVar.f60187d;
            if (xVar != null) {
                xVar.a();
            }
            this.f60153a = null;
        }
        n a2 = n.a();
        if (a2.f60231c != null && !a2.f60231c.isEmpty()) {
            a2.f60231c.remove(this);
        }
        this.f60157e = null;
    }

    public List<String> a() {
        if (this.f60156d == null) {
            this.f60156d = new ArrayList();
        }
        this.f60156d.add("openConfig");
        this.f60156d.add("config");
        this.f60156d.add("appInfo");
        this.f60156d.add("close");
        this.f60156d.add("gallery");
        this.f60156d.add("toggleGalleryBars");
        this.f60156d.add("slideShow");
        this.f60156d.add("relatedShow");
        this.f60156d.add("toast");
        this.f60156d.add("slideDownload");
        this.f60156d.add("requestChangeOrientation");
        this.f60156d.add("adInfo");
        return this.f60156d;
    }

    public final void b(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            reportLocalEvent(str);
        }
    }

    private static boolean c(String str) {
        if (m.a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.sdk.webview.a.a.AbstractC1308a
    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("creative_id", this.r);
                jSONObject.put("ad_id", this.s);
                jSONObject.put("item_id", this.u);
                jSONObject.put("advertiser_id", this.t);
                jSONObject.put("desc", this.w);
                jSONObject.put("view_time", this.v);
                jSONObject.put("cover_url", this.x);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @JavascriptInterface
    public boolean reportLocalEvent(String str) {
        boolean z2 = false;
        if (m.a(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.A.obtainMessage(1);
                obtainMessage.obj = parse;
                this.A.sendMessage(obtainMessage);
                return true;
            } catch (Exception unused) {
                z2 = true;
            }
        } catch (Exception unused2) {
            return z2;
        }
    }

    public a(Context context) {
        this.f60155c = new WeakReference<>(context);
        n a2 = n.a();
        if (a2.f60231c == null) {
            a2.f60231c = new ArrayList();
        }
        if (!a2.f60231c.contains(this)) {
            a2.f60231c.add(this);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j2;
        long parseLong;
        if (message.what == 1) {
            try {
                if (message.obj instanceof Uri) {
                    Uri uri = (Uri) message.obj;
                    if ("log_event".equals(uri.getHost())) {
                        String queryParameter = uri.getQueryParameter("category");
                        String queryParameter2 = uri.getQueryParameter("tag");
                        String queryParameter3 = uri.getQueryParameter("label");
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j2 = 0;
                        }
                        try {
                            parseLong = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        JSONObject jSONObject = null;
                        String queryParameter4 = uri.getQueryParameter("extra");
                        if (!m.a(queryParameter4)) {
                            try {
                                jSONObject = new JSONObject(queryParameter4);
                            } catch (Exception unused3) {
                            }
                        }
                        if (!(queryParameter2 == null || queryParameter3 == null)) {
                            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(queryParameter2, queryParameter3, String.valueOf(j2), "", String.valueOf(parseLong));
                            if (jSONObject != null) {
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    a2.b(next, jSONObject.opt(next));
                                }
                            }
                            a2.c();
                        }
                        if (d.b()) {
                            c.a(this.f60155c.get(), queryParameter, queryParameter2, queryParameter3, j2, parseLong, jSONObject);
                        } else if (d.a()) {
                            if (jSONObject == null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            jSONObject.put("_ad_staging_flag", "1");
                            c.a(this.f60155c.get(), queryParameter, queryParameter2, queryParameter3, j2, parseLong, jSONObject);
                        }
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    @Override // com.ss.android.sdk.webview.a.b.a
    public void a(JSONObject jSONObject) {
        int i2;
        if (!TextUtils.equals(this.o, "1") || TextUtils.isEmpty(this.p)) {
            jSONObject.put("cid", this.f60159g);
            jSONObject.put("group_id", this.n);
            jSONObject.put("ad_type", this.f60161i);
            jSONObject.put("log_extra", this.f60162j);
            jSONObject.put("download_url", this.f60163k);
            jSONObject.put("package_name", this.f60164l);
            jSONObject.put("app_name", this.f60165m);
            if (this.f60159g == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject.put("code", i2);
            jSONObject.put("land_page_data", this.q);
            return;
        }
        JSONObject jSONObject2 = new JSONObject(this.p);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        e eVar = this.f60153a;
        if (eVar != null) {
            eVar.a(str, jSONObject);
        }
    }

    public List<String> a(List<String> list, boolean z2) {
        if (this.f60158f == null) {
            this.f60158f = new ArrayList();
        }
        return this.f60158f;
    }

    public final void a(e eVar, c cVar) {
        this.f60153a = eVar;
        if (eVar != null) {
            this.z = new com.ss.android.sdk.webview.a.e(eVar.f60185b, this.f60155c);
            eVar.a("isAppInstalled", new com.ss.android.sdk.webview.a.c(this.f60155c)).a("open", new g(this.f60155c)).a("login", this.z).a("copyToClipboard", new com.ss.android.sdk.webview.a.d(this.f60155c)).a("adInfo", new b(this)).a("getAdInfoFromAweme", new com.ss.android.sdk.webview.a.a(this));
            b(this.f60153a, cVar);
        }
    }

    @Override // com.ss.android.sdk.webview.n.a
    public final void a(String str, o oVar, String str2) {
        String str3;
        int i2;
        List<String> list;
        WebView webView;
        if (str != null && str.equals(this.B) && this.C != null) {
            e eVar = this.f60153a;
            if (eVar == null || (webView = eVar.f60192i) == null) {
                str3 = null;
            } else {
                str3 = webView.getUrl();
            }
            if (!m.a(str3) && c(str3)) {
                try {
                    String host = Uri.parse(str3).getHost();
                    if (host != null && host.equals(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        if (oVar != null) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("code", i2);
                        if (oVar != null) {
                            list = oVar.f60243e;
                        } else {
                            list = null;
                        }
                        e eVar2 = this.f60157e;
                        if (eVar2 != null) {
                            eVar2.a(list, this.C, jSONObject);
                        }
                        this.D = oVar;
                        this.B = null;
                        this.C = null;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r9 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        if ((r18 - r9.f60242d) < 1200000) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f5, code lost:
        if (r17 != false) goto L_0x00f7;
     */
    @Override // com.bytedance.ies.web.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.web.a.h r21, org.json.JSONObject r22, java.lang.String r23, com.bytedance.ies.web.a.e r24) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.webview.a.a(com.bytedance.ies.web.a.h, org.json.JSONObject, java.lang.String, com.bytedance.ies.web.a.e):void");
    }

    public final void a(String str, String str2, String str3, String str4, String str5, long j2, String str6) {
        this.r = str;
        this.s = str2;
        this.u = str3;
        this.t = str4;
        this.w = str5;
        this.v = Long.valueOf(j2);
        this.x = str6;
    }

    public final void a(long j2, String str, int i2, String str2, String str3, String str4, String str5, String str6) {
        this.f60159g = j2;
        this.f60160h = str;
        this.f60161i = i2;
        this.f60162j = str2;
        this.f60163k = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
    }
}
