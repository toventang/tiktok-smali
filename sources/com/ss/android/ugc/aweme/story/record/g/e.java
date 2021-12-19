package com.ss.android.ugc.aweme.story.record.g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class e extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final b f138306b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<z> f138307a;

    /* renamed from: c  reason: collision with root package name */
    private final h f138308c;

    /* renamed from: d  reason: collision with root package name */
    private View f138309d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f138310e;

    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f138312a = new d();

        static {
            Covode.recordClassIndex(90476);
        }

        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(90471);
    }

    public final StoryRecordBaseViewModel a() {
        return (StoryRecordBaseViewModel) this.f138308c.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(90474);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ j $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(90472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.$this_activityViewModel
                android.app.Activity r1 = r0.t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.ss.android.ugc.aweme.story.record.g.e$a$1 r0 = new com.ss.android.ugc.aweme.story.record.g.e$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_record_permission_StoryRecordPermissionScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.g.e.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_record_permission_StoryRecordPermissionScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void b() {
        int i2;
        if (this.n != null) {
            if (this.f138310e) {
                i2 = R.id.qi;
            } else {
                i2 = R.id.q9;
            }
            View c2 = c(i2);
            l.b(c2, "");
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin + dh.c(s()), layoutParams2.rightMargin, layoutParams2.bottomMargin);
            c2.setLayoutParams(layoutParams2);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138311a;

        static {
            Covode.recordClassIndex(90475);
        }

        c(e eVar) {
            this.f138311a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f138311a.f138307a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.g.e$e  reason: collision with other inner class name */
    static final class View$OnClickListenerC3645e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138313a;

        static {
            Covode.recordClassIndex(90477);
        }

        View$OnClickListenerC3645e(e eVar) {
            this.f138313a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f138313a.a().a();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138314a;

        static {
            Covode.recordClassIndex(90478);
        }

        f(e eVar) {
            this.f138314a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f138314a.a().a();
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        c(R.id.j1).setOnClickListener(new c(this));
        c(R.id.dqe).setOnTouchListener(d.f138312a);
        c(R.id.q9).setOnClickListener(new View$OnClickListenerC3645e(this));
        c(R.id.qi).setOnClickListener(new f(this));
    }

    public final void a(boolean z) {
        int i2;
        View view = this.f138309d;
        if (view == null) {
            l.a("maskView");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public e(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f138310e = z;
        this.f138307a = aVar;
        h.k.c a2 = h.f.b.ab.a(StoryRecordBaseViewModel.class);
        this.f138308c = i.a((h.f.a.a) new a(this, a2, a2));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2x, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.ckm);
        l.b(c2, "");
        this.f138309d = c2;
        if (this.f138310e) {
            View c3 = c(R.id.q9);
            l.b(c3, "");
            c3.setVisibility(8);
            View c4 = c(R.id.qi);
            l.b(c4, "");
            c4.setVisibility(0);
        }
    }
}
