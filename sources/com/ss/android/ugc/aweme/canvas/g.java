package com.ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class g {
    static {
        Covode.recordClassIndex(42972);
    }

    public static final CanvasVideoData a(y yVar, List<String> list) {
        PhotoCanvasBackground photoCanvasBackground;
        List<String> list2 = list;
        l.d(yVar, "");
        if (yVar.f69774b.getFirst().intValue() == yVar.f69774b.getSecond().intValue()) {
            photoCanvasBackground = PhotoCanvasBackground.a.a(yVar.f69774b.getFirst().intValue());
        } else {
            int intValue = yVar.f69774b.getFirst().intValue();
            int intValue2 = yVar.f69774b.getSecond().intValue();
            photoCanvasBackground = new PhotoCanvasBackground(2);
            photoCanvasBackground.setStartColor(intValue);
            photoCanvasBackground.setEndColor(intValue2);
        }
        if (list2 == null || list2.isEmpty()) {
            list2 = n.a(yVar.f69773a);
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(n.a(yVar.f69773a), list2, photoCanvasBackground, null, 8, null);
        if (yVar.f69775c != 1.0f) {
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = new PhotoCanvasTransformFilterParam();
            photoCanvasTransformFilterParam.setScaleFactor(yVar.f69775c);
            photoCanvasTransformFilterParam.setClipIndex(0);
            canvasVideoData.putTransform(photoCanvasTransformFilterParam);
        }
        return canvasVideoData;
    }

    public static final float a(int i2, int i3, int i4, int i5, boolean z) {
        return w.a(new PointF((float) i4, (float) i5), new PointF((float) i2, (float) i3), z);
    }
}
