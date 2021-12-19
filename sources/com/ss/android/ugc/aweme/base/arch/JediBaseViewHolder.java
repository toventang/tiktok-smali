package com.ss.android.ugc.aweme.base.arch;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public abstract class JediBaseViewHolder<R extends g, ITEM> extends JediViewHolder<R, ITEM> implements ar<i>, au {

    /* renamed from: f  reason: collision with root package name */
    public i f67981f = new i();

    static {
        Covode.recordClassIndex(41862);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f67981f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediBaseViewHolder(View view) {
        super(view);
        l.d(view, "");
    }
}
