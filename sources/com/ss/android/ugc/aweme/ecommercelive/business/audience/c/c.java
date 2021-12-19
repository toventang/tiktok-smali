package com.ss.android.ugc.aweme.ecommercelive.business.audience.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class c extends com.ss.android.ugc.aweme.ecommercelive.business.common.b.c<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> implements com.bytedance.ies.xbridge.e.d, i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f87790i = new a((byte) 0);
    private final b A = new b(new b(this), new C2124c(this));
    private final h B;
    private final h C;
    private final Context D;

    /* renamed from: c  reason: collision with root package name */
    public IIconSlot.SlotViewModel f87791c;

    /* renamed from: d  reason: collision with root package name */
    public Room f87792d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f87793e = false;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f87794f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f87795g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87796h;

    /* renamed from: k  reason: collision with root package name */
    private ab.a f87797k;

    /* renamed from: l  reason: collision with root package name */
    private String f87798l;

    /* renamed from: m  reason: collision with root package name */
    private String f87799m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private long t;
    private long u;
    private long v;
    private long w;
    private androidx.fragment.app.d x;
    private com.ss.android.ugc.aweme.ecommercelive.business.common.a.c y;
    private final h z = h.i.a((h.f.a.a) f.f87803a);

    static {
        Covode.recordClassIndex(55211);
    }

    private final a h() {
        return (a) this.B.getValue();
    }

    private final Handler i() {
        return (Handler) this.C.getValue();
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "ec_shop";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(225, new g(c.class, "onPopCardChangeStatus", com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55212);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.A;
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f87802a = new d();

        static {
            Covode.recordClassIndex(55215);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class e extends m implements h.f.a.a<a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(55216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.b<com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommercelive.business.audience.c.c.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(55217);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a aVar) {
                    String str;
                    long j2;
                    t<Boolean> tVar;
                    com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    if (aVar2.f87782a) {
                        str = "ecommerce_live_shopping_bag/ecommercelive_shopping_bag_open.json";
                    } else {
                        str = "ecommerce_live_shopping_bag/ecommercelive_shopping_bag_close.json";
                    }
                    IIconSlot.SlotViewModel slotViewModel = this.this$0.this$0.f87791c;
                    if (slotViewModel != null) {
                        slotViewModel.o = str;
                    }
                    IIconSlot.SlotViewModel slotViewModel2 = this.this$0.this$0.f87791c;
                    if (!(slotViewModel2 == null || (tVar = slotViewModel2.f12724l) == null)) {
                        tVar.setValue(true);
                    }
                    boolean z = aVar2.f87782a;
                    if (aVar2.f87782a) {
                        j2 = 200;
                    } else {
                        j2 = 0;
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b(z, j2));
                    return z.f158842a;
                }
            });
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f87803a = new f();

        static {
            Covode.recordClassIndex(55218);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "show_shop_cart_anim", false));
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return n.c(Integer.valueOf(com.ss.android.ugc.aweme.ecommercelive.business.common.a.b.f87952h));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b, com.ss.android.ugc.aweme.ecommercelive.business.common.b.c
    public final void d() {
        super.d();
        androidx.fragment.app.d dVar = this.x;
        if (dVar != null) {
            dVar.dismissAllowingStateLoss();
        }
        EventCenter.a().a("ec_live_shop_widget_on_destroy", "{}");
        com.bytedance.ies.xbridge.e.b.b("redeem_live_product_list", this);
        com.bytedance.ies.xbridge.e.b.b("ec_open_live_bag", this);
        i().removeCallbacks(h());
        cg.b(this);
    }

    public static final class b extends com.bytedance.android.live.slot.h {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f87800c;

        static {
            Covode.recordClassIndex(55213);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f87800c = cVar;
        }

        @Override // com.bytedance.android.live.slot.h
        public final void a(String str) {
            Long l2;
            l.d(str, "");
            com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87800c.f87796h;
            Room room = this.f87800c.f87792d;
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            String valueOf = String.valueOf(l2);
            Boolean bool = this.f87800c.f87793e;
            Map<String, String> map = this.f87800c.f87794f;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.f87800c.f87795g;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "icon");
                hashMap.put("label", "user_otherclick");
            }
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.b(aVar, valueOf, bool, map, hashMap, "icon", null, null);
            this.f87800c.a((c) "live_cart", (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.c.c$c  reason: collision with other inner class name */
    public static final class C2124c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f87801a;

        static {
            Covode.recordClassIndex(55214);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2124c(c cVar) {
            this.f87801a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            t<Boolean> tVar;
            IIconSlot.SlotViewModel slotViewModel = this.f87801a.f87791c;
            if (slotViewModel != null && (tVar = slotViewModel.f12724l) != null) {
                tVar.setValue(false);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b, com.ss.android.ugc.aweme.ecommercelive.business.common.b.c
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.bytedance.ies.xbridge.e.b.a("redeem_live_product_list", this);
        com.bytedance.ies.xbridge.e.b.a("ec_open_live_bag", this);
        cg.a(this);
    }

    public c(Context context) {
        l.d(context, "");
        this.D = context;
        String name = c.class.getName();
        l.b(name, "");
        this.f87796h = new com.ss.android.ugc.aweme.ecommercelive.framework.b.a(name);
        this.B = h.i.a((h.f.a.a) new e(this));
        this.C = h.i.a((h.f.a.a) d.f87802a);
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        l.d(cVar, "");
        Map<String, Object> map = null;
        if (TextUtils.equals(cVar.f35926a, "redeem_live_product_list")) {
            a("redeem_live_product_list", (Map<String, ? extends Object>) null);
        }
        if (TextUtils.equals(cVar.f35926a, "ec_open_live_bag")) {
            com.bytedance.ies.xbridge.n nVar = cVar.f35927b;
            if (nVar != null) {
                map = nVar.b();
            }
            a("ec_open_live_bag", map);
        }
    }

    @r
    public final void onPopCardChangeStatus(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a aVar) {
        l.d(aVar, "");
        long j2 = 0;
        if (((Boolean) this.z.getValue()).booleanValue()) {
            if (!aVar.f87782a && aVar.f87783b > 100) {
                j2 = aVar.f87783b - 100;
            }
            h().f87786a = aVar;
            i().postDelayed(h(), j2);
            return;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b(aVar.f87782a, 0));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
        Boolean bool;
        t<Boolean> tVar;
        t<String> tVar2;
        if (iMessage instanceof com.ss.android.ugc.aweme.ecommercelive.business.common.a.b) {
            com.ss.android.ugc.aweme.ecommercelive.business.common.a.b bVar = (com.ss.android.ugc.aweme.ecommercelive.business.common.a.b) iMessage;
            if (bVar.f87953i != com.ss.android.ugc.aweme.ecommercelive.business.common.a.b.f87949a) {
                return;
            }
            if (bVar.f87954j <= 0) {
                IIconSlot.SlotViewModel slotViewModel = this.f87791c;
                if (slotViewModel != null) {
                    com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel, false);
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.f87791c;
            if (!(slotViewModel2 == null || (tVar2 = slotViewModel2.f12715c) == null)) {
                tVar2.setValue(String.valueOf(bVar.f87954j));
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.f87791c;
            Long l2 = null;
            if (slotViewModel3 == null || (tVar = slotViewModel3.f12714b) == null) {
                bool = null;
            } else {
                bool = tVar.getValue();
            }
            if (!l.a((Object) bool, (Object) true)) {
                IIconSlot.SlotViewModel slotViewModel4 = this.f87791c;
                if (slotViewModel4 != null) {
                    com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel4, true);
                }
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87796h;
                Room room = this.f87792d;
                if (room != null) {
                    l2 = Long.valueOf(room.getId());
                }
                String valueOf = String.valueOf(l2);
                Boolean bool2 = this.f87793e;
                Map<String, String> map = this.f87794f;
                HashMap hashMap = new HashMap();
                Map<String, String> map2 = this.f87795g;
                if (map2 != null) {
                    hashMap.putAll(map2);
                    hashMap.put("refer", "icon");
                    hashMap.put("label", "user_othershow");
                }
                com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar, valueOf, bool2, map, hashMap, "icon", null, null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str, Map<String, ? extends Object> map) {
        String str2;
        String str3;
        Long l2;
        String str4;
        String str5;
        Object obj;
        t<String> tVar;
        String a2 = com.ss.android.ugc.aweme.ecommercelive.business.audience.a.a.a();
        if (a2.length() > 0) {
            Uri.Builder builder = new Uri.Builder();
            Uri parse = Uri.parse(a2);
            l.b(parse, "");
            Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t2 : queryParameterNames) {
                encodedPath.appendQueryParameter(t2, parse.getQueryParameter(t2));
            }
            Room room = this.f87792d;
            if (room == null || (str2 = room.getIdStr()) == null) {
                str2 = "";
            }
            Uri.Builder appendQueryParameter = encodedPath.appendQueryParameter("room_id", str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Room room2 = this.f87792d;
            if (room2 == null || (str3 = room2.getIdStr()) == null) {
                str3 = "";
            }
            linkedHashMap.put("room_id", str3);
            String str6 = this.f87798l;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap.put("enter_from_merge", str6);
            String str7 = this.f87799m;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap.put("enter_method", str7);
            String str8 = this.n;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("action_type", str8);
            Room room3 = this.f87792d;
            if (room3 != null) {
                l2 = Long.valueOf(room3.getOwnerUserId());
            } else {
                l2 = null;
            }
            linkedHashMap.put("author_id", String.valueOf(l2));
            linkedHashMap.put("follow_status", this.f87983j);
            IIconSlot.SlotViewModel slotViewModel = this.f87791c;
            if (slotViewModel == null || (tVar = slotViewModel.f12715c) == null || (str4 = tVar.getValue()) == null) {
                str4 = "";
            }
            l.b(str4, "");
            linkedHashMap.put("bag_product_num", str4);
            Room room4 = this.f87792d;
            if (room4 == null || (str5 = room4.getRequestId()) == null) {
                str5 = "";
            }
            linkedHashMap.put("request_id", str5);
            linkedHashMap.put("is_ad", Integer.valueOf(l.a(this.f87793e, true) ? 1 : 0));
            Map<String, String> map2 = this.f87794f;
            if (map2 != null) {
                linkedHashMap.put("effect_ad_extra", map2);
            }
            String str9 = this.o;
            if (str9 != null && str9.length() > 0) {
                linkedHashMap.put("rec_content_id", str9);
            }
            String str10 = this.p;
            if (str10 != null && str10.length() > 0) {
                linkedHashMap.put("rec_content_type", str10);
            }
            if (!(!TextUtils.equals(str, "ec_open_live_bag") || map == null || (obj = map.get("track_params")) == null)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.Any>");
                linkedHashMap.putAll((Map) obj);
            }
            if (TextUtils.equals(str, "live_cart")) {
                linkedHashMap.put("enter_from", "live_cart");
            }
            String str11 = this.r;
            if (str11 == null) {
                str11 = "";
            }
            linkedHashMap.put("search_id", str11);
            String str12 = this.s;
            if (str12 == null) {
                str12 = "";
            }
            linkedHashMap.put("search_result_id", str12);
            appendQueryParameter.appendQueryParameter("track_params", dg.a().b(linkedHashMap));
            if (TextUtils.equals(str, "ec_open_live_bag") && map != null) {
                builder.appendQueryParameter("page_params", dg.a().b(map.get("content_params")));
            }
            String uri = builder.build().toString();
            l.b(uri, "");
            SmartRouter.buildRoute(this.D, uri).open();
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(ac acVar, ab.a aVar) {
        String str;
        Long l2;
        Long l3;
        String str2;
        String str3;
        int i2;
        Long l4;
        Long l5;
        String str4;
        t<String> tVar;
        User owner;
        FollowInfo followInfo;
        t<Drawable> tVar2;
        t<Drawable> tVar3;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        String str5 = "";
        l.d(slotViewModel, str5);
        l.d(aVar, str5);
        super.a(slotViewModel, aVar);
        Drawable a2 = androidx.core.content.b.a(this.D, (int) R.drawable.a6k);
        if (!(a2 == null || (tVar3 = slotViewModel.f12717e) == null)) {
            tVar3.setValue(a2);
        }
        Drawable a3 = androidx.core.content.b.a(this.D, (int) R.drawable.aii);
        if (!(a3 == null || (tVar2 = slotViewModel.f12718f) == null)) {
            tVar2.setValue(a3);
        }
        slotViewModel.o = "ecommerce_live_shopping_bag/ecommercelive_shopping_bag_open.json";
        slotViewModel.n = "ecommerce_live_shopping_bag/images";
        t<String> tVar4 = slotViewModel.f12721i;
        if (tVar4 != null) {
            tVar4.setValue(this.D.getString(R.string.eg4));
        }
        this.f87791c = slotViewModel;
        this.f87797k = aVar;
        Room room = this.f87792d;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (str = String.valueOf(followInfo.getFollowStatus())) == null) {
            str = "-1";
        }
        l.d(str, str5);
        this.f87983j = str;
        com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.f87796h;
        Room room2 = this.f87792d;
        Long l6 = null;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        aVar2.a("author_id", String.valueOf(l2), false);
        aVar2.a("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        Room room3 = this.f87792d;
        if (room3 != null) {
            l3 = Long.valueOf(room3.getId());
        } else {
            l3 = null;
        }
        aVar2.a("room_id", String.valueOf(l3), false);
        String str6 = this.f87798l;
        if (str6 == null) {
            str6 = str5;
        }
        aVar2.a("enter_from_merge", str6, false);
        String str7 = this.f87799m;
        if (str7 == null) {
            str7 = str5;
        }
        aVar2.a("enter_method", str7, false);
        String str8 = this.n;
        if (str8 == null) {
            str8 = str5;
        }
        aVar2.a("action_type", str8, false);
        aVar2.a("carrier_type", "live_cart_tag", false);
        aVar2.a("page_type", "live", false);
        aVar2.a("anchor_show_type", "live_cart_tag", false);
        aVar2.a("follow_status", this.f87983j, false);
        aVar2.a("entrance_form", "live_cart", false);
        aVar2.a("page_name", "live", false);
        if (l.a((Object) this.f87793e, (Object) true)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar2.a("is_ad", str2, false);
        aVar2.a("rec_content_id", this.o, false);
        aVar2.a("rec_content_type", this.p, false);
        Room room4 = this.f87792d;
        if (room4 != null) {
            str3 = room4.getRequestId();
        } else {
            str3 = null;
        }
        aVar2.a("request_id", str3, true);
        String str9 = this.r;
        if (str9 == null) {
            str9 = str5;
        }
        aVar2.a("search_id", str9, false);
        String str10 = this.s;
        if (str10 != null) {
            str5 = str10;
        }
        aVar2.a("search_result_id", str5, false);
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.c cVar = this.y;
        if (cVar != null && (i2 = cVar.f87957a) > 0) {
            IIconSlot.SlotViewModel slotViewModel2 = this.f87791c;
            if (!(slotViewModel2 == null || (tVar = slotViewModel2.f12715c) == null)) {
                tVar.postValue(String.valueOf(i2));
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.f87791c;
            if (slotViewModel3 != null) {
                com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel3, true);
            }
            com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.f87796h;
            Room room5 = this.f87792d;
            if (room5 != null) {
                l4 = Long.valueOf(room5.getId());
            } else {
                l4 = null;
            }
            String valueOf = String.valueOf(l4);
            Boolean bool = this.f87793e;
            Map<String, String> map = this.f87794f;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.f87795g;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "icon");
                hashMap.put("label", "user_othershow");
            }
            com.ss.android.ugc.aweme.ecommercelive.business.common.b.b.a(aVar3, valueOf, bool, map, hashMap, "icon", null, null);
            if (this.t > 0) {
                long j2 = this.u;
                if (j2 > 0) {
                    long j3 = this.v;
                    if (j3 > 0 && this.w > 0 && j3 > j2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j4 = this.t;
                        long j5 = currentTimeMillis - j4;
                        long j6 = this.u;
                        long j7 = j6 - j4;
                        long j8 = this.v;
                        long j9 = j8 - j6;
                        long j10 = this.w - j8;
                        long currentTimeMillis2 = System.currentTimeMillis() - this.w;
                        Room room6 = this.f87792d;
                        if (room6 != null) {
                            str4 = room6.getIdStr();
                        } else {
                            str4 = null;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("room_id", str4);
                            jSONObject.put("total_duration", j5);
                            jSONObject.put("before_enter_room_interface_duration", j7);
                            jSONObject.put("enter_room_interface_duration", j9);
                            jSONObject.put("live_process_data_duration", j10);
                            jSONObject.put("ec_process_data_duration", currentTimeMillis2);
                            com.ss.android.ugc.aweme.common.r.a("rd_tiktokec_live_shopping_bag_show", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            Room room7 = this.f87792d;
            if (room7 != null) {
                l5 = Long.valueOf(room7.getOwnerUserId());
            } else {
                l5 = null;
            }
            String valueOf2 = String.valueOf(l5);
            Room room8 = this.f87792d;
            if (room8 != null) {
                l6 = Long.valueOf(room8.getId());
            }
            a(new com.ss.android.ugc.aweme.ecommercelive.business.common.b.e("rd_tiktokec_audience_icon_show", valueOf2, String.valueOf(l6)));
        }
        String str11 = this.q;
        if (str11 != null) {
            SmartRouter.buildRoute(this.D, str11).open();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115 A[Catch:{ Exception -> 0x0155 }] */
    @Override // com.bytedance.android.live.slot.ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, com.bytedance.android.live.slot.ab.b r9) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.audience.c.c.a(java.util.Map, com.bytedance.android.live.slot.ab$b):void");
    }
}
