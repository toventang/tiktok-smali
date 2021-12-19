package com.ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.l;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.o;
import com.zhiliaoapp.musically.R;
import h.a.n;
import java.util.List;

public final class AdFakeUserProfileNavigator extends RelativeLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f75066e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f75067a;

    /* renamed from: b  reason: collision with root package name */
    public View f75068b;

    /* renamed from: c  reason: collision with root package name */
    public View f75069c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f75070d;

    /* renamed from: f  reason: collision with root package name */
    private l f75071f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager.e f75072g;

    public interface b {
        static {
            Covode.recordClassIndex(46292);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(46290);
    }

    public AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.azx);
        h.f.b.l.b(findViewById, "");
        this.f75067a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.azp);
        h.f.b.l.b(findViewById2, "");
        this.f75068b = findViewById2;
    }

    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileNavigator f75079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f75080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPager f75081c;

        static {
            Covode.recordClassIndex(46295);
        }

        public final void onGlobalLayout() {
            if (this.f75080b.isAlive()) {
                this.f75080b.removeOnGlobalLayoutListener(this);
                AdFakeUserProfileNavigator adFakeUserProfileNavigator = this.f75079a;
                ViewPager viewPager = this.f75081c;
                View a2 = AdFakeUserProfileNavigator.a(adFakeUserProfileNavigator);
                if (viewPager != null && a2 != null) {
                    adFakeUserProfileNavigator.a(viewPager.getCurrentItem(), 0.0f, a2);
                }
            }
        }

        e(AdFakeUserProfileNavigator adFakeUserProfileNavigator, ViewTreeObserver viewTreeObserver, ViewPager viewPager) {
            this.f75079a = adFakeUserProfileNavigator;
            this.f75080b = viewTreeObserver;
            this.f75081c = viewPager;
        }
    }

    private final View a(int i2) {
        LinearLayout linearLayout = this.f75067a;
        if (linearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        return linearLayout.getChildAt(i2);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileNavigator f75073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f75074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f75075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewPager f75076d;

        static {
            Covode.recordClassIndex(46293);
        }

        c(AdFakeUserProfileNavigator adFakeUserProfileNavigator, b bVar, int i2, ViewPager viewPager) {
            this.f75073a = adFakeUserProfileNavigator;
            this.f75074b = bVar;
            this.f75075c = i2;
            this.f75076d = viewPager;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f75073a.f75070d) {
                this.f75076d.setCurrentItem(this.f75075c);
            }
        }
    }

    public static final /* synthetic */ View a(AdFakeUserProfileNavigator adFakeUserProfileNavigator) {
        View view = adFakeUserProfileNavigator.f75068b;
        if (view == null) {
            h.f.b.l.a("indicator");
        }
        return view;
    }

    public static final class d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileNavigator f75077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f75078b;

        static {
            Covode.recordClassIndex(46294);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            LinearLayout linearLayout = this.f75077a.f75067a;
            if (linearLayout == null) {
                h.f.b.l.a("tabContainer");
            }
            View childAt = linearLayout.getChildAt(i2);
            if (this.f75077a.f75069c != null) {
                View view = this.f75077a.f75069c;
                if (view == null) {
                    h.f.b.l.b();
                }
                view.setSelected(false);
            }
            if (childAt != null) {
                childAt.setSelected(true);
                this.f75077a.f75069c = childAt;
            }
            b bVar = this.f75078b;
            if (bVar != null) {
                bVar.a();
            }
        }

        d(AdFakeUserProfileNavigator adFakeUserProfileNavigator, b bVar) {
            this.f75077a = adFakeUserProfileNavigator;
            this.f75078b = bVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            AdFakeUserProfileNavigator adFakeUserProfileNavigator = this.f75077a;
            adFakeUserProfileNavigator.a(i2, f2, AdFakeUserProfileNavigator.a(adFakeUserProfileNavigator));
        }
    }

    public final void a(ViewPager viewPager, b bVar) {
        MethodCollector.i(10591);
        if (viewPager == null) {
            MethodCollector.o(10591);
        } else if (viewPager.getAdapter() == null) {
            MethodCollector.o(10591);
        } else {
            List b2 = n.b(Integer.valueOf((int) R.drawable.cd), Integer.valueOf((int) R.raw.icon_3pt_video));
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                l lVar = (l) adapter;
                this.f75071f = lVar;
                if (lVar != null) {
                    int count = lVar.getCount();
                    if (count <= 0) {
                        MethodCollector.o(10591);
                        return;
                    }
                    LinearLayout linearLayout = this.f75067a;
                    if (linearLayout == null) {
                        h.f.b.l.a("tabContainer");
                    }
                    linearLayout.removeAllViews();
                    int i2 = 0;
                    do {
                        Context context = getContext();
                        LinearLayout linearLayout2 = this.f75067a;
                        if (linearLayout2 == null) {
                            h.f.b.l.a("tabContainer");
                        }
                        int intValue = ((Number) b2.get(i2)).intValue();
                        View a2 = com.a.a(LayoutInflater.from(context), R.layout.aqr, linearLayout2, false);
                        if (a2 != null) {
                            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = (AdFakeUserProfileTabImageView) a2;
                            adFakeUserProfileTabImageView.setImageResource(intValue);
                            adFakeUserProfileTabImageView.setAnimationEnabled(true);
                            adFakeUserProfileTabImageView.setOnClickListener(new c(this, bVar, i2, viewPager));
                            LinearLayout linearLayout3 = this.f75067a;
                            if (linearLayout3 == null) {
                                h.f.b.l.a("tabContainer");
                            }
                            linearLayout3.addView(adFakeUserProfileTabImageView);
                            i2++;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView");
                            MethodCollector.o(10591);
                            throw nullPointerException;
                        }
                    } while (i2 < count);
                    AdFakeUserProfileTabImageView adFakeUserProfileTabImageView2 = (AdFakeUserProfileTabImageView) a(0);
                    if (adFakeUserProfileTabImageView2 != null) {
                        this.f75069c = adFakeUserProfileTabImageView2;
                        adFakeUserProfileTabImageView2.setSelected(true);
                    }
                    ViewPager.e eVar = this.f75072g;
                    if (eVar != null) {
                        viewPager.removeOnPageChangeListener(eVar);
                    }
                    d dVar = new d(this, bVar);
                    this.f75072g = dVar;
                    viewPager.addOnPageChangeListener(dVar);
                    ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new e(this, viewTreeObserver, viewPager));
                        MethodCollector.o(10591);
                        return;
                    }
                    MethodCollector.o(10591);
                    return;
                }
                MethodCollector.o(10591);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
            MethodCollector.o(10591);
            throw nullPointerException2;
        }
    }

    private /* synthetic */ AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(10593);
        this.f75070d = true;
        MethodCollector.o(10593);
    }

    public final void a(int i2, float f2, View view) {
        View a2;
        View a3;
        if (o.a(view) && (a2 = a(i2)) != null && (a3 = a(i2 + 1)) != null) {
            if (a2.getVisibility() == 0 && a3.getVisibility() == 0) {
                float x = (a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f2 * (((a3.getX() + ((float) (a3.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (o.a(a2)) {
                view.setX(((getX() + a2.getX()) + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }
}
