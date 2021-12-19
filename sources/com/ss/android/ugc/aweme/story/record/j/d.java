package com.ss.android.ugc.aweme.story.record.j;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.property.dk;
import com.ss.android.ugc.aweme.property.dl;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.r.a;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.UUID;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f138381a = new d();

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 8;
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(90507);
    }

    public static final int a() {
        int i2;
        if (dl.a() != 1) {
            i2 = dl.a();
        } else if (dk.a() != 1) {
            i2 = dk.a();
        } else {
            i2 = 1;
        }
        if (!a(i2)) {
            return 1;
        }
        return i2;
    }

    public static MediaPlayer a(Context context) {
        l.d(context, "");
        if (i.a("file:///system/media/audio/ui/camera_click.ogg")) {
            return MediaPlayer.create(context, Uri.parse("file:///system/media/audio/ui/camera_click.ogg"));
        }
        return null;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1083);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                    MethodCollector.o(1083);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(MediaPlayer mediaPlayer, Context context) {
        l.d(mediaPlayer, "");
        l.d(context, "");
        Object a2 = a(context, DataType.AUDIO);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.media.AudioManager");
        if (((AudioManager) a2).getStreamVolume(5) != 0) {
            mediaPlayer.start();
        }
    }

    public static final void a(Bundle bundle, Activity activity, boolean z) {
        l.d(activity, "");
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("shoot_way", "story");
        if (!intent.hasExtra("creation_id")) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
        cr.a().a((c) null);
        cr.a().g();
        if (z || a.a().a((Context) activity, intent)) {
            a.a().c(activity, intent);
            return;
        }
        a.a().a(activity, intent);
        a.a().b(activity, intent);
    }
}
