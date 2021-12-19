package com.ss.android.ugc.aweme.contentlanguage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class k extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private final h f78203a;

    /* renamed from: b  reason: collision with root package name */
    private final h f78204b;

    /* renamed from: c  reason: collision with root package name */
    private final h f78205c;

    /* renamed from: d  reason: collision with root package name */
    private final h f78206d;

    /* renamed from: e  reason: collision with root package name */
    private final h f78207e;

    static {
        Covode.recordClassIndex(48487);
    }

    public final TuxTextView a() {
        return (TuxTextView) this.f78203a.getValue();
    }

    public final TuxTextView b() {
        return (TuxTextView) this.f78204b.getValue();
    }

    public final RemoteImageView c() {
        return (RemoteImageView) this.f78205c.getValue();
    }

    public final ImageView d() {
        return (ImageView) this.f78206d.getValue();
    }

    public final View e() {
        return (View) this.f78207e.getValue();
    }

    static final class a extends m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(48488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.$itemView.findViewById(R.id.c4u);
        }
    }

    static final class b extends m implements h.f.a.a<RemoteImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(48489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.$itemView.findViewById(R.id.bi7);
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(48490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.$itemView.findViewById(R.id.bnb);
        }
    }

    static final class d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(48491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.awf);
        }
    }

    static final class e extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(48492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cih);
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f78208a;

        static {
            Covode.recordClassIndex(48493);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(k kVar) {
            this.f78208a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f78208a.c().setVisibility(8);
        }
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f78209a;

        static {
            Covode.recordClassIndex(48494);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(k kVar) {
            this.f78209a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f78209a.d().setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(View view) {
        super(view);
        l.d(view, "");
        this.f78203a = i.a((h.f.a.a) new e(view));
        this.f78204b = i.a((h.f.a.a) new d(view));
        this.f78205c = i.a((h.f.a.a) new b(view));
        this.f78206d = i.a((h.f.a.a) new c(view));
        this.f78207e = i.a((h.f.a.a) new a(view));
    }
}
