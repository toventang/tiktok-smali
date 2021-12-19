package com.ss.android.ugc.aweme.base.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;

public abstract class g<DATA> extends f<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public static int f68515a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public static int f68516b = 20000;

    /* renamed from: c  reason: collision with root package name */
    public View f68517c;

    /* renamed from: d  reason: collision with root package name */
    private View f68518d;

    /* access modifiers changed from: protected */
    public RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void b(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public View b() {
        return this.f68518d;
    }

    public boolean d() {
        if (this.f68518d != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(42182);
    }

    public g() {
        this.s = new GridLayoutManager.c() {
            /* class com.ss.android.ugc.aweme.base.widget.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42183);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (i2 == 0 && g.this.c(i2) == g.f68515a) {
                    return 2;
                }
                return 1;
            }
        };
        k();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public int c() {
        int i2;
        if (this.f68518d == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return super.c() + i2;
    }

    static class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(42184);
        }

        a(View view) {
            super(view);
        }
    }

    public void a(View view) {
        if (view != null) {
            this.f68518d = view;
            notifyItemInserted(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public int c(int i2) {
        if (this.f68518d == null && this.f68517c == null) {
            return 0;
        }
        if (i2 == 0) {
            return f68515a;
        }
        if (!this.v || i2 != getItemCount() - 1) {
            return 0;
        }
        return f68516b;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (this.f68518d != null && i2 == f68515a) {
            return new a(this.f68518d);
        }
        if (this.f68517c == null || i2 != f68516b) {
            return b(viewGroup, i2);
        }
        return a_(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (getItemViewType(i2) == 0) {
            if (!(this.f68518d == null || i2 == 0)) {
                i2--;
            }
            b(viewHolder, i2);
        } else if (getItemViewType(i2) == f68516b && (viewHolder instanceof h.c)) {
            ((h.c) viewHolder).a();
        }
    }
}
