package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.g;

final /* synthetic */ class l implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f71396a;

    static {
        Covode.recordClassIndex(43946);
    }

    l(h hVar) {
        this.f71396a = hVar;
    }

    public final boolean onLongClick(View view) {
        h hVar = this.f71396a;
        if (hVar.x == null || hVar.y == null) {
            return true;
        }
        hVar.x.a(hVar.z, hVar.y, (g) null);
        return true;
    }
}
