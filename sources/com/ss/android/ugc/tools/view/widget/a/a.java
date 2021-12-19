package com.ss.android.ugc.tools.view.widget.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(98886);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a.a$a  reason: collision with other inner class name */
    public static final class C4051a extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.a f150338a;

        static {
            Covode.recordClassIndex(98887);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f150338a.notifyDataSetChanged();
        }

        C4051a(RecyclerView.a aVar) {
            this.f150338a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            this.f150338a.notifyItemRangeInserted(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            this.f150338a.notifyItemRangeRemoved(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            this.f150338a.notifyItemRangeChanged(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            this.f150338a.notifyItemMoved(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            this.f150338a.notifyItemRangeChanged(i2, i3, obj);
        }
    }
}
