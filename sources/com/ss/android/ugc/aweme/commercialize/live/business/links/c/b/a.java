package com.ss.android.ugc.aweme.commercialize.live.business.links.c.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.e;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.f;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.android.live.slot.b<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.b> implements i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final C1693a f74607e = new C1693a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public Room f74608c;

    /* renamed from: d  reason: collision with root package name */
    public IFrameSlot.SlotViewModel f74609d;

    /* renamed from: f  reason: collision with root package name */
    private ab.a f74610f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.live.business.links.f.c f74611g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a f74612h = new com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a();

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.live.business.links.f.b f74613i;

    /* renamed from: j  reason: collision with root package name */
    private final h f74614j = h.i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private long f74615k;

    /* renamed from: l  reason: collision with root package name */
    private String f74616l;

    /* renamed from: m  reason: collision with root package name */
    private String f74617m;
    private final Handler n = new Handler(new b(this));

    static {
        Covode.recordClassIndex(46001);
    }

    private final boolean h() {
        return ((Boolean) this.f74614j.getValue()).booleanValue();
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a$a  reason: collision with other inner class name */
    public static final class C1693a {
        static {
            Covode.recordClassIndex(46002);
        }

        private C1693a() {
        }

        public /* synthetic */ C1693a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IFrameSlot.b.SLOT_LIVE_BOTTOM_POP;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Object f() {
        return this.f74612h;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void d() {
        super.d();
        i();
        cg.b(this);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return n.c(Integer.valueOf(com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a.f74624a));
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            String str;
            Long l2;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (createIUserServicebyMonsterPlugin == null || (str = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
                str = "";
            }
            Room room = this.this$0.f74608c;
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            return Boolean.valueOf(l.a((Object) str, (Object) String.valueOf(l2)));
        }
    }

    private final void i() {
        Object obj;
        IFrameSlot.SlotViewModel slotViewModel;
        t<Pair<Boolean, String>> tVar;
        t<Pair<Boolean, String>> tVar2;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2 = this.f74609d;
        if (slotViewModel2 == null || (tVar2 = slotViewModel2.f12709a) == null || (value = tVar2.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (!(!l.a(obj, (Object) true) || (slotViewModel = this.f74609d) == null || (tVar = slotViewModel.f12709a) == null)) {
            tVar.setValue(new Pair<>(false, "business_links"));
        }
        this.n.removeMessages(0);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        cg.a(this);
    }

    static final class b implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74618a;

        static {
            Covode.recordClassIndex(46003);
        }

        b(a aVar) {
            this.f74618a = aVar;
        }

        public final boolean handleMessage(Message message) {
            Object obj;
            IFrameSlot.SlotViewModel slotViewModel;
            t<Pair<Boolean, String>> tVar;
            t<Pair<Boolean, String>> tVar2;
            Pair<Boolean, String> value;
            l.d(message, "");
            IFrameSlot.SlotViewModel slotViewModel2 = this.f74618a.f74609d;
            if (slotViewModel2 == null || (tVar2 = slotViewModel2.f12709a) == null || (value = tVar2.getValue()) == null) {
                obj = null;
            } else {
                obj = value.first;
            }
            if (!(!l.a(obj, (Object) true) || (slotViewModel = this.f74618a.f74609d) == null || (tVar = slotViewModel.f12709a) == null)) {
                tVar.setValue(new Pair<>(false, "business_links"));
            }
            return true;
        }
    }

    private final void a(com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar) {
        Long l2;
        Long l3;
        String str;
        t<Pair<Boolean, String>> tVar;
        Context a2;
        Context a3;
        this.f74612h.a(com.ss.android.ugc.aweme.commercialize.live.b.a.a().f74551c.a());
        com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a aVar = this.f74612h;
        Bundle bundle = new Bundle();
        Room room = this.f74608c;
        String str2 = null;
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        bundle.putString("room_id", String.valueOf(l2));
        Room room2 = this.f74608c;
        if (room2 != null) {
            l3 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l3 = null;
        }
        bundle.putString("anchor_id", String.valueOf(l3));
        bundle.putString("enter_from_merge", this.f74616l);
        bundle.putString("enter_method", this.f74617m);
        bundle.putString("title", bVar.getTitle());
        bundle.putString("subtitle", bVar.getSubtitle());
        bundle.putString("pic_url", bVar.getPic());
        ab.a aVar2 = this.f74610f;
        if (aVar2 == null || (a3 = aVar2.a()) == null) {
            str = null;
        } else {
            str = a3.getString(R.string.cb);
        }
        bundle.putString("pin_text", str);
        ab.a aVar3 = this.f74610f;
        if (!(aVar3 == null || (a2 = aVar3.a()) == null)) {
            str2 = a2.getString(R.string.by);
        }
        bundle.putString("more_text", str2);
        bundle.putString("link_id", String.valueOf(bVar.getId()));
        aVar.f74603b = bundle;
        IFrameSlot.SlotViewModel slotViewModel = this.f74609d;
        if (!(slotViewModel == null || (tVar = slotViewModel.f12709a) == null)) {
            tVar.setValue(new Pair<>(true, "business_links"));
        }
        this.n.sendEmptyMessageDelayed(0, 10000);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
        if ((iMessage instanceof com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a) && !h()) {
            com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a aVar = (com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a) iMessage;
            if (aVar.f74631l >= this.f74615k) {
                this.f74615k = aVar.f74631l;
                int i2 = aVar.f74625f;
                if (i2 == com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.b.PIN.getValue()) {
                    long j2 = aVar.f74626g;
                    String str = aVar.f74627h;
                    l.b(str, "");
                    String str2 = aVar.f74628i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = aVar.f74629j;
                    l.b(str3, "");
                    String str4 = aVar.f74630k;
                    l.b(str4, "");
                    com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar = new com.ss.android.ugc.aweme.commercialize.live.business.links.f.b(j2, str, str2, str3, str4, aVar.f74632m, aVar.n, true);
                    this.f74613i = bVar;
                    a(bVar);
                } else if (i2 == com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.b.UNPIN.getValue()) {
                    this.f74613i = null;
                    i();
                }
            }
        }
    }

    @r
    public final void listenToLinksLiveEvent(e eVar) {
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.g gVar;
        ab.a aVar;
        Context a2;
        Long l2;
        String str;
        String str2;
        Long l3;
        String str3;
        String str4;
        l.d(eVar, "");
        f fVar = eVar.f74635b;
        if (fVar != null) {
            String str5 = fVar.f74636a;
            if (l.a((Object) str5, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.CLOSE.getValue())) {
                i();
            } else if (!(!l.a((Object) str5, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.LEARN_MORE.getValue()) || this.f74613i == null || (aVar = this.f74610f) == null || (a2 = aVar.a()) == null)) {
                com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar = this.f74613i;
                if (bVar != null) {
                    if (bVar.getCardType() != 2 || bVar.getGameUrl() == null) {
                        double a3 = (double) com.ss.android.ugc.aweme.base.utils.i.a(a2);
                        Double.isNaN(a3);
                        Uri.Builder appendQueryParameter = Uri.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", bVar.getUrl()).appendQueryParameter(StringSet.type, "popup").appendQueryParameter("title", bVar.getTitle()).appendQueryParameter("height", String.valueOf(com.ss.android.ugc.aweme.base.utils.n.b(a3 * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                        Uri.Builder buildUpon = Uri.parse(com.ss.android.ugc.aweme.commercialize.live.b.b.a()).buildUpon();
                        Room room = this.f74608c;
                        if (room != null) {
                            l3 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l3 = null;
                        }
                        Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l3));
                        Room room2 = this.f74608c;
                        if (room2 != null) {
                            str3 = String.valueOf(room2.getId());
                        } else {
                            str3 = null;
                        }
                        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str3);
                        com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar2 = this.f74613i;
                        if (bVar2 != null) {
                            str4 = String.valueOf(bVar2.getId());
                        } else {
                            str4 = null;
                        }
                        String builder = appendQueryParameter3.appendQueryParameter("link_id", str4).appendQueryParameter("enter_from_merge", this.f74616l).appendQueryParameter("enter_method", this.f74617m).toString();
                        l.b(builder, "");
                        String builder2 = Uri.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builder).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_bdx", "1").appendQueryParameter("trans_status_bar", "0").appendQueryParameter("hybrid_sdk_version", "bullet").appendQueryParameter("webview_clear_color", "1").toString();
                        l.b(builder2, "");
                        Uri build = appendQueryParameter.appendQueryParameter("report_schema", builder2).appendQueryParameter("gravity", "bottom").build();
                        ILiveOuterService s = LiveOuterService.s();
                        l.b(s, "");
                        s.d().a(a2, build);
                    } else {
                        String gameUrl = bVar.getGameUrl();
                        if (gameUrl != null) {
                            BulletService.f().a(a2, gameUrl);
                        }
                    }
                }
                if (!h()) {
                    d dVar = new d();
                    Room room3 = this.f74608c;
                    if (room3 != null) {
                        l2 = Long.valueOf(room3.getOwnerUserId());
                    } else {
                        l2 = null;
                    }
                    d a4 = dVar.a("anchor_id", String.valueOf(l2));
                    Room room4 = this.f74608c;
                    if (room4 != null) {
                        str = String.valueOf(room4.getId());
                    } else {
                        str = null;
                    }
                    d a5 = a4.a("room_id", str);
                    com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar3 = this.f74613i;
                    if (bVar3 != null) {
                        str2 = String.valueOf(bVar3.getId());
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_links_click", a5.a("link_id", str2).a("enter_from_merge", this.f74616l).a("enter_method", this.f74617m).f66730a);
                }
            }
        }
        if (h() && (gVar = eVar.f74634a) != null) {
            String str6 = gVar.f74638a;
            if (l.a((Object) str6, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.PIN.getValue())) {
                com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar4 = new com.ss.android.ugc.aweme.commercialize.live.business.links.f.b(gVar.f74641d.f74645d, gVar.f74641d.f74642a, gVar.f74641d.f74643b, gVar.f74641d.f74646e, gVar.f74641d.f74644c, gVar.f74641d.f74647f, gVar.f74641d.f74648g, true);
                this.f74613i = bVar4;
                a(bVar4);
            } else if (l.a((Object) str6, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.UNPIN.getValue()) || l.a((Object) str6, (Object) com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.REMOVE_CARD.getValue())) {
                this.f74613i = null;
                i();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(IFrameSlot.SlotViewModel slotViewModel, ab.a aVar) {
        List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> cardList;
        IFrameSlot.SlotViewModel slotViewModel2 = slotViewModel;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        this.f74609d = slotViewModel2;
        this.f74610f = aVar;
        if (!h()) {
            com.ss.android.ugc.aweme.commercialize.live.business.links.f.c cVar = this.f74611g;
            com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar = null;
            if (!(cVar == null || (cardList = cVar.getCardList()) == null)) {
                Iterator<T> it = cardList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.isPinned()) {
                        bVar = next;
                        break;
                    }
                }
                bVar = bVar;
            }
            this.f74613i = bVar;
            if (bVar != null) {
                a(bVar);
            } else {
                i();
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
        this.f74608c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f74616l = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f74617m = (String) obj3;
        Room room = this.f74608c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (com.ss.android.ugc.aweme.commercialize.live.business.links.f.c) new com.google.gson.f().a(str, com.ss.android.ugc.aweme.commercialize.live.business.links.f.c.class);
            } catch (Exception unused) {
            }
        }
        this.f74611g = cVar;
        Room room2 = this.f74608c;
        boolean z = true;
        if (room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1) {
            z = false;
        }
        bVar.a(z);
    }
}
