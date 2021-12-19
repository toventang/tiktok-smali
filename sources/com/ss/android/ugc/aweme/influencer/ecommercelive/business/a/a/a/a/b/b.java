package com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.slot.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ProductApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.f;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;

public final class b extends com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> implements v, com.bytedance.ies.xbridge.e.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f104525f = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a f104526c;

    /* renamed from: d  reason: collision with root package name */
    public IIconSlot.SlotViewModel f104527d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f104528e;

    /* renamed from: g  reason: collision with root package name */
    private final a f104529g = new a(new c(this));

    /* renamed from: h  reason: collision with root package name */
    private ab.a f104530h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b$b  reason: collision with other inner class name */
    public static final class C2661b extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2661b(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(66962);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "ec_shop";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66963);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f104529g;
    }

    public static String h() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // com.bytedance.android.live.slot.ab, com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.b, com.bytedance.android.live.slot.b
    public final void d() {
        super.d();
        com.bytedance.ies.xbridge.e.b.b("talent_live_product_list_num", this);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(String str) {
        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.a.a(this.f104526c);
        a(new com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.d("rd_tiktokec_before_live_icon_show", h(), "0"));
    }

    static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $updateStartTime;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$updateStartTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, this.$updateStartTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                ((ProductApi) com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.a.a(ProductApi.class, "https://oec-api.tiktokv.com")).getProductsCount("0", true).enqueue(new com.bytedance.retrofit2.d<BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.a.a>>(this) {
                    /* class com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f104532a;

                    static {
                        Covode.recordClassIndex(66967);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f104532a = r1;
                    }

                    @Override // com.bytedance.retrofit2.d
                    public final void a(com.bytedance.retrofit2.b<BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.a.a>> bVar, Throwable th) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - this.f104532a.$updateStartTime;
                        String h2 = b.h();
                        f fVar = f.RoomOwner;
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.c.a(h2, false, currentTimeMillis, "0", fVar, -7, str);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
                        if (r11 == null) goto L_0x0085;
                     */
                    @Override // com.bytedance.retrofit2.d
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.a.a>> r10, com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.a.a>> r11) {
                        /*
                        // Method dump skipped, instructions count: 147
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b.d.AnonymousClass1.a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                    }
                });
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(Context context) {
        l.d(context, "");
        this.f104528e = context;
        String name = b.class.getName();
        l.b(name, "");
        this.f104526c = new com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a(name);
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        t<String> tVar;
        String str = "";
        l.d(cVar, str);
        if (l.a((Object) "talent_live_product_list_num", (Object) cVar.f35926a)) {
            n nVar = cVar.f35927b;
            int i2 = 0;
            if (nVar != null) {
                i2 = i.a(nVar, "productNum", 0);
            }
            IIconSlot.SlotViewModel slotViewModel = this.f104527d;
            if (slotViewModel != null && (tVar = slotViewModel.f12715c) != null) {
                if (i2 > 0) {
                    str = String.valueOf(i2);
                }
                tVar.setValue(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.bytedance.android.live.slot.v
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b.a(h.c.d):java.lang.Object");
    }

    static final class c implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104531a;

        static {
            Covode.recordClassIndex(66965);
        }

        c(b bVar) {
            this.f104531a = bVar;
        }

        @Override // com.bytedance.android.live.slot.ae
        public final void a(View view, String str) {
            SmartRouter.buildRoute(this.f104531a.f104528e, p.a(p.a(p.a(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.a.a(), "_roomId_", "0", false), "_isLiving_", "false", false), "_liveStatus_", "before_live", false)).open();
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.a.b(this.f104531a.f104526c);
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, ? extends Object> map, ab.b bVar) {
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_live_commercial");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        this.f104526c.a("anchor_id", h());
        this.f104526c.a("EVENT_ORIGIN_FEATURE", "TEMAI");
        this.f104526c.a("room_id", "0");
        this.f104526c.a("live_status", "before_live");
        bVar.a(l.a(obj, (Object) true));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(ac acVar, ab.a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        l.d(slotViewModel, "");
        l.d(aVar, "");
        super.a(slotViewModel, aVar);
        this.f104527d = slotViewModel;
        this.f104530h = aVar;
        if (slotViewModel != null) {
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.c.a(slotViewModel);
            t<Drawable> tVar = slotViewModel.f12717e;
            l.b(tVar, "");
            tVar.setValue(androidx.core.content.b.a(this.f104528e, (int) R.drawable.a6e));
            t<String> tVar2 = slotViewModel.f12721i;
            l.b(tVar2, "");
            tVar2.setValue(this.f104528e.getString(R.string.fc));
            t<Drawable> tVar3 = slotViewModel.f12719g;
            l.b(tVar3, "");
            tVar3.setValue(androidx.core.content.b.a(this.f104528e, (int) R.drawable.a6a));
            t<String> tVar4 = slotViewModel.f12722j;
            l.b(tVar4, "");
            tVar4.setValue(this.f104528e.getString(R.string.f5));
            if (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a.a.b("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM")) {
                t<Boolean> tVar5 = slotViewModel.f12716d;
                l.b(tVar5, "");
                tVar5.setValue(true);
                com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a.a.a("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM");
            } else {
                bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.b.b.f104574a), null, null, new d(this, System.currentTimeMillis(), null), 3);
            }
        }
        com.bytedance.ies.xbridge.e.b.a("talent_live_product_list_num", this, "ECProductBeforeLiveWidget");
    }
}
