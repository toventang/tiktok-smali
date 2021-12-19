package com.ss.android.ugc.aweme.dsp.b;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.i;
import androidx.core.app.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.dsp.experiment.b;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83246a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f83247b = R.id.cq4;

    /* renamed from: c  reason: collision with root package name */
    private static final h f83248c = i.a((h.f.a.a) C1956a.f83249a);

    private static l c() {
        return (l) f83248c.getValue();
    }

    private a() {
    }

    public static void b() {
        c().a((String) null, f83247b);
    }

    static {
        Covode.recordClassIndex(51903);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.b.a$a  reason: collision with other inner class name */
    static final class C1956a extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1956a f83249a = new C1956a();

        static {
            Covode.recordClassIndex(51904);
        }

        C1956a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            l a2 = l.a(d.a());
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("MUSIC_PLAY_SERVICE", "Music Play Service", 4);
                notificationChannel.setDescription("MUSIC_PLAY_SERVICE");
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(true);
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.f2223a.createNotificationChannel(notificationChannel);
                }
            }
            return a2;
        }
    }

    private static PendingIntent d() {
        Context a2 = d.a();
        Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        h.f.b.l.b(launchIntentForPackage, "");
        return PendingIntent.getActivity(a2, 0, launchIntentForPackage, 134217728);
    }

    public static void a() {
        int i2;
        Context a2 = d.a();
        if (b.a(a2)) {
            i2 = R.string.dbr;
        } else {
            i2 = R.string.dbg;
        }
        String string = a2.getString(i2);
        h.f.b.l.b(string, "");
        String string2 = a2.getString(R.string.dbs, Integer.valueOf(b.a().getCopyrightRestrictions().getMaxMusics()));
        h.f.b.l.b(string2, "");
        i.e eVar = new i.e(a2, "MUSIC_PLAY_SERVICE");
        eVar.f2189l = 1;
        eVar.b(true);
        eVar.f2190m = false;
        eVar.a(2131232369);
        eVar.E = 1;
        eVar.a((CharSequence) string);
        eVar.b(string2);
        eVar.f2183f = d();
        eVar.v = "music_player_service";
        c().a(f83247b, eVar.d());
    }
}
