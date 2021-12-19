package com.ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class bo implements x<ai> {

    /* renamed from: a  reason: collision with root package name */
    final x<ai> f125046a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f125047b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(82150);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishCancel() {
        this.f125047b.post(new bv(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishPause() {
        this.f125047b.post(new bt(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishResume() {
        this.f125047b.post(new bu(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onError(et etVar) {
        this.f125047b.post(new br(this, etVar));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSynthetiseSuccess(String str) {
        this.f125047b.post(new bs(this, str));
    }

    public bo(x<ai> xVar) {
        this.f125046a = xVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSuccess(ai aiVar, boolean z) {
        this.f125047b.post(new bq(this, aiVar, z));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onProgressUpdate(int i2, boolean z) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f125046a.onProgressUpdate(i2, z);
        } else {
            this.f125047b.post(new bp(this, i2, z));
        }
    }
}
