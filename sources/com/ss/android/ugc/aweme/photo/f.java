package com.ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import dmt.av.video.SingleImageCoverBitmapData;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final u f114858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114859b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f114860c = false;

    /* renamed from: d  reason: collision with root package name */
    public final MediaModel f114861d;

    /* renamed from: e  reason: collision with root package name */
    public final SingleImageCoverBitmapData f114862e;

    /* renamed from: f  reason: collision with root package name */
    public final CanvasVideoData f114863f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f114864g;

    /* renamed from: h  reason: collision with root package name */
    public final b<Boolean, z> f114865h;

    static {
        Covode.recordClassIndex(73886);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f114858a, fVar.f114858a) && l.a(this.f114859b, fVar.f114859b) && this.f114860c == fVar.f114860c && l.a(this.f114861d, fVar.f114861d) && l.a(this.f114862e, fVar.f114862e) && l.a(this.f114863f, fVar.f114863f) && this.f114864g == fVar.f114864g && l.a(this.f114865h, fVar.f114865h);
    }

    public final int hashCode() {
        u uVar = this.f114858a;
        int i2 = 0;
        int hashCode = (uVar != null ? uVar.hashCode() : 0) * 31;
        String str = this.f114859b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f114860c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        MediaModel mediaModel = this.f114861d;
        int hashCode3 = (i7 + (mediaModel != null ? mediaModel.hashCode() : 0)) * 31;
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.f114862e;
        int hashCode4 = (hashCode3 + (singleImageCoverBitmapData != null ? singleImageCoverBitmapData.hashCode() : 0)) * 31;
        CanvasVideoData canvasVideoData = this.f114863f;
        int hashCode5 = (hashCode4 + (canvasVideoData != null ? canvasVideoData.hashCode() : 0)) * 31;
        if (!this.f114864g) {
            i3 = 0;
        }
        int i8 = (hashCode5 + i3) * 31;
        b<Boolean, z> bVar = this.f114865h;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i8 + i2;
    }

    public final String toString() {
        return "PhotoCanvasEnterEditParam(coreParam=" + this.f114858a + ", filePath=" + this.f114859b + ", needWaitMusic=" + this.f114860c + ", mediaModel=" + this.f114861d + ", singleImageCoverBitmapData=" + this.f114862e + ", canvasVideoData=" + this.f114863f + ", isFromUpload=" + this.f114864g + ", finishListener=" + this.f114865h + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(u uVar, String str, MediaModel mediaModel, SingleImageCoverBitmapData singleImageCoverBitmapData, CanvasVideoData canvasVideoData, boolean z, b<? super Boolean, z> bVar) {
        l.d(uVar, "");
        l.d(str, "");
        l.d(canvasVideoData, "");
        this.f114858a = uVar;
        this.f114859b = str;
        this.f114861d = mediaModel;
        this.f114862e = singleImageCoverBitmapData;
        this.f114863f = canvasVideoData;
        this.f114864g = z;
        this.f114865h = bVar;
    }
}
