package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f;

public class FixedLinearlayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private String f113912a = "";

    static {
        Covode.recordClassIndex(73251);
    }

    public FixedLinearlayoutManager() {
    }

    public FixedLinearlayoutManager(String str) {
        super(1, false);
        this.f113912a = str;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (Exception e2) {
            if ("InboxFragment".equals(this.f113912a)) {
                f.a("InboxLayoutManager", "onLayoutChildren error, childCount:" + s() + " recyclerview.state:" + sVar.toString(), e2);
            }
        }
    }

    public FixedLinearlayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
