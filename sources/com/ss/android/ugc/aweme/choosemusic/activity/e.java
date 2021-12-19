package com.ss.android.ugc.aweme.choosemusic.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.c.al;
import com.ss.android.ugc.aweme.choosemusic.c.r;
import com.ss.android.ugc.aweme.choosemusic.c.v;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.a;
import com.ss.android.ugc.aweme.choosemusic.model.s;
import com.ss.android.ugc.aweme.choosemusic.model.t;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Objects;

public final class e extends com.bytedance.scene.group.b implements com.ss.android.ugc.tools.view.a.a, com.ss.android.ugc.tools.view.a.b {

    /* renamed from: b  reason: collision with root package name */
    public int f70348b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70349c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f70350d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.utils.d f70351e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f70352f = h.i.a((h.f.a.a) a.f70356a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f70353g = h.i.a((h.f.a.a) new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f70354h = h.i.a((h.f.a.a) new o(this));

    /* renamed from: i  reason: collision with root package name */
    private boolean f70355i;

    static {
        Covode.recordClassIndex(43384);
    }

    public final IAVPerformance E() {
        return (IAVPerformance) this.f70352f.getValue();
    }

    public final ChooseMusicWithSceneViewModel F() {
        return (ChooseMusicWithSceneViewModel) this.f70353g.getValue();
    }

    public final float G() {
        return ((Number) this.f70354h.getValue()).floatValue();
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        L();
    }

    static final class a extends h.f.b.m implements h.f.a.a<IAVPerformance> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70356a = new a();

        static {
            Covode.recordClassIndex(43385);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVPerformance invoke() {
            return AVExternalServiceImpl.a().provideAVPerformance();
        }
    }

    private final void L() {
        if (this.f70348b == 2) {
            com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a = "video_shoot_page";
        } else {
            com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a = "video_edit_page";
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<ChooseMusicWithSceneViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(43386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChooseMusicWithSceneViewModel invoke() {
            Activity t = this.this$0.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return ae.a((androidx.fragment.app.e) t, (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<v> {
        final /* synthetic */ boolean $allowClear;
        final /* synthetic */ Bundle $bundle$inlined;
        final /* synthetic */ String $challengeId;
        final /* synthetic */ String $creationId;
        final /* synthetic */ androidx.fragment.app.i $fm$inlined;
        final /* synthetic */ boolean $isPhotoMvMode;
        final /* synthetic */ MusicModel $musicModel;
        final /* synthetic */ String $shootWay;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(43392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, MusicModel musicModel, boolean z, boolean z2, String str2, String str3, e eVar, Bundle bundle, androidx.fragment.app.i iVar) {
            super(0);
            this.$challengeId = str;
            this.$musicModel = musicModel;
            this.$allowClear = z;
            this.$isPhotoMvMode = z2;
            this.$shootWay = str2;
            this.$creationId = str3;
            this.this$0 = eVar;
            this.$bundle$inlined = bundle;
            this.$fm$inlined = iVar;
        }

        /* renamed from: a */
        public final v invoke() {
            return v.a.a(this.this$0.f70348b, this.$challengeId, this.$musicModel, d.a.BtnConfirm, this.$allowClear, this.$isPhotoMvMode, this.$bundle$inlined, this.$shootWay, this.$creationId, this.this$0.f70349c ? 1 : 0);
        }
    }

    public static final class l implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70364a;

        static {
            Covode.recordClassIndex(43396);
        }

        public final boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            this.f70364a.H();
            View view = this.f70364a.n;
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(e eVar) {
            this.f70364a = eVar;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(43399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            Context context;
            View view = this.this$0.n;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            return Float.valueOf((float) com.bytedance.common.utility.n.b(context));
        }
    }

    private final boolean M() {
        boolean z = false;
        if (this.f70355i) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            Boolean enableLocalMusicEntrance = iESSettingsProxy.getEnableLocalMusicEntrance();
            h.f.b.l.b(enableLocalMusicEntrance, "");
            z = enableLocalMusicEntrance.booleanValue();
            return z;
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return z;
        }
    }

    public final void H() {
        View view = this.n;
        if (view != null) {
            view.setTranslationY(G());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new m(this));
        ofFloat.addListener(new n(this));
        ofFloat.start();
    }

    public final void K() {
        if (F().f70573b) {
            ChooseMusicWithSceneViewModel F = F();
            Intent intent = new Intent();
            AVExternalServiceImpl.a().publishService().setCurMusic(null);
            intent.putExtra("is_cancel_current_choose_music", true);
            F.a(new s(-1, intent));
        }
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        Activity t = t();
        if (!(t instanceof com.ss.android.ugc.tools.view.a.c)) {
            t = null;
        }
        com.ss.android.ugc.tools.view.a.c cVar = (com.ss.android.ugc.tools.view.a.c) t;
        if (cVar != null) {
            cVar.b((com.ss.android.ugc.tools.view.a.b) this);
            cVar.c(this);
        }
        IAVPerformance E = E();
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        E.leave(t2, "music_select");
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        String str;
        super.x();
        IAVPerformance E = E();
        Activity t = t();
        h.f.b.l.b(t, "");
        Bundle bundle = this.r;
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("creation_id");
        } else {
            str = null;
        }
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            str2 = bundle2.getString("shoot_way");
        }
        E.pause(t, "music_select", str, str2);
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $bundle$inlined;
        final /* synthetic */ androidx.fragment.app.i $fm$inlined;
        final /* synthetic */ h $provideChooseMusicFragment$1;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(43393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar, e eVar, Bundle bundle, androidx.fragment.app.i iVar) {
            super(0);
            this.$provideChooseMusicFragment$1 = hVar;
            this.this$0 = eVar;
            this.$bundle$inlined = bundle;
            this.$fm$inlined = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.F().f70573b) {
                AVExternalServiceImpl.a().publishService().setCurMusic(null);
            }
            this.this$0.J();
            v vVar = (v) this.$fm$inlined.a(R.id.b95);
            if (vVar != null) {
                if (vVar.f70405d) {
                    vVar.e();
                }
                this.$fm$inlined.a().b(R.id.b95, this.$provideChooseMusicFragment$1.invoke()).b();
            } else {
                this.$fm$inlined.a().a(R.id.b95, this.$provideChooseMusicFragment$1.invoke()).b();
            }
            return z.f158842a;
        }
    }

    public final void I() {
        if (!(!h.f.b.l.a(F().c().getValue(), a.c.f70594a))) {
            F().a(a.b.f70586a);
            TuxTextView tuxTextView = this.f70350d;
            if (tuxTextView == null) {
                h.f.b.l.a("tvTitle");
            }
            KeyboardUtils.c(tuxTextView);
            View view = this.n;
            if (view != null) {
                view.setEnabled(false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new c(this));
            ofFloat.addListener(new d(this));
            ofFloat.start();
        }
    }

    public final void J() {
        View c2 = c(R.id.f6a);
        h.f.b.l.b(c2, "");
        TextView textView = (TextView) c2;
        if (M()) {
            com.ss.android.ugc.aweme.choosemusic.utils.d dVar = this.f70351e;
            if (dVar == null) {
                h.f.b.l.a("commerceChooseMusicHelper");
            }
            if (dVar.a()) {
                textView.setVisibility(0);
                if (this.f70349c) {
                    textView.setAlpha(0.5f);
                    textView.setOnClickListener(com.ss.android.ugc.aweme.choosemusic.widgets.a.a.a(new View$OnClickListenerC1591e(this)));
                    return;
                }
                textView.setOnClickListener(com.ss.android.ugc.aweme.choosemusic.widgets.a.a.a(new f(this)));
                return;
            }
        }
        textView.setVisibility(8);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        String str;
        super.n_();
        Activity t = t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) t).getSupportFragmentManager();
        Fragment a2 = supportFragmentManager.a(R.id.b95);
        if (!(a2 instanceof v)) {
            a2 = null;
        }
        v vVar = (v) a2;
        if (vVar != null) {
            al alVar = vVar.f70404c;
            h.f.b.l.b(alVar, "");
            androidx.fragment.app.i childFragmentManager = alVar.getChildFragmentManager();
            androidx.fragment.app.n a3 = childFragmentManager.a();
            Fragment a4 = childFragmentManager.a(r.f70495b + 0);
            if (a4 != null) {
                a3.a(a4);
            }
            Fragment a5 = childFragmentManager.a(r.f70495b + 1);
            if (a5 != null) {
                a3.a(a5);
            }
            a3.c();
            androidx.fragment.app.n a6 = vVar.getChildFragmentManager().a();
            a6.a(alVar);
            a6.c();
            androidx.fragment.app.n a7 = supportFragmentManager.a();
            a7.a(vVar);
            a7.c();
        }
        String str2 = F().f70575d;
        if (!TextUtils.isEmpty(str2)) {
            com.ss.android.ugc.aweme.shortvideo.c curMusic = AVExternalServiceImpl.a().publishService().getCurMusic();
            if (curMusic != null) {
                str = curMusic.getMid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, str2)) {
                com.ss.android.ugc.aweme.common.r.a("mission_requirement_modified", new com.ss.android.ugc.aweme.app.f.d().a("value", 1).a("mission_id", F().f70576e).f66730a);
                F().f70575d = null;
                F().f70575d = null;
            }
        }
        ChooseMusicWithSceneViewModel F = F();
        F.f70572a = false;
        F.f70573b = false;
        F.f70575d = null;
        F.f70576e = null;
        F.f70574c = null;
        F.a().setValue(null);
        F.b().setValue(new s());
        F.c().setValue(a.c.f70594a);
        F.d().setValue(a.c.f70594a);
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70358a;

        static {
            Covode.recordClassIndex(43388);
        }

        d(e eVar) {
            this.f70358a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            if (h.f.b.l.a(this.f70358a.F().c().getValue(), a.b.f70586a)) {
                this.f70358a.F().a(a.C1596a.f70585a);
            }
        }
    }

    public static final class g extends ViewPagerBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70361a;

        static {
            Covode.recordClassIndex(43391);
        }

        g(e eVar) {
            this.f70361a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
        public final void a(View view, float f2) {
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.choosemusic.utils.d dVar = this.f70361a.f70351e;
            if (dVar == null) {
                h.f.b.l.a("commerceChooseMusicHelper");
            }
            dVar.a(f2);
        }

        @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
        public final void a(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 == 5) {
                KeyboardUtils.c(e.a(this.f70361a));
                this.f70361a.K();
                this.f70361a.F().a(a.C1596a.f70585a);
            }
        }
    }

    public static final class n extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70366a;

        static {
            Covode.recordClassIndex(43398);
        }

        n(e eVar) {
            this.f70366a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMusicWithSceneViewModel F = this.f70366a.F();
            a.C1596a aVar = a.C1596a.f70585a;
            h.f.b.l.d(aVar, "");
            F.d().setValue(aVar);
            this.f70366a.E().end(OpenMusicPanelPerformanceMonitor.f114756a, "animation_finished");
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70363a;

        static {
            Covode.recordClassIndex(43395);
        }

        k(e eVar) {
            this.f70363a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (((s) obj).f70682a != Integer.MAX_VALUE) {
                this.f70363a.I();
            }
        }
    }

    public static final /* synthetic */ TuxTextView a(e eVar) {
        TuxTextView tuxTextView = eVar.f70350d;
        if (tuxTextView == null) {
            h.f.b.l.a("tvTitle");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70360a;

        static {
            Covode.recordClassIndex(43390);
        }

        f(e eVar) {
            this.f70360a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(e.a(this.f70360a));
            e eVar = this.f70360a;
            com.ss.android.ugc.aweme.music.k.d.a(eVar.t(), eVar.f70348b);
            com.ss.android.ugc.aweme.choosemusic.utils.b.a(2);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70362a;

        static {
            Covode.recordClassIndex(43394);
        }

        j(e eVar) {
            this.f70362a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f70362a.K();
            this.f70362a.I();
            c.a.a("");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70357a;

        static {
            Covode.recordClassIndex(43387);
        }

        c(e eVar) {
            this.f70357a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f70357a.n;
            if (view != null) {
                view.setTranslationY(this.f70357a.G() * valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.e$e  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1591e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70359a;

        static {
            Covode.recordClassIndex(43389);
        }

        View$OnClickListenerC1591e(e eVar) {
            this.f70359a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(e.a(this.f70359a));
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f70359a.t()).a(R.string.d12).a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70365a;

        static {
            Covode.recordClassIndex(43397);
        }

        m(e eVar) {
            this.f70365a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f70365a.n;
            if (view != null) {
                view.setTranslationY(this.f70365a.G() - (this.f70365a.G() * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        Bundle bundle3;
        super.a(bundle);
        Bundle bundle4 = this.r;
        String str3 = null;
        if (bundle4 != null) {
            bundle2 = bundle4.getBundle("arguments");
        } else {
            bundle2 = null;
        }
        E().step(OpenMusicPanelPerformanceMonitor.f114756a, "choose_music_created");
        IAVPerformance E = E();
        Activity t = t();
        h.f.b.l.b(t, "");
        E.enter(t, "music_select");
        View c2 = c(R.id.f9l);
        h.f.b.l.b(c2, "");
        TuxTextView tuxTextView = (TuxTextView) c2;
        Bundle bundle5 = this.r;
        if (bundle5 != null) {
            str = bundle5.getString("title");
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(33);
        this.f70350d = tuxTextView;
        ChooseMusicWithSceneViewModel F = F();
        if (bundle2 != null) {
            str2 = bundle2.getString("mission_music_id");
        } else {
            str2 = null;
        }
        F.f70575d = str2;
        ChooseMusicWithSceneViewModel F2 = F();
        if (bundle2 != null) {
            str3 = bundle2.getString("mission_id");
        }
        F2.f70576e = str3;
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        View view = this.n;
        h.f.b.l.b(view, "");
        this.f70351e = new com.ss.android.ugc.aweme.choosemusic.utils.d(t2, view);
        Bundle bundle6 = this.r;
        if (bundle6 == null || !bundle6.getBoolean("hide_local_music", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f70355i = z;
        Bundle bundle7 = this.r;
        if (bundle7 == null || !bundle7.getBoolean("long_video", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f70349c = z2;
        J();
        c(R.id.qb).setOnClickListener(new j(this));
        ((Space) c(R.id.e7k)).setMinimumHeight(com.ss.android.ugc.aweme.base.utils.i.b());
        ViewPagerBottomSheetBehavior<View> a2 = ViewPagerBottomSheetBehavior.a(c(R.id.akq));
        a2.f68175k = new g(this);
        a2.f68168d = true;
        a2.b(com.ss.android.ugc.aweme.base.utils.i.a(t()) + com.ss.android.ugc.aweme.base.utils.i.e(t()));
        ChooseMusicWithSceneViewModel F3 = F();
        h.f.b.l.b(a2, "");
        h.f.b.l.d(a2, "");
        F3.f70574c = a2;
        Activity t3 = t();
        Objects.requireNonNull(t3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.i supportFragmentManager = ((androidx.fragment.app.e) t3).getSupportFragmentManager();
        if (supportFragmentManager.a(R.id.b95) == null && (bundle3 = this.r) != null) {
            this.f70348b = bundle3.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            L();
            AVExternalServiceImpl.a().publishService().setMusicChooseType(this.f70348b);
            h hVar = new h(bundle3.getString("challenge"), (MusicModel) bundle3.getSerializable("music_model"), bundle3.getBoolean("music_allow_clear", false), bundle3.getBoolean("music_is_photomv", false), bundle3.getString("shoot_way"), bundle3.getString("creation_id"), this, bundle2, supportFragmentManager);
            supportFragmentManager.a().a(R.id.b95, hVar.invoke()).d();
            com.ss.android.ugc.aweme.choosemusic.utils.d dVar = this.f70351e;
            if (dVar == null) {
                h.f.b.l.a("commerceChooseMusicHelper");
            }
            dVar.a(new i(hVar, this, bundle2, supportFragmentManager));
        }
        F().f70572a = true;
        F().b().observe(this, new k(this));
        int i2 = Build.VERSION.SDK_INT;
        l lVar = new l(this);
        View view2 = this.n;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(lVar);
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return false;
        }
        K();
        I();
        return true;
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        Activity t = t();
        if (!(t instanceof com.ss.android.ugc.tools.view.a.c)) {
            t = null;
        }
        com.ss.android.ugc.tools.view.a.c cVar = (com.ss.android.ugc.tools.view.a.c) t;
        if (cVar != null) {
            cVar.a((com.ss.android.ugc.tools.view.a.b) this);
            cVar.b((com.ss.android.ugc.tools.view.a.a) this);
        }
        View a2 = com.a.a(layoutInflater, R.layout.asd, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    @Override // com.ss.android.ugc.tools.view.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return true;
        }
        View view = this.n;
        if (view != null) {
            view.setVisibility(8);
        }
        t value = F().a().getValue();
        if (value == null) {
            return true;
        }
        value.f70685b.invoke(new s(i3, intent));
        value.f70684a.invoke();
        return true;
    }
}
