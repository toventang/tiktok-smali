package com.bytedance.im.core.internal.b.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.AuthType;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Refer;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class w<T> {

    /* renamed from: a  reason: collision with root package name */
    private b<T> f38625a;
    protected int p;

    static {
        Covode.recordClassIndex(23052);
    }

    /* access modifiers changed from: protected */
    public abstract void a(k kVar, Runnable runnable);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(k kVar);

    /* access modifiers changed from: protected */
    public int b() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public void d(k kVar) {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static a f38628a;

        /* renamed from: b  reason: collision with root package name */
        private long f38629b;

        static {
            Covode.recordClassIndex(23054);
        }

        private a() {
            if (this.f38629b == 0) {
                this.f38629b = (long) new Random().nextInt(1000000);
            }
        }

        public final synchronized long b() {
            long j2;
            MethodCollector.i(11114);
            if (this.f38629b <= 0) {
                this.f38629b = 1;
            }
            j2 = this.f38629b;
            this.f38629b = 1 + j2;
            MethodCollector.o(11114);
            return j2;
        }

        public static a a() {
            MethodCollector.i(11111);
            if (f38628a == null) {
                synchronized (a.class) {
                    try {
                        if (f38628a == null) {
                            f38628a = new a();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11111);
                        throw th;
                    }
                }
            }
            a aVar = f38628a;
            MethodCollector.o(11111);
            return aVar;
        }
    }

    public w(int i2) {
        this.p = i2;
    }

    public final void a(u uVar) {
        b<T> bVar = this.f38625a;
        if (bVar != null) {
            bVar.a(uVar);
        }
    }

    public final void b(k kVar) {
        a(u.a(kVar));
    }

    public final void a(T t) {
        b<T> bVar = this.f38625a;
        if (bVar != null) {
            bVar.a((Object) t);
        }
    }

    public final void c(final k kVar) {
        SendMessageRequestBody sendMessageRequestBody;
        if (!kVar.l()) {
            if (kVar.f38728i == e.b.f37586b || kVar.f38728i == e.b.f37587c) {
                d.a().f37562b.a(kVar.f38728i);
            } else if (kVar.f38728i == e.b.f37588d && this.p == IMCMD.SEND_MESSAGE.getValue() && kVar.f38724e.body != null && (sendMessageRequestBody = kVar.f38724e.body.send_message_body) != null) {
                x.a();
                x.a(sendMessageRequestBody.conversation_id);
            }
        }
        a(kVar, new Runnable() {
            /* class com.bytedance.im.core.internal.b.a.w.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23053);
            }

            public final void run() {
                if (kVar.f38722c != null && kVar.l()) {
                    w.this.a(kVar);
                }
            }
        });
    }

    public w(int i2, b<T> bVar) {
        this.p = i2;
        if (bVar != null) {
            this.f38625a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(T t, k kVar) {
        b<T> bVar = this.f38625a;
        if (bVar != null) {
            try {
                if (!(bVar instanceof c) || kVar == null) {
                    bVar.a((Object) t);
                } else {
                    ((c) bVar).a(t, u.a(kVar));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                com.bytedance.im.core.c.e.a(e2);
            }
        }
    }

    public final void a(T t, long j2, boolean z) {
        b<T> bVar = this.f38625a;
        if (bVar == null) {
            return;
        }
        if (bVar instanceof com.bytedance.im.core.a.a.a) {
            ((com.bytedance.im.core.a.a.a) bVar).a(t, j2, z);
        } else {
            bVar.a((Object) t);
        }
    }

    public final long a(int i2, RequestBody requestBody, j jVar, Object... objArr) {
        int i3 = this.p;
        Map<String, String> k2 = d.a().f37562b.k();
        if (k2 == null) {
            k2 = new HashMap<>();
        }
        if (d.a().b().F) {
            k2.put("expected_user_id", String.valueOf(d.a().f37562b.a()));
        }
        Request build = new Request.Builder().sequence_id(Long.valueOf(a.a().b())).sdk_version("5.1.3.8-rc.2.7-bugfix").token(d.a().f37562b.d()).refer(Refer.ANDROID).device_id(d.a().f37562b.f()).inbox_type(Integer.valueOf(i2)).build_number("1").channel(d.a().b().f37598f).device_platform("android").device_type(Build.MODEL).os_version(Build.VERSION.RELEASE).version_code(String.valueOf(d.a().b().f37597e)).cmd(Integer.valueOf(i3)).body(requestBody).headers(k2).auth_type(AuthType.fromValue(d.a().b().ac)).build();
        k kVar = new k(build.sequence_id.longValue(), this);
        d(kVar);
        kVar.f38724e = build;
        kVar.f38723d = objArr;
        kVar.f38721b = a();
        kVar.o = b();
        kVar.p = -1;
        kVar.f38722c = jVar;
        com.bytedance.im.core.internal.d.c.a().a(kVar);
        return kVar.f38720a;
    }
}
