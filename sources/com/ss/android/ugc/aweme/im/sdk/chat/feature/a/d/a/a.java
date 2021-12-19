package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a extends b<b, com.ss.android.ugc.aweme.emoji.g.a> {

    /* renamed from: a  reason: collision with root package name */
    public m<? super View, ? super Integer, z> f100336a;

    static {
        Covode.recordClassIndex(64104);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        return new b(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.ui.adapter.GreetEmojiViewHolder");
        com.ss.android.ugc.aweme.emoji.g.a aVar = (com.ss.android.ugc.aweme.emoji.g.a) a(i2);
        if (aVar != null) {
            b bVar = (b) viewHolder;
            l.d(aVar, "");
            ah.a(bVar.f100337a, aVar.getAnimateUrl(), null, true);
            bVar.f100338b = this.f100336a;
        }
    }
}
