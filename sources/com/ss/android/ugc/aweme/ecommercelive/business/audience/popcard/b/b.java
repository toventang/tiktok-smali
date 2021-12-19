package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.e;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.dg;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bz;

public final class b extends com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a implements i.c, IEventCenter.b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f87847f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.container.c f87848b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.container.c f87849c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f87850d;

    /* renamed from: e  reason: collision with root package name */
    public String f87851e;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.a<z> f87852g;

    /* renamed from: h  reason: collision with root package name */
    private long f87853h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f87854i;

    static {
        Covode.recordClassIndex(55246);
    }

    @Override // com.bytedance.android.live.b.i.c
    public final void a() {
    }

    @Override // com.bytedance.android.live.b.i.c
    public final void a(String str) {
        l.d(str, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55247);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void c() {
        super.c();
        EventCenter.a().a("ec_pin_card_show", "{}");
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void d() {
        super.d();
        EventCenter.a().a("ec_pin_card_hide", "{}");
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void e() {
        super.e();
        bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88027b), null, null, new c(this, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.b$b  reason: collision with other inner class name */
    static final class C2127b extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2127b(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2127b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2127b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                if (ay.a(400, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bytedance.android.livesdk.container.c cVar = this.this$0.f87849c;
            if (cVar != null) {
                cVar.c();
            }
            return z.f158842a;
        }
    }

    static final class c extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                if (ay.a(400, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bytedance.android.livesdk.container.c cVar = this.this$0.f87848b;
            if (cVar != null) {
                cVar.c();
            }
            com.bytedance.android.livesdk.container.c cVar2 = this.this$0.f87849c;
            if (cVar2 != null) {
                cVar2.c();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.b.i.c
    public final void b(String str) {
        String str2;
        l.d(str, "");
        h.f.a.a<z> aVar = this.f87852g;
        if (aVar != null) {
            aVar.invoke();
        }
        PopupCardVO popupCardVO = this.f87832a.f87835a;
        String str3 = null;
        if (popupCardVO != null) {
            str2 = String.valueOf(popupCardVO.getProductId());
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.f87832a.f87842f;
        if (aVar2 != null) {
            str3 = aVar2.c("room_id");
        }
        com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(str2, str3, this.f87851e, true, System.currentTimeMillis() - this.f87853h);
    }

    @Override // com.bytedance.android.live.b.i.c
    public final void c(String str) {
        String str2;
        l.d(str, "");
        PopupCardVO popupCardVO = this.f87832a.f87835a;
        String str3 = null;
        if (popupCardVO != null) {
            str2 = String.valueOf(popupCardVO.getProductId());
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87832a.f87842f;
        if (aVar != null) {
            str3 = aVar.c("room_id");
        }
        com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(str2, str3, this.f87851e, false, System.currentTimeMillis() - this.f87853h);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final View a(Context context) {
        FrameLayout frameLayout;
        MethodCollector.i(1340);
        l.d(context, "");
        com.bytedance.android.livesdk.container.c cVar = this.f87848b;
        if (cVar == null || (frameLayout = cVar.getFrameLayout()) == null) {
            View view = new View(context);
            MethodCollector.o(1340);
            return view;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(300.0d), -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = n.a(12.0d);
        layoutParams.bottomMargin = n.a(8.0d);
        frameLayout.setLayoutParams(layoutParams);
        EventCenter.a().a("ec_pin_card_close", this);
        MethodCollector.o(1340);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void a(h.f.a.a<z> aVar) {
        String c2;
        String c3;
        Map<String, String> map;
        l.d(aVar, "");
        super.a(aVar);
        this.f87852g = aVar;
        this.f87853h = System.currentTimeMillis();
        com.bytedance.android.livesdk.container.c cVar = this.f87849c;
        if (cVar != null) {
            cVar.c();
        }
        Context context = this.f87850d;
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.f87832a.f87842f;
        com.bytedance.android.livesdk.container.c cVar2 = null;
        com.ss.android.ugc.aweme.app.f.d a2 = aVar2 != null ? com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar2) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(a2 == null || (map = a2.f66730a) == null)) {
            linkedHashMap.putAll(map);
        }
        Map<String, String> map2 = this.f87854i;
        if (map2 != null) {
            linkedHashMap.put("effect_ad_extra", map2);
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.f87832a.f87842f;
        if (!(aVar3 == null || (c3 = aVar3.c("traffic_source")) == null)) {
            linkedHashMap.put("traffic_source", c3);
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar4 = this.f87832a.f87842f;
        if (!(aVar4 == null || (c2 = aVar4.c("is_ad")) == null)) {
            linkedHashMap.put("is_ad", Integer.valueOf(Integer.parseInt(c2)));
        }
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse(this.f87851e);
        l.b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        encodedPath.appendQueryParameter("track_params", dg.a().b(linkedHashMap)).appendQueryParameter("duration", String.valueOf(com.ss.android.ugc.aweme.ecommercelive.framework.c.a.a().b()));
        Uri build = builder.build();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        com.bytedance.android.livesdk.container.c b2 = s.d().b(context, build);
        if (b2 != null) {
            b2.setContainerId("ECCardSlotLynxImpl");
            b2.setHybridLoadListener(this);
            b2.a();
            b2.b();
            cVar2 = b2;
        }
        this.f87848b = cVar2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void d(String str) {
        int i2;
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode == 108401282 ? !str.equals("repin") : hashCode != 111439964 || !str.equals("unpin")) {
            h.f.a.b<? super String, z> bVar = this.f87832a.f87838d;
            if (bVar != null) {
                bVar.invoke(str);
            }
        } else {
            IEventCenter a2 = EventCenter.a();
            switch (str.hashCode()) {
                case -2077031716:
                    if (str.equals("time_out")) {
                        i2 = 1;
                        break;
                    }
                    i2 = 0;
                    break;
                case -580047918:
                    if (str.equals("conflict")) {
                        i2 = 5;
                        break;
                    }
                    i2 = 0;
                    break;
                case 108401282:
                    if (str.equals("repin")) {
                        i2 = 4;
                        break;
                    }
                    i2 = 0;
                    break;
                case 111439964:
                    if (str.equals("unpin")) {
                        i2 = 3;
                        break;
                    }
                    i2 = 0;
                    break;
                case 1919805572:
                    if (str.equals("user_close")) {
                        i2 = 2;
                        break;
                    }
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            String b2 = dg.a().b(new e(i2));
            if (b2 == null) {
                b2 = "{}";
            }
            a2.a("ec_pin_card_close", b2);
        }
        this.f87849c = this.f87848b;
        bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88027b), null, null, new C2127b(this, null), 3);
        EventCenter.a().b("ec_pin_card_close", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        if (str.hashCode() == -719370572 && str.equals("ec_pin_card_close")) {
            e a2 = e.a.a(str2);
            int i2 = a2.f87860a;
            if (i2 == 1 || i2 == 2) {
                int i3 = a2.f87860a;
                if (i3 == 1) {
                    str3 = "time_out";
                } else if (i3 == 2) {
                    str3 = "user_close";
                } else if (i3 == 3) {
                    str3 = "unpin";
                } else if (i3 == 4) {
                    str3 = "repin";
                } else if (i3 != 5) {
                    str3 = "other";
                } else {
                    str3 = "conflict";
                }
                d(str3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, String str, Map<String, String> map) {
        super(aVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(str, "");
        this.f87850d = context;
        this.f87851e = str;
        this.f87854i = map;
    }
}
