package com.bytedance.creativex.recorder.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.tools.c;
import java.util.List;

final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f28067a;

    static {
        Covode.recordClassIndex(16436);
    }

    b(a aVar) {
        this.f28067a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f28067a;
        List<BeautyComposerInfo> list = (List) obj;
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (aVar.f28052b.b().equals("record")) {
                    aVar.f28051a.c(list, 10000);
                }
            } catch (Exception e2) {
                if (!c.f149147b) {
                    aVar.a(new e(e2));
                    return;
                }
                throw new RuntimeException("thx to contact dengchong.999 ...", e2);
            }
        }
    }
}
