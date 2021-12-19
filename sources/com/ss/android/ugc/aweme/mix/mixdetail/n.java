package com.ss.android.ugc.aweme.mix.mixdetail;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class n extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final a f110018b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f110019a;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f110020c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f110021d;

    static {
        Covode.recordClassIndex(70537);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70538);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f110021d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f110024a;

        static {
            Covode.recordClassIndex(70540);
        }

        c(n nVar) {
            this.f110024a = nVar;
        }

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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r1.f110024a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.n.c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_current_aweme");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        this.f110019a = (Aweme) serializable;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f110022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f110023b;

        static {
            Covode.recordClassIndex(70539);
        }

        b(n nVar, View view) {
            this.f110022a = nVar;
            this.f110023b = view;
        }

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
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r8)
                com.ss.android.ugc.aweme.share.ShareDependService r1 = com.ss.android.ugc.aweme.share.ShareDependService.a.a()
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r7.f110022a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f110019a
                if (r2 != 0) goto L_0x0012
                java.lang.String r0 = "aweme"
                h.f.b.l.a(r0)
            L_0x0012:
                android.view.View r0 = r7.f110023b
                android.content.Context r4 = r0.getContext()
                java.lang.String r0 = ""
                h.f.b.l.b(r4, r0)
                java.lang.String r3 = ""
                java.lang.String r5 = "long_press"
                java.lang.String r6 = ""
                r1.a(r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.mix.mixdetail.n r0 = r7.f110022a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.n.b.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.dqp);
        l.b(findViewById, "");
        this.f110020c = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.dlo);
        l.b(findViewById2, "");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        Aweme aweme = this.f110019a;
        if (aweme == null) {
            l.a("aweme");
        }
        aweme.setAwemeType(300);
        linearLayout.setOnClickListener(new b(this, view));
        View findViewById3 = view.findViewById(R.id.a1p);
        l.b(findViewById3, "");
        ((TuxTextView) findViewById3).setOnClickListener(new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.akz, viewGroup, false);
        if (a2 == null) {
            l.b();
        }
        return a2;
    }
}
