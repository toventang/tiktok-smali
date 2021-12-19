package dmt.av.video.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.x;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.VEPreviewParams;
import dmt.av.video.h;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

public final class a extends j {
    static {
        Covode.recordClassIndex(104123);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r1 = com.ss.android.ugc.aweme.cw.g.d()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.a.<init>(dmt.av.video.b.s):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(s sVar, ScheduledExecutorService scheduledExecutorService) {
        super(sVar, scheduledExecutorService);
        l.d(sVar, "");
        l.d(scheduledExecutorService, "");
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, com.bytedance.creativex.editor.preview.a aVar, SurfaceView surfaceView, m mVar) {
        VEPreviewParams vEPreviewParams;
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        PhotoCanvasBackground photoCanvasBackground;
        List<String> list;
        Bitmap b2;
        l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        g c2 = c();
        if (c2 == null || !(aVar instanceof VEPreviewParams) || (canvasVideoData = (vEPreviewParams = (VEPreviewParams) aVar).canvasVideoPreviewData) == null || (sourceInfo = canvasVideoData.getSourceInfo()) == null || sourceInfo.isEmpty()) {
            return -1;
        }
        CanvasVideoData canvasVideoData2 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData2 == null) {
            l.b();
        }
        ArrayList arrayList = new ArrayList();
        CanvasVideoData canvasVideoData3 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData3 == null || (photoCanvasBackground = canvasVideoData3.getBackground()) == null) {
            photoCanvasBackground = PhotoCanvasBackground.a.a(-16777216);
        }
        String[] videoPaths = vEPreviewParams.getVideoPaths();
        l.b(videoPaths, "");
        int length = videoPaths.length;
        for (int i2 = 0; i2 < length; i2++) {
            VECanvasFilterParam vECanvasFilterParam = new VECanvasFilterParam();
            int type = photoCanvasBackground.getType();
            if (type == 2) {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.a.GRADIENT_COLOR.ordinal();
                vECanvasFilterParam.gradientTopColor = photoCanvasBackground.getStartColor();
                vECanvasFilterParam.gradientBottomColor = photoCanvasBackground.getEndColor();
            } else if (type != 3) {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.a.COLOR.ordinal();
                vECanvasFilterParam.color = photoCanvasBackground.getStartColor();
            } else {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.a.IMAGE.ordinal();
                vECanvasFilterParam.imagePath = photoCanvasBackground.getFilePath();
            }
            vECanvasFilterParam.enableAntialiasing = true;
            vECanvasFilterParam.width = vEPreviewParams.getCanvasWidth();
            vECanvasFilterParam.height = vEPreviewParams.getCanvasHeight();
            arrayList.add(vECanvasFilterParam);
        }
        CanvasVideoData canvasVideoData4 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData4 == null || (list = canvasVideoData4.getSourceInfo()) == null) {
            list = z.INSTANCE;
        }
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int[] vTrimOut = vEPreviewParams.getVTrimOut();
        l.b(vTrimOut, "");
        int[] vTrimIn = vEPreviewParams.getVTrimIn();
        l.b(vTrimIn, "");
        float[] speedArray = vEPreviewParams.getSpeedArray();
        l.b(speedArray, "");
        Object[] array2 = arrayList.toArray(new VECanvasFilterParam[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        int a2 = c2.a(new com.ss.android.ugc.asve.editor.m((String[]) array, vTrimIn, vTrimOut, speedArray, (VECanvasFilterParam[]) array2, x.l.VIDEO_OUT_RATIO_ORIGINAL, x.k.CENTER_IN_PARENT, x.m.CENTER));
        if (a2 != 0) {
            return a2;
        }
        if (vEPreviewParams.singleImageCoverBitmapData != null) {
            x.c(4194432);
        }
        an.a("VEEditor", "setEnableEffectCanvas: true");
        TEInterface.setEnableEffectCanvas(true);
        c2.p();
        if (!h.a(vEPreviewParams.singleImageCoverBitmapData)) {
            SingleImageCoverBitmapData singleImageCoverBitmapData = vEPreviewParams.singleImageCoverBitmapData;
            l.d(c2, "");
            if (!(singleImageCoverBitmapData == null || singleImageCoverBitmapData.getItemCoverWidth() <= 0 || (b2 = h.b(singleImageCoverBitmapData)) == null)) {
                c2.a(b2);
            }
        }
        c2.o();
        c2.K();
        if (!arrayList.isEmpty()) {
            int a3 = c2.a(0, 0, (VEBaseFilterParam) n.g((List) arrayList));
            CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(context);
            if (canvasVideoEditorTrackViewModel != null) {
                canvasVideoEditorTrackViewModel.filterIndex = a3;
            }
            List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData2.getTransformInfo();
            if (transformInfo != null) {
                for (T t : transformInfo) {
                    if (t.isValid()) {
                        int clipIndex = t.getClipIndex();
                        l.d(t, "");
                        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
                        vEVideoTransformFilterParam.scaleFactor = t.getScaleFactor();
                        vEVideoTransformFilterParam.transX = t.getTransX();
                        vEVideoTransformFilterParam.transY = t.getTransY();
                        vEVideoTransformFilterParam.degree = t.getDegree();
                        c2.b(clipIndex, a3, vEVideoTransformFilterParam);
                    }
                }
            }
        }
        return a2;
    }
}
