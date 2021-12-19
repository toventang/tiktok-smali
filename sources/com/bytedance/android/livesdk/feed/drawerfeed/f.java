package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.a.o;
import com.bytedance.android.livesdk.feed.drawerfeed.a.j;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.l.c;

final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.android.livesdk.feed.dislike.a f17394a;

    /* renamed from: b  reason: collision with root package name */
    private final h f17395b;

    /* renamed from: c  reason: collision with root package name */
    private final m f17396c;

    /* renamed from: d  reason: collision with root package name */
    private final g f17397d;

    static {
        Covode.recordClassIndex(9643);
    }

    f(com.bytedance.android.livesdk.feed.dislike.a aVar, h hVar, m mVar, g gVar) {
        this.f17394a = aVar;
        this.f17395b = hVar;
        this.f17396c = mVar;
        this.f17397d = gVar;
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        com.bytedance.android.livesdk.feed.dislike.a aVar = this.f17394a;
        h hVar = this.f17395b;
        m mVar = this.f17396c;
        g gVar = this.f17397d;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_k, viewGroup, false);
        c cVar = null;
        FeedDataKey a3 = (objArr.length <= 0 || !(objArr[0] instanceof o)) ? null : ((o) objArr[0]).a();
        c cVar2 = (objArr.length <= 1 || !(objArr[1] instanceof c)) ? null : (c) objArr[1];
        c cVar3 = (objArr.length <= 2 || !(objArr[2] instanceof c)) ? null : (c) objArr[2];
        c cVar4 = (objArr.length <= 3 || !(objArr[3] instanceof c)) ? null : (c) objArr[3];
        if (objArr.length > 4 && (objArr[4] instanceof c)) {
            cVar = (c) objArr[4];
        }
        return new j(a2, aVar, hVar, a3, mVar, gVar, cVar2, cVar, cVar3, cVar4, viewGroup);
    }
}
