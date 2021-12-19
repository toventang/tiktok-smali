package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.shortvideo.cut.u;
import com.ss.android.vesdk.VEUtils;
import f.a.v;
import f.a.w;
import h.f.b.l;

final class ImVideoCompileService$getVideoWidthHeight$1<T> implements w {
    final /* synthetic */ IAVProcessService.CompileParam $compileParam;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(79863);
    }

    ImVideoCompileService$getVideoWidthHeight$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileParam compileParam) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.w
    public final void subscribe(v<Boolean> vVar) {
        l.d(vVar, "");
        if (this.$compileParam.getVideoWidth() <= 0 || this.$compileParam.getVideoHeight() <= 0) {
            AVExternalServiceImpl.a();
            int[] iArr = new int[11];
            VEUtils.VEVideoFileInfo a2 = u.a(this.$compileParam.getRawVideoPath());
            if (a2 != null) {
                iArr[0] = a2.width;
                iArr[1] = a2.height;
                iArr[2] = a2.rotation;
                iArr[3] = a2.rotation;
                iArr[4] = 0;
                iArr[5] = 0;
                iArr[6] = a2.bitrate;
                iArr[7] = a2.fps;
                iArr[8] = a2.codec;
                iArr[9] = a2.keyFrameCount;
                iArr[10] = a2.maxDuration;
            }
            this.$compileParam.setVideoWidth(iArr[0]);
            this.$compileParam.setVideoHeight(iArr[1]);
            e.a("ImVideoCompileService resize compileParam success: " + this.$compileParam.getVideoWidth() + ", " + this.$compileParam.getVideoHeight());
        }
        this.this$0.safeOnSingleNext(vVar, true);
    }
}
