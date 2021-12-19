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

public final class JediAdapterBuilder$viewHolder$factory$1$1 extends JediSimpleViewHolder<T> implements au {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b.c f39693f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ViewGroup f39694g;

    static {
        Covode.recordClassIndex(24457);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(T t) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JediAdapterBuilder$viewHolder$factory$1$1(b.c cVar, ViewGroup viewGroup, View view) {
        super(view);
        this.f39693f = cVar;
        this.f39694g = viewGroup;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(T t, int i2, List<Object> list) {
        this.f39693f.$onBind.invoke(this, t, Integer.valueOf(i2));
    }
}
