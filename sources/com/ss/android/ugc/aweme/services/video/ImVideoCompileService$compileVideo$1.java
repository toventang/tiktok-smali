package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.x;
import com.ss.android.vesdk.z;
import f.a.v;
import f.a.w;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class ImVideoCompileService$compileVideo$1<T> implements w {
    final /* synthetic */ IAVProcessService.CompileParam $compileParam;
    final /* synthetic */ IAVProcessService.CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(79858);
    }

    ImVideoCompileService$compileVideo$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileParam compileParam, IAVProcessService.CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
        this.$result = compileResult;
    }

    public static int com_ss_android_ugc_aweme_services_video_ImVideoCompileService$compileVideo$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // f.a.w
    public final void subscribe(v<Boolean> vVar) {
        l.d(vVar, "");
        x createVEEditor = this.this$0.createVEEditor();
        ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1 imVideoCompileService$compileVideo$1$onCompileErrorCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(this, createVEEditor, vVar);
        ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 imVideoCompileService$compileVideo$1$onCompileInfoCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(this, createVEEditor, vVar);
        try {
            int initVEEditor = this.this$0.initVEEditor(createVEEditor, this.$compileParam.getRawVideoPath());
            if (initVEEditor != 0) {
                e.a("ImVideoCompileService VEEditor init error: ".concat(String.valueOf(initVEEditor)));
                this.this$0.safeOnError(vVar, new IllegalStateException("VEEditor init error: ".concat(String.valueOf(initVEEditor))));
                return;
            }
            createVEEditor.a(imVideoCompileService$compileVideo$1$onCompileErrorCallback$1);
            createVEEditor.b(imVideoCompileService$compileVideo$1$onCompileInfoCallback$1);
            VEVideoEncodeSettings createEncodeSettings = this.this$0.createEncodeSettings(this.$compileParam);
            VESize videoRes = createEncodeSettings.getVideoRes();
            this.$result.setVideoWidth(videoRes.width);
            this.$result.setVideoHeight(videoRes.height);
            this.$result.setVideoPath(this.this$0.getOutputVideoFilePath());
            com_ss_android_ugc_aweme_services_video_ImVideoCompileService$compileVideo$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("ImVideoCompileService", "compileVideo: settings=".concat(String.valueOf(createEncodeSettings)));
            createVEEditor.a(this.$result.getVideoPath(), (String) null, createEncodeSettings);
        } catch (z e2) {
            e.a((Throwable) e2);
            this.this$0.safeOnError(vVar, new IllegalStateException("VEEditor init error", e2));
        }
    }
}
