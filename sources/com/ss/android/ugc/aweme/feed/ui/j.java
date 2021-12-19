package com.ss.android.ugc.aweme.feed.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f94809c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f94810a;

    /* renamed from: b  reason: collision with root package name */
    public s<ag> f94811b;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f94812d;

    static {
        Covode.recordClassIndex(60142);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60143);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(e eVar, Aweme aweme, s<ag> sVar) {
            l.d(eVar, "");
            l.d(sVar, "");
            j jVar = new j();
            jVar.f94810a = aweme;
            jVar.f94811b = sVar;
            new a.C1112a().a(jVar).a(false).a(1).f45299a.show(eVar.getSupportFragmentManager(), "DeleteFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f94812d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f94814a;

        static {
            Covode.recordClassIndex(60145);
        }

        c(j jVar) {
            this.f94814a = jVar;
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
                com.ss.android.ugc.aweme.feed.ui.j r0 = r1.f94814a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.j.c.onClick(android.view.View):void");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f94813a;

        static {
            Covode.recordClassIndex(60144);
        }

        b(j jVar) {
            this.f94813a = jVar;
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
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.feed.ui.j r3 = r4.f94813a
                android.content.Context r2 = r3.getContext()
                if (r2 != 0) goto L_0x0011
            L_0x000b:
                com.ss.android.ugc.aweme.feed.ui.j r0 = r4.f94813a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            L_0x0011:
                java.lang.String r0 = ""
                h.f.b.l.b(r2, r0)
                com.bytedance.tux.dialog.e r1 = new com.bytedance.tux.dialog.e
                r1.<init>(r2)
                r0 = 2131823191(0x7f110a57, float:1.9279175E38)
                com.bytedance.tux.dialog.internal.b r1 = r1.a(r0)
                r0 = 1
                com.bytedance.tux.dialog.internal.b r2 = r1.a(r0)
                com.bytedance.tux.dialog.e r2 = (com.bytedance.tux.dialog.e) r2
                r1 = 2131823188(0x7f110a54, float:1.9279169E38)
                com.ss.android.ugc.aweme.feed.ui.j$d r0 = new com.ss.android.ugc.aweme.feed.ui.j$d
                r0.<init>(r3)
                com.bytedance.tux.dialog.e r0 = r2.a(r1, r0)
                com.bytedance.tux.dialog.e r0 = com.bytedance.tux.dialog.e.a(r0)
                com.bytedance.tux.dialog.d r0 = r0.a()
                android.app.Dialog r0 = r0.b()
                r0.show()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.j.b.onClick(android.view.View):void");
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f94815a;

        static {
            Covode.recordClassIndex(60146);
        }

        d(j jVar) {
            this.f94815a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            s<ag> sVar = this.f94815a.f94811b;
            if (sVar != null) {
                sVar.a(new ag(2, this.f94815a.f94810a));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.fbn)).setImageResource(2131233137);
        ((TextView) view.findViewById(R.id.fbo)).setText(R.string.b5g);
        view.findViewById(R.id.fbp).setOnClickListener(new b(this));
        view.findViewById(R.id.fbm).setOnClickListener(new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ry, viewGroup, false);
    }
}
