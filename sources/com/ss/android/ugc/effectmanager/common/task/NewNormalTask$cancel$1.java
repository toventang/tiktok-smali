package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.m;
import h.z;

final class NewNormalTask$cancel$1 extends m implements a<z> {
    final /* synthetic */ NewNormalTask this$0;

    static {
        Covode.recordClassIndex(95320);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewNormalTask$cancel$1(NewNormalTask newNormalTask) {
        super(0);
        this.this$0 = newNormalTask;
    }

    @Override // h.f.a.a
    public final void invoke() {
        this.this$0.onCancel();
        this.this$0.setBaseListener(null);
    }
}
