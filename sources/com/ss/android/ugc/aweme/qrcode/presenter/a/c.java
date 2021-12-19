package com.ss.android.ugc.aweme.qrcode.presenter.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.CQrcodeService;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.miniapp_api.model.a.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.c.e;
import com.ss.android.ugc.aweme.qrcode.c.h;
import com.ss.android.ugc.aweme.qrcode.c.k;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.qrcode.presenter.a.b;
import com.ss.android.ugc.aweme.qrcode.presenter.a.m;
import com.ss.android.ugc.aweme.qrcode.presenter.d;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.utils.gw;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class c implements b.a, com.ss.android.ugc.aweme.qrcode.presenter.b {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.ies.foundation.activity.a f119761a;

    /* renamed from: b  reason: collision with root package name */
    public d f119762b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f119763c;

    /* renamed from: d  reason: collision with root package name */
    public String f119764d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f119765e;

    /* renamed from: f  reason: collision with root package name */
    b f119766f;

    /* renamed from: g  reason: collision with root package name */
    public h f119767g = new h();

    /* renamed from: h  reason: collision with root package name */
    boolean f119768h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f119769i;

    /* renamed from: j  reason: collision with root package name */
    boolean f119770j;

    /* renamed from: k  reason: collision with root package name */
    QrCodeScanService f119771k = QrCodeScanImpl.b();

    /* renamed from: l  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.qrcode.c.d> f119772l;

    /* renamed from: m  reason: collision with root package name */
    List<com.ss.android.ugc.aweme.qrcode.c.d> f119773m;
    private l n = new l();

    static {
        Covode.recordClassIndex(77819);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.c
    public final void a(final boolean z, final int i2, final String str, final int i3) {
        com.ss.android.a.e.a a2;
        if (!this.f119761a.isDestroyed()) {
            IEtDebugService iEtDebugService = (IEtDebugService) ServiceManager.get().getService(IEtDebugService.class);
            if (i3 == 2) {
                iEtDebugService.a(str, this.f119761a);
            } else if (!com.ss.android.ugc.aweme.local_test.a.a() || (a2 = com.ss.android.a.b.a.a()) == null || !a2.a()) {
                if (CQrcodeService.b().a()) {
                    String a3 = com.ss.android.ugc.aweme.qrcode.e.c.a(str) ? com.ss.android.ugc.aweme.qrcode.e.b.a(str) : str;
                    if (!TextUtils.isEmpty(a3) && a3.contains("tt_deeplink:")) {
                        if (CommerceServiceImpl.a().a((Context) this.f119761a, a3.replace("tt_deeplink:", ""), false)) {
                            r.onEventV3("deeplink_preview_success");
                            return;
                        }
                        r.onEventV3("deeplink_preview_error_toast_show");
                        CQrcodeService.b().a(this.f119761a);
                        this.f119761a.finish();
                        return;
                    }
                }
                this.f119763c = z;
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = c();
                }
                if (!j.f107226e) {
                    new com.bytedance.tux.g.b(this.f119761a).e(R.string.de8).b();
                    return;
                }
                a.C2809a aVar = new a.C2809a();
                aVar.f109667a = "qrCode";
                aVar.f109669c = str;
                com.ss.android.ugc.aweme.miniapp_api.model.a.a a4 = aVar.a();
                com.ss.android.ugc.aweme.miniapp_api.model.a.b bVar = new com.ss.android.ugc.aweme.miniapp_api.model.a.b();
                bVar.f109671a = a4;
                com.ss.android.ugc.d.a.c.a(bVar);
                i.b(new Callable<String>() {
                    /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(77823);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ String call() {
                        c.this.f119762b.d();
                        return null;
                    }
                }, i.f4826c).a(new g<String, a>() {
                    /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(77822);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    @Override // b.g
                    public final /* synthetic */ a then(i<String> iVar) {
                        String str = str;
                        if (com.ss.android.ugc.aweme.qrcode.e.c.a(str)) {
                            str = com.ss.android.ugc.aweme.qrcode.e.b.a(str);
                        }
                        return new a(str);
                    }
                }, i.f4824a, null).a(new g<a, String>() {
                    /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(77821);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
                    @Override // b.g
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.String then(b.i<com.ss.android.ugc.aweme.qrcode.presenter.a.c.a> r10) {
                        /*
                        // Method dump skipped, instructions count: 396
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass2.then(b.i):java.lang.Object");
                    }
                }, i.f4826c, null);
                Vibrator vibrator = (Vibrator) a(this.f119761a, "vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200);
                }
            } else {
                this.f119761a.finish();
            }
        }
    }

    public final boolean a(Context context, int i2, final String str, String str2, String str3, Map<String, Object> map) {
        String str4;
        Uri parse;
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            str4 = "";
        } else {
            str4 = parse.getQueryParameter("sec_uid");
            if (!TextUtils.isEmpty(str4)) {
                gw.a().a(str, str4);
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 8) {
                                this.f119771k.b(context, str, str3);
                                return true;
                            } else if (i2 == 9) {
                                IExternalService a2 = AVExternalServiceImpl.a();
                                if (!a2.publishService().checkIsAlreadyPublished(this.f119761a)) {
                                    new com.bytedance.tux.g.b(this.f119761a).e(R.string.fal).b();
                                    this.f119762b.a();
                                    return true;
                                }
                                final String b2 = v.b(str2, "grade_key");
                                if (!a2.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                    a(str, b2);
                                } else {
                                    this.f119765e = true;
                                    com.ss.android.ugc.aweme.login.c.a(this.f119761a, "scan", "click_my_qr", (Bundle) null, new f() {
                                        /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass5 */

                                        static {
                                            Covode.recordClassIndex(77824);
                                        }

                                        @Override // com.ss.android.ugc.aweme.base.component.f
                                        public final void a() {
                                            c.this.a(str, b2);
                                        }

                                        @Override // com.ss.android.ugc.aweme.base.component.f
                                        public final void b() {
                                            c.this.f119762b.e();
                                            c.this.f119762b.f();
                                        }
                                    });
                                }
                                return true;
                            } else if (i2 != 16) {
                                if (i2 == 17) {
                                    this.f119771k.a(context, ap.a(str));
                                    if (!TextUtils.isEmpty(str)) {
                                        r.a("enter_prop_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "scan").a("prop_id", str).f66730a);
                                    }
                                    return true;
                                } else if (i2 == 23) {
                                    CommerceChallengeServiceImpl.e().a(str);
                                } else if (i2 != 51) {
                                    switch (i2) {
                                        case 29:
                                            break;
                                        case 30:
                                            IExternalService a3 = AVExternalServiceImpl.a();
                                            if (!a3.publishService().checkIsAlreadyPublished(this.f119761a)) {
                                                new com.ss.android.ugc.aweme.tux.a.i.a(this.f119761a).a(R.string.fal).a();
                                                this.f119762b.a();
                                                return true;
                                            }
                                            if (!a3.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                                a(str);
                                            } else {
                                                this.f119765e = true;
                                                com.ss.android.ugc.aweme.login.c.a(this.f119761a, "scan", "click_my_qr", (Bundle) null, new f() {
                                                    /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass6 */

                                                    static {
                                                        Covode.recordClassIndex(77825);
                                                    }

                                                    @Override // com.ss.android.ugc.aweme.base.component.f
                                                    public final void a() {
                                                        c.this.a(str);
                                                    }

                                                    @Override // com.ss.android.ugc.aweme.base.component.f
                                                    public final void b() {
                                                        c.this.f119762b.e();
                                                        c.this.f119762b.f();
                                                    }
                                                });
                                            }
                                            return true;
                                        case 31:
                                            break;
                                        case 32:
                                            SmartRouter.buildRoute(context, "//ads/preview").withParam("url", str2).open();
                                            return true;
                                        case 33:
                                            com.bytedance.ies.foundation.activity.a aVar = this.f119761a;
                                            d dVar = this.f119762b;
                                            e eVar = new e(this);
                                            l.d(aVar, "");
                                            l.d(str2, "");
                                            l.d(dVar, "");
                                            l.d(eVar, "");
                                            AVExternalServiceImpl.a().ttepAbilityService().downloadEffectAndJumpShootPage(aVar, new m.a(aVar), str2, new m.b(dVar), eVar);
                                            return true;
                                        default:
                                            return false;
                                    }
                                } else {
                                    SmartRouter.buildRoute(context, "//qna/detail").withParam("id", str).withParam("enter_from", str3).open();
                                    return true;
                                }
                            }
                        }
                        String str5 = null;
                        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f119761a).a(R.string.h89).a();
                            return true;
                        }
                        com.bytedance.ies.foundation.activity.a aVar2 = this.f119761a;
                        if (aVar2 != null && !aVar2.isDestroyed() && !TextUtils.isEmpty(str)) {
                            User user = new User();
                            if (!TextUtils.isEmpty(str2)) {
                                String queryParameter = Uri.parse(str2).getQueryParameter("u_code");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    try {
                                        str5 = String.valueOf(Long.parseLong(queryParameter, 23));
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (map != null && (map.get("anchor_sec_uid") instanceof String)) {
                                user.setSecUid((String) map.get("anchor_sec_uid"));
                            }
                            if (i2 == 31) {
                                user.setUid(str);
                            } else {
                                try {
                                    user.roomId = Long.parseLong(str);
                                } catch (Exception unused2) {
                                }
                            }
                            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                            enterRoomConfig.f23299c.J = str3;
                            enterRoomConfig.f23298b.C = str5;
                            LiveOuterService.s().i().a(this.f119761a, user, enterRoomConfig);
                        }
                        return true;
                    }
                    a("enter_personal_detail", this.f119763c, "user_id", str);
                    if (context != null) {
                        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", str4).withParam("enter_from", str3).open();
                    }
                    return true;
                }
                a("enter_music_detail", this.f119763c, "music_id", str);
                this.f119771k.b(context, str, str3);
                return true;
            }
            a("enter_tag_detail", this.f119763c, "tag_id", str);
            this.f119771k.c(context, str, str3);
            return true;
        }
        this.f119771k.a(context, str, str3);
        a("video_play", this.f119763c, "group_id", str);
        return true;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.c
    public final void b() {
        b bVar = this.f119766f;
        if (bVar != null) {
            if (bVar.f119759b != null) {
                bVar.f119759b.b();
            }
            bVar.f119758a = null;
        }
        this.f119762b = null;
        this.f119761a = null;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.c
    public final void a() {
        this.f119772l = new ArrayList();
        AnonymousClass1 r3 = new a.AbstractC3089a() {
            /* class com.ss.android.ugc.aweme.qrcode.presenter.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77820);
            }

            @Override // com.ss.android.ugc.aweme.qrcode.c.a.AbstractC3089a
            public final boolean a(int i2, String str, String str2, Map<String, Object> map) {
                c cVar = c.this;
                return cVar.a(cVar.f119761a, i2, str, str2, "scan", map);
            }
        };
        this.f119772l.add(com.ss.android.ugc.aweme.qrcode.c.b.f119723b);
        this.f119772l.add(new com.ss.android.ugc.aweme.qrcode.c.c(r3));
        this.f119772l.add(new com.ss.android.ugc.aweme.qrcode.c.g(r3));
        this.f119772l.add(new h(r3, this.f119761a));
        this.f119772l.add(new com.ss.android.ugc.aweme.qrcode.c.i(r3));
        ArrayList arrayList = new ArrayList();
        this.f119773m = arrayList;
        arrayList.add(com.ss.android.ugc.aweme.qrcode.c.b.f119723b);
        this.f119773m.add(new com.ss.android.ugc.aweme.qrcode.c.j());
        this.f119773m.add(new com.ss.android.ugc.aweme.qrcode.c.f());
        this.f119773m.add(new e(r3));
        this.f119773m.add(new k(this.f119761a));
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f119789a;

        static {
            Covode.recordClassIndex(77826);
        }

        a(String str) {
            this.f119789a = str;
        }
    }

    public final void a(String str) {
        com.bytedance.ies.foundation.activity.a aVar = this.f119761a;
        if (aVar != null && !aVar.isDestroyed() && !TextUtils.isEmpty(str)) {
            this.f119769i = true;
            this.f119771k.a(str, this.f119761a, new g(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.presenter.c
    public final void a(boolean z) {
        com.bytedance.ies.foundation.activity.a aVar = this.f119761a;
        if (aVar != null && !aVar.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new d(this, z));
            if (z) {
                this.f119762b.a();
            }
        }
    }

    public c(com.bytedance.ies.foundation.activity.a aVar, d dVar) {
        this.f119761a = aVar;
        this.f119762b = dVar;
    }

    private static Object a(com.bytedance.ies.foundation.activity.a aVar, String str) {
        Object obj;
        MethodCollector.i(1485);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = aVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = aVar.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = aVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(1485);
                }
            }
        } else {
            obj = aVar.getSystemService(str);
        }
        return obj;
    }

    public final void a(String str, String str2) {
        com.bytedance.ies.foundation.activity.a aVar = this.f119761a;
        if (aVar != null && !aVar.isDestroyed()) {
            this.f119769i = true;
            try {
                this.f119771k.a(str, str2, this.f119761a, AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), new f(this));
            } catch (Exception unused) {
            }
        }
    }

    private static void a(String str, boolean z, String str2, String str3) {
        String str4;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "scan");
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        r.a(str, a2.a("enter_method", str4).a(str2, str3).f66730a);
    }
}
