package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public abstract class n extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(50128);
    }

    public abstract void a(int i2);

    public n(View view) {
        super(view);
    }
}
