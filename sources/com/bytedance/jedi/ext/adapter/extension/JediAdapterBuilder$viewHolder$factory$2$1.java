package com.bytedance.jedi.ext.adapter.extension;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.extension.b;
import com.ss.android.ugc.aweme.au;
import java.util.List;

public final class JediAdapterBuilder$viewHolder$factory$2$1 extends JediSimpleViewHolder<T> implements au {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b.d f39695f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ViewGroup f39696g;

    static {
        Covode.recordClassIndex(24458);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(T t) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JediAdapterBuilder$viewHolder$factory$2$1(b.d dVar, ViewGroup viewGroup, View view) {
        super(view);
        this.f39695f = dVar;
        this.f39696g = viewGroup;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(T t, int i2, List<Object> list) {
        this.f39695f.$onBind.a(this, t, Integer.valueOf(i2), list);
    }
}
