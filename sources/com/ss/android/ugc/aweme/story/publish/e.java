package com.ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public float f138106a;

    /* renamed from: b  reason: collision with root package name */
    public i f138107b;

    /* renamed from: c  reason: collision with root package name */
    public String f138108c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f138109d;

    /* renamed from: e  reason: collision with root package name */
    public k f138110e;

    static {
        Covode.recordClassIndex(90319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f138106a, eVar.f138106a) == 0 && l.a(this.f138107b, eVar.f138107b) && l.a(this.f138108c, eVar.f138108c) && l.a(this.f138109d, eVar.f138109d) && l.a(this.f138110e, eVar.f138110e);
    }

    public final String toString() {
        return "StoryPublishData(progress=" + this.f138106a + ", status=" + this.f138107b + ", failReason=" + this.f138108c + ", aweme=" + this.f138109d + ", callback=" + this.f138110e + ")";
    }

    public /* synthetic */ e() {
        this(i.UPLOADING, "");
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int floatToIntBits = Float.floatToIntBits(this.f138106a) * 31;
        i iVar = this.f138107b;
        int i5 = 0;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (floatToIntBits + i2) * 31;
        String str = this.f138108c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Aweme aweme = this.f138109d;
        if (aweme != null) {
            i4 = aweme.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        k kVar = this.f138110e;
        if (kVar != null) {
            i5 = kVar.hashCode();
        }
        return i8 + i5;
    }

    public final void a(i iVar) {
        l.d(iVar, "");
        this.f138107b = iVar;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f138108c = str;
    }

    private e(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        this.f138106a = 0.0f;
        this.f138107b = iVar;
        this.f138108c = str;
        this.f138109d = null;
        this.f138110e = null;
    }
}
