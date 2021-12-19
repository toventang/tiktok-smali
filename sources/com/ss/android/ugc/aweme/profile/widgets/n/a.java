package com.ss.android.ugc.aweme.profile.widgets.n;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.experiment.g;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public View f117947j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f117948k;

    static {
        Covode.recordClassIndex(76444);
    }

    public final View u() {
        if (this.f117948k == null) {
            this.f117948k = new SparseArray();
        }
        View view = (View) this.f117948k.get(R.id.i2);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.i2);
        this.f117948k.put(R.id.i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        this.f117947j = view.findViewById(R.id.fdc);
        d.a(this, new C3005a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.n.a$a  reason: collision with other inner class name */
    static final class C3005a extends m implements b<Assembler, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3005a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f117949a);
            assembler2.b(this.this$0, new b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.n.a.C3005a.AnonymousClass2 */
                final /* synthetic */ C3005a this$0;

                static {
                    Covode.recordClassIndex(76447);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.e.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.e.a();
                    qVar2.f25599e = this.this$0.this$0.f117947j;
                    return z.f158842a;
                }
            });
            if (g.a()) {
                assembler2.b(this.this$0, new b<q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.n.a.C3005a.AnonymousClass3 */
                    final /* synthetic */ C3005a this$0;

                    static {
                        Covode.recordClassIndex(76448);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(q qVar) {
                        q qVar2 = qVar;
                        l.d(qVar2, "");
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.b.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.b();
                        AdvancedFeaturesHorizontalScrollView advancedFeaturesHorizontalScrollView = (AdvancedFeaturesHorizontalScrollView) this.this$0.this$0.u();
                        l.b(advancedFeaturesHorizontalScrollView, "");
                        advancedFeaturesHorizontalScrollView.setVisibility(0);
                        qVar2.f25599e = (AdvancedFeaturesHorizontalScrollView) this.this$0.this$0.u();
                        return z.f158842a;
                    }
                });
            } else {
                assembler2.b(this.this$0, AnonymousClass4.f117950a);
                assembler2.b(this.this$0, AnonymousClass5.f117951a);
                assembler2.b(this.this$0, AnonymousClass6.f117952a);
                assembler2.b(this.this$0, AnonymousClass7.f117953a);
                assembler2.b(this.this$0, AnonymousClass8.f117954a);
                assembler2.b(this.this$0, AnonymousClass9.f117955a);
            }
            return z.f158842a;
        }
    }
}
