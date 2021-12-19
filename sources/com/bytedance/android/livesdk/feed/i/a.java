package com.bytedance.android.livesdk.feed.i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.d.o;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import f.a.l.c;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class a extends b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    private final c<FeedItem> f17494a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.bytedance.android.livesdk.feed.dislike.a f17495b;

    /* renamed from: c  reason: collision with root package name */
    protected final h f17496c;

    /* renamed from: d  reason: collision with root package name */
    protected final FeedDataKey f17497d;

    /* renamed from: e  reason: collision with root package name */
    protected final boolean f17498e;

    /* renamed from: f  reason: collision with root package name */
    protected final g f17499f;

    /* renamed from: g  reason: collision with root package name */
    protected ah f17500g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f17501h;

    /* renamed from: i  reason: collision with root package name */
    public Room f17502i;

    /* renamed from: j  reason: collision with root package name */
    protected int f17503j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final c<Boolean> f17504k;

    /* renamed from: l  reason: collision with root package name */
    private final c<Object> f17505l;

    /* renamed from: m  reason: collision with root package name */
    private final c<Object> f17506m;
    private m n;
    private FeedItem o;
    private String p = "";
    private String q = "";

    static {
        Covode.recordClassIndex(9693);
    }

    /* access modifiers changed from: protected */
    public abstract void a(FeedItem feedItem, Room room, int i2);

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void a() {
        super.a();
        b(this.f17502i);
        com.bytedance.android.b.a.a.f6785g.a(this.o);
    }

    public final void d() {
        if (this.f17498e) {
            com.bytedance.ies.f.b a2 = com.bytedance.ies.f.b.a(this.itemView.getContext(), com.bytedance.ies.f.b.f33816b);
            long a3 = a2.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0L);
            if (a3 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > a3 && currentTimeMillis - a3 <= 5500) {
                    a2.a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) -1L).a();
                    int[] iArr = new int[2];
                    this.itemView.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    View view = (View) this.itemView.getParent();
                    if (view != null) {
                        view.getLocationInWindow(iArr2);
                        int max = Math.max(0, iArr2[1] - iArr[1]);
                        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
                        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.vh);
                        View inflate = View.inflate(this.itemView.getContext(), R.layout.bdc, null);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.ko);
                        ((LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - (((float) dimensionPixelSize) / 2.0f)) - ((float) max));
                        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
                        inflate.setOnClickListener(new e(popupWindow));
                        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
                        lottieAnimationView.getClass();
                        popupWindow.setOnDismissListener(new f(lottieAnimationView));
                        lottieAnimationView.setAnimation("dislike_live_tips.json");
                        lottieAnimationView.b(true);
                        lottieAnimationView.a();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Room room) {
        this.f17496c.a(this.f17497d, String.valueOf(room.getId()));
        ao.a(this.itemView.getContext(), (int) R.string.gnt);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue() && this.z) {
            b(this.f17502i);
            com.bytedance.android.b.a.a.f6785g.a(this.o);
        }
    }

    private void b(Room room) {
        long id;
        String str;
        Intent intent;
        if (room != null) {
            if (room.getOwner() == null) {
                id = 0;
            } else {
                id = room.getOwner().getId();
            }
            HashMap hashMap = new HashMap();
            if (com.bytedance.android.livesdk.feed.f.a.t != null && !TextUtils.isEmpty(com.bytedance.android.livesdk.feed.f.a.t.getEvent())) {
                com.bytedance.android.livesdk.feed.f.a.t.getEvent();
            }
            String str2 = "live_cover";
            String str3 = "live_merge";
            if (d.a() != null) {
                if (d.a().b() != null) {
                    str3 = d.a().b();
                }
                if (d.a().c() != null) {
                    str2 = d.a().c();
                }
            }
            hashMap.put("enter_from_merge", str3);
            hashMap.put("enter_method", str2);
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(id));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("show_type", "stay");
            hashMap.put("live_type", j.a(room.getStreamType()));
            if (room.isThirdParty) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put("streaming_type", str);
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            if (getAdapterPosition() != -1) {
                hashMap.put("small_picture_order", String.valueOf(getAdapterPosition() + 1));
            }
            hashMap.put("event_type", "core");
            hashMap.put("event_module", "live");
            hashMap.put("action_type", "click");
            hashMap.put("request_page", d.a().e());
            if (this.f17501h) {
                hashMap.put("live_window_mode", "small_picture");
            }
            if (!com.bytedance.common.utility.m.a(d.a().e())) {
                hashMap.put("enter_live_method", d.a().e());
            }
            if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                hashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            }
            if (!TextUtils.isEmpty(this.o.liveReason)) {
                hashMap.put("live_reason", this.o.liveReason);
            }
            if ((this.itemView.getContext() instanceof Activity) && (intent = p.a(this.itemView.getContext()).getIntent()) != null) {
                String a2 = a(intent, "gd_label");
                if (!TextUtils.isEmpty(a2)) {
                    hashMap.put("gd_label", a2);
                }
            }
            String g2 = e.g();
            if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            hashMap.put("is_return", "0");
            hashMap.put("room_position", String.valueOf(this.f17503j));
            hashMap.put("is_from_draw_req", "0");
            if (!com.bytedance.common.utility.m.a(this.p)) {
                hashMap.put("top_left_label", this.p);
            }
            if (!com.bytedance.common.utility.m.a(this.q)) {
                hashMap.put("bottom_left_label", this.q);
            }
            hashMap.put("has_banner", String.valueOf(com.bytedance.android.b.a.a.f6785g.c()));
            hashMap.put("explore_level", String.valueOf(com.bytedance.android.b.a.a.f6785g.a().size()));
            b.a.a("live_show").a((Map<String, String>) hashMap).b();
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Room room, PopupWindow popupWindow) {
        String str = this.f17497d.f17458b;
        com.bytedance.android.livesdk.feed.dislike.a aVar = this.f17495b;
        a(aVar.f17350a.dislikeRoom(room.getId(), room.getOwnerUserId(), room.getRequestId(), str, str, room.getLog_pb()).d(com.bytedance.android.livesdk.feed.dislike.b.f17351a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(this, room), new j(this)));
        String str2 = this.f17497d.f17458b;
        if (str2.contains("live") && com.bytedance.android.livesdk.feed.f.a.t != null) {
            this.f17500g = com.bytedance.android.livesdk.feed.f.a.t;
            str2 = com.bytedance.android.livesdk.feed.f.a.t.getEvent();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_merge");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("log_pb", room.getLog_pb());
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "core");
        hashMap.put("event_module", str2);
        b.a.a("live_dislike").a((Map<String, String>) hashMap).b();
        popupWindow.dismiss();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.ui.b
    public final /* synthetic */ void a(FeedItem feedItem, int i2) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 == null || !(feedItem2.item instanceof Room)) {
            this.itemView.setOnLongClickListener(null);
            this.f17502i = null;
            return;
        }
        this.f17503j = i2;
        this.o = feedItem2;
        this.f17502i = (Room) feedItem2.item;
        if (this.f17498e) {
            this.itemView.setOnLongClickListener(new b(this));
        } else {
            this.itemView.setOnLongClickListener(null);
        }
        a(feedItem2, this.f17502i, i2);
        Room room = this.f17502i;
        if (!com.bytedance.common.utility.collection.b.a((Collection) room.getFeedRoomLabelList())) {
            for (FeedRoomLabel feedRoomLabel : room.getFeedRoomLabelList()) {
                if (feedRoomLabel != null) {
                    if (feedRoomLabel.location == 0) {
                        this.p = feedRoomLabel.logExtra;
                    } else if (feedRoomLabel.location == 3) {
                        this.q = feedRoomLabel.logExtra;
                    }
                }
            }
        }
        c<Boolean> cVar = this.f17504k;
        if (cVar != null) {
            a(cVar.a(new c(this), d.f17512a));
        }
    }

    public boolean a(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        int i2;
        Intent intent;
        String a2;
        EnterRoomConfig b2;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return false;
        }
        Room room = (Room) feedItem.item;
        if (room.getId() == com.bytedance.android.b.a.a.f6785g.f6792f) {
            return true;
        }
        if (!room.isPullUrlValid() && com.bytedance.common.utility.m.a(room.getMultiStreamData())) {
            return false;
        }
        room.setLog_pb(feedItem.logPb);
        room.setRequestId(feedItem.resId);
        Context context = this.itemView.getContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = f();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
            ao.a(context, (int) R.string.go2);
            return false;
        }
        if (enterRoomConfig != null && !TextUtils.isEmpty(feedItem.liveReason)) {
            enterRoomConfig.f23298b.f23314f = feedItem.liveReason;
        }
        if (((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController() == null) {
            b.a.a("livesdk_rd_plugin_init_failed").b();
            ao.a(context, (int) R.string.gnu);
            f.a.f23366a.a().a(new Event("base_live_viewholder_click_small_picture", 34304, com.bytedance.android.livesdkapi.session.b.SdkCallback).a(y.a((int) R.string.gnu)));
        } else {
            if (!((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController().l() || !TextUtils.equals(((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController().m(), this.f17502i.buildPullUrl())) {
                com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a(com.bytedance.android.livesdkapi.depend.d.a.FEED.typeName);
            } else {
                com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a(com.bytedance.android.livesdkapi.depend.d.a.FEED_WITH_PREVIEW.typeName);
            }
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            enterRoomLinkSession.a(new Event("base_live_view_holder_click_small_picture", 1536, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall));
            f.a.f23366a.a(enterRoomLinkSession);
            o.a(this.f17502i, this.f17497d.f17458b, enterRoomConfig);
            if (com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.j.class) != null) {
                enterRoomConfig.f23299c.D = String.valueOf(this.f17502i.getOwnerUserId());
                if (this.f17501h) {
                    enterRoomConfig.f23299c.O = true;
                    enterRoomConfig.f23299c.P = d.a().e();
                    enterRoomConfig.f23299c.N = "live_square";
                    enterRoomConfig.f23299c.W = "small_picture";
                    enterRoomConfig.f23299c.av = "jump_source_square_drawer";
                    enterRoomConfig.f23298b.M = this.f17503j;
                    if (getAdapterPosition() != -1) {
                        enterRoomConfig.f23299c.ae = (long) (getAdapterPosition() + 1);
                    }
                    d a3 = d.a();
                    String str = null;
                    if (a3.f15171a && a3.f15172b != null) {
                        d.a aVar = a3.f15172b;
                        if (aVar.f15178d != null) {
                            str = aVar.f15178d.f18680c;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        List<ah> a4 = com.bytedance.android.livesdk.feed.tab.b.g.b().a();
                        if (!com.bytedance.common.utility.h.a(a4) && a4.get(0) != null) {
                            String url = a4.get(0).getUrl();
                            if (d.a() != null) {
                                if (com.bytedance.common.utility.m.a("referral_task", d.a().b())) {
                                    url = TabFeedViewModel.a(url, "channel_id", LiveFeedDraw.getChannelId("referral_task", "H5"));
                                }
                                if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance() && !com.bytedance.common.utility.m.a(url)) {
                                    url = url.replaceAll("&" + "channel_id" + "=[^&]*", "");
                                }
                            }
                            enterRoomConfig.f23299c.A = url;
                        }
                    } else {
                        enterRoomConfig.f23299c.A = str;
                    }
                }
                Room room2 = this.f17502i;
                Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
                if ((valueOf == null || valueOf.booleanValue()) && (b2 = com.bytedance.android.livesdkapi.g.a.b(room2, enterRoomConfig)) != null) {
                    com.bytedance.android.livesdkapi.g.a.b(room2, enterRoomConfig);
                    enterRoomConfig.f23299c.C = b2;
                }
                l.d(context, "");
                androidx.fragment.app.e a5 = enterRoomConfig.a(context);
                if (!(a5 == null || (intent = a5.getIntent()) == null || (a2 = EnterRoomConfig.a(intent, "gd_label")) == null)) {
                    l.b(a2, "");
                    if (a2.length() > 0) {
                        enterRoomConfig.f23298b.r = a2;
                    }
                }
                enterRoomConfig.f23299c.R = this.f17502i.getId();
                enterRoomConfig.f23299c.S = this.f17502i.getStreamType();
                enterRoomConfig.f23299c.al = ((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom();
                enterRoomConfig.f23299c.az = true;
                if (!com.bytedance.common.utility.m.a(this.p)) {
                    enterRoomConfig.f23298b.K = this.p;
                }
                if (!com.bytedance.common.utility.m.a(this.q)) {
                    enterRoomConfig.f23298b.L = this.p;
                }
                com.bytedance.android.b.a.a aVar2 = com.bytedance.android.b.a.a.f6785g;
                aVar2.a().push(Long.valueOf(this.f17502i.getId()));
                if (aVar2.a().size() > aVar2.f6787a) {
                    i2 = aVar2.a().size();
                } else {
                    i2 = aVar2.f6787a;
                }
                aVar2.f6787a = i2;
                ((com.bytedance.android.livesdkapi.host.j) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.j.class)).b(context, enterRoomConfig);
            }
            this.f17494a.onNext(feedItem);
        }
        return true;
    }

    public a(View view, com.bytedance.android.livesdk.feed.dislike.a aVar, h hVar, FeedDataKey feedDataKey, m mVar, g gVar, c<FeedItem> cVar, c<Boolean> cVar2, c<Object> cVar3, c<Object> cVar4) {
        super(view);
        boolean z;
        this.f17495b = aVar;
        this.f17496c = hVar;
        this.f17497d = feedDataKey;
        if (feedDataKey == null || mVar == null || !mVar.b(feedDataKey.f17459c)) {
            z = false;
        } else {
            z = true;
        }
        this.f17498e = z;
        this.f17499f = gVar;
        this.f17494a = cVar;
        this.f17504k = cVar2;
        this.f17505l = cVar4;
        this.f17506m = cVar3;
        if (feedDataKey.f17458b.equals("live")) {
            this.f17500g = com.bytedance.android.livesdk.feed.f.a.t;
        } else {
            this.f17500g = mVar.a(feedDataKey.f17459c);
        }
        this.n = mVar;
    }
}
