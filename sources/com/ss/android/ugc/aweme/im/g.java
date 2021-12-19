package com.ss.android.ugc.aweme.im;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class g implements com.ss.android.ugc.aweme.setting.serverpush.a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f100083a = i.a(m.SYNCHRONIZED, b.f100085a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f100084b = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63786);
        }

        public static g a() {
            return (g) g.f100083a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private g() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100085a = new b();

        static {
            Covode.recordClassIndex(63787);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g((byte) 0);
        }
    }

    public static INotificationManagerService a() {
        INotificationManagerService d2 = NotificationManagerServiceImpl.d();
        l.b(d2, "");
        return d2;
    }

    public static boolean b() {
        return a().b();
    }

    static {
        Covode.recordClassIndex(63785);
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public static void a(Integer num) {
        a().b(num);
    }

    public static void b(Integer num) {
        a().e(num);
    }

    public static void c(Integer num) {
        a().a(num);
    }

    public static void d(Integer num) {
        a().d(num);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        l.d(fVar, "");
        a().a(fVar);
    }
}
