package com.bytedance.android.live.uikit.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;

public abstract class b extends RecyclerView.a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f12923b = true;

    static {
        Covode.recordClassIndex(7172);
    }

    public int a(int i2) {
        return 0;
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2);

    public abstract void a(RecyclerView.ViewHolder viewHolder);

    public abstract void a(RecyclerView.ViewHolder viewHolder, int i2);

    public abstract int c();

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.f12923b) {
            return c() + 1;
        }
        return c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (!this.f12923b || i2 != c()) {
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

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        if (Integer.MIN_VALUE == i2) {
            viewHolder = bVar.a(viewGroup);
        } else {
            viewHolder = bVar.a(viewGroup, i2);
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
