package com.ss.android.ugc.aweme.im.sdk.share.ui.nested;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.share.data.a.c;
import com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.z;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class a extends Dialog implements com.ss.android.ugc.aweme.im.sdk.share.b.a.b {

    /* renamed from: h  reason: collision with root package name */
    public static final C2640a f103674h = new C2640a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final SharePackage f103675a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.lifecycle.m f103676b;

    /* renamed from: c  reason: collision with root package name */
    public final ShareDialogViewModel f103677c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d f103678d;

    /* renamed from: e  reason: collision with root package name */
    final h.h f103679e;

    /* renamed from: f  reason: collision with root package name */
    final Activity f103680f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.aweme.im.service.share.a.b f103681g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f103682i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.share.data.a.b f103683j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f103684k = h.i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.share.c f103685l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sharer.ui.e f103686m;

    static {
        Covode.recordClassIndex(66425);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c a() {
        return (com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c) this.f103684k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$a  reason: collision with other inner class name */
    public static final class C2640a {
        static {
            Covode.recordClassIndex(66426);
        }

        private C2640a() {
        }

        public /* synthetic */ C2640a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return com.a.a(LayoutInflater.from(this.this$0.getContext()), R.layout.a7o, (ViewGroup) this.this$0.findViewById(R.id.e1o), false);
        }
    }

    private static boolean b() {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy().d() || com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy().c()) {
            return true;
        }
        return false;
    }

    static final /* synthetic */ class b extends h.f.b.j implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c> {
        static {
            Covode.recordClassIndex(66427);
        }

        b(a aVar) {
            super(0, aVar, a.class, "createShareTextBubbleComponent", "createShareTextBubbleComponent()Lcom/ss/android/ugc/aweme/im/sdk/share/ui/textbox/ShareTextBoxBubbleComponent;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c invoke() {
            a aVar = (a) this.receiver;
            Activity activity = aVar.f103680f;
            ShareDialogViewModel shareDialogViewModel = aVar.f103677c;
            ShareNestedLayout shareNestedLayout = (ShareNestedLayout) aVar.findViewById(R.id.e1o);
            h.f.b.l.b(shareNestedLayout, "");
            SharePackage sharePackage = aVar.f103675a;
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = aVar.f103681g;
            androidx.lifecycle.m mVar = aVar.f103676b;
            View view = (View) aVar.f103679e.getValue();
            h.f.b.l.d(activity, "");
            h.f.b.l.d(shareDialogViewModel, "");
            h.f.b.l.d(shareNestedLayout, "");
            h.f.b.l.d(sharePackage, "");
            h.f.b.l.d(mVar, "");
            h.f.b.l.d(view, "");
            t<Boolean> tVar = shareDialogViewModel.f103765g;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bd9);
            h.f.b.l.b(linearLayout, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.a5_);
            h.f.b.l.b(tuxCheckBox, "");
            ShareTextBoxViewModel shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, bVar, aVar, tVar, new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b(linearLayout, tuxCheckBox));
            return new com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c(shareNestedLayout, view, shareTextBoxViewModel, new com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d(activity, view, sharePackage, shareTextBoxViewModel, mVar));
        }
    }

    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.c(view);
        com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b bVar = a().f103721a;
        if (bVar != null) {
            bVar.a(0);
        }
        u.f102444a.clear();
        if (this.f103680f.isDestroyed() || this.f103680f.isFinishing()) {
            com.ss.android.ugc.aweme.im.service.m.a.e("nested_share_dialog", "Dialog is dismissed after activity terminated, isDestroyed: " + this.f103680f.isDestroyed() + ", isFinishing: " + this.f103680f.isFinishing() + ", host activity: " + this.f103680f.getLocalClassName());
        } else {
            super.dismiss();
        }
        com.ss.android.ugc.aweme.sharer.ui.f fVar = this.f103686m.f124660l;
        if (fVar != null) {
            fVar.a(this.f103675a, this.f103680f);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void b(boolean z) {
        this.f103682i = z;
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103694a;

        static {
            Covode.recordClassIndex(66435);
        }

        j(a aVar) {
            this.f103694a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103694a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void a(boolean z) {
        this.f103678d.a(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void c(boolean z) {
        this.f103678d.e(z);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103687a;

        static {
            Covode.recordClassIndex(66429);
        }

        d(a aVar) {
            this.f103687a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103687a.dismiss();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(66432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.this$0.dismiss();
            }
            return z.f158842a;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103690a;

        static {
            Covode.recordClassIndex(66431);
        }

        f(a aVar) {
            this.f103690a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103690a.f103677c.f103764f.postValue(true);
        }
    }

    static final class l<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103696a;

        static {
            Covode.recordClassIndex(66437);
        }

        l(a aVar) {
            this.f103696a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103696a.dismiss();
            SmartRouter.buildRoute(this.f103696a.getContext(), "//friends/find").withParam("previous_page", "share_page").open();
        }
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103697a;

        static {
            Covode.recordClassIndex(66438);
        }

        m(a aVar) {
            this.f103697a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View findViewById;
            int i2;
            Boolean bool = (Boolean) obj;
            View view = ((com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b) this.f103697a.f103678d).f103204b;
            if (view != null && (findViewById = view.findViewById(R.id.cjq)) != null) {
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
        }
    }

    static final class h<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareDialogViewModel f103691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f103692b;

        static {
            Covode.recordClassIndex(66433);
        }

        h(ShareDialogViewModel shareDialogViewModel, a aVar) {
            this.f103691a = shareDialogViewModel;
            this.f103692b = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            if (r0 < r3) goto L_0x0040;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a r5 = r6.f103692b
                java.lang.String r0 = ""
                h.f.b.l.b(r7, r0)
                h.f.b.l.d(r7, r0)
                boolean r0 = com.ss.android.ugc.aweme.im.service.c.c.a()
                if (r0 == 0) goto L_0x0053
                java.util.List r0 = h.f.b.ad.d(r7)
                java.util.List r4 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a(r0)
            L_0x001a:
                r3 = 0
                if (r4 == 0) goto L_0x0023
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x0024
            L_0x0023:
                return
            L_0x0024:
                r2 = 15
                java.util.List r0 = h.a.n.d(r4, r2)
                java.util.List r1 = h.a.n.g(r0)
                int r0 = r4.size()
                if (r0 > r2) goto L_0x0040
                int r0 = r4.size()
                if (r7 == 0) goto L_0x003e
                int r3 = r7.size()
            L_0x003e:
                if (r0 >= r3) goto L_0x0048
            L_0x0040:
                com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a r0 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a
                r0.<init>()
                r1.add(r0)
            L_0x0048:
                com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d r0 = r5.f103678d
                r0.e(r1)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r5.f103675a
                com.ss.android.ugc.aweme.im.sdk.share.a.a.a(r0)
                goto L_0x0023
            L_0x0053:
                r4 = r7
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.h.onChanged(java.lang.Object):void");
        }
    }

    static final class k<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103695a;

        static {
            Covode.recordClassIndex(66436);
        }

        k(a aVar) {
            this.f103695a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            HashSet hashSet;
            this.f103695a.dismiss();
            a aVar = this.f103695a;
            aVar.f103675a.f124595i.putString("enter_method", "more");
            Activity activity = aVar.f103680f;
            List<IMContact> value = aVar.f103677c.f103762d.getValue();
            if (value != null) {
                hashSet = n.j((Iterable) value);
            } else {
                hashSet = null;
            }
            com.ss.android.ugc.aweme.im.sdk.share.ui.b.a.a(activity, aVar.f103675a, (Set) hashSet, false, (com.ss.android.ugc.aweme.im.service.share.a.a) null, false, (com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c) null, 244).show();
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = aVar.f103681g;
            if (bVar != null) {
                bVar.a("chat_merge", aVar.f103675a);
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(aVar.f103675a, "button");
            com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, aVar.f103675a, null, true, null, 0, null, null, 120);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(boolean z) {
        int i2;
        if (!z) {
            i2 = 0;
        } else if (this.f103682i) {
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 180.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            i2 = a2 + h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
        } else {
            Resources system3 = Resources.getSystem();
            h.f.b.l.a((Object) system3, "");
            i2 = h.g.a.a(TypedValue.applyDimension(1, 180.0f, system3.getDisplayMetrics()));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ad5);
        h.f.b.l.b(recyclerView, "");
        int paddingLeft = recyclerView.getPaddingLeft();
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.ad5);
        h.f.b.l.b(recyclerView2, "");
        int paddingTop = recyclerView2.getPaddingTop();
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.ad5);
        h.f.b.l.b(recyclerView3, "");
        int paddingRight = recyclerView3.getPaddingRight();
        Resources system4 = Resources.getSystem();
        h.f.b.l.a((Object) system4, "");
        ((RecyclerView) findViewById(R.id.ad5)).setPadding(paddingLeft, paddingTop, paddingRight, i2 + h.g.a.a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics())));
    }

    static final class i<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103693a;

        static {
            Covode.recordClassIndex(66434);
        }

        i(a aVar) {
            this.f103693a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            int i2;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            MethodCollector.i(6482);
            List<? extends IMContact> list = (List) obj;
            a aVar = this.f103693a;
            h.f.b.l.b(list, "");
            com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.c a2 = aVar.a();
            h.f.b.l.d(list, "");
            a2.f103724d.a(list);
            if (!list.isEmpty()) {
                if (a2.f103721a == null) {
                    a2.f103723c.setVisibility(0);
                    b.a aVar2 = new b.a();
                    aVar2.f102622f = a2.f103722b;
                    aVar2.f102621e = a2.f103723c;
                    aVar2.f102617a = 2;
                    aVar2.f102618b = 0;
                    aVar2.f102619c = 0;
                    aVar2.f102620d = 0;
                    if (aVar2.f102621e == null) {
                        RuntimeException runtimeException = new RuntimeException("BubbleView cannot be null!!!");
                        MethodCollector.o(6482);
                        throw runtimeException;
                    } else if (aVar2.f102622f != null) {
                        com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b bVar = new com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b(aVar2.f102621e, aVar2.f102622f, aVar2.f102623g, aVar2.f102624h, aVar2.f102617a, aVar2.f102618b, aVar2.f102619c, aVar2.f102620d, (byte) 0);
                        bVar.f102610k = aVar2.f102625i;
                        bVar.f102611l = aVar2.f102626j;
                        if (bVar.f102611l && bVar.f102612m == null) {
                            bVar.f102612m = new FrameLayout(bVar.f102608i.getContext());
                            bVar.f102612m.setOnClickListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008b: INVOKE  
                                  (wrap: android.view.View : 0x0084: IGET  (r6v3 android.view.View) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.m android.view.View)
                                  (wrap: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4 : 0x0088: CONSTRUCTOR  (r5v13 com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) call: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.4.<init>(com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.i.onChanged(java.lang.Object):void, file: classes5.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0088: CONSTRUCTOR  (r5v13 com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) call: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.4.<init>(com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.i.onChanged(java.lang.Object):void, file: classes5.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 36 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 42 more
                                */
                            /*
                            // Method dump skipped, instructions count: 288
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.i.onChanged(java.lang.Object):void");
                        }
                    }

                    /* access modifiers changed from: protected */
                    public final void onCreate(Bundle bundle) {
                        MethodCollector.i(6251);
                        super.onCreate(bundle);
                        setContentView(R.layout.a7l);
                        b.a aVar = com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a;
                        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ad5);
                        h.f.b.l.b(recyclerView, "");
                        aVar.a(recyclerView, "nested_share_dialog");
                        Window window = getWindow();
                        if (window != null) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                window.setStatusBarColor(0);
                            }
                            window.setLayout(-1, -1);
                            window.setSoftInputMode(16);
                        }
                        ((TuxIconView) findViewById(R.id.cny)).setOnClickListener(new d(this));
                        if (b()) {
                            ((ShareNestedLayout) findViewById(R.id.e1o)).a(false, 0.0f);
                            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.aea);
                            h.f.b.l.b(linearLayout, "");
                            linearLayout.getLayoutParams().height = -2;
                        } else {
                            float a2 = ((float) com.ss.android.ugc.aweme.base.utils.i.a(getContext())) * 0.7f;
                            ((ShareNestedLayout) findViewById(R.id.e1o)).a(true, a2);
                            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.aea);
                            h.f.b.l.b(linearLayout2, "");
                            linearLayout2.getLayoutParams().height = h.g.a.a(a2);
                        }
                        ((LinearLayout) findViewById(R.id.aea)).requestLayout();
                        ((ShareNestedLayout) findViewById(R.id.e1o)).setVisibleChangedListener(new g(this));
                        ShareNestedLayout shareNestedLayout = (ShareNestedLayout) findViewById(R.id.e1o);
                        shareNestedLayout.getAppBar().a(new ShareNestedLayout.p(shareNestedLayout));
                        shareNestedLayout.a(true, true);
                        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.ad5);
                        recyclerView2.getContext();
                        recyclerView2.setLayoutManager(new LinearLayoutManager());
                        recyclerView2.setAdapter(this.f103678d);
                        recyclerView2.a(new e(recyclerView2, recyclerView2.getContext(), this));
                        if (com.ss.android.ugc.aweme.im.service.c.k.b() && this.f103685l.f103959d != null) {
                            ((FrameLayout) findViewById(R.id.bk0)).addView(this.f103685l.f103959d);
                            LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.bjz);
                            h.f.b.l.b(linearLayout3, "");
                            linearLayout3.setVisibility(0);
                        }
                        if (this.f103685l.f103956a != null) {
                            LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.bk5);
                            h.f.b.l.b(linearLayout4, "");
                            linearLayout4.setVisibility(0);
                            View findViewById = findViewById(R.id.bk4);
                            h.f.b.l.b(findViewById, "");
                            findViewById.setVisibility(0);
                            ((FrameLayout) findViewById(R.id.bk7)).addView(this.f103685l.f103956a);
                        }
                        View a3 = com.a.a(LayoutInflater.from(getContext()), R.layout.a4g, (ViewGroup) findViewById(R.id.ad5), false);
                        a3.findViewById(R.id.cjq).setOnClickListener(new f(this));
                        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d dVar = this.f103678d;
                        h.f.b.l.b(a3, "");
                        dVar.c(a3);
                        if (b()) {
                            RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.ad5);
                            h.f.b.l.b(recyclerView3, "");
                            recyclerView3.setVisibility(8);
                            TuxStatusView tuxStatusView = (TuxStatusView) findViewById(R.id.e_o);
                            h.f.b.l.b(tuxStatusView, "");
                            tuxStatusView.setVisibility(8);
                            MethodCollector.o(6251);
                            return;
                        }
                        this.f103683j.e();
                        ShareDialogViewModel shareDialogViewModel = this.f103677c;
                        shareDialogViewModel.f103761c.observe(this.f103676b, new h(shareDialogViewModel, this));
                        shareDialogViewModel.f103762d.observe(this.f103676b, new i(this));
                        shareDialogViewModel.f103765g.observe(this.f103676b, new j(this));
                        shareDialogViewModel.f103763e.observe(this.f103676b, new k(this));
                        shareDialogViewModel.f103764f.observe(this.f103676b, new l(this));
                        shareDialogViewModel.f103766h.observe(this.f103676b, new m(this));
                        shareDialogViewModel.a(0);
                        shareDialogViewModel.d();
                        TuxStatusView tuxStatusView2 = (TuxStatusView) findViewById(R.id.e_o);
                        h.f.b.l.b(tuxStatusView2, "");
                        new com.ss.android.ugc.aweme.im.sdk.share.ui.a.a(tuxStatusView2, this.f103680f, this.f103677c, this.f103676b);
                        MethodCollector.o(6251);
                    }

                    public static final class e extends com.ss.android.ugc.aweme.framework.b.a {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ RecyclerView f103688a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ a f103689b;

                        static {
                            Covode.recordClassIndex(66430);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
                        public final void a(RecyclerView recyclerView, int i2) {
                            View view;
                            h.f.b.l.d(recyclerView, "");
                            super.a(recyclerView, i2);
                            if (i2 == 1) {
                                Window window = this.f103689b.getWindow();
                                if (window != null) {
                                    view = window.getCurrentFocus();
                                } else {
                                    view = null;
                                }
                                KeyboardUtils.c(view);
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        e(RecyclerView recyclerView, Context context, a aVar) {
                            super(context);
                            this.f103688a = recyclerView;
                            this.f103689b = aVar;
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public a(Activity activity, com.ss.android.ugc.aweme.im.service.share.c cVar, com.ss.android.ugc.aweme.im.service.share.a.b bVar, com.ss.android.ugc.aweme.sharer.ui.e eVar, int i2) {
                        super(activity, i2);
                        h.f.b.l.d(activity, "");
                        h.f.b.l.d(cVar, "");
                        h.f.b.l.d(eVar, "");
                        this.f103680f = activity;
                        this.f103685l = cVar;
                        this.f103681g = bVar;
                        this.f103686m = eVar;
                        SharePackage sharePackage = eVar.f124657i;
                        this.f103675a = sharePackage;
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        this.f103676b = (androidx.appcompat.app.d) activity;
                        com.ss.android.ugc.aweme.im.sdk.share.data.a.c a2 = c.a.a(eVar.f124657i.f124590d, true, c.b.NORMAL);
                        this.f103683j = a2;
                        ShareDialogViewModel shareDialogViewModel = new ShareDialogViewModel(sharePackage, a2, bVar);
                        this.f103677c = shareDialogViewModel;
                        this.f103678d = new com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d(sharePackage, shareDialogViewModel);
                        this.f103679e = h.i.a((h.f.a.a) new c(this));
                        com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a.a("nested_share_dialog");
                    }
                }
