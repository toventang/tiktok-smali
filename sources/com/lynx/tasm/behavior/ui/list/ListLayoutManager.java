package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

public final class ListLayoutManager {
    static {
        Covode.recordClassIndex(35103);
    }

    public static class ListGridLayoutManager extends GridLayoutManager {
        private UIList L;

        static {
            Covode.recordClassIndex(35104);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean g() {
            if (!this.L.f56165f) {
                return false;
            }
            return super.g();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView.s sVar) {
            super.a(sVar);
            this.L.b();
        }

        public ListGridLayoutManager(Context context, int i2, UIList uIList) {
            super(i2);
            this.L = uIList;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            int b2 = super.b(i2, oVar, sVar);
            this.L.f56164e.a(i2, b2);
            return b2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(View view, int i2, int i3, int i4, int i5) {
            if (((GridLayoutManager.b) view.getLayoutParams()).f3769b != ((GridLayoutManager) this).f3760b) {
                super.b(view, i2, i3, i4, i5);
            } else {
                ListLayoutManager.a(this, view, i3, i5);
            }
        }
    }

    public static class ListLinearLayoutManager extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        private UIList f56159a;

        static {
            Covode.recordClassIndex(35105);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final boolean g() {
            if (!this.f56159a.f56165f) {
                return false;
            }
            return super.g();
        }

        public ListLinearLayoutManager(UIList uIList) {
            this.f56159a = uIList;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView.s sVar) {
            super.a(sVar);
            this.f56159a.b();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            int b2 = super.b(i2, oVar, sVar);
            this.f56159a.f56164e.a(i2, b2);
            return b2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(View view, int i2, int i3, int i4, int i5) {
            if (!this.f56159a.f56162c.a(((RecyclerView.j) view.getLayoutParams()).f3847c.getBindingAdapterPosition())) {
                super.b(view, i2, i3, i4, i5);
            } else {
                ListLayoutManager.a(this, view, i3, i5);
            }
        }
    }

    static class a extends StaggeredGridLayoutManager {

        /* renamed from: l  reason: collision with root package name */
        private UIList f56160l;

        static {
            Covode.recordClassIndex(35106);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public final boolean x_() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public final boolean g() {
            if (!this.f56160l.f56165f) {
                return false;
            }
            return super.g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public final void a(RecyclerView.s sVar) {
            super.a(sVar);
            this.f56160l.b();
        }

        public a(int i2, UIList uIList) {
            super(i2, 1);
            this.f56160l = uIList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
        public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            try {
                int b2 = super.b(i2, oVar, sVar);
                this.f56160l.f56164e.a(i2, b2);
                return b2;
            } catch (NullPointerException unused) {
                return 0;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(View view, int i2, int i3, int i4, int i5) {
            if (!((StaggeredGridLayoutManager.b) view.getLayoutParams()).f3934b) {
                super.b(view, i2, i3, i4, i5);
            } else {
                ListLayoutManager.a(this, view, i3, i5);
            }
        }
    }

    public static void a(RecyclerView.i iVar, View view, int i2, int i3) {
        int i4 = iVar.J;
        int measuredWidth = view.getMeasuredWidth();
        int t = iVar.t();
        int v = iVar.v();
        int i5 = i4 - measuredWidth;
        if (i5 <= 0) {
            t = 0;
        } else {
            int i6 = v + t;
            int i7 = i5 - i6;
            if (i7 < 0) {
                double d2 = (double) t;
                double d3 = (double) i6;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = (double) i7;
                Double.isNaN(d4);
                t += (int) (d4 * (d2 / d3));
            }
        }
        view.layout(t, i2, view.getMeasuredWidth() + t, i3);
    }
}
