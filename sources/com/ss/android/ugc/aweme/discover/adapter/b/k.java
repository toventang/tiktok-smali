package com.ss.android.ugc.aweme.discover.adapter.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.f;
import com.ss.android.ugc.aweme.search.model.e;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f80526a;

    /* renamed from: b  reason: collision with root package name */
    private final e f80527b;

    static {
        Covode.recordClassIndex(50096);
    }

    k(h hVar, e eVar) {
        this.f80526a = hVar;
        this.f80527b = eVar;
    }

    public final void run() {
        View view;
        h hVar = this.f80526a;
        int i2 = 8;
        if (!this.f80527b.a()) {
            view = hVar.f80511f;
        } else {
            float width = (float) (hVar.f80512g.getWidth() - f.b(15));
            float measureText = hVar.f80507b.getPaint().measureText(hVar.f80507b.getText().toString());
            view = hVar.f80511f;
            if (measureText < width) {
                i2 = 0;
            }
        }
        view.setVisibility(i2);
    }
}
