package com.ss.android.ugc.aweme.friends.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.g.a.a.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.e;
import java.util.ArrayList;
import java.util.List;

public final class t extends i {
    private final List<RecyclerView.ViewHolder> n = new ArrayList();
    private final List<RecyclerView.ViewHolder> o = new ArrayList();

    static {
        Covode.recordClassIndex(61796);
    }

    public t() {
        this.f3830i = 300;
        this.f3831j = 300;
        this.f3832k = 300;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final boolean b() {
        if (!this.n.isEmpty() || !this.o.isEmpty() || super.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final void d() {
        for (int size = this.n.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = this.n.get(size);
            a(viewHolder.itemView);
            f(viewHolder);
            this.n.remove(size);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder2 = this.o.get(size2);
            a(viewHolder2.itemView);
            f(viewHolder2);
            this.o.remove(size2);
        }
        super.d();
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final void a() {
        super.a();
        if (!this.n.isEmpty()) {
            for (int size = this.n.size() - 1; size >= 0; size--) {
                final RecyclerView.ViewHolder viewHolder = this.n.get(size);
                viewHolder.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.f3830i).setListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.friends.ui.t.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(61797);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        t.a(viewHolder.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        t.a(viewHolder.itemView);
                        t.this.f(viewHolder);
                        t.a(t.this);
                    }
                }).setInterpolator(new c());
                this.n.remove(size);
            }
        }
        if (!this.o.isEmpty()) {
            for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
                final RecyclerView.ViewHolder viewHolder2 = this.o.get(size2);
                viewHolder2.itemView.animate().alpha(0.0f).translationX((float) (-viewHolder2.itemView.getWidth())).setDuration(this.f3831j).setListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.friends.ui.t.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(61798);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        t.a(viewHolder2.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        t.a(viewHolder2.itemView);
                        t.this.f(viewHolder2);
                        t.a(t.this);
                    }
                }).setInterpolator(new c());
                this.o.remove(size2);
            }
        }
    }

    static /* synthetic */ void a(t tVar) {
        if (!tVar.b()) {
            tVar.e();
        }
    }

    public static void a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
    public final boolean a(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof u) && !(viewHolder instanceof e)) {
            return super.a(viewHolder);
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        this.o.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
    public final boolean b(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof u)) {
            return super.b(viewHolder);
        }
        viewHolder.itemView.setAlpha(0.0f);
        viewHolder.itemView.setTranslationY((float) viewHolder.itemView.getHeight());
        viewHolder.itemView.setScaleX(0.5f);
        viewHolder.itemView.setScaleY(0.5f);
        this.n.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final void c(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (this.n.remove(viewHolder)) {
            f(viewHolder);
            a(viewHolder.itemView);
        }
        if (this.o.remove(viewHolder)) {
            f(viewHolder);
            a(viewHolder.itemView);
        }
        super.c(viewHolder);
    }
}
