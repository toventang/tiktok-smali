package com.bytedance.jedi.ext.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

final class JediInvisibleViewHolder extends JediSimpleViewHolder<Object> implements au {
    static {
        Covode.recordClassIndex(24361);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(Object obj) {
        l.c(obj, "");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediInvisibleViewHolder(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        l.c(viewGroup, "");
        MethodCollector.i(5246);
        MethodCollector.o(5246);
    }
}
