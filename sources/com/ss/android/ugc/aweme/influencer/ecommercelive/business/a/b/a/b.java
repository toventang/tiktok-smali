package com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.h;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e.d;
import com.bytedance.ies.xbridge.n;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b extends com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f104535f = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public IIconSlot.SlotViewModel f104536c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a f104537d = new com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a("ECDuringLiveBroadcasterWidget");

    /* renamed from: e  reason: collision with root package name */
    public final Context f104538e;

    /* renamed from: g  reason: collision with root package name */
    private ab.a f104539g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.a.a f104540h;

    /* renamed from: i  reason: collision with root package name */
    private final a f104541i = new a(new C2663b(this));

    /* renamed from: j  reason: collision with root package name */
    private Room f104542j;

    static {
        Covode.recordClassIndex(66971);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "ec_shop";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f104541i;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.ab, com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.b, com.bytedance.android.live.slot.b
    public final void d() {
        super.d();
        i();
        com.bytedance.ies.xbridge.e.b.b("set_live_continue", this);
        com.bytedance.ies.xbridge.e.b.b("talent_live_product_has_pin", this);
    }

    /* access modifiers changed from: package-private */
    public final String h() {
        String valueOf;
        Room room = this.f104542j;
        if (room == null || (valueOf = String.valueOf(room.getId())) == null) {
            return "0";
        }
        return valueOf;
    }

    private final String j() {
        Long l2;
        com.bytedance.android.live.base.model.user.b author;
        String valueOf;
        Room room = this.f104542j;
        if (room != null && (author = room.author()) != null && (valueOf = String.valueOf(author.getId())) != null) {
            return valueOf;
        }
        f b2 = u.a().b();
        if (b2 != null) {
            l2 = Long.valueOf(b2.c());
        } else {
            l2 = null;
        }
        return String.valueOf(l2);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.b$b  reason: collision with other inner class name */
    public static final class C2663b extends h {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f104543c;

        static {
            Covode.recordClassIndex(66973);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2663b(b bVar) {
            super((byte) 0);
            this.f104543c = bVar;
        }

        @Override // com.bytedance.android.live.slot.h
        public final void a(String str) {
            t<String> tVar;
            l.d(str, "");
            SmartRouter.buildRoute(this.f104543c.f104538e, p.a(p.a(p.a(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.a.a(), "_roomId_", this.f104543c.h(), false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false)).open();
            IIconSlot.SlotViewModel slotViewModel = this.f104543c.f104536c;
            if (!(slotViewModel == null || (tVar = slotViewModel.f12723k) == null)) {
                tVar.setValue("");
            }
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.a.b(this.f104543c.f104537d);
        }
    }

    public b(Context context) {
        l.d(context, "");
        this.f104538e = context;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(String str) {
        if (l.a((Object) str, (Object) "during_live")) {
            bz unused = i.a(an.a(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.b.b.f104575b), null, null, new c(this, null), 3);
            a(new com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.d("rd_tiktokec_during_live_icon_show", j(), h()));
        }
        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.a.a(this.f104537d);
    }

    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            t<String> tVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                if (ay.a(800, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a.a.b("need_show_ec_tip_in_living_room")) {
                IIconSlot.SlotViewModel slotViewModel = this.this$0.f104536c;
                if (slotViewModel != null) {
                    slotViewModel.f12725m = 15000;
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.this$0.f104536c;
                if (!(slotViewModel2 == null || (tVar = slotViewModel2.f12723k) == null)) {
                    tVar.setValue(this.this$0.f104538e.getResources().getString(R.string.es));
                }
                com.ss.android.ugc.aweme.influencer.ecommercelive.framework.b.a.a.a("need_show_ec_tip_in_living_room");
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        t<Drawable> tVar;
        boolean z;
        com.bytedance.android.livesdk.tunnel.a aVar;
        l.d(cVar, "");
        Context context = this.f104538e;
        androidx.l.a.a.i iVar = null;
        if (!(context instanceof e)) {
            context = null;
        }
        e eVar = (e) context;
        if (eVar != null) {
            boolean z2 = false;
            if (l.a((Object) "set_live_continue", (Object) cVar.f35926a)) {
                n nVar = cVar.f35927b;
                if (nVar != null) {
                    z = com.bytedance.ies.xbridge.i.a(nVar, "continue", false);
                } else {
                    z = true;
                }
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                t<com.bytedance.android.livesdk.tunnel.a> tVar2 = s.q().a(eVar).f21745a;
                if (z) {
                    aVar = com.bytedance.android.livesdk.tunnel.a.STREAM_ON;
                } else {
                    aVar = com.bytedance.android.livesdk.tunnel.a.STREAM_PAUSE;
                }
                tVar2.setValue(aVar);
            } else if (l.a((Object) "talent_live_product_has_pin", (Object) cVar.f35926a)) {
                n nVar2 = cVar.f35927b;
                if (nVar2 != null) {
                    z2 = com.bytedance.ies.xbridge.i.a(nVar2, "hasPin", false);
                }
                IIconSlot.SlotViewModel slotViewModel = this.f104536c;
                if (slotViewModel != null && (tVar = slotViewModel.f12720h) != null) {
                    if (z2) {
                        iVar = androidx.l.a.a.i.a(eVar.getResources(), R.drawable.a6d, null);
                    }
                    tVar.setValue(iVar);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(ac acVar, ab.a aVar) {
        int i2;
        IIconSlot.SlotViewModel slotViewModel;
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) acVar;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.c.a(slotViewModel2);
        t<Drawable> tVar = slotViewModel2.f12717e;
        l.b(tVar, "");
        tVar.setValue(androidx.core.content.a.f.a(this.f104538e.getResources(), 2131231942, null));
        t<Drawable> tVar2 = slotViewModel2.f12718f;
        l.b(tVar2, "");
        tVar2.setValue(androidx.core.content.a.f.a(this.f104538e.getResources(), 2131231943, null));
        t<String> tVar3 = slotViewModel2.f12721i;
        l.b(tVar3, "");
        tVar3.setValue(this.f104538e.getString(R.string.eg4));
        t<Drawable> tVar4 = slotViewModel2.f12719g;
        l.b(tVar4, "");
        tVar4.setValue(androidx.core.content.b.a(this.f104538e, (int) R.drawable.a6a));
        t<String> tVar5 = slotViewModel2.f12722j;
        l.b(tVar5, "");
        tVar5.setValue(this.f104538e.getString(R.string.f5));
        this.f104536c = slotViewModel2;
        this.f104539g = aVar;
        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.a.a aVar2 = this.f104540h;
        if (!(aVar2 == null || (i2 = aVar2.f104544a) <= 0 || (slotViewModel = this.f104536c) == null)) {
            slotViewModel.p = Integer.valueOf(i2);
        }
        com.bytedance.ies.xbridge.e.b.a("set_live_continue", this, "ECDuringLiveBroadcasterWidget");
        com.bytedance.ies.xbridge.e.b.a("talent_live_product_has_pin", this, "ECDuringLiveBroadcasterWidget");
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, ? extends Object> map, ab.b bVar) {
        CommerceStruct commerceStruct;
        String str;
        CommerceStruct commerceStruct2;
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_room");
        com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.a.a aVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        Room room = (Room) obj;
        this.f104542j = room;
        boolean z = true;
        if (room == null || (commerceStruct2 = room.getCommerceStruct()) == null || commerceStruct2.commercePermission != 1) {
            z = false;
        }
        Room room2 = this.f104542j;
        if (!(room2 == null || (commerceStruct = room2.getCommerceStruct()) == null || (str = commerceStruct.oecInitDataString) == null)) {
            try {
                aVar = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.a.a) new com.google.gson.f().a(str, com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.a.a.class);
            } catch (Exception unused) {
            }
        }
        this.f104540h = aVar;
        com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a aVar2 = this.f104537d;
        String h2 = h();
        aVar2.a("anchor_id", j());
        aVar2.a("EVENT_ORIGIN_FEATURE", "TEMAI");
        aVar2.a("room_id", h2);
        aVar2.a("live_status", "during_live");
        bVar.a(z);
    }
}
