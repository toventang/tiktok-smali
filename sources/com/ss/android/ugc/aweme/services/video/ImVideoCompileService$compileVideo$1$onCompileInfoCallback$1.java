package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import f.a.v;
import h.f.b.l;

final class ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 implements r {
    final /* synthetic */ x $editor;
    final /* synthetic */ v $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    static {
        Covode.recordClassIndex(79860);
    }

    ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, x xVar, v vVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = xVar;
        this.$it = vVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        if (i2 == 4103) {
            this.$editor.j();
            StringBuilder sb = new StringBuilder("ImVideoCompileService compile success: ");
            v vVar = this.$it;
            l.b(vVar, "");
            e.a(sb.append(vVar.isDisposed()).toString());
            ImVideoCompileService imVideoCompileService = this.this$0.this$0;
            v vVar2 = this.$it;
            l.b(vVar2, "");
            imVideoCompileService.safeOnSingleNext(vVar2, true);
        }
    }
}
