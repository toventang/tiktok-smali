package com.ss.android.ugc.aweme.im.sdk.common.ui.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;

public class a<DATA> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(65648);
    }

    public void b() {
    }

    public void a() {
        b();
        c();
    }

    /* access modifiers changed from: protected */
    public void c() {
        ae.a(this.itemView);
    }

    public a(View view) {
        super(view);
        a();
    }
}
