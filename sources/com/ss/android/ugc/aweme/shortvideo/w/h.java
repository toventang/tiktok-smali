package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.tools.i;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class h {
    static {
        Covode.recordClassIndex(86860);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<Integer, z> {
        final /* synthetic */ ASCameraView $cameraView;

        static {
            Covode.recordClassIndex(86861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ASCameraView aSCameraView) {
            super(1);
            this.$cameraView = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            num.intValue();
            this.$cameraView.e(true);
            return z.f158842a;
        }
    }

    public static final void a(CameraComponentModel cameraComponentModel, ASCameraView aSCameraView, boolean z, i iVar, long j2, g.b bVar, b<? super Integer, z> bVar2) {
        l.d(cameraComponentModel, "");
        l.d(aSCameraView, "");
        l.d(iVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        if (cameraComponentModel.u == 1) {
            aSCameraView.a(new a(aSCameraView));
        }
        j jVar = bVar.f132695b;
        float f2 = jVar.f132745b;
        int i2 = jVar.f132746c;
        int i3 = jVar.f132747d;
        if (!cameraComponentModel.b() && !cameraComponentModel.c()) {
            aSCameraView.setRecordMaxDuration(j2);
        }
        if (cameraComponentModel.F) {
            l.b(cameraComponentModel.f124713h, "");
            l.b(null, "");
            throw new NullPointerException("getAbsolutePath");
        }
        aSCameraView.a((double) iVar.value(), !z, f2, i2, i3, bVar2);
    }
}
