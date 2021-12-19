package com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.e;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.android.live.slot.b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> implements i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final C1690a f74585i = new C1690a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public Room f74586c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.live.business.links.d.a f74587d;

    /* renamed from: e  reason: collision with root package name */
    public ab.a f74588e;

    /* renamed from: f  reason: collision with root package name */
    public String f74589f;

    /* renamed from: g  reason: collision with root package name */
    public String f74590g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.app.f.d f74591h;

    /* renamed from: j  reason: collision with root package name */
    private final Keva f74592j = Keva.getRepo("commercialize_live_business_links_keva_name");

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.live.business.links.f.c f74593k;

    /* renamed from: l  reason: collision with root package name */
    private IIconSlot.SlotViewModel f74594l;

    /* renamed from: m  reason: collision with root package name */
    private final f.a.b.a f74595m = new f.a.b.a();
    private boolean n;
    private boolean o;

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f74599a = new d();

        static {
            Covode.recordClassIndex(45995);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45990);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "business_links";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(181, new g(a.class, "listenToLinksLiveEvent", e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a$a  reason: collision with other inner class name */
    public static final class C1690a {
        static {
            Covode.recordClassIndex(45991);
        }

        private C1690a() {
        }

        public /* synthetic */ C1690a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* synthetic */ Object f() {
        return new com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.a.a(new b(this));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return n.c(Integer.valueOf(com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a.f74624a));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void d() {
        com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar;
        super.d();
        ab.a aVar2 = this.f74588e;
        if (!(aVar2 == null || (aVar = this.f74587d) == null)) {
            Context a2 = aVar2.a();
            l.b(a2, "");
            aVar.b(a2);
        }
        this.f74595m.dispose();
        cg.b(this);
    }

    private final void h() {
        this.o = true;
        IIconSlot.SlotViewModel slotViewModel = this.f74594l;
        if (slotViewModel != null) {
            f.a.b.b a2 = t.b(1000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(slotViewModel, this), d.f74599a);
            l.b(a2, "");
            f.a.j.a.a(a2, this.f74595m);
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        cg.a(this);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IIconSlot.SlotViewModel f74597a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74598b;

        static {
            Covode.recordClassIndex(45994);
        }

        c(IIconSlot.SlotViewModel slotViewModel, a aVar) {
            this.f74597a = slotViewModel;
            this.f74598b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Context a2;
            Resources resources;
            this.f74597a.f12725m = 10000;
            androidx.lifecycle.t<String> tVar = this.f74597a.f12723k;
            l.b(tVar, "");
            ab.a aVar = this.f74598b.f74588e;
            if (aVar == null || (a2 = aVar.a()) == null || (resources = a2.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.f160029h);
            }
            tVar.setValue(str);
        }
    }

    @r
    public final void listenToLinksLiveEvent(e eVar) {
        l.d(eVar, "");
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.g gVar = eVar.f74634a;
        if (gVar != null && l.a((Object) gVar.f74639b, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.j.DURING_LIVE.getValue())) {
            String str = gVar.f74638a;
            if (l.a((Object) str, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.CLOSE.getValue())) {
                ab.a aVar = this.f74588e;
                if (aVar != null) {
                    com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar2 = this.f74587d;
                    if (aVar2 != null) {
                        Context a2 = aVar.a();
                        l.b(a2, "");
                        aVar2.b(a2);
                    }
                    if (this.n) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z = true;
            if (l.a((Object) str, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.COUNT.getValue())) {
                boolean z2 = this.f74592j.getBoolean("business_links_during_live_tips_has_displayed", false);
                if (gVar.f74640c <= 0 || z2 || this.o) {
                    z = false;
                }
                this.n = z;
            } else if (l.a((Object) str, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.PIN.getValue())) {
                this.f74592j.storeBoolean("business_links_during_live_tips_has_displayed", true);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(String str) {
        Long l2;
        String str2;
        com.ss.android.ugc.aweme.app.f.d a2;
        com.ss.android.ugc.aweme.app.f.d a3;
        super.a(str);
        if (str != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Room room = this.f74586c;
            Map<String, String> map = null;
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = dVar.a("anchor_id", String.valueOf(l2));
            Room room2 = this.f74586c;
            if (room2 != null) {
                str2 = String.valueOf(room2.getId());
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("room_id", str2).a("live_status", "during_live").a("enter_from_merge", this.f74589f).a("enter_method", this.f74590g);
            l.b(a5, "");
            this.f74591h = a5;
            int hashCode = str.hashCode();
            if (hashCode != -1884023019) {
                if (hashCode == -522623958 && str.equals("during_live")) {
                    com.ss.android.ugc.aweme.app.f.d dVar2 = this.f74591h;
                    if (!(dVar2 == null || (a3 = dVar2.a(StringSet.type, "toolbar")) == null)) {
                        map = a3.f66730a;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_show", map);
                }
            } else if (str.equals("during_live_dialog_item")) {
                com.ss.android.ugc.aweme.app.f.d dVar3 = this.f74591h;
                if (!(dVar3 == null || (a2 = dVar3.a(StringSet.type, "subpage")) == null)) {
                    map = a2.f66730a;
                }
                com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_show", map);
            }
        }
    }

    static final class b implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74596a;

        static {
            Covode.recordClassIndex(45992);
        }

        b(a aVar) {
            this.f74596a = aVar;
        }

        @Override // com.bytedance.android.live.slot.ae
        public final void a(View view, String str) {
            com.ss.android.ugc.aweme.app.f.d a2;
            com.ss.android.ugc.aweme.app.f.d a3;
            if (this.f74596a.f74587d == null) {
                this.f74596a.f74587d = com.ss.android.ugc.aweme.commercialize.live.business.links.e.a.a(com.ss.android.ugc.aweme.commercialize.live.business.links.d.d.DuringLive, new h.f.a.b<Bundle, z>(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(45993);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Bundle bundle) {
                        String str;
                        Bundle bundle2 = bundle;
                        l.d(bundle2, "");
                        Room room = this.this$0.f74596a.f74586c;
                        Long l2 = null;
                        if (room != null) {
                            str = String.valueOf(room.getId());
                        } else {
                            str = null;
                        }
                        bundle2.putString("room_id", str);
                        Room room2 = this.this$0.f74596a.f74586c;
                        if (room2 != null) {
                            l2 = Long.valueOf(room2.getOwnerUserId());
                        }
                        bundle2.putString("anchor_id", String.valueOf(l2));
                        bundle2.putString("enter_from_merge", this.this$0.f74596a.f74589f);
                        bundle2.putString("enter_method", this.this$0.f74596a.f74590g);
                        return z.f158842a;
                    }
                });
            }
            ab.a aVar = this.f74596a.f74588e;
            if (aVar != null) {
                com.ss.android.ugc.aweme.commercialize.live.business.links.d.a aVar2 = this.f74596a.f74587d;
                if (aVar2 != null) {
                    Context a4 = aVar.a();
                    l.b(a4, "");
                    aVar2.a(a4);
                }
                int hashCode = str.hashCode();
                Map<String, String> map = null;
                if (hashCode != -1884023019) {
                    if (hashCode == -522623958 && str.equals("during_live")) {
                        com.ss.android.ugc.aweme.app.f.d dVar = this.f74596a.f74591h;
                        if (!(dVar == null || (a3 = dVar.a(StringSet.type, "toolbar")) == null)) {
                            map = a3.f66730a;
                        }
                        com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_click", map);
                    }
                } else if (str.equals("during_live_dialog_item")) {
                    com.ss.android.ugc.aweme.app.f.d dVar2 = this.f74596a.f74591h;
                    if (!(dVar2 == null || (a2 = dVar2.a(StringSet.type, "subpage")) == null)) {
                        map = a2.f66730a;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_add_links_click", map);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, Object> map, ab.b bVar) {
        BALinkStruct bALinkStruct;
        BALinkStruct bALinkStruct2;
        String str;
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_room");
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.c cVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        this.f74586c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f74589f = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f74590g = (String) obj3;
        Room room = this.f74586c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (com.ss.android.ugc.aweme.commercialize.live.business.links.f.c) new com.google.gson.f().a(str, com.ss.android.ugc.aweme.commercialize.live.business.links.f.c.class);
            } catch (Exception unused) {
            }
        }
        this.f74593k = cVar;
        Room room2 = this.f74586c;
        boolean z = true;
        if (room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1) {
            z = false;
        }
        bVar.a(z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(IIconSlot.SlotViewModel slotViewModel, ab.a aVar) {
        Integer num;
        List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> cardList;
        List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> cardList2;
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        this.f74588e = aVar;
        this.f74594l = slotViewModel2;
        androidx.lifecycle.t<Boolean> tVar = slotViewModel2.f12714b;
        l.b(tVar, "");
        boolean z = true;
        tVar.setValue(true);
        androidx.lifecycle.t<Drawable> tVar2 = slotViewModel2.f12717e;
        l.b(tVar2, "");
        tVar2.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.ac3));
        androidx.lifecycle.t<Drawable> tVar3 = slotViewModel2.f12718f;
        l.b(tVar3, "");
        tVar3.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.ac4));
        androidx.lifecycle.t<String> tVar4 = slotViewModel2.f12721i;
        l.b(tVar4, "");
        tVar4.setValue(aVar.a().getString(R.string.bz));
        androidx.lifecycle.t<Drawable> tVar5 = slotViewModel2.f12719g;
        l.b(tVar5, "");
        tVar5.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.abz));
        androidx.lifecycle.t<String> tVar6 = slotViewModel2.f12722j;
        l.b(tVar6, "");
        tVar6.setValue(aVar.a().getString(R.string.f160025d));
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.c cVar = this.f74593k;
        if (cVar == null || (cardList2 = cVar.getCardList()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(cardList2.size());
        }
        slotViewModel2.p = num;
        boolean z2 = this.f74592j.getBoolean("business_links_during_live_tips_has_displayed", false);
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.c cVar2 = this.f74593k;
        if (cVar2 == null || (cardList = cVar2.getCardList()) == null || cardList.isEmpty()) {
            z = false;
        }
        if (!z2 && z && !this.o) {
            h();
        }
    }
}
