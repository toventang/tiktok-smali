package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import h.f.b.l;
import java.util.List;

public class MediaSessionService extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f37060f = new a((byte) 0);

    static {
        Covode.recordClassIndex(22288);
    }

    @Override // androidx.media.e
    public final e.a a(String str) {
        l.c(str, "");
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22289);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public static class b extends Binder {

        /* renamed from: a  reason: collision with root package name */
        public final MediaSessionService f37061a;

        static {
            Covode.recordClassIndex(22290);
        }

        public final void a() {
            try {
                this.f37061a.stopForeground(false);
            } catch (Throwable unused) {
            }
        }

        public b(MediaSessionService mediaSessionService) {
            l.c(mediaSessionService, "");
            this.f37061a = mediaSessionService;
        }
    }

    @Override // androidx.media.e
    public IBinder onBind(Intent intent) {
        return new b(this);
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // androidx.media.e
    public final void a(String str, e.i<List<MediaBrowserCompat.MediaItem>> iVar) {
        l.c(str, "");
        l.c(iVar, "");
        iVar.c();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        Intent intent2 = new Intent("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST");
        intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
        return super.onStartCommand(intent, i2, i3);
    }
}
