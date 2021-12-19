package com.ss.android.ugc.aweme.shortvideo.ui;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class el implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131721a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f131722b;

    /* renamed from: c  reason: collision with root package name */
    private final VERecordData f131723c;

    static {
        Covode.recordClassIndex(86268);
    }

    el(cj cjVar, Pair pair, VERecordData vERecordData) {
        this.f131721a = cjVar;
        this.f131722b = pair;
        this.f131723c = vERecordData;
    }

    public final void run() {
        cj cjVar = this.f131721a;
        Pair pair = this.f131722b;
        VERecordData vERecordData = this.f131723c;
        int i2 = (int) (cjVar.K.mVideoCoverStartTm * 1000.0f);
        if (cjVar.K.isUseTimeReverseEffect()) {
            i2 = (((Integer) pair.second).intValue() - ((Integer) pair.first).intValue()) - i2;
        }
        VEUtils.getVideoThumb(vERecordData, i2, -1, cjVar.u.getHeight(), false, new en(cjVar));
    }
}
