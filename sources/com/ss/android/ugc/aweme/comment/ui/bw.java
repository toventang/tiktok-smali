package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;

public final class bw extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72641a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final int f72642b = ((int) n.b(d.a(), 4.0f));

    public static final class a {
        static {
            Covode.recordClassIndex(44750);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(44749);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        float f2;
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        Context a2 = d.a();
        if (RecyclerView.d(view) != 0) {
            f2 = 0.0f;
        } else {
            f2 = 16.0f;
        }
        int b2 = (int) n.b(a2, f2);
        if (gb.a(view.getContext())) {
            rect.set(f72642b, 0, b2, 0);
        } else {
            rect.set(b2, 0, f72642b, 0);
        }
    }
}
