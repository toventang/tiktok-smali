package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class ShareSearchMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69175b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69176c = "shareSearch";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69177d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(42657);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69177d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69176c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69177d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareSearchMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        int i2;
        WebView n;
        String str = "";
        l.d(jSONObject, str);
        l.d(aVar, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        WeakReference weakReference = new WeakReference(e());
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 != null) {
            if (!(g2 instanceof c)) {
                g2 = null;
            }
            c cVar = (c) g2;
            if (!(cVar == null || (n = cVar.n()) == null)) {
                n.getUrl();
            }
        }
        boolean z = false;
        if (jSONObject != null) {
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("image");
            String optString4 = jSONObject.optString("url");
            String optString5 = jSONObject.optString("schema");
            String optString6 = jSONObject.optString("track_info");
            l.b(optString, str);
            l.b(optString2, str);
            l.b(optString3, str);
            l.b(optString4, str);
            l.b(optString5, str);
            l.b(optString6, str);
            com.ss.android.ugc.aweme.web.c.a.a aVar2 = new com.ss.android.ugc.aweme.web.c.a.a(optString, optString2, optString3, optString4, optString5, optString6);
            Context context = (Context) weakReference.get();
            if (context != null) {
                l.b(context, str);
                Activity a2 = o.a(context);
                if (a2 != null) {
                    l.d(a2, str);
                    l.d(aVar2, str);
                    String str2 = aVar2.f144900f;
                    l.d(a2, str);
                    l.d(aVar2, str);
                    SharePackage.a d2 = new SharePackage.a().a("search").b("search").c(aVar2.f144895a).d(aVar2.f144896b);
                    String c2 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(aVar2.f144898d));
                    if (c2 != null) {
                        str = c2;
                    }
                    SearchSharePackage searchSharePackage = new SearchSharePackage(d2.e(str));
                    Bundle bundle = searchSharePackage.f124595i;
                    bundle.putString("app_name", a2.getString(R.string.uh));
                    bundle.putString("thumb_url", aVar2.f144897c);
                    bundle.putString("schema", aVar2.f144899e);
                    bundle.putString("track_info", aVar2.f144900f);
                    e.b(aVar2.f144897c);
                    SearchSharePackage.a.C3225a aVar3 = new SearchSharePackage.a.C3225a(str2);
                    e.b bVar = new e.b();
                    com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.b.a(ShareDependService.a.a(), searchSharePackage, "share_search", 4));
                    ah.f123352a.a((ShareService) bVar, (e.b) a2, (Activity) true);
                    bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
                    bVar.a(searchSharePackage);
                    bVar.a(aVar3);
                    ShareDependService.a.a().a(a2, bVar.a(), R.style.wk).show();
                    z = true;
                }
            }
        }
        if (!jSONObject2.has("tricky_flag")) {
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            aVar.a(jSONObject2);
        }
    }
}
