package com.ss.android.ugc.aweme.account.login.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final h f63253a;

    /* renamed from: b  reason: collision with root package name */
    c f63254b;

    /* renamed from: c  reason: collision with root package name */
    private final h f63255c;

    /* renamed from: d  reason: collision with root package name */
    private final h f63256d;

    /* renamed from: e  reason: collision with root package name */
    private final h f63257e;

    static {
        Covode.recordClassIndex(38985);
    }

    /* access modifiers changed from: package-private */
    public final ImageView a() {
        return (ImageView) this.f63255c.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ConstraintLayout b() {
        return (ConstraintLayout) this.f63256d.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TextView c() {
        return (TextView) this.f63257e.getValue();
    }

    static final class b extends m implements h.f.a.a<TextView> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(38987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.$view.findViewById(R.id.a4p);
        }
    }

    static final class c extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(38988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.$view.findViewById(R.id.ad7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.d$d  reason: collision with other inner class name */
    static final class C1405d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(38989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1405d(View view) {
            super(0);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$view.findViewById(R.id.ak9);
        }
    }

    static final class e extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ View $view;

        static {
            Covode.recordClassIndex(38990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.$view.findViewById(R.id.bi7);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63258a;

        static {
            Covode.recordClassIndex(38986);
        }

        a(c cVar) {
            this.f63258a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f63258a;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        this.f63253a = i.a(h.m.NONE, new C1405d(view));
        this.f63255c = i.a(h.m.NONE, new e(view));
        this.f63256d = i.a(h.m.NONE, new c(view));
        this.f63257e = i.a(h.m.NONE, new b(view));
    }
}
