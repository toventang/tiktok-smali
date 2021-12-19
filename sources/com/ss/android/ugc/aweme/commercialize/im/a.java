package com.ss.android.ugc.aweme.commercialize.im;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.route.BaseRoute;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.ck.j;
import com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.im.service.model.e;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class a extends BaseRoute implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74476a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45935);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a  reason: collision with other inner class name */
    public static final class C1680a {

        /* renamed from: a  reason: collision with root package name */
        public final IIMService f74477a = IMService.createIIMServicebyMonsterPlugin(false);

        /* renamed from: b  reason: collision with root package name */
        public IMUser f74478b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f74479c;

        /* renamed from: d  reason: collision with root package name */
        public final String f74480d;

        /* renamed from: e  reason: collision with root package name */
        public final String f74481e;

        /* renamed from: f  reason: collision with root package name */
        public final e f74482f;

        static {
            Covode.recordClassIndex(45936);
        }

        private final void b() {
            com.ss.android.ugc.aweme.profile.api.e.a();
            com.ss.android.ugc.aweme.profile.api.e.a(new HandlerC1681a(this, Looper.getMainLooper()), this.f74480d);
        }

        public final void a() {
            String str;
            if (this.f74477a != null && (str = this.f74480d) != null && str.length() != 0) {
                b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$a  reason: collision with other inner class name */
        public static final class HandlerC1681a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1680a f74483a;

            static {
                Covode.recordClassIndex(45937);
            }

            public final void handleMessage(Message message) {
                l.d(message, "");
                Object obj = message.obj;
                if (obj != null && (obj instanceof User)) {
                    this.f74483a.a(IMUser.fromUser((User) obj));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            HandlerC1681a(C1680a aVar, Looper looper) {
                super(looper);
                this.f74483a = aVar;
            }
        }

        public final synchronized void a(IMUser iMUser) {
            MethodCollector.i(4011);
            this.f74478b = iMUser;
            if (iMUser != null) {
                g gVar = new g();
                gVar.ext = this.f74481e;
                IIMService iIMService = this.f74477a;
                if (iIMService != null) {
                    iIMService.startChat(a.b.a(this.f74479c, this.f74478b).a(this.f74482f).a(gVar).f103883a);
                    MethodCollector.o(4011);
                    return;
                }
            }
            MethodCollector.o(4011);
        }

        public C1680a(Context context, String str, String str2, e eVar) {
            l.d(context, "");
            this.f74479c = context;
            this.f74480d = str;
            this.f74481e = str2;
            this.f74482f = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        return a((Activity) null, str);
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        a((Activity) context, getUrl());
    }

    public static final String b(String str) {
        if (!a(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("uid");
    }

    public static final boolean a(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str3 = null;
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (p.a("chatting", str2, true)) {
            if (parse != null) {
                str3 = parse.getPath();
            }
            if (p.a("/message", str3, true)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, Uri uri) {
        String str;
        String str2;
        l.d(context, "");
        l.d(uri, "");
        e eVar = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (p.a("chatting", str, true)) {
            if (uri != null) {
                str2 = uri.getPath();
            } else {
                str2 = null;
            }
            if (p.a("/message", str2, true)) {
                String queryParameter = uri.getQueryParameter("uid");
                String queryParameter2 = uri.getQueryParameter("ext");
                String queryParameter3 = uri.getQueryParameter("cid");
                String queryParameter4 = uri.getQueryParameter("log_extra");
                if (!(queryParameter3 == null || queryParameter3.length() == 0)) {
                    eVar = new e(queryParameter4, queryParameter3);
                }
                a(context, queryParameter, queryParameter2, eVar);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.ck.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.app.Activity r3, java.lang.String r4) {
        /*
            r2 = this;
            r1 = 0
            if (r4 == 0) goto L_0x0009
            int r0 = r4.length()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r1
        L_0x000a:
            android.net.Uri r1 = android.net.Uri.parse(r4)
            if (r3 == 0) goto L_0x001a
        L_0x0010:
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            boolean r0 = a(r3, r1)
            return r0
        L_0x001a:
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.d.a()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.im.a.a(android.app.Activity, java.lang.String):boolean");
    }

    public static final void a(Context context, String str, String str2, e eVar) {
        l.d(context, "");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            new C1680a(context, str, str2, eVar).a();
        } else {
            ChatCheckLoginActivity.a.a(context, str, str2, eVar);
        }
    }
}
