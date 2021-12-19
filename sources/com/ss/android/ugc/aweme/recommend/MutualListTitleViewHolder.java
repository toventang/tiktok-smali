package com.ss.android.ugc.aweme.recommend;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.following.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MutualListTitleViewHolder extends JediSimpleViewHolder<f> implements au {

    /* renamed from: f  reason: collision with root package name */
    private final TextView f120030f;

    static {
        Covode.recordClassIndex(78005);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        this.f120030f.setText(fVar2.f96341b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutualListTitleViewHolder(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f9o);
        l.b(findViewById, "");
        this.f120030f = (TextView) findViewById;
    }
}
