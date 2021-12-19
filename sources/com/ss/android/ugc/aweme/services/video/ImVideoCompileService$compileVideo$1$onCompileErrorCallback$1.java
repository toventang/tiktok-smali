package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import f.a.v;
import h.f.b.l;

final class ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1 implements r {
    final /* synthetic */ x $editor;
    final /* synthetic */ v $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    static {
        Covode.recordClassIndex(79859);
    }

    ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, x xVar, v vVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = xVar;
        this.$it = vVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        e.a("ImVideoCompileService compile error: type=" + i2 + ", ext=" + i3 + ", msg=" + str);
        if (i3 == -214) {
            e.a("ImVideoCompileService compile error fallback to soft encode");
            this.this$0.this$0.isHardCodeFallback = true;
        }
        this.$editor.j();
        ImVideoCompileService imVideoCompileService = this.this$0.this$0;
        v vVar = this.$it;
        l.b(vVar, "");
        imVideoCompileService.safeOnError(vVar, new IllegalStateException("compile error: ".concat(String.valueOf(str))));
    }
}
