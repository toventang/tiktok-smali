package com.ss.android.ugc.aweme.user;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.dn;
import com.ss.android.ugc.aweme.dr;
import com.ss.android.ugc.aweme.experiment.hf;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.f;
import h.f.b.l;
import java.util.Objects;

public final class e implements WeakHandler.IHandler {

    /* renamed from: i  reason: collision with root package name */
    public static final String f142362i = "https://api-va.tiktokv.com/aweme/v1/check/in/";

    /* renamed from: j  reason: collision with root package name */
    public static final String f142363j = "https://api-va.tiktokv.com/tiktok/v1/kids/check/in/";

    /* renamed from: k  reason: collision with root package name */
    public static final e f142364k = new e();

    /* renamed from: l  reason: collision with root package name */
    public static final a f142365l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f142366a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f142367b;

    /* renamed from: c  reason: collision with root package name */
    public long f142368c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHandler f142369d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    public String f142370e;

    /* renamed from: f  reason: collision with root package name */
    public User f142371f;

    /* renamed from: g  reason: collision with root package name */
    public f.a f142372g;

    /* renamed from: h  reason: collision with root package name */
    public String f142373h;

    public static final class a {
        static {
            Covode.recordClassIndex(93114);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f142374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f142375b;

        static {
            Covode.recordClassIndex(93115);
        }

        b(e eVar, User user) {
            this.f142374a = eVar;
            this.f142375b = user;
        }

        public final void run() {
            this.f142374a.b(this.f142375b);
        }
    }

    public final void c() {
        f.m();
        dr.a(5, null, b());
        dn.a();
    }

    static {
        Covode.recordClassIndex(93113);
    }

    public final String a() {
        String str = this.f142370e;
        if (str == null) {
            str = f.f142379d.e();
        }
        this.f142370e = str;
        return str;
    }

    public final synchronized User b() {
        User user;
        MethodCollector.i(6683);
        user = this.f142371f;
        if (user == null) {
            user = f.f142379d.k();
        }
        this.f142371f = user;
        if (user == null) {
            l.b();
        }
        MethodCollector.o(6683);
        return user;
    }

    public final String e() {
        String a2 = a();
        if (a2 == null) {
            l.b();
        }
        return a2;
    }

    public final boolean d() {
        if (b().getAgeGatePostAction() == 1) {
            return true;
        }
        f.a aVar = this.f142372g;
        if (aVar == null) {
            aVar = f.e(e());
        }
        this.f142372g = aVar;
        if (aVar == null || !aVar.f142393g) {
            return false;
        }
        return true;
    }

    public static boolean a(User user) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        return true;
    }

    public static c e(String str) {
        l.d(str, "");
        return f.f(str);
    }

    public static f.a f(String str) {
        l.d(str, "");
        return f.e(str);
    }

    public final void c(String str) {
        if (str != null && !f.h(str)) {
            if (l.a((Object) str, (Object) a())) {
                this.f142370e = null;
                this.f142371f = null;
                this.f142372g = null;
            }
            f.f142379d.g(str);
        }
    }

    public final void d(String str) {
        l.d(str, "");
        if (!l.a((Object) str, (Object) a())) {
            this.f142371f = null;
            this.f142370e = str;
            this.f142372g = null;
            f.b(str);
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.f142373h = str;
            f.f142379d.c(str);
        }
    }

    public final void b(String str) {
        if (!TextUtils.equals(b().getUniqueId(), str)) {
            b().setUniqueId(str);
            this.f142366a = true;
            f.a(b());
        }
    }

    public final void b(User user) {
        if (a(user)) {
            User b2 = b();
            this.f142367b = false;
            this.f142368c = -1;
            this.f142366a = true;
            if (user == null) {
                l.b();
            }
            a(user.getUid());
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            f.d(secUid);
            dr.a(4, b2, user);
            this.f142371f = user;
            f.a(user);
            String uid = user.getUid();
            l.b(uid, "");
            d(uid);
            c();
            f.f142379d.e();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        l.d(message, "");
        if (!(message.obj instanceof Exception)) {
            int i2 = message.what;
            if (i2 != 112) {
                if (i2 == 113) {
                    dr.a(11, null, null);
                }
            } else if (message.obj != null && (message.obj instanceof User)) {
                if (!hf.f90214a) {
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    b((User) obj);
                    return;
                }
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                g.c().execute(new b(this, (User) obj2));
            }
        }
    }
}
