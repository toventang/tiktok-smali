package com.ss.android.ugc.aweme.common.d;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;

public interface d<T extends RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(47161);
    }

    void b(T t);
}
