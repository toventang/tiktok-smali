package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import com.bytedance.tux.sheet.sheet.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class c extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f131571h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f131572a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f131573b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f131574c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f131575d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f131576e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f131577f;

    /* renamed from: g  reason: collision with root package name */
    public j f131578g;

    /* renamed from: i  reason: collision with root package name */
    private int f131579i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f131580j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f131581k;

    static {
        Covode.recordClassIndex(86170);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86171);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(int i2, boolean z, j jVar) {
            l.d(jVar, "");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putInt("extra.PERMISSION", i2);
            bundle.putBoolean("extra.showTuxNavBarBack", z);
            cVar.setArguments(bundle);
            cVar.f131578g = jVar;
            return cVar;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(86172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.b.b(this.this$0);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$c  reason: collision with other inner class name */
    static final class C3420c extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(86173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3420c(c cVar) {
            super(0);
            this.this$0 = cVar;
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
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r1.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.c.C3420c.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131581k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a b2 = new TuxNavBar.a().b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<z>) new C3420c(this)));
        g gVar = new g();
        String string = getString(R.string.gig);
        l.b(string, "");
        TuxNavBar.a a2 = b2.a(gVar.a(string));
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("extra.showTuxNavBarBack", false)) {
            a2.a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_chevron_left_offset_ltr).a((h.f.a.a<z>) new b(this)));
        }
        return a2;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f131582a;

        static {
            Covode.recordClassIndex(86174);
        }

        d(c cVar) {
            this.f131582a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131582a.a(1);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f131583a;

        static {
            Covode.recordClassIndex(86175);
        }

        e(c cVar) {
            this.f131583a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131583a.a(0);
        }
    }

    public final void a(int i2) {
        this.f131579i = i2;
        b(i2);
        j jVar = this.f131578g;
        if (jVar != null) {
            jVar.a(this.f131579i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("extra.PERMISSION");
        } else {
            i2 = 0;
        }
        this.f131579i = i2;
    }

    private final void b(int i2) {
        if (i2 != 0 || this.f131580j) {
            ImageView imageView = this.f131575d;
            if (imageView == null) {
                l.a("mImgPermissionPublic");
            }
            Drawable drawable = this.f131577f;
            if (drawable == null) {
                l.a("mImgNormal");
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = this.f131574c;
            if (imageView2 == null) {
                l.a("mImgPermissionAdv");
            }
            Drawable drawable2 = this.f131576e;
            if (drawable2 == null) {
                l.a("mImgSelected");
            }
            imageView2.setImageDrawable(drawable2);
            return;
        }
        ImageView imageView3 = this.f131575d;
        if (imageView3 == null) {
            l.a("mImgPermissionPublic");
        }
        Drawable drawable3 = this.f131576e;
        if (drawable3 == null) {
            l.a("mImgSelected");
        }
        imageView3.setImageDrawable(drawable3);
        ImageView imageView4 = this.f131574c;
        if (imageView4 == null) {
            l.a("mImgPermissionAdv");
        }
        Drawable drawable4 = this.f131577f;
        if (drawable4 == null) {
            l.a("mImgNormal");
        }
        imageView4.setImageDrawable(drawable4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.c6v);
        l.b(findViewById, "");
        this.f131572a = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.c6z);
        l.b(findViewById2, "");
        this.f131573b = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.d37);
        l.b(findViewById3, "");
        this.f131574c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.d3k);
        l.b(findViewById4, "");
        this.f131575d = (ImageView) findViewById4;
        Drawable drawable = getResources().getDrawable(2131232484);
        l.b(drawable, "");
        this.f131576e = drawable;
        Drawable drawable2 = getResources().getDrawable(R.drawable.hb);
        l.b(drawable2, "");
        this.f131577f = drawable2;
        LinearLayout linearLayout = this.f131572a;
        if (linearLayout == null) {
            l.a("mPermissionAdvLayout");
        }
        linearLayout.setOnClickListener(new d(this));
        LinearLayout linearLayout2 = this.f131573b;
        if (linearLayout2 == null) {
            l.a("mPermissionPublicLayout");
        }
        linearLayout2.setOnClickListener(new e(this));
        LinearLayout linearLayout3 = this.f131572a;
        if (linearLayout3 == null) {
            l.a("mPermissionAdvLayout");
        }
        linearLayout3.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        LinearLayout linearLayout4 = this.f131573b;
        if (linearLayout4 == null) {
            l.a("mPermissionPublicLayout");
        }
        linearLayout4.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
        boolean z = true;
        if (e2 == null || !e2.e()) {
            z = false;
        }
        this.f131580j = z;
        if (z) {
            LinearLayout linearLayout5 = this.f131573b;
            if (linearLayout5 == null) {
                l.a("mPermissionPublicLayout");
            }
            linearLayout5.setVisibility(8);
        }
        b(this.f131579i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0o, viewGroup, false);
    }
}
