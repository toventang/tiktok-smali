package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.d.a;
import h.f.b.l;

public abstract class a<T extends com.ss.android.ugc.aweme.tools.draft.d.a> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(91431);
    }

    public abstract void a(T t);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }
}
