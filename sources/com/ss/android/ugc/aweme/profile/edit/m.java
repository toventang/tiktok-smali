package com.ss.android.ugc.aweme.profile.edit;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import b.g;
import com.bytedance.awemelobby.b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.i;
import com.google.b.a.c.a.a.b;
import com.google.b.a.d.h;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import net.openid.appauth.f;

public final class m implements WeakHandler.IHandler, i.c {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f116136j = false;

    /* renamed from: k  reason: collision with root package name */
    public static final a f116137k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f116138a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f116139b = "";

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f116140c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    public com.google.b.a.c.a.a.b f116141d;

    /* renamed from: e  reason: collision with root package name */
    public final h f116142e = com.google.b.a.b.a.a.a.a();

    /* renamed from: f  reason: collision with root package name */
    public final com.google.b.a.e.a.a f116143f = new com.google.b.a.e.a.a();

    /* renamed from: g  reason: collision with root package name */
    public final h.h f116144g = h.i.a((h.f.a.a) new c(this));

    /* renamed from: h  reason: collision with root package name */
    public final androidx.fragment.app.e f116145h;

    /* renamed from: i  reason: collision with root package name */
    public final d f116146i;

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        l.d(connectionResult, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(74914);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(74913);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f116147a;

        static {
            Covode.recordClassIndex(74915);
        }

        public b(m mVar) {
            this.f116147a = mVar;
        }

        public final void run() {
            try {
                f.a aVar = new f.a(new net.openid.appauth.i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), this.f116147a.f116139b, "code", Uri.parse(this.f116147a.f116138a));
                aVar.a(Arrays.asList("https://www.googleapis.com/auth/youtube.readonly"));
                net.openid.appauth.f a2 = aVar.a();
                l.b(a2, "");
                this.f116147a.f116145h.startActivityForResult(new net.openid.appauth.h(this.f116147a.f116145h).a(a2), 1001);
            } catch (Exception e2) {
                m.a(this.f116147a, e2, (String) null, "before_goto_URL", (YoutubeApi.a) null, 10);
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(74916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            androidx.fragment.app.e eVar = this.this$0.f116145h;
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(eVar);
            if (isGooglePlayServicesAvailable == 0) {
                z = true;
                m mVar = this.this$0;
                l.b("616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1.apps.googleusercontent.com", "");
                mVar.f116139b = "616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1.apps.googleusercontent.com";
                m mVar2 = this.this$0;
                l.b("com.googleusercontent.apps.616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1:/oauthredirect", "");
                mVar2.f116138a = "com.googleusercontent.apps.616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1:/oauthredirect";
                this.this$0.f116141d = new b.a().a(this.this$0.f116142e).a(this.this$0.f116143f).b(this.this$0.f116139b).a();
            } else {
                Dialog errorDialog = instance.getErrorDialog(eVar, isGooglePlayServicesAvailable, 9000, new b.DialogInterface$OnCancelListenerC0552b(eVar));
                if (errorDialog != null) {
                    errorDialog.setOnDismissListener(new b.a(eVar, instance, isGooglePlayServicesAvailable));
                    bt.a(errorDialog);
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalStateException(instance.getErrorString(isGooglePlayServicesAvailable)));
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f116148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f116149b;

        static {
            Covode.recordClassIndex(74917);
        }

        public d(m mVar, Intent intent) {
            this.f116148a = mVar;
            this.f116149b = intent;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x004f */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [net.openid.appauth.e] */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.android.ugc.aweme.profile.edit.m] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Exception] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.edit.m.d.call():java.lang.Object");
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f116154a;

        static {
            Covode.recordClassIndex(74921);
        }

        public f(m mVar) {
            this.f116154a = mVar;
        }

        public final void run() {
            if (YoutubeApi.a()) {
                com.ss.android.ugc.aweme.account.b.g().queryUser(this.f116154a.f116140c);
                this.f116154a.f116146i.e(null);
                r.a("social_account_unbind_success", new com.ss.android.ugc.aweme.app.f.d().a("platform", "youtube").f66730a);
                return;
            }
            this.f116154a.f116146i.f(this.f116154a.f116145h.getString(R.string.h4k));
        }
    }

    public static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f116153a;

        static {
            Covode.recordClassIndex(74920);
        }

        public e(m mVar) {
            this.f116153a = mVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (((java.lang.Boolean) r9.d()).booleanValue() == false) goto L_0x0017;
         */
        @Override // b.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(b.i r9) {
            /*
                r8 = this;
                boolean r0 = com.ss.android.ugc.aweme.utils.ai.a(r9)
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0017
                h.f.b.l.b(r9, r1)
                java.lang.Object r0 = r9.d()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x002e
            L_0x0017:
                com.ss.android.ugc.aweme.profile.edit.m r2 = r8.f116153a
                java.lang.Exception r3 = new java.lang.Exception
                h.f.b.l.b(r9, r1)
                java.lang.Exception r0 = r9.e()
                r3.<init>(r0)
                r4 = 0
                r6 = 0
                r7 = 10
                java.lang.String r5 = "send_token_to_sever"
                com.ss.android.ugc.aweme.profile.edit.m.a(r2, r3, r4, r5, r6, r7)
            L_0x002e:
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.edit.m.e.then(b.i):java.lang.Object");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        if (message != null && !(message.obj instanceof Exception) && message.obj != null) {
            if (message.obj instanceof UserResponse) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                user = ((UserResponse) obj).getUser();
            } else {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj2;
            }
            if (message.what == 112 && user != null) {
                com.ss.android.ugc.aweme.account.b.g().updateCurUser(user);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.c(g2.getCurUser()));
            }
        }
    }

    public m(androidx.fragment.app.e eVar, d dVar) {
        l.d(eVar, "");
        l.d(dVar, "");
        this.f116145h = eVar;
        this.f116146i = dVar;
    }

    public static /* synthetic */ void a(m mVar, Exception exc, String str, String str2, YoutubeApi.a aVar, int i2) {
        String str3 = str;
        Exception exc2 = exc;
        YoutubeApi.a aVar2 = null;
        if ((i2 & 1) != 0) {
            exc2 = null;
        }
        String str4 = "";
        if ((i2 & 2) != 0) {
            str3 = str4;
        }
        if ((i2 & 4) == 0) {
            str4 = str2;
        }
        if ((i2 & 8) == 0) {
            aVar2 = aVar;
        }
        mVar.a(false, (Integer) null, str3, exc2, aVar2, str4);
    }

    public final void a(boolean z, Integer num, String str, Exception exc, YoutubeApi.a aVar, String str2) {
        r.a("social_account_bind_failure", new com.ss.android.ugc.aweme.app.f.d().a("platform", "youtube").a("error_desc", YoutubeApi.a(this.f116145h, exc, num, aVar)).a("error_code", str2).f66730a);
        if (z) {
            this.f116146i.e(null);
        } else {
            this.f116146i.f(str);
        }
    }
}
