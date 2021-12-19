package com.ss.android.ugc.aweme.dsp.playerservice.plugin;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.c.b;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;

public final /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83599a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f83600b;

    static {
        Covode.recordClassIndex(52168);
        int[] iArr = new int[b.values().length];
        f83599a = iArr;
        iArr[b.LOAD_STATE_STALLED.ordinal()] = 1;
        iArr[b.LOAD_STATE_PLAYABLE.ordinal()] = 2;
        int[] iArr2 = new int[f.values().length];
        f83600b = iArr2;
        iArr2[f.PLAYBACK_STATE_START.ordinal()] = 1;
        iArr2[f.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        iArr2[f.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        iArr2[f.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        iArr2[f.PLAYBACK_STATE_ERROR.ordinal()] = 5;
    }
}
