package com.ss.android.ugc.tools.view.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;

public abstract class f extends RecyclerView.a {
    public boolean q = true;

    static {
        Covode.recordClassIndex(98781);
    }

    public abstract int a();

    public int a(int i2) {
        return 0;
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2);

    public abstract void a(RecyclerView.ViewHolder viewHolder);

    public abstract void a(RecyclerView.ViewHolder viewHolder, int i2);

    /* access modifiers changed from: protected */
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.q) {
            return a() + 1;
        }
        return a();
    }

    public final void d(boolean z) {
        if (z != this.q) {
            this.q = z;
            c(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (!this.q || i2 != a()) {
            return a(i2);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            a(viewHolder);
        } else {
            a(viewHolder, i2);
        }
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        if (Integer.MIN_VALUE == i2) {
            viewHolder = fVar.a(viewGroup);
        } else {
            viewHolder = fVar.a(viewGroup, i2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
