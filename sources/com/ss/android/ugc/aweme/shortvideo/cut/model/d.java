package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public long f125503a;

    /* renamed from: b  reason: collision with root package name */
    public long f125504b;

    /* renamed from: c  reason: collision with root package name */
    public int f125505c;

    /* renamed from: d  reason: collision with root package name */
    public float f125506d = 1.0f;

    static {
        Covode.recordClassIndex(82363);
    }

    public final void a() {
        this.f125503a = 0;
        this.f125504b = 0;
        this.f125505c = 0;
        this.f125506d = 1.0f;
    }

    public d(VideoSegment videoSegment) {
        this.f125503a = videoSegment.d();
        this.f125504b = videoSegment.e();
        this.f125505c = videoSegment.f125486j;
        this.f125506d = videoSegment.f();
        if (videoSegment.g()) {
            this.f125503a = videoSegment.n.getVideoStart();
            this.f125504b = videoSegment.n.getVideoEnd();
        }
    }

    public final void a(VideoSegment videoSegment) {
        this.f125503a = videoSegment.d();
        this.f125504b = videoSegment.e();
        this.f125505c = videoSegment.f125486j;
        this.f125506d = videoSegment.f();
        if (videoSegment.g()) {
            this.f125503a = videoSegment.n.getVideoStart();
            this.f125504b = videoSegment.n.getVideoEnd();
        }
    }
}
