package com.mammon.audiosdk;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class AutoVolume {
    private static native float Native_GetAutoVolume(float[] fArr);

    static {
        Covode.recordClassIndex(35489);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("audioeffect", false, (Context) null);
        m.a(uptimeMillis, "audioeffect");
    }
}
