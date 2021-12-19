package com.ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class f extends StepDrawerContainer {

    /* renamed from: h  reason: collision with root package name */
    j f99303h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.ies.uikit.a.b f99304i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f99305j;

    /* renamed from: k  reason: collision with root package name */
    private final h f99306k;

    /* renamed from: l  reason: collision with root package name */
    private View f99307l;

    static {
        Covode.recordClassIndex(63262);
    }

    public final DrawerViewModel getDrawerViewModel() {
        return (DrawerViewModel) this.f99306k.getValue();
    }

    public final View getContentView() {
        return this.f99307l;
    }

    public final j getSidebarContainer() {
        return this.f99303h;
    }

    public static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f99311a;

        static {
            Covode.recordClassIndex(63267);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void a(int i2, boolean z, boolean z2) {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void c() {
            this.f99311a.c(true);
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.d
        public final void d() {
            this.f99311a.c(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(f fVar) {
            this.f99311a = fVar;
        }
    }

    static final class b extends m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(63264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            Context context = this.$context;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DrawerViewModel.a.a((androidx.fragment.app.e) context);
        }
    }

    public final com.bytedance.ies.uikit.a.b getHostFragment() {
        com.bytedance.ies.uikit.a.b bVar = this.f99304i;
        if (bVar == null) {
            l.a("hostFragment");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DrawerViewModel drawerViewModel = getDrawerViewModel();
        drawerViewModel.f99262e.clear();
        drawerViewModel.f99263f.clear();
    }

    public final void e() {
        h.b("StoryContainer>>> onCreate");
        setNeedDrawShadow(true);
        a(new a());
        Context context = getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null) {
            Hox.a.a(eVar).a("HOME", new c(this));
            getDrawerViewModel().f99264g.observe(eVar, new d(this));
        }
        getDrawerViewModel().a(new e(this));
    }

    public final void setContentView(View view) {
        this.f99307l = view;
    }

    public final void setSidebarContainer(j jVar) {
        this.f99303h = jVar;
    }

    public final class a implements StepDrawerContainer.b {
        static {
            Covode.recordClassIndex(63263);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b
        public final void a(View view, boolean z) {
            l.d(view, "");
            h.a("onDrawerClosed: isStep:" + z + ' ');
            if (z) {
                f.this.getDrawerViewModel().f99259b.setValue(false);
                for (e eVar : n.k(f.this.getDrawerViewModel().f99262e)) {
                    eVar.c();
                }
            } else {
                f.this.getDrawerViewModel().f99260c.setValue(false);
                for (d dVar : n.k(f.this.getDrawerViewModel().f99263f)) {
                    dVar.d();
                }
            }
            f.this.getDrawerViewModel().f99258a.setValue(false);
            DrawerViewModel drawerViewModel = f.this.getDrawerViewModel();
            for (a aVar : n.d((Iterable) drawerViewModel.f99262e, (Iterable) drawerViewModel.f99263f)) {
                aVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b
        public final void a(int i2, boolean z, boolean z2) {
            h.a("onDrawerStateChanged : newState:" + i2 + ", hasStep:" + z + ", isStepState:" + z2 + ' ');
            DrawerViewModel drawerViewModel = f.this.getDrawerViewModel();
            for (a aVar : n.d((Iterable) drawerViewModel.f99262e, (Iterable) drawerViewModel.f99263f)) {
                aVar.a(i2, z, z2);
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b
        public final void a(View view, boolean z, boolean z2) {
            b event;
            l.d(view, "");
            h.a("onDrawerOpened: isStep:" + z + " , hasStep:" + z2);
            if (z) {
                f.this.getDrawerViewModel().f99259b.setValue(true);
                for (e eVar : n.k(f.this.getDrawerViewModel().f99262e)) {
                    eVar.d();
                }
            } else {
                f.this.getDrawerViewModel().f99260c.setValue(true);
                for (d dVar : n.k(f.this.getDrawerViewModel().f99263f)) {
                    dVar.c();
                }
                if (z2 && l.a((Object) f.this.getDrawerViewModel().f99259b.getValue(), (Object) true)) {
                    j sidebarContainer = f.this.getSidebarContainer();
                    if (!(sidebarContainer == null || (event = sidebarContainer.getEvent()) == null)) {
                        event.c("slide_left");
                    }
                    f.this.getDrawerViewModel().f99259b.setValue(false);
                    for (e eVar2 : n.k(f.this.getDrawerViewModel().f99262e)) {
                        eVar2.c();
                    }
                }
            }
            f.this.getDrawerViewModel().f99258a.setValue(true);
            DrawerViewModel drawerViewModel = f.this.getDrawerViewModel();
            for (a aVar : n.d((Iterable) drawerViewModel.f99262e, (Iterable) drawerViewModel.f99263f)) {
                aVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.b
        public final void a(View view, float f2, boolean z, float f3) {
            l.d(view, "");
            for (e eVar : n.k(f.this.getDrawerViewModel().f99262e)) {
                if (z) {
                    eVar.b(f3);
                }
                eVar.a(f2);
            }
            for (d dVar : n.k(f.this.getDrawerViewModel().f99263f)) {
                dVar.a(f2);
            }
        }
    }

    public static final class c implements com.bytedance.hox.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f99309a;

        static {
            Covode.recordClassIndex(63265);
        }

        c(f fVar) {
            this.f99309a = fVar;
        }

        @Override // com.bytedance.hox.a.d
        public final void a(Bundle bundle) {
            l.d(bundle, "");
            this.f99309a.a(false, true, "onNodeShow");
        }

        @Override // com.bytedance.hox.a.d
        public final void b(Bundle bundle) {
            l.d(bundle, "");
            if (!l.a((Object) this.f99309a.getDrawerViewModel().f99260c.getValue(), (Object) true)) {
                this.f99309a.a(true, true, "onNodeHide");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f99306k = i.a((h.f.a.a) new b(context));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean b(View view) {
        l.d(view, "");
        View view2 = this.f99307l;
        if (view2 == null || !l.a(view2, view)) {
            return super.b(view);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean c(View view) {
        l.d(view, "");
        j jVar = this.f99303h;
        if (jVar == null || !l.a(jVar, view)) {
            return super.c(view);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (h.f99314b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!c()) {
            return false;
        }
        b();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (h.f99314b) {
            return super.onTouchEvent(motionEvent);
        }
        if (!c()) {
            return false;
        }
        b();
        return false;
    }

    public final void c(boolean z) {
        Context context = getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null) {
            String a2 = h.a(eVar);
            if (a2.length() != 0) {
                h.a("notifyHomeHidden>>> hide:" + z + ", bottomTab:" + "HOME" + ", topTab:" + a2);
                Bundle bundle = new Bundle();
                bundle.putBoolean(be.f68535g, true);
                if (z) {
                    Hox.a.a(eVar).d("page_feed", bundle);
                    Hox.a.a(eVar).d("HOME", bundle);
                    Hox.a.a(eVar).d(a2, bundle);
                    return;
                }
                Hox.a.a(eVar).c("page_feed", bundle);
                Hox.a.a(eVar).a("HOME", bundle);
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f99310a;

        static {
            Covode.recordClassIndex(63266);
        }

        d(f fVar) {
            this.f99310a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            j sidebarContainer;
            b event;
            Integer num = (Integer) obj;
            boolean z = false;
            boolean z2 = true;
            if ((num.intValue() & 4) == 4) {
                if (!(this.f99310a.getDrawerViewModel().f99265h.length() <= 0 || (sidebarContainer = this.f99310a.getSidebarContainer()) == null || (event = sidebarContainer.getEvent()) == null)) {
                    event.c(this.f99310a.getDrawerViewModel().f99265h);
                }
                f fVar = this.f99310a;
                if ((num.intValue() & 16) == 0) {
                    z = true;
                }
                fVar.b(z);
            } else if ((num.intValue() & 3) == 3) {
                if ((num.intValue() & 32) == 32) {
                    this.f99310a.b(false);
                }
                f fVar2 = this.f99310a;
                if ((num.intValue() & 16) == 0) {
                    z = true;
                }
                fVar2.a(true, z);
            } else if ((num.intValue() & 1) == 1) {
                if ((num.intValue() & 32) == 32) {
                    this.f99310a.b(false);
                }
                f fVar3 = this.f99310a;
                if ((num.intValue() & 16) != 0) {
                    z2 = false;
                }
                fVar3.a(false, z2);
            }
        }
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final void a(boolean z, float f2) {
        b event;
        b event2;
        String str;
        if (z) {
            j jVar = this.f99303h;
            if (jVar != null && (event2 = jVar.getEvent()) != null) {
                if (f2 > 0.0f) {
                    str = "slide_down";
                } else {
                    str = "slide_up";
                }
                event2.c(str);
                return;
            }
            return;
        }
        j jVar2 = this.f99303h;
        if (jVar2 != null && (event = jVar2.getEvent()) != null) {
            event.c("click");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r5 == false) goto L_0x0078;
     */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.container.f.a(boolean, boolean):void");
    }

    public final void a(boolean z, boolean z2, String str) {
        l.d(str, "");
        if (z) {
            if (z2) {
                this.f99305j = true;
            }
            setDrawerLockMode(1);
        } else {
            if (z2) {
                this.f99305j = false;
            }
            if (!this.f99305j) {
                setDrawerLockMode(0);
            }
        }
        h.a("StoryContainer>>> " + str + ":setDrawerLock to lock=" + z + " , doubleLockState:" + this.f99305j);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean a(View view, int i2, int i3) {
        l.d(view, "");
        if (!c(view) || (!l.a((Object) getDrawerViewModel().f99259b.getValue(), (Object) true))) {
            return false;
        }
        j jVar = this.f99303h;
        if (jVar != null) {
            int[] iArr = new int[2];
            jVar.f99323b.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            int measuredWidth = jVar.f99323b.getMeasuredWidth() + i4;
            int measuredHeight = jVar.f99323b.getMeasuredHeight() + i5;
            if (i5 <= i3 && measuredHeight >= i3 && i4 <= i2 && measuredWidth >= i2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (getChildCount() > 2) {
            if (!h.a()) {
                h.a("StepDrawerContainer is allowed to have only two views, content and Drawer!!!");
            } else {
                throw new IllegalStateException("StepDrawerContainer is allowed to have only two views, content and Drawer!!!");
            }
        }
        super.onLayout(z, i2, i3, i4, i5);
    }
}
