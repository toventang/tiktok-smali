package com.ss.android.ugc.aweme.comment.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f71399a;

    static {
        Covode.recordClassIndex(43949);
    }

    o(h hVar) {
        this.f71399a = hVar;
    }

    public final void run() {
        h hVar = this.f71399a;
        int width = hVar.w.getWidth();
        int b2 = (int) n.b(hVar.w.getContext(), 80.0f);
        b bVar = new b();
        bVar.a((ConstraintLayout) hVar.f71374a);
        if (gb.a()) {
            bVar.a(R.id.f5w, 7);
            bVar.a(R.id.f5w, 6);
            bVar.a(R.id.f5w, 6, R.id.c0e, 7);
            bVar.a(R.id.f5w, 7, R.id.be6, 7);
            bVar.a(R.id.f5w, 0.0f);
            hVar.w.setTextAlignment(5);
        }
        if (width < b2) {
            bVar.d(R.id.f5w).an = b2;
        }
        bVar.b((ConstraintLayout) hVar.f71374a);
    }
}
