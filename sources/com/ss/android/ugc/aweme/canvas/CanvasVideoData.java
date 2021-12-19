package com.ss.android.ugc.aweme.canvas;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CanvasVideoData implements Serializable {
    private List<PhotoCanvasTransformFilterParam> _transformInfo;
    private final List<String> auditFrames;
    private final PhotoCanvasBackground background;
    private k extra;
    private List<String> sourceInfo;

    static {
        Covode.recordClassIndex(42945);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.canvas.CanvasVideoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanvasVideoData copy$default(CanvasVideoData canvasVideoData, List list, List list2, PhotoCanvasBackground photoCanvasBackground, k kVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = canvasVideoData.sourceInfo;
        }
        if ((i2 & 2) != 0) {
            list2 = canvasVideoData.auditFrames;
        }
        if ((i2 & 4) != 0) {
            photoCanvasBackground = canvasVideoData.background;
        }
        if ((i2 & 8) != 0) {
            kVar = canvasVideoData.extra;
        }
        return canvasVideoData.copy(list, list2, photoCanvasBackground, kVar);
    }

    public final List<String> component1() {
        return this.sourceInfo;
    }

    public final List<String> component2() {
        return this.auditFrames;
    }

    public final PhotoCanvasBackground component3() {
        return this.background;
    }

    public final k component4() {
        return this.extra;
    }

    public final CanvasVideoData copy(List<String> list, List<String> list2, PhotoCanvasBackground photoCanvasBackground, k kVar) {
        return new CanvasVideoData(list, list2, photoCanvasBackground, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasVideoData)) {
            return false;
        }
        CanvasVideoData canvasVideoData = (CanvasVideoData) obj;
        return l.a(this.sourceInfo, canvasVideoData.sourceInfo) && l.a(this.auditFrames, canvasVideoData.auditFrames) && l.a(this.background, canvasVideoData.background) && l.a(this.extra, canvasVideoData.extra);
    }

    public final int hashCode() {
        List<String> list = this.sourceInfo;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.auditFrames;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        PhotoCanvasBackground photoCanvasBackground = this.background;
        int hashCode3 = (hashCode2 + (photoCanvasBackground != null ? photoCanvasBackground.hashCode() : 0)) * 31;
        k kVar = this.extra;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "CanvasVideoData(sourceInfo=" + this.sourceInfo + ", auditFrames=" + this.auditFrames + ", background=" + this.background + ", extra=" + this.extra + ")";
    }

    public final List<String> getAuditFrames() {
        return this.auditFrames;
    }

    public final PhotoCanvasBackground getBackground() {
        return this.background;
    }

    public final k getExtra() {
        return this.extra;
    }

    public final List<String> getSourceInfo() {
        return this.sourceInfo;
    }

    public final List<PhotoCanvasTransformFilterParam> getTransformInfo() {
        return this._transformInfo;
    }

    public final void setExtra(k kVar) {
        this.extra = kVar;
    }

    public final void setSourceInfo(List<String> list) {
        this.sourceInfo = list;
    }

    public final void putTransform(PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam) {
        if (photoCanvasTransformFilterParam != null) {
            if (this._transformInfo == null) {
                this._transformInfo = new ArrayList();
            }
            List<PhotoCanvasTransformFilterParam> list = this._transformInfo;
            if (list != null) {
                list.add(photoCanvasTransformFilterParam);
            }
        }
    }

    public final PhotoCanvasTransformFilterParam getClipTransform(int i2) {
        List<PhotoCanvasTransformFilterParam> transformInfo = getTransformInfo();
        T t = null;
        if (transformInfo == null) {
            return null;
        }
        Iterator<T> it = transformInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getClipIndex() == i2) {
                t = next;
                break;
            }
        }
        return t;
    }

    public CanvasVideoData(List<String> list, List<String> list2, PhotoCanvasBackground photoCanvasBackground, k kVar) {
        this.sourceInfo = list;
        this.auditFrames = list2;
        this.background = photoCanvasBackground;
        this.extra = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CanvasVideoData(List list, List list2, PhotoCanvasBackground photoCanvasBackground, k kVar, int i2, g gVar) {
        this(list, list2, photoCanvasBackground, (i2 & 8) != 0 ? null : kVar);
    }
}
