package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.mvtemplate.f.b;
import com.ss.android.ugc.aweme.tools.mvtemplate.f.f;
import com.ss.android.ugc.aweme.tools.mvtemplate.g;
import com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView;
import com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager;
import com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton;
import com.ss.android.ugc.d.a.c;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class MvTemplateView extends FrameLayout implements i, j {
    private e A;
    private m B = new m();
    private f C;
    private int D;
    private com.bytedance.o.f E;
    private g.a F;

    /* renamed from: a  reason: collision with root package name */
    public TextView f140595a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f140596b;

    /* renamed from: c  reason: collision with root package name */
    TextView f140597c;

    /* renamed from: d  reason: collision with root package name */
    MvThumbnailRecyclerView f140598d;

    /* renamed from: e  reason: collision with root package name */
    View f140599e;

    /* renamed from: f  reason: collision with root package name */
    CircularAnimateButton f140600f;

    /* renamed from: g  reason: collision with root package name */
    public int f140601g;

    /* renamed from: h  reason: collision with root package name */
    public int f140602h;

    /* renamed from: i  reason: collision with root package name */
    View f140603i;

    /* renamed from: j  reason: collision with root package name */
    DmtLoadingLayout f140604j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f140605k;

    /* renamed from: l  reason: collision with root package name */
    View f140606l;

    /* renamed from: m  reason: collision with root package name */
    public l f140607m;
    MvThemeListViewPager n;
    public com.ss.android.ugc.aweme.tools.mvtemplate.f.e o;
    public int p;
    a q;
    public a r;
    public boolean s;
    public boolean t = false;
    ObjectAnimator u;
    ObjectAnimator v;
    com.ss.android.ugc.aweme.tools.mvtemplate.c.a.a w;
    private ViewGroup x;
    private View y;
    private int z;

    static {
        Covode.recordClassIndex(91830);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(226, new org.greenrobot.eventbus.g(MvTemplateView.class, "handleSelectEvent", g.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public int getDataCount() {
        return this.o.getCount();
    }

    public final void d() {
        b a2 = a(this.f140602h);
        if (a2 != null) {
            a2.f();
        }
    }

    public final void e() {
        b a2 = a(this.f140602h);
        if (a2 != null) {
            a2.g();
        }
    }

    private int getItemWidth() {
        b b2;
        if (this.p <= 0 && (b2 = this.o.a(0)) != null) {
            this.p = b2.d();
        }
        return this.p;
    }

    public final void b() {
        final int i2 = this.f140602h;
        a(false);
        final MvThemeData c2 = this.o.c(i2);
        final b a2 = a(i2);
        if (c2 != null) {
            this.B.a(c2.f140618a, new IEffectDownloadProgressListener() {
                /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(91836);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                    MvTemplateView.this.a(false);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i2 = i2;
                    b bVar = a2;
                    if (i2 == mvTemplateView.f140602h) {
                        mvTemplateView.a(true);
                        if (mvTemplateView.f140607m != null) {
                            mvTemplateView.f140607m.a(mvTemplateView.o.c(mvTemplateView.f140602h), 1, mvTemplateView.f140602h);
                        }
                    }
                    if (bVar != null) {
                        bVar.b(false);
                    }
                    com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(c2, (ExceptionResult) null, true);
                    bj.a("MVRes: Download Success:" + effect2.getUnzipPath());
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    d.a(MvTemplateView.this.getContext(), MvTemplateView.this.getResources().getString(R.string.fgj)).b();
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i2 = i2;
                    b bVar = a2;
                    if (i2 == mvTemplateView.f140602h) {
                        mvTemplateView.a(true);
                    }
                    if (bVar != null) {
                        bVar.b(false);
                    }
                    com.ss.android.ugc.aweme.tools.mvtemplate.e.a.a(c2, exceptionResult, false);
                    if (effect != null) {
                        bj.a("MVRes: Download Failed:" + effect.getName());
                    } else {
                        bj.a("MVRes: Download Failed:" + c2.f());
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect, int i2, long j2) {
                    b bVar = a2;
                    if (bVar != null) {
                        bVar.b(true);
                        bVar.a(false);
                        if (bVar.f140833a != null) {
                            bVar.f140833a.setProgress((float) i2);
                        }
                        if (bVar.f140834b != null) {
                            bVar.f140834b.setText(i2 + "%");
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        CircularAnimateButton circularAnimateButton = this.f140600f;
        circularAnimateButton.setText(circularAnimateButton.getContext().getResources().getString(R.string.f_k));
        this.f140600f.setClickable(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f140617a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 91837(0x166bd, float:1.28691E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a[] r0 = com.ss.android.ugc.aweme.tools.mvtemplate.g.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass7.f140617a = r2
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a r0 = com.ss.android.ugc.aweme.tools.mvtemplate.g.a.ICON_LIST     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass7.f140617a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a r0 = com.ss.android.ugc.aweme.tools.mvtemplate.g.a.MAIN_TEMPLATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass7.<clinit>():void");
        }
    }

    public final void f() {
        View findViewById;
        this.q.f140914e = false;
        MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f140598d;
        View childAt = mvThumbnailRecyclerView.getChildAt(mvThumbnailRecyclerView.getChildCount() - 1);
        if (childAt != null && (findViewById = childAt.findViewById(R.id.ci9)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void a() {
        this.f140604j.setVisibility(8);
        this.f140603i.setVisibility(0);
        this.f140596b.setVisibility(0);
        this.f140595a.setVisibility(0);
        if (!this.s) {
            this.f140597c.setVisibility(0);
        }
        this.n.setNoScroll(false);
        com.ss.android.ugc.aweme.tools.mvtemplate.f.e eVar = this.o;
        if (eVar != null) {
            a(eVar.c(this.f140602h));
        } else {
            a(true);
        }
        this.f140600f.a();
        this.f140605k = false;
        l lVar = this.f140607m;
        if (lVar != null) {
            lVar.b(this.o.c(0));
        }
    }

    public void setMoreDataFetcher(a aVar) {
        this.r = aVar;
    }

    public void setMvThemeClickListener(l lVar) {
        this.f140607m = lVar;
    }

    public void setMvEffectPlatform(com.ss.android.ugc.aweme.effectplatform.f fVar) {
        this.B.f140864a = fVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public final b a(int i2) {
        if (this.o.getCount() <= 0 || i2 < 0 || i2 >= this.o.getCount()) {
            return null;
        }
        return this.o.a(i2);
    }

    public void setDiContainer(com.bytedance.o.f fVar) {
        this.E = this.E;
        this.o.f140848a = fVar;
        this.w = ((com.ss.android.ugc.aweme.tools.mvtemplate.c.a) fVar.a(com.ss.android.ugc.aweme.tools.mvtemplate.c.a.class, (String) null)).getAVAppPlayingVideoViewProxy();
    }

    private static List<MvThemeData> b(List<MvThemeData> list) {
        if (!AVCommerceServiceImpl.h().a()) {
            return list;
        }
        if (k.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MvThemeData mvThemeData : list) {
            if (mvThemeData.r) {
                arrayList.add(mvThemeData);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f140618a == null) {
            a(true);
        } else {
            a(!this.B.a(mvThemeData.f140618a));
        }
    }

    public final void a(Boolean bool) {
        float b2;
        int b3 = (int) n.b(getContext(), 16.0f);
        CircularAnimateButton circularAnimateButton = this.f140600f;
        if (circularAnimateButton != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) circularAnimateButton.getLayoutParams();
            if (bool.booleanValue()) {
                b2 = ((float) b3) + n.b(getContext(), 65.0f);
            } else {
                b2 = n.b(getContext(), 65.0f);
            }
            layoutParams.bottomMargin = (int) b2;
            this.f140600f.setLayoutParams(layoutParams);
        }
    }

    @r
    public void handleSelectEvent(g gVar) {
        if (gVar.f140852a == g.b.START) {
            this.F = gVar.f140853b;
        } else if (!(this.F == null || gVar.f140853b == this.F)) {
            return;
        }
        int i2 = AnonymousClass7.f140617a[gVar.f140853b.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && gVar.f140852a == g.b.SCROLL) {
                this.f140598d.a(gVar.f140854c, gVar.f140855d, false);
            }
        } else if (gVar.f140852a == g.b.SCROLL) {
            float f2 = gVar.f140855d;
            this.n.scrollTo((int) ((((float) gVar.f140854c) + f2) * ((float) (getItemWidth() + this.D))), 0);
            if (gVar.f140854c != this.n.getCurrentItem() && ((double) f2) < 0.01d) {
                this.n.setCurrentItem(gVar.f140854c);
            }
            b b2 = this.o.a(gVar.f140854c);
            if (b2 != null) {
                this.C.b(b2.getView(), f2);
                int i3 = gVar.f140854c + 1;
                if (i3 < this.o.getCount()) {
                    this.C.b(this.o.a(i3).getView(), 1.0f - f2);
                }
            }
        }
    }

    public final void a(List<MvThemeData> list) {
        List<MvThemeData> b2 = b(list);
        if (!k.a(b2)) {
            if (this.s) {
                if (this.f140605k) {
                    this.q.f140910a.clear();
                    this.q.f140913d = true;
                    this.p = 0;
                }
                this.t = false;
                int size = this.q.f140910a.size();
                this.q.f140910a.addAll(b2);
                if (this.f140598d.l()) {
                    this.f140598d.post(new k(this, size, b2));
                } else if (size == 0) {
                    this.q.notifyDataSetChanged();
                } else {
                    this.q.notifyItemRangeInserted(size + 1, b2.size());
                }
            }
            if (getDataCount() == 0 || this.f140605k) {
                this.n.setAdapter(this.o);
                this.o.a(b2);
                if (this.f140597c != null && !k.a(b2)) {
                    this.f140597c.setText("1/" + b2.size());
                    MvThemeData mvThemeData = b2.get(0);
                    if (mvThemeData != null) {
                        if (!TextUtils.isEmpty(mvThemeData.f())) {
                            this.f140595a.setText(mvThemeData.f());
                        }
                        if (!TextUtils.isEmpty(mvThemeData.h())) {
                            this.f140596b.setText(mvThemeData.h());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.o.b(b2);
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            CircularAnimateButton circularAnimateButton = this.f140600f;
            circularAnimateButton.setText(circularAnimateButton.getContext().getResources().getString(R.string.f_k));
            this.f140600f.setClickable(true);
            return;
        }
        CircularAnimateButton circularAnimateButton2 = this.f140600f;
        circularAnimateButton2.setText(circularAnimateButton2.getContext().getResources().getString(R.string.zc));
        this.f140600f.setClickable(false);
    }

    public MvTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f2;
        MethodCollector.i(6966);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof e) {
                this.A = (e) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.z = androidx.core.content.b.c(context, R.color.bh);
        this.s = false;
        setClipChildren(false);
        setBackgroundColor(Color.parseColor("#C0000000"));
        LayoutInflater.from(context).inflate(R.layout.agt, this);
        this.f140595a = (TextView) findViewById(R.id.ekf);
        this.f140596b = (TextView) findViewById(R.id.eke);
        this.f140597c = (TextView) findViewById(R.id.afs);
        this.f140598d = (MvThumbnailRecyclerView) findViewById(R.id.dro);
        this.x = (ViewGroup) findViewById(R.id.c92);
        this.f140600f = (CircularAnimateButton) findViewById(R.id.e9m);
        this.f140603i = findViewById(R.id.ae6);
        this.f140604j = (DmtLoadingLayout) findViewById(R.id.chw);
        this.f140599e = findViewById(R.id.d1w);
        this.y = findViewById(R.id.fkb);
        this.f140600f.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(91831);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                MvTemplateView mvTemplateView = MvTemplateView.this;
                MvThemeData c2 = mvTemplateView.o.c(mvTemplateView.f140602h);
                if (mvTemplateView.f140607m != null && mvTemplateView.f140607m.a(c2)) {
                    MvTemplateView.this.b();
                }
            }
        });
        this.f140606l = findViewById(R.id.crx);
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        if (a2 != null) {
            this.f140600f.setTypeface(a2);
        }
        this.f140606l.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(91832);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                if (MvTemplateView.this.f140607m != null) {
                    MvTemplateView.this.f140607m.a(MvTemplateView.this.o.c(MvTemplateView.this.f140602h), 2, MvTemplateView.this.f140602h);
                }
            }
        });
        this.f140595a.setSelected(true);
        this.f140596b.setSelected(true);
        if (this.s) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f140599e.getLayoutParams();
            layoutParams.topMargin = (int) (((float) dh.c(getContext())) + n.b(getContext(), 32.0f));
            this.f140599e.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f140599e.getLayoutParams();
            layoutParams2.topMargin = (int) (((float) dh.c(getContext())) + n.b(getContext(), 68.5f));
            this.f140599e.setLayoutParams(layoutParams2);
        }
        MvThemeListViewPager mvThemeListViewPager = (MvThemeListViewPager) findViewById(R.id.fk_);
        this.n = mvThemeListViewPager;
        mvThemeListViewPager.setOffscreenPageLimit(3);
        com.ss.android.ugc.aweme.tools.mvtemplate.a.i iVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.i(this.n.getContext());
        MvThemeListViewPager mvThemeListViewPager2 = this.n;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(mvThemeListViewPager2, iVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        iVar.f140780a = 500;
        if (this.s) {
            f2 = 0.0f;
        } else {
            f2 = 0.6f;
        }
        this.C = new f(f2);
        int b2 = (int) n.b(this.A, 16.0f);
        this.D = b2;
        this.n.setPageMargin(b2);
        this.n.setPageTransformer(true, this.C);
        this.n.setBounceScrollListener(new MvThemeListViewPager.a() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(91833);
            }

            @Override // com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.a
            public final void a() {
                MvTemplateView.this.f140595a.setAlpha(1.0f);
                MvTemplateView.this.f140596b.setAlpha(1.0f);
            }

            @Override // com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.a
            public final void a(float f2) {
                b b2;
                if (MvTemplateView.this.p == 0 && (b2 = MvTemplateView.this.o.a(0)) != null) {
                    MvTemplateView.this.p = b2.d();
                }
                if (MvTemplateView.this.p > 0 && f2 < 0.0f) {
                    float abs = 1.0f - ((Math.abs(f2) / ((float) MvTemplateView.this.p)) * 2.0f);
                    MvTemplateView.this.f140595a.setAlpha(abs);
                    MvTemplateView.this.f140596b.setAlpha(abs);
                }
            }
        });
        com.ss.android.ugc.aweme.tools.mvtemplate.f.e eVar = new com.ss.android.ugc.aweme.tools.mvtemplate.f.e(this.A.getSupportFragmentManager());
        this.o = eVar;
        this.n.setAdapter(eVar);
        this.n.addOnPageChangeListener(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(91834);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                MvThemeData c2 = MvTemplateView.this.o.c(i2);
                if (c2 != null) {
                    if (MvTemplateView.this.f140601g != i2) {
                        MvTemplateView mvTemplateView = MvTemplateView.this;
                        int i3 = mvTemplateView.f140601g;
                        mvTemplateView.f140595a.setText(c2.f());
                        mvTemplateView.f140596b.setText(c2.h());
                        mvTemplateView.f140597c.setText((i2 + 1) + "/" + mvTemplateView.o.getCount());
                        b a2 = mvTemplateView.a(i3);
                        if (!(a2 == null || a2.f140836d == null)) {
                            a2.g();
                        }
                        b a3 = mvTemplateView.a(i2);
                        if (!(a3 == null || a3.f140836d == null)) {
                            a3.e();
                        }
                        mvTemplateView.a(c2);
                        if (mvTemplateView.f140607m != null) {
                            mvTemplateView.f140607m.a(c2, 3, i2);
                        }
                    }
                    MvTemplateView.this.f140601g = i2;
                }
                MvTemplateView.this.f140602h = i2;
                if (MvTemplateView.this.s && MvTemplateView.this.t) {
                    MvTemplateView.this.r.a();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                c.a(new g(g.b.SCROLL, g.a.MAIN_TEMPLATE, i2, f2));
            }
        });
        this.n.setHandleClickChange(true ^ this.s);
        this.y.setOnTouchListener(new j(this));
        if (this.s) {
            this.x.setVisibility(0);
            a aVar = new a();
            this.q = aVar;
            aVar.f140911b = new h(this);
            this.q.f140912c = new i(this);
            this.f140598d.setAdapter(this.q);
        }
        this.f140600f.setBackgroundColor(this.z);
        MethodCollector.o(6966);
    }
}
