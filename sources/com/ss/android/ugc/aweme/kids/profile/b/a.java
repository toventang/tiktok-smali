package com.ss.android.ugc.aweme.kids.profile.b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public static final C2734a f106748a = new C2734a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f106749b;

    static {
        Covode.recordClassIndex(68242);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b.a$a  reason: collision with other inner class name */
    public static final class C2734a {
        static {
            Covode.recordClassIndex(68243);
        }

        private C2734a() {
        }

        public /* synthetic */ C2734a(byte b2) {
            this();
        }
    }

    public a(int i2) {
        this.f106749b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        RecyclerView.a adapter;
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        int e2 = RecyclerView.e(view);
        if (e2 != 0 && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 1) {
            int i2 = e2 - 1;
            if (i2 / 3 > 0) {
                rect.top = this.f106749b;
            }
            int i3 = i2 % 3;
            if (i3 == 0) {
                rect.right = this.f106749b / 2;
            } else if (i3 == 1) {
                rect.left = this.f106749b / 2;
                rect.right = this.f106749b / 2;
            } else if (i3 == 2) {
                rect.left = this.f106749b / 2;
            }
        }
    }
}
