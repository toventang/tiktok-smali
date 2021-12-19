package com.ss.android.ugc.aweme.ftc.b;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ao;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.z;
import java.util.Objects;

public final class h extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f97498j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    i f97499a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f97500b;

    /* renamed from: c  reason: collision with root package name */
    ShortVideoContextViewModel f97501c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f97502d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f97503e;

    /* renamed from: f  reason: collision with root package name */
    public RelativeLayout f97504f;

    /* renamed from: g  reason: collision with root package name */
    boolean f97505g;

    /* renamed from: h  reason: collision with root package name */
    boolean f97506h;

    /* renamed from: i  reason: collision with root package name */
    public final c f97507i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f97508k = true;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f97509l = h.i.a((h.f.a.a) new q(this));
    private final com.bytedance.als.h<Boolean> t;

    static {
        Covode.recordClassIndex(61944);
    }

    public final SafeHandler a() {
        return (SafeHandler) this.f97509l.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61945);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class q extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(61963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0);
        }
    }

    public final void C() {
        com.bytedance.tux.tooltip.a aVar = this.f97500b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97511a;

        static {
            Covode.recordClassIndex(61947);
        }

        c(h hVar) {
            this.f97511a = hVar;
        }

        public final void run() {
            h.a(this.f97511a).requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97526a;

        static {
            Covode.recordClassIndex(61961);
        }

        o(h hVar) {
            this.f97526a = hVar;
        }

        public final void run() {
            h.a(this.f97526a).requestFocus();
            h.a(this.f97526a).setSelected(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final View b() {
        TextView textView = this.f97503e;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.f97499a == null) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f97499a = new e((androidx.fragment.app.e) activity);
        }
    }

    private final boolean D() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.f97501c;
        if (shortVideoContextViewModel == null) {
            h.f.b.l.a("shortVideoContextViewModel");
        }
        if (shortVideoContextViewModel == null) {
            return false;
        }
        ShortVideoContextViewModel shortVideoContextViewModel2 = this.f97501c;
        if (shortVideoContextViewModel2 == null) {
            h.f.b.l.a("shortVideoContextViewModel");
        }
        if (shortVideoContextViewModel2.f124769a.aN) {
            ShortVideoContextViewModel shortVideoContextViewModel3 = this.f97501c;
            if (shortVideoContextViewModel3 == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            if (shortVideoContextViewModel3.f124769a.O) {
                return true;
            }
        }
        return false;
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f97528b;

        static {
            Covode.recordClassIndex(61962);
        }

        p(h hVar, z.e eVar) {
            this.f97527a = hVar;
            this.f97528b = eVar;
        }

        public final void run() {
            if (this.f97527a.f42913m != null) {
                Activity activity = this.f97527a.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                if (!activity.isFinishing() && this.f97528b.element != null) {
                    this.f97527a.f97500b = this.f97528b.element.b(h.a(this.f97527a)).a(com.bytedance.tux.tooltip.h.BOTTOM).d();
                    com.bytedance.tux.tooltip.a aVar = this.f97527a.f97500b;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97521a;

        static {
            Covode.recordClassIndex(61957);
        }

        k(h hVar) {
            this.f97521a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h hVar = this.f97521a;
            hVar.d();
            i iVar = hVar.f97499a;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public static final /* synthetic */ TextView a(h hVar) {
        TextView textView = hVar.f97503e;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        return textView;
    }

    public static final /* synthetic */ RelativeLayout b(h hVar) {
        RelativeLayout relativeLayout = hVar.f97504f;
        if (relativeLayout == null) {
            h.f.b.l.a("chooseMusicContainer");
        }
        return relativeLayout;
    }

    public static final /* synthetic */ ImageView c(h hVar) {
        ImageView imageView = hVar.f97502d;
        if (imageView == null) {
            h.f.b.l.a("ivChooseMusic");
        }
        return imageView;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97512a;

        static {
            Covode.recordClassIndex(61948);
        }

        d(h hVar) {
            this.f97512a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h hVar = this.f97512a;
            h.f.b.l.b(bool, "");
            hVar.a(bool.booleanValue());
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97522a;

        static {
            Covode.recordClassIndex(61958);
        }

        l(h hVar) {
            this.f97522a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ImageView c2 = h.c(this.f97522a);
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c2.setVisibility(i2);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97514a;

        static {
            Covode.recordClassIndex(61950);
        }

        f(h hVar) {
            this.f97514a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = h.b(this.f97514a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f97514a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f97514a.t().getResources().getDimensionPixelSize(R.dimen.rk);
            h.b(this.f97514a).setLayoutParams(marginLayoutParams);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97515a;

        static {
            Covode.recordClassIndex(61951);
        }

        g(h hVar) {
            this.f97515a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h hVar = this.f97515a;
            h.f.b.l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            ShortVideoContextViewModel shortVideoContextViewModel = hVar.f97501c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            if (booleanValue) {
                hVar.b().setOnClickListener(new m(hVar, shortVideoContext));
            } else {
                hVar.b().setOnClickListener(new n(shortVideoContext));
            }
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97517a;

        static {
            Covode.recordClassIndex(61953);
        }

        i(h hVar) {
            this.f97517a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                h.c(this.f97517a).setImageAlpha(255);
                h.a(this.f97517a).setAlpha(1.0f);
                return;
            }
            h.c(this.f97517a).setImageAlpha(127);
            h.a(this.f97517a).setAlpha(0.5f);
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f97525a;

        static {
            Covode.recordClassIndex(61960);
        }

        n(ShortVideoContext shortVideoContext) {
            this.f97525a = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("change_music_grey", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f97525a.q).a("shoot_way", this.f97525a.r).f149193a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.h$h  reason: collision with other inner class name */
    static final class C2348h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97516a;

        static {
            Covode.recordClassIndex(61952);
        }

        C2348h(h hVar) {
            this.f97516a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                this.f97516a.C();
                return;
            }
            h hVar = this.f97516a;
            int intValue = num.intValue();
            com.bytedance.tux.tooltip.a aVar = hVar.f97500b;
            if (aVar == null || !aVar.isShowing()) {
                hVar.d();
                z.e eVar = new z.e();
                T t = null;
                if (intValue == 1) {
                    i iVar = hVar.f97499a;
                    if (iVar != null) {
                        t = (T) iVar.b();
                    }
                } else {
                    i iVar2 = hVar.f97499a;
                    if (iVar2 != null) {
                        t = (T) iVar2.c();
                    }
                }
                eVar.element = t;
                hVar.a().post(new p(hVar, eVar));
                TextView textView = hVar.f97503e;
                if (textView == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView.setOnTouchListener(new b(hVar));
            }
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShortVideoContext f97524b;

        static {
            Covode.recordClassIndex(61959);
        }

        m(h hVar, ShortVideoContext shortVideoContext) {
            this.f97523a = hVar;
            this.f97524b = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.df.l.a(view, 1200)) {
                ShortVideoContext shortVideoContext = this.f97524b;
                h.f.b.l.b(shortVideoContext, "");
                if (!shortVideoContext.c()) {
                    r.a("change_music", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f97524b.q).a("shoot_way", this.f97524b.r).a("draft_id", this.f97524b.C).a("enter_from", "video_shoot_page").a("creation_duration", this.f97524b.aH).f149193a);
                    this.f97523a.f97507i.f97465k.a(h.z.f158842a);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (D()) {
            ImageView imageView = this.f97502d;
            if (imageView == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView.setVisibility(8);
            TextView textView = this.f97503e;
            if (textView == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView.setVisibility(8);
        } else if (!z || !this.f97508k) {
            TextView textView2 = this.f97503e;
            if (textView2 == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView2.setVisibility(8);
        } else {
            TextView textView3 = this.f97503e;
            if (textView3 == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView3.setVisibility(0);
            a().post(new o(this));
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97513a;

        static {
            Covode.recordClassIndex(61949);
        }

        e(h hVar) {
            this.f97513a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            h hVar = this.f97513a;
            ShortVideoContextViewModel shortVideoContextViewModel = hVar.f97501c;
            if (shortVideoContextViewModel == null) {
                h.f.b.l.a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
            h.f.b.l.b(shortVideoContext, "");
            if (shortVideoContext.c()) {
                StitchParams stitchParams = shortVideoContext.F.f124773a;
                if (stitchParams == null) {
                    h.f.b.l.b();
                }
                hVar.f97506h = true;
                TextView textView = hVar.f97503e;
                if (textView == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView.setClickable(false);
                TextView textView2 = hVar.f97503e;
                if (textView2 == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                textView2.setAlpha(0.5f);
                ImageView imageView = hVar.f97502d;
                if (imageView == null) {
                    h.f.b.l.a("ivChooseMusic");
                }
                imageView.setImageAlpha(127);
                if (!shortVideoContext.d()) {
                    hVar.f97505g = true;
                    RelativeLayout relativeLayout = hVar.f97504f;
                    if (relativeLayout == null) {
                        h.f.b.l.a("chooseMusicContainer");
                    }
                    relativeLayout.setVisibility(4);
                    return;
                }
                com.ss.android.ugc.aweme.shortvideo.c music = stitchParams.getMusic();
                TextView textView3 = hVar.f97503e;
                if (textView3 == null) {
                    h.f.b.l.a("tvChooseMusic");
                }
                if (music == null || (str = music.getMusicName()) == null) {
                    str = "";
                }
                textView3.setText(str);
                if (av.a()) {
                    ImageView imageView2 = hVar.f97502d;
                    if (imageView2 == null) {
                        h.f.b.l.a("ivChooseMusic");
                    }
                    imageView2.setImageResource(2131232541);
                    return;
                }
                ImageView imageView3 = hVar.f97502d;
                if (imageView3 == null) {
                    h.f.b.l.a("ivChooseMusic");
                }
                imageView3.setImageResource(2131232539);
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97518a;

        static {
            Covode.recordClassIndex(61954);
        }

        j(h hVar) {
            this.f97518a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) obj;
            if (cVar == null) {
                h.a(this.f97518a).setText(R.string.adm);
                if (av.a()) {
                    h.c(this.f97518a).setImageResource(2131232541);
                } else {
                    h.c(this.f97518a).setImageResource(2131232355);
                }
                this.f97518a.a().post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ftc.b.h.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f97519a;

                    static {
                        Covode.recordClassIndex(61955);
                    }

                    {
                        this.f97519a = r1;
                    }

                    public final void run() {
                        h.a(this.f97519a.f97518a).clearFocus();
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder(cVar.getName());
            String singer = cVar.getSinger();
            if (!(singer == null || singer.length() == 0)) {
                sb.append('-');
                sb.append(cVar.getSinger());
            }
            h.a(this.f97518a).setText(sb);
            if (av.a()) {
                h.c(this.f97518a).setImageResource(2131232541);
            } else {
                h.c(this.f97518a).setImageResource(2131232539);
            }
            this.f97518a.a().post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ftc.b.h.j.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f97520a;

                static {
                    Covode.recordClassIndex(61956);
                }

                {
                    this.f97520a = r1;
                }

                public final void run() {
                    h.a(this.f97520a.f97518a).requestFocus();
                }
            });
        }
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f97510a;

        static {
            Covode.recordClassIndex(61946);
        }

        b(h hVar) {
            this.f97510a = hVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f97510a.C();
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public h(c cVar, com.bytedance.als.h<Boolean> hVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(hVar, "");
        this.f97507i = cVar;
        this.t = hVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a36, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.dol);
        h.f.b.l.b(c2, "");
        this.f97504f = (RelativeLayout) c2;
        View c3 = c(R.id.bv7);
        h.f.b.l.b(c3, "");
        this.f97502d = (ImageView) c3;
        View c4 = c(R.id.eww);
        h.f.b.l.b(c4, "");
        this.f97503e = (TextView) c4;
        if (av.a()) {
            ImageView imageView = this.f97502d;
            if (imageView == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView.setImageResource(2131232541);
        } else {
            ImageView imageView2 = this.f97502d;
            if (imageView2 == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232355);
        }
        a().post(new c(this));
        Typeface a2 = ao.a();
        if (a2 != null) {
            TextView textView = this.f97503e;
            if (textView == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView.setTypeface(a2);
        }
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(ShortVideoContextViewModel.class);
        h.f.b.l.b(a3, "");
        this.f97501c = (ShortVideoContextViewModel) a3;
        this.t.a(this, new f(this));
        this.f97507i.f97462h.a(this, new g(this));
        this.f97507i.f97463i.a(this, new C2348h(this));
        this.f97507i.f97460f.a(this, new i(this));
        this.f97507i.f97461g.a(this, new j(this));
        this.f97507i.f97459e.a(this, new k(this));
        this.f97507i.f97456b.a(this, new l(this));
        this.f97507i.f97457c.a(this, new d(this));
        this.f97507i.f97464j.a(this, new e(this));
        if (D()) {
            a(false);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
