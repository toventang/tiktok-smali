package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.asve.editor.i;
import com.ss.android.ugc.asve.editor.q;
import com.ss.android.vesdk.VEEditorModel;
import dmt.av.video.VEPreviewParams;
import h.f.b.l;

public final class h implements d {
    static {
        Covode.recordClassIndex(104132);
    }

    @Override // dmt.av.video.b.d
    public final i a(a aVar) {
        a aVar2;
        VEEditorModel vEEditorModel;
        l.d(aVar, "");
        if (aVar.getEditorHandler() <= 0) {
            return null;
        }
        if (!(aVar instanceof VEPreviewParams)) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar2;
        if (vEPreviewParams == null || (vEEditorModel = vEPreviewParams.mEditorModel) == null) {
            return null;
        }
        q qVar = new q(vEEditorModel, ((VEPreviewParams) aVar).mTimelineParams);
        com.ss.android.ugc.tools.utils.q.a("initVEEditor with editorModel");
        return qVar;
    }
}
