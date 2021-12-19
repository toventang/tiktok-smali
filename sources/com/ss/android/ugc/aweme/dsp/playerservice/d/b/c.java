package com.ss.android.ugc.aweme.dsp.playerservice.d.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;

public final /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83499a;

    static {
        Covode.recordClassIndex(52105);
        int[] iArr = new int[f.values().length];
        f83499a = iArr;
        iArr[f.PLAYBACK_STATE_START.ordinal()] = 1;
        iArr[f.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        iArr[f.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        iArr[f.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        iArr[f.PLAYBACK_STATE_ERROR.ordinal()] = 5;
    }
}
