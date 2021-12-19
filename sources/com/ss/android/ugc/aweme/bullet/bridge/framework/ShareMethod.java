package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.google.c.g.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.share.improve.a.af;
import com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.s;
import com.zhiliaoapp.musically.R;
import f.a.n;
import f.a.o;
import f.a.q;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69156b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<String> f69157c = new ArrayList<>(Arrays.asList("copylink", "qrcode", "browser", "refresh"));

    /* renamed from: d  reason: collision with root package name */
    private final String f69158d = "share";

    /* renamed from: e  reason: collision with root package name */
    private k.a f69159e = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(42649);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42650);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f extends g<List<? extends String>> {
        static {
            Covode.recordClassIndex(42656);
        }

        f() {
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69159e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69158d;
    }

    public static final class c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareMethod f69165a;

        static {
            Covode.recordClassIndex(42652);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final int b() {
            return R.string.fan;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final String c() {
            return "refresh";
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final int ch_() {
            return 2131232639;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final boolean d() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final boolean e() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final boolean f() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final int g() {
            return ch_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ShareMethod shareMethod) {
            this.f69165a = shareMethod;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final void a(Context context) {
            l.d(context, "");
            l.d(context, "");
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final void a(ImageView imageView) {
            l.d(imageView, "");
            l.d(imageView, "");
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final void a(TextView textView) {
            l.d(textView, "");
            h.a.a(this, textView);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.h
        public final void a(Context context, SharePackage sharePackage) {
            WebView n;
            l.d(context, "");
            l.d(sharePackage, "");
            com.bytedance.ies.bullet.c.c.i g2 = this.f69165a.g();
            if (g2 != null) {
                if (!(g2 instanceof com.bytedance.ies.bullet.kit.web.c)) {
                    g2 = null;
                }
                com.bytedance.ies.bullet.kit.web.c cVar = (com.bytedance.ies.bullet.kit.web.c) g2;
                if (cVar != null && (n = cVar.n()) != null) {
                    n.reload();
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69159e = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f69171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f69172b;

        static {
            Covode.recordClassIndex(42654);
        }

        e(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
            this.f69171a = bVar;
            this.f69172b = context;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final com.ss.android.ugc.aweme.sharer.h hVar = (com.ss.android.ugc.aweme.sharer.h) obj;
            l.d(hVar, "");
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f69173a;

                static {
                    Covode.recordClassIndex(42655);
                }

                {
                    this.f69173a = r1;
                }

                @Override // f.a.q
                public final void a(o<Boolean> oVar) {
                    l.d(oVar, "");
                    com.ss.android.ugc.aweme.sharer.b bVar = this.f69173a.f69171a;
                    com.ss.android.ugc.aweme.sharer.h hVar = hVar;
                    l.b(hVar, "");
                    oVar.a(Boolean.valueOf(bVar.a(hVar, this.f69173a.f69172b)));
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class d implements com.ss.android.ugc.aweme.sharer.ui.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareMethod f69166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f69167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69168c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONObject f69169d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f69170e;

        static {
            Covode.recordClassIndex(42653);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            BaseBridgeMethod.a aVar = this.f69168c;
            if (aVar != null) {
                aVar.a(this.f69167b);
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void b(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            try {
                JSONObject jSONObject = this.f69167b;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
            l.d(bVar, "");
            l.d(context, "");
            if (this.f69169d != null) {
                r.onEvent(MobClick.obtain().setEventName(this.f69169d.optString("tag")).setLabelName(bVar.a()).setValue(this.f69169d.optString("value")).setJsonObject(this.f69169d.optJSONObject("extras")));
            }
            if (z) {
                String a2 = bVar.a();
                String str = this.f69170e;
                l.b(str, "");
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                dVar.a("enter_from", "h5_page");
                dVar.a("platform", a2);
                dVar.a("url", str);
                r.a("h5_share", dVar.f66730a);
            }
        }

        d(ShareMethod shareMethod, JSONObject jSONObject, BaseBridgeMethod.a aVar, JSONObject jSONObject2, String str) {
            this.f69166a = shareMethod;
            this.f69167b = jSONObject;
            this.f69168c = aVar;
            this.f69169d = jSONObject2;
            this.f69170e = str;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.sharer.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f69160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareMethod f69161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.b f69162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SharePackage f69163d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f69164e;

        static {
            Covode.recordClassIndex(42651);
        }

        @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
        public final boolean a(com.ss.android.ugc.aweme.sharer.h hVar, Context context) {
            l.d(hVar, "");
            l.d(context, "");
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            SharePackage sharePackage = this.f69163d;
            String str = this.f69164e;
            l.d(sharePackage, "");
            if (j2 == null) {
                return false;
            }
            sharePackage.f124595i.putString("url_for_im_share", str);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(j2, "", "click_shareim_button");
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("share_package", sharePackage);
            IMService.createIIMServicebyMonsterPlugin(false).enterChooseContact(j2, bundle);
            ai.a("chat_merge");
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.sharer.b bVar, com.ss.android.ugc.aweme.sharer.b bVar2, ShareMethod shareMethod, e.b bVar3, SharePackage sharePackage, String str) {
            super(bVar2);
            this.f69160a = bVar;
            this.f69161b = shareMethod;
            this.f69162c = bVar3;
            this.f69163d = sharePackage;
            this.f69164e = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        WebView n;
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = new WeakReference<>(e());
        com.bytedance.ies.bullet.c.c.i g2 = g();
        String str = null;
        if (g2 != null) {
            if (!(g2 instanceof com.bytedance.ies.bullet.kit.web.c)) {
                g2 = null;
            }
            com.bytedance.ies.bullet.kit.web.c cVar = (com.bytedance.ies.bullet.kit.web.c) g2;
            if (!(cVar == null || (n = cVar.n()) == null)) {
                str = n.getUrl();
            }
        }
        boolean a2 = a(weakReference, jSONObject, str, jSONObject2, aVar);
        if (!jSONObject2.has("tricky_flag")) {
            if (!a2) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            aVar.a(jSONObject2);
        }
    }

    private final boolean a(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, BaseBridgeMethod.a aVar) {
        Activity a2;
        SharePackage a3;
        List list;
        String str2 = str;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("desc");
        String optString3 = jSONObject.optString("image");
        String optString4 = jSONObject.optString("url");
        Uri parse = Uri.parse(optString4);
        l.b(parse, "");
        if (com.bytedance.ies.bullet.service.base.e.c.a(parse, "u_code") == null) {
            Uri.Builder buildUpon = Uri.parse(optString4).buildUpon();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            optString4 = buildUpon.appendQueryParameter("u_code", com.ss.android.newmedia.d.b(g2.getCurUserId())).build().toString();
        }
        String optString5 = jSONObject.optString("image_path");
        String optString6 = jSONObject.optString(StringSet.type);
        String optString7 = jSONObject.optString("shareitems");
        if (!TextUtils.isEmpty(optString7) && (list = (List) new com.google.gson.f().a(optString7, new f().getType())) != null) {
            this.f69157c.clear();
            this.f69157c.addAll(list);
        }
        List<String> a4 = s.a(jSONObject.optJSONArray("shareEntriesForbidList"));
        JSONObject jSONObject3 = null;
        if (jSONObject.has("logArgs")) {
            jSONObject3 = jSONObject.optJSONObject("logArgs");
        }
        if (optString2 == null || optString2.length() == 0) {
            l.b(optString, "");
            optString2 = optString;
        }
        com.ss.android.ugc.aweme.web.c.a.b bVar = new com.ss.android.ugc.aweme.web.c.a.b(optString, optString2, optString3, optString4, optString5);
        String optString8 = jSONObject.optString("platform");
        Context context = weakReference.get();
        if (TextUtils.isEmpty(optString8) || context == null || (a2 = com.ss.android.ugc.aweme.base.utils.o.a(context)) == null) {
            return false;
        }
        e.b bVar2 = new e.b();
        ah.f123352a.a((ShareService) bVar2, (e.b) a2, (Activity) true);
        if (TextUtils.equals(optString6, "image")) {
            l.b(optString3, "");
            if (str2 == null) {
                str2 = "";
            }
            a3 = RemoteImageSharePackage.a.a(context, bVar, optString3, str2);
            bVar2.a(new com.ss.android.ugc.aweme.share.improve.a.q(optString3));
        } else if (TextUtils.equals(optString6, "local_img")) {
            a3 = WebSharePackage.a.a(context, bVar, str2);
        } else {
            a3 = WebSharePackage.a.a(context, bVar, str2, false);
            com.ss.android.ugc.aweme.sharer.b a5 = ShareDependService.a.a().a(a3, "");
            bVar2.a(new b(a5, a5, this, bVar2, a3, str2));
        }
        if (this.f69157c.contains("refresh")) {
            bVar2.a(new c(this));
        }
        if (this.f69157c.contains("browser")) {
            bVar2.a(new af());
        }
        if (this.f69157c.contains("copylink")) {
            bVar2.a(new com.ss.android.ugc.aweme.share.improve.a.d("fromWeb", false, 6));
        }
        for (String str3 : a4) {
            bVar2.a(str3);
        }
        bVar2.a(a3);
        if (!TextUtils.equals(optString8, "share_native")) {
            com.ss.android.ugc.aweme.sharer.b a6 = a.C3201a.a(optString8, a2);
            if (a6 == null) {
                return false;
            }
            if (!com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                return a6.a(a3.a(a6), context);
            }
            R cE_ = a3.b(a6).a(new e(a6, context)).cE_();
            l.b(cE_, "");
            return cE_.booleanValue();
        }
        jSONObject2.put("tricky_flag", "tricky_flag");
        bVar2.a(new d(this, jSONObject2, aVar, jSONObject3, optString4));
        ShareDependService.a.a().a(a2, bVar2.a(), R.style.wk).show();
        return true;
    }
}
