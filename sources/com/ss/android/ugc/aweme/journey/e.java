package com.ss.android.ugc.aweme.journey;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class e extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public final String f104842b;

    static {
        Covode.recordClassIndex(67239);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, String str) {
        super(view);
        l.d(view, "");
        l.d(str, "");
        this.f104842b = str;
    }
}
