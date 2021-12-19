package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class i implements d {
    static {
        Covode.recordClassIndex(104133);
    }

    @Override // dmt.av.video.b.d
    public final com.ss.android.ugc.asve.editor.i a(a aVar) {
        ROTATE_DEGREE rotate_degree;
        l.d(aVar, "");
        ROTATE_DEGREE[] rotate_degreeArr = null;
        if (aVar.getVTrimIn() == null || aVar.getVTrimOut() == null) {
            return null;
        }
        int[] rotateArray = aVar.getRotateArray();
        if (rotateArray != null) {
            int length = rotateArray.length;
            rotate_degreeArr = new ROTATE_DEGREE[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = (rotateArray[i2] + 360) % 360;
                if (i3 == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (i3 == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (i3 != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                rotate_degreeArr[i2] = rotate_degree;
            }
        }
        k kVar = new k(aVar.getVideoPaths());
        kVar.f62018a = aVar.getVTrimIn();
        kVar.f62019b = aVar.getVTrimOut();
        kVar.f62021d = aVar.getAudioPaths();
        kVar.f62024g = aVar.getSpeedArray();
        kVar.f62025h = rotate_degreeArr;
        kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
        return kVar;
    }
}
