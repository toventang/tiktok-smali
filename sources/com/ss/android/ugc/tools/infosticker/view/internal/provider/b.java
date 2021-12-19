package com.ss.android.ugc.tools.infosticker.view.internal.provider;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.infosticker.a.a.n;

public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f149917a;

    static {
        Covode.recordClassIndex(98697);
        int[] iArr = new int[n.values().length];
        f149917a = iArr;
        iArr[n.PROVIDER_STICKER_STATE_UNKNOWN.ordinal()] = 1;
        iArr[n.PROVIDER_STICKER_STATE_DOWNLOADING.ordinal()] = 2;
        iArr[n.PROVIDER_STICKER_STATE_NOT_DOWNLOAD.ordinal()] = 3;
        iArr[n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS.ordinal()] = 4;
        iArr[n.PROVIDER_STICKER_STATE_DOWNLOAD_FAILED.ordinal()] = 5;
    }
}
