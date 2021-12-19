package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.h;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.k;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.t;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class w {

    /* renamed from: a */
    static ActivityStack.b f85670a;

    /* renamed from: b */
    public static final w f85671b = new w();

    private w() {
    }

    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $middlePageUrl;

        static {
            Covode.recordClassIndex(53582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, Context context) {
            super(0);
            this.$middlePageUrl = str;
            this.$context = context;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            String str = this.$middlePageUrl;
            HashMap hashMap = new HashMap();
            hashMap.put("payment_status", "success");
            hashMap.put("pay_route", "h5");
            String builder = j.b(str, hashMap).toString();
            IBulletService f2 = BulletService.f();
            Context context = this.$context;
            l.b(builder, "");
            f2.a(context, builder);
        }
    }

    public static final class a implements ActivityStack.b {

        /* renamed from: a */
        final /* synthetic */ long f85672a;

        /* renamed from: b */
        final /* synthetic */ v f85673b;

        /* renamed from: c */
        final /* synthetic */ Context f85674c;

        /* renamed from: d */
        final /* synthetic */ u f85675d;

        /* renamed from: e */
        final /* synthetic */ f f85676e;

        /* renamed from: f */
        final /* synthetic */ String f85677f;

        /* renamed from: g */
        final /* synthetic */ String f85678g;

        /* renamed from: h */
        final /* synthetic */ List f85679h;

        /* renamed from: i */
        final /* synthetic */ e f85680i;

        static {
            Covode.recordClassIndex(53579);
        }

        @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
        public final void a() {
            com.ss.android.ugc.aweme.ecommerce.track.c.a("rd_tiktokec_ecommerce_envoke_app", new h.f.a.b<c.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(53580);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(c.a aVar) {
                    c.a aVar2 = aVar;
                    l.d(aVar2, "");
                    c.a.a(aVar2, this.this$0.f85673b.f85441g);
                    aVar2.b("page_name", w.a(this.this$0.f85677f));
                    aVar2.b("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.this$0.f85672a));
                    return z.f158842a;
                }
            });
        }

        @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
        public final void b() {
            String str;
            if (l.a((Object) this.f85677f, (Object) "ordersubmit")) {
                IBulletService f2 = BulletService.f();
                Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
                l.b(a2, "");
                String str2 = this.f85678g;
                List list = this.f85679h;
                if (list != null) {
                    str = (String) n.g(list);
                } else {
                    str = null;
                }
                f2.a(a2, w.a(str2, str, this.f85677f, this.f85673b.f85440f, this.f85673b.f85441g, null));
            }
            ActivityStack.removeAppBackGroundListener(this);
            w.f85670a = null;
        }

        a(long j2, v vVar, Context context, u uVar, f fVar, String str, String str2, List list, e eVar) {
            this.f85672a = j2;
            this.f85673b = vVar;
            this.f85674c = context;
            this.f85675d = uVar;
            this.f85676e = fVar;
            this.f85677f = str;
            this.f85678g = str2;
            this.f85679h = list;
            this.f85680i = eVar;
        }
    }

    static {
        Covode.recordClassIndex(53578);
    }

    public static final class e extends m implements h.f.a.b<String, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $middlePageUrl;
        final /* synthetic */ String $source;

        static {
            Covode.recordClassIndex(53584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, String str2, Context context) {
            super(1);
            this.$source = str;
            this.$middlePageUrl = str2;
            this.$context = context;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            a(str);
            return z.f158842a;
        }

        public final void a(String str) {
            l.d(str, "");
            if (l.a((Object) this.$source, (Object) "ordersubmit")) {
                SmartRouter.buildRoute(this.$context, j.b("aweme://echybrid/intercept_back", ag.c(v.a("url", str), v.a("back_open_url", j.a("aweme://echybrid", ag.c(v.a("url", this.$middlePageUrl))).toString()))).toString()).open();
                return;
            }
            SmartRouter.buildRoute(this.$context, j.b("aweme://echybrid", ag.c(v.a("url", str))).toString()).open();
        }
    }

    public static final class g implements com.bytedance.android.ecommerce.c.f {

        /* renamed from: a */
        final /* synthetic */ c f85682a;

        /* renamed from: b */
        final /* synthetic */ d f85683b;

        /* renamed from: c */
        final /* synthetic */ u f85684c;

        static {
            Covode.recordClassIndex(53587);
        }

        g(c cVar, d dVar, u uVar) {
            this.f85682a = cVar;
            this.f85683b = dVar;
            this.f85684c = uVar;
        }

        @Override // com.bytedance.android.ecommerce.c.f
        public final void a(com.bytedance.android.ecommerce.a.b.d dVar) {
            l.b(dVar, "");
            if (dVar.f6931h == com.bytedance.android.ecommerce.g.a.SUCCESS) {
                this.f85682a.a();
            } else {
                this.f85683b.a(dVar.f6929f, null);
            }
            u uVar = this.f85684c;
            if (uVar != null) {
                uVar.a();
            }
        }
    }

    public static String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1747807002) {
            if (hashCode != -390864660) {
                if (hashCode == 2103471391 && str.equals("orderdetail")) {
                    return "order_detail";
                }
                return "";
            } else if (str.equals("orderlist")) {
                return "ecommerce_centre_page";
            } else {
                return "";
            }
        } else if (str.equals("ordersubmit")) {
            return "order_submit";
        } else {
            return "";
        }
    }

    public static final class b implements com.bytedance.android.ecommerce.c.e {

        /* renamed from: a */
        final /* synthetic */ v f85681a;

        static {
            Covode.recordClassIndex(53581);
        }

        b(v vVar) {
            this.f85681a = vVar;
        }

        @Override // com.bytedance.android.ecommerce.c.e
        public final void a(com.bytedance.android.ecommerce.a.b.c cVar) {
            String str;
            k kVar;
            l.b(cVar, "");
            com.bytedance.android.ecommerce.a.j jVar = cVar.f6924f;
            if (jVar != null) {
                str = jVar.f6988d;
            } else {
                str = null;
            }
            String str2 = cVar.f6913c;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode == -776144932 && str2.equals("redirect")) {
                        kVar = k.REDIRECT;
                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f(str, kVar, new h(cVar.f6914d, ""));
                        v vVar = this.f85681a;
                        vVar.f85438d = fVar;
                        w.a(vVar);
                    }
                } else if (str2.equals("success")) {
                    kVar = k.DONE;
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar2 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f(str, kVar, new h(cVar.f6914d, ""));
                    v vVar2 = this.f85681a;
                    vVar2.f85438d = fVar2;
                    w.a(vVar2);
                }
            }
            kVar = k.ERROR;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar22 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f(str, kVar, new h(cVar.f6914d, ""));
            v vVar22 = this.f85681a;
            vVar22.f85438d = fVar22;
            w.a(vVar22);
        }
    }

    public static void a(v vVar) {
        String str;
        boolean z;
        String str2;
        Object obj;
        char c2;
        char c3;
        int i2;
        String str3;
        o oVar;
        String str4;
        String str5;
        String str6;
        o oVar2;
        o oVar3;
        o oVar4;
        String str7;
        String str8;
        String str9;
        String str10;
        com.ss.android.ugc.aweme.ecommerce.payment.a.d dVar;
        o oVar5;
        String str11 = "";
        l.d(vVar, str11);
        Context context = vVar.f85435a;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.f fVar = vVar.f85438d;
        List<String> list = vVar.f85436b;
        String str12 = vVar.f85437c;
        u uVar = vVar.f85444j;
        com.bytedance.android.ecommerce.a.a.d dVar2 = vVar.f85445k;
        com.bytedance.android.ecommerce.a.a.c cVar = vVar.f85446l;
        String str13 = vVar.f85442h;
        if (str13 == null) {
            str13 = str11;
        }
        if (list != null) {
            str = (String) n.g((List) list);
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar = vVar.f85440f;
        Map<String, Object> map = vVar.f85441g;
        Boolean bool = vVar.f85447m;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        String a2 = a(str12, str, str13, nVar, map, Integer.valueOf(i3));
        cVar.f6890k = a2;
        Map<String, Object> map2 = vVar.f85441g;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar2 = vVar.f85440f;
        if (nVar2 == null || (oVar5 = nVar2.f85329b) == null || (str2 = oVar5.c()) == null) {
            str2 = str11;
        }
        map2.put("pay_type", str2);
        Map<String, Object> map3 = vVar.f85441g;
        if (str12 != null) {
            obj = str12;
        } else if (list == null || (obj = n.g((List) list)) == null) {
            obj = str11;
        }
        map3.put("order_id", obj);
        c cVar2 = new c(a2, context);
        d dVar3 = new d(str13, a2, context);
        e eVar = new e(str13, a2, context);
        f fVar2 = new f(vVar, str13);
        if (fVar == null) {
            String str14 = vVar.f85443i;
            if (str14 != null) {
                SmartRouter.buildRoute(context, str14).open();
            }
            if (uVar != null) {
                uVar.a();
                return;
            }
            return;
        }
        k kVar = fVar.f85302b;
        if (kVar != null) {
            int i6 = x.f85685a[kVar.ordinal()];
            if (i6 == 1) {
                y.a().a(dVar2, new g(cVar2, dVar3, uVar));
            } else if (i6 == 2) {
                String str15 = fVar.f85301a;
                if (str15 != null) {
                    Uri parse = Uri.parse(str15);
                    l.b(parse, str11);
                    if (l.a((Object) parse.getScheme(), (Object) "aweme") && l.a((Object) parse.getHost(), (Object) "ec")) {
                        String queryParameter = parse.getQueryParameter("url");
                        if (queryParameter != null) {
                            String path = parse.getPath();
                            if (path != null) {
                                int hashCode = path.hashCode();
                                if (hashCode != -1169490130) {
                                    if (hashCode != -478974217) {
                                        if (hashCode == 1720098852 && path.equals("/payment_redirect")) {
                                            j.a(queryParameter, ag.c(v.a("trackParams", vVar.f85441g)));
                                            eVar.a(queryParameter);
                                        }
                                    } else if (path.equals("/payment")) {
                                        SmartRouter.buildRoute(context, j.b(str15, ag.c(v.a("trackParams", vVar.f85441g), v.a("cashier", vVar.f85439e), v.a("source", str13))).toString()).open();
                                    }
                                } else if (path.equals("/payment_deeplink")) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar3 = vVar.f85440f;
                                    if (nVar3 == null || (oVar4 = nVar3.f85329b) == null || (str3 = oVar4.f85343j) == null) {
                                        str3 = str11;
                                    }
                                    if (com.ss.android.ugc.aweme.ecommerce.util.m.a(context, str3, queryParameter)) {
                                        if (uVar != null) {
                                            uVar.b();
                                        }
                                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar4 = vVar.f85440f;
                                        if (nVar4 == null || (oVar3 = nVar4.f85329b) == null || (str5 = oVar3.f85337d) == null) {
                                            str5 = str11;
                                        }
                                        fVar2.a(true, str5);
                                        a aVar = new a(elapsedRealtime, vVar, context, uVar, fVar2, str13, str12, list, eVar);
                                        f85670a = aVar;
                                        ActivityStack.addAppBackGroundListener(aVar);
                                        if (!l.a((Object) str13, (Object) "ordersubmit")) {
                                            IEventCenter a3 = EventCenter.a();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("payment_status", "paying");
                                            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar5 = vVar.f85440f;
                                            if (nVar5 == null || (oVar2 = nVar5.f85329b) == null || (str6 = oVar2.f85337d) == null) {
                                                str6 = str11;
                                            }
                                            jSONObject.put("payment_method", str6);
                                            String jSONObject2 = jSONObject.toString();
                                            l.b(jSONObject2, str11);
                                            a3.a("ec_order_payment_status", jSONObject2);
                                        }
                                    } else {
                                        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar6 = vVar.f85440f;
                                        if (!(nVar6 == null || (oVar = nVar6.f85329b) == null || (str4 = oVar.f85337d) == null)) {
                                            str11 = str4;
                                        }
                                        fVar2.a(false, str11);
                                        eVar.a(queryParameter);
                                    }
                                } else {
                                    c2 = 0;
                                    c3 = 1;
                                    i2 = 2;
                                    p[] pVarArr = new p[i2];
                                    pVarArr[c2] = v.a("source", str13);
                                    pVarArr[c3] = v.a("trackParams", vVar.f85441g);
                                    SmartRouter.buildRoute(context, j.b(queryParameter, ag.c(pVarArr)).toString()).open();
                                }
                            }
                            c2 = 0;
                            i2 = 2;
                            c3 = 1;
                            p[] pVarArr2 = new p[i2];
                            pVarArr2[c2] = v.a("source", str13);
                            pVarArr2[c3] = v.a("trackParams", vVar.f85441g);
                            SmartRouter.buildRoute(context, j.b(queryParameter, ag.c(pVarArr2)).toString()).open();
                        }
                    } else if (l.a((Object) parse.getScheme(), (Object) "http") || l.a((Object) parse.getScheme(), (Object) "https")) {
                        eVar.a(str15);
                    } else {
                        SmartRouter.buildRoute(context, j.b(str15, ag.c(v.a("source", str13), v.a("trackParams", vVar.f85441g))).toString()).open();
                    }
                }
                if (uVar != null) {
                    uVar.a();
                }
            } else if (i6 == 3) {
                y.a().a(cVar, new b(vVar));
            } else if (i6 == 4) {
                h hVar = fVar.f85303c;
                if (hVar != null) {
                    str7 = hVar.f85310a;
                } else {
                    str7 = null;
                }
                h hVar2 = fVar.f85303c;
                if (hVar2 != null) {
                    str8 = hVar2.f85311b;
                } else {
                    str8 = null;
                }
                dVar3.a(str7, str8);
                if (uVar != null) {
                    uVar.a();
                }
                com.ss.android.ugc.aweme.ecommerce.payment.a.b bVar = vVar.f85439e;
                if (bVar == null || (dVar = bVar.f86277j) == null) {
                    str9 = null;
                } else {
                    str9 = dVar.f86286d;
                }
                Object obj2 = vVar.f85441g.get("previous_page");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str16 = (String) obj2;
                h hVar3 = fVar.f85303c;
                if (hVar3 != null) {
                    str10 = hVar3.f85310a;
                } else {
                    str10 = null;
                }
                t.a.a(str9, str16, str10);
            }
        }
    }

    public static final class d extends m implements h.f.a.m<String, String, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $middlePageUrl;
        final /* synthetic */ String $source;

        static {
            Covode.recordClassIndex(53583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Context context) {
            super(2);
            this.$source = str;
            this.$middlePageUrl = str2;
            this.$context = context;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, String str2) {
            a(str, str2);
            return z.f158842a;
        }

        public final void a(String str, String str2) {
            if (str2 == null || !(!h.m.p.a((CharSequence) str2))) {
                z.a(str);
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(str2).a();
            }
            if (l.a((Object) this.$source, (Object) "ordersubmit")) {
                String str3 = this.$middlePageUrl;
                HashMap hashMap = new HashMap();
                hashMap.put("pay_route", "h5");
                String builder = j.b(str3, hashMap).toString();
                IBulletService f2 = BulletService.f();
                Context context = this.$context;
                l.b(builder, "");
                f2.a(context, builder);
            }
        }
    }

    public static final class f extends m implements h.f.a.m<Boolean, String, z> {
        final /* synthetic */ v $paymentResultParams;
        final /* synthetic */ String $source;

        static {
            Covode.recordClassIndex(53585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(v vVar, String str) {
            super(2);
            this.$paymentResultParams = vVar;
            this.$source = str;
        }

        public final void a(final boolean z, String str) {
            l.d(str, "");
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_payroute_result", new h.f.a.b<c.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.w.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(53586);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(c.a aVar) {
                    String str;
                    c.a aVar2 = aVar;
                    l.d(aVar2, "");
                    c.a.a(aVar2, this.this$0.$paymentResultParams.f85441g);
                    aVar2.b("page_name", w.a(this.this$0.$source));
                    aVar2.b("EVENT_ORIGIN_FEATURE", "TEMAI");
                    if (z) {
                        str = "app";
                    } else {
                        str = "h5";
                    }
                    aVar2.b("pay_route", str);
                    return z.f158842a;
                }
            });
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, String str) {
            a(bool.booleanValue(), str);
            return z.f158842a;
        }
    }

    public static String a(String str, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar, Map<String, ? extends Object> map) {
        Object obj;
        p[] pVarArr = new p[1];
        if (map == null || (obj = map.get("previous_page")) == null) {
            obj = "";
        }
        pVarArr[0] = v.a("previous_page", obj);
        String builder = j.b("snssdk1180://ec/order/middle_page", ag.c(v.a("url", a(null, null, str, nVar, ag.c(pVarArr), null)))).toString();
        l.b(builder, "");
        return builder;
    }

    public static String a(String str, String str2, String str3, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n nVar, Map<String, ? extends Object> map, Integer num) {
        Boolean bool;
        String str4;
        o oVar;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p pVar;
        String str5 = com.ss.android.ugc.aweme.ecommerce.util.b.a() + "view/fe_tiktok_ecommerce_pay_middle/index.html/";
        p[] pVarArr = new p[7];
        p a2 = v.a("main_order_id", str2);
        int i2 = 0;
        pVarArr[0] = a2;
        pVarArr[1] = v.a("combo_id", str);
        String str6 = null;
        if (nVar == null || (pVar = nVar.f85328a) == null) {
            bool = null;
        } else {
            bool = pVar.isChooseSave();
        }
        if (l.a((Object) bool, (Object) true)) {
            str4 = "pay_and_bindcard";
        } else {
            str4 = "pay";
        }
        pVarArr[2] = v.a("channel_type", str4);
        pVarArr[3] = v.a("pay_source", str3);
        if (map == null) {
            map = new HashMap<>();
        }
        pVarArr[4] = v.a("trackParams", map);
        if (!(nVar == null || (oVar = nVar.f85329b) == null)) {
            str6 = oVar.c();
        }
        pVarArr[5] = v.a("pay_type", str6);
        if (num != null) {
            i2 = num.intValue();
        }
        pVarArr[6] = v.a("miss_cashback", Integer.valueOf(i2));
        String builder = j.b(str5, ag.c(pVarArr)).toString();
        l.b(builder, "");
        return builder;
    }
}
