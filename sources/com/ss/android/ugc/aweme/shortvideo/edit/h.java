package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.shortvideo.dg;
import h.f.b.l;

public final class h extends d {

    /* renamed from: c  reason: collision with root package name */
    public final VideoPublishEditModel f127063c;

    /* renamed from: d  reason: collision with root package name */
    private int f127064d;

    /* renamed from: e  reason: collision with root package name */
    private int f127065e;

    static {
        Covode.recordClassIndex(83373);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int a() {
        if (this.f127064d == 0) {
            e();
        }
        return this.f127064d;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int b() {
        if (this.f127065e == 0) {
            e();
        }
        return this.f127065e;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int c() {
        if (this.f126998a) {
            return a();
        }
        return this.f127063c.videoWidth();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int d() {
        if (this.f126998a) {
            return b();
        }
        return this.f127063c.videoHeight();
    }

    private final void e() {
        int i2;
        int a2;
        int ceil;
        int videoWidth;
        int videoHeight;
        if (this.f127063c.isPhotoMvMode) {
            this.f127064d = this.f127063c.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getWidth();
            ceil = this.f127063c.getPreviewInfo().getVideoList().get(0).getVideoFileInfo().getHeight();
        } else if (!this.f127063c.mIsFromDraft || !this.f127063c.hasStickers()) {
            boolean a3 = dg.a(this.f127063c.videoWidth(), this.f127063c.videoHeight());
            if (a3) {
                a2 = this.f127063c.videoWidth();
            } else {
                int[] h2 = b.h();
                if (h2 != null) {
                    i2 = h2[0];
                } else {
                    i2 = 720;
                }
                a2 = a(h.j.h.c(this.f127063c.videoWidth(), i2));
            }
            this.f127064d = a2;
            if (a3) {
                ceil = this.f127063c.videoHeight();
            } else {
                double d2 = (double) a2;
                Double.isNaN(d2);
                ceil = (int) (Math.ceil(d2 / 9.0d) * 16.0d);
            }
        } else {
            if (this.f127063c.mVideoCanvasWidth > 0) {
                videoWidth = this.f127063c.mVideoCanvasWidth;
            } else {
                videoWidth = this.f127063c.videoWidth();
            }
            this.f127064d = videoWidth;
            if (this.f127063c.mVideoCanvasHeight > 0) {
                videoHeight = this.f127063c.mVideoCanvasHeight;
            } else {
                videoHeight = this.f127063c.videoHeight();
            }
            this.f127065e = videoHeight;
            return;
        }
        this.f127065e = ceil;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        l.d(videoPublishEditModel, "");
        this.f127063c = videoPublishEditModel;
    }
}
