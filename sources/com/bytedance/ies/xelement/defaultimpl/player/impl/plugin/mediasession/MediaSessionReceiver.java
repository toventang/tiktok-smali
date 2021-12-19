package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;

public final class MediaSessionReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37007a = new a((byte) 0);

    static {
        Covode.recordClassIndex(22257);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22258);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (context != null) {
            Intent intent2 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
            intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
        }
    }
}
