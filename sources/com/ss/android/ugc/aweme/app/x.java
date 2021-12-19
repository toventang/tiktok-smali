package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptSchemaWatchLiveSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.app.ac;
import com.ss.android.ugc.aweme.app.b;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper;
import com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

public final class x extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final c f66896b = new c((byte) 0);

    static {
        Covode.recordClassIndex(41207);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(41210);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class p extends aw {
        static {
            Covode.recordClassIndex(41223);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "live";
        }

        private static boolean b() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f66910a;

            static {
                Covode.recordClassIndex(41224);
            }

            a(User user) {
                this.f66910a = user;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String uid = this.f66910a.getUid();
                h.f.b.l.b(uid, "");
                Long l2 = (Long) ((Map) obj).get(Long.valueOf(Long.parseLong(uid)));
                if (l2 != null) {
                    long longValue = l2.longValue();
                    com.ss.android.ugc.aweme.story.live.d.b(String.valueOf(longValue), this.f66910a.getUid());
                    String uid2 = this.f66910a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    com.ss.android.ugc.aweme.story.live.d.a(uid2, longValue, str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f66911a;

            static {
                Covode.recordClassIndex(41226);
            }

            c(User user) {
                this.f66911a = user;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String uid = this.f66911a.getUid();
                h.f.b.l.b(uid, "");
                Long l2 = (Long) ((Map) obj).get(Long.valueOf(Long.parseLong(uid)));
                if (l2 != null) {
                    long longValue = l2.longValue();
                    com.ss.android.ugc.aweme.story.live.d.b(String.valueOf(longValue), this.f66911a.getUid());
                    String uid2 = this.f66911a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    com.ss.android.ugc.aweme.story.live.d.a(uid2, longValue, str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.live.deeplink.c, h.z> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ String $backIndex;
            final /* synthetic */ String $backUrl;
            final /* synthetic */ z.e $enterFromMerge;
            final /* synthetic */ z.e $enterMethod;
            final /* synthetic */ z.e $gdLabel;
            final /* synthetic */ User $user;
            final /* synthetic */ z.e $userId;

            static {
                Covode.recordClassIndex(41225);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(User user, String str, z.e eVar, z.e eVar2, z.e eVar3, String str2, z.e eVar4, Activity activity) {
                super(1);
                this.$user = user;
                this.$backIndex = str;
                this.$enterFromMerge = eVar;
                this.$enterMethod = eVar2;
                this.$gdLabel = eVar3;
                this.$backUrl = str2;
                this.$userId = eVar4;
                this.$activity = activity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.live.deeplink.c cVar) {
                T t;
                int i2;
                com.ss.android.ugc.aweme.live.deeplink.c cVar2 = cVar;
                if (cVar2 != null) {
                    User user = this.$user;
                    String str = cVar2.f108354c;
                    if (str == null) {
                        str = "0";
                    }
                    user.roomId = Long.parseLong(str);
                    this.$user.setUid(cVar2.f108352a);
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    try {
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                        String str2 = this.$backIndex;
                        if (str2 != null) {
                            i2 = Integer.parseInt(str2);
                        } else {
                            i2 = -1;
                        }
                        roomsData.t = i2;
                    } catch (Throwable unused) {
                    }
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                    T t2 = "webview";
                    if (!TextUtils.isEmpty(this.$enterFromMerge.element)) {
                        t = this.$enterFromMerge.element;
                    } else {
                        t = t2;
                    }
                    roomsData2.J = t;
                    EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f23299c;
                    if (!TextUtils.isEmpty(this.$enterMethod.element)) {
                        t2 = this.$enterMethod.element;
                    }
                    roomsData3.L = t2;
                    enterRoomConfig.f23298b.r = this.$gdLabel.element;
                    enterRoomConfig.f23299c.T = this.$backUrl;
                    enterRoomConfig.f23298b.C = this.$userId.element;
                    ILiveOuterService s = LiveOuterService.s();
                    h.f.b.l.b(s, "");
                    s.i().a(this.$activity, this.$user, enterRoomConfig);
                }
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "live");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            long j2;
            Long g2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (!LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
                return b(activity, uri, str, str2, str3, z);
            }
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (z) {
                User user = new User();
                user.setUid(uri.getQueryParameter("user_id"));
                String queryParameter = uri.getQueryParameter("room_id");
                if (queryParameter == null || (g2 = h.m.p.g(queryParameter)) == null) {
                    j2 = 0;
                } else {
                    j2 = g2.longValue();
                }
                user.roomId = j2;
                ILiveOuterService s = LiveOuterService.s();
                h.f.b.l.b(s, "");
                com.ss.android.ugc.aweme.live.feedpage.c b2 = s.b();
                x.f66896b.getClass();
                b2.a(user, new a(user), "");
            }
            b.h.a(uri.getQueryParameter("user_id"), uri, true);
            HashMap hashMap = new HashMap();
            hashMap.put("from_notification", String.valueOf(z));
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            if (!s2.d().a(activity, uri, hashMap)) {
                return new Intent(activity, MainActivity.class);
            }
            c.a.a("live", uri);
            return null;
        }

        private static Intent b(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            long j2;
            Intent intent;
            T t;
            int i2;
            String str4;
            String str5;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter = uri.getQueryParameter("userId");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            if (TextUtils.isEmpty(queryParameter) && (queryParameter = uri.getQueryParameter("user_id")) == null) {
                queryParameter = "";
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            h.f.b.l.b(queryParameter2, "");
            if (!TextUtils.isEmpty(queryParameter)) {
                queryParameter2 = h.m.p.c(queryParameter2, "@", "");
            }
            String queryParameter3 = uri.getQueryParameter("sec_uid");
            b.h.a(queryParameter, uri, true);
            String queryParameter4 = uri.getQueryParameter("liveId");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            h.f.b.l.b(queryParameter4, "");
            if (TextUtils.isEmpty(queryParameter4) && (queryParameter4 = uri.getQueryParameter("room_id")) == null) {
                queryParameter4 = "";
            }
            z.e eVar = new z.e();
            eVar.element = (T) uri.getQueryParameter("from");
            if (TextUtils.isEmpty(eVar.element)) {
                eVar.element = (T) uri.getQueryParameter("gd_label");
            }
            z.e eVar2 = new z.e();
            eVar2.element = (T) uri.getQueryParameter("enter_from_merge");
            z.e eVar3 = new z.e();
            eVar3.element = (T) uri.getQueryParameter("enter_method");
            String queryParameter5 = uri.getQueryParameter("backurl");
            String queryParameter6 = uri.getQueryParameter("tab_index");
            try {
                j2 = Long.parseLong(queryParameter4);
            } catch (NumberFormatException unused) {
                j2 = 0;
            }
            String queryParameter7 = uri.getQueryParameter("params_url");
            z.e eVar4 = new z.e();
            eVar4.element = "";
            if (!com.bytedance.common.utility.m.a(queryParameter7)) {
                Uri parse = Uri.parse(queryParameter7);
                if (parse != null) {
                    str5 = parse.getQueryParameter("user_id");
                } else {
                    str5 = null;
                }
                eVar4.element = (T) String.valueOf(str5);
            }
            String queryParameter8 = uri.getQueryParameter("slim_room");
            User user = new User();
            user.setUid(queryParameter);
            user.roomId = j2;
            if (!TextUtils.isEmpty(queryParameter8)) {
                ILiveOuterService s = LiveOuterService.s();
                h.f.b.l.b(s, "");
                queryParameter8 = s.j().a(queryParameter8);
                user.roomData = queryParameter8;
            }
            HashMap hashMap = new HashMap();
            String uri2 = uri.toString();
            h.f.b.l.b(uri2, "");
            hashMap.put("schema_uri", uri2);
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            s2.m().a("ttlive_push_event_schema", 0, hashMap);
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = b();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                return new Intent(activity, MainActivity.class);
            }
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34768c = true;
            if (TextUtils.isEmpty(queryParameter2) || user.roomId > 0 || z) {
                intent = null;
                T t2 = "push";
                if (!TextUtils.isEmpty(queryParameter)) {
                    ab abVar = new ab(activity);
                    abVar.f66531d = eVar.element;
                    abVar.f66530c = str3;
                    abVar.f66532e = j2;
                    abVar.f66534g = null;
                    T t3 = eVar.element;
                    abVar.f66529b = queryParameter6;
                    abVar.f66528a = z;
                    abVar.f66535h = eVar2.element;
                    abVar.f66536i = eVar3.element;
                    abVar.f66537j = t3;
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    try {
                        if (!com.bytedance.common.utility.m.a(queryParameter6)) {
                            enterRoomConfig.f23299c.t = Integer.valueOf(queryParameter6).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                    if (TextUtils.isEmpty(abVar.f66535h)) {
                        str4 = t2;
                    } else {
                        str4 = abVar.f66535h;
                    }
                    roomsData.J = str4;
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                    if (!TextUtils.isEmpty(abVar.f66536i)) {
                        t2 = abVar.f66536i;
                    }
                    roomsData2.L = t2;
                    enterRoomConfig.f23298b.r = t3;
                    enterRoomConfig.f23299c.D = queryParameter;
                    enterRoomConfig.f23299c.f23325d = queryParameter3;
                    enterRoomConfig.f23299c.R = abVar.f66532e;
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        enterRoomConfig.f23297a.f23349m = true;
                    }
                    LiveOuterService.s().i().a(abVar.f66533f, enterRoomConfig, queryParameter8);
                    if (z) {
                        com.ss.android.ugc.aweme.story.live.d.b(String.valueOf(abVar.f66532e), queryParameter);
                    }
                    if (abVar.f66528a) {
                        com.ss.android.ugc.aweme.story.live.d.a(queryParameter, abVar.f66532e, "unknow");
                    }
                    if (!TextUtils.equals(abVar.f66531d, "webview") && !TextUtils.isEmpty("jsbridge")) {
                        com.bytedance.ies.ugc.appcontext.d.a();
                        com.ss.android.ugc.aweme.story.live.d.a("", queryParameter, 0);
                    }
                    if (!TextUtils.isEmpty(abVar.f66530c)) {
                        com.ss.android.ugc.aweme.common.r.a("live_play", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", abVar.f66530c).a("anchor_id", queryParameter).f66730a);
                    }
                } else {
                    if (!TextUtils.equals(eVar.element, "webview") && !TextUtils.equals(eVar.element, "jsbridge")) {
                        com.ss.android.ugc.aweme.story.live.d.a(user.getRequestId(), user.getUid(), user.roomId);
                    }
                    if (z) {
                        com.ss.android.ugc.aweme.live.feedpage.c b2 = LiveOuterService.s().b();
                        x.f66896b.getClass();
                        b2.a(user, new c(user), "");
                    }
                    EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        enterRoomConfig2.f23297a.f23349m = true;
                    }
                    try {
                        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.f23299c;
                        if (queryParameter6 != null) {
                            i2 = Integer.parseInt(queryParameter6);
                        } else {
                            i2 = -1;
                        }
                        roomsData3.t = i2;
                    } catch (Throwable unused3) {
                    }
                    EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig2.f23299c;
                    if (!TextUtils.isEmpty(eVar2.element)) {
                        t = eVar2.element;
                    } else if (z) {
                        t = t2;
                    } else {
                        t = "webview";
                    }
                    roomsData4.J = t;
                    EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig2.f23299c;
                    if (!TextUtils.isEmpty(eVar3.element)) {
                        t2 = eVar3.element;
                    } else if (!z) {
                        t2 = "webview";
                    }
                    roomsData5.L = t2;
                    enterRoomConfig2.f23298b.r = eVar.element;
                    enterRoomConfig2.f23299c.T = queryParameter5;
                    enterRoomConfig2.f23298b.C = eVar4.element;
                    ILiveOuterService s3 = LiveOuterService.s();
                    h.f.b.l.b(s3, "");
                    s3.i().a(activity, user, enterRoomConfig2);
                }
            } else {
                ILiveOuterService s4 = LiveOuterService.s();
                h.f.b.l.b(s4, "");
                com.ss.android.ugc.aweme.story.live.b f2 = s4.f();
                h.f.b.l.b(f2, "");
                com.ss.android.ugc.aweme.live.deeplink.a c2 = f2.c();
                intent = null;
                c2.a(queryParameter2, new b(user, queryParameter6, eVar2, eVar3, eVar, queryParameter5, eVar4, activity));
            }
            c.a.a("live", uri);
            return intent;
        }
    }

    public static final class q extends aw {
        static {
            Covode.recordClassIndex(41227);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "live";
        }

        private static boolean b() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "live_square");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                return new Intent(activity, MainActivity.class);
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = b();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                return new Intent(activity, MainActivity.class);
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.O = true;
            ILiveOuterService s = LiveOuterService.s();
            h.f.b.l.b(s, "");
            s.i().b(activity, enterRoomConfig, "push");
            return null;
        }
    }

    public static final class u extends aw {
        static {
            Covode.recordClassIndex(41231);
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!com.ss.android.ugc.aweme.inbox.b.b.b()) {
                return false;
            }
            return h.f.b.l.a((Object) str, (Object) "notification");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            h.f.b.l.d(activity, "");
            Intent a2 = com.bytedance.ies.powerpage.d.f34436a.a(activity, MusNewNotificationFragment.class, null);
            if (a2 == null) {
                com.ss.android.ugc.aweme.common.f.c("NewInboxNotificationCommand", "get PowerPage Intent is null on Push!!");
                return;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                a(activity, ac.a.a(activity, a2, queryParameter));
                return;
            }
            c.a.a(uri.getQueryParameter("label"), uri);
            o a3 = o.a();
            h.f.b.l.b(a3, "");
            if (a3.f66861a.a()) {
                a(activity, a2);
                return;
            }
            activity.startActivities(new Intent[]{com.ss.android.ugc.aweme.utils.a.c.a(activity), a2});
        }
    }

    public static final class a extends aw {
        static {
            Covode.recordClassIndex(41208);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "account");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                return null;
            }
            if (h.f.b.l.a((Object) str2, (Object) "/2sv")) {
                return new Intent(activity, TwoStepVerificationManageActivity.class);
            }
            if (h.f.b.l.a((Object) str2, (Object) "/setting")) {
                return SmartRouter.buildRoute(activity, "//account/setting").buildIntent();
            }
            return null;
        }
    }

    public static final class b extends aw {
        static {
            Covode.recordClassIndex(41209);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return in.d();
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            c.a.a("homepage_hot", uri);
            return intent;
        }
    }

    public static final class e extends aw {
        static {
            Covode.recordClassIndex(41212);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "feed");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, MainActivity.class);
            String queryParameter = uri.getQueryParameter("tab");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    c.a.a("homepage_hot", uri);
                } else if (parseInt == 2) {
                    c.a.a("homepage_fresh", uri);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return InvitationReflowHelper.a.a(uri, intent);
        }
    }

    public static final class g extends aw {
        static {
            Covode.recordClassIndex(41214);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) "game", (Object) str);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            o a2 = o.a();
            h.f.b.l.b(a2, "");
            if (a2.f66861a.a()) {
                a.C2810a aVar = new a.C2810a();
                aVar.f109680b = "schema";
                com.ss.android.ugc.aweme.miniapp_api.model.b.a a3 = aVar.a();
                IMiniAppService a4 = c.a.f109704a.a();
                uri.getQueryParameter("game_id");
                a4.openMiniApp(activity, "", a3);
                return;
            }
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(activity);
            String queryParameter = uri.getQueryParameter("game_id");
            mainActivityIntent.putExtra("jumpToGame", true);
            mainActivityIntent.putExtra("gameId", queryParameter);
            com.ss.android.ugc.tiktok.security.a.a.a(mainActivityIntent, activity);
            activity.startActivity(mainActivityIntent);
        }
    }

    public static final class h extends aw {

        /* renamed from: a  reason: collision with root package name */
        public final String f66897a = "click_push_follow_request";

        /* renamed from: b  reason: collision with root package name */
        public final String f66898b = "click_push_follow_approve";

        /* renamed from: c  reason: collision with root package name */
        public final String f66899c = "click_push_follow";

        /* renamed from: d  reason: collision with root package name */
        public final String f66900d = "click_push_digg";

        /* renamed from: e  reason: collision with root package name */
        public final String f66901e = "click_push_digg_comment";

        /* renamed from: f  reason: collision with root package name */
        public final String f66902f = "click_push_forward_digg";

        /* renamed from: g  reason: collision with root package name */
        public final String f66903g = "click_push_comment";

        /* renamed from: h  reason: collision with root package name */
        public final String f66904h = "click_push_replycomment";

        /* renamed from: i  reason: collision with root package name */
        public final String f66905i = "click_push_forward";

        /* renamed from: j  reason: collision with root package name */
        public final String f66906j = "click_push_forward_and_forward";

        /* renamed from: k  reason: collision with root package name */
        public final String f66907k = "click_push_forward_comment";

        /* renamed from: l  reason: collision with root package name */
        public final String f66908l = "click_push_forwardreplycomment";

        /* renamed from: m  reason: collision with root package name */
        public final String f66909m = "click_push_videoat";
        public final String n = "click_push_commentat";
        public final String o = "click_push_forward_at";

        static {
            Covode.recordClassIndex(41215);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "notification");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            if (!h.f.b.l.a((Object) "notification", (Object) str)) {
                return null;
            }
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            String queryParameter2 = uri.getQueryParameter("label");
            c.a.a(queryParameter2, uri);
            if (TextUtils.equals(queryParameter2, "check_profile")) {
                intent.putExtra("push", true);
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                return ac.a.a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    public static final class i extends aw {
        static {
            Covode.recordClassIndex(41216);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "helper_center");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return SmartRouter.buildRoute(activity, "//helper_center").withParam("URL_FIELD", "https://support.tiktok.com").withParam("FIELD_TITLE", activity.getString(R.string.bwa)).withParam("FIELD_SHOW_AGREE_BUTTON", false).buildIntent();
        }
    }

    public static final class m extends aw {
        static {
            Covode.recordClassIndex(41220);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "chat");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            super.a(activity, uri, z);
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                Intent a2 = ac.a.a(activity, null, queryParameter);
                com.ss.android.ugc.tiktok.security.a.a.a(a2, activity);
                activity.startActivity(a2);
                return;
            }
            SmartRouter.buildRoute(activity, uri.toString()).withParam("enter_from", "outer_push").open();
        }
    }

    public static final class n extends aw {
        static {
            Covode.recordClassIndex(41221);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "learn");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, MainActivity.class);
            intent.addFlags(536870912);
            intent.addFlags(32768);
            intent.putExtra("page_type", 16000);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return intent;
        }
    }

    public static final class o extends aw {
        static {
            Covode.recordClassIndex(41222);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "link_account");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", true);
            c.a.a("message", uri);
            return intent;
        }
    }

    public static final class r extends aw {
        static {
            Covode.recordClassIndex(41228);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "livewallpaper");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, LocalLiveWallPaperActivity.class);
            intent.putExtra("from", uri.getQueryParameter("from"));
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                Iterator it = h.m.p.c(encodedQuery, new String[]{"&"}).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List c2 = h.m.p.c((String) it.next(), new String[]{"="});
                    if (c2.size() == 2 && h.f.b.l.a(c2.get(0), (Object) "is_first_install_launch")) {
                        intent.putExtra("is_first_install_launch", h.f.b.l.a(c2.get(1), (Object) "true"));
                        break;
                    }
                }
            }
            return intent;
        }
    }

    public static final class t extends aw {
        static {
            Covode.recordClassIndex(41230);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "growth_activity_dialog");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return new Intent(activity, MainActivity.class);
        }
    }

    public static final class v extends aw {
        static {
            Covode.recordClassIndex(41232);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "private");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent();
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("label", uri.getQueryParameter("label"));
            intent.putExtra("uid", uri.getLastPathSegment());
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                return ac.a.a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$x  reason: collision with other inner class name */
    public static final class C1506x extends aw {
        static {
            Covode.recordClassIndex(41234);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "prop_detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "stickers");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            boolean z2;
            Collection collection;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (TextUtils.isEmpty(str2) || !h.m.p.b(str2, "/detail/", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            ArrayList arrayList = null;
            if (!z2) {
                return null;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment)) {
                if (lastPathSegment == null) {
                    h.f.b.l.b();
                }
                List<String> split = new h.m.l(",").split(lastPathSegment, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                collection = h.a.n.d((Iterable) split, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    Object[] array = collection.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr = (String[]) array;
                    arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
                }
                collection = h.a.z.INSTANCE;
                Object[] array2 = collection.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)));
            }
            Intent buildIntent = SmartRouter.buildRoute(activity, "//stickers/detail").withParam("extra_stickers", arrayList).buildIntent();
            c.a.a("prop_detail", uri);
            return buildIntent;
        }
    }

    public static final class y extends aw {
        static {
            Covode.recordClassIndex(41235);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "challenge_detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "tag");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            CommerceChallengeServiceImpl.e().a(uri, uri.getQueryParameter("id"));
            SmartRoute withParam = SmartRouter.buildRoute(activity, "//challenge/detail").withParam("id", uri.getQueryParameter("id")).withParam("enter_from", uri.getQueryParameter("enter_from"));
            c.a.a("challenge_detail", uri);
            return withParam.buildIntent();
        }
    }

    public static final class f extends aw {
        static {
            Covode.recordClassIndex(41213);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) (str + str2), (Object) "friend/find");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin() || !TextUtils.equals(uri.getQueryParameter("platform"), "facebook") || in.d() || !com.bytedance.ies.abmock.b.a().a(true, "ftc_bind_enable", false) || com.ss.android.ugc.aweme.account.b.e().isPlatformBound("facebook")) {
                return null;
            }
            Intent intent = new Intent(activity, InviteUserListActivity.class);
            intent.putExtra(StringSet.type, 3);
            intent.putExtra("enter_from", "guide_to_invite_third_friends");
            return intent;
        }
    }

    public static final class s extends aw {
        static {
            Covode.recordClassIndex(41229);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) "microapp", (Object) str) || h.f.b.l.a((Object) "microgame", (Object) str)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            String str;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String queryParameter = uri.getQueryParameter("schema_from");
            if (TextUtils.equals(queryParameter, "splash")) {
                str = "025001";
            } else if (TextUtils.equals(queryParameter, "qr_code")) {
                str = "021002";
            } else if (TextUtils.equals(queryParameter, "ad_link")) {
                str = "025003";
            } else {
                str = "";
            }
            String queryParameter2 = uri.getQueryParameter("position");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            h.f.b.l.b(queryParameter2, "");
            a.C2810a aVar = new a.C2810a();
            aVar.f109680b = "schema";
            aVar.f109681c = str;
            aVar.f109679a = queryParameter2;
            aVar.f109682d = "open_url";
            c.a.f109704a.a().openMiniApp(activity, uri.toString(), aVar.a());
        }
    }

    public static final class d extends aw {
        static {
            Covode.recordClassIndex(41211);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "aweme/create", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
            boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
            String queryParameter = uri.getQueryParameter("aweme_id");
            Intent intent = new Intent(activity, PushCameraBlurActivity.class);
            intent.putExtra("show_dialog", booleanQueryParameter2);
            intent.putExtra("show_effect", booleanQueryParameter);
            intent.putExtra("show_duet", booleanQueryParameter3);
            intent.putExtra("aid", queryParameter);
            return intent;
        }
    }

    public static final class w extends aw {
        static {
            Covode.recordClassIndex(41233);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "user/referral", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return new Intent(activity, MainActivity.class);
        }
    }

    public static final class z extends aw {
        static {
            Covode.recordClassIndex(41236);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "user/profile/", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter = uri.getQueryParameter("gd_label");
            String queryParameter2 = uri.getQueryParameter("multi_account_push_uid");
            String lastPathSegment = uri.getLastPathSegment();
            String a2 = b.h.a(lastPathSegment, uri, true);
            if (TextUtils.equals(queryParameter, "click_push_fr")) {
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "push").a("enter_method", "click_push").a("to_user_id", lastPathSegment).f66730a);
            }
            if (TextUtils.equals(queryParameter, "user_recommend")) {
                com.ss.android.ugc.aweme.common.r.a("follow_card", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "follow_card_push").a("event_type", "enter_profile").a("rec_uid", lastPathSegment).f66730a);
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "follow_card_push").a("to_user_id", lastPathSegment).f66730a);
            }
            if (TextUtils.equals(queryParameter, "click_push_user")) {
                com.ss.android.ugc.aweme.common.r.a("follow_recommend", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "push_out_app").a("scene_type", "push").a("action_type", "enter_profile").a("to_user_id", uri.getQueryParameter("to_user_id")).a("rule_id", uri.getQueryParameter("rule_id")).a("rec_type", uri.getQueryParameter("rec_type")).a("follow_type", uri.getQueryParameter("follow_type")).a("relation_type", uri.getQueryParameter("relation_type")).f66730a);
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (TextUtils.equals(lastPathSegment, g2.getCurUserId())) {
                c.a.a("personal_homepage", uri);
            } else {
                c.a.a("others_homepage", uri);
            }
            Intent intent = new Intent(activity, UserProfileActivity.class);
            String queryParameter3 = uri.getQueryParameter("from");
            intent.putExtra("uid", lastPathSegment);
            intent.putExtra("sec_user_id", a2);
            intent.putExtra(StringSet.type, uri.getQueryParameter(StringSet.type));
            intent.putExtra("source_aid", uri.getQueryParameter("source_aid"));
            intent.putExtra("from_micro_app", queryParameter3);
            if (TextUtils.equals(queryParameter, "click_push_user")) {
                intent.putExtra("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g(uri.getQueryParameter("enter_from"), "", u.c.PUSH, uri.getQueryParameter("rec_type"), u.b.SINGLE, uri.getQueryParameter("to_user_id"), uri.getQueryParameter("group_id"), uri.getQueryParameter("author_id"), uri.getQueryParameter("req_id"), uri.getQueryParameter("homepage_user_id"), uri.getQueryParameter("relation_type"), uri.getQueryParameter("social_info")));
            }
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            if (g3.isLogin() || !h.f.b.l.a((Object) "click_push_follow_approve", (Object) queryParameter)) {
                return intent;
            }
            return ac.a.a(activity, intent, queryParameter2);
        }
    }

    public static final class j extends b.j {
        static {
            Covode.recordClassIndex(41217);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Uri uri, Intent intent, boolean z) {
            al.a(uri, intent, z);
        }
    }

    public static final class k extends b.k {
        static {
            Covode.recordClassIndex(41218);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Uri uri, Intent intent, boolean z) {
            al.a(uri, intent, z);
        }
    }

    public static final class l extends b.v {
        static {
            Covode.recordClassIndex(41219);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Uri uri, Intent intent, boolean z) {
            al.a(uri, intent, z);
        }
    }
}
