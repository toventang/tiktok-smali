package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.r;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final C1986a f83603m = new C1986a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final NotificationManager f83604a;

    /* renamed from: b  reason: collision with root package name */
    public final b f83605b;

    /* renamed from: c  reason: collision with root package name */
    public final c f83606c = new c();

    /* renamed from: d  reason: collision with root package name */
    public boolean f83607d;

    /* renamed from: e  reason: collision with root package name */
    boolean f83608e;

    /* renamed from: f  reason: collision with root package name */
    public final IBinder.DeathRecipient f83609f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    public final ServiceConnection f83610g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    public MediaSessionService.b f83611h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f83612i;

    /* renamed from: j  reason: collision with root package name */
    final g f83613j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b f83614k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.a.d f83615l;
    private final h n = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(52171);
    }

    private final d.AnonymousClass1 d() {
        return (d.AnonymousClass1) this.n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a$a  reason: collision with other inner class name */
    public static final class C1986a {
        static {
            Covode.recordClassIndex(52172);
        }

        private C1986a() {
        }

        public /* synthetic */ C1986a(byte b2) {
            this();
        }
    }

    static final class c implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83619a;

        static {
            Covode.recordClassIndex(52174);
        }

        c(a aVar) {
            this.f83619a = aVar;
        }

        public final void binderDied() {
            this.f83619a.c();
        }
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f83620a;

                static {
                    Covode.recordClassIndex(52176);
                }

                public final void handleMessage(Message message) {
                    Object obj;
                    l.d(message, "");
                    int i2 = message.what;
                    if (i2 == -2) {
                        this.f83620a.this$0.b();
                    } else if (i2 == -1) {
                        if (this.f83620a.this$0.f83607d) {
                            a aVar = this.f83620a.this$0;
                            Notification a2 = aVar.f83605b.a(aVar.f83606c);
                            if (a2 != null) {
                                try {
                                    if (l.a((Object) aVar.f83606c.f83629a, (Object) true)) {
                                        MediaSessionService.b bVar = aVar.f83611h;
                                        if (bVar != null) {
                                            int i3 = aVar.f83613j.f83666a;
                                            l.d(a2, "");
                                            try {
                                                bVar.f83651a.startForeground(i3, a2);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } else {
                                        aVar.f83604a.notify(aVar.f83613j.f83666a, a2);
                                    }
                                    aVar.f83608e = true;
                                    obj = q.m223constructorimpl(z.f158842a);
                                } catch (Throwable th) {
                                    obj = q.m223constructorimpl(r.a(th));
                                }
                                q.m226exceptionOrNullimpl(obj);
                                return;
                            }
                            return;
                        }
                        this.f83620a.this$0.b();
                    }
                }

                {
                    this.f83620a = r1;
                }
            };
        }
    }

    public final void c() {
        MediaSessionService.b bVar = this.f83611h;
        if (bVar != null) {
            bVar.unlinkToDeath(this.f83609f, 0);
        }
        this.f83611h = null;
        f();
    }

    private final void e() {
        if (this.f83608e) {
            d().removeMessages(-2);
            d().removeMessages(-1);
            d().sendMessageDelayed(Message.obtain(d(), -2), 300);
        }
    }

    private final void f() {
        Object obj;
        if (this.f83611h == null) {
            try {
                Intent intent = new Intent(this.f83612i, MediaSessionService.class);
                Context context = this.f83612i;
                ServiceConnection serviceConnection = this.f83610g;
                if (context == null || !(context instanceof Context)) {
                    context.bindService(intent, serviceConnection, 1);
                } else if (!com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            q.m226exceptionOrNullimpl(obj);
        }
    }

    public final void a() {
        if (!this.f83607d) {
            e();
        } else if (l.a((Object) this.f83606c.f83629a, (Object) true) || this.f83608e) {
            d().removeMessages(-2);
            d().removeMessages(-1);
            d().sendMessageDelayed(Message.obtain(d(), -1), 300);
        }
    }

    public final void b() {
        Object obj;
        try {
            MediaSessionService.b bVar = this.f83611h;
            if (bVar != null) {
                bVar.a();
            }
            this.f83604a.cancel(this.f83613j.f83666a);
            this.f83608e = false;
            obj = q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        q.m226exceptionOrNullimpl(obj);
    }

    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83618a;

        static {
            Covode.recordClassIndex(52173);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f83618a = aVar;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f83618a.c();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof MediaSessionService.b) {
                this.f83618a.f83611h = (MediaSessionService.b) iBinder;
                MediaSessionService.b bVar = this.f83618a.f83611h;
                if (bVar != null) {
                    bVar.linkToDeath(this.f83618a.f83609f, 0);
                }
                this.f83618a.a();
            }
        }
    }

    public final void a(boolean z) {
        this.f83607d = z;
        if (z) {
            a();
        } else {
            e();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2414);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.o(2414);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public a(Context context, g gVar, com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b bVar, com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar, MediaSessionCompat.Token token, ComponentName componentName) {
        l.d(context, "");
        l.d(gVar, "");
        l.d(dVar, "");
        l.d(token, "");
        l.d(componentName, "");
        this.f83612i = context;
        this.f83613j = gVar;
        this.f83614k = bVar;
        this.f83615l = dVar;
        Object a2 = a(context, "notification");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) a2;
        this.f83604a = notificationManager;
        this.f83605b = new b(context, gVar, token, componentName);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(gVar.f83671f, gVar.f83669d, 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.setDescription(gVar.f83670e);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        f();
    }
}
