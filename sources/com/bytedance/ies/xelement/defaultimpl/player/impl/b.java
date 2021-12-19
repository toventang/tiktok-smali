package com.bytedance.ies.xelement.defaultimpl.player.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.h;
import com.bytedance.ies.xelement.b.l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;

public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f36993a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f36994b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f36995c;

    static {
        Covode.recordClassIndex(22248);
        int[] iArr = new int[h.values().length];
        f36993a = iArr;
        iArr[h.SINGLE.ordinal()] = 1;
        iArr[h.ORDER.ordinal()] = 2;
        iArr[h.LIST.ordinal()] = 3;
        int[] iArr2 = new int[l.values().length];
        f36994b = iArr2;
        iArr2[l.LIGHT.ordinal()] = 1;
        iArr2[l.SHORT.ordinal()] = 2;
        int[] iArr3 = new int[o.values().length];
        f36995c = iArr3;
        iArr3[o.PLAYBACK_STATE_START.ordinal()] = 1;
        iArr3[o.PLAYBACK_STATE_PLAYING.ordinal()] = 2;
        iArr3[o.PLAYBACK_STATE_PAUSED.ordinal()] = 3;
        iArr3[o.PLAYBACK_STATE_STOPPED.ordinal()] = 4;
        iArr3[o.PLAYBACK_STATE_ERROR.ordinal()] = 5;
    }
}
