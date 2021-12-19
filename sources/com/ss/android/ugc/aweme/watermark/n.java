package com.ss.android.ugc.aweme.watermark;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f144804a;

    /* renamed from: b  reason: collision with root package name */
    public final String f144805b;

    /* renamed from: c  reason: collision with root package name */
    public final String f144806c;

    /* renamed from: d  reason: collision with root package name */
    public int f144807d;

    /* renamed from: e  reason: collision with root package name */
    public final int f144808e;

    /* renamed from: f  reason: collision with root package name */
    public final int f144809f;

    /* renamed from: g  reason: collision with root package name */
    public List<Integer> f144810g;

    static {
        Covode.recordClassIndex(94699);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f144804a, nVar.f144804a) && l.a(this.f144805b, nVar.f144805b) && l.a(this.f144806c, nVar.f144806c) && this.f144807d == nVar.f144807d && this.f144808e == nVar.f144808e && this.f144809f == nVar.f144809f && l.a(this.f144810g, nVar.f144810g);
    }

    public final int hashCode() {
        List<String> list = this.f144804a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f144805b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f144806c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f144807d) * 31) + this.f144808e) * 31) + this.f144809f) * 31;
        List<Integer> list2 = this.f144810g;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "VideoEndingWatermarkData(endingEffectResources=" + this.f144804a + ", endingFrame=" + this.f144805b + ", endingAudioPath=" + this.f144806c + ", inputMediaDuration=" + this.f144807d + ", endingWatermarkFadeInDuration=" + this.f144808e + ", endingWatermarkRetentionDuration=" + this.f144809f + ", originalVideoSize=" + this.f144810g + ")";
    }

    public final void a(List<Integer> list) {
        l.d(list, "");
        this.f144810g = list;
    }

    public n(List<String> list, String str, String str2, List<Integer> list2) {
        l.d(list, "");
        l.d(str, "");
        l.d(list2, "");
        this.f144804a = list;
        this.f144805b = str;
        this.f144806c = str2;
        this.f144807d = 0;
        this.f144808e = 1000;
        this.f144809f = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.f144810g = list2;
    }

    public /* synthetic */ n(List list, String str, String str2, List list2, byte b2) {
        this(list, str, str2, list2);
    }
}
