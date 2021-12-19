package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import h.j.h;

public final class q extends d {

    /* renamed from: c  reason: collision with root package name */
    public int f128029c;

    /* renamed from: d  reason: collision with root package name */
    public int f128030d;

    /* renamed from: e  reason: collision with root package name */
    public final VideoPublishEditModel f128031e;

    /* renamed from: f  reason: collision with root package name */
    private int f128032f;

    /* renamed from: g  reason: collision with root package name */
    private int f128033g;

    static {
        Covode.recordClassIndex(83906);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int a() {
        e();
        return this.f128032f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int b() {
        e();
        return this.f128033g;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int c() {
        e();
        if (this.f126998a) {
            return this.f128032f;
        }
        return this.f128029c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int d() {
        e();
        if (this.f126998a) {
            return this.f128033g;
        }
        return this.f128030d;
    }

    private void e() {
        int i2;
        int a2;
        int ceil;
        int videoWidth;
        int videoHeight;
        if (this.f126999b) {
            this.f128029c = 0;
            this.f128032f = 0;
            this.f126999b = false;
        }
        if (this.f128029c == 0 || this.f128030d == 0) {
            if (!this.f128031e.isFastImport) {
                this.f128029c = this.f128031e.videoWidth();
                this.f128030d = this.f128031e.videoHeight();
            } else {
                VESize calcTargetRes = VEUtils.calcTargetRes(new int[]{a(true)}, new int[]{b(true)}, new ROTATE_DEGREE[]{ROTATE_DEGREE.ROTATE_NONE}, this.f128031e.getPreviewInfo().getPreviewWidth());
                this.f128029c = calcTargetRes.width;
                this.f128030d = calcTargetRes.height;
            }
        }
        if (this.f128032f != 0 && this.f128033g != 0) {
            return;
        }
        if (!this.f128031e.mIsFromDraft || !this.f128031e.hasStickers()) {
            boolean a3 = dg.a(this.f128031e.videoWidth(), this.f128031e.videoHeight());
            if (a3) {
                a2 = this.f128031e.videoWidth();
            } else {
                int[] h2 = b.h();
                if (h2 != null) {
                    i2 = h2[0];
                } else {
                    i2 = 720;
                }
                a2 = a(h.c(this.f128031e.videoWidth(), i2));
            }
            this.f128032f = a2;
            if (a3) {
                ceil = this.f128031e.videoHeight();
            } else {
                double d2 = (double) a2;
                Double.isNaN(d2);
                ceil = (int) (Math.ceil(d2 / 9.0d) * 16.0d);
            }
            this.f128033g = ceil;
            return;
        }
        if (this.f128031e.mVideoCanvasWidth > 0) {
            videoWidth = this.f128031e.mVideoCanvasWidth;
        } else {
            videoWidth = this.f128031e.videoWidth();
        }
        this.f128032f = videoWidth;
        if (this.f128031e.mVideoCanvasHeight > 0) {
            videoHeight = this.f128031e.mVideoCanvasHeight;
        } else {
            videoHeight = this.f128031e.videoHeight();
        }
        this.f128033g = videoHeight;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        l.d(videoPublishEditModel, "");
        this.f128031e = videoPublishEditModel;
    }
}
