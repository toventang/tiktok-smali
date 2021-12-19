package com.ss.android.ugc.aweme.commercialize.live.business.links.a.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.slot.b;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a extends b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> {

    /* renamed from: c  reason: collision with root package name */
    Room f74558c;

    /* renamed from: d  reason: collision with root package name */
    public ab.a f74559d;

    /* renamed from: e  reason: collision with root package name */
    String f74560e;

    /* renamed from: f  reason: collision with root package name */
    String f74561f;

    /* renamed from: g  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> f74562g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private IIconSlot.SlotViewModel f74563h;

    /* renamed from: i  reason: collision with root package name */
    private c f74564i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a f74565j;

    /* renamed from: k  reason: collision with root package name */
    private long f74566k;

    static {
        Covode.recordClassIndex(45976);
    }

    @Override // com.bytedance.android.live.slot.ab
    public final String g() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* bridge */ /* synthetic */ Enum e() {
        return IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.ab
    public final /* synthetic */ Object f() {
        return new com.ss.android.ugc.aweme.commercialize.live.business.links.a.a.a(new C1686a(this));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final List<Integer> a() {
        return n.c(Integer.valueOf(com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a.f74624a));
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(IMessage iMessage) {
        IIconSlot.SlotViewModel slotViewModel;
        t<Boolean> tVar;
        t<Boolean> tVar2;
        IIconSlot.SlotViewModel slotViewModel2;
        t<Boolean> tVar3;
        t<Boolean> tVar4;
        if (iMessage instanceof com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a) {
            com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a aVar = (com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.a) iMessage;
            this.f74565j = aVar;
            if (aVar != null && aVar.f74631l >= this.f74566k) {
                this.f74566k = aVar.f74631l;
                int i2 = aVar.f74625f;
                Boolean bool = null;
                if (i2 == com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.b.ADD.getValue()) {
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
                    this.f74562g.add(0, new com.ss.android.ugc.aweme.commercialize.live.business.links.f.b(j2, str, str2, str3, str4, aVar.f74632m, aVar.n, false));
                    IIconSlot.SlotViewModel slotViewModel3 = this.f74563h;
                    if (!(slotViewModel3 == null || (tVar4 = slotViewModel3.f12714b) == null)) {
                        bool = tVar4.getValue();
                    }
                    if ((!l.a((Object) bool, (Object) true)) && (slotViewModel2 = this.f74563h) != null && (tVar3 = slotViewModel2.f12714b) != null) {
                        tVar3.setValue(true);
                    }
                } else if (i2 == com.ss.android.ugc.aweme.commercialize.live.business.links.f.a.b.REMOVE.getValue()) {
                    Iterator<T> it = this.f74562g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (aVar.f74626g == next.getId()) {
                            if (next != null) {
                                this.f74562g.remove(next);
                            }
                        }
                    }
                    IIconSlot.SlotViewModel slotViewModel4 = this.f74563h;
                    if (!(slotViewModel4 == null || (tVar2 = slotViewModel4.f12714b) == null)) {
                        bool = tVar2.getValue();
                    }
                    if (l.a((Object) bool, (Object) true) && (slotViewModel = this.f74563h) != null && (tVar = slotViewModel.f12714b) != null) {
                        tVar.setValue(false);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final /* synthetic */ void a(IIconSlot.SlotViewModel slotViewModel, ab.a aVar) {
        List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> cardList;
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        l.d(slotViewModel2, "");
        l.d(aVar, "");
        super.a(slotViewModel2, aVar);
        this.f74559d = aVar;
        this.f74563h = slotViewModel2;
        c cVar = this.f74564i;
        boolean z = false;
        if (!(cVar == null || (cardList = cVar.getCardList()) == null || cardList.isEmpty())) {
            z = true;
        }
        t<Boolean> tVar = slotViewModel2.f12714b;
        l.b(tVar, "");
        tVar.setValue(Boolean.valueOf(z));
        t<Drawable> tVar2 = slotViewModel2.f12717e;
        l.b(tVar2, "");
        tVar2.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.ac0));
        t<Drawable> tVar3 = slotViewModel2.f12718f;
        l.b(tVar3, "");
        tVar3.setValue(androidx.core.content.b.a(aVar.a(), (int) R.drawable.ac1));
        t<String> tVar4 = slotViewModel2.f12721i;
        l.b(tVar4, "");
        tVar4.setValue(aVar.a().getString(R.string.bz));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.b.a$a  reason: collision with other inner class name */
    static final class C1686a implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74567a;

        static {
            Covode.recordClassIndex(45977);
        }

        C1686a(a aVar) {
            this.f74567a = aVar;
        }

        @Override // com.bytedance.android.live.slot.ae
        public final void a(View view, String str) {
            Long l2;
            Context a2;
            Long l3;
            String str2;
            String valueOf;
            if (this.f74567a.f74562g.size() != 0) {
                com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar = this.f74567a.f74562g.get(0);
                ab.a aVar = this.f74567a.f74559d;
                String str3 = null;
                if (!(aVar == null || (a2 = aVar.a()) == null)) {
                    if (bVar.getCardType() != 2 || bVar.getGameUrl() == null) {
                        double a3 = (double) i.a(a2);
                        Double.isNaN(a3);
                        Uri.Builder appendQueryParameter = Uri.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", bVar.getUrl()).appendQueryParameter(StringSet.type, "popup").appendQueryParameter("title", bVar.getTitle()).appendQueryParameter("height", String.valueOf(com.ss.android.ugc.aweme.base.utils.n.b(a3 * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                        a aVar2 = this.f74567a;
                        Uri.Builder buildUpon = Uri.parse(com.ss.android.ugc.aweme.commercialize.live.b.b.a()).buildUpon();
                        Room room = aVar2.f74558c;
                        if (room != null) {
                            l3 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l3 = null;
                        }
                        Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l3));
                        Room room2 = aVar2.f74558c;
                        if (room2 != null) {
                            str2 = String.valueOf(room2.getId());
                        } else {
                            str2 = null;
                        }
                        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str2);
                        if (aVar2.f74562g.size() == 0) {
                            valueOf = "";
                        } else {
                            valueOf = String.valueOf(aVar2.f74562g.get(0).getId());
                        }
                        String builder = appendQueryParameter3.appendQueryParameter("link_id", valueOf).appendQueryParameter("enter_from_merge", aVar2.f74560e).appendQueryParameter("enter_method", aVar2.f74561f).toString();
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
                a aVar3 = this.f74567a;
                d dVar = new d();
                Room room3 = aVar3.f74558c;
                if (room3 != null) {
                    l2 = Long.valueOf(room3.getOwnerUserId());
                } else {
                    l2 = null;
                }
                d a4 = dVar.a("anchor_id", String.valueOf(l2));
                Room room4 = aVar3.f74558c;
                if (room4 != null) {
                    str3 = String.valueOf(room4.getId());
                }
                r.a("livesdk_links_click", a4.a("room_id", str3).a("link_id", "").a("enter_from_merge", aVar3.f74560e).a("enter_method", aVar3.f74561f).f66730a);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.ab
    public final void a(Map<String, Object> map, ab.b bVar) {
        BALinkStruct bALinkStruct;
        List<com.ss.android.ugc.aweme.commercialize.live.business.links.f.b> cardList;
        com.ss.android.ugc.aweme.commercialize.live.business.links.f.b bVar2;
        BALinkStruct bALinkStruct2;
        String str;
        l.d(map, "");
        l.d(bVar, "");
        Object obj = map.get("param_room");
        c cVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        this.f74558c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f74560e = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f74561f = (String) obj3;
        Room room = this.f74558c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (c) new f().a(str, c.class);
            } catch (Exception unused) {
            }
        }
        this.f74564i = cVar;
        boolean z = false;
        if (!(cVar == null || (cardList = cVar.getCardList()) == null || (bVar2 = cardList.get(0)) == null)) {
            this.f74562g.add(bVar2);
        }
        Room room2 = this.f74558c;
        if (!(room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1)) {
            z = true;
        }
        bVar.a(z);
    }
}
