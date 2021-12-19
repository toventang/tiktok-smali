package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class r extends com.ss.android.ugc.aweme.ecommerce.common.a.a {

    /* renamed from: a  reason: collision with root package name */
    public g f85417a;

    /* renamed from: b  reason: collision with root package name */
    public c f85418b = new c(null, null, null, null, null, false, null, null, null, null, 1023);

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super n, z> f85419c = a.f85421a;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f85420d;

    static {
        Covode.recordClassIndex(53454);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f85420d == null) {
            this.f85420d = new SparseArray();
        }
        View view = (View) this.f85420d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85420d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f85420d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(53459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar, View view) {
            super(0);
            this.this$0 = rVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(53460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar, View view) {
            super(0);
            this.this$0 = rVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    /* renamed from: b */
    public final f getDialog() {
        Dialog dialog = super.getDialog();
        if (!(dialog instanceof f)) {
            dialog = null;
        }
        return (f) dialog;
    }

    public r() {
        super((byte) 0);
    }

    static final class a extends m implements h.f.a.b<n, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f85421a = new a();

        static {
            Covode.recordClassIndex(53455);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            l.d(nVar, "");
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<n, z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(53456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, View view) {
            super(1);
            this.this$0 = rVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            l.d(nVar, "");
            this.this$0.f85419c.invoke(nVar);
            return z.f158842a;
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f85418b = cVar;
    }

    public final void a(h.f.a.b<? super n, z> bVar) {
        l.d(bVar, "");
        this.f85419c = bVar;
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        f fVar = new f(context, getTheme());
        com.ss.android.ugc.aweme.ecommerce.router.m e2 = e();
        if (e2 != null) {
            fVar.a(e2);
        }
        return fVar;
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l, z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(53457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar, View view) {
            super(1);
            this.this$0 = rVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar) {
            f b2;
            BottomSheetBehavior<View> b3;
            boolean z;
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l lVar2 = lVar;
            l.d(lVar2, "");
            f b4 = this.this$0.getDialog();
            if (b4 != null) {
                if (lVar2 == com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.l.Close) {
                    z = true;
                } else {
                    z = false;
                }
                b4.f85385a = z;
            }
            int i2 = s.f85423a[lVar2.ordinal()];
            if (i2 == 1) {
                this.$view$inlined.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.r.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f85422a;

                    static {
                        Covode.recordClassIndex(53458);
                    }

                    {
                        this.f85422a = r1;
                    }

                    public final void run() {
                        BottomSheetBehavior<View> b2;
                        f b3 = this.f85422a.this$0.getDialog();
                        if (b3 != null && (b2 = b3.b()) != null) {
                            b2.c(5);
                        }
                    }
                });
            } else if (!(i2 != 2 || (b2 = this.this$0.getDialog()) == null || (b3 = b2.b()) == null)) {
                b3.c(3);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        g gVar = new g();
        gVar.a(new b(this, view));
        c cVar = this.f85418b;
        cVar.f85265f = true;
        gVar.a(cVar);
        c cVar2 = new c(this, view);
        l.d(cVar2, "");
        gVar.f85389d = cVar2;
        d dVar = new d(this, view);
        l.d(dVar, "");
        gVar.f85391j = dVar;
        e eVar = new e(this, view);
        l.d(eVar, "");
        gVar.f85392k = eVar;
        androidx.fragment.app.n a2 = getChildFragmentManager().a();
        FrameLayout frameLayout = (FrameLayout) a(R.id.b92);
        l.b(frameLayout, "");
        a2.a(frameLayout.getId(), gVar).c();
        this.f85417a = gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.oo, viewGroup, false);
    }
}
