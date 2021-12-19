package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class SSGridLayoutManager extends GridLayoutManager {
    static {
        Covode.recordClassIndex(8725);
    }

    public SSGridLayoutManager(Context context, int i2) {
        super(i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (Exception unused) {
        }
    }

    public SSGridLayoutManager(int i2, int i3) {
        super(i2, i3, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.a(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.b(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
