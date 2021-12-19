package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int[] f126175a = new int[3];

    /* renamed from: b  reason: collision with root package name */
    public List<? extends VideoSegment> f126176b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Float> f126177c;

    /* renamed from: d  reason: collision with root package name */
    public int f126178d;

    /* renamed from: e  reason: collision with root package name */
    public p f126179e;

    static {
        Covode.recordClassIndex(82833);
    }

    public final f a() {
        return new f(this.f126175a, this.f126176b, this.f126177c, this.f126178d, this.f126179e);
    }

    public final g a(int[] iArr) {
        l.d(iArr, "");
        this.f126175a = iArr;
        return this;
    }
}
