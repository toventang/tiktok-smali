package com.ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.c.c.ap;
import com.google.gson.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public abstract class AbsShareBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public WebSharePackage f78594a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f78595b = ap.a("copylink", "qrcode", "browser", "refresh");

    /* renamed from: c  reason: collision with root package name */
    List<Object> f78596c;

    /* renamed from: d  reason: collision with root package name */
    public String f78597d = this.f78617k.f78741a.f78730c;

    /* renamed from: e  reason: collision with root package name */
    String f78598e;

    /* renamed from: f  reason: collision with root package name */
    String f78599f;

    /* renamed from: g  reason: collision with root package name */
    public a f78600g;

    /* renamed from: h  reason: collision with root package name */
    public WebView f78601h;

    static {
        Covode.recordClassIndex(48803);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return this.f78615i.h();
    }

    public final void c() {
        f.a.a.a.a.a(f.a.a.b.a.f157156a).a(new b(this));
    }

    public final class a {
        static {
            Covode.recordClassIndex(48806);
        }

        private a() {
        }

        public /* synthetic */ a(AbsShareBusiness absShareBusiness, byte b2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ JSONException -> 0x0041 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showSource(java.lang.String r7, java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.a.showSource(java.lang.String, java.lang.String):void");
        }
    }

    AbsShareBusiness(e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean b(String str) {
        if (!str.contains("__SEGMENTATION__")) {
            return null;
        }
        try {
            String[] split = URLDecoder.decode(str, "UTF-8").split("__SEGMENTATION__");
            this.f78600g.showSource(split[1], split[2]);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        hashMap.put("previous_page", this.f78617k.f78741a.f78733f);
        String str4 = "";
        if (TextUtils.isEmpty(this.f78617k.f78741a.f78732e)) {
            str2 = str4;
        } else {
            str2 = this.f78617k.f78741a.f78732e;
        }
        hashMap.put("group_id", str2);
        if (!TextUtils.isEmpty(this.f78617k.f78741a.f78732e)) {
            str4 = UGCMonitor.TYPE_ARTICLE;
        }
        hashMap.put("webview_type", str4);
        WebSharePackage webSharePackage = this.f78594a;
        if (webSharePackage == null || TextUtils.isEmpty(webSharePackage.f124594h)) {
            str3 = this.f78597d;
        } else {
            str3 = this.f78594a.f124594h;
        }
        hashMap.put("url", str3);
        r.a("h5_share", hashMap);
    }

    private static String a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }

    public final void a(String str, JSONObject jSONObject) {
        Collection<? extends String> collection;
        boolean z = this.f78615i instanceof m;
        this.f78594a = WebSharePackage.a.a(this.f78618l, str, jSONObject, this.f78597d, "");
        String a2 = a(jSONObject, "qrcode");
        this.f78599f = a(jSONObject, "sharetips");
        this.f78596c = (List) new f().a(a(jSONObject, "aweme:shareChannels"), new com.google.gson.b.a<List<Object>>() {
            /* class com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48804);
            }
        }.type);
        if (TextUtils.isEmpty(a2) || (!TextUtils.equals("1", a2) && !TextUtils.equals(a2, "true"))) {
            this.f78595b.remove("qrcode");
        }
        this.f78598e = a(jSONObject, "innerUrl");
        String str2 = this.f78594a.f124594h;
        if (!TextUtils.isEmpty(this.f78598e)) {
            str2 = this.f78598e;
        } else if (!TextUtils.isEmpty(this.f78597d)) {
            str2 = this.f78597d;
        }
        if (!TextUtils.equals(str2, this.f78594a.f124594h)) {
            this.f78594a.f124595i.putString("url_for_im_share", str2);
        }
        String a3 = a(jSONObject, "shareitems");
        if (!(a3 == null || (collection = (Collection) new f().a(a3, new com.google.gson.b.a<List<String>>() {
            /* class com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.AnonymousClass2 */

            static {
                Covode.recordClassIndex(48805);
            }
        }.type)) == null)) {
            this.f78595b.clear();
            this.f78595b.addAll(collection);
        }
        c();
    }
}
