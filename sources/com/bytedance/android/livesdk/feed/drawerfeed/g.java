package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.a.o;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.i.p;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.l.c;

final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.android.livesdk.feed.dislike.a f17398a;

    /* renamed from: b  reason: collision with root package name */
    private final h f17399b;

    /* renamed from: c  reason: collision with root package name */
    private final m f17400c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.g.g f17401d;

    static {
        Covode.recordClassIndex(9644);
    }

    g(com.bytedance.android.livesdk.feed.dislike.a aVar, h hVar, m mVar, com.bytedance.android.livesdkapi.g.g gVar) {
        this.f17398a = aVar;
        this.f17399b = hVar;
        this.f17400c = mVar;
        this.f17401d = gVar;
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        h hVar = this.f17399b;
        m mVar = this.f17400c;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_o, viewGroup, false);
        c cVar = null;
        FeedDataKey a3 = (objArr.length <= 0 || !(objArr[0] instanceof o)) ? null : ((o) objArr[0]).a();
        c cVar2 = (objArr.length <= 2 || !(objArr[2] instanceof c)) ? null : (c) objArr[2];
        if (objArr.length > 3 && (objArr[3] instanceof c)) {
            cVar = (c) objArr[3];
        }
        return new p(a2, hVar, a3, mVar, cVar2, cVar);
    }
}
