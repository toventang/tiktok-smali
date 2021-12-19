package com.ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public abstract class AbsShareBusiness extends BulletBusinessService.Business {

    /* renamed from: j  reason: collision with root package name */
    public static final a f69194j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f69195a;

    /* renamed from: b  reason: collision with root package name */
    public WebSharePackage f69196b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f69197c;

    /* renamed from: d  reason: collision with root package name */
    public String f69198d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69199e;

    /* renamed from: f  reason: collision with root package name */
    public String f69200f;

    /* renamed from: g  reason: collision with root package name */
    public String f69201g;

    /* renamed from: h  reason: collision with root package name */
    public b f69202h = new b();

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.bullet.module.base.e f69203i;

    static {
        Covode.recordClassIndex(42668);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public static final class a {
        static {
            Covode.recordClassIndex(42669);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends com.google.gson.b.a<List<? extends Object>> {
        static {
            Covode.recordClassIndex(42671);
        }

        c() {
        }
    }

    public static final class e extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(42673);
        }

        e() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbsShareBusiness f69205a;

        static {
            Covode.recordClassIndex(42672);
        }

        d(AbsShareBusiness absShareBusiness) {
            this.f69205a = absShareBusiness;
        }

        public final void run() {
            this.f69205a.a();
        }
    }

    public final void b() {
        f.a.a.a.a.a(f.a.a.b.a.f157156a).a(new d(this));
    }

    public final class b {
        static {
            Covode.recordClassIndex(42670);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ JSONException -> 0x004a }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showSource(java.lang.String r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness.b.showSource(java.lang.String, java.lang.String):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsShareBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
        ArrayList a2 = ap.a("copylink", "qrcode", "browser", "refresh");
        l.b(a2, "");
        this.f69197c = a2;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        l.d(str, str6);
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        com.ss.android.ugc.aweme.bullet.module.base.e eVar = this.f69203i;
        if (eVar == null || (str2 = eVar.g()) == null) {
            str2 = str6;
        }
        hashMap.put("previous_page", str2);
        com.ss.android.ugc.aweme.bullet.module.base.e eVar2 = this.f69203i;
        if (eVar2 == null || (str3 = eVar2.h()) == null) {
            str3 = str6;
        }
        hashMap.put("group_id", str3);
        com.ss.android.ugc.aweme.bullet.module.base.e eVar3 = this.f69203i;
        String str7 = null;
        if (eVar3 != null) {
            str4 = eVar3.h();
        } else {
            str4 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str5 = str6;
        } else {
            str5 = UGCMonitor.TYPE_ARTICLE;
        }
        hashMap.put("webview_type", str5);
        WebSharePackage webSharePackage = this.f69196b;
        if (webSharePackage != null) {
            str7 = webSharePackage.f124594h;
        }
        if (TextUtils.isEmpty(str7)) {
            String str8 = this.f69198d;
            if (str8 != null) {
                str6 = str8;
            }
        } else {
            WebSharePackage webSharePackage2 = this.f69196b;
            if (webSharePackage2 == null) {
                l.b();
            }
            str6 = webSharePackage2.f124594h;
        }
        hashMap.put("url", str6);
        r.a("h5_share", hashMap);
    }

    static String a(JSONObject jSONObject, String str) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(str)) == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }
}
