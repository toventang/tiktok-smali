package com.ss.android.ugc.aweme.tools.draft.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;

public abstract class a<T> extends RecyclerView.ViewHolder {
    public T t;
    public SmartImageView u;
    boolean v = true;

    static {
        Covode.recordClassIndex(91100);
    }

    public a(View view) {
        super(view);
    }
}
