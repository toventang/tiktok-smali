package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.covode.number.Covode;

public final class RechargePagerAdapter$instantiateItem$layoutManager$1 extends GridLayoutManager {
    final /* synthetic */ ViewGroup L;

    static {
        Covode.recordClassIndex(7231);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final boolean g() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RechargePagerAdapter$instantiateItem$layoutManager$1(ViewGroup viewGroup, Context context) {
        super(3);
        this.L = viewGroup;
    }
}
