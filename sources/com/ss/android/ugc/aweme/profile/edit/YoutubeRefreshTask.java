package com.ss.android.ugc.aweme.profile.edit;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.settings.e;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.h;
import net.openid.appauth.o;
import net.openid.appauth.r;
import net.openid.appauth.s;

public final class YoutubeRefreshTask implements WeakHandler.IHandler, com.ss.android.ugc.aweme.global.config.settings.a, w {

    /* renamed from: b  reason: collision with root package name */
    static final boolean f116074b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final a f116075c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Context f116076a;

    /* renamed from: d  reason: collision with root package name */
    private Handler f116077d;

    /* renamed from: e  reason: collision with root package name */
    private int f116078e;

    /* renamed from: f  reason: collision with root package name */
    private final h f116079f = i.a((h.f.a.a) c.f116085a);

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f116085a = new c();

        static {
            Covode.recordClassIndex(74883);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1.apps.googleusercontent.com";
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return (String) this.f116079f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    static final class a {
        static {
            Covode.recordClassIndex(74880);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ YoutubeRefreshTask f116086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f116087b;

        static {
            Covode.recordClassIndex(74884);
        }

        d(YoutubeRefreshTask youtubeRefreshTask, User user) {
            this.f116086a = youtubeRefreshTask;
            this.f116087b = user;
        }

        public final void run() {
            YoutubeRefreshTask youtubeRefreshTask = this.f116086a;
            User user = this.f116087b;
            l.b(user, "");
            youtubeRefreshTask.a(user);
        }
    }

    static void d() {
        if (YoutubeApi.a()) {
            com.ss.android.ugc.aweme.account.b.g().queryUser();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(74879);
    }

    private static boolean e() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Integer thirdPartyDataRefresh = iESSettingsProxy.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh == null) {
                return false;
            }
            if (thirdPartyDataRefresh.intValue() == 1) {
                return true;
            }
            return false;
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    private final void l() {
        if (this.f116077d == null) {
            HandlerThread handlerThread = new HandlerThread("youtube-refresh-timer");
            handlerThread.start();
            this.f116077d = new WeakHandler(handlerThread.getLooper(), this);
        }
        Handler handler = this.f116077d;
        if (handler == null) {
            l.b();
        }
        if (handler.hasMessages(1)) {
            Handler handler2 = this.f116077d;
            if (handler2 == null) {
                l.b();
            }
            handler2.removeMessages(1);
        }
        Handler handler3 = this.f116077d;
        if (handler3 == null) {
            l.b();
        }
        handler3.sendEmptyMessage(1);
    }

    @Override // com.ss.android.ugc.aweme.global.config.settings.a
    public final void a(IESSettingsProxy iESSettingsProxy) {
        l.d(iESSettingsProxy, "");
        Handler handler = this.f116077d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Context context = this.f116076a;
        if (context == null) {
            l.a("context");
        }
        a(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            Handler handler = this.f116077d;
            if (handler != null) {
                handler.removeMessages(1);
            }
            int i2 = this.f116078e + 1;
            this.f116078e = i2;
            if (i2 > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                Handler handler2 = this.f116077d;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            Handler handler3 = this.f116077d;
            if (handler3 != null) {
                handler3.sendEmptyMessageDelayed(1, 1000);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        this.f116076a = context;
        com.ss.android.ugc.aweme.global.config.settings.d a2 = com.ss.android.ugc.aweme.global.config.settings.d.a();
        l.b(a2, "");
        if (!a2.b()) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            l();
        } else if (e()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            if (f116074b) {
                l.b(curUser, "");
                curUser.getYouTubeRefreshToken();
                curUser.getYoutubeRawRefreshToken();
                new Date(curUser.getYouTubeLastRefreshTime() * 1000);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            l.b(curUser, "");
            long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
            if (youTubeLastRefreshTime > 0 && currentTimeMillis - youTubeLastRefreshTime > TimeUnit.DAYS.toSeconds(30)) {
                if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                    ai.a(new d(this, curUser), "YoutubeRefreshTask");
                } else {
                    a(curUser);
                }
            }
        }
    }

    public final void a(User user) {
        String a2;
        String youtubeRawRefreshToken;
        String youTubeRefreshToken = user.getYouTubeRefreshToken();
        if ((youTubeRefreshToken != null && youTubeRefreshToken.length() != 0) || ((youtubeRawRefreshToken = user.getYoutubeRawRefreshToken()) != null && youtubeRawRefreshToken.length() != 0)) {
            if (!TextUtils.isEmpty(user.getYoutubeRawRefreshToken())) {
                a2 = user.getYoutubeRawRefreshToken();
            } else {
                String a3 = e.a();
                String youTubeRefreshToken2 = user.getYouTubeRefreshToken();
                l.b(youTubeRefreshToken2, "");
                a2 = com.ss.android.ugc.aweme.profile.f.m.a(youTubeRefreshToken2, a3, "AES/CBC/PKCS7Padding", a3);
            }
            if (TextUtils.isEmpty(a2)) {
                a(this, false, null, new Exception("Failed to decrypt refresh token, cannot continue"), null, null, 26);
                return;
            }
            r a4 = new r.a(new net.openid.appauth.i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), c()).a("refresh_token").b("https://www.googleapis.com/auth/youtube.readonly").d(a2).a();
            l.b(a4, "");
            Context context = this.f116076a;
            if (context == null) {
                l.a("context");
            }
            new net.openid.appauth.h(context).a(a4, o.f159714a, new b(this, a2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ YoutubeRefreshTask f116080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f116081b;

        static {
            Covode.recordClassIndex(74881);
        }

        b(YoutubeRefreshTask youtubeRefreshTask, String str) {
            this.f116080a = youtubeRefreshTask;
            this.f116081b = str;
        }

        @Override // net.openid.appauth.h.b
        public final void a(final s sVar, final net.openid.appauth.e eVar) {
            ai.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f116082a;

                static {
                    Covode.recordClassIndex(74882);
                }

                {
                    this.f116082a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0069  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 377
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.b.AnonymousClass1.run():void");
                }
            }, "YoutubeRefreshTask");
        }
    }

    private final void a(boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.a aVar) {
        Integer num2;
        Context context = this.f116076a;
        if (context == null) {
            l.a("context");
        }
        String a2 = YoutubeApi.a(context, exc, num, aVar);
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("platform", "youtube").a("is_success", Boolean.valueOf(z)).a("auto_unlink", l.a(bool, true) ? 1 : 0);
        if (aVar != null) {
            num2 = aVar.f116094a;
        } else {
            num2 = null;
        }
        com.ss.android.ugc.aweme.common.r.a("social_profile_check", a3.a("error_code", String.valueOf(num2)).a("error_desc", a2).f66730a);
    }

    static /* synthetic */ void a(YoutubeRefreshTask youtubeRefreshTask, boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.a aVar, int i2) {
        Boolean bool2 = bool;
        Exception exc2 = exc;
        Integer num2 = num;
        YoutubeApi.a aVar2 = null;
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            exc2 = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) == 0) {
            aVar2 = aVar;
        }
        youtubeRefreshTask.a(z, bool2, exc2, num2, aVar2);
    }
}
