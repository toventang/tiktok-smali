package com.ss.android.ugc.aweme.infoSticker.customsticker.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class b extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b {
    public static final a X = new a((byte) 0);
    public boolean A;
    public float B = 1.0f;
    public float C = 1.0f;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public ValueAnimator O;
    public ValueAnimator P;
    public final ArrayList<ArrayList<Coordinate>> Q = new ArrayList<>();
    public final MediaModel R;
    public final Effect S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    private ImageView Y;
    private View Z;

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f104616a;
    private TextView aa;
    private View ab;
    private View ac;
    private final f.a.b.a ad = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public SmartImageView f104617b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f104618c;

    /* renamed from: d  reason: collision with root package name */
    AVDmtImageView f104619d;

    /* renamed from: e  reason: collision with root package name */
    TextView f104620e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationPathView f104621f;

    /* renamed from: g  reason: collision with root package name */
    AnimationPathView f104622g;

    /* renamed from: h  reason: collision with root package name */
    public EditPreviewStickerViewModel f104623h;

    /* renamed from: i  reason: collision with root package name */
    public int f104624i;

    /* renamed from: j  reason: collision with root package name */
    public int f104625j;

    /* renamed from: k  reason: collision with root package name */
    public int f104626k;

    /* renamed from: l  reason: collision with root package name */
    public int f104627l;
    public int t;
    public int u;
    public int v;
    public int w;
    public String x;
    public String y;
    public boolean z;

    static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final x f104651a = new x();

        static {
            Covode.recordClassIndex(67053);
        }

        x() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final y f104652a = new y();

        static {
            Covode.recordClassIndex(67054);
        }

        y() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(67029);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67030);
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

    public final boolean a() {
        if (this.N == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.ad.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b$b  reason: collision with other inner class name */
    public static final class C2667b implements AnimationPathView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104628a;

        static {
            Covode.recordClassIndex(67031);
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.b
        public final void a() {
            if (!this.f104628a.M) {
                this.f104628a.M = true;
                this.f104628a.d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2667b(b bVar) {
            this.f104628a = bVar;
        }
    }

    public static final class t implements AnimationPathView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f104643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Location f104644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f104645d;

        static {
            Covode.recordClassIndex(67049);
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.widget.AnimationPathView.b
        public final void a() {
            if (!this.f104642a.M) {
                this.f104642a.M = true;
                this.f104642a.a(this.f104643b, this.f104644c, this.f104645d);
            }
        }

        t(b bVar, File file, Location location, List list) {
            this.f104642a = bVar;
            this.f104643b = file;
            this.f104644c = location;
            this.f104645d = list;
        }
    }

    public final boolean b() {
        if (this.N == 2) {
            return true;
        }
        return false;
    }

    static final class z implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104653a;

        static {
            Covode.recordClassIndex(67055);
        }

        z(b bVar) {
            this.f104653a = bVar;
        }

        @Override // f.a.d.a
        public final void a() {
            b bVar = this.f104653a;
            com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.tools.utils.h.d(bVar.x));
            a2.f39907c = true;
            a2.v = com.bytedance.lighten.a.w.FIT_CENTER;
            SmartImageView smartImageView = bVar.f104616a;
            if (smartImageView == null) {
                h.f.b.l.a("originalView");
            }
            a2.E = smartImageView;
            a2.a(new r(bVar));
        }
    }

    private final void D() {
        if (this.P == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
            this.P = duration;
            if (duration == null) {
                h.f.b.l.b();
            }
            duration.setRepeatCount(0);
            duration.addUpdateListener(new d(this));
        }
    }

    public final void d() {
        this.K = true;
        AnimationPathView animationPathView = this.f104621f;
        if (animationPathView == null) {
            h.f.b.l.a("reactView");
        }
        animationPathView.setCompleteListener(null);
        AnimationPathView animationPathView2 = this.f104621f;
        if (animationPathView2 == null) {
            h.f.b.l.a("reactView");
        }
        animationPathView2.setShowAnimation(false);
        AnimationPathView animationPathView3 = this.f104621f;
        if (animationPathView3 == null) {
            h.f.b.l.a("reactView");
        }
        animationPathView3.setVisibility(4);
        d(2131230943);
        if (this.P == null) {
            D();
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            ValueAnimator valueAnimator3 = this.P;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new s(this));
            }
        }
    }

    static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104646a;

        static {
            Covode.recordClassIndex(67050);
        }

        u(b bVar) {
            this.f104646a = bVar;
        }

        public final void run() {
            SmartImageView smartImageView = this.f104646a.f104617b;
            if (smartImageView == null) {
                h.f.b.l.a("cutoutView");
            }
            smartImageView.setAlpha(1.0f);
            b bVar = this.f104646a;
            AnimationPathView animationPathView = bVar.f104622g;
            if (animationPathView == null) {
                h.f.b.l.a("maskPathView");
            }
            animationPathView.setVisibility(4);
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator duration = ValueAnimator.ofFloat(0.4f, 0.0f).setDuration(200L);
            duration.addUpdateListener(new c(bVar));
            h.f.b.l.b(duration, "");
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.75f, 1.0f).setDuration(500L);
            duration2.setRepeatCount(0);
            duration2.addUpdateListener(new f(bVar));
            duration2.addListener(new g(bVar));
            h.f.b.l.b(duration2, "");
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
        }
    }

    public final void C() {
        String str = this.T;
        String str2 = this.U;
        com.ss.android.ugc.aweme.common.r.a("click_remove_background", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("shoot_way", str).a("content_source", str2).a("content_type", this.V).a("creation_id", this.W).f149193a);
        if (!this.z && !a() && !this.K) {
            AVDmtImageView aVDmtImageView = this.f104619d;
            if (aVDmtImageView == null) {
                h.f.b.l.a("cutoutIV");
            }
            aVDmtImageView.setAlpha(1.0f);
            TextView textView = this.f104620e;
            if (textView == null) {
                h.f.b.l.a("cutoutTv");
            }
            textView.setAlpha(1.0f);
            int i2 = this.N;
            if (i2 == 3 || i2 == 0) {
                if (!a()) {
                    this.L = false;
                    this.N = 1;
                    AVDmtImageView aVDmtImageView2 = this.f104619d;
                    if (aVDmtImageView2 == null) {
                        h.f.b.l.a("cutoutIV");
                    }
                    aVDmtImageView2.setAlpha(0.4f);
                    TextView textView2 = this.f104620e;
                    if (textView2 == null) {
                        h.f.b.l.a("cutoutTv");
                    }
                    textView2.setAlpha(0.4f);
                    TextView textView3 = this.aa;
                    if (textView3 == null) {
                        h.f.b.l.a("useStickerView");
                    }
                    textView3.setAlpha(0.4f);
                    TextView textView4 = this.aa;
                    if (textView4 == null) {
                        h.f.b.l.a("useStickerView");
                    }
                    textView4.setEnabled(false);
                    TextView textView5 = this.f104620e;
                    if (textView5 == null) {
                        h.f.b.l.a("cutoutTv");
                    }
                    textView5.setText(R.string.ay3);
                    if (this.O == null) {
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                        this.O = duration;
                        if (duration == null) {
                            h.f.b.l.b();
                        }
                        duration.setRepeatCount(0);
                        duration.addUpdateListener(new e(this));
                    }
                    ValueAnimator valueAnimator = this.O;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                        valueAnimator.addListener(new h(this));
                    }
                }
            } else if (b()) {
                boolean z2 = !this.H;
                this.H = z2;
                if (z2) {
                    AVDmtImageView aVDmtImageView3 = this.f104619d;
                    if (aVDmtImageView3 == null) {
                        h.f.b.l.a("cutoutIV");
                    }
                    aVDmtImageView3.setImageResource(2131230942);
                    TextView textView6 = this.f104620e;
                    if (textView6 == null) {
                        h.f.b.l.a("cutoutTv");
                    }
                    textView6.setText(R.string.ay4);
                    SmartImageView smartImageView = this.f104617b;
                    if (smartImageView == null) {
                        h.f.b.l.a("cutoutView");
                    }
                    SmartImageView smartImageView2 = this.f104616a;
                    if (smartImageView2 == null) {
                        h.f.b.l.a("originalView");
                    }
                    a(smartImageView, smartImageView2);
                    return;
                }
                AVDmtImageView aVDmtImageView4 = this.f104619d;
                if (aVDmtImageView4 == null) {
                    h.f.b.l.a("cutoutIV");
                }
                aVDmtImageView4.setImageResource(2131230943);
                TextView textView7 = this.f104620e;
                if (textView7 == null) {
                    h.f.b.l.a("cutoutTv");
                }
                textView7.setText(R.string.ay4);
                SmartImageView smartImageView3 = this.f104616a;
                if (smartImageView3 == null) {
                    h.f.b.l.a("originalView");
                }
                SmartImageView smartImageView4 = this.f104617b;
                if (smartImageView4 == null) {
                    h.f.b.l.a("cutoutView");
                }
                a(smartImageView3, smartImageView4);
            }
        }
    }

    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104633a;

        static {
            Covode.recordClassIndex(67036);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        g(b bVar) {
            this.f104633a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f104633a.N = 2;
            this.f104633a.J = false;
            this.f104633a.d(2131230942);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f104633a.N = 2;
            this.f104633a.J = false;
            this.f104633a.d(2131230942);
        }

        public final void onAnimationStart(Animator animator) {
            b.b(this.f104633a).setVisibility(4);
            b.b(this.f104633a).setAlpha(1.0f);
            b.b(this.f104633a).setScaleX(1.0f);
            b.b(this.f104633a).setScaleY(1.0f);
        }
    }

    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104634a;

        static {
            Covode.recordClassIndex(67037);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        h(b bVar) {
            this.f104634a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            ValueAnimator valueAnimator = this.f104634a.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f104634a.L) {
                this.f104634a.M = false;
                b.d(this.f104634a).setPoints(this.f104634a.Q);
                b.d(this.f104634a).setShowAnimation(true);
                b.d(this.f104634a).setVisibility(0);
                EditPreviewStickerViewModel a2 = b.a(this.f104634a);
                String str = this.f104634a.R.f109390b;
                h.f.b.l.b(str, "");
                Effect effect = this.f104634a.S;
                h.f.b.l.d(str, "");
                if (com.ss.android.ugc.tools.utils.i.a(str)) {
                    a2.f104597a = new f.a.b.a();
                    int[] iArr = {1280, 720};
                    if (effect != null) {
                        CustomStickerExtra customStickerExtra = (CustomStickerExtra) com.ss.android.ugc.aweme.port.in.g.a().G().a(effect.getExtra(), CustomStickerExtra.class);
                        if (customStickerExtra.getUploadHeightLimit() > 0) {
                            iArr[0] = customStickerExtra.getUploadHeightLimit();
                        }
                        if (customStickerExtra.getUploadWidthLimit() > 0) {
                            iArr[1] = customStickerExtra.getUploadWidthLimit();
                        }
                    }
                    f.a.b.a aVar = a2.f104597a;
                    if (aVar == null || !aVar.isDisposed()) {
                        f.a.b.b a3 = f.a.t.a(new EditPreviewStickerViewModel.d(a2, str, iArr)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new EditPreviewStickerViewModel.e(a2), new EditPreviewStickerViewModel.f(a2));
                        f.a.b.a aVar2 = a2.f104597a;
                        if (aVar2 != null) {
                            aVar2.a(a3);
                        }
                    }
                }
            }
        }
    }

    public static final class i extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104635a;

        static {
            Covode.recordClassIndex(67038);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f104635a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // com.ss.android.ugc.aweme.views.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r11) {
            /*
            // Method dump skipped, instructions count: 356
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.infoSticker.customsticker.a.b.i.a(android.view.View):void");
        }
    }

    public static final class j extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104636a;

        static {
            Covode.recordClassIndex(67039);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f104636a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f104636a.C();
        }
    }

    public static final class k extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104637a;

        static {
            Covode.recordClassIndex(67040);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(b bVar) {
            this.f104637a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f104637a.C();
        }
    }

    public static final class l extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104638a;

        static {
            Covode.recordClassIndex(67041);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f104638a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f104638a.C();
        }
    }

    public static final class m extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104639a;

        static {
            Covode.recordClassIndex(67042);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(b bVar) {
            this.f104639a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (this.f104639a.b()) {
                Activity activity = this.f104639a.f42913m;
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else if (!this.f104639a.J) {
                if (this.f104639a.a()) {
                    b.a(this.f104639a).a();
                    return;
                }
                Activity activity2 = this.f104639a.f42913m;
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
            }
        }
    }

    public static final class r implements com.bytedance.lighten.a.c.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104640a;

        static {
            Covode.recordClassIndex(67047);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, com.bytedance.lighten.a.o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(b bVar) {
            this.f104640a = bVar;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            String str;
            this.f104640a.I = false;
            StringBuilder sb = new StringBuilder("Load Custom Sticker Error, file path: ");
            if (uri != null) {
                str = uri.getPath();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.df.e.a(sb.append(str).toString());
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
            this.f104640a.I = true;
            if (animatable != null || !com.ss.android.ugc.aweme.port.in.g.a().A().b() || (Build.VERSION.SDK_INT <= 23 && !SettingsManager.a().a("creative_support_cutout_under_M", true))) {
                this.f104640a.z = true;
                b bVar = this.f104640a;
                TextView textView = bVar.f104620e;
                if (textView == null) {
                    h.f.b.l.a("cutoutTv");
                }
                textView.setVisibility(4);
                AVDmtImageView aVDmtImageView = bVar.f104619d;
                if (aVDmtImageView == null) {
                    h.f.b.l.a("cutoutIV");
                }
                aVDmtImageView.setVisibility(4);
            } else {
                this.f104640a.z = false;
                b bVar2 = this.f104640a;
                TextView textView2 = bVar2.f104620e;
                if (textView2 == null) {
                    h.f.b.l.a("cutoutTv");
                }
                textView2.setVisibility(0);
                AVDmtImageView aVDmtImageView2 = bVar2.f104619d;
                if (aVDmtImageView2 == null) {
                    h.f.b.l.a("cutoutIV");
                }
                aVDmtImageView2.setVisibility(0);
            }
            if (!this.f104640a.A && oVar != null) {
                int width = b.b(this.f104640a).getWidth();
                int height = b.b(this.f104640a).getHeight();
                float f2 = (float) width;
                float f3 = (float) height;
                float f4 = ((float) this.f104640a.f104624i) / ((float) this.f104640a.f104625j);
                if (f4 > f2 / f3) {
                    this.f104640a.u = width;
                    b bVar3 = this.f104640a;
                    bVar3.t = (int) (((float) bVar3.u) / f4);
                } else {
                    this.f104640a.t = height;
                    b bVar4 = this.f104640a;
                    bVar4.u = (int) (((float) bVar4.t) * f4);
                }
                b bVar5 = this.f104640a;
                bVar5.B = (((float) bVar5.f104624i) * 1.0f) / ((float) this.f104640a.u);
                b bVar6 = this.f104640a;
                bVar6.C = (((float) bVar6.f104626k) * 1.0f) / ((float) this.f104640a.u);
                b bVar7 = this.f104640a;
                bVar7.F = (width - bVar7.u) / 2;
                b bVar8 = this.f104640a;
                bVar8.G = (height - bVar8.t) / 2;
                b bVar9 = this.f104640a;
                bVar9.D = bVar9.F;
                b bVar10 = this.f104640a;
                bVar10.E = bVar10.G;
                float f5 = (f2 - (((float) this.f104640a.u) * 0.75f)) / 2.0f;
                float f6 = (f3 - (((float) this.f104640a.t) * 0.75f)) / 2.0f;
                ArrayList<Coordinate> arrayList = new ArrayList<>();
                arrayList.add(new Coordinate((((float) this.f104640a.u) * 0.75f) + f5, f6));
                arrayList.add(new Coordinate((((float) this.f104640a.u) * 0.75f) + f5, (((float) this.f104640a.t) * 0.75f) + f6));
                arrayList.add(new Coordinate(f5, (((float) this.f104640a.t) * 0.75f) + f6));
                arrayList.add(new Coordinate(f5, f6));
                this.f104640a.Q.add(arrayList);
                this.f104640a.A = true;
            }
        }
    }

    public static final class s implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104641a;

        static {
            Covode.recordClassIndex(67048);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(b bVar) {
            this.f104641a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f104641a.N = 3;
            this.f104641a.K = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f104641a.N = 3;
            this.f104641a.K = false;
        }

        public final void onAnimationStart(Animator animator) {
            ValueAnimator valueAnimator = this.f104641a.P;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
        }
    }

    public static final /* synthetic */ EditPreviewStickerViewModel a(b bVar) {
        EditPreviewStickerViewModel editPreviewStickerViewModel = bVar.f104623h;
        if (editPreviewStickerViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        return editPreviewStickerViewModel;
    }

    public static final /* synthetic */ SmartImageView b(b bVar) {
        SmartImageView smartImageView = bVar.f104616a;
        if (smartImageView == null) {
            h.f.b.l.a("originalView");
        }
        return smartImageView;
    }

    public static final /* synthetic */ RelativeLayout c(b bVar) {
        RelativeLayout relativeLayout = bVar.f104618c;
        if (relativeLayout == null) {
            h.f.b.l.a("maskContainer");
        }
        return relativeLayout;
    }

    public static final /* synthetic */ AnimationPathView d(b bVar) {
        AnimationPathView animationPathView = bVar.f104621f;
        if (animationPathView == null) {
            h.f.b.l.a("reactView");
        }
        return animationPathView;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104629a;

        static {
            Covode.recordClassIndex(67032);
        }

        c(b bVar) {
            this.f104629a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            b.b(this.f104629a).setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104630a;

        static {
            Covode.recordClassIndex(67033);
        }

        d(b bVar) {
            this.f104630a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f2 = (-0.25f * floatValue) + 1.0f;
            b.b(this.f104630a).setScaleX(f2);
            b.b(this.f104630a).setScaleY(f2);
            b.b(this.f104630a).setAlpha((floatValue * -0.6f) + 1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104631a;

        static {
            Covode.recordClassIndex(67034);
        }

        e(b bVar) {
            this.f104631a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f2 = (-0.25f * floatValue) + 1.0f;
            b.b(this.f104631a).setScaleX(f2);
            b.b(this.f104631a).setScaleY(f2);
            b.b(this.f104631a).setAlpha((floatValue * -0.6f) + 1.0f);
        }
    }

    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104632a;

        static {
            Covode.recordClassIndex(67035);
        }

        f(b bVar) {
            this.f104632a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            b.c(this.f104632a).setScaleX(floatValue);
            b.c(this.f104632a).setScaleY(floatValue);
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.df.q.a("custom_sticker_imageclip_rate", 1, (JSONObject) null);
        if (str != null) {
            new com.ss.android.ugc.aweme.tux.a.i.a(r()).a(str).a();
        }
        a(false);
    }

    static final class w<T> implements f.a.w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104650a;

        static {
            Covode.recordClassIndex(67052);
        }

        w(b bVar) {
            this.f104650a = bVar;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<Void> vVar) {
            File a2;
            MethodCollector.i(4103);
            h.f.b.l.d(vVar, "");
            MediaModel mediaModel = this.f104650a.R;
            h.f.b.l.d(mediaModel, "");
            String str = mediaModel.f109390b;
            h.f.b.l.b(str, "");
            int a3 = com.ss.android.ugc.aweme.infoSticker.customsticker.helper.a.a(str);
            if (a3 != 0) {
                Bitmap a4 = com.ss.android.ugc.tools.utils.h.a(mediaModel.f109390b, (BitmapFactory.Options) null);
                Matrix matrix = new Matrix();
                matrix.postRotate((float) a3);
                if (!(a4 == null || (a2 = com.ss.android.ugc.aweme.infoSticker.customsticker.helper.a.a(Bitmap.createBitmap(a4, 0, 0, a4.getWidth(), a4.getHeight(), matrix, true))) == null)) {
                    mediaModel.f109390b = a2.getAbsolutePath();
                }
            }
            b bVar = this.f104650a;
            bVar.x = bVar.R.f109390b;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inScaled = false;
            com.ss.android.ugc.tools.utils.h.a(bVar.x, options);
            bVar.f104624i = options.outWidth;
            bVar.f104625j = options.outHeight;
            bVar.f104626k = bVar.f104624i;
            bVar.f104627l = bVar.f104625j;
            if (this.f104650a.f104625j <= 0 || this.f104650a.f104624i <= 0) {
                vVar.a(new IllegalStateException("Calculate image size error."));
                MethodCollector.o(4103);
                return;
            }
            vVar.a();
            MethodCollector.o(4103);
        }
    }

    public final void d(int i2) {
        AVDmtImageView aVDmtImageView = this.f104619d;
        if (aVDmtImageView == null) {
            h.f.b.l.a("cutoutIV");
        }
        aVDmtImageView.setAlpha(1.0f);
        AVDmtImageView aVDmtImageView2 = this.f104619d;
        if (aVDmtImageView2 == null) {
            h.f.b.l.a("cutoutIV");
        }
        aVDmtImageView2.setImageResource(i2);
        TextView textView = this.f104620e;
        if (textView == null) {
            h.f.b.l.a("cutoutTv");
        }
        textView.setAlpha(1.0f);
        TextView textView2 = this.f104620e;
        if (textView2 == null) {
            h.f.b.l.a("cutoutTv");
        }
        textView2.setText(R.string.ay4);
        TextView textView3 = this.aa;
        if (textView3 == null) {
            h.f.b.l.a("useStickerView");
        }
        textView3.setAlpha(1.0f);
        TextView textView4 = this.aa;
        if (textView4 == null) {
            h.f.b.l.a("useStickerView");
        }
        textView4.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        this.H = false;
        if (!z2) {
            StringBuilder sb = new StringBuilder("EditPreviewStickerScene#cancelCutout : ");
            AnimationPathView animationPathView = this.f104621f;
            if (animationPathView == null) {
                h.f.b.l.a("reactView");
            }
            com.ss.android.ugc.tools.utils.q.d(sb.append(animationPathView.a()).toString());
            AnimationPathView animationPathView2 = this.f104621f;
            if (animationPathView2 == null) {
                h.f.b.l.a("reactView");
            }
            if (animationPathView2.a()) {
                AnimationPathView animationPathView3 = this.f104621f;
                if (animationPathView3 == null) {
                    h.f.b.l.a("reactView");
                }
                animationPathView3.setCompleteListener(new C2667b(this));
                return;
            }
        }
        d();
    }

    public static final class v implements com.bytedance.lighten.a.c.k {

        /* renamed from: a  reason: collision with root package name */
        public boolean f104647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f104648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f104649c;

        static {
            Covode.recordClassIndex(67051);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, com.bytedance.lighten.a.o oVar) {
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
        }

        v(b bVar, List list) {
            this.f104648b = bVar;
            this.f104649c = list;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
            if (!this.f104647a) {
                this.f104647a = true;
                b bVar = this.f104648b;
                List<? extends List<Coordinate>> list = this.f104649c;
                if (oVar != null) {
                    bVar.v = oVar.f39858a;
                    bVar.w = oVar.f39859b;
                }
                RelativeLayout relativeLayout = bVar.f104618c;
                if (relativeLayout == null) {
                    h.f.b.l.a("maskContainer");
                }
                relativeLayout.setScaleX(0.75f);
                RelativeLayout relativeLayout2 = bVar.f104618c;
                if (relativeLayout2 == null) {
                    h.f.b.l.a("maskContainer");
                }
                relativeLayout2.setScaleY(0.75f);
                AnimationPathView animationPathView = bVar.f104621f;
                if (animationPathView == null) {
                    h.f.b.l.a("reactView");
                }
                animationPathView.setShowAnimation(false);
                AnimationPathView animationPathView2 = bVar.f104621f;
                if (animationPathView2 == null) {
                    h.f.b.l.a("reactView");
                }
                animationPathView2.setVisibility(4);
                AnimationPathView animationPathView3 = bVar.f104622g;
                if (animationPathView3 == null) {
                    h.f.b.l.a("maskPathView");
                }
                float f2 = (float) bVar.D;
                float f3 = (float) bVar.E;
                float f4 = bVar.C;
                h.f.b.l.d(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    for (Coordinate coordinate : it.next()) {
                        coordinate.setX((coordinate.getX() / f4) + f2);
                        coordinate.setY((coordinate.getY() / f4) + f3);
                    }
                }
                animationPathView3.setPoints(list);
                AnimationPathView animationPathView4 = bVar.f104622g;
                if (animationPathView4 == null) {
                    h.f.b.l.a("maskPathView");
                }
                animationPathView4.setShowAnimation(true);
                AnimationPathView animationPathView5 = bVar.f104622g;
                if (animationPathView5 == null) {
                    h.f.b.l.a("maskPathView");
                }
                animationPathView5.postDelayed(new u(bVar), 1200);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(iVar, "");
            if (pVar != null) {
                this.this$0.L = true;
                this.this$0.a(true);
            }
            return h.z.f158842a;
        }
    }

    private static void a(SmartImageView smartImageView, SmartImageView smartImageView2) {
        smartImageView.setVisibility(0);
        smartImageView2.setVisibility(4);
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Integer, ? extends Integer>, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Integer, ? extends Integer> pVar) {
            h.p<? extends Integer, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            this.this$0.f104626k = ((Number) pVar2.getFirst()).intValue();
            this.this$0.f104627l = ((Number) pVar2.getSecond()).intValue();
            b bVar2 = this.this$0;
            bVar2.C = (((float) bVar2.f104626k) * 1.0f) / ((float) this.this$0.u);
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.infoSticker.customsticker.api.a, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.infoSticker.customsticker.api.a aVar) {
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.a aVar2 = aVar;
            h.f.b.l.d(iVar, "");
            if (aVar2 != null) {
                b bVar = this.this$0;
                String message = aVar2.getMessage();
                if (message == null) {
                    message = this.this$0.c_(R.string.ay_);
                    h.f.b.l.b(message, "");
                }
                bVar.a(message);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at8, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, CutoutData, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(67043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, CutoutData cutoutData) {
            CutoutData cutoutData2 = cutoutData;
            h.f.b.l.d(iVar, "");
            if (cutoutData2 != null) {
                if (cutoutData2.checkData()) {
                    this.this$0.H = true;
                    b bVar = this.this$0;
                    Location location = cutoutData2.getLocation();
                    if (location == null) {
                        h.f.b.l.b();
                    }
                    File image = cutoutData2.getImage();
                    if (image == null) {
                        h.f.b.l.b();
                    }
                    List<List<Coordinate>> contours = cutoutData2.getContours();
                    if (!bVar.J) {
                        com.ss.android.ugc.aweme.df.q.a("custom_sticker_imageclip_rate", 0, (JSONObject) null);
                        bVar.J = true;
                        StringBuilder sb = new StringBuilder("EditPreviewStickerScene#showCutOutImage : ");
                        AnimationPathView animationPathView = bVar.f104621f;
                        if (animationPathView == null) {
                            h.f.b.l.a("reactView");
                        }
                        com.ss.android.ugc.tools.utils.q.d(sb.append(animationPathView.a()).toString());
                        AnimationPathView animationPathView2 = bVar.f104621f;
                        if (animationPathView2 == null) {
                            h.f.b.l.a("reactView");
                        }
                        if (animationPathView2.a()) {
                            AnimationPathView animationPathView3 = bVar.f104621f;
                            if (animationPathView3 == null) {
                                h.f.b.l.a("reactView");
                            }
                            animationPathView3.setCompleteListener(new t(bVar, image, location, contours));
                        } else {
                            bVar.a(image, location, contours);
                        }
                    }
                } else {
                    b bVar2 = this.this$0;
                    bVar2.a(bVar2.c_(R.string.ay_));
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View findViewById = view.findViewById(R.id.q9);
        h.f.b.l.b(findViewById, "");
        this.Y = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.atc);
        h.f.b.l.b(findViewById2, "");
        this.f104616a = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.atd);
        h.f.b.l.b(findViewById3, "");
        this.f104617b = (SmartImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ckp);
        h.f.b.l.b(findViewById4, "");
        this.f104618c = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.bip);
        h.f.b.l.b(findViewById5, "");
        this.f104619d = (AVDmtImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ey6);
        h.f.b.l.b(findViewById6, "");
        this.f104620e = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.a7_);
        h.f.b.l.b(findViewById7, "");
        this.Z = findViewById7;
        View findViewById8 = view.findViewById(R.id.yq);
        h.f.b.l.b(findViewById8, "");
        this.aa = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.kp);
        h.f.b.l.b(findViewById9, "");
        AnimationPathView animationPathView = (AnimationPathView) findViewById9;
        this.f104621f = animationPathView;
        if (animationPathView == null) {
            h.f.b.l.a("reactView");
        }
        animationPathView.setRepeatCount(-1);
        View findViewById10 = view.findViewById(R.id.ckn);
        h.f.b.l.b(findViewById10, "");
        AnimationPathView animationPathView2 = (AnimationPathView) findViewById10;
        this.f104622g = animationPathView2;
        if (animationPathView2 == null) {
            h.f.b.l.a("maskPathView");
        }
        animationPathView2.setDynamicLength(true);
        AnimationPathView animationPathView3 = this.f104622g;
        if (animationPathView3 == null) {
            h.f.b.l.a("maskPathView");
        }
        animationPathView3.setRatio(0.8f);
        View findViewById11 = view.findViewById(R.id.ep7);
        h.f.b.l.b(findViewById11, "");
        this.ab = findViewById11;
        View findViewById12 = view.findViewById(R.id.w3);
        h.f.b.l.b(findViewById12, "");
        this.ac = findViewById12;
        if (cj.a()) {
            ImageView imageView = this.Y;
            if (imageView == null) {
                h.f.b.l.a("back");
            }
            imageView.setImageResource(2131232197);
            View view2 = this.ab;
            if (view2 == null) {
                h.f.b.l.a("topShadow");
            }
            view2.setVisibility(8);
            View view3 = this.ac;
            if (view3 == null) {
                h.f.b.l.a("bottomShadow");
            }
            view3.setVisibility(8);
        }
        TextView textView = this.aa;
        if (textView == null) {
            h.f.b.l.a("useStickerView");
        }
        textView.setOnClickListener(new i(this));
        AVDmtImageView aVDmtImageView = this.f104619d;
        if (aVDmtImageView == null) {
            h.f.b.l.a("cutoutIV");
        }
        aVDmtImageView.setOnClickListener(new j(this));
        TextView textView2 = this.f104620e;
        if (textView2 == null) {
            h.f.b.l.a("cutoutTv");
        }
        textView2.setOnClickListener(new k(this));
        View view4 = this.Z;
        if (view4 == null) {
            h.f.b.l.a("cutoutHotZone");
        }
        view4.setOnClickListener(new l(this));
        ImageView imageView2 = this.Y;
        if (imageView2 == null) {
            h.f.b.l.a("back");
        }
        imageView2.setOnClickListener(new m(this));
        this.ad.a(f.a.t.a(new w(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(x.f104651a, y.f104652a, new z(this)));
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditPreviewStickerViewModel.class);
        h.f.b.l.b(a2, "");
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) a2;
        this.f104623h = editPreviewStickerViewModel;
        if (editPreviewStickerViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        f.a.b.b unused = selectSubscribe(editPreviewStickerViewModel, c.f104654a, new ah(), new n(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel2 = this.f104623h;
        if (editPreviewStickerViewModel2 == null) {
            h.f.b.l.a("viewModel");
        }
        b.a.b(this, editPreviewStickerViewModel2, d.f104655a, new o(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel3 = this.f104623h;
        if (editPreviewStickerViewModel3 == null) {
            h.f.b.l.a("viewModel");
        }
        f.a.b.b unused2 = selectSubscribe(editPreviewStickerViewModel3, e.f104656a, new ah(), new p(this));
        EditPreviewStickerViewModel editPreviewStickerViewModel4 = this.f104623h;
        if (editPreviewStickerViewModel4 == null) {
            h.f.b.l.a("viewModel");
        }
        f.a.b.b unused3 = selectSubscribe(editPreviewStickerViewModel4, f.f104657a, new ah(), new q(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(File file, Location location, List<? extends List<Coordinate>> list) {
        AnimationPathView animationPathView = this.f104621f;
        if (animationPathView == null) {
            h.f.b.l.a("reactView");
        }
        animationPathView.setCompleteListener(null);
        this.y = file.getAbsolutePath();
        float f2 = this.C;
        h.f.b.l.d(location, "");
        Location location2 = new Location((int) (((float) location.getLeft()) / f2), (int) (((float) location.getTop()) / f2), (int) (((float) location.getWidth()) / f2), (int) (((float) location.getHeight()) / f2));
        this.F += location2.getLeft();
        this.G += location2.getTop();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(location2.getWidth(), location2.getHeight());
        layoutParams.addRule(9);
        layoutParams.setMargins(this.F, this.G, 0, 0);
        SmartImageView smartImageView = this.f104617b;
        if (smartImageView == null) {
            h.f.b.l.a("cutoutView");
        }
        smartImageView.setLayoutParams(layoutParams);
        SmartImageView smartImageView2 = this.f104617b;
        if (smartImageView2 == null) {
            h.f.b.l.a("cutoutView");
        }
        smartImageView2.setAlpha(0.0f);
        SmartImageView smartImageView3 = this.f104617b;
        if (smartImageView3 == null) {
            h.f.b.l.a("cutoutView");
        }
        smartImageView3.setVisibility(0);
        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(file);
        a2.v = com.bytedance.lighten.a.w.FIT_CENTER;
        SmartImageView smartImageView4 = this.f104617b;
        if (smartImageView4 == null) {
            h.f.b.l.a("cutoutView");
        }
        a2.E = smartImageView4;
        a2.a(new v(this, list));
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
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

    public b(MediaModel mediaModel, Effect effect, String str, String str2, String str3, String str4) {
        h.f.b.l.d(mediaModel, "");
        this.R = mediaModel;
        this.S = effect;
        this.T = str;
        this.U = str2;
        this.V = str3;
        this.W = str4;
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
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
