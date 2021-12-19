package com.bytedance.jedi.ext.adapter;

import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ar;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.List;

public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder<JediSimpleViewHolder<ITEM>, ITEM> implements ar<ad.b>, au {

    /* renamed from: f  reason: collision with root package name */
    private final ad.b f39561f = g.f39708a;

    static {
        Covode.recordClassIndex(24362);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ITEM item);

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.arch.ar
    public final ad.b d() {
        return this.f39561f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediSimpleViewHolder(View view) {
        super(view);
        l.c(view, "");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void a(List<Object> list) {
        a(aI_(), this.f39676i, list);
    }

    public void a(ITEM item, int i2, List<Object> list) {
        a((Object) item);
    }
}
