package com.ss.android.ugc.aweme.dsp.playpage.queue;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.c.h;

public final /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83918a;

    static {
        Covode.recordClassIndex(52338);
        int[] iArr = new int[h.values().length];
        f83918a = iArr;
        iArr[h.PLAY_CURRENT.ordinal()] = 1;
        iArr[h.PLAY_CLICKED_PLAYABLE.ordinal()] = 2;
        iArr[h.ALL_PLAYABLE_EXPIRED.ordinal()] = 3;
        iArr[h.PLAY_UNEXPIRED_PLAYABLE.ordinal()] = 4;
        iArr[h.ERROR.ordinal()] = 5;
        iArr[h.PLAYABLE_LIMITED_UPSELL_RESSO.ordinal()] = 6;
    }
}
