package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.w.a;

final /* synthetic */ class gb implements m {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131783a;

    static {
        Covode.recordClassIndex(86321);
    }

    gb(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131783a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131783a;
        y.a(videoRecordNewActivity, (a) obj, new ft(videoRecordNewActivity), new fu(videoRecordNewActivity), new fv(videoRecordNewActivity), new fw(videoRecordNewActivity));
    }
}
