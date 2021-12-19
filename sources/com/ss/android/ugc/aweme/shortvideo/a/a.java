package com.ss.android.ugc.aweme.shortvideo.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class a<T> {
    static {
        Covode.recordClassIndex(82000);
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract void a(T t, int i2, RecyclerView.ViewHolder viewHolder, List<Object> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(T t, int i2);
}
