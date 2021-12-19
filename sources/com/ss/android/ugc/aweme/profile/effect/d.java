package com.ss.android.ugc.aweme.profile.effect;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.base.arch.e;
import com.ss.android.ugc.aweme.sticker.model.g;
import h.f.b.l;

public final class d extends e<g> {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f116306d;

    static {
        Covode.recordClassIndex(75087);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.e
    public final JediViewHolder<? extends com.bytedance.jedi.arch.g, g> a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new EffectProfileViewHolder(viewGroup, this.f116306d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(m mVar, boolean z) {
        super(mVar, new a(), (e.b) null);
        l.d(mVar, "");
        this.f116306d = z;
    }

    public /* synthetic */ d(m mVar, boolean z, byte b2) {
        this(mVar, z);
    }
}
