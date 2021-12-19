package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import f.a.v;
import f.a.w;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class ImVideoCompileService$compileImVideo$1<T> implements w {
    final /* synthetic */ IAVProcessService.CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(79857);
    }

    ImVideoCompileService$compileImVideo$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.w
    public final void subscribe(v<IAVProcessService.CompileResult> vVar) {
        l.d(vVar, "");
        this.this$0.safeOnSingleNext(vVar, this.$result);
    }
}
