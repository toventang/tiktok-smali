package com.ss.android.ugc.aweme.filter.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.g;

public final /* synthetic */ class p {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f95984a;

    static {
        Covode.recordClassIndex(60792);
        int[] iArr = new int[g.values().length];
        f95984a = iArr;
        iArr[g.FILTER_STATE_NOT_DOWNLOAD.ordinal()] = 1;
        iArr[g.FILTER_STATE_DOWNLOAD_FAILED.ordinal()] = 2;
        iArr[g.FILTER_STATE_DOWNLOAD_SUCCESS.ordinal()] = 3;
        iArr[g.FILTER_STATE_UNKNOWN.ordinal()] = 4;
        iArr[g.FILTER_STATE_DOWNLOADING.ordinal()] = 5;
    }
}
