package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.framework.b.b;
import com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ugc.live.sdk.message.data.IMessage;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class d extends com.bytedance.android.live.slot.b<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> {
    public static final a r = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d f87929c;

    /* renamed from: d  reason: collision with root package name */
    public IFrameSlot.SlotViewModel f87930d;

    /* renamed from: e  reason: collision with root package name */
    public ab.a f87931e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87932f;

    /* renamed from: g  reason: collision with root package name */
    public Room f87933g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f87934h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f87935i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f87936j;

    /* renamed from: k  reason: collision with root package name */
    long f87937k;

    /* renamed from: l  reason: collision with root package name */
    long f87938l;

    /* renamed from: m  reason: collision with root package name */
    long f87939m;
    long n;
    public com.ss.android.ugc.aweme.ecommercelive.business.common.a.c o;
    com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b p;
    public final Handler q;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private final Context z;

    static {
        Covode.recordClassIndex(55289);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "ec_shop";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55290);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e extends com.google.gson.b.a<Map<String, ? extends String>> {
        static {
            Covode.recordClassIndex(55294);
        }

        e() {
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f87929c;
    }

    public static String h() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* synthetic */ Enum e() {
        if (com.ss.android.ugc.aweme.ecommercelive.business.audience.a.c.a().f87741a) {
            return IFrameSlot.b.SLOT_LIVE_WATCHER_L2_POP;
        }
        return IFrameSlot.b.SLOT_LIVE_BOTTOM_POP;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return n.c(Integer.valueOf(com.ss.android.ugc.aweme.ecommercelive.business.common.a.b.f87952h));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void d() {
        super.d();
        this.q.removeCallbacksAndMessages(null);
        this.f87929c.f87836b = null;
        this.p.a();
        this.f87929c.f();
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void b() {
        Object obj;
        t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.f87930d;
        if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (l.a(obj, (Object) true)) {
            this.f87932f.a("start_time", System.currentTimeMillis());
            this.f87929c.d();
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void c() {
        Object obj;
        t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.f87930d;
        if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (l.a(obj, (Object) true)) {
            c("other");
            this.f87929c.e();
        }
    }

    private final void d(String str) {
        this.f87929c.a(str);
        this.p.a(str);
    }

    static final class b implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f87940a;

        static {
            Covode.recordClassIndex(55291);
        }

        b(d dVar) {
            this.f87940a = dVar;
        }

        public final boolean handleMessage(Message message) {
            Object obj;
            t<Pair<Boolean, String>> tVar;
            Pair<Boolean, String> value;
            l.d(message, "");
            IFrameSlot.SlotViewModel slotViewModel = this.f87940a.f87930d;
            if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
                obj = null;
            } else {
                obj = value.first;
            }
            if (l.a(obj, (Object) true)) {
                IFrameSlot.SlotViewModel slotViewModel2 = this.f87940a.f87930d;
                if (slotViewModel2 != null) {
                    com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel2, false);
                }
                if (!ActivityStack.isAppBackGround()) {
                    this.f87940a.c("time_out");
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.d$d  reason: collision with other inner class name */
    static final class C2131d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFrameSlot.SlotViewModel f87941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f87942b;

        static {
            Covode.recordClassIndex(55293);
        }

        C2131d(IFrameSlot.SlotViewModel slotViewModel, d dVar) {
            this.f87941a = slotViewModel;
            this.f87942b = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            Pair pair = (Pair) obj;
            if (l.a(pair.first, (Object) false) && (str = (String) pair.second) != null && str.hashCode() == -1210684352 && str.equals("visibility_reason_conflict")) {
                this.f87942b.c("conflict");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $startTime;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(55295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, long j2, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$startTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$startTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label == 0) {
                r.a(obj);
                AudienceProductListApi audienceProductListApi = (AudienceProductListApi) com.ss.android.ugc.aweme.ecommercelive.framework.network.a.a(AudienceProductListApi.class, "https://oec-api.tiktokv.com");
                Room room = this.this$0.f87933g;
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = "";
                }
                audienceProductListApi.getIntroduceProduct(str, h.c.b.a.b.a(1)).enqueue(new com.bytedance.retrofit2.d<BaseResponse<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b>>(this) {
                    /* class com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.d.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f87943a;

                    static {
                        Covode.recordClassIndex(55296);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f87943a = r1;
                    }

                    @Override // com.bytedance.retrofit2.d
                    public final void a(com.bytedance.retrofit2.b<BaseResponse<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b>> bVar, Throwable th) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - this.f87943a.$startTime;
                        String h2 = d.h();
                        Room room = this.f87943a.this$0.f87933g;
                        String str2 = null;
                        if (room != null) {
                            str = String.valueOf(room.getId());
                        } else {
                            str = null;
                        }
                        if (th != null) {
                            str2 = th.getMessage();
                        }
                        com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(h2, str, false, currentTimeMillis, -7, str2);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
                        if (r12 != null) goto L_0x0075;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
                        if (r12 != null) goto L_0x007f;
                     */
                    @Override // com.bytedance.retrofit2.d
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b>> r11, com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b>> r12) {
                        /*
                        // Method dump skipped, instructions count: 151
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.d.f.AnonymousClass1.a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                    }
                });
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ z.a $needDelay;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(55292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, z.a aVar, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$needDelay = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$needDelay, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                if (this.$needDelay.element) {
                    this.label = 1;
                    if (ay.a(400, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bz unused = i.a(an.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88026a), null, null, new f(this.this$0, System.currentTimeMillis(), null), 3);
            return h.z.f158842a;
        }
    }

    public d(Context context) {
        com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d aVar;
        l.d(context, "");
        this.z = context;
        if (com.ss.android.ugc.aweme.ecommercelive.business.audience.a.c.a().f87741a) {
            aVar = new com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.d();
        } else {
            aVar = new com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.a();
        }
        this.f87929c = aVar;
        String name = d.class.getName();
        l.b(name, "");
        this.f87932f = new com.ss.android.ugc.aweme.ecommercelive.framework.b.a(name);
        this.f87934h = false;
        this.f87935i = new HashMap();
        this.p = new c(this);
        this.q = new Handler(new b(this));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
        Object obj;
        t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        if (iMessage instanceof com.ss.android.ugc.aweme.ecommercelive.business.common.a.b) {
            int i2 = ((com.ss.android.ugc.aweme.ecommercelive.business.common.a.b) iMessage).f87953i;
            if (i2 == com.ss.android.ugc.aweme.ecommercelive.business.common.a.b.f87951g) {
                d("unpin");
            } else if (i2 == com.ss.android.ugc.aweme.ecommercelive.business.common.a.b.f87950f) {
                this.f87932f.a("client_received_time", System.currentTimeMillis());
                z.a aVar = new z.a();
                aVar.element = false;
                IFrameSlot.SlotViewModel slotViewModel = this.f87930d;
                if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
                    obj = null;
                } else {
                    obj = value.first;
                }
                if (l.a(obj, (Object) true)) {
                    aVar.element = true;
                }
                d("repin");
                bz unused = i.a(an.a(com.ss.android.ugc.aweme.ecommercelive.framework.d.a.b.f88027b), null, null, new c(this, aVar, null), 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (str == null || str.length() == 0 || !(this.f87929c instanceof com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.a)) {
            if (!(this.p instanceof c)) {
                this.p = new c(this);
            }
            com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d.a(this.f87929c, this.z);
            return;
        }
        if (!(this.p instanceof b)) {
            this.p = new b(this);
        }
        this.f87929c.a(this.z, true, str, this.f87935i);
    }

    public final void c(String str) {
        l.d(str, "");
        this.f87932f.a("quit_type", str, false);
        this.f87932f.a("stay_time", System.currentTimeMillis() - this.f87932f.d("start_time"));
        this.p.b(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(IFrameSlot.SlotViewModel slotViewModel, ab.a aVar) {
        String str;
        Long l2;
        Long l3;
        String str2;
        String str3;
        com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a aVar2;
        User owner;
        FollowInfo followInfo;
        IFrameSlot.SlotViewModel slotViewModel2 = slotViewModel;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        Context context = this.z;
        String str4 = null;
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null) {
            slotViewModel2.f12709a.observe(eVar, new C2131d(slotViewModel2, this));
        }
        this.f87930d = slotViewModel2;
        this.f87931e = aVar;
        Room room = this.f87933g;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (str = String.valueOf(followInfo.getFollowStatus())) == null) {
            str = "-1";
        }
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.f87932f;
        Room room2 = this.f87933g;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        aVar3.a("author_id", String.valueOf(l2), false);
        aVar3.a("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        Room room3 = this.f87933g;
        if (room3 != null) {
            l3 = Long.valueOf(room3.getId());
        } else {
            l3 = null;
        }
        aVar3.a("room_id", String.valueOf(l3), false);
        String str5 = this.s;
        if (str5 == null) {
            str5 = "";
        }
        aVar3.a("enter_from_merge", str5, false);
        String str6 = this.t;
        if (str6 == null) {
            str6 = "";
        }
        aVar3.a("enter_method", str6, false);
        String str7 = this.u;
        if (str7 == null) {
            str7 = "";
        }
        aVar3.a("action_type", str7, false);
        aVar3.a("carrier_type", "live_popup_card", false);
        aVar3.a("page_type", "live", false);
        aVar3.a("anchor_show_type", "live_popup_card", false);
        aVar3.a("item_order", 1);
        aVar3.a("follow_status", str, false);
        aVar3.a("entrance_form", "live_popup_card", false);
        aVar3.a("page_name", "live", false);
        if (l.a((Object) this.f87934h, (Object) true)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar3.a("is_ad", str2, false);
        Map<String, String> map = this.f87935i;
        l.d("effect_ad_extra", "");
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.Any");
        com.ss.android.ugc.aweme.ecommercelive.framework.b.b bVar = com.ss.android.ugc.aweme.ecommercelive.framework.b.b.f88015a;
        b.a aVar4 = aVar3.f88014a;
        if (aVar4 == null) {
            l.b();
        }
        Map<String, Object> a2 = bVar.a(aVar4);
        if (map == null) {
            a2.remove("effect_ad_extra");
        } else {
            a2.put("effect_ad_extra", map);
        }
        aVar3.a("rec_content_id", this.v, false);
        aVar3.a("rec_content_type", this.y, false);
        Room room4 = this.f87933g;
        if (room4 != null) {
            str3 = room4.getRequestId();
        } else {
            str3 = null;
        }
        aVar3.a("request_id", str3, true);
        aVar3.a("traffic_source", "live", false);
        aVar3.a("search_id", this.w, false);
        aVar3.a("search_result_id", this.x, false);
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.c cVar = this.o;
        if (!(cVar == null || (aVar2 = cVar.f87958b) == null)) {
            PopupCardVO a3 = PopupCardVO.a.a(aVar2);
            a3.setPromotionSkin(cVar.f87960d);
            a3.setBagIndex(cVar.f87962f);
            this.f87929c.a(a3);
        }
        this.f87929c.a(this.f87932f);
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.c cVar2 = this.o;
        if (cVar2 != null) {
            str4 = cVar2.f87961e;
        }
        b(str4);
        this.p.a(this.o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016d A[Catch:{ Exception -> 0x01ad }] */
    @Override // com.bytedance.android.live.slot.ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, com.bytedance.android.live.slot.ab.b r11) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.d.a(java.util.Map, com.bytedance.android.live.slot.ab$b):void");
    }
}
