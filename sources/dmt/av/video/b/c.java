package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.asve.editor.i;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class c implements d {
    static {
        Covode.recordClassIndex(104126);
    }

    @Override // dmt.av.video.b.d
    public final i a(a aVar) {
        l.d(aVar, "");
        String[] videoPaths = aVar.getVideoPaths();
        if (videoPaths == null) {
            videoPaths = new String[0];
        }
        k kVar = new k(videoPaths);
        kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
        kVar.f62021d = aVar.getAudioPaths();
        return kVar;
    }
}
