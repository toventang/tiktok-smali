package com.ss.android.ugc.aweme.inbox;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.g.a.a.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class s extends i {
    private final List<RecyclerView.ViewHolder> n = new ArrayList();

    static {
        Covode.recordClassIndex(66829);
    }

    public s() {
        this.f3832k = 220;
        this.f3831j = 110;
        this.f3830i = 110;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final boolean b() {
        if (super.b() || (!this.n.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.RecyclerView.f
    public final void a() {
        super.a();
        if (!this.n.isEmpty()) {
            for (T t : this.n) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(t.itemView, "alpha", 1.0f, 0.0f, 1.0f).setDuration(this.f3832k);
                l.b(duration, "");
                duration.setInterpolator(new c());
                duration.addListener(new a(t, this));
                duration.start();
            }
            this.n.clear();
        }
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f104348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f104349b;

        static {
            Covode.recordClassIndex(66830);
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            View view = this.f104348a.itemView;
            l.b(view, "");
            view.setAlpha(1.0f);
        }

        public final void onAnimationEnd(Animator animator) {
            ArrayList<Animator.AnimatorListener> listeners;
            if (animator != null && (listeners = animator.getListeners()) != null) {
                listeners.remove(this);
            }
        }

        a(RecyclerView.ViewHolder viewHolder, s sVar) {
            this.f104348a = viewHolder;
            this.f104349b = sVar;
        }
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
    public final boolean a(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        if (i5 - i3 <= 0 || !(viewHolder instanceof com.ss.android.ugc.aweme.inbox.e.a)) {
            return super.a(viewHolder, i2, i3, i4, i5);
        }
        this.n.add(viewHolder);
        return super.a(viewHolder, i2, i3, i4, i5);
    }
}
