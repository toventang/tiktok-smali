package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.c;
import dmt.av.video.f;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f132107a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishEditModel f132108b;

    static {
        Covode.recordClassIndex(86532);
    }

    d(c.AnonymousClass1 r1, VideoPublishEditModel videoPublishEditModel) {
        this.f132107a = r1;
        this.f132108b = videoPublishEditModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.a(this.f132108b, c.this);
    }
}
