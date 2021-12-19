package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import java.util.List;

public final class c extends a {

    /* renamed from: g  reason: collision with root package name */
    public View f100353g;

    /* renamed from: h  reason: collision with root package name */
    public View f100354h;

    /* renamed from: i  reason: collision with root package name */
    public View f100355i;

    /* renamed from: j  reason: collision with root package name */
    private View f100356j;

    /* renamed from: k  reason: collision with root package name */
    private RemoteImageView f100357k;

    /* renamed from: l  reason: collision with root package name */
    private RemoteImageView f100358l;

    /* renamed from: m  reason: collision with root package name */
    private RemoteImageView f100359m;
    private Animation n;
    private final a o = new a(this);

    static {
        Covode.recordClassIndex(64112);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final List<com.ss.android.ugc.aweme.emoji.g.a> b() {
        return a().getEmojiList();
    }

    public final void e() {
        View view = this.f100353g;
        if (view == null) {
            l.a("reloadLayout");
        }
        view.setVisibility(8);
        View view2 = this.f100354h;
        if (view2 == null) {
            l.a("loadingIv");
        }
        view2.setVisibility(0);
        View view3 = this.f100355i;
        if (view3 == null) {
            l.a("emojiLayout");
        }
        view3.setVisibility(0);
        View view4 = this.f100354h;
        if (view4 == null) {
            l.a("loadingIv");
        }
        Animation animation = this.n;
        if (animation == null) {
            l.a("animation");
        }
        view4.startAnimation(animation);
        f();
    }

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100360a;

        /* renamed from: b  reason: collision with root package name */
        private int f100361b;

        /* renamed from: c  reason: collision with root package name */
        private int f100362c;

        static {
            Covode.recordClassIndex(64113);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final boolean a() {
            return true;
        }

        private final void b() {
            if ((this.f100362c == 3 && !com.ss.android.ugc.aweme.im.service.c.d.c()) || (this.f100362c == 1 && com.ss.android.ugc.aweme.im.service.c.d.c())) {
                c.a(this.f100360a).setVisibility(8);
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a(c.a(this.f100360a));
                if (this.f100361b != this.f100362c) {
                    c.b(this.f100360a).setVisibility(8);
                    c.c(this.f100360a).setVisibility(0);
                } else {
                    c.b(this.f100360a).setVisibility(0);
                    c.c(this.f100360a).setVisibility(8);
                }
                this.f100362c = 0;
                this.f100361b = 0;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f100360a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, Throwable th) {
            this.f100362c++;
            b();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, f fVar, Animatable animatable) {
            this.f100362c++;
            this.f100361b++;
            b();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
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
    private final void f() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c.f():void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void c() {
        super.c();
        this.f100356j = b(R.id.c6r);
        this.f100354h = b(R.id.chh);
        this.f100353g = b(R.id.bss);
        this.f100355i = b(R.id.bsr);
        this.f100357k = (RemoteImageView) b(R.id.adi);
        this.f100358l = (RemoteImageView) b(R.id.adj);
        this.f100359m = (RemoteImageView) b(R.id.adk);
        this.n = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a(400, (Animation.AnimationListener) null);
        View view = this.f100354h;
        if (view == null) {
            l.a("loadingIv");
        }
        Animation animation = this.n;
        if (animation == null) {
            l.a("animation");
        }
        view.startAnimation(animation);
        View view2 = this.f100353g;
        if (view2 == null) {
            l.a("reloadLayout");
        }
        view2.setOnClickListener(new b(this));
        RemoteImageView remoteImageView = this.f100357k;
        if (remoteImageView == null) {
            l.a("emojiIvFirst");
        }
        remoteImageView.setOnClickListener(new View$OnClickListenerC2468c(this));
        RemoteImageView remoteImageView2 = this.f100358l;
        if (remoteImageView2 == null) {
            l.a("emojiIvSecond");
        }
        remoteImageView2.setOnClickListener(new d(this));
        RemoteImageView remoteImageView3 = this.f100359m;
        if (remoteImageView3 == null) {
            l.a("emojiIvThird");
        }
        remoteImageView3.setOnClickListener(new e(this));
        if (com.ss.android.ugc.aweme.im.service.c.d.c()) {
            RemoteImageView remoteImageView4 = this.f100357k;
            if (remoteImageView4 == null) {
                l.a("emojiIvFirst");
            }
            remoteImageView4.setVisibility(8);
            RemoteImageView remoteImageView5 = this.f100358l;
            if (remoteImageView5 == null) {
                l.a("emojiIvSecond");
            }
            remoteImageView5.setVisibility(8);
            RemoteImageView remoteImageView6 = this.f100359m;
            if (remoteImageView6 == null) {
                l.a("emojiIvThird");
            }
            ViewGroup.LayoutParams layoutParams = remoteImageView6.getLayoutParams();
            if (layoutParams != null) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 120.0f, system.getDisplayMetrics()));
                remoteImageView6.setLayoutParams(layoutParams);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100363a;

        static {
            Covode.recordClassIndex(64114);
        }

        b(c cVar) {
            this.f100363a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100363a.e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2468c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100364a;

        static {
            Covode.recordClassIndex(64115);
        }

        View$OnClickListenerC2468c(c cVar) {
            this.f100364a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100364a.a(0);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100365a;

        static {
            Covode.recordClassIndex(64116);
        }

        d(c cVar) {
            this.f100365a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100365a.a(1);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100366a;

        static {
            Covode.recordClassIndex(64117);
        }

        e(c cVar) {
            this.f100366a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100366a.a(2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    public static final /* synthetic */ View a(c cVar) {
        View view = cVar.f100354h;
        if (view == null) {
            l.a("loadingIv");
        }
        return view;
    }

    public static final /* synthetic */ View b(c cVar) {
        View view = cVar.f100355i;
        if (view == null) {
            l.a("emojiLayout");
        }
        return view;
    }

    public static final /* synthetic */ View c(c cVar) {
        View view = cVar.f100353g;
        if (view == null) {
            l.a("reloadLayout");
        }
        return view;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void a(boolean z) {
        int i2;
        View view = this.f100356j;
        if (view == null) {
            l.a("rootLayout");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void a(ai aiVar, ai aiVar2, SayHelloContent sayHelloContent, int i2, boolean z) {
        l.d(aiVar, "");
        l.d(sayHelloContent, "");
        super.a(aiVar, aiVar2, sayHelloContent, i2, z);
        a(true);
        f();
    }
}
