package com.ss.android.ugc.aweme.prop.b;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: b  reason: collision with root package name */
    public static int f118226b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f118227c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f118228a;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f118229d;

    static {
        Covode.recordClassIndex(76773);
    }

    private View b(int i2) {
        if (this.f118229d == null) {
            this.f118229d = new SparseArray();
        }
        View view = (View) this.f118229d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f118229d.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76774);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.bytedance.tux.navigation.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118230a;

        static {
            Covode.recordClassIndex(76775);
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
        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.prop.b.d r0 = r1.f118230a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.b.d.b.a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(d dVar) {
            this.f118230a = dVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f118229d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.c50);
        l.b(string, "");
        return aVar.a(gVar.a(string)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((com.bytedance.tux.navigation.a.d) new b(this)));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118231a;

        static {
            Covode.recordClassIndex(76776);
        }

        c(d dVar) {
            this.f118231a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f118231a.a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.b.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC3020d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118232a;

        static {
            Covode.recordClassIndex(76777);
        }

        View$OnClickListenerC3020d(d dVar) {
            this.f118232a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f118232a.a(3);
        }
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
    public final void a(int r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.prop.b.d.f118226b = r4
            r0 = 2131365613(0x7f0a0eed, float:1.8351096E38)
            android.view.View r1 = r3.b(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131233752(0x7f080bd8, float:1.808365E38)
            r0 = 2131233754(0x7f080bda, float:1.8083654E38)
            if (r4 != 0) goto L_0x003a
            r0 = 2131233752(0x7f080bd8, float:1.808365E38)
        L_0x0016:
            r1.setImageResource(r0)
            r0 = 2131365614(0x7f0a0eee, float:1.8351098E38)
            android.view.View r1 = r3.b(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 3
            if (r4 != r0) goto L_0x0036
        L_0x0025:
            r1.setImageResource(r2)
            com.ss.android.ugc.aweme.prop.b.a r1 = r3.f118228a
            if (r1 == 0) goto L_0x0031
            int r0 = com.ss.android.ugc.aweme.prop.b.d.f118226b
            r1.a(r0)
        L_0x0031:
            r0 = r3
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            return
        L_0x0036:
            r2 = 2131233754(0x7f080bda, float:1.8083654E38)
            goto L_0x0025
        L_0x003a:
            r0 = 2131233754(0x7f080bda, float:1.8083654E38)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.b.d.a(int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) b(R.id.c5p);
        l.b(linearLayout, "");
        linearLayout.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        LinearLayout linearLayout2 = (LinearLayout) b(R.id.c5q);
        l.b(linearLayout2, "");
        linearLayout2.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        ImageView imageView = (ImageView) b(R.id.c2g);
        int i3 = f118226b;
        int i4 = R.drawable.bh7;
        if (i3 == 0) {
            i2 = R.drawable.bh7;
        } else {
            i2 = R.drawable.bh9;
        }
        imageView.setImageResource(i2);
        ImageView imageView2 = (ImageView) b(R.id.c2h);
        if (f118226b != 3) {
            i4 = R.drawable.bh9;
        }
        imageView2.setImageResource(i4);
        ((LinearLayout) b(R.id.c5p)).setOnClickListener(new c(this));
        ((LinearLayout) b(R.id.c5q)).setOnClickListener(new View$OnClickListenerC3020d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.akd, viewGroup, false);
    }
}
