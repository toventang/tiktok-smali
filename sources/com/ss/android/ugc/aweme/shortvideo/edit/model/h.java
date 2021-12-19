package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f127844a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127845b;

    /* renamed from: c  reason: collision with root package name */
    private final long f127846c;

    /* renamed from: d  reason: collision with root package name */
    private final long f127847d;

    /* renamed from: e  reason: collision with root package name */
    private final String f127848e;

    static {
        Covode.recordClassIndex(83804);
    }

    public h() {
        this(0, 0, null, 31);
    }

    public final EditPreviewInfo a(EditVideoSegment editVideoSegment) {
        l.d(editVideoSegment, "");
        List c2 = n.c(editVideoSegment);
        int i2 = this.f127844a;
        int i3 = this.f127845b;
        long j2 = this.f127846c;
        long j3 = this.f127847d;
        String str = this.f127848e;
        if (str == null) {
            str = b.a();
        }
        return new EditPreviewInfo(c2, i2, i3, j2, j3, str);
    }

    private h(int i2, int i3, String str) {
        this.f127844a = i2;
        this.f127845b = i3;
        this.f127846c = 0;
        this.f127847d = 0;
        this.f127848e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2, int i3, String str, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : str);
    }
}
