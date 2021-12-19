package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.a.a.a;

public class SSLinearLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(8726);
    }

    public SSLinearLayoutManager() {
    }

    public SSLinearLayoutManager(int i2) {
        super(i2, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (Exception e2) {
            a.b("SSLinearLayoutManager", e2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.a(i2, oVar, sVar);
        } catch (Exception e2) {
            a.b("SSLinearLayoutManager", e2);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.b(i2, oVar, sVar);
        } catch (Exception e2) {
            a.b("SSLinearLayoutManager", e2);
            return 0;
        }
    }

    public SSLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
