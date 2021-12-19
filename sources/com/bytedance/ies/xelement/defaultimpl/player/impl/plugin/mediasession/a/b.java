package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;
import java.lang.reflect.Field;

public final class b implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f37021f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final NotificationManager f37022a;

    /* renamed from: b  reason: collision with root package name */
    final d f37023b;

    /* renamed from: c  reason: collision with root package name */
    public e f37024c;

    /* renamed from: d  reason: collision with root package name */
    public final IBinder.DeathRecipient f37025d;

    /* renamed from: e  reason: collision with root package name */
    public MediaSessionService.b f37026e;

    /* renamed from: g  reason: collision with root package name */
    private final h f37027g = i.a((h.f.a.a) new e(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f37028h = i.a((h.f.a.a) f.f37038a);

    /* renamed from: i  reason: collision with root package name */
    private final ServiceConnection f37029i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f37030j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b f37031k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.ies.xelement.b.c f37032l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$b  reason: collision with other inner class name */
    public static final class C0913b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f37033a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f37034b = false;

        static {
            Covode.recordClassIndex(22271);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0913b)) {
                return false;
            }
            C0913b bVar = (C0913b) obj;
            return this.f37033a == bVar.f37033a && this.f37034b == bVar.f37034b;
        }

        public final int hashCode() {
            boolean z = this.f37033a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f37034b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "NotificationContext(isActive=" + this.f37033a + ", isShown=" + this.f37034b + ")";
        }
    }

    static {
        Covode.recordClassIndex(22269);
    }

    private final e.AnonymousClass1 e() {
        return (e.AnonymousClass1) this.f37027g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final C0913b b() {
        return (C0913b) this.f37028h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f37036a;

        static {
            Covode.recordClassIndex(22273);
        }

        d(b bVar) {
            this.f37036a = bVar;
        }

        public final void binderDied() {
            this.f37036a.d();
        }
    }

    static final class f extends m implements h.f.a.a<C0913b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f37038a = new f();

        static {
            Covode.recordClassIndex(22276);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C0913b invoke() {
            return new C0913b();
        }
    }

    static final class e extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(22274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f37037a;

                static {
                    Covode.recordClassIndex(22275);
                }

                public final void handleMessage(Message message) {
                    Integer valueOf;
                    super.handleMessage(message);
                    Boolean bool = null;
                    if (message != null && (valueOf = Integer.valueOf(message.what)) != null) {
                        if (valueOf.intValue() == 1) {
                            Object obj = message.obj;
                            if (!(obj instanceof e)) {
                                obj = null;
                            }
                            e eVar = (e) obj;
                            if (eVar != null) {
                                b bVar = this.f37037a.this$0;
                                Notification a2 = bVar.f37023b.a(eVar);
                                if (a2 != null) {
                                    try {
                                        e eVar2 = bVar.f37024c;
                                        if (eVar2 != null) {
                                            bool = eVar2.f37053a;
                                        }
                                        if (l.a((Object) bool, (Object) true)) {
                                            MediaSessionService.b bVar2 = bVar.f37026e;
                                            if (bVar2 != null) {
                                                int i2 = a.f37018a;
                                                l.c(a2, "");
                                                try {
                                                    bVar2.f37061a.startForeground(i2, a2);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        } else {
                                            bVar.f37022a.notify(a.f37018a, a2);
                                        }
                                        bVar.b().f37034b = true;
                                    } catch (Throwable th) {
                                        g.f36700a.c("NotificationController", "showImmediate: " + Log.getStackTraceString(th));
                                    }
                                }
                            }
                        } else if (valueOf.intValue() == 2) {
                            this.f37037a.this$0.c();
                        }
                    }
                }

                {
                    this.f37037a = r1;
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        c();
        h();
        this.f37024c = null;
    }

    private final void h() {
        try {
            MediaSessionService.b bVar = this.f37026e;
            if (bVar != null) {
                bVar.unlinkToDeath(this.f37025d, 0);
            }
            this.f37030j.unbindService(this.f37029i);
        } catch (Throwable th) {
            g.f36700a.c("NotificationController", th.getMessage());
        }
    }

    public final void d() {
        MediaSessionService.b bVar = this.f37026e;
        if (bVar != null) {
            bVar.unlinkToDeath(this.f37025d, 0);
        }
        this.f37026e = null;
        g();
    }

    private void f() {
        if (b().f37034b) {
            e().removeMessages(1);
            e().removeMessages(2);
            e().sendMessageDelayed(Message.obtain(e(), 2), 300);
        }
    }

    private final void g() {
        if (this.f37026e == null) {
            try {
                Intent intent = new Intent(this.f37030j, MediaSessionService.class);
                Context context = this.f37030j;
                ServiceConnection serviceConnection = this.f37029i;
                if (context == null || !(context instanceof Context)) {
                    context.bindService(intent, serviceConnection, 1);
                } else if (!com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
            } catch (Throwable th) {
                g.f36700a.c("NotificationController", th.getMessage());
            }
        }
    }

    public final void c() {
        try {
            MediaSessionService.b bVar = this.f37026e;
            if (bVar != null) {
                bVar.a();
            }
            this.f37022a.cancel(a.f37018a);
            b().f37034b = false;
        } catch (Throwable th) {
            g.f36700a.c("NotificationController", "hideImmediate: " + Log.getStackTraceString(th));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f37035a;

        static {
            Covode.recordClassIndex(22272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f37035a = bVar;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f37035a.d();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof MediaSessionService.b) {
                this.f37035a.f37026e = (MediaSessionService.b) iBinder;
                MediaSessionService.b bVar = this.f37035a.f37026e;
                if (bVar != null) {
                    bVar.linkToDeath(this.f37035a.f37025d, 0);
                }
                e eVar = this.f37035a.f37024c;
                if (eVar != null) {
                    this.f37035a.a(eVar);
                }
            }
        }
    }

    public final void a(boolean z) {
        b().f37033a = z;
    }

    public final void a(Intent intent) {
        int intExtra;
        com.bytedance.ies.xelement.b.c cVar;
        l.c(intent, "");
        if (!b().f37033a || (intExtra = intent.getIntExtra("command_from_notification", -1)) == -1) {
            return;
        }
        if (intExtra == 1 || intExtra == 2) {
            c();
        } else if (intExtra == 3 && (cVar = this.f37032l) != null && cVar.bk_()) {
            this.f37032l.bl_();
        }
    }

    public final void a(Bitmap bitmap) {
        e eVar = this.f37024c;
        if (eVar != null) {
            eVar.f37059g = bitmap;
            eVar.f37054b = Boolean.valueOf(this.f37031k.j());
            eVar.f37055c = Boolean.valueOf(this.f37031k.i());
            a(eVar);
        }
    }

    public final void a(o oVar) {
        l.c(oVar, "");
        if (c.f37039a[oVar.ordinal()] != 1) {
            e eVar = this.f37024c;
            if (eVar != null) {
                eVar.f37053a = Boolean.valueOf(oVar.isPlayingState());
                eVar.f37054b = Boolean.valueOf(this.f37031k.j());
                eVar.f37055c = Boolean.valueOf(this.f37031k.i());
                a(eVar);
                return;
            }
            return;
        }
        f();
    }

    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
        if (fVar == null) {
            a();
            return;
        }
        e eVar = new e();
        eVar.f37053a = false;
        eVar.f37054b = Boolean.valueOf(this.f37031k.j());
        eVar.f37055c = Boolean.valueOf(this.f37031k.i());
        eVar.f37056d = fVar.getSongName();
        eVar.f37057e = fVar.getArtistName();
        eVar.f37058f = fVar.getAlbumName();
        eVar.f37059g = null;
        a(eVar);
        this.f37024c = eVar;
    }

    public final void a(e eVar) {
        if (l.a((Object) eVar.f37053a, (Object) true) || b().f37034b) {
            e().removeMessages(1);
            e().removeMessages(2);
            e().sendMessageDelayed(Message.obtain(e(), 1, eVar), 150);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7250);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7250);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public b(Context context, MediaSessionCompat.Token token, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar, ComponentName componentName, com.bytedance.ies.xelement.b.c cVar, int i2) {
        l.c(context, "");
        l.c(token, "");
        l.c(bVar, "");
        l.c(componentName, "");
        this.f37030j = context;
        this.f37031k = bVar;
        this.f37032l = cVar;
        Object a2 = a(context, "notification");
        if (a2 != null) {
            NotificationManager notificationManager = (NotificationManager) a2;
            this.f37022a = notificationManager;
            this.f37025d = new d(this);
            this.f37029i = new c(this);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            this.f37023b = new d(context, token, componentName, i2);
            g();
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
