package com.ss.android.ugc.aweme.shortvideo.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import f.a.d.f;
import h.p;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseVideoCoverView.a f132909a;

    static {
        Covode.recordClassIndex(86937);
    }

    d(ChooseVideoCoverView.a aVar) {
        this.f132909a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ChooseVideoCoverView.a aVar = this.f132909a;
        p pVar = (p) obj;
        Integer num = (Integer) pVar.getFirst();
        aVar.f132766b[num.intValue()] = pVar;
        if (aVar.f132767c) {
            aVar.f132767c = false;
            aVar.notifyDataSetChanged();
            return;
        }
        aVar.notifyItemChanged(num.intValue());
    }
}
