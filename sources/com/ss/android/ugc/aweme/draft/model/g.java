package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class g {
    @c(a = "preview_width")

    /* renamed from: a  reason: collision with root package name */
    public int f83206a;
    @c(a = "preview_height")

    /* renamed from: b  reason: collision with root package name */
    public int f83207b;
    @c(a = "video_segment_list")

    /* renamed from: c  reason: collision with root package name */
    public List<DraftVideoSegment> f83208c;
    @c(a = "volume")

    /* renamed from: d  reason: collision with root package name */
    public float f83209d;
    @c(a = "fps")

    /* renamed from: e  reason: collision with root package name */
    public int f83210e;
    @c(a = "scene_in")

    /* renamed from: f  reason: collision with root package name */
    public int f83211f;
    @c(a = "scene_out")

    /* renamed from: g  reason: collision with root package name */
    public int f83212g;
    @c(a = "draftDir")

    /* renamed from: h  reason: collision with root package name */
    public String f83213h;

    static {
        Covode.recordClassIndex(51879);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f83206a == gVar.f83206a && this.f83207b == gVar.f83207b && l.a(this.f83208c, gVar.f83208c) && Float.compare(this.f83209d, gVar.f83209d) == 0 && this.f83210e == gVar.f83210e && this.f83211f == gVar.f83211f && this.f83212g == gVar.f83212g && l.a(this.f83213h, gVar.f83213h);
    }

    public final String toString() {
        return "DraftPreviewConfigure(previewWidth=" + this.f83206a + ", previewHeight=" + this.f83207b + ", videoSegments=" + this.f83208c + ", mVolume=" + this.f83209d + ", mFps=" + this.f83210e + ", sceneIn=" + this.f83211f + ", sceneOut=" + this.f83212g + ", draftDir=" + this.f83213h + ")";
    }

    private /* synthetic */ g() {
        this(z.INSTANCE);
    }

    public final int hashCode() {
        int i2;
        int i3 = ((this.f83206a * 31) + this.f83207b) * 31;
        List<DraftVideoSegment> list = this.f83208c;
        int i4 = 0;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int floatToIntBits = (((((((((i3 + i2) * 31) + Float.floatToIntBits(this.f83209d)) * 31) + this.f83210e) * 31) + this.f83211f) * 31) + this.f83212g) * 31;
        String str = this.f83213h;
        if (str != null) {
            i4 = str.hashCode();
        }
        return floatToIntBits + i4;
    }

    public final void a(List<DraftVideoSegment> list) {
        l.d(list, "");
        this.f83208c = list;
    }

    private g(List<DraftVideoSegment> list) {
        l.d(list, "");
        this.f83206a = 576;
        this.f83207b = 1024;
        this.f83208c = list;
        this.f83209d = 0.0f;
        this.f83210e = -1;
        this.f83211f = 0;
        this.f83212g = 0;
        this.f83213h = null;
    }
}
