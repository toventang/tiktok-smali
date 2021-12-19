package com.ss.android.ugc.aweme.commercialize_ad_api.b;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import h.f.b.l;

public abstract class b<T extends c> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(47096);
    }

    public abstract void a(Context context, T t);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
    }
}
