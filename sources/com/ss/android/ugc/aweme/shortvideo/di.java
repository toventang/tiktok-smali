package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.ff;
import java.io.File;

public final class di extends dj {

    /* renamed from: a  reason: collision with root package name */
    public static final String f126458a = new File(i.f115645a.getFilesDir(), "sticker_1_0/3d/resources").getPath();

    /* renamed from: b  reason: collision with root package name */
    public static final String f126459b = (f126461d + "music-effect/");

    /* renamed from: c  reason: collision with root package name */
    public static final String f126460c = (f126461d + "face_track.model");

    public static long a() {
        long a2 = ff.a();
        if (a2 < 1000 || a2 >= 15000) {
            return 1000;
        }
        return a2;
    }

    static {
        Covode.recordClassIndex(82954);
    }
}
