package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Arrays;
import java.util.Objects;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shoutouts.review.c.a f133472a;

    /* renamed from: b  reason: collision with root package name */
    public a f133473b;

    /* renamed from: c  reason: collision with root package name */
    private final h f133474c;

    /* renamed from: d  reason: collision with root package name */
    private final h f133475d;

    public interface a {
        static {
            Covode.recordClassIndex(87287);
        }

        void a(com.ss.android.ugc.aweme.shoutouts.review.c.a aVar);
    }

    static {
        Covode.recordClassIndex(87285);
    }

    private final TuxTextView getBottomBtn() {
        return (TuxTextView) this.f133474c.getValue();
    }

    private final TuxTextView getTvAgeRestrict() {
        return (TuxTextView) this.f133475d.getValue();
    }

    public final com.ss.android.ugc.aweme.shoutouts.review.c.a getCurrentStyle() {
        return this.f133472a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$b  reason: collision with other inner class name */
    static final class C3458b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3458b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.ewa);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.f0c);
        }
    }

    public final void setReviewBottomBtnClickListener(a aVar) {
        l.d(aVar, "");
        this.f133473b = aVar;
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f133478a = new d();

        static {
            Covode.recordClassIndex(87290);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#fe2c55"));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44785k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44786l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.this$0.getContext(), R.color.bz));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44785k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44786l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f133479a = new g();

        static {
            Covode.recordClassIndex(87293);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#fe2c55"));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44785k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44786l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(final Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3329);
        this.f133474c = i.a((h.f.a.a) new C3458b(this));
        this.f133475d = i.a((h.f.a.a) new c(this));
        com.a.a(LayoutInflater.from(context), R.layout.b0o, this, true);
        getBottomBtn().setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.shoutouts.review.view.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f133476a;

            static {
                Covode.recordClassIndex(87286);
            }

            {
                this.f133476a = r1;
            }

            public final void onClick(View view) {
                com.ss.android.ugc.aweme.shoutouts.review.c.a aVar;
                ClickAgent.onClick(view);
                if (this.f133476a.f133472a != null && this.f133476a.f133473b != null) {
                    a aVar2 = this.f133476a.f133473b;
                    if (aVar2 == null) {
                        l.b();
                    }
                    com.ss.android.ugc.aweme.shoutouts.review.c.a aVar3 = this.f133476a.f133472a;
                    if (aVar3 == null) {
                        l.b();
                    }
                    aVar2.a(aVar3);
                } else if (this.f133476a.f133472a != null && (aVar = this.f133476a.f133472a) != null && c.f133480a[aVar.ordinal()] == 1) {
                    Context context = context;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    new com.bytedance.tux.g.b((Activity) context).a(this.f133476a.getResources().getString(R.string.g0_)).b();
                }
            }
        });
        MethodCollector.o(3329);
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.this$0.getContext(), R.color.f159928l));
            eVar2.f44779e = Integer.valueOf(androidx.core.content.b.c(this.this$0.getContext(), R.color.b6));
            eVar2.f44778d = 1;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44785k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44786l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.shoutouts.review.c.a aVar) {
        l.d(aVar, "");
        this.f133472a = aVar;
        int i2 = c.f133481b[aVar.ordinal()];
        if (i2 == 1) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn = getBottomBtn();
            Context context = getContext();
            l.b(context, "");
            bottomBtn.setText(context.getResources().getString(R.string.g00));
            TuxTextView bottomBtn2 = getBottomBtn();
            com.bytedance.tux.c.e a2 = com.bytedance.tux.c.f.a(d.f133478a);
            Context context2 = getContext();
            l.b(context2, "");
            bottomBtn2.setBackground(a2.a(context2));
        } else if (i2 == 2 || i2 == 3) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn3 = getBottomBtn();
            com.bytedance.tux.c.e a3 = com.bytedance.tux.c.f.a(new e(this));
            Context context3 = getContext();
            l.b(context3, "");
            bottomBtn3.setBackground(a3.a(context3));
            if (aVar == com.ss.android.ugc.aweme.shoutouts.review.c.a.CONSUMER_OUT_OF_SERVICE) {
                TuxTextView bottomBtn4 = getBottomBtn();
                Context context4 = getContext();
                l.b(context4, "");
                bottomBtn4.setText(context4.getResources().getText(R.string.fzh));
                return;
            }
            TuxTextView bottomBtn5 = getBottomBtn();
            Context context5 = getContext();
            l.b(context5, "");
            bottomBtn5.setText(context5.getResources().getString(R.string.g00));
            TuxTextView tvAgeRestrict = getTvAgeRestrict();
            String string = getResources().getString(R.string.g09);
            l.b(string, "");
            String a4 = com.a.a(string, Arrays.copyOf(new Object[]{"18"}, 1));
            l.b(a4, "");
            tvAgeRestrict.setText(a4);
            getTvAgeRestrict().setVisibility(0);
        } else if (i2 == 4) {
            getBottomBtn().setTextColor(Color.parseColor("#161823"));
            TuxTextView bottomBtn6 = getBottomBtn();
            Context context6 = getContext();
            l.b(context6, "");
            bottomBtn6.setText(context6.getResources().getString(R.string.fyr));
            TuxTextView bottomBtn7 = getBottomBtn();
            com.bytedance.tux.c.e a5 = com.bytedance.tux.c.f.a(new f(this));
            Context context7 = getContext();
            l.b(context7, "");
            bottomBtn7.setBackground(a5.a(context7));
        } else if (i2 == 5) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn8 = getBottomBtn();
            Context context8 = getContext();
            l.b(context8, "");
            bottomBtn8.setText(context8.getResources().getString(R.string.fyt));
            TuxTextView bottomBtn9 = getBottomBtn();
            com.bytedance.tux.c.e a6 = com.bytedance.tux.c.f.a(g.f133479a);
            Context context9 = getContext();
            l.b(context9, "");
            bottomBtn9.setBackground(a6.a(context9));
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
