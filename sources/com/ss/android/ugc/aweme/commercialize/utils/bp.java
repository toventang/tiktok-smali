package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.response.Extra;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class bp {

    /* renamed from: a  reason: collision with root package name */
    static boolean f75685a;

    /* renamed from: b  reason: collision with root package name */
    public static final bp f75686b = new bp();

    private bp() {
    }

    static {
        Covode.recordClassIndex(46684);
    }

    public static final class a implements d<com.ss.android.ugc.aweme.live.response.a<Room, Extra>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f75687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAdSceneService f75688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f75689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f75690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f75691e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ bo f75692f;

        static {
            Covode.recordClassIndex(46685);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp$a$a  reason: collision with other inner class name */
        static final class C1725a extends k implements m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(46686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1725a(a aVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new C1725a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((C1725a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    Context context = this.this$0.f75687a;
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    new com.bytedance.tux.g.b(activity).a().e(R.string.de2).b();
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        static final class b extends k implements m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(46687);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new b(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    Context context = this.this$0.f75687a;
                    while (true) {
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                Activity activity = (Activity) context;
                                if (activity != null) {
                                    new com.bytedance.tux.g.b(activity).e(R.string.h3n).b();
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.live.response.a<Room, Extra>> bVar, Throwable th) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
            bp.f75685a = false;
            bz unused = i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new C1725a(this, null), 3);
            IAdSceneService iAdSceneService = this.f75688b;
            if (!(iAdSceneService == null || (c2 = iAdSceneService.c()) == null)) {
                c2.a(this.f75689c, this.f75687a, this.f75690d);
            }
            j.n(this.f75687a, this.f75689c);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "live_show_failed", this.f75689c.getAwemeRawAd()).c();
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.live.response.a<Room, Extra>> bVar, u<com.ss.android.ugc.aweme.live.response.a<Room, Extra>> uVar) {
            String webUrl;
            T t;
            T t2;
            T t3;
            T t4;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
            T t5;
            AwemeSplashInfo splashInfo;
            bp.f75685a = false;
            AwemeRawAd awemeRawAd = this.f75689c.getAwemeRawAd();
            if (!(awemeRawAd == null || (splashInfo = awemeRawAd.getSplashInfo()) == null)) {
                splashInfo.hasUpdateLiving = true;
            }
            Long l2 = null;
            if (uVar == null || !uVar.f42629a.a() || (t = uVar.f42630b) == null || (t2 = t.f108530b) == null || t2.getId() <= 0 || (t3 = uVar.f42630b) == null || (t4 = t3.f108530b) == null || t4.getStatus() != 2) {
                User author = this.f75689c.getAuthor();
                if (author != null) {
                    author.roomId = 0;
                }
                if (this.f75690d != 42) {
                    bz unused = i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new b(this, null), 3);
                }
                this.f75692f.a();
                j.n(this.f75687a, this.f75689c);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "live_show_failed", this.f75689c.getAwemeRawAd()).c();
                c.a(new g(this.f75689c.getAid(), this.f75690d));
                int i2 = this.f75690d;
                if (i2 == 2 || i2 == 1) {
                    AwemeRawAd awemeRawAd2 = this.f75689c.getAwemeRawAd();
                    if (awemeRawAd2 == null || (webUrl = awemeRawAd2.getWebUrl()) == null || webUrl.length() == 0) {
                        c.a(new com.ss.android.ugc.aweme.ad.feed.button.c(this.f75689c.getAid()));
                        return;
                    }
                    return;
                }
                return;
            }
            EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a((Room) uVar.f42630b.f108530b, false);
            l.b(a2, "");
            User author2 = this.f75689c.getAuthor();
            if (author2 != null) {
                T t6 = uVar.f42630b;
                if (!(t6 == null || (t5 = t6.f108530b) == null)) {
                    l2 = Long.valueOf(t5.getId());
                }
                author2.roomId = l2.longValue();
            }
            com.ss.android.ugc.aweme.commercialize.live.service.a.a(this.f75689c, a2, this.f75690d);
            a2.f23299c.J = "TopViewLive";
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.i().a(this.f75687a, this.f75691e, a2);
            IAdSceneService iAdSceneService = this.f75688b;
            if (iAdSceneService != null && (c2 = iAdSceneService.c()) != null) {
                c2.a(this.f75689c, this.f75687a, this.f75690d);
            }
        }

        a(Context context, IAdSceneService iAdSceneService, Aweme aweme, int i2, User user, bo boVar) {
            this.f75687a = context;
            this.f75688b = iAdSceneService;
            this.f75689c = aweme;
            this.f75690d = i2;
            this.f75691e = user;
            this.f75692f = boVar;
        }
    }

    public static final boolean a(Context context, Aweme aweme, int i2, bo boVar) {
        long parseLong;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
        l.d(context, "");
        l.d(aweme, "");
        l.d(boVar, "");
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (!b.w(aweme)) {
            return false;
        }
        if (f75685a) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        if (TextUtils.isEmpty(author.getUid())) {
            parseLong = 0;
        } else {
            String uid = author.getUid();
            l.b(uid, "");
            parseLong = Long.parseLong(uid);
        }
        if (b.y(aweme)) {
            f75685a = true;
            FeedLiveRoomApi.a(parseLong, author.getSecUid()).enqueue(new a(context, f2, aweme, i2, author, boVar));
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive()) {
            return false;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23298b.f23311c = aweme.getAid();
        EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
        User author3 = aweme.getAuthor();
        l.b(author3, "");
        logData.f23309a = author3.getRequestId();
        enterRoomConfig.f23299c.L = "TopViewLive";
        com.ss.android.ugc.aweme.commercialize.live.service.a.a(aweme, enterRoomConfig, i2);
        enterRoomConfig.f23299c.J = "TopViewLive";
        enterRoomConfig.f23298b.f23310b = author.getUid();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.i().a(context, aweme.getAuthor(), enterRoomConfig);
        if (!(f2 == null || (c2 = f2.c()) == null)) {
            c2.a(aweme, context, i2);
        }
        return true;
    }
}
