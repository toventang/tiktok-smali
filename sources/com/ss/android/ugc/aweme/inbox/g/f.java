package com.ss.android.ugc.aweme.inbox.g;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.aa;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class f extends g<aa> {

    /* renamed from: g  reason: collision with root package name */
    private final h f104261g;

    /* renamed from: h  reason: collision with root package name */
    private final h f104262h;

    /* renamed from: i  reason: collision with root package name */
    private final int f104263i;

    static {
        Covode.recordClassIndex(66763);
    }

    private final TuxTextView f() {
        return (TuxTextView) this.f104261g.getValue();
    }

    static final class a extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.$itemView.findViewById(R.id.boc);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.dil);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f104264a;

        static {
            Covode.recordClassIndex(66765);
        }

        b(f fVar) {
            this.f104264a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                IRecommendUsersService j2 = IRecommendUsersServiceImpl.j();
                e requireActivity = this.f104264a.d().requireActivity();
                l.b(requireActivity, "");
                j2.a(requireActivity);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        l.d(view, "");
        this.f104261g = i.a((h.f.a.a) new c(view));
        this.f104262h = i.a((h.f.a.a) new a(view));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f104263i = h.g.a.a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (bVar.f104373a != -1) {
            View view = this.itemView;
            l.b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                View view2 = this.itemView;
                l.b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f104373a - this.f104263i;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(aa aaVar) {
        aa aaVar2 = aaVar;
        l.d(aaVar2, "");
        if (aaVar2.f104029a == 0) {
            View view = this.itemView;
            l.b(view, "");
            view.setVisibility(8);
        } else {
            TuxTextView f2 = f();
            l.b(f2, "");
            TuxTextView f3 = f();
            l.b(f3, "");
            f2.setText(f3.getContext().getString(aaVar2.f104029a));
        }
        ((TuxIconView) this.f104262h.getValue()).setOnClickListener(new b(this));
    }
}
