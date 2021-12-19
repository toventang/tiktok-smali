package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends FrameLayout implements com.ss.android.ugc.aweme.commerce.sdk.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public c f86021a;

    /* renamed from: b  reason: collision with root package name */
    protected BounceBackViewPager f86022b;

    /* renamed from: c  reason: collision with root package name */
    public d f86023c;

    /* renamed from: d  reason: collision with root package name */
    public a f86024d;

    /* renamed from: e  reason: collision with root package name */
    public int f86025e = 1;

    /* renamed from: f  reason: collision with root package name */
    boolean f86026f;

    /* renamed from: g  reason: collision with root package name */
    float f86027g;

    /* renamed from: h  reason: collision with root package name */
    public ViewPager.e f86028h = new ViewPager.h() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(53848);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", e.this.f86022b.getCurrentItem());
                jSONObject.put("identity", e.this.f86023c.f86001g);
                jSONObject.put("from", e.this.f86023c.f86002h);
                jSONObject.put(StringSet.type, 0);
                EventCenter.a().a("ec_gallery_new_image_viewed", jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (i2 == e.this.f86023c.u) {
                e.this.a(i2 - 1);
                return;
            }
            e.this.f86023c.f85995a = i2 % e.this.f86023c.u;
            if (e.this.f86023c.f85999e) {
                e.this.a(i2, 0);
            } else {
                for (int i3 = 1; i3 <= e.this.f86025e; i3++) {
                    e.this.a(i2, i3);
                }
            }
            if (e.this.f86023c.s != null) {
                e.this.f86023c.s.a(e.this.f86022b.getCurrentItem());
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    c.b f86029i = new c.b() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.AnonymousClass3 */

        static {
            Covode.recordClassIndex(53850);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.b
        public final void a() {
            e.this.f86026f = true;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.b
        public final void a(int i2, float f2) {
            ImageView imageView;
            e.this.f86027g = 255.0f * f2;
            e eVar = e.this;
            eVar.setBackgroundColor(eVar.a(eVar.f86027g));
            if (((double) f2) <= 0.05d && i2 == 2 && (imageView = e.this.f86023c.a().get(e.this.f86023c.f85995a)) != null) {
                imageView.setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.b
        public final void a(int i2, int i3, int i4) {
            e.this.f86026f = false;
            if (i3 == 100) {
                if (i2 == 1) {
                    e.this.d();
                    e.this.f86022b.setVisibility(0);
                    e.a(e.this.f86021a);
                } else if (i2 == 2) {
                    e.this.a();
                }
            } else if (i2 != 1) {
                if (i2 == 2 && i4 == 201) {
                    e.this.a();
                }
            } else if (i4 == 201) {
                e.this.d();
                e.this.f86022b.setVisibility(0);
                e.a(e.this.f86021a);
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    b.e f86030j = new b.e() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.AnonymousClass4 */

        static {
            Covode.recordClassIndex(53851);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b.e
        public final void a(float f2) {
            if (f2 > 1.0f) {
                e.this.e();
            } else {
                e.this.f();
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a f86031k;

    /* renamed from: l  reason: collision with root package name */
    private a f86032l;

    /* renamed from: m  reason: collision with root package name */
    private Set<Integer> f86033m;
    private Context n;
    private a.AbstractC2066a o = new a.AbstractC2066a() {
        /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.AnonymousClass2 */

        static {
            Covode.recordClassIndex(53849);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a.AbstractC2066a
        public final void a() {
            e.this.f86022b.a(e.this.f86028h);
            int i2 = e.this.f86023c.f85995a;
            if (e.this.f86023c.f85999e) {
                e.this.a(i2, 0);
            } else {
                e.this.a(i2, 1);
            }
        }
    };

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(53853);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(53847);
    }

    public final Context getActivityContext() {
        return this.n;
    }

    public final b.e getOnScaleListener() {
        return this.f86030j;
    }

    public final com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a getTransAdapter() {
        return this.f86031k;
    }

    public final d getTransConfig() {
        return this.f86023c;
    }

    public final c.b getTransListener() {
        return this.f86029i;
    }

    @Override // com.ss.android.ugc.aweme.commerce.sdk.b.a.a
    public final d getTransferConfig() {
        return this.f86023c;
    }

    /* access modifiers changed from: package-private */
    public final DmtRtlViewPager getViewPager() {
        return this.f86022b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final f c() {
        return new b(this);
    }

    /* access modifiers changed from: package-private */
    public final int getCurrentPosition() {
        return this.f86022b.getCurrentItem() % this.f86023c.u;
    }

    public final void e() {
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar = this.f86023c.f86007m;
        if (aVar != null && (this.f86023c.u >= 2 || this.f86023c.q)) {
            aVar.a();
        }
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b bVar = this.f86023c.n;
        if (bVar == null) {
            return;
        }
        if (this.f86023c.u >= 2 || this.f86023c.q) {
            bVar.a();
        }
    }

    public final void f() {
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar = this.f86023c.f86007m;
        if (aVar != null && (this.f86023c.u >= 2 || this.f86023c.q)) {
            aVar.a(this.f86022b);
        }
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b bVar = this.f86023c.n;
        if (bVar == null) {
            return;
        }
        if (this.f86023c.u >= 2 || this.f86023c.q) {
            bVar.a(this.f86022b);
        }
    }

    public final void a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        MethodCollector.i(6905);
        this.f86026f = false;
        this.f86033m.clear();
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar = this.f86023c.f86007m;
        if (!(aVar == null || aVar.f85962a == null || (viewGroup2 = (ViewGroup) aVar.f85962a.getParent()) == null)) {
            viewGroup2.removeView(aVar.f85962a);
        }
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b bVar = this.f86023c.n;
        if (!(bVar == null || bVar.f85965a == null || (viewGroup = (ViewGroup) bVar.f85965a.getParent()) == null)) {
            viewGroup.removeView(bVar.f85965a);
        }
        removeAllViews();
        this.f86032l.a();
        MethodCollector.o(6905);
    }

    public final void b() {
        com.ss.android.ugc.aweme.commerce.sdk.b.b.a.a aVar = new com.ss.android.ugc.aweme.commerce.sdk.b.b.a.a(this, this.f86023c.f86004j.size(), this.f86023c.f85995a);
        this.f86031k = aVar;
        aVar.f85987c = this.o;
        BounceBackViewPager bounceBackViewPager = new BounceBackViewPager(this.n);
        this.f86022b = bounceBackViewPager;
        bounceBackViewPager.setOverScrollMode(2);
        setBackgroundColor(a(255.0f));
        this.f86022b.setVisibility(4);
        this.f86022b.setOffscreenPageLimit(this.f86025e + 1);
        this.f86022b.setAdapter(this.f86031k);
        this.f86022b.setCurrentItem(this.f86023c.f85995a);
        addView(this.f86022b, new FrameLayout.LayoutParams(-1, -1));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("position", this.f86022b.getCurrentItem());
            jSONObject.put("identity", this.f86023c.f86001g);
            jSONObject.put("from", this.f86023c.f86002h);
            jSONObject.put(StringSet.type, 1);
            EventCenter.a().a("ec_gallery_new_image_viewed", jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        int i2 = this.f86023c.f85995a;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f86021a = c().a(i2);
    }

    public final void d() {
        MethodCollector.i(7009);
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a aVar = this.f86023c.f86007m;
        if (aVar != null && (this.f86023c.u > 0 || this.f86023c.q)) {
            aVar.f85964c = this;
            aVar.f85962a = LayoutInflater.from(getContext()).inflate(R.layout.os, (ViewGroup) null);
            aVar.f85963b = (NumberIndicator) aVar.f85962a.findViewById(R.id.d8x);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            addView(aVar.f85962a, layoutParams);
            aVar.f85962a.setPadding(0, i.b(), 0, 0);
            aVar.a(this.f86022b);
        }
        com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b bVar = this.f86023c.n;
        if (bVar != null && (this.f86023c.u > 0 || this.f86023c.q)) {
            bVar.f85966b = this;
            bVar.f85965a = LayoutInflater.from(getContext()).inflate(R.layout.or, (ViewGroup) null);
            bVar.f85967c = (TuxTextView) bVar.f85965a.findViewById(R.id.d95);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            addView(bVar.f85965a, layoutParams2);
            bVar.a(this.f86022b);
        }
        MethodCollector.o(7009);
    }

    public final void setOnLayoutResetListener(a aVar) {
        this.f86032l = aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f86024d;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public static void a(View view) {
        MethodCollector.i(6914);
        if (view == null) {
            MethodCollector.o(6914);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        MethodCollector.o(6914);
    }

    private void b(int i2) {
        c().b(i2 % this.f86023c.f86004j.size());
    }

    e(Context context) {
        super(context);
        MethodCollector.i(6823);
        this.n = context;
        this.f86033m = new HashSet();
        MethodCollector.o(6823);
    }

    /* access modifiers changed from: package-private */
    public final int a(float f2) {
        int i2 = this.f86023c.f85997c;
        return Color.argb(Math.round(f2), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c cVar;
        a aVar;
        if (motionEvent.getPointerCount() == 1 && (cVar = this.f86021a) != null && !cVar.f86067l && !cVar.f86068m && (aVar = this.f86024d) != null && motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                aVar.f85980a = motionEvent.getRawX();
                aVar.f85981b = motionEvent.getRawY();
            } else if (action == 1) {
                aVar.f85981b = 0.0f;
            } else if (action == 2 && motionEvent.getRawY() - aVar.f85981b > ((float) aVar.f85982c)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean a(int i2) {
        if (this.f86026f) {
            return false;
        }
        c cVar = this.f86021a;
        if (cVar != null && cVar.getState() == 2) {
            return false;
        }
        if (this.f86023c.r != null) {
            this.f86023c.r.a();
        }
        if (this.f86023c.f86000f <= 0 || i2 < this.f86023c.f86000f) {
            this.f86021a = c().c(i2);
        } else {
            this.f86021a = null;
        }
        if (this.f86021a == null) {
            a();
        } else {
            this.f86022b.setVisibility(4);
        }
        e();
        return true;
    }

    public final void a(final c cVar, final int i2) {
        cVar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e.AnonymousClass5 */

            static {
                Covode.recordClassIndex(53852);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                c cVar = cVar;
                if (cVar.n == 0.0f && cVar.o == 1.0f && cVar.getTranslationX() == 0.0f && cVar.getTranslationY() == 0.0f) {
                    e.this.a(i2);
                } else {
                    cVar.c();
                }
            }
        });
    }

    public final void a(int i2, int i3) {
        int i4 = i2 - i3;
        int i5 = i3 + i2;
        b(i2);
        this.f86033m.add(Integer.valueOf(i2));
        if (i4 >= 0 && !this.f86033m.contains(Integer.valueOf(i4))) {
            b(i4);
            this.f86033m.add(Integer.valueOf(i4));
        }
        if (i5 < this.f86023c.f86004j.size() && !this.f86033m.contains(Integer.valueOf(i5))) {
            b(i5);
            this.f86033m.add(Integer.valueOf(i5));
        }
    }
}
