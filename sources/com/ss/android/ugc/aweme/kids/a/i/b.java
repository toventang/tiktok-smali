package com.ss.android.ugc.aweme.kids.a.i;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile MediaPlayer f105382a;

    static {
        Covode.recordClassIndex(67540);
    }

    public static MediaPlayer a() {
        MethodCollector.i(9931);
        if (f105382a == null) {
            synchronized (b.class) {
                try {
                    if (f105382a == null) {
                        f105382a = new MediaPlayer();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9931);
                    throw th;
                }
            }
        }
        MediaPlayer mediaPlayer = f105382a;
        MethodCollector.o(9931);
        return mediaPlayer;
    }
}
