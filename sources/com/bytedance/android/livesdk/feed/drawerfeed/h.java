package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.a.o;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.l.c;

final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final p f17402a;

    static {
        Covode.recordClassIndex(9645);
    }

    h(p pVar) {
        this.f17402a = pVar;
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        p pVar = this.f17402a;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bem, viewGroup, false);
        c cVar = null;
        if (objArr.length <= 0 || !(objArr[0] instanceof o)) {
            feedDataKey = null;
        } else {
            o oVar = (o) objArr[0];
            feedDataKey = oVar.a();
            oVar.b();
        }
        c cVar2 = (objArr.length <= 2 || !(objArr[2] instanceof c)) ? null : (c) objArr[2];
        c cVar3 = (objArr.length <= 3 || !(objArr[3] instanceof c)) ? null : (c) objArr[3];
        if (objArr.length > 4 && (objArr[4] instanceof c)) {
            cVar = (c) objArr[4];
        }
        return new com.bytedance.android.livesdk.feed.drawerfeed.a.a(a2, feedDataKey, cVar2, cVar3, cVar, pVar, viewGroup);
    }
}
