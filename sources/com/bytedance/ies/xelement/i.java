package com.bytedance.ies.xelement;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37081c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ViewTreeObserver.OnScrollChangedListener f37082a;

    /* renamed from: b  reason: collision with root package name */
    final RecyclerView.n f37083b = new c(this);

    /* renamed from: d  reason: collision with root package name */
    private int f37084d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f37085e;

    static {
        Covode.recordClassIndex(22301);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22302);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(View view) {
            if (view == null || view.getVisibility() != 0) {
                return false;
            }
            return view.getGlobalVisibleRect(new Rect());
        }
    }

    static final class b implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f37086a;

        /* renamed from: b  reason: collision with root package name */
        public final i f37087b;

        static {
            Covode.recordClassIndex(22303);
        }

        public final void onScrollChanged() {
            if (a.a(this.f37086a)) {
                RecyclerView.i layoutManager = this.f37086a.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    int k2 = linearLayoutManager.k();
                    int m2 = linearLayoutManager.m();
                    if (k2 != -1 && m2 - k2 >= 0) {
                        this.f37087b.a(k2, m2);
                    }
                }
            }
        }

        public b(RecyclerView recyclerView, i iVar) {
            l.c(recyclerView, "");
            l.c(iVar, "");
            this.f37086a = recyclerView;
            this.f37087b = iVar;
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f37088a;

        static {
            Covode.recordClassIndex(22304);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(i iVar) {
            this.f37088a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            LinearLayoutManager linearLayoutManager;
            l.c(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (a.a(recyclerView) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                int k2 = linearLayoutManager.k();
                int m2 = linearLayoutManager.m();
                if (k2 != -1 && m2 - k2 >= 0) {
                    this.f37088a.a(k2, m2);
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        if (i3 - i2 >= 0) {
            int i4 = this.f37084d;
            if (i4 == -1) {
                this.f37084d = i2;
                this.f37085e = i3;
                while (i2 < i3 + 1) {
                    i2++;
                }
                return;
            }
            if (i2 != i4) {
                this.f37084d = i2;
            }
            if (i3 != this.f37085e) {
                this.f37085e = i3;
            }
        }
    }
}
