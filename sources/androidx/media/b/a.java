package androidx.media.b;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

public final class a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(1387);
    }

    /* renamed from: androidx.media.b.a$a  reason: collision with other inner class name */
    static class C0054a extends MediaBrowserCompat.b {

        /* renamed from: c  reason: collision with root package name */
        public MediaBrowserCompat f3640c;

        /* renamed from: d  reason: collision with root package name */
        private final Context f3641d;

        /* renamed from: e  reason: collision with root package name */
        private final Intent f3642e;

        /* renamed from: f  reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f3643f;

        static {
            Covode.recordClassIndex(1388);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public final void b() {
            d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public final void c() {
            d();
        }

        private void d() {
            this.f3640c.a();
            this.f3643f.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public final void a() {
            try {
                new MediaControllerCompat(this.f3641d, this.f3640c.f585b.e()).a((KeyEvent) this.f3642e.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            d();
        }

        C0054a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f3641d = context;
            this.f3642e = intent;
            this.f3643f = pendingResult;
        }
    }

    private static BroadcastReceiver.PendingResult a(a aVar) {
        boolean a2;
        try {
            if ("com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(aVar.getClass().getName())) {
                try {
                    a2 = SettingsManager.a().a("fire_base_receiver_opt", true);
                } catch (Throwable unused) {
                }
                if (a2) {
                    return null;
                }
            }
            return aVar.goAsync();
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a2 = a(context, "android.intent.action.MEDIA_BUTTON");
            if (a2 != null) {
                intent.setComponent(a2);
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                } else {
                    a(context, intent);
                }
            } else {
                ComponentName a3 = a(context, "android.media.browse.MediaBrowserService");
                if (a3 != null) {
                    BroadcastReceiver.PendingResult a4 = a(this);
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    C0054a aVar = new C0054a(applicationContext, intent, a4);
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a3, aVar);
                    aVar.f3640c = mediaBrowserCompat;
                    mediaBrowserCompat.f585b.c();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.b.a.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public static KeyEvent a(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.f685a.a(keyEvent);
        return keyEvent;
    }

    public static PendingIntent a(Context context, ComponentName componentName, long j2) {
        int i2;
        if (componentName == null) {
            return null;
        }
        if (j2 == 4) {
            i2 = 126;
        } else if (j2 == 2) {
            i2 = 127;
        } else if (j2 == 32) {
            i2 = 87;
        } else if (j2 == 16) {
            i2 = 88;
        } else if (j2 == 1) {
            i2 = 86;
        } else if (j2 == 64) {
            i2 = 90;
        } else if (j2 == 8) {
            i2 = 89;
        } else if (j2 != 512) {
            return null;
        } else {
            i2 = 85;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i2));
        return PendingIntent.getBroadcast(context, i2, intent, 0);
    }
}
