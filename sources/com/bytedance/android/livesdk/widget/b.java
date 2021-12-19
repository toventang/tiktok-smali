package com.bytedance.android.livesdk.widget;

import android.graphics.Bitmap;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.chatroom.model.c;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.h.a;
import f.a.t;
import java.util.List;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BarrageWidget f22575a;

    static {
        Covode.recordClassIndex(13310);
    }

    b(BarrageWidget barrageWidget) {
        this.f22575a = barrageWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        BarrageWidget barrageWidget = this.f22575a;
        d dVar = (d) obj;
        if (h.a(((c) dVar.data).f15737a)) {
            barrageWidget.f22462g = false;
            return;
        }
        barrageWidget.f22462g = true;
        for (c.a aVar : ((c) dVar.data).f15737a) {
            t<R> a2 = g.a(aVar.f15739b).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(barrageWidget.getAutoUnbindTransformer());
            List<Bitmap> list = barrageWidget.f22456a;
            list.getClass();
            a2.a(new d(list), new e(barrageWidget));
        }
    }
}
