package com.bytedance.ies.uikit.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;

public abstract class RecyclerViewWithFooterAdapter extends RecyclerView.a {
    protected boolean mShowFooter = true;

    static {
        Covode.recordClassIndex(21223);
    }

    public static int com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i2) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    public void setShowFooter(boolean z) {
        this.mShowFooter = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (!this.mShowFooter || i2 != getBasicItemCount()) {
            return getBasicItemViewType(i2);
        }
        return Integer.MIN_VALUE;
    }

    public final RecyclerView.ViewHolder RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i2) {
        if (Integer.MIN_VALUE == i2) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i2);
        }
    }

    public static RecyclerView.ViewHolder com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(RecyclerViewWithFooterAdapter recyclerViewWithFooterAdapter, ViewGroup viewGroup, int i2) {
        boolean a2;
        RecyclerView.ViewHolder RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___ = recyclerViewWithFooterAdapter.RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(viewGroup, i2);
        try {
            if (RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    String stringBuffer2 = stringBuffer.toString();
                    com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_LogLancet_w("RecyclerViewLancet", stringBuffer2);
                    a.a(stringBuffer2);
                    ViewGroup viewGroup2 = (ViewGroup) RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.getClass().getName();
        return RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___;
    }
}
