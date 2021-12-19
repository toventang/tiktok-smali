package com.bytedance.android.live.core.paging.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f9132a;

    static {
        Covode.recordClassIndex(4678);
    }

    public a(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        MethodCollector.i(12041);
        this.f9132a = viewGroup;
        MethodCollector.o(12041);
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void a(Object obj, int i2) {
        this.itemView.setLayoutParams(new RecyclerView.j(this.f9132a.getMeasuredWidth(), 1));
    }
}
