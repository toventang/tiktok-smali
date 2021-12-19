package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d implements bq {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126998a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f126999b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoPublishEditModel f127000c;

    static {
        Covode.recordClassIndex(83329);
    }

    public static int a(int i2) {
        return ((i2 + 16) - 1) & -16;
    }

    public d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        this.f127000c = videoPublishEditModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int a(boolean z) {
        if (z) {
            return this.f127000c.videoWidth();
        }
        return this.f127000c.sourceVideoWidth();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int b(boolean z) {
        if (z) {
            return this.f127000c.videoHeight();
        }
        return this.f127000c.sourceVideoHeight();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final void a(boolean z, boolean z2) {
        this.f126998a = z;
        this.f126999b = z2;
        this.f127000c.getCoverPublishModel().setNeedExpandCompiledSize(z);
        this.f127000c.mVideoCanvasWidth = a();
        this.f127000c.mVideoCanvasHeight = b();
        this.f127000c.mOutVideoWidth = c();
        this.f127000c.mOutVideoHeight = d();
    }
}
