package com.bytedance.android.livesdk.envelope.widget;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.j;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeURLConfig;
import com.bytedance.android.livesdk.lynx.lynxcard.e;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.v;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class RedEnvelopeWidget extends LiveRecyclableWidget implements a, au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17170a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private HSImageView f17171b;

    /* renamed from: c  reason: collision with root package name */
    private final h f17172c = i.a(m.NONE, c.f17174a);

    static {
        Covode.recordClassIndex(9527);
    }

    public final com.bytedance.android.livesdk.envelope.b.a a() {
        return (com.bytedance.android.livesdk.envelope.b.a) this.f17172c.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bdz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9528);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.envelope.b.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17174a = new c();

        static {
            Covode.recordClassIndex(9530);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.envelope.b.b invoke() {
            return new com.bytedance.android.livesdk.envelope.b.b();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        a();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        j hybridDialogManager;
        a().a();
        f fVar = (f) com.bytedance.android.live.t.a.a(f.class);
        if (fVar != null && (hybridDialogManager = fVar.getHybridDialogManager()) != null) {
            hybridDialogManager.a();
        }
    }

    public static final class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RedEnvelopeWidget f17173a;

        static {
            Covode.recordClassIndex(9529);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(RedEnvelopeWidget redEnvelopeWidget) {
            this.f17173a = redEnvelopeWidget;
        }

        @Override // com.bytedance.android.livesdk.lynx.lynxcard.e.a
        public final void a(String str) {
            l.d(str, "");
            this.f17173a.a().a(str);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        HSImageView hSImageView = new HSImageView(this.context);
        this.f17171b = hSImageView;
        k.a(hSImageView, "tiktok_live_basic_resource", "ttlive_treasure_box_anim_pic.png");
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.REDENVELOPE;
        DataChannel dataChannel = this.dataChannel;
        DataChannel dataChannel2 = this.dataChannel;
        l.b(dataChannel2, "");
        lVar.load(dataChannel, new b(dataChannel2));
        com.bytedance.android.livesdk.envelope.b.a a2 = a();
        DataChannel dataChannel3 = this.dataChannel;
        l.b(dataChannel3, "");
        a2.a(dataChannel3, this);
    }

    @Override // com.bytedance.android.livesdk.envelope.widget.a
    public final void a(String str) {
        l.d(str, "");
        if (a().c()) {
            com.bytedance.android.live.core.c.a.a(3, "RedEnvelopeWidget", "notify envelope data change");
            Map a2 = ag.a(v.a("update_data", e.a.f9628b.a(str, (Type) Map.class)));
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(f.class);
            l.b(a3, "");
            com.bytedance.android.live.b.l lynxCardViewManager = ((f) a3).getLynxCardViewManager();
            String e2 = a().e();
            if (e2 == null) {
                l.b();
            }
            lynxCardViewManager.a(new com.bytedance.android.livesdk.lynx.lynxcard.h(e2, a2));
            return;
        }
        com.bytedance.android.live.core.c.a.a(3, "RedEnvelopeWidget", "notify envelope data created");
        Uri build = Uri.parse(RedEnvelopeURLConfig.INSTANCE.getShortTouchUrl()).buildUpon().appendQueryParameter("initial_data", str).build();
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(f.class);
        l.b(a4, "");
        com.bytedance.android.live.b.l lynxCardViewManager2 = ((f) a4).getLynxCardViewManager();
        l.b(build, "");
        HSImageView hSImageView = this.f17171b;
        if (hSImageView != null) {
            hSImageView.setLayoutParams(new LinearLayout.LayoutParams(y.a((float) LynxCardConfig.INSTANCE.getPreviewWidth()), y.a((float) LynxCardConfig.INSTANCE.getPreviewHeight())));
        }
        lynxCardViewManager2.a(new com.bytedance.android.livesdk.lynx.lynxcard.e(build, hSImageView, LynxCardPriority.INSTANCE.getPriority("shortTouchTreasureBox"), new b(this), true));
    }

    @Override // com.bytedance.android.livesdk.envelope.widget.a
    public final void a(com.bytedance.android.livesdk.gift.d.j jVar) {
        String str;
        com.bytedance.android.livesdk.at.f b2;
        com.bytedance.android.live.base.model.user.b a2;
        String str2;
        String str3;
        FollowInfo followInfo;
        String str4;
        String str5;
        l.d(jVar, "");
        String sendUrl = RedEnvelopeURLConfig.INSTANCE.getSendUrl();
        String str6 = "1";
        if (sendUrl != null) {
            com.bytedance.android.live.core.c.a.a(3, "RedEnvelopeWidget", "openRedEnvelopeCreate: url=".concat(String.valueOf(sendUrl)));
            com.bytedance.android.live.core.c.a.a(3, "RedEnvelopeWidget", "openRedEnvelopeCreateDialog: lynxUrl=".concat(String.valueOf(sendUrl)));
            Uri.Builder appendQueryParameter = Uri.parse(sendUrl).buildUpon().appendQueryParameter("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).appendQueryParameter("enter_method", com.bytedance.android.livesdk.ab.e.d());
            if (a().b()) {
                str4 = str6;
            } else {
                str4 = "0";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("is_anchor", str4).appendQueryParameter("entrance", jVar.f17857b);
            Room d2 = a().d();
            if (d2 == null || (str5 = d2.getIdStr()) == null) {
                str5 = "";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str5);
            l.b(appendQueryParameter3, "");
            Uri parse = Uri.parse(appendQueryParameter3.toString());
            String queryParameter = parse.getQueryParameter("gravity");
            if (queryParameter == null || queryParameter.length() == 0) {
                parse = parse.buildUpon().appendQueryParameter("gravity", "bottom").build();
            }
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.context, parse);
        } else {
            com.bytedance.android.live.core.c.a.a(6, "RedEnvelopeWidget", "openRedEnvelopeCreate: send url is empty");
        }
        boolean b3 = a().b();
        l.d(jVar, "");
        HashMap hashMap = new HashMap(11);
        hashMap.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
        hashMap.put("enter_method", com.bytedance.android.livesdk.ab.e.d());
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = String.valueOf(followInfo.getFollowStatus())) == null) {
                str2 = "";
            }
            hashMap.put("follow_status", str2);
            Hashtag hashtag = room.hashtag;
            if (hashtag == null || (str3 = hashtag.title) == null) {
                str3 = "";
            }
            hashMap.put("hashtag_type", str3);
        }
        u a3 = u.a();
        if (!(a3 == null || (b2 = a3.b()) == null || (a2 = b2.a()) == null)) {
            hashMap.put("user_id", String.valueOf(a2.getId()));
        }
        if (!b3) {
            str6 = "0";
        }
        hashMap.put("is_anchor", str6);
        d dVar = (d) com.bytedance.android.live.t.a.a(d.class);
        hashMap.put("online_watch_users", String.valueOf(dVar.getCurrentRoomAudienceNum()));
        hashMap.put("hourly_ranking", String.valueOf(dVar.getCurrentRoomRank(com.bytedance.android.livesdk.rank.api.j.HOURLY_RANK.getType())));
        String str7 = "normal_video_live";
        if (com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class) != null && ((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
            str7 = "video_anchor_order";
        } else if (com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class) != null) {
            com.bytedance.android.live.liveinteract.api.b bVar = (com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
            l.b(bVar, "");
            if (bVar.isBattling()) {
                str7 = "video_anchor_pk";
            } else if (bVar.isInCoHost()) {
                str7 = "video_anchor_connect";
            } else if (bVar.isInMultiGuest()) {
                str7 = "video_anchor_guest_connect";
            }
        }
        hashMap.put("scene", str7);
        if (l.a((Object) jVar.f17857b, (Object) "gift")) {
            str = "redpacket_panel_click";
        } else {
            str = "redpacket_in_more_click";
        }
        b.a.a(str).a((Map<String, String>) hashMap).a().d("live_detail").c("click").b("live").b();
    }
}
