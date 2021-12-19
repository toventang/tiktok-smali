package com.ss.android.ugc.aweme.homepage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.j;
import com.ss.android.ugc.aweme.base.ui.k;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public HomePageDataViewModel f99100a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f99101b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollSwitchStateManager f99102c;

    /* renamed from: d  reason: collision with root package name */
    public ScrollableViewPager f99103d;

    /* renamed from: e  reason: collision with root package name */
    public p f99104e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f99105f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f99106g;

    /* renamed from: h  reason: collision with root package name */
    private c f99107h = new c();

    static {
        Covode.recordClassIndex(63139);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f99115a;

        static {
            Covode.recordClassIndex(63146);
        }

        g(androidx.fragment.app.e eVar) {
            this.f99115a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.k
        public final void a() {
            ScrollSwitchStateManager.a.a(this.f99115a).a(com.ss.android.ugc.aweme.homepage.api.interaction.c.INSTANCE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$a  reason: collision with other inner class name */
    public static final class C2417a implements com.ss.android.ugc.aweme.homepage.api.interaction.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99108a;

        static {
            Covode.recordClassIndex(63140);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r0 == null) goto L_0x0010;
         */
        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.homepage.a r0 = r1.f99108a
                com.ss.android.ugc.aweme.base.ui.ScrollableViewPager r0 = r0.f99103d
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getCurrentItem()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                if (r0 != 0) goto L_0x0013
            L_0x0010:
                h.f.b.l.b()
            L_0x0013:
                int r0 = r0.intValue()
                return r0
            L_0x0018:
                r0 = 0
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.a.C2417a.a():int");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2417a(a aVar) {
            this.f99108a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        public final void a(int i2) {
            ScrollableViewPager scrollableViewPager = this.f99108a.f99103d;
            if (scrollableViewPager != null) {
                scrollableViewPager.setCurrentItem(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.api.interaction.b
        public final void a(int i2, boolean z) {
            ScrollableViewPager scrollableViewPager = this.f99108a.f99103d;
            if (scrollableViewPager != null) {
                scrollableViewPager.a(i2, z);
            }
        }
    }

    public static final class d implements p.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f99111a;

        static {
            Covode.recordClassIndex(63143);
        }

        d(androidx.fragment.app.e eVar) {
            this.f99111a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.p.b
        public final void a(HashMap<Integer, com.ss.android.ugc.aweme.base.ui.e> hashMap) {
            l.d(hashMap, "");
            ScrollSwitchStateManager.a.a(this.f99111a).a(hashMap);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.p.b
        public final void a(List<j> list) {
            l.d(list, "");
            ScrollSwitchStateManager.a.a(this.f99111a).a(list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99110a;

        static {
            Covode.recordClassIndex(63142);
        }

        c(a aVar) {
            this.f99110a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            ScrollableViewPager.a aVar = (ScrollableViewPager.a) obj;
            ScrollableViewPager scrollableViewPager = this.f99110a.f99103d;
            if (scrollableViewPager != null) {
                scrollableViewPager.f68314f = aVar;
            }
        }
    }

    public static final class h extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f99116a;

        static {
            Covode.recordClassIndex(63147);
        }

        public final LayoutInflater cloneInContext(Context context) {
            LayoutInflater from = LayoutInflater.from(context);
            l.b(from, "");
            return from;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(androidx.fragment.app.e eVar, Context context) {
            super(context);
            this.f99116a = eVar;
        }

        @Override // android.view.LayoutInflater
        public final View inflate(int i2, ViewGroup viewGroup, boolean z) {
            View a2 = com.a.b.c.a(this.f99116a, i2, viewGroup, z);
            l.b(a2, "");
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99109a;

        static {
            Covode.recordClassIndex(63141);
        }

        b(a aVar) {
            this.f99109a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            ScrollableViewPager scrollableViewPager = this.f99109a.f99103d;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    l.b();
                }
                scrollableViewPager.f68310b = bool.booleanValue();
            }
        }
    }

    public static final class f implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f99114b;

        static {
            Covode.recordClassIndex(63145);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            ScrollSwitchStateManager.a.a(this.f99114b).d(i2);
            if (i2 == 0) {
                this.f99113a.f99105f = false;
                this.f99113a.f99106g = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            ScrollSwitchStateManager.a.a(this.f99114b).c(i2);
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68531c);
            Hox.a.a(this.f99114b).a(be.f68531c, i2, bundle);
        }

        f(a aVar, androidx.fragment.app.e eVar) {
            this.f99113a = aVar;
            this.f99114b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (!this.f99113a.f99106g) {
                ScrollSwitchStateManager.a.a(this.f99114b).a(i2, f2, i3);
                Window window = this.f99114b.getWindow();
                l.b(window, "");
                window.getDecorView().setBackgroundColor(androidx.core.content.b.c(this.f99114b, R.color.f159928l));
                this.f99113a.f99106g = true;
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99113a.f99102c;
            if (scrollSwitchStateManager != null && i2 == scrollSwitchStateManager.c("page_feed") && !this.f99113a.f99105f) {
                this.f99113a.f99105f = true;
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.g());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.ugc.aweme.base.ui.p$a */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.ss.android.ugc.aweme.base.ui.p$a */
    /* JADX WARN: Multi-variable type inference failed */
    private static p.a a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        p.a aVar = new p.a();
        Hox a2 = Hox.a.a(eVar);
        Class<?> a3 = a2.a("page_feed");
        Class<?> a4 = a2.a("page_profile");
        if (a3 == null || a4 == null) {
            try {
                HomePageUIFrameService e2 = HomePageUIFrameServiceImpl.e();
                a3 = e2.b("page_feed");
                a4 = e2.b("page_profile");
            } catch (Throwable unused) {
            }
            if (a3 == null) {
                l.b();
            }
        }
        p.a a5 = aVar.a(a3, "page_feed", null);
        Objects.requireNonNull(a4, "null cannot be cast to non-null type java.lang.Class<out com.ss.android.ugc.aweme.base.ui.CommonPageFragment>");
        a5.a(a4, "page_profile", 1, null);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99117a;

        static {
            Covode.recordClassIndex(63148);
        }

        i(a aVar) {
            this.f99117a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            Integer num = (Integer) obj;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99117a.f99102c;
            if (scrollSwitchStateManager == null) {
                l.b();
            }
            if (num == null) {
                l.b();
            }
            if (l.a((Object) "page_profile", (Object) scrollSwitchStateManager.a(num.intValue()))) {
                HomePageDataViewModel homePageDataViewModel = this.f99117a.f99100a;
                Aweme aweme = null;
                if (homePageDataViewModel != null) {
                    str = homePageDataViewModel.f99123f;
                } else {
                    str = null;
                }
                HomePageDataViewModel homePageDataViewModel2 = this.f99117a.f99100a;
                if (homePageDataViewModel2 == null || homePageDataViewModel2.f99124g == null) {
                    str2 = "";
                } else {
                    HomePageDataViewModel homePageDataViewModel3 = this.f99117a.f99100a;
                    if (homePageDataViewModel3 == null || (aweme = homePageDataViewModel3.f99124g) == null) {
                        l.b();
                    }
                    str2 = aweme.getAid();
                }
                b.C2974b.a(str, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f99112a = new e();

        static {
            Covode.recordClassIndex(63144);
        }

        e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocusFromTouch();
            return false;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(androidx.fragment.app.e eVar, int i2) {
        MethodCollector.i(7799);
        ViewStub viewStub = (ViewStub) eVar.findViewById(i2);
        l.b(viewStub, "");
        viewStub.setLayoutInflater(new h(eVar, eVar));
        viewStub.inflate();
        MethodCollector.o(7799);
    }

    public final void a(androidx.fragment.app.e eVar, Hox hox) {
        l.d(eVar, "");
        l.d(hox, "");
        c cVar = this.f99107h;
        if (!c.f99172a) {
            com.ss.android.b.a.a.a.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.homepage.c$1 : 0x0010: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.homepage.c$1) = (r1v0 'cVar' com.ss.android.ugc.aweme.homepage.c) call: com.ss.android.ugc.aweme.homepage.c.1.<init>(com.ss.android.ugc.aweme.homepage.c):void type: CONSTRUCTOR)
                 type: STATIC call: com.ss.android.b.a.a.a.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.homepage.a.a(androidx.fragment.app.e, com.bytedance.hox.Hox):void, file: classes3.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r0v46 com.ss.android.ugc.aweme.homepage.c$1) = (r1v0 'cVar' com.ss.android.ugc.aweme.homepage.c) call: com.ss.android.ugc.aweme.homepage.c.1.<init>(com.ss.android.ugc.aweme.homepage.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.homepage.a.a(androidx.fragment.app.e, com.bytedance.hox.Hox):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.homepage.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 360
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.a.a(androidx.fragment.app.e, com.bytedance.hox.Hox):void");
        }
    }
