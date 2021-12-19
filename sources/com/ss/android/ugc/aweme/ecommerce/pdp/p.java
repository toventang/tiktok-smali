package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.ecommerce.common.c;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.z;
import java.util.ArrayList;

public final class p extends c implements com.bytedance.tux.navigation.a {

    /* renamed from: a  reason: collision with root package name */
    public static d<? super z> f86532a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f86533b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f86534c;

    static {
        Covode.recordClassIndex(54207);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.c
    public final View c() {
        if (this.f86534c == null) {
            this.f86534c = new SparseArray();
        }
        View view = (View) this.f86534c.get(R.id.dtb);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dtb);
        this.f86534c.put(R.id.dtb, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.c
    public final void d() {
        SparseArray sparseArray = this.f86534c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.ecommerce.common.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        d();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54208);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(54209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.ecommerce.pdp.p r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.p.b.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d<? super z> dVar = f86532a;
        if (dVar != null) {
            dVar.resumeWith(q.m223constructorimpl(z.f158842a));
        }
        f86532a = null;
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.bgn);
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
        a3.f45194b = true;
        return a2.b(a3.a((h.f.a.a<z>) new b(this)));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        k a2 = k.a.a(getActivity());
        if (a2 != null) {
            long b2 = b();
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            a2.a("specifications", b2, str);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(7926);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Specification[] specificationArr = null;
        Parcelable[] parcelableArray = arguments != null ? arguments.getParcelableArray("data") : null;
        if (parcelableArray instanceof Specification[]) {
            specificationArr = parcelableArray;
        }
        Specification[] specificationArr2 = specificationArr;
        if (specificationArr2 != null) {
            ArrayList<com.ss.android.ugc.aweme.ecommerce.pdp.view.c> arrayList = new ArrayList(specificationArr2.length);
            for (Specification specification : specificationArr2) {
                Context context = view.getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.ecommerce.pdp.view.c cVar = new com.ss.android.ugc.aweme.ecommerce.pdp.view.c(context, (byte) 0);
                int i2 = h.f87571e;
                cVar.setTitle(specification.f86667a);
                cVar.setDesc(specification.f86668b);
                cVar.setPadding(i2, i2, i2, i2);
                arrayList.add(cVar);
            }
            for (com.ss.android.ugc.aweme.ecommerce.pdp.view.c cVar2 : arrayList) {
                ((LinearLayout) c()).addView(cVar2);
            }
        }
        k a2 = k.a.a(getActivity());
        if (a2 != null) {
            a2.a((k) "specifications", (String) ((Boolean) null));
            MethodCollector.o(7926);
            return;
        }
        MethodCollector.o(7926);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(getContext(), R.layout.pi, viewGroup, false);
    }
}
