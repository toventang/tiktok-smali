package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mvtheme.d;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f127842a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127843b;

    static {
        Covode.recordClassIndex(83802);
    }

    public final EditPreviewInfo a(d dVar) {
        l.d(dVar, "");
        return new h(this.f127842a, this.f127843b, null, 28).a(new EditVideoSegment(dVar.contactVideoPath.toString(), null, new VideoFileInfo(this.f127842a, this.f127843b, 0, 30, 0, 0, 0, 0, 240, null), 2, null));
    }

    public f(int i2, int i3) {
        this.f127842a = i2;
        this.f127843b = i3;
    }
}
