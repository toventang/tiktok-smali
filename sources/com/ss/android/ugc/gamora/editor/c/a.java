package com.ss.android.ugc.gamora.editor.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final VideoPublishEditModel f145702a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f145703b;

    /* renamed from: c  reason: collision with root package name */
    public final int f145704c;

    /* renamed from: d  reason: collision with root package name */
    public final c f145705d;

    static {
        Covode.recordClassIndex(95720);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f145702a, aVar.f145702a) && this.f145703b == aVar.f145703b && this.f145704c == aVar.f145704c && l.a(this.f145705d, aVar.f145705d);
    }

    public final int hashCode() {
        VideoPublishEditModel videoPublishEditModel = this.f145702a;
        int i2 = 0;
        int hashCode = (videoPublishEditModel != null ? videoPublishEditModel.hashCode() : 0) * 31;
        boolean z = this.f145703b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((hashCode + i3) * 31) + this.f145704c) * 31;
        c cVar = this.f145705d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EditActivityData(videoPublishEditModel=" + this.f145702a + ", mIsFromSysShare=" + this.f145703b + ", draftToEditFrom=" + this.f145704c + ", mOldMusicModel=" + this.f145705d + ")";
    }

    public a(VideoPublishEditModel videoPublishEditModel, boolean z, int i2, c cVar) {
        l.d(videoPublishEditModel, "");
        this.f145702a = videoPublishEditModel;
        this.f145703b = z;
        this.f145704c = i2;
        this.f145705d = cVar;
    }
}
