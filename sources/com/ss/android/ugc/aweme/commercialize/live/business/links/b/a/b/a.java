package com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.slot.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.business.links.api.BusinessLinksLiveApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.android.live.slot.b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> implements v, i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final C1688a f74569i = new C1688a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public ab.a f74570c;

    /* renamed from: d  reason: collision with root package name */
    public IIconSlot.SlotViewModel f74571d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.live.business.links.d.a f74572e;

    /* renamed from: f  reason: collision with root package name */
    public String f74573f;

    /* renamed from: g  reason: collision with root package name */
    public String f74574g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.app.f.d f74575h;

    /* renamed from: j  reason: collision with root package name */
    private final Keva f74576j = Keva.getRepo("commercialize_live_business_links_keva_name");

    /* renamed from: k  reason: collision with root package name */
    private final f.a.b.a f74577k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    private final Handler f74578l = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f74583a = new e();

        static {
            Covode.recordClassIndex(45987);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45981);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "business_links";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(181, new g(a.class, "listenToLinksLiveEvent", com.ss.android.ugc.aweme.commercialize.live.business.links.f.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$a  reason: collision with other inner class name */
    public static final class C1688a {
        static {
            Covode.recordClassIndex(45982);
        }

        private C1688a() {
        }

        public /* synthetic */ C1688a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
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
    public final /* synthetic */ Object f() {
        return new com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.a.a(new b(this));
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74580a;

        static {
            Covode.recordClassIndex(45985);
        }

        c(a aVar) {
            this.f74580a = aVar;
        }

        public final void run() {
            t<String> tVar;
            IIconSlot.SlotViewModel slotViewModel = this.f74580a.f74571d;
            if (slotViewModel != null && (tVar = slotViewModel.f12715c) != null) {
                tVar.setValue(new String());
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void d() {
        com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar;
        super.d();
        ab.a aVar2 = this.f74570c;
        if (!(aVar2 == null || (aVar = this.f74572e) == null)) {
            Context a2 = aVar2.a();
            l.b(a2, "");
            aVar.b(a2);
        }
        this.f74577k.dispose();
        cg.b(this);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        cg.a(this);
    }

    private final void a(boolean z) {
        f.a.b.b a2 = ((BusinessLinksLiveApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(BusinessLinksLiveApi.class)).getActiveLinksCount().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, z), e.f74583a);
        l.b(a2, "");
        f.a.j.a.a(a2, this.f74577k);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f74582b;

        static {
            Covode.recordClassIndex(45986);
        }

        d(a aVar, boolean z) {
            this.f74581a = aVar;
            this.f74582b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            t<Boolean> tVar;
            t<String> tVar2;
            t<Boolean> tVar3;
            com.ss.android.ugc.aweme.commercialize.live.business.links.f.d dVar = (com.ss.android.ugc.aweme.commercialize.live.business.links.f.d) obj;
            if (dVar.getTotal() > 0) {
                IIconSlot.SlotViewModel slotViewModel = this.f74581a.f74571d;
                if (!(slotViewModel == null || (tVar3 = slotViewModel.f12716d) == null)) {
                    tVar3.setValue(false);
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.f74581a.f74571d;
                if (slotViewModel2 != null && (tVar2 = slotViewModel2.f12715c) != null) {
                    tVar2.setValue(String.valueOf(dVar.getTotal()));
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.f74581a.f74571d;
            if (slotViewModel3 != null && (tVar = slotViewModel3.f12716d) != null) {
                tVar.setValue(Boolean.valueOf(!this.f74582b));
            }
        }
    }

    @Override // com.bytedance.android.live.slot.v
    public final Object a(h.c.d<? super Boolean> dVar) {
        try {
            f.a.ab<BaseResponse> clearBusinessLinksCards = ((BusinessLinksLiveApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(BusinessLinksLiveApi.class)).clearBusinessLinksCards();
            f.a.e.d.g gVar = new f.a.e.d.g();
            clearBusinessLinksCards.a_(gVar);
            if (((BaseResponse) gVar.a()).status_code != 0) {
                return false;
            }
            this.f74578l.post(new c(this));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @r
    public final void listenToLinksLiveEvent(com.ss.android.ugc.aweme.commercialize.live.business.links.f.e eVar) {
        IIconSlot.SlotViewModel slotViewModel;
        t<String> tVar;
        String str;
        com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar;
        l.d(eVar, "");
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.g gVar = eVar.f74634a;
        if (gVar != null && l.a((Object) gVar.f74639b, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.j.BEFORE_LIVE.getValue())) {
            String str2 = gVar.f74638a;
            if (l.a((Object) str2, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.CLOSE.getValue())) {
                ab.a aVar2 = this.f74570c;
                if (aVar2 != null && (aVar = this.f74572e) != null) {
                    Context a2 = aVar2.a();
                    l.b(a2, "");
                    aVar.b(a2);
                }
            } else if (l.a((Object) str2, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.COUNT.getValue()) && (slotViewModel = this.f74571d) != null && (tVar = slotViewModel.f12715c) != null) {
                if (gVar.f74640c > 0) {
                    str = String.valueOf(gVar.f74640c);
                } else {
                    str = new String();
                }
                tVar.setValue(str);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(String str) {
        com.ss.android.ugc.aweme.app.f.d a2;
        com.ss.android.ugc.aweme.app.f.d a3;
        super.a(str);
        if (str != null) {
            com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", h()).a("room_id", "").a("live_status", "before_live").a("enter_from_merge", this.f74573f).a("enter_method", this.f74574g);
            l.b(a4, "");
            this.f74575h = a4;
            int hashCode = str.hashCode();
            Map<String, String> map = null;
            if (hashCode != -1095106132) {
                if (hashCode == 387613079 && str.equals("before_live_dialog_item")) {
                    com.ss.android.ugc.aweme.app.f.d dVar = this.f74575h;
                    if (!(dVar == null || (a3 = dVar.a(StringSet.type, "subpage")) == null)) {
                        map = a3.f66730a;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_show", map);
                }
            } else if (str.equals("before_live")) {
                com.ss.android.ugc.aweme.app.f.d dVar2 = this.f74575h;
                if (!(dVar2 == null || (a2 = dVar2.a(StringSet.type, "toolbar")) == null)) {
                    map = a2.f66730a;
                }
                com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_show", map);
            }
        }
    }

    static final class b implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74579a;

        static {
            Covode.recordClassIndex(45983);
        }

        b(a aVar) {
            this.f74579a = aVar;
        }

        @Override // com.bytedance.android.live.slot.ae
        public final void a(View view, String str) {
            com.ss.android.ugc.aweme.app.f.d a2;
            com.ss.android.ugc.aweme.app.f.d a3;
            if (this.f74579a.f74572e == null) {
                this.f74579a.f74572e = com.ss.android.ugc.aweme.commercialize.live.business.links.e.a.a(com.ss.android.ugc.aweme.commercialize.live.business.links.d.d.BeforeLive, new h.f.a.b<Bundle, z>(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(45984);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Bundle bundle) {
                        Bundle bundle2 = bundle;
                        l.d(bundle2, "");
                        bundle2.putString("room_id", "0");
                        bundle2.putString("anchor_id", a.h());
                        bundle2.putString("enter_from_merge", this.this$0.f74579a.f74573f);
                        bundle2.putString("enter_method", this.this$0.f74579a.f74574g);
                        return z.f158842a;
                    }
                });
            }
            ab.a aVar = this.f74579a.f74570c;
            if (aVar != null) {
                com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar2 = this.f74579a.f74572e;
                if (aVar2 != null) {
                    Context a4 = aVar.a();
                    l.b(a4, "");
                    aVar2.a(a4);
                }
                int hashCode = str.hashCode();
                Map<String, String> map = null;
                if (hashCode != -1095106132) {
                    if (hashCode == 387613079 && str.equals("before_live_dialog_item")) {
                        com.ss.android.ugc.aweme.app.f.d dVar = this.f74579a.f74575h;
                        if (!(dVar == null || (a3 = dVar.a(StringSet.type, "subpage")) == null)) {
                            map = a3.f66730a;
                        }
                        com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_click", map);
                    }
                } else if (str.equals("before_live")) {
                    com.ss.android.ugc.aweme.app.f.d dVar2 = this.f74579a.f74575h;
                    if (!(dVar2 == null || (a2 = dVar2.a(StringSet.type, "toolbar")) == null)) {
                        map = a2.f66730a;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_click", map);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(IIconSlot.SlotViewModel slotViewModel, ab.a aVar) {
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        this.f74570c = aVar;
        this.f74571d = slotViewModel2;
        t<Boolean> tVar = slotViewModel2.f12714b;
        l.b(tVar, "");
        tVar.setValue(true);
        t<Drawable> tVar2 = slotViewModel2.f12717e;
        l.b(tVar2, "");
        tVar2.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.ac2));
        t<String> tVar3 = slotViewModel2.f12721i;
        l.b(tVar3, "");
        tVar3.setValue(aVar.a().getString(R.string.bz));
        t<Drawable> tVar4 = slotViewModel2.f12719g;
        l.b(tVar4, "");
        tVar4.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.abz));
        t<String> tVar5 = slotViewModel2.f12722j;
        l.b(tVar5, "");
        tVar5.setValue(aVar.a().getString(R.string.f160025d));
        int i2 = this.f74576j.getInt("business_links_before_live_icon_display_times", 0);
        if (i2 > 5) {
            a(true);
        } else {
            a(false);
        }
        this.f74576j.storeInt("business_links_before_live_icon_display_times", i2 + 1);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, Object> map, ab.b bVar) {
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_live_ba_link");
        String str = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f74573f = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str = obj3;
        }
        this.f74574g = str;
        bVar.a(l.a(obj, (Object) true));
    }
}
