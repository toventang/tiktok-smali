package com.ss.android.ugc.aweme.story.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.l.b.a;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.r.b;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j implements com.ss.android.ugc.aweme.r.a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f137983a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f137984b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, p<List<EnterRoomConfig>, com.ss.android.ugc.aweme.r.b>> f137985c = new HashMap<>();

    static final class b implements com.bytedance.android.livesdkapi.g.i {

        /* renamed from: c  reason: collision with root package name */
        public static final a f137986c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        List<EnterRoomConfig> f137987a;

        /* renamed from: b  reason: collision with root package name */
        com.ss.android.ugc.aweme.r.b f137988b;

        static {
            Covode.recordClassIndex(90251);
        }

        @Override // com.bytedance.android.livesdkapi.g.i
        public final void a(long j2) {
        }

        @Override // com.bytedance.android.livesdkapi.g.i
        public final void b() {
        }

        public static final class a {
            static {
                Covode.recordClassIndex(90252);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.live.j$b$b  reason: collision with other inner class name */
        static final class C3631b {

            /* renamed from: a  reason: collision with root package name */
            static b f137989a = new b((byte) 0);

            /* renamed from: b  reason: collision with root package name */
            public static final C3631b f137990b = new C3631b();

            private C3631b() {
            }

            static {
                Covode.recordClassIndex(90253);
            }
        }

        private b() {
        }

        @Override // com.bytedance.android.livesdkapi.g.i
        public final List<EnterRoomConfig> a() {
            return this.f137987a;
        }

        public static final class c implements b.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i.a f137991a;

            static {
                Covode.recordClassIndex(90254);
            }

            c(i.a aVar) {
                this.f137991a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.r.b.a
            public final void a(String str) {
                h.f.b.l.d(str, "");
                this.f137991a.a();
            }

            @Override // com.ss.android.ugc.aweme.r.b.a
            public final void a(List<? extends Aweme> list) {
                h.f.b.l.d(list, "");
                this.f137991a.a(a.a(list));
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.android.livesdkapi.g.i
        public final void a(Map<String, String> map) {
            h.f.b.l.d(map, "");
            com.ss.android.ugc.aweme.r.b bVar = this.f137988b;
            if (bVar != null) {
                bVar.a(map);
            }
        }

        @Override // com.bytedance.android.livesdkapi.g.i
        public final void a(int i2, i.a aVar) {
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.aweme.r.b bVar = this.f137988b;
            if (bVar != null) {
                bVar.a(new c(aVar));
            }
        }
    }

    static {
        Covode.recordClassIndex(90249);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90250);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static /* synthetic */ EnterRoomConfig a(Aweme aweme) {
            return a(aweme, new EnterRoomConfig());
        }

        public static List<EnterRoomConfig> a(List<? extends Aweme> list) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                return arrayList;
            }
            for (Aweme aweme : list) {
                EnterRoomConfig a2 = a(aweme);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        }

        public static EnterRoomConfig a(Aweme aweme, EnterRoomConfig enterRoomConfig) {
            if (aweme != null) {
                a(aweme.getNewLiveRoomData(), enterRoomConfig);
            }
            return enterRoomConfig;
        }

        public static EnterRoomConfig a(LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
            LiveStreamUrlExtra.SrConfig srConfig;
            if (liveRoomStruct != null) {
                enterRoomConfig.f23299c.R = liveRoomStruct.id;
                enterRoomConfig.f23299c.D = String.valueOf(liveRoomStruct.userId);
                if (liveRoomStruct.isScreenshot) {
                    enterRoomConfig.f23297a.f23346j = 4;
                } else if (liveRoomStruct.isThirdParty) {
                    enterRoomConfig.f23297a.f23346j = 3;
                } else if (liveRoomStruct.liveTypeAudio) {
                    enterRoomConfig.f23297a.f23346j = 2;
                }
                enterRoomConfig.f23297a.f23340d = liveRoomStruct.getMultiStreamData();
                enterRoomConfig.f23297a.f23339c = null;
                enterRoomConfig.f23297a.f23342f = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
                LiveStreamUrlExtra streamUrlExtra = liveRoomStruct.getStreamUrlExtra();
                if (!(streamUrlExtra == null || (srConfig = streamUrlExtra.getSrConfig()) == null)) {
                    enterRoomConfig.f23297a.f23343g = srConfig.enabled;
                    enterRoomConfig.f23297a.f23344h = srConfig.antiAlias;
                    enterRoomConfig.f23297a.f23345i = srConfig.strength;
                }
            }
            return enterRoomConfig;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final com.ss.android.ugc.aweme.r.a f137992a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final c f137993b = new c();

        private c() {
        }

        static {
            Covode.recordClassIndex(90255);
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, User user, boolean z) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(user, "");
        if (!a(user)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.eve).a();
            return;
        }
        d.a(z, 1, user.getRequestId(), user.getUid(), user.roomId);
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.J = "others_homepage";
        enterRoomConfig.f23299c.L = "others_photo";
        a(context, user, enterRoomConfig);
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig, User user, long[] jArr, long j2, int i2) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(enterRoomConfig, "");
        h.f.b.l.d(user, "");
        h.f.b.l.d(jArr, "");
        if (!f137983a) {
            if (!a(user)) {
                LiveHostOuterService.q().a(user.getUid(), user.getSecUid(), new C3632j(this, context, enterRoomConfig, jArr, i2, user));
                f137983a = true;
                return;
            }
            com.bytedance.android.live.u.h.a(k.f138021a);
            enterRoomConfig.f23299c.H = jArr;
            enterRoomConfig.f23299c.J = "message";
            enterRoomConfig.f23299c.L = "live_cell";
            enterRoomConfig.f23298b.f23310b = String.valueOf(j2);
            enterRoomConfig.f23298b.M = i2;
            a(context, user, enterRoomConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig, String str) {
        h.f.b.l.d(enterRoomConfig, "");
        a(context, str, enterRoomConfig, (List<Long>) null, (String) null);
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, User user, EnterRoomConfig enterRoomConfig) {
        if (context != null && user != null && enterRoomConfig != null) {
            String str = enterRoomConfig.f23298b.f23309a;
            if (str == null || str.length() == 0) {
                enterRoomConfig.f23298b.f23309a = user.getRequestId();
            }
            int followStatus = user.getFollowStatus();
            if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
                enterRoomConfig.f23299c.F = String.valueOf(followStatus);
            } else {
                enterRoomConfig.f23299c.F = "3";
            }
            String str2 = user.roomData;
            long j2 = user.roomId;
            if (TextUtils.isEmpty(enterRoomConfig.f23298b.f23310b)) {
                enterRoomConfig.f23298b.f23310b = user.getUid();
            }
            if (!TextUtils.isEmpty(enterRoomConfig.f23299c.f23325d)) {
                enterRoomConfig.f23299c.f23325d = user.getSecUid();
            }
            enterRoomConfig.f23299c.R = j2;
            EnterRoomConfig.GuestUser guestUser = enterRoomConfig.f23299c.au;
            if (guestUser != null && guestUser.f23305a == 0) {
                try {
                    EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f23299c.au;
                    if (guestUser2 != null) {
                        String uid = user.getUid();
                        h.f.b.l.b(uid, "");
                        guestUser2.f23305a = Long.parseLong(uid);
                    }
                } catch (NumberFormatException unused) {
                    EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.f23299c.au;
                    if (guestUser3 != null) {
                        guestUser3.f23305a = -1;
                    }
                }
                EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f23299c.au;
                if (guestUser4 != null) {
                    guestUser4.f23306b = user.getUniqueId();
                }
            }
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                h.f.b.l.b(avatarThumb, "");
                if (com.bytedance.common.utility.h.b(avatarThumb.getUrlList())) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    h.f.b.l.b(avatarThumb2, "");
                    roomsData.ay = new ImageModel(null, avatarThumb2.getUrlList());
                }
            }
            a(context, enterRoomConfig, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle) {
        LiveStreamUrlExtra.SrConfig srConfig;
        h.f.b.l.d(context, "");
        h.f.b.l.d(user, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.J = "chat";
        enterRoomConfig.f23299c.L = "live_cover";
        enterRoomConfig.f23298b.C = bundle.getString("share_user_id", null);
        if (newLiveRoomStruct != null) {
            enterRoomConfig.f23299c.D = user.getUid();
            enterRoomConfig.f23299c.f23325d = user.getSecUid();
            enterRoomConfig.f23298b.f23310b = user.getUid();
            enterRoomConfig.f23297a.f23349m = true;
            h.f.b.l.d(enterRoomConfig, "");
            enterRoomConfig.f23299c.R = newLiveRoomStruct.id;
            enterRoomConfig.f23297a.f23348l = newLiveRoomStruct.id;
            enterRoomConfig.f23297a.f23346j = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
            enterRoomConfig.f23297a.f23340d = newLiveRoomStruct.getMultiStreamData();
            enterRoomConfig.f23297a.f23339c = null;
            enterRoomConfig.f23297a.f23342f = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
            if (!(streamUrlExtra == null || (srConfig = streamUrlExtra.getSrConfig()) == null)) {
                enterRoomConfig.f23297a.f23343g = srConfig.enabled;
                enterRoomConfig.f23297a.f23344h = srConfig.antiAlias;
                enterRoomConfig.f23297a.f23345i = srConfig.strength;
            }
            a(context, "", enterRoomConfig, (List<Long>) null, (String) null);
            return;
        }
        a(context, user, enterRoomConfig);
    }

    public final void a(Context context, String str, EnterRoomConfig enterRoomConfig, List<Long> list, String str2) {
        if (b() && !d()) {
            ao.a(y.e(), (int) R.string.gm8);
        } else if (Live.getService() != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin()) {
                if (in.d() || in.f()) {
                    a.C0976a.f39760a.a("ttlive_minor_mode_live", 0, new HashMap());
                }
                if (com.bytedance.common.utility.l.b(context) || ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).b(context) || !(context instanceof Activity) || LiveHostOuterService.q().c(context) || !a()) {
                    a(str, enterRoomConfig);
                    enterRoomConfig.f23297a.f23337a = true;
                    if (list != null && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        long[] jArr = new long[list.size()];
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            jArr[i2] = list.get(i2).longValue();
                        }
                        enterRoomConfig.f23299c.H = jArr;
                    }
                    f.a.f23366a.a(new EnterRoomLinkSession(enterRoomConfig));
                    Event event = new Event("ttlive_live_watch_live", 3328, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
                    event.a("live $ watchLive ");
                    com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
                    h.f.b.l.b(fVar, "");
                    fVar.a().a(event);
                    if (!TextUtils.isEmpty(str2)) {
                        enterRoomConfig.f23299c.I = str2;
                    }
                    enterRoomConfig.f23299c.aa = "outside_normal_click";
                    LivePlayActivity.a(context, enterRoomConfig);
                    a(enterRoomConfig.f23299c.J, enterRoomConfig.f23299c.L);
                    return;
                }
                new a.C0731a(context).b(R.string.h_m).a(R.string.asg, (DialogInterface.OnClickListener) new l(this, context, str, enterRoomConfig, list, str2), false).b(R.string.a9e, (DialogInterface.OnClickListener) new m(enterRoomConfig), false).a().b();
            } else if (context instanceof Activity) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_fullscreen_dialog", true);
                bundle.putBoolean("is_skippable_dialog", false);
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62402b = enterRoomConfig.f23299c.J;
                dVar.f62403c = enterRoomConfig.f23299c.L;
                dVar.f62401a = (Activity) context;
                dVar.f62404d = bundle;
                dVar.f62405e = new n(this, context, str, enterRoomConfig, list, str2);
                AccountService.a().g().showLoginAndRegisterView(dVar.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, com.ss.android.ugc.aweme.r.b bVar) {
        EnterRoomConfig.RoomsData roomsData;
        h.f.b.l.d(enterRoomConfig, "");
        h.f.b.l.d(liveRoomStruct, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(bVar, "");
        if (context != null) {
            this.f137985c.clear();
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (LiveRoomStruct liveRoomStruct2 : list) {
                    EnterRoomConfig a2 = a.a(liveRoomStruct2, new EnterRoomConfig());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            this.f137985c.put(String.valueOf(bVar.hashCode()), new p<>(arrayList, bVar));
            if (b() && !d()) {
                ao.a(y.e(), (int) R.string.gm8);
            } else if (Live.getService() != null) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                String str = null;
                if (g2.isLogin()) {
                    if (in.d() || in.f()) {
                        a.C0976a.f39760a.a("ttlive_minor_mode_live", 0, new HashMap());
                    }
                    if (!com.bytedance.common.utility.l.b(context) && !((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).b(context) && (context instanceof Activity) && !LiveHostOuterService.q().c(context) && a()) {
                        new a.C0731a(context).b(R.string.h_m).a(R.string.asg, (DialogInterface.OnClickListener) new g(this, context, enterRoomConfig, liveRoomStruct, list, bVar), false).b(R.string.a9e, (DialogInterface.OnClickListener) h.f138008a, false).a().b();
                    } else if (!list.isEmpty()) {
                        list.get(0);
                        EnterRoomConfig a3 = a.a(liveRoomStruct, enterRoomConfig);
                        if (a3 != null) {
                            EnterRoomConfig.SearchWrapData searchWrapData = a3.f23301e;
                            if (searchWrapData != null) {
                                searchWrapData.f23336a = String.valueOf(bVar.hashCode());
                            }
                            EnterRoomConfig.RoomsData roomsData2 = a3.f23299c;
                            if (roomsData2 != null) {
                                roomsData2.aa = "outside_normal_click";
                            }
                        }
                        EnterRoomLinkSession.a(a3);
                        Event event = new Event("ttlive_live_watch_live", 3328, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
                        event.a("live $ watchLive ");
                        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
                        h.f.b.l.b(fVar, "");
                        fVar.a().a(event);
                        LivePlayActivity.a(context, a3);
                        if (!(a3 == null || (roomsData = a3.f23299c) == null)) {
                            str = roomsData.L;
                        }
                        a("search", str);
                    }
                } else if (context instanceof Activity) {
                    com.ss.android.ugc.aweme.login.c.a((Activity) context, "personal_homepage", "click", new Bundle(), (com.ss.android.ugc.aweme.base.component.f) null);
                }
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137994a = new d();

        static {
            Covode.recordClassIndex(90256);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f138021a = new k();

        static {
            Covode.recordClassIndex(90263);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return z.f158842a;
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean c2 = c();
        com.ss.android.ugc.aweme.lancet.j.f107226e = c2;
        return c2;
    }

    private static boolean a() {
        if (Live.getService() == null) {
            return true;
        }
        Integer num = (Integer) Live.getService().a("live_mt_remove_traffic_dialog", (Object) 0);
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    private static boolean b() {
        Integer num;
        if (Live.getService() == null || (num = (Integer) Live.getService().a("live_opt_enter_room_success", (Object) 0)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$j  reason: collision with other inner class name */
    public static final class C3632j implements ILiveHostOuterService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f138016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long[] f138018d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f138019e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ User f138020f;

        static {
            Covode.recordClassIndex(90262);
        }

        @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService.a
        public final void a(Exception exc) {
            h.f.b.l.d(exc, "");
            j.f137983a = false;
        }

        @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService.a
        public final void a(User user) {
            j.f137983a = false;
            if (user != null) {
                if (!j.a(user)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f138016b).a(R.string.eve).a();
                    return;
                }
                this.f138017c.f23299c.H = this.f138018d;
                this.f138017c.f23299c.J = "message";
                this.f138017c.f23299c.L = "live_cell";
                this.f138017c.f23298b.M = this.f138019e;
                this.f138015a.a(this.f138016b, this.f138020f, this.f138017c);
            }
        }

        C3632j(j jVar, Context context, EnterRoomConfig enterRoomConfig, long[] jArr, int i2, User user) {
            this.f138015a = jVar;
            this.f138016b = context;
            this.f138017c = enterRoomConfig;
            this.f138018d = jArr;
            this.f138019e = i2;
            this.f138020f = user;
        }
    }

    public static boolean a(User user) {
        if (user == null || user.isBlock()) {
            return false;
        }
        if (!(!in.b(user, false) || user.getFollowStatus() == 2 || user.getFollowStatus() == 1)) {
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            h.f.b.l.b(e2, "");
            if (!h.f.b.l.a((Object) e2.getCurUserId(), (Object) user.getUid())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final com.bytedance.android.livesdkapi.g.i a(String str) {
        com.ss.android.ugc.aweme.r.b bVar;
        h.f.b.l.d(str, "");
        b bVar2 = b.C3631b.f137989a;
        HashMap<String, p<List<EnterRoomConfig>, com.ss.android.ugc.aweme.r.b>> hashMap = this.f137985c;
        h.f.b.l.d(hashMap, "");
        p<List<EnterRoomConfig>, com.ss.android.ugc.aweme.r.b> pVar = hashMap.get(str);
        List<EnterRoomConfig> list = null;
        if (pVar != null) {
            bVar = pVar.getSecond();
        } else {
            bVar = null;
        }
        bVar2.f137988b = bVar;
        p<List<EnterRoomConfig>, com.ss.android.ugc.aweme.r.b> pVar2 = hashMap.get(str);
        if (pVar2 != null) {
            list = pVar2.getFirst();
        }
        bVar2.f137987a = list;
        return b.C3631b.f137989a;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f138001a = new f();

        static {
            Covode.recordClassIndex(90258);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f138008a = new h();

        static {
            Covode.recordClassIndex(90260);
        }

        h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig) {
        h.f.b.l.d(enterRoomConfig, "");
        a(context, "", enterRoomConfig, (List<Long>) null, (String) null);
    }

    /* access modifiers changed from: package-private */
    public static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f138023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f138024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f138026e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f138027f;

        static {
            Covode.recordClassIndex(90264);
        }

        l(j jVar, Context context, String str, EnterRoomConfig enterRoomConfig, List list, String str2) {
            this.f138022a = jVar;
            this.f138023b = context;
            this.f138024c = str;
            this.f138025d = enterRoomConfig;
            this.f138026e = list;
            this.f138027f = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).a(this.f138023b);
            this.f138022a.a(this.f138023b, this.f138024c, this.f138025d, this.f138026e, this.f138027f);
            dialogInterface.dismiss();
        }
    }

    private static void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from_merge", str);
            jSONObject.put("enter_method", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a("ttlive_enter_room_live_entrance", 0, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f137995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f137996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f137997c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f137998d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f137999e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.r.b f138000f;

        static {
            Covode.recordClassIndex(90257);
        }

        e(j jVar, Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List list, com.ss.android.ugc.aweme.r.b bVar) {
            this.f137995a = jVar;
            this.f137996b = context;
            this.f137997c = enterRoomConfig;
            this.f137998d = aweme;
            this.f137999e = list;
            this.f138000f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).a(this.f137996b);
            this.f137995a.a(this.f137996b, this.f137997c, this.f137998d, this.f137999e, this.f138000f);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f138003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138004c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f138005d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f138006e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.r.b f138007f;

        static {
            Covode.recordClassIndex(90259);
        }

        g(j jVar, Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List list, com.ss.android.ugc.aweme.r.b bVar) {
            this.f138002a = jVar;
            this.f138003b = context;
            this.f138004c = enterRoomConfig;
            this.f138005d = liveRoomStruct;
            this.f138006e = list;
            this.f138007f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).a(this.f138003b);
            this.f138002a.a(this.f138003b, this.f138004c, this.f138005d, this.f138006e, this.f138007f);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138028a;

        static {
            Covode.recordClassIndex(90265);
        }

        m(EnterRoomConfig enterRoomConfig) {
            this.f138028a = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            if (TextUtils.equals(this.f138028a.f23299c.J, "push")) {
                if (com.bytedance.common.utility.m.a(this.f138028a.f23298b.f23310b)) {
                    str = "";
                } else {
                    str = this.f138028a.f23298b.f23310b;
                }
                d.a(str, this.f138028a.f23299c.R, "no_wifi_dialog_cancel");
            }
            dialogInterface.dismiss();
        }
    }

    private static void a(String str, EnterRoomConfig enterRoomConfig) {
        String str2;
        if (enterRoomConfig != null && !TextUtils.isEmpty(str) && com.bytedance.common.utility.m.a(enterRoomConfig.f23297a.f23340d) && com.bytedance.common.utility.m.a(enterRoomConfig.f23297a.f23338b)) {
            int i2 = 1;
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                Boolean enableEnterLiveRoomStreamOpt = iESSettingsProxy.getEnableEnterLiveRoomStreamOpt();
                if (enableEnterLiveRoomStreamOpt != null && !enableEnterLiveRoomStreamOpt.booleanValue()) {
                    return;
                }
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
            Long l2 = null;
            if (1 != 0) {
                try {
                    SlimRoom slimRoom = (SlimRoom) dg.a(str, SlimRoom.class);
                    if (slimRoom != null) {
                        enterRoomConfig.f23297a.f23348l = slimRoom.getId();
                        enterRoomConfig.f23297a.f23338b = slimRoom.buildPullUrl();
                        enterRoomConfig.f23297a.f23339c = slimRoom.getSdkParams();
                        enterRoomConfig.f23297a.f23340d = slimRoom.getMultiStreamData();
                        enterRoomConfig.f23297a.f23342f = slimRoom.getMultiStreamDefaultQualitySdkKey();
                        s streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
                        h.f.b.l.b(streamUrlExtraSafely, "");
                        s.a aVar = streamUrlExtraSafely.n;
                        if (aVar != null) {
                            enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                            enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                            enterRoomConfig.f23297a.f23345i = aVar.f23194c;
                        }
                        enterRoomConfig.f23297a.f23346j = slimRoom.getStreamType().ordinal();
                        if (slimRoom.getLinkMic() != null) {
                            EnterRoomConfig.GuestUser guestUser = enterRoomConfig.f23299c.au;
                            if (guestUser != null && guestUser.f23305a == 0) {
                                SlimRoom.a linkMic = slimRoom.getLinkMic();
                                h.f.b.l.b(linkMic, "");
                                if (linkMic.f23031a != null) {
                                    SlimRoom.a linkMic2 = slimRoom.getLinkMic();
                                    h.f.b.l.b(linkMic2, "");
                                    if (linkMic2.f23031a.size() > 0) {
                                        EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f23299c.au;
                                        if (guestUser2 != null) {
                                            SlimRoom.a linkMic3 = slimRoom.getLinkMic();
                                            h.f.b.l.b(linkMic3, "");
                                            com.bytedance.android.live.base.model.user.User user = linkMic3.f23031a.get(0);
                                            h.f.b.l.b(user, "");
                                            guestUser2.f23305a = user.getId();
                                        }
                                        EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.f23299c.au;
                                        if (guestUser3 != null) {
                                            SlimRoom.a linkMic4 = slimRoom.getLinkMic();
                                            h.f.b.l.b(linkMic4, "");
                                            guestUser3.f23306b = linkMic4.f23031a.get(0).getDisplayId();
                                        }
                                    }
                                }
                            }
                            SlimRoom.a linkMic5 = slimRoom.getLinkMic();
                            h.f.b.l.b(linkMic5, "");
                            if (linkMic5.f23032b != null) {
                                EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f23299c.au;
                                if (guestUser4 != null) {
                                    SlimRoom.a linkMic6 = slimRoom.getLinkMic();
                                    h.f.b.l.b(linkMic6, "");
                                    if (linkMic6.f23032b.size() <= 0) {
                                        i2 = 0;
                                    }
                                    guestUser4.f23307c = i2;
                                }
                                EnterRoomConfig.GuestUser guestUser5 = enterRoomConfig.f23299c.au;
                                if (guestUser5 != null) {
                                    SlimRoom.a linkMic7 = slimRoom.getLinkMic();
                                    h.f.b.l.b(linkMic7, "");
                                    List<Long> list = linkMic7.f23032b;
                                    EnterRoomConfig.GuestUser guestUser6 = enterRoomConfig.f23299c.au;
                                    if (guestUser6 != null) {
                                        l2 = Long.valueOf(guestUser6.f23305a);
                                    }
                                    if (list.contains(l2)) {
                                        str2 = "guest";
                                    } else {
                                        str2 = "anchor";
                                    }
                                    guestUser5.f23308d = str2;
                                }
                            }
                        }
                        enterRoomConfig.f23299c.aq = slimRoom.isLiveTypeScreenshot();
                        if (slimRoom.warningTag != null) {
                            enterRoomConfig.f23299c.aE = slimRoom.warningTag;
                        }
                        if (slimRoom.maskLayer != null) {
                            enterRoomConfig.f23299c.aD = slimRoom.maskLayer;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f138010b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f138012d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f138013e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.r.b f138014f;

        static {
            Covode.recordClassIndex(90261);
        }

        i(j jVar, Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List list, com.ss.android.ugc.aweme.r.b bVar) {
            this.f138009a = jVar;
            this.f138010b = context;
            this.f138011c = enterRoomConfig;
            this.f138012d = aweme;
            this.f138013e = list;
            this.f138014f = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                this.f138009a.a(this.f138010b, this.f138011c, this.f138012d, this.f138013e, this.f138014f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f138030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f138031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f138032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f138033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f138034f;

        static {
            Covode.recordClassIndex(90266);
        }

        n(j jVar, Context context, String str, EnterRoomConfig enterRoomConfig, List list, String str2) {
            this.f138029a = jVar;
            this.f138030b = context;
            this.f138031c = str;
            this.f138032d = enterRoomConfig;
            this.f138033e = list;
            this.f138034f = str2;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                this.f138029a.a(this.f138030b, this.f138031c, this.f138032d, this.f138033e, this.f138034f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void b(Context context, EnterRoomConfig enterRoomConfig, String str) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(enterRoomConfig, "");
        h.f.b.l.d(str, "");
        if (Live.getService() != null) {
            com.bytedance.android.live.u.h.a(d.f137994a);
            HashMap hashMap = new HashMap();
            hashMap.put("intercept", "new_style");
            hashMap.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", str);
            hashMap.put("toplive_position", enterRoomConfig.f23298b.G);
            enterRoomConfig.f23299c.P = str;
            enterRoomConfig.f23298b.M = 0;
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            f.a.f23366a.a(enterRoomLinkSession);
            enterRoomLinkSession.a(new Event("ttlive_enter_live_converge_start", 3329, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
            if (enterRoomConfig.f23299c.O && Live.getService() != null) {
                com.bytedance.android.livesdkapi.service.d service = Live.getService();
                h.f.b.l.b(service, "");
                if (service.o() != null) {
                    com.bytedance.android.livesdkapi.service.d service2 = Live.getService();
                    h.f.b.l.b(service2, "");
                    service2.o().a(hashMap);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, com.ss.android.ugc.aweme.r.b bVar) {
        String str;
        EnterRoomConfig.RoomsData roomsData;
        Aweme aweme2 = aweme;
        h.f.b.l.d(enterRoomConfig, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(bVar, "");
        if (context != null) {
            this.f137985c.clear();
            this.f137985c.put(String.valueOf(bVar.hashCode()), new p<>(a.a(list), bVar));
            if (b() && !d()) {
                ao.a(y.e(), (int) R.string.gm8);
            } else if (Live.getService() != null) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (g2.isLogin()) {
                    if (in.d() || in.f()) {
                        a.C0976a.f39760a.a("ttlive_minor_mode_live", 0, new HashMap());
                    }
                    if (!com.bytedance.common.utility.l.b(context) && !((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).b(context) && (context instanceof Activity) && !LiveHostOuterService.q().c(context) && a()) {
                        new a.C0731a(context).b(R.string.h_m).a(R.string.asg, (DialogInterface.OnClickListener) new e(this, context, enterRoomConfig, aweme2, list, bVar), false).b(R.string.a9e, (DialogInterface.OnClickListener) f.f138001a, false).a().b();
                    } else if (!list.isEmpty()) {
                        Aweme aweme3 = list.get(0);
                        if (aweme2 == null) {
                            aweme2 = aweme3;
                        }
                        EnterRoomConfig a2 = a.a(aweme2, enterRoomConfig);
                        if (a2 != null) {
                            EnterRoomConfig.SearchWrapData searchWrapData = a2.f23301e;
                            if (searchWrapData != null) {
                                searchWrapData.f23336a = String.valueOf(bVar.hashCode());
                            }
                            EnterRoomConfig.RoomsData roomsData2 = a2.f23299c;
                            if (roomsData2 != null) {
                                roomsData2.aa = "outside_normal_click";
                            }
                        }
                        EnterRoomLinkSession.a(a2);
                        Event event = new Event("ttlive_live_watch_live", 3328, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall);
                        event.a("live $ watchLive ");
                        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
                        h.f.b.l.b(fVar, "");
                        fVar.a().a(event);
                        LivePlayActivity.a(context, a2);
                        if (a2 == null || (roomsData = a2.f23299c) == null) {
                            str = null;
                        } else {
                            str = roomsData.L;
                        }
                        a("search", str);
                    }
                } else if (context instanceof Activity) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_skippable_dialog", false);
                    IAccountService.d dVar = new IAccountService.d();
                    dVar.f62402b = enterRoomConfig.f23299c.J;
                    dVar.f62403c = enterRoomConfig.f23299c.L;
                    dVar.f62401a = (Activity) context;
                    dVar.f62404d = bundle;
                    dVar.f62405e = new i(this, context, enterRoomConfig, aweme2, list, bVar);
                    AccountService.a().g().showLoginAndRegisterView(dVar.a());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.r.a
    public final void a(Context context, long j2, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2) {
        h.f.b.l.d(enterRoomConfig, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        enterRoomConfig.f23299c.R = j2;
        enterRoomConfig.f23299c.J = str;
        a(context, "", enterRoomConfig, arrayList, str2);
    }
}
