package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import com.ss.android.ugc.aweme.feed.experiment.af;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.f.b.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

public final class l implements View.OnClickListener, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final a q = new a((byte) 0);
    private f.a.d.f<com.ss.android.ugc.aweme.live.feedpage.d> A;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f94818a;

    /* renamed from: b  reason: collision with root package name */
    public String f94819b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f94820c;

    /* renamed from: d  reason: collision with root package name */
    boolean f94821d;

    /* renamed from: e  reason: collision with root package name */
    public int f94822e;

    /* renamed from: f  reason: collision with root package name */
    public DataCenter f94823f;

    /* renamed from: g  reason: collision with root package name */
    public Context f94824g;

    /* renamed from: h  reason: collision with root package name */
    User f94825h;

    /* renamed from: i  reason: collision with root package name */
    public SmartAvatarBorderView f94826i;

    /* renamed from: j  reason: collision with root package name */
    public AvatarImageWithLive f94827j;

    /* renamed from: k  reason: collision with root package name */
    public StoryBrandView f94828k;

    /* renamed from: l  reason: collision with root package name */
    d f94829l;

    /* renamed from: m  reason: collision with root package name */
    final IProfileBadgeService f94830m;
    final d n;
    public boolean o;
    boolean p;
    private View r;
    private SmartImageView s;
    private LiveCircleView t;
    private ImageView u;
    private RemoteImageView v;
    private int w;
    private ViewGroup x;
    private final com.ss.android.ugc.aweme.cp.b y;
    private final h.h z = h.i.a((h.f.a.a) new j(this));

    static {
        Covode.recordClassIndex(60150);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(178, new org.greenrobot.eventbus.g(l.class, "onTopViewInFeed", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(9, new org.greenrobot.eventbus.g(l.class, "onLiveStatusEvent", com.bytedance.android.live.base.a.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(123, new org.greenrobot.eventbus.g(l.class, "onTopViewLiveEnd", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60151);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f94843a;

        static {
            Covode.recordClassIndex(60158);
        }

        h(d dVar) {
            this.f94843a = dVar;
        }

        public final void run() {
            d dVar = this.f94843a;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f94844a;

        static {
            Covode.recordClassIndex(60159);
        }

        i(d dVar) {
            this.f94844a = dVar;
        }

        public final void run() {
            d dVar = this.f94844a;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.d();
        }
    }

    public final String a() {
        return RequestIdService.a().a(this.f94818a, this.f94822e);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f94837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f94838b;

        static {
            Covode.recordClassIndex(60155);
        }

        e(l lVar, HashMap hashMap) {
            this.f94837a = lVar;
            this.f94838b = hashMap;
        }

        public final void run() {
            com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new g(this.f94837a, this.f94838b), 1000);
        }
    }

    public final void b() {
        if (this.p) {
            this.p = false;
            d dVar = this.f94829l;
            if (dVar != null) {
                p.f93149a.a(new r(false, new i(dVar)));
            }
        }
    }

    public final boolean c() {
        AvatarImageWithLive avatarImageWithLive = this.f94827j;
        if (avatarImageWithLive != null && avatarImageWithLive.getVisibility() == 0) {
            return true;
        }
        LiveCircleView liveCircleView = this.t;
        if (liveCircleView == null || liveCircleView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    static final class j extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.avatar.d> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(60160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r2 = r5.this$0.f94828k;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.story.avatar.d invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.this$0
                android.content.Context r4 = r0.f94824g
                boolean r0 = r4 instanceof androidx.appcompat.app.d
                r3 = 0
                if (r0 != 0) goto L_0x000a
                r4 = r3
            L_0x000a:
                androidx.appcompat.app.d r4 = (androidx.appcompat.app.d) r4
                if (r4 != 0) goto L_0x000f
                return r3
            L_0x000f:
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.this$0
                com.ss.android.ugc.aweme.tux.business.story.StoryBrandView r2 = r0.f94828k
                if (r2 != 0) goto L_0x0016
                return r3
            L_0x0016:
                com.ss.android.ugc.aweme.story.g r0 = com.ss.android.ugc.aweme.story.g.f137757a
                com.ss.android.ugc.aweme.story.avatar.c r1 = r0.d()
                if (r1 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.feed.ui.l$j$1 r0 = new com.ss.android.ugc.aweme.feed.ui.l$j$1
                r0.<init>(r5, r2, r4)
                com.ss.android.ugc.aweme.story.avatar.d r2 = r1.a(r0)
                if (r2 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.this$0
                com.ss.android.ugc.aweme.tux.business.story.StoryBrandView r1 = r0.f94828k
                if (r1 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.feed.ui.l$j$a r0 = new com.ss.android.ugc.aweme.feed.ui.l$j$a
                r0.<init>(r5)
                r1.addOnAttachStateChangeListener(r0)
            L_0x0037:
                return r2
            L_0x0038:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.l.j.invoke():java.lang.Object");
        }

        public static final class a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f94848a;

            static {
                Covode.recordClassIndex(60162);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            a(j jVar) {
                this.f94848a = jVar;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f94848a.this$0.o = false;
            }
        }
    }

    private final void d() {
        String str;
        JSONObject jSONObject = this.f94820c;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("request_id");
            } catch (JSONException e2) {
                e2.printStackTrace();
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f94818a;
                if (aweme == null) {
                    h.f.b.l.b();
                }
                aweme.setRequestId(str);
            }
        }
        DataCenter dataCenter = this.f94823f;
        if (dataCenter != null) {
            dataCenter.a("feed_internal_event", new ag(19, this.f94818a));
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f94841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f94842b;

        static {
            Covode.recordClassIndex(60157);
        }

        g(l lVar, HashMap hashMap) {
            this.f94841a = lVar;
            this.f94842b = hashMap;
        }

        public final void run() {
            SmartAvatarBorderView smartAvatarBorderView;
            boolean z;
            boolean z2;
            l lVar = this.f94841a;
            AvatarImageWithLive avatarImageWithLive = lVar.f94827j;
            if (avatarImageWithLive != null) {
                smartAvatarBorderView = avatarImageWithLive.getAvatarImageView();
            } else {
                smartAvatarBorderView = null;
            }
            AvatarImageWithLive avatarImageWithLive2 = lVar.f94827j;
            if (avatarImageWithLive2 == null || avatarImageWithLive2.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            lVar.a(smartAvatarBorderView, z);
            SmartAvatarBorderView smartAvatarBorderView2 = lVar.f94826i;
            SmartAvatarBorderView smartAvatarBorderView3 = lVar.f94826i;
            if (smartAvatarBorderView3 == null || smartAvatarBorderView3.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            lVar.a(smartAvatarBorderView2, z2);
            if (lVar.f94818a != null) {
                Aweme aweme = lVar.f94818a;
                if (aweme == null) {
                    h.f.b.l.b();
                }
                User author = aweme.getAuthor();
                if (author != null && n.a.a(author) && lVar.b(author)) {
                    Aweme aweme2 = lVar.f94818a;
                    if (aweme2 == null) {
                        h.f.b.l.b();
                    }
                    n.a.a(aweme2.getAuthor(), "video");
                }
            }
        }
    }

    public static final class f implements bo {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f94839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f94840b;

        static {
            Covode.recordClassIndex(60156);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.bo
        public final void a() {
            String str;
            String str2;
            String str3;
            this.f94839a.a("");
            q c2 = new q().c(this.f94839a.f94818a, this.f94839a.f94822e);
            String str4 = this.f94839a.f94819b;
            if (str4 == null) {
                str4 = "";
            }
            q qVar = (q) c2.o(str4).a(this.f94839a.f94824g);
            DataCenter dataCenter = this.f94839a.f94823f;
            String str5 = null;
            if (dataCenter != null) {
                str = (String) dataCenter.b("playlist_type", "");
            } else {
                str = null;
            }
            qVar.t = str;
            DataCenter dataCenter2 = this.f94839a.f94823f;
            if (dataCenter2 != null) {
                str2 = (String) dataCenter2.b("playlist_id", "");
            } else {
                str2 = null;
            }
            qVar.v = str2;
            DataCenter dataCenter3 = this.f94839a.f94823f;
            if (dataCenter3 != null) {
                str3 = (String) dataCenter3.b("playlist_id_key", "");
            } else {
                str3 = null;
            }
            qVar.u = str3;
            DataCenter dataCenter4 = this.f94839a.f94823f;
            if (dataCenter4 != null) {
                str5 = (String) dataCenter4.b("tab_name", "");
            }
            com.ss.android.ugc.aweme.metrics.a a2 = ((com.ss.android.ugc.aweme.metrics.a) qVar.c(str5).d(ac.b(this.f94839a.f94818a, this.f94839a.f94822e))).a("click_head");
            Context context = this.f94839a.f94824g;
            if (context == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.metrics.h f2 = a2.l(FeedParamProvider.a.a(context).getSearchId()).f(this.f94840b.element);
            Context context2 = this.f94839a.f94824g;
            if (context2 == null) {
                h.f.b.l.b();
            }
            String previousPage = FeedParamProvider.a.a(context2).getPreviousPage();
            Context context3 = this.f94839a.f94824g;
            if (context3 == null) {
                h.f.b.l.b();
            }
            f2.n(y.a(previousPage, FeedParamProvider.a.a(context3).getFromGroupId())).f();
        }

        f(l lVar, z.e eVar) {
            this.f94839a = lVar;
            this.f94840b = eVar;
        }
    }

    public static final class d implements IProfileBadgeService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f94836a;

        static {
            Covode.recordClassIndex(60154);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(l lVar) {
            this.f94836a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.c
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            User author;
            Aweme aweme = this.f94836a.f94818a;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                IAccountUserService e2 = AccountService.a().e();
                h.f.b.l.b(e2, "");
                User curUser = e2.getCurUser();
                String uid = author.getUid();
                h.f.b.l.b(curUser, "");
                if (h.f.b.l.a((Object) uid, (Object) curUser.getUid())) {
                    author.setProfileBadgeStruct(profileBadgeStruct);
                    this.f94836a.a(author);
                }
            }
        }
    }

    public final void a(User user) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Aweme aweme = this.f94818a;
        hashMap.put("aweme_state", aweme);
        if (aweme == null) {
            h.f.b.l.b();
        }
        a(hashMap, aweme.getAuthor());
        a(user, hashMap);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(User user) {
        LiveOuterService.s();
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.y(this.f94818a)) {
            return true;
        }
        if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.c.a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    @org.greenrobot.eventbus.r
    public final void onTopViewInFeed(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        Aweme aweme;
        User author;
        h.f.b.l.d(aVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.a(aVar.f34874a);
        if (aVar.f34874a == 3 && com.ss.android.ugc.aweme.commercialize.e.a.b.w(this.f94818a) && !com.ss.android.ugc.aweme.commercialize.e.a.b.x(this.f94818a) && (aweme = this.f94818a) != null && (author = aweme.getAuthor()) != null) {
            a(author);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onTopViewLiveEnd(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
        String str;
        Aweme aweme;
        User author;
        h.f.b.l.d(gVar, "");
        String str2 = gVar.f34887a;
        Aweme aweme2 = this.f94818a;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (!(!h.f.b.l.a((Object) str2, (Object) str)) && (aweme = this.f94818a) != null && (author = aweme.getAuthor()) != null) {
            a(author);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f94831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f94832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f94833c;

        static {
            Covode.recordClassIndex(60152);
        }

        b(l lVar, z.e eVar, User user) {
            this.f94831a = lVar;
            this.f94832b = eVar;
            this.f94833c = user;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.live.feedpage.d dVar = (com.ss.android.ugc.aweme.live.feedpage.d) obj;
            if (this.f94832b.element != null && this.f94832b.element.getAuthor() != null && TextUtils.equals(this.f94832b.element.getAuthorUid(), String.valueOf(dVar.f108377a))) {
                this.f94833c.roomId = dVar.f108378b;
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.y(this.f94831a.f94818a) && !this.f94833c.isLive()) {
                    l lVar = this.f94831a;
                    User author = this.f94832b.element.getAuthor();
                    if (author == null) {
                        h.f.b.l.b();
                    }
                    lVar.a(author);
                }
            }
        }
    }

    public static final class c extends com.bytedance.android.livesdk.callback.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f94834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f94835c;

        static {
            Covode.recordClassIndex(60153);
        }

        @Override // com.bytedance.android.livesdk.callback.b
        public final void a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                if (roomsData != null) {
                    hashMap = roomsData.f23333l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                if (roomsData2 != null && roomsData2.o) {
                    String str3 = this.f94834b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    h.f.b.l.b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("live_ad", str3, str, str4, "0").a("room_id", map.get("audience_live_play_room_id")).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, long j2, long j3) {
            super(j3);
            this.f94834b = str;
            this.f94835c = j2;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onLiveStatusEvent(com.bytedance.android.live.base.a.a aVar) {
        long j2;
        h.f.b.l.d(aVar, "");
        Aweme aweme = this.f94818a;
        if (aweme == null) {
            h.f.b.l.b();
        }
        User author = aweme.getAuthor();
        if (author == null) {
            try {
                h.f.b.l.b();
            } catch (Throwable unused) {
                j2 = 0;
                if (author == null) {
                    return;
                }
            }
        }
        String uid = author.getUid();
        h.f.b.l.b(uid, "");
        j2 = Long.parseLong(uid);
        if (!(!h.f.b.l.a((Object) String.valueOf(aVar.f7363b), (Object) author.getUid()))) {
            if (aVar.f7364c) {
                if (author.roomId != 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().a(j2);
                    a(false, 0, j2);
                }
                author.roomId = 0;
            } else if (aVar.f7362a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().a(j2);
                    a(true, aVar.f7362a, j2);
                }
                author.roomId = aVar.f7362a;
            }
            a(author);
            com.ss.android.ugc.aweme.commercialize.e.a.b.ad(this.f94818a);
        }
    }

    public l(View view) {
        int i2;
        ViewGroup viewGroup;
        h.f.b.l.d(view, "");
        IProfileBadgeService b2 = ProfileBadgeServiceImpl.b();
        h.f.b.l.b(b2, "");
        this.f94830m = b2;
        d dVar = new d(this);
        this.n = dVar;
        com.ss.android.ugc.aweme.cp.b bVar = new com.ss.android.ugc.aweme.cp.b();
        this.y = bVar;
        EventBus.a(EventBus.a(), this);
        this.f94824g = view.getContext();
        this.r = view.findViewById(R.id.p4);
        this.f94826i = (SmartAvatarBorderView) view.findViewById(R.id.fcu);
        this.s = (SmartImageView) view.findViewById(R.id.dbp);
        this.f94827j = (AvatarImageWithLive) view.findViewById(R.id.fd1);
        this.t = (LiveCircleView) view.findViewById(R.id.fcw);
        this.u = (ImageView) view.findViewById(R.id.bwx);
        this.v = (RemoteImageView) view.findViewById(R.id.p5);
        this.x = (ViewGroup) view.findViewById(R.id.b7j);
        this.f94828k = (StoryBrandView) view.findViewById(R.id.fdu);
        Resources resources = view.getResources();
        if (resources != null) {
            i2 = (int) resources.getDimension(R.dimen.fw);
        } else {
            i2 = 0;
        }
        this.w = i2;
        if (af.a() && (viewGroup = this.x) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = (int) com.bytedance.common.utility.n.b(this.f94824g, 40.0f);
            viewGroup.setLayoutParams(layoutParams);
        }
        com.bytedance.ies.dmt.ui.widget.b bVar2 = new com.bytedance.ies.dmt.ui.widget.b();
        SmartAvatarBorderView smartAvatarBorderView = this.f94826i;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setOnTouchListener(bVar2);
        }
        AvatarImageWithLive avatarImageWithLive = this.f94827j;
        if (avatarImageWithLive != null) {
            avatarImageWithLive.setOnTouchListener(bVar2);
        }
        SmartAvatarBorderView smartAvatarBorderView2 = this.f94826i;
        if (smartAvatarBorderView2 != null) {
            smartAvatarBorderView2.setOnClickListener(this);
        }
        AvatarImageWithLive avatarImageWithLive2 = this.f94827j;
        if (avatarImageWithLive2 != null) {
            avatarImageWithLive2.setOnClickListener(this);
        }
        b2.a(dVar);
        bVar.f78244e = this.r;
        bVar.f78245f = this.f94826i;
        bVar.f78246g = this.t;
        bVar.f78247h = this.s;
        bVar.f78248i = this.f94827j;
        bVar.f78249j = this.v;
        bVar.f78250k = this.f94828k;
    }

    public final void a(String str) {
        DataCenter dataCenter = this.f94823f;
        if (dataCenter != null) {
            dataCenter.a("to_profile", str);
            return;
        }
        com.ss.android.ugc.aweme.feed.j.a aVar = new com.ss.android.ugc.aweme.feed.j.a("dataCenter is null! can't go!");
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) aVar);
        com.bytedance.c.a.a.a.b.a(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0.isDelete() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
        // Method dump skipped, instructions count: 893
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.l.onClick(android.view.View):void");
    }

    private static void a(long j2, String str) {
        h.f.b.l.d(str, "");
        ILiveOuterService s2 = LiveOuterService.s();
        h.f.b.l.b(s2, "");
        s2.d().a(b.a.AUDIENCE_LIVE_PLAY_DURATION, new c(str, j2, j2));
    }

    /* access modifiers changed from: package-private */
    public final void a(SmartAvatarBorderView smartAvatarBorderView, boolean z2) {
        String aid;
        List<String> list;
        List<String> list2;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        if (!br.a(this.f94818a, smartAvatarBorderView)) {
            StringBuilder sb = new StringBuilder("FeedAvatarView_");
            Aweme aweme = this.f94818a;
            if (aweme == null) {
                aid = "no_aid";
            } else {
                aid = aweme.getAid();
            }
            String sb2 = sb.append(aid).toString();
            Aweme aweme2 = this.f94818a;
            if (!(aweme2 == null || aweme2.getAuthor() == null)) {
                Aweme aweme3 = this.f94818a;
                if (aweme3 == null) {
                    h.f.b.l.b();
                }
                User author = aweme3.getAuthor();
                UrlModel urlModel = null;
                if (!(author == null || author.getAvatarThumb() == null)) {
                    Aweme aweme4 = this.f94818a;
                    if (aweme4 == null) {
                        h.f.b.l.b();
                    }
                    User author2 = aweme4.getAuthor();
                    if (author2 == null || (avatarThumb2 = author2.getAvatarThumb()) == null) {
                        list = null;
                    } else {
                        list = avatarThumb2.getUrlList();
                    }
                    if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        if (smartAvatarBorderView == this.f94826i && ad.a()) {
                            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
                            Aweme aweme5 = this.f94818a;
                            if (aweme5 == null) {
                                h.f.b.l.b();
                            }
                            User author3 = aweme5.getAuthor();
                            if (author3 == null || (avatarThumb = author3.getAvatarThumb()) == null) {
                                list2 = null;
                            } else {
                                list2 = avatarThumb.getUrlList();
                            }
                            com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedAvatarView", sb3.append(list2).toString());
                        }
                        if (smartAvatarBorderView != null) {
                            Aweme aweme6 = this.f94818a;
                            if (aweme6 == null) {
                                h.f.b.l.b();
                            }
                            User author4 = aweme6.getAuthor();
                            if (author4 != null) {
                                urlModel = author4.getAvatarThumb();
                            }
                            int[] a2 = em.a(101);
                            int i2 = this.w;
                            smartAvatarBorderView.a(urlModel, a2, i2, i2, sb2);
                            return;
                        }
                        return;
                    }
                }
            }
            v a3 = com.bytedance.lighten.a.r.a(2131232324);
            a3.K = true;
            v a4 = a3.a(sb2);
            a4.E = smartAvatarBorderView;
            a4.c();
        } else if (z2) {
            com.ss.android.ugc.aweme.commercialize.g.h().a(br.a(this.f94818a, "icon"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.User r14, java.util.HashMap<java.lang.String, java.lang.Object> r15) {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.l.a(com.ss.android.ugc.aweme.profile.model.User, java.util.HashMap):void");
    }

    public final void a(HashMap<String, Object> hashMap, User user) {
        h.f.b.l.d(hashMap, "");
        hashMap.put("check_vast_ad_state", Boolean.valueOf(br.a(this.f94818a, 3)));
        hashMap.put("show_live_state", Boolean.valueOf(b(user)));
        if (user != null) {
            if (com.ss.android.ugc.aweme.account.b.g().isMe(user.getUid())) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                user.roomId = g2.getCurUser().roomId;
            }
            if (this.f94829l == null) {
                this.f94829l = new d(user.isLive(), this.f94827j, this.f94826i, this.t);
            }
            Aweme aweme = this.f94818a;
            if (aweme != null && aweme.getAuthor() != null && this.A == null) {
                z.e eVar = new z.e();
                eVar.element = (T) this.f94818a;
                this.A = new b(this, eVar, user);
            }
        }
    }

    private static void a(boolean z2, long j2, long j3) {
        String str;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", "click").a("anchor_id", String.valueOf(j3)).a("room_id", String.valueOf(j2)).a("enter_from_merge", "homepage_hot").a("enter_method", "video_head");
        if (z2) {
            str = "live_on";
        } else {
            str = "live_off";
        }
        com.ss.android.ugc.aweme.common.r.a("livesdk_live_status_change", a2.a("status", str).f66730a);
    }
}
