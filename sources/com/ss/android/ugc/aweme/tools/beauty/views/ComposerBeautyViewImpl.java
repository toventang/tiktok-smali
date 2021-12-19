package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.aweme.tools.beauty.g.e;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.ss.android.ugc.tools.view.style.StyleTabLayout;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.style.StyleView;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ComposerBeautyViewImpl extends FrameLayout implements au, com.ss.android.ugc.aweme.tools.beauty.service.f {
    public com.ss.android.ugc.aweme.tools.beauty.b.a.e A;
    private f.a B;
    private final View C;
    private final View D;
    private final StyleTextView E;
    private final BeautySeekBar F;
    private final BeautySeekBar G;
    private final LinearLayout H;
    private final ViewGroup I;
    private final ImageView J;
    private final TextView K;
    private final TextView L;
    private c M;
    private ViewGroup N;
    private f.a O;

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.beauty.service.b f139199a;

    /* renamed from: b  reason: collision with root package name */
    f.b f139200b;

    /* renamed from: c  reason: collision with root package name */
    final BeautyStyleFrameLayout f139201c;

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f139202d;

    /* renamed from: e  reason: collision with root package name */
    final StyleTabLayout f139203e;

    /* renamed from: f  reason: collision with root package name */
    final StyleView f139204f;

    /* renamed from: g  reason: collision with root package name */
    final StyleRecyclerView f139205g;

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f139206h;

    /* renamed from: i  reason: collision with root package name */
    final FrameLayout f139207i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f139208j;

    /* renamed from: k  reason: collision with root package name */
    final StyleRecyclerView f139209k;

    /* renamed from: l  reason: collision with root package name */
    final RelativeLayout f139210l;

    /* renamed from: m  reason: collision with root package name */
    public final BeautySwitchView f139211m;
    public final com.ss.android.ugc.aweme.tools.beauty.a.a n;
    public final com.ss.android.ugc.aweme.tools.beauty.a.a o;
    public ComposerBeauty p;
    public ComposerBeauty q;
    public boolean r;
    ComposerBeauty s;
    public com.ss.android.ugc.aweme.tools.beauty.g.e t;
    public com.ss.android.ugc.aweme.tools.beauty.g.f u;
    public Map<BeautyCategory, List<ComposerBeauty>> v;
    final h.f.a.m<ComposerBeauty, Integer, z> w;
    final h.f.a.m<ComposerBeauty, Integer, z> x;
    public boolean y;
    final com.ss.android.ugc.aweme.tools.beauty.g.m z;

    static {
        Covode.recordClassIndex(91025);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public final void setProgressbarColor(int i2) {
    }

    public final void setProgressbarDrawable(Drawable drawable) {
        h.f.b.l.d(drawable, "");
    }

    public final com.ss.android.ugc.aweme.tools.beauty.a.a getAlbumAdapter() {
        return this.o;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.service.b getBeautyBuried() {
        return this.f139199a;
    }

    public final f.b getBeautyOnInteractListener() {
        return this.f139200b;
    }

    public final f.a getBeautyViewListener() {
        return this.B;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.a.a getCategoryAdapter() {
        return this.n;
    }

    public final ViewGroup getContainer() {
        return this.N;
    }

    public final ComposerBeauty getCurSelectAlbumBeauty() {
        return this.q;
    }

    public final ComposerBeauty getCurSelectBeauty() {
        return this.p;
    }

    public final f.a getOnBeautyViewListener() {
        return this.O;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.g.e getResetHelper() {
        return this.t;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.g.f getSeekBarHelper() {
        return this.u;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.g.m getSource() {
        return this.z;
    }

    public final BeautySwitchView getSwEnableBeauty() {
        return this.f139211m;
    }

    public final TextView getTvFirstPbTitle() {
        return this.K;
    }

    public final TextView getTvSecondPbTitle() {
        return this.L;
    }

    public final com.ss.android.ugc.aweme.tools.beauty.b.a.e getViewConfig() {
        return this.A;
    }

    public final BeautySeekBar getPbProgressBar() {
        BeautySeekBar beautySeekBar = this.F;
        h.f.b.l.b(beautySeekBar, "");
        return beautySeekBar;
    }

    public final ImageView getResetIcon() {
        ImageView imageView = this.J;
        h.f.b.l.b(imageView, "");
        return imageView;
    }

    public final RelativeLayout getRlClearContainer() {
        RelativeLayout relativeLayout = this.f139210l;
        h.f.b.l.b(relativeLayout, "");
        return relativeLayout;
    }

    public final BeautySeekBar getSecondPbProgressBar() {
        BeautySeekBar beautySeekBar = this.G;
        h.f.b.l.b(beautySeekBar, "");
        return beautySeekBar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    public final void c() {
        if (this.y) {
            this.y = false;
            c cVar = this.M;
            if (cVar != null) {
                cVar.b(new com.ss.android.ugc.aweme.da.b());
            }
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = this.f139199a;
            if (bVar != null) {
                bVar.b(this.s);
            }
            f.a aVar = this.O;
            if (aVar != null) {
                aVar.b();
            }
            f.a aVar2 = this.B;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.tools.beauty.g.f fVar = this.u;
        BeautySeekBar beautySeekBar = this.F;
        h.f.b.l.b(beautySeekBar, "");
        fVar.a(beautySeekBar);
        com.ss.android.ugc.aweme.tools.beauty.g.f fVar2 = this.u;
        BeautySeekBar beautySeekBar2 = this.G;
        h.f.b.l.b(beautySeekBar2, "");
        fVar2.a(beautySeekBar2);
        RelativeLayout relativeLayout = this.f139210l;
        h.f.b.l.b(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (com.ss.android.ugc.aweme.tools.beauty.e.a.n) {
            StyleTextView styleTextView = this.E;
            h.f.b.l.b(styleTextView, "");
            styleTextView.setVisibility(0);
            Context context = getContext();
            h.f.b.l.b(context, "");
            layoutParams.width = (int) r.a(context, 76.0f);
        } else {
            StyleTextView styleTextView2 = this.E;
            h.f.b.l.b(styleTextView2, "");
            styleTextView2.setVisibility(8);
            Context context2 = getContext();
            h.f.b.l.b(context2, "");
            layoutParams.width = (int) r.a(context2, 52.0f);
        }
        this.E.setTextSize(2, this.A.f138862f.f138865b);
        this.J.setImageResource(this.A.f138862f.f138866c);
        RelativeLayout relativeLayout2 = this.f139210l;
        h.f.b.l.b(relativeLayout2, "");
        relativeLayout2.setLayoutParams(layoutParams);
        this.f139210l.setOnClickListener(new i(this));
        if (this.A.f138903m) {
            this.f139211m.setEnableTouch(false);
            BeautySwitchView beautySwitchView = this.f139211m;
            h.f.b.l.b(beautySwitchView, "");
            beautySwitchView.setChecked(this.z.q());
            BeautySwitchView beautySwitchView2 = this.f139211m;
            h.f.b.l.b(beautySwitchView2, "");
            c(beautySwitchView2.f139189b);
            this.f139211m.setOnCheckedChangeListener(new j(this));
            this.I.setOnClickListener(new k(this));
            this.f139203e.requestLayout();
            ViewGroup viewGroup = this.I;
            h.f.b.l.b(viewGroup, "");
            viewGroup.setVisibility(0);
        } else {
            BeautySwitchView beautySwitchView3 = this.f139211m;
            h.f.b.l.b(beautySwitchView3, "");
            beautySwitchView3.setChecked(true);
            ViewGroup viewGroup2 = this.I;
            h.f.b.l.b(viewGroup2, "");
            viewGroup2.setVisibility(8);
        }
        this.t.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r1 == null) goto L_0x009e;
     */
    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.b():void");
    }

    public final void setBeautyBuried(com.ss.android.ugc.aweme.tools.beauty.service.b bVar) {
        this.f139199a = bVar;
    }

    public final void setBeautyOnInteractListener(f.b bVar) {
        this.f139200b = bVar;
    }

    public final void setListener(f.a aVar) {
        this.O = aVar;
    }

    public final void setOnBeautyViewListener(f.a aVar) {
        this.O = aVar;
    }

    public final void setOnInteractListener(f.b bVar) {
        this.f139200b = bVar;
    }

    public final void setShow(boolean z2) {
        this.y = z2;
    }

    /* access modifiers changed from: package-private */
    public static final class j implements BeautySwitchView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139226a;

        static {
            Covode.recordClassIndex(91035);
        }

        j(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139226a = composerBeautyViewImpl;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.a
        public final void a(boolean z) {
            this.f139226a.c(z);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ComposerBeauty, z> {
        final /* synthetic */ ComposerBeautyViewImpl this$0;

        static {
            Covode.recordClassIndex(91039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(1);
            this.this$0 = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            int[] a2;
            int[] a3;
            h.f.b.l.d(composerBeauty, "");
            if (composerBeauty.getExtra().isNone()) {
                f.a beautyViewListener = this.this$0.getBeautyViewListener();
                if (beautyViewListener != null && (a3 = beautyViewListener.a(composerBeauty.getEffect().getUnzipPath(), "")) != null && a3.length == 2 && a3[0] == 0 && a3[1] == com.ss.android.ugc.aweme.tools.beauty.g.c.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (T t : items) {
                    f.a beautyViewListener2 = this.this$0.getBeautyViewListener();
                    if (beautyViewListener2 != null && (a2 = beautyViewListener2.a(composerBeauty.getEffect().getUnzipPath(), t.getTag())) != null && a2.length == 2 && a2[0] == 0 && a2[1] == com.ss.android.ugc.aweme.tools.beauty.g.c.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                    }
                }
            }
        }
    }

    public final void a(ComposerBeauty composerBeauty) {
        this.z.m(composerBeauty);
    }

    public final void setCurSelectAlbumBeauty(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        this.q = composerBeauty;
    }

    public final void setCurSelectBeauty(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        this.p = composerBeauty;
    }

    public final void setViewConfig(com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar) {
        h.f.b.l.d(eVar, "");
        this.A = eVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139221a;

        static {
            Covode.recordClassIndex(91031);
        }

        f(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139221a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139221a.c();
        }
    }

    public final void b(boolean z2) {
        if (z2) {
            LinearLayout linearLayout = this.H;
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.H;
        h.f.b.l.b(linearLayout2, "");
        linearLayout2.setVisibility(8);
    }

    public final void c(boolean z2) {
        f.a aVar = this.B;
        if (aVar != null) {
            aVar.a(z2);
        }
        if (!z2) {
            this.t.a(true);
        } else {
            this.t.a(false);
        }
        this.z.a(z2);
    }

    public final void setBeautyShowDot(ComposerBeauty composerBeauty) {
        if (this.A.f138903m) {
            BeautySwitchView beautySwitchView = this.f139211m;
            h.f.b.l.b(beautySwitchView, "");
            if (!beautySwitchView.f139189b) {
                return;
            }
        }
        this.z.c(composerBeauty);
    }

    public final void setBeautyViewListener(f.a aVar) {
        this.B = aVar;
        if (aVar != null) {
            BeautySwitchView beautySwitchView = this.f139211m;
            h.f.b.l.b(beautySwitchView, "");
            aVar.a(beautySwitchView.f139189b);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f
    public final void setContainer(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        this.N = viewGroup;
        this.M = new c(this.N, this, this.C);
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f139223b;

        static {
            Covode.recordClassIndex(91032);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f139223b) {
                RelativeLayout relativeLayout = this.f139222a.f139206h;
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f139222a.f139202d;
            h.f.b.l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        }

        g(ComposerBeautyViewImpl composerBeautyViewImpl, boolean z) {
            this.f139222a = composerBeautyViewImpl;
            this.f139223b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139227a;

        static {
            Covode.recordClassIndex(91036);
        }

        k(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139227a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BeautySwitchView swEnableBeauty = this.f139227a.getSwEnableBeauty();
            h.f.b.l.b(swEnableBeauty, "");
            BeautySwitchView swEnableBeauty2 = this.f139227a.getSwEnableBeauty();
            h.f.b.l.b(swEnableBeauty2, "");
            swEnableBeauty.setChecked(!swEnableBeauty2.f139189b);
            com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f139227a.getBeautyBuried();
            if (beautyBuried != null) {
                BeautySwitchView swEnableBeauty3 = this.f139227a.getSwEnableBeauty();
                h.f.b.l.b(swEnableBeauty3, "");
                beautyBuried.a(swEnableBeauty3.f139189b);
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139224a;

        static {
            Covode.recordClassIndex(91033);
        }

        h(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139224a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ComposerBeauty composerBeauty = this.f139224a.q;
            if (composerBeauty != null) {
                this.f139224a.setBeautyShowDot(composerBeauty);
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f139224a;
            RelativeLayout relativeLayout = composerBeautyViewImpl.f139202d;
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            composerBeautyViewImpl.n.notifyDataSetChanged();
            composerBeautyViewImpl.a(true);
            composerBeautyViewImpl.r = false;
            ComposerBeautyViewImpl.a(composerBeautyViewImpl, composerBeautyViewImpl.p, false, false, false, null, 22);
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = composerBeautyViewImpl.f139199a;
            if (bVar != null) {
                bVar.b(composerBeautyViewImpl.s);
            }
            composerBeautyViewImpl.s = null;
            this.f139224a.getBeautyOnInteractListener();
        }
    }

    static final class l implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f139230c;

        static {
            Covode.recordClassIndex(91037);
        }

        l(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f139228a = composerBeautyViewImpl;
            this.f139229b = list;
            this.f139230c = arrayList;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.b
        public final void a(TabLayout.f fVar) {
            Object obj;
            fVar.a();
            Iterator it = this.f139229b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ArrayList arrayList = this.f139230c;
                h.f.b.l.b(fVar, "");
                if (h.f.b.l.a(arrayList.get(fVar.f130750e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f139228a.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.a(beautyCategory);
                }
                f.b beautyOnInteractListener = this.f139228a.getBeautyOnInteractListener();
                if (beautyOnInteractListener != null) {
                    beautyOnInteractListener.a(beautyCategory);
                }
            }
        }
    }

    public static final class m implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f139233c;

        static {
            Covode.recordClassIndex(91038);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            T t;
            Object obj;
            if (fVar != null) {
                Iterator it = this.f139232b.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (h.f.b.l.a(this.f139233c.get(fVar.f130750e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    this.f139231a.getSource().a(beautyCategory.getCategoryResponse().getId());
                    com.ss.android.ugc.aweme.tools.beauty.a.a.a(this.f139231a.n, beautyCategory.getBeautyList());
                    Iterator<T> it2 = this.f139231a.n.f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (next.getSelected()) {
                            t = next;
                            break;
                        }
                    }
                    ComposerBeautyViewImpl.a(this.f139231a, t, false, false, false, null, 30);
                }
            }
        }

        m(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f139231a = composerBeautyViewImpl;
            this.f139232b = list;
            this.f139233c = arrayList;
        }
    }

    static final class c<T> implements u<androidx.c.a<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139220a;

        static {
            Covode.recordClassIndex(91028);
        }

        c(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139220a = composerBeautyViewImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(androidx.c.a<String, Integer> aVar) {
            T t;
            T t2;
            androidx.c.a<String, Integer> aVar2 = aVar;
            if (aVar2 != null) {
                for (Map.Entry<String, Integer> entry : aVar2.entrySet()) {
                    Iterator<T> it = this.f139220a.n.f138761a.iterator();
                    while (true) {
                        t = null;
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (h.f.b.l.a((Object) entry.getKey(), (Object) t2.getEffect().getEffectId())) {
                            break;
                        }
                    }
                    T t3 = t2;
                    if (t3 != null) {
                        Integer value = entry.getValue();
                        h.f.b.l.b(value, "");
                        t3.setDownloadState(value.intValue());
                        this.f139220a.n.notifyDataSetChanged();
                    }
                    Iterator<T> it2 = this.f139220a.o.f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (h.f.b.l.a((Object) entry.getKey(), (Object) next.getEffect().getEffectId())) {
                            t = next;
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        Integer value2 = entry.getValue();
                        h.f.b.l.b(value2, "");
                        t4.setDownloadState(value2.intValue());
                        this.f139220a.o.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setTabItemAlign(int i2) {
        if (i2 == 1) {
            StyleTabLayout styleTabLayout = this.f139203e;
            h.f.b.l.b(styleTabLayout, "");
            styleTabLayout.setTabMode(1);
            StyleTabLayout styleTabLayout2 = this.f139203e;
            h.f.b.l.b(styleTabLayout2, "");
            ViewGroup.LayoutParams layoutParams = styleTabLayout2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            Context context = getContext();
            h.f.b.l.b(context, "");
            layoutParams2.leftMargin = (int) r.a(context, 76.0f);
            int i3 = Build.VERSION.SDK_INT;
            Context context2 = getContext();
            h.f.b.l.b(context2, "");
            layoutParams2.setMarginStart((int) r.a(context2, 76.0f));
            StyleTabLayout styleTabLayout3 = this.f139203e;
            h.f.b.l.b(styleTabLayout3, "");
            styleTabLayout3.setLayoutParams(layoutParams2);
            return;
        }
        StyleTabLayout styleTabLayout4 = this.f139203e;
        h.f.b.l.b(styleTabLayout4, "");
        int i4 = 0;
        styleTabLayout4.setTabMode(0);
        StyleTabLayout styleTabLayout5 = this.f139203e;
        h.f.b.l.b(styleTabLayout5, "");
        ViewGroup.LayoutParams layoutParams3 = styleTabLayout5.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (this.A.f138903m) {
            Context context3 = getContext();
            h.f.b.l.b(context3, "");
            i4 = (int) r.a(context3, 56.0f);
        }
        layoutParams4.leftMargin = i4;
        int i5 = Build.VERSION.SDK_INT;
        layoutParams4.setMarginStart(i4);
        StyleTabLayout styleTabLayout6 = this.f139203e;
        h.f.b.l.b(styleTabLayout6, "");
        styleTabLayout6.setLayoutParams(layoutParams4);
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139225a;

        static {
            Covode.recordClassIndex(91034);
        }

        i(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139225a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f139225a.getSource().u().getUseResetAll()) {
                this.f139225a.getBeautyOnInteractListener();
                com.ss.android.ugc.aweme.tools.beauty.g.e eVar = this.f139225a.t;
                Context context = this.f139225a.getContext();
                h.f.b.l.b(context, "");
                h.f.b.l.d(context, "");
                com.ss.android.ugc.aweme.tools.beauty.e.b.a aVar = eVar.f138947b.getViewConfig().f138901k;
                if (aVar != null) {
                    a.C3665a a2 = new a.C3665a().a(context);
                    String string = context.getString(R.string.a45);
                    h.f.b.l.b(string, "");
                    a.C3665a a3 = a2.a(string);
                    String string2 = context.getString(R.string.a42);
                    h.f.b.l.b(string2, "");
                    a.C3665a b2 = a3.b(string2);
                    String string3 = context.getString(R.string.a43);
                    h.f.b.l.b(string3, "");
                    a.C3665a c2 = b2.c(string3);
                    String string4 = context.getString(R.string.a44);
                    h.f.b.l.b(string4, "");
                    a.C3665a d2 = c2.d(string4);
                    d2.f138930f = new e.f(eVar);
                    aVar.a(d2);
                } else {
                    a.C3665a a4 = new a.C3665a().a(context);
                    String string5 = context.getString(R.string.a45);
                    h.f.b.l.b(string5, "");
                    a.C3665a a5 = a4.a(string5);
                    String string6 = context.getString(R.string.a42);
                    h.f.b.l.b(string6, "");
                    a.C3665a b3 = a5.b(string6);
                    String string7 = context.getString(R.string.a43);
                    h.f.b.l.b(string7, "");
                    a.C3665a c3 = b3.c(string7);
                    String string8 = context.getString(R.string.a44);
                    h.f.b.l.b(string8, "");
                    a.C3665a d3 = c3.d(string8);
                    d3.f138930f = new e.g(eVar);
                    a.a(d3);
                }
                com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = eVar.f138947b.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.a();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.tools.beauty.g.e eVar2 = this.f139225a.t;
            if (eVar2.f138947b.getCurSelectAlbumBeauty() != null || eVar2.f138947b.getCurSelectAlbumBeauty() != null) {
                e.C3668e eVar3 = new e.C3668e(eVar2);
                boolean z = eVar2.f138947b.r;
                T t = null;
                if (z) {
                    Iterator<T> it = eVar2.f138947b.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (h.f.b.l.a((Object) next, (Object) eVar2.f138947b.getCurSelectAlbumBeauty())) {
                            t = next;
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        eVar3.a(t2);
                        com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried2 = eVar2.f138947b.getBeautyBuried();
                        if (beautyBuried2 != null) {
                            beautyBuried2.c(t2);
                        }
                        eVar2.f138946a.c(t2);
                    }
                } else if (!z) {
                    Iterator<T> it2 = eVar2.f138947b.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (h.f.b.l.a((Object) next2, (Object) eVar2.f138947b.getCurSelectBeauty())) {
                            t = next2;
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        eVar3.a(t3);
                        com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried3 = eVar2.f138947b.getBeautyBuried();
                        if (beautyBuried3 != null) {
                            beautyBuried3.c(t3);
                        }
                        eVar2.f138946a.c(t3);
                        int indexOf = eVar2.f138947b.getCategoryAdapter().f138761a.indexOf(t3);
                        if (indexOf >= 0 && indexOf < eVar2.f138947b.getCategoryAdapter().f138761a.size()) {
                            eVar2.f138947b.getCategoryAdapter().a(t3);
                        }
                    }
                }
            }
        }
    }

    static final class b<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComposerBeautyViewImpl f139219a;

        static {
            Covode.recordClassIndex(91027);
        }

        b(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f139219a = composerBeautyViewImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            T t;
            TabLayout.f a2;
            for (T t2 : this.f139219a.getSource().a()) {
                this.f139219a.v.put(t2, t2.getBeautyList());
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f139219a;
            BeautyStyleFrameLayout beautyStyleFrameLayout = composerBeautyViewImpl.f139201c;
            Context context = composerBeautyViewImpl.getContext();
            h.f.b.l.b(context, "");
            beautyStyleFrameLayout.a(r.a(context, composerBeautyViewImpl.A.f138857a));
            ComposerBeautyViewImpl composerBeautyViewImpl2 = this.f139219a;
            List<BeautyCategory> a3 = composerBeautyViewImpl2.getSource().a();
            composerBeautyViewImpl2.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.b(0);
            StyleRecyclerView styleRecyclerView = composerBeautyViewImpl2.f139205g;
            h.f.b.l.b(styleRecyclerView, "");
            styleRecyclerView.setLayoutManager(linearLayoutManager);
            StyleRecyclerView styleRecyclerView2 = composerBeautyViewImpl2.f139205g;
            h.f.b.l.b(styleRecyclerView2, "");
            styleRecyclerView2.setAdapter(composerBeautyViewImpl2.n);
            StyleRecyclerView styleRecyclerView3 = composerBeautyViewImpl2.f139205g;
            h.f.b.l.b(styleRecyclerView3, "");
            RecyclerView.f itemAnimator = styleRecyclerView3.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f3833l = 0;
            }
            composerBeautyViewImpl2.getContext();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.b(0);
            StyleRecyclerView styleRecyclerView4 = composerBeautyViewImpl2.f139209k;
            h.f.b.l.b(styleRecyclerView4, "");
            styleRecyclerView4.setLayoutManager(linearLayoutManager2);
            StyleRecyclerView styleRecyclerView5 = composerBeautyViewImpl2.f139209k;
            h.f.b.l.b(styleRecyclerView5, "");
            styleRecyclerView5.setAdapter(composerBeautyViewImpl2.o);
            StyleRecyclerView styleRecyclerView6 = composerBeautyViewImpl2.f139205g;
            h.f.b.l.b(styleRecyclerView6, "");
            RecyclerView.f itemAnimator2 = styleRecyclerView6.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.f3833l = 0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : a3) {
                arrayList2.add(t3.getCategoryResponse().getId());
                arrayList.add(t3.getCategoryResponse().getName());
            }
            if (arrayList.size() <= 1) {
                composerBeautyViewImpl2.f139203e.setHideIndicatorView(true);
            } else {
                composerBeautyViewImpl2.f139203e.setHideIndicatorView(false);
            }
            if (a3.size() > 4) {
                StyleView styleView = composerBeautyViewImpl2.f139204f;
                h.f.b.l.b(styleView, "");
                styleView.setVisibility(0);
            } else {
                StyleView styleView2 = composerBeautyViewImpl2.f139204f;
                h.f.b.l.b(styleView2, "");
                styleView2.setVisibility(8);
            }
            composerBeautyViewImpl2.setTabItemAlign(a3.size());
            composerBeautyViewImpl2.f139203e.b();
            for (T t4 : a3) {
                Context context2 = composerBeautyViewImpl2.getContext();
                h.f.b.l.b(context2, "");
                com.ss.android.ugc.tools.view.style.j a4 = com.ss.android.ugc.tools.b.a(context2);
                if (TextUtils.isEmpty(t4.getCategoryResponse().getIcon_normal_url())) {
                    a4.setText(t4.getCategoryResponse().getName());
                } else {
                    String icon_normal_url = t4.getCategoryResponse().getIcon_normal_url();
                    if (icon_normal_url != null) {
                        a4.setImage(icon_normal_url);
                    }
                }
                TabLayout.f a5 = composerBeautyViewImpl2.f139203e.a().a(a4);
                h.f.b.l.b(a5, "");
                TabLayout.i iVar = a5.f130753h;
                if (iVar != null) {
                    iVar.setBackgroundColor(androidx.core.content.b.c(iVar.getContext(), R.color.us));
                }
                composerBeautyViewImpl2.f139203e.a(a5, false);
            }
            composerBeautyViewImpl2.f139203e.setOnTabClickListener(new l(composerBeautyViewImpl2, a3, arrayList2));
            composerBeautyViewImpl2.f139203e.a(new m(composerBeautyViewImpl2, a3, arrayList2));
            Iterator<T> it = a3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getSelected()) {
                    break;
                }
            }
            T t5 = t;
            if (!(t5 == null || (a2 = composerBeautyViewImpl2.f139203e.a(a3.indexOf(t5))) == null)) {
                a2.a();
                f.b bVar = composerBeautyViewImpl2.f139200b;
                if (bVar != null) {
                    bVar.a((BeautyCategory) t5);
                }
            }
            if (composerBeautyViewImpl2.z.u().getHasTitle()) {
                StyleTabLayout styleTabLayout = composerBeautyViewImpl2.f139203e;
                h.f.b.l.b(styleTabLayout, "");
                styleTabLayout.setVisibility(0);
            } else {
                StyleTabLayout styleTabLayout2 = composerBeautyViewImpl2.f139203e;
                h.f.b.l.b(styleTabLayout2, "");
                styleTabLayout2.setVisibility(4);
            }
            composerBeautyViewImpl2.n.f138762b = composerBeautyViewImpl2.w;
            composerBeautyViewImpl2.o.f138762b = composerBeautyViewImpl2.x;
            if (composerBeautyViewImpl2.r) {
                ComposerBeautyViewImpl.a(composerBeautyViewImpl2, composerBeautyViewImpl2.q, true, false, false, null, 20);
            } else {
                ComposerBeautyViewImpl.a(composerBeautyViewImpl2, composerBeautyViewImpl2.p, false, false, false, null, 22);
            }
            this.f139219a.a();
            ComposerBeautyViewImpl composerBeautyViewImpl3 = this.f139219a;
            composerBeautyViewImpl3.f139207i.setOnClickListener(new h(composerBeautyViewImpl3));
            ComposerBeautyViewImpl composerBeautyViewImpl4 = this.f139219a;
            if (composerBeautyViewImpl4.A.f138902l) {
                RelativeLayout relativeLayout = composerBeautyViewImpl4.f139210l;
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                return;
            }
            RelativeLayout relativeLayout2 = composerBeautyViewImpl4.f139210l;
            h.f.b.l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float d2;
        float f6;
        float f7;
        RelativeLayout relativeLayout = this.f139202d;
        float[] fArr = new float[2];
        float f8 = 0.0f;
        if (z2) {
            Context context = getContext();
            h.f.b.l.b(context, "");
            f2 = -com.ss.android.ugc.aweme.dependence.beauty.a.a.d(context);
        } else {
            f2 = 0.0f;
        }
        fArr[0] = f2;
        if (z2) {
            f3 = 0.0f;
        } else {
            Context context2 = getContext();
            h.f.b.l.b(context2, "");
            f3 = -com.ss.android.ugc.aweme.dependence.beauty.a.a.d(context2);
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.f139202d;
        float[] fArr2 = new float[2];
        if (z2) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z2) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.f139206h;
        float[] fArr3 = new float[2];
        if (z2) {
            d2 = 0.0f;
        } else {
            Context context3 = getContext();
            h.f.b.l.b(context3, "");
            d2 = com.ss.android.ugc.aweme.dependence.beauty.a.a.d(context3);
        }
        fArr3[0] = d2;
        if (z2) {
            Context context4 = getContext();
            h.f.b.l.b(context4, "");
            f6 = com.ss.android.ugc.aweme.dependence.beauty.a.a.d(context4);
        } else {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.f139206h;
        float[] fArr4 = new float[2];
        if (z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr4[0] = f7;
        if (!z2) {
            f8 = 1.0f;
        }
        fArr4[1] = f8;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new g(this, z2));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    static final class d extends h.f.b.m implements h.f.a.m<ComposerBeauty, Integer, z> {
        final /* synthetic */ ComposerBeautyViewImpl this$0;

        static {
            Covode.recordClassIndex(91029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(2);
            this.this$0 = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            h.f.b.l.d(composerBeauty2, "");
            this.this$0.a(composerBeauty2);
            f.b beautyOnInteractListener = this.this$0.getBeautyOnInteractListener();
            if (beautyOnInteractListener != null) {
                beautyOnInteractListener.a(composerBeauty2);
            }
            ComposerBeautyViewImpl.a(this.this$0, composerBeauty2, true, true, false, null, 24);
            this.this$0.getSource().g(composerBeauty2);
            this.this$0.setBeautyShowDot(composerBeauty2);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<ComposerBeauty, Integer, z> {
        final /* synthetic */ ComposerBeautyViewImpl this$0;

        static {
            Covode.recordClassIndex(91030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(2);
            this.this$0 = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            h.f.b.l.d(composerBeauty2, "");
            this.this$0.a(composerBeauty2);
            f.b beautyOnInteractListener = this.this$0.getBeautyOnInteractListener();
            if (beautyOnInteractListener != null) {
                beautyOnInteractListener.a(composerBeauty2);
            }
            T t = null;
            if (composerBeauty2.isCollectionType()) {
                this.this$0.p = composerBeauty2;
                com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.this$0.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.a(composerBeauty2);
                }
                TextView textView = this.this$0.f139208j;
                h.f.b.l.b(textView, "");
                textView.setText(composerBeauty2.getEffect().getName());
                ComposerBeautyViewImpl composerBeautyViewImpl = this.this$0;
                RelativeLayout relativeLayout = composerBeautyViewImpl.f139206h;
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                composerBeautyViewImpl.a(false);
                composerBeautyViewImpl.r = true;
                com.ss.android.ugc.aweme.tools.beauty.service.b bVar = composerBeautyViewImpl.f139199a;
                if (bVar != null) {
                    bVar.b(composerBeautyViewImpl.s);
                }
                composerBeautyViewImpl.s = null;
                f.b beautyOnInteractListener2 = this.this$0.getBeautyOnInteractListener();
                if (beautyOnInteractListener2 != null) {
                    beautyOnInteractListener2.b(composerBeauty2);
                }
                String h2 = this.this$0.getSource().h(composerBeauty2);
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    com.ss.android.ugc.aweme.tools.beauty.a.a.a(this.this$0.o, childList);
                    ComposerBeautyViewImpl composerBeautyViewImpl2 = this.this$0;
                    androidx.c.a<String, Integer> value = composerBeautyViewImpl2.z.h().getValue();
                    if (value != null) {
                        for (Map.Entry<String, Integer> entry : value.entrySet()) {
                            Iterator<T> it = composerBeautyViewImpl2.o.f138761a.iterator();
                            while (it.hasNext()) {
                                Integer value2 = entry.getValue();
                                h.f.b.l.b(value2, "");
                                it.next().setDownloadState(value2.intValue());
                                composerBeautyViewImpl2.o.notifyDataSetChanged();
                            }
                        }
                    }
                    Iterator<T> it2 = childList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (h.f.b.l.a((Object) next.getEffect().getResourceId(), (Object) h2)) {
                            t = next;
                            break;
                        }
                    }
                    ComposerBeautyViewImpl.a(this.this$0, t, true, false, false, null, 28);
                }
            } else {
                com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried2 = this.this$0.getBeautyBuried();
                if (beautyBuried2 != null) {
                    beautyBuried2.a(composerBeauty2);
                }
                ComposerBeautyViewImpl.a(this.this$0, composerBeauty2, false, true, false, null, 26);
                this.this$0.getSource().f(composerBeauty2);
                this.this$0.setBeautyShowDot(composerBeauty2);
            }
            return z.f158842a;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public f.b f139212a;

        /* renamed from: b  reason: collision with root package name */
        public f.a f139213b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.android.ugc.aweme.tools.beauty.service.b f139214c;

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.aweme.tools.beauty.b.a.e f139215d = new com.ss.android.ugc.aweme.tools.beauty.b.a.e();

        /* renamed from: e  reason: collision with root package name */
        public final Context f139216e;

        /* renamed from: f  reason: collision with root package name */
        public final ViewGroup f139217f;

        /* renamed from: g  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.tools.beauty.g.m f139218g;

        static {
            Covode.recordClassIndex(91026);
        }

        public a(Context context, ViewGroup viewGroup, com.ss.android.ugc.aweme.tools.beauty.g.m mVar) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(mVar, "");
            this.f139216e = context;
            this.f139217f = viewGroup;
            this.f139218g = mVar;
        }
    }

    private ComposerBeautyViewImpl(Context context, com.ss.android.ugc.aweme.tools.beauty.g.m mVar, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar) {
        super(context);
        MethodCollector.i(12019);
        this.z = mVar;
        this.A = eVar;
        this.f139200b = eVar.n;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.e1, this, true);
        this.C = a2;
        View findViewById = a2.findViewById(R.id.fe8);
        this.D = findViewById;
        this.f139201c = (BeautyStyleFrameLayout) a2.findViewById(R.id.b4u);
        this.f139202d = (RelativeLayout) a2.findViewById(R.id.do2);
        this.f139203e = (StyleTabLayout) a2.findViewById(R.id.en4);
        this.f139204f = (StyleView) a2.findViewById(R.id.fe7);
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) a2.findViewById(R.id.dr6);
        this.f139205g = styleRecyclerView;
        RelativeLayout relativeLayout = (RelativeLayout) a2.findViewById(R.id.do0);
        this.f139206h = relativeLayout;
        this.f139207i = (FrameLayout) a2.findViewById(R.id.b4s);
        this.f139208j = (TextView) a2.findViewById(R.id.ex5);
        StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) a2.findViewById(R.id.dr5);
        this.f139209k = styleRecyclerView2;
        this.E = (StyleTextView) a2.findViewById(R.id.ex7);
        this.F = (BeautySeekBar) a2.findViewById(R.id.d2q);
        this.G = (BeautySeekBar) a2.findViewById(R.id.d2r);
        this.H = (LinearLayout) a2.findViewById(R.id.do5);
        this.f139210l = (RelativeLayout) a2.findViewById(R.id.do3);
        this.I = (ViewGroup) a2.findViewById(R.id.b4t);
        this.f139211m = (BeautySwitchView) a2.findViewById(R.id.b34);
        this.J = (ImageView) a2.findViewById(R.id.bvl);
        View findViewById2 = a2.findViewById(R.id.f6w);
        h.f.b.l.b(findViewById2, "");
        this.K = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.f6x);
        h.f.b.l.b(findViewById3, "");
        this.L = (TextView) findViewById3;
        com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar = this.A.f138859c;
        h.f.b.l.b(styleRecyclerView, "");
        this.n = new com.ss.android.ugc.aweme.tools.beauty.a.a(dVar, styleRecyclerView);
        com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar2 = this.A.f138859c;
        h.f.b.l.b(styleRecyclerView2, "");
        this.o = new com.ss.android.ugc.aweme.tools.beauty.a.a(dVar2, styleRecyclerView2);
        this.N = new FrameLayout(context);
        this.t = new com.ss.android.ugc.aweme.tools.beauty.g.e(mVar, this);
        this.u = new com.ss.android.ugc.aweme.tools.beauty.g.f(mVar, this);
        this.v = new LinkedHashMap();
        this.w = new e(this);
        this.x = new d(this);
        if (context instanceof androidx.appcompat.app.d) {
            androidx.appcompat.app.d dVar3 = (androidx.appcompat.app.d) context;
            dVar3.getLifecycle().a(this);
            mVar.b().a(dVar3, new b(this));
            mVar.h().observe(dVar3, new c(this));
        }
        h.f.b.l.b(relativeLayout, "");
        relativeLayout.setAlpha(0.0f);
        h.f.b.l.b(relativeLayout, "");
        relativeLayout.setTranslationX(com.ss.android.ugc.aweme.dependence.beauty.a.a.d(context));
        if (this.A.f138899i) {
            findViewById.setOnClickListener(new f(this));
            MethodCollector.o(12019);
            return;
        }
        h.f.b.l.b(findViewById, "");
        findViewById.setClickable(false);
        MethodCollector.o(12019);
    }

    public /* synthetic */ ComposerBeautyViewImpl(Context context, com.ss.android.ugc.aweme.tools.beauty.g.m mVar, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar, byte b2) {
        this(context, mVar, eVar);
    }

    static /* synthetic */ void a(ComposerBeautyViewImpl composerBeautyViewImpl, ComposerBeauty composerBeauty, boolean z2, boolean z3, boolean z4, ComposerBeauty composerBeauty2, int i2) {
        boolean z5;
        boolean z6;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = true;
        }
        if ((i2 & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        if (z4) {
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar = composerBeautyViewImpl.f139199a;
            if (bVar != null) {
                bVar.b(composerBeautyViewImpl.s);
            }
            composerBeautyViewImpl.s = composerBeauty2;
        }
        if (composerBeauty == null) {
            composerBeautyViewImpl.b(false);
            return;
        }
        if (z2) {
            for (T t2 : composerBeautyViewImpl.o.f138761a) {
                if (!h.f.b.l.a((Object) t2, (Object) composerBeauty) || !t2.getEnable()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                t2.setSelected(z6);
            }
        } else {
            for (T t3 : composerBeautyViewImpl.n.f138761a) {
                if (!h.f.b.l.a((Object) t3, (Object) composerBeauty) || !t3.getEnable()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                t3.setSelected(z5);
            }
        }
        if (composerBeauty.isCollectionType()) {
            composerBeautyViewImpl.b(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            composerBeautyViewImpl.b(false);
        } else {
            composerBeautyViewImpl.b(true);
        }
        if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
            composerBeautyViewImpl.q = composerBeauty;
        } else {
            composerBeautyViewImpl.p = composerBeauty;
        }
        if (composerBeautyViewImpl.u.a()) {
            BeautySeekBar beautySeekBar = composerBeautyViewImpl.G;
            h.f.b.l.b(beautySeekBar, "");
            beautySeekBar.setVisibility(0);
        } else {
            BeautySeekBar beautySeekBar2 = composerBeautyViewImpl.G;
            h.f.b.l.b(beautySeekBar2, "");
            beautySeekBar2.setVisibility(8);
        }
        composerBeautyViewImpl.u.a(composerBeauty, z3, true);
        composerBeautyViewImpl.t.a();
    }
}
