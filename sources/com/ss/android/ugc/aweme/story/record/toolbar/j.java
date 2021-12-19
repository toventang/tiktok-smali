package com.ss.android.ugc.aweme.story.record.toolbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel;
import com.ss.android.ugc.aweme.views.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class j extends com.bytedance.scene.j implements View.OnClickListener, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138457a = {new y(j.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final b f138458f = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f138459b = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: c  reason: collision with root package name */
    public ImageView f138460c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f138461d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f138462e;

    /* renamed from: g  reason: collision with root package name */
    private final h f138463g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f138464h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f138465i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f138466j;

    /* renamed from: k  reason: collision with root package name */
    private final float f138467k;

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f138468l;
    private final f t;

    static {
        Covode.recordClassIndex(90567);
    }

    private final StoryRecordToolbarViewModel b() {
        return (StoryRecordToolbarViewModel) this.f138463g.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(90570);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f138471b;

        static {
            Covode.recordClassIndex(90572);
        }

        d(j jVar, boolean z) {
            this.f138470a = jVar;
            this.f138471b = z;
        }

        public final void run() {
            ImageView imageView = this.f138470a.f138460c;
            if (imageView == null) {
                l.a("flashButton");
            }
            imageView.setEnabled(this.f138471b);
        }
    }

    public static final class a extends m implements h.f.a.a<StoryRecordToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(90568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.$this_activityViewModel
                android.app.Activity r1 = r0.t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.ss.android.ugc.aweme.story.record.toolbar.j$a$1 r0 = new com.ss.android.ugc.aweme.story.record.toolbar.j$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_record_toolbar_StoryRecordToolbarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.toolbar.j.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_record_toolbar_StoryRecordToolbarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void a() {
        int i2;
        this.f138466j = com.ss.android.ugc.aweme.story.record.b.d.b();
        ImageView imageView = this.f138461d;
        if (imageView == null) {
            l.a("beautyButton");
        }
        if (this.f138466j) {
            i2 = 2131233912;
        } else {
            i2 = 2131233911;
        }
        imageView.setImageResource(i2);
    }

    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f138469a;

        static {
            Covode.recordClassIndex(90571);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(600, false, 2);
            this.f138469a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            l.d(view, "");
            this.f138469a.onClick(view);
        }
    }

    public final void b(boolean z) {
        ImageView imageView = this.f138464h;
        if (imageView == null) {
            l.a("switchButton");
        }
        imageView.setEnabled(z);
    }

    public j(f fVar) {
        l.d(fVar, "");
        this.t = fVar;
        h.k.c a2 = h.f.b.ab.a(StoryRecordToolbarViewModel.class);
        this.f138463g = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f138467k = 0.34f;
    }

    public final void a(boolean z) {
        int i2;
        ImageView imageView = this.f138460c;
        if (imageView == null) {
            l.a("flashButton");
        }
        if (z) {
            i2 = 2131233915;
        } else {
            i2 = 2131233914;
        }
        imageView.setImageResource(i2);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.q9);
        l.b(c2, "");
        ImageView imageView = (ImageView) c2;
        this.f138462e = imageView;
        if (imageView == null) {
            l.a("backButton");
        }
        imageView.setOnClickListener(new c(this));
        View c3 = c(R.id.b6t);
        l.b(c3, "");
        ImageView imageView2 = (ImageView) c3;
        this.f138460c = imageView2;
        if (imageView2 == null) {
            l.a("flashButton");
        }
        imageView2.setOnClickListener(this);
        View c4 = c(R.id.s6);
        l.b(c4, "");
        ImageView imageView3 = (ImageView) c4;
        this.f138461d = imageView3;
        if (imageView3 == null) {
            l.a("beautyButton");
        }
        imageView3.setOnClickListener(this);
        View c5 = c(R.id.zv);
        l.b(c5, "");
        ImageView imageView4 = (ImageView) c5;
        this.f138464h = imageView4;
        if (imageView4 == null) {
            l.a("switchButton");
        }
        imageView4.setOnClickListener(this);
        View c6 = c(R.id.ew5);
        l.b(c6, "");
        this.f138465i = (TextView) c6;
        Integer a2 = new com.ss.android.ugc.aweme.story.record.b.d().a();
        if (a2 == null || a2.intValue() != 0) {
            a(false, false);
        }
        a();
    }

    public final void onClick(View view) {
        Integer valueOf;
        int i2;
        int i3;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.q9) {
                b().c(StoryRecordToolbarViewModel.a.f138427a);
            } else if (valueOf.intValue() == R.id.b6t) {
                b().c(StoryRecordToolbarViewModel.c.f138428a);
            } else if (valueOf.intValue() == R.id.s6) {
                this.f138466j = !this.f138466j;
                b().c(new StoryRecordToolbarViewModel.b(this.f138466j));
                ImageView imageView = this.f138461d;
                if (imageView == null) {
                    l.a("beautyButton");
                }
                if (this.f138466j) {
                    i2 = 2131233912;
                } else {
                    i2 = 2131233911;
                }
                imageView.setImageResource(i2);
                TextView textView = this.f138465i;
                if (textView == null) {
                    l.a("tvBeautyHint");
                }
                Context s = s();
                if (this.f138466j) {
                    i3 = R.string.a47;
                } else {
                    i3 = R.string.a41;
                }
                textView.setText(s.getText(i3));
                TextView textView2 = this.f138465i;
                if (textView2 == null) {
                    l.a("tvBeautyHint");
                }
                textView2.setAlpha(0.0f);
                ImageView imageView2 = this.f138461d;
                if (imageView2 == null) {
                    l.a("beautyButton");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 0.9f, 1.0f);
                ofFloat.setDuration(100L);
                ImageView imageView3 = this.f138461d;
                if (imageView3 == null) {
                    l.a("beautyButton");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView3, "scaleY", 1.0f, 0.9f, 1.0f);
                ofFloat2.setDuration(100L);
                TextView textView3 = this.f138465i;
                if (textView3 == null) {
                    l.a("tvBeautyHint");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView3, "alpha", 0.0f, 1.0f);
                ofFloat3.setDuration(100L);
                TextView textView4 = this.f138465i;
                if (textView4 == null) {
                    l.a("tvBeautyHint");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView4, "alpha", 1.0f, 0.0f);
                ofFloat4.setStartDelay(600);
                ofFloat4.setDuration(100L);
                AnimatorSet animatorSet = this.f138468l;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet2.start();
                this.f138468l = animatorSet2;
                com.ss.android.ugc.aweme.port.in.l.f115658a.s().b("key_story_default_beauty", this.f138466j);
            } else if (valueOf.intValue() == R.id.zv) {
                b().c(StoryRecordToolbarViewModel.d.f138429a);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b30, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    public final void a(boolean z, boolean z2) {
        float f2 = 1.0f;
        if (z2) {
            if (!z) {
                a(false);
            }
            ImageView imageView = this.f138460c;
            if (imageView == null) {
                l.a("flashButton");
            }
            ViewPropertyAnimator animate = imageView.animate();
            if (!z) {
                f2 = this.f138467k;
            }
            animate.alpha(f2).setDuration(100).withEndAction(new d(this, z));
            return;
        }
        ImageView imageView2 = this.f138460c;
        if (imageView2 == null) {
            l.a("flashButton");
        }
        if (!z) {
            f2 = this.f138467k;
        }
        imageView2.setAlpha(f2);
        ImageView imageView3 = this.f138460c;
        if (imageView3 == null) {
            l.a("flashButton");
        }
        imageView3.setEnabled(z);
    }
}
