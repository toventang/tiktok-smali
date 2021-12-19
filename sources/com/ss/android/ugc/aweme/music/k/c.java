package com.ss.android.ugc.aweme.music.k;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile MediaPlayer f111545a;

    static {
        Covode.recordClassIndex(71645);
    }

    public static MediaPlayer a() {
        MethodCollector.i(607);
        if (f111545a == null) {
            synchronized (c.class) {
                try {
                    if (f111545a == null) {
                        f111545a = new MediaPlayer();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(607);
                    throw th;
                }
            }
        }
        MediaPlayer mediaPlayer = f111545a;
        MethodCollector.o(607);
        return mediaPlayer;
    }
}
