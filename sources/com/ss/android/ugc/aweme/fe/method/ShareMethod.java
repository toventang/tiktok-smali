package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.sharer.j;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import f.a.o;
import f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91172a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f91173b;

    public static final class b implements Comparator<com.ss.android.ugc.aweme.sharer.b> {

        /* renamed from: a  reason: collision with root package name */
        private final h f91174a;

        static {
            Covode.recordClassIndex(57383);
        }

        private final List<j> a() {
            return (List) this.f91174a.getValue();
        }

        static final class a extends m implements h.f.a.a<List<? extends j>> {
            final /* synthetic */ List $shareItems;

            static {
                Covode.recordClassIndex(57384);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.$shareItems = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ List<? extends j> invoke() {
                return this.$shareItems;
            }
        }

        public b(List<? extends j> list) {
            l.d(list, "");
            this.f91174a = i.a((h.f.a.a) new a(list));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.ss.android.ugc.aweme.sharer.b bVar, com.ss.android.ugc.aweme.sharer.b bVar2) {
            com.ss.android.ugc.aweme.sharer.b bVar3 = bVar;
            com.ss.android.ugc.aweme.sharer.b bVar4 = bVar2;
            l.d(bVar3, "");
            l.d(bVar4, "");
            return a(bVar3, a()) - a(bVar4, a());
        }

        private static int a(com.ss.android.ugc.aweme.sharer.b bVar, List<? extends j> list) {
            for (j jVar : list) {
                if (l.a((Object) jVar.f124572a, (Object) bVar.a())) {
                    return list.indexOf(jVar);
                }
            }
            return Integer.MAX_VALUE;
        }
    }

    static {
        Covode.recordClassIndex(57381);
    }

    private ShareMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57382);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g extends com.google.c.g.g<List<? extends String>> {
        static {
            Covode.recordClassIndex(57390);
        }

        g() {
        }
    }

    public /* synthetic */ ShareMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareMethod f91185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f91186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f91187c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f91188d;

        static {
            Covode.recordClassIndex(57387);
        }

        e(ShareMethod shareMethod, Context context, View view, int i2) {
            this.f91185a = shareMethod;
            this.f91186b = context;
            this.f91187c = view;
            this.f91188d = i2;
        }

        public final void run() {
            int c2 = n.c(this.f91186b, (float) this.f91187c.getHeight());
            if (this.f91188d == 1) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("panel_height", c2);
                jSONObject.put("panel_frame", jSONObject2);
                this.f91185a.mJsBridge.b("H5_sharePanelFrame", jSONObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f91189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f91190b;

        static {
            Covode.recordClassIndex(57388);
        }

        f(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
            this.f91189a = bVar;
            this.f91190b = context;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final com.ss.android.ugc.aweme.sharer.h hVar = (com.ss.android.ugc.aweme.sharer.h) obj;
            l.d(hVar, "");
            return f.a.n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.fe.method.ShareMethod.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f91191a;

                static {
                    Covode.recordClassIndex(57389);
                }

                {
                    this.f91191a = r1;
                }

                @Override // f.a.q
                public final void a(o<Boolean> oVar) {
                    l.d(oVar, "");
                    com.ss.android.ugc.aweme.sharer.b bVar = this.f91191a.f91189a;
                    com.ss.android.ugc.aweme.sharer.h hVar = hVar;
                    l.b(hVar, "");
                    oVar.a(Boolean.valueOf(bVar.a(hVar, this.f91191a.f91190b)));
                }
            });
        }
    }

    public ShareMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91173b = new ArrayList<>(Arrays.asList("copylink", "qrcode", "browser", "refresh"));
    }

    public static final class d implements com.ss.android.ugc.aweme.sharer.ui.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareMethod f91179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91180b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f91181c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91182d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f91183e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f91184f;

        static {
            Covode.recordClassIndex(57386);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void b(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            try {
                JSONObject jSONObject = this.f91181c;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            JSONObject jSONObject;
            l.d(sharePackage, "");
            l.d(context, "");
            T t = this.f91180b.element;
            if (!(t == null || (jSONObject = this.f91181c) == null)) {
                jSONObject.put("share_channel", t);
            }
            BaseCommonJavaMethod.a aVar = this.f91182d;
            if (aVar != null) {
                aVar.a(this.f91181c);
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(com.ss.android.ugc.aweme.sharer.ui.h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
            this.f91180b.element = (T) hVar.c();
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
            l.d(bVar, "");
            l.d(context, "");
            if (this.f91183e != null) {
                r.onEvent(MobClick.obtain().setEventName(this.f91183e.optString("tag")).setLabelName(bVar.a()).setValue(this.f91183e.optString("value")).setJsonObject(this.f91183e.optJSONObject("extras")));
            }
            if (z) {
                this.f91180b.element = (T) bVar.a();
                String a2 = bVar.a();
                String str = this.f91184f;
                l.b(str, "");
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                dVar.a("enter_from", "h5_page");
                dVar.a("platform", a2);
                dVar.a("url", str);
                r.a("h5_share", dVar.f66730a);
            }
        }

        d(ShareMethod shareMethod, z.e eVar, JSONObject jSONObject, BaseCommonJavaMethod.a aVar, JSONObject jSONObject2, String str) {
            this.f91179a = shareMethod;
            this.f91180b = eVar;
            this.f91181c = jSONObject;
            this.f91182d = aVar;
            this.f91183e = jSONObject2;
            this.f91184f = str;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.sharer.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f91175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareMethod f91176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.b f91177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SharePackage f91178d;

        static {
            Covode.recordClassIndex(57385);
        }

        @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
        public final boolean a(com.ss.android.ugc.aweme.sharer.h hVar, Context context) {
            l.d(hVar, "");
            l.d(context, "");
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            SharePackage sharePackage = this.f91178d;
            l.d(sharePackage, "");
            if (j2 == null) {
                return false;
            }
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
        c(com.ss.android.ugc.aweme.sharer.b bVar, com.ss.android.ugc.aweme.sharer.b bVar2, ShareMethod shareMethod, e.b bVar3, SharePackage sharePackage) {
            super(bVar2);
            this.f91175a = bVar;
            this.f91176b = shareMethod;
            this.f91177c = bVar3;
            this.f91178d = sharePackage;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        WebView webView;
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = this.mContextRef;
        l.b(weakReference, "");
        com.bytedance.ies.web.a.a aVar2 = this.mJsBridge;
        if (aVar2 == null || (webView = aVar2.f35513d) == null) {
            str = null;
        } else {
            str = webView.getUrl();
        }
        boolean a2 = a(weakReference, jSONObject, str, jSONObject2, aVar);
        if (!jSONObject2.has("tricky_flag")) {
            if (!a2) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            if (aVar != null) {
                aVar.a(jSONObject2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018e A[LOOP:1: B:59:0x0188->B:61:0x018e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.ref.WeakReference<android.content.Context> r37, org.json.JSONObject r38, java.lang.String r39, org.json.JSONObject r40, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r41) {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ShareMethod.a(java.lang.ref.WeakReference, org.json.JSONObject, java.lang.String, org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):boolean");
    }
}
