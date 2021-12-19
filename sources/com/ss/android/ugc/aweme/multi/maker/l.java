package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.s;
import com.google.gson.f;
import com.google.gson.o;
import com.google.gson.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.multi.k;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l extends o implements i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f110969e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public String f110970d;

    /* renamed from: f  reason: collision with root package name */
    private d f110971f;

    /* renamed from: g  reason: collision with root package name */
    private final List<k> f110972g = new ArrayList();

    static {
        Covode.recordClassIndex(71204);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(157, new g(l.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean j() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "webview";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71205);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new l();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.ANCHOR_SHOP_LINK.getTYPE();
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f110971f = dVar;
        o.a(this, dVar, false, false, 6);
        a(new c(this));
    }

    static final class b extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(71206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            h.f.b.l.d(anchorCommonStruct2, "");
            String extra = anchorCommonStruct2.getExtra();
            if (extra.length() > 0) {
                String str = null;
                if (!(1 == 0 || extra == null)) {
                    com.google.gson.l a2 = q.a(extra);
                    h.f.b.l.b(a2, "");
                    o j2 = a2.j();
                    l lVar = this.this$0;
                    com.google.gson.l c2 = j2.c("product_type");
                    if (c2 != null) {
                        str = c2.c();
                    }
                    lVar.f110970d = str;
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final void b(AnchorCommonStruct anchorCommonStruct) {
        h.f.b.l.d(anchorCommonStruct, "");
        a(new b(this));
        if (!(!this.f110972g.isEmpty())) {
            String extra = anchorCommonStruct.getExtra();
            try {
                JSONArray jSONArray = new JSONArray(extra);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("extra");
                    com.ss.android.ugc.aweme.multi.m mVar = new com.ss.android.ugc.aweme.multi.m();
                    h.f.b.l.b(optString, "");
                    if (optString.length() > 0) {
                        Object a2 = new f().a(optString, com.ss.android.ugc.aweme.multi.m.class);
                        h.f.b.l.b(a2, "");
                        mVar = (com.ss.android.ugc.aweme.multi.m) a2;
                    }
                    List<k> list = this.f110972g;
                    String optString2 = jSONObject.optString("keyword");
                    h.f.b.l.b(optString2, "");
                    String optString3 = jSONObject.optString("id");
                    h.f.b.l.b(optString3, "");
                    Integer valueOf = Integer.valueOf(jSONObject.optInt(StringSet.type));
                    Integer valueOf2 = Integer.valueOf(jSONObject.optInt("platform"));
                    String optString4 = jSONObject.optString("log_extra");
                    h.f.b.l.b(optString4, "");
                    String optString5 = jSONObject.optString("schema");
                    h.f.b.l.b(optString5, "");
                    list.add(new k(optString, mVar, optString2, optString3, valueOf, valueOf2, optString4, optString5));
                }
            } catch (Exception e2) {
                r.a("rd_tiktokec_shop_anchor_exception", new d().a("e_stack_trace", s.b(e2)).a("extra_data", "anchor.extra : ".concat(String.valueOf(extra))).a("where", "ShopLinkAnchorMaker").f66730a);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.crossplatform.b.b bVar) {
        String str;
        h.f.b.l.d(bVar, "");
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        String p = p();
        if (p == null) {
            p = "";
        }
        aVar.f73497b = p;
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        aVar.q = this.f110970d;
        aVar.r = String.valueOf(bVar.f78592a);
        aVar.u = "video";
        aVar.v = "video_cart_tag";
        aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (a().a()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        aVar.G = str;
        aVar.H = "video";
        a2.logCommerceEvents("product_stay_time", aVar);
        d dVar = this.f110971f;
        if (dVar != null) {
            d a3 = dVar.a("author_id", o().getAuthorUid()).a("duration", String.valueOf(bVar.f78592a)).a("group_id", o().getAid());
            Long c2 = ac.c(o());
            h.f.b.l.b(c2, "");
            r.a("anchor_stay_time", a3.a("music_id", c2.longValue()).a("enter_from", p()).f66730a);
        }
        EventBus.a().b(this);
    }

    static final class c extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(71207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            String str2;
            boolean z;
            MethodCollector.i(3915);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str3 = "";
            h.f.b.l.d(anchorCommonStruct2, str3);
            String schema = anchorCommonStruct2.getSchema();
            if (schema != null) {
                try {
                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                    h.f.b.l.b(iESSettingsProxy, str3);
                    str2 = iESSettingsProxy.getShopLinkAnchorDisclaimer();
                } catch (Exception unused) {
                    str2 = str3;
                }
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                    Toast toast = new Toast(a2);
                    toast.setDuration(1);
                    toast.setGravity(55, 0, 0);
                    Object a3 = l.a(a2, "layout_inflater");
                    if (a3 != null) {
                        View inflate = ((LayoutInflater) a3).inflate(R.layout.ahl, (ViewGroup) null);
                        View findViewById = inflate.findViewById(R.id.exf);
                        h.f.b.l.b(findViewById, str3);
                        ((TextView) findViewById).setText(str2);
                        toast.setView(inflate);
                        if (Build.VERSION.SDK_INT == 25) {
                            ic.a(toast);
                        }
                        toast.show();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                        MethodCollector.o(3915);
                        throw nullPointerException;
                    }
                }
                Activity e2 = this.this$0.a().e();
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(e2, schema, str3);
                EventBus.a(EventBus.a(), anchorCommonStruct2);
                if (e2 instanceof androidx.lifecycle.m) {
                    ((androidx.lifecycle.m) e2).getLifecycle().a(new ShopLinkAnchorMaker$whenMyAnchorClicked$1$1$1());
                }
            }
            ICommerceService a4 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
            String p = this.this$0.p();
            if (p != null) {
                str3 = p;
            }
            aVar.f73497b = str3;
            aVar.f73499d = this.this$0.o().getAuthorUid();
            aVar.f73498c = this.this$0.o().getAid();
            aVar.q = this.this$0.f110970d;
            aVar.u = "video";
            aVar.v = "video_cart_tag";
            aVar.I = com.ss.android.ugc.aweme.base.b.a(this.this$0.o());
            if (this.this$0.a().a()) {
                str = "video_single_anchor";
            } else {
                str = "video_multi_anchor";
            }
            aVar.G = str;
            aVar.H = "video";
            a4.logCommerceEvents("enter_product_detail", aVar);
            if (this.this$0.o().isAd()) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("anchor_detail", "otherclick", this.this$0.o().getAwemeRawAd()).b("refer", "shop_anchor").b();
            }
            z zVar = z.f158842a;
            MethodCollector.o(3915);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        String str;
        Integer num;
        String str2;
        String str3;
        Long l2;
        int i2;
        String str4;
        int i3;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        com.ss.android.ugc.aweme.multi.m mVar4;
        h.f.b.l.d(dVar, "");
        super.b(dVar);
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        String p = p();
        if (p == null) {
            p = "";
        }
        aVar.f73497b = p;
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        aVar.q = this.f110970d;
        aVar.u = "video";
        aVar.v = "video_cart_tag";
        aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
        String str5 = "video_single_anchor";
        if (a().a()) {
            str = str5;
        } else {
            str = "video_multi_anchor";
        }
        aVar.G = str;
        aVar.H = "video";
        a2.logCommerceEvents("product_anchor_show", aVar);
        ICommerceService a3 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar2.C = "TEMAI";
        aVar2.f73498c = o().getAid();
        aVar2.f73499d = o().getAuthorUid();
        aVar2.f73500e = o().getRequestId();
        String p2 = p();
        if (p2 == null) {
            p2 = "";
        }
        aVar2.f73497b = p2;
        aVar2.v = "video_cart_tag";
        k kVar = (k) n.h((List) this.f110972g);
        String str6 = null;
        if (kVar == null || (mVar4 = kVar.f110914b) == null) {
            num = null;
        } else {
            num = mVar4.f110932i;
        }
        aVar2.y = String.valueOf(num);
        k kVar2 = (k) n.h((List) this.f110972g);
        if (kVar2 == null || (mVar3 = kVar2.f110914b) == null) {
            str2 = null;
        } else {
            str2 = mVar3.f110934k;
        }
        aVar2.x = str2;
        k kVar3 = (k) n.h((List) this.f110972g);
        if (kVar3 == null || (mVar2 = kVar3.f110914b) == null) {
            str3 = null;
        } else {
            str3 = mVar2.f110935l;
        }
        aVar2.w = str3;
        k kVar4 = (k) n.h((List) this.f110972g);
        if (kVar4 == null || (mVar = kVar4.f110914b) == null) {
            l2 = null;
        } else {
            l2 = mVar.f110925b;
        }
        aVar2.z = String.valueOf(l2);
        String authorUid = o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        if (h.f.b.l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        aVar2.A = i2;
        if (a().a()) {
            str4 = "yes";
        } else {
            str4 = "no";
        }
        aVar2.B = str4;
        if (o().isAd()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        aVar2.E = i3;
        if (o().isAd()) {
            str6 = o().getAwemeRawAdIdStr();
        }
        aVar2.F = str6;
        aVar2.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (!a().a()) {
            str5 = "video_multi_anchor";
        }
        aVar2.G = str5;
        aVar2.H = "video";
        a3.logCommerceEvents("tiktok_video_anchor_view", aVar2);
        if (o().isAd()) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", o().getAwemeRawAd()).b("refer", "shop_anchor").b();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        Integer num;
        String str;
        String str2;
        Long l2;
        int i2;
        String str3;
        int i3;
        String str4;
        String str5;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        com.ss.android.ugc.aweme.multi.m mVar4;
        h.f.b.l.d(dVar, "");
        super.c(dVar);
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar.C = "TEMAI";
        aVar.f73498c = o().getAid();
        aVar.f73499d = o().getAuthorUid();
        aVar.f73500e = o().getRequestId();
        String p = p();
        if (p == null) {
            p = "";
        }
        aVar.f73497b = p;
        aVar.v = "video_cart_tag";
        k kVar = (k) n.h((List) this.f110972g);
        String str6 = null;
        if (kVar == null || (mVar4 = kVar.f110914b) == null) {
            num = null;
        } else {
            num = mVar4.f110932i;
        }
        aVar.y = String.valueOf(num);
        k kVar2 = (k) n.h((List) this.f110972g);
        if (kVar2 == null || (mVar3 = kVar2.f110914b) == null) {
            str = null;
        } else {
            str = mVar3.f110934k;
        }
        aVar.x = str;
        k kVar3 = (k) n.h((List) this.f110972g);
        if (kVar3 == null || (mVar2 = kVar3.f110914b) == null) {
            str2 = null;
        } else {
            str2 = mVar2.f110935l;
        }
        aVar.w = str2;
        k kVar4 = (k) n.h((List) this.f110972g);
        if (kVar4 == null || (mVar = kVar4.f110914b) == null) {
            l2 = null;
        } else {
            l2 = mVar.f110925b;
        }
        aVar.z = String.valueOf(l2);
        String authorUid = o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        if (h.f.b.l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        aVar.A = i2;
        if (a().a()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        aVar.B = str3;
        if (o().isAd()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        aVar.E = i3;
        if (o().isAd()) {
            str6 = o().getAwemeRawAdIdStr();
        }
        aVar.F = str6;
        aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (a().a()) {
            str4 = "video_single_anchor";
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.G = str4;
        aVar.H = "video";
        a2.logCommerceEvents("tiktok_video_anchor_click", aVar);
        if (o().isAd()) {
            AwemeRawAd awemeRawAd = o().getAwemeRawAd();
            if (awemeRawAd == null || awemeRawAd.getAnchorClickType() != 2) {
                str5 = "otherclick";
            } else {
                str5 = "click";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str5, o().getAwemeRawAd()).b("refer", "shop_anchor").b();
        }
    }

    static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7135);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7135);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
