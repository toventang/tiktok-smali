package com.ss.android.ugc.aweme.setting.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class u extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final a f122919b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f122920a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f122921c;

    public interface b {
        static {
            Covode.recordClassIndex(80702);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(80700);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80701);
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
        SparseArray sparseArray = this.f122921c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f122924a;

        static {
            Covode.recordClassIndex(80705);
        }

        e(u uVar) {
            this.f122924a = uVar;
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
                com.ss.android.ugc.aweme.setting.ui.u r0 = r1.f122924a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.u.e.onClick(android.view.View):void");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f122922a;

        static {
            Covode.recordClassIndex(80703);
        }

        c(u uVar) {
            this.f122922a = uVar;
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
                com.ss.android.ugc.aweme.setting.ui.u r0 = r1.f122922a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                com.ss.android.ugc.aweme.setting.ui.u r0 = r1.f122922a
                com.ss.android.ugc.aweme.setting.ui.u$b r0 = r0.f122920a
                if (r0 == 0) goto L_0x0011
                r0.b()
            L_0x0011:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.u.c.onClick(android.view.View):void");
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f122923a;

        static {
            Covode.recordClassIndex(80704);
        }

        d(u uVar) {
            this.f122923a = uVar;
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
                com.ss.android.ugc.aweme.setting.ui.u r0 = r1.f122923a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                com.ss.android.ugc.aweme.setting.ui.u r0 = r1.f122923a
                com.ss.android.ugc.aweme.setting.ui.u$b r0 = r0.f122920a
                if (r0 == 0) goto L_0x0011
                r0.a()
            L_0x0011:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.u.d.onClick(android.view.View):void");
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            r0 = 2131368913(0x7f0a1bd1, float:1.835779E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            com.ss.android.ugc.aweme.setting.ui.u$c r0 = new com.ss.android.ugc.aweme.setting.ui.u$c
            r0.<init>(r2)
            r1.setOnClickListener(r0)
            r0 = 2131366267(0x7f0a117b, float:1.8352423E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            com.ss.android.ugc.aweme.setting.ui.u$d r0 = new com.ss.android.ugc.aweme.setting.ui.u$d
            r0.<init>(r2)
            r1.setOnClickListener(r0)
            r0 = 2131362848(0x7f0a0420, float:1.8345488E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            com.ss.android.ugc.aweme.setting.ui.u$e r0 = new com.ss.android.ugc.aweme.setting.ui.u$e
            r0.<init>(r2)
            r1.setOnClickListener(r0)
            com.ss.android.ugc.aweme.setting.ui.u$b r0 = r2.f122920a
            if (r0 != 0) goto L_0x0040
            r0 = r2
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.u.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.azb, viewGroup, false);
    }
}
