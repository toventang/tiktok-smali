package com.ss.android.ugc.aweme.trending.b;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.q;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements ViewPager.f {

    /* renamed from: a  reason: collision with root package name */
    public static final C3733a f141045a = new C3733a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f141046b = n.a(16.0d);

    /* renamed from: c  reason: collision with root package name */
    private final c f141047c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final c f141048d;

    static {
        Covode.recordClassIndex(92078);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.a$a  reason: collision with other inner class name */
    public static final class C3733a {
        static {
            Covode.recordClassIndex(92079);
        }

        private C3733a() {
        }

        public /* synthetic */ C3733a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141049a = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(92080);
        }

        /* renamed from: com.ss.android.ugc.aweme.trending.b.a$b$a  reason: collision with other inner class name */
        static final class C3734a extends ViewOutlineProvider {

            /* renamed from: a  reason: collision with root package name */
            public float f141050a;

            /* renamed from: b  reason: collision with root package name */
            private final b f141051b = new b();

            static {
                Covode.recordClassIndex(92081);
            }

            public final void getOutline(View view, Outline outline) {
                l.d(view, "");
                l.d(outline, "");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f141051b.getInterpolation(this.f141050a));
            }
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f141052a;

        /* renamed from: b  reason: collision with root package name */
        public int f141053b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f141054c;

        /* renamed from: d  reason: collision with root package name */
        final h f141055d = i.a((h.f.a.a) new C3735a(this));

        /* renamed from: e  reason: collision with root package name */
        public int f141056e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f141057f;

        /* renamed from: g  reason: collision with root package name */
        public final VerticalViewPager f141058g;

        /* renamed from: h  reason: collision with root package name */
        private final TrendingMainViewModel f141059h;

        /* renamed from: i  reason: collision with root package name */
        private final q f141060i;

        static {
            Covode.recordClassIndex(92082);
        }

        /* renamed from: com.ss.android.ugc.aweme.trending.b.a$c$a  reason: collision with other inner class name */
        static final class C3735a extends m implements h.f.a.a<com.ss.android.ugc.aweme.feed.adapter.b> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(92084);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3735a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.feed.adapter.b invoke() {
                PagerAdapter adapter = this.this$0.f141058g.getAdapter();
                if (!(adapter instanceof com.ss.android.ugc.aweme.feed.adapter.b)) {
                    return null;
                }
                return adapter;
            }
        }

        public c(VerticalViewPager verticalViewPager, TrendingMainViewModel trendingMainViewModel, q qVar) {
            l.d(verticalViewPager, "");
            l.d(trendingMainViewModel, "");
            l.d(qVar, "");
            this.f141058g = verticalViewPager;
            this.f141059h = trendingMainViewModel;
            this.f141060i = qVar;
            verticalViewPager.a(new ViewPager.h(this) {
                /* class com.ss.android.ugc.aweme.trending.b.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f141061a;

                static {
                    Covode.recordClassIndex(92083);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f141061a = r1;
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageScrollStateChanged(int i2) {
                    if (i2 == 0) {
                        this.f141061a.f141056e = -1;
                        this.f141061a.f141052a = 0;
                        this.f141061a.f141057f = false;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageScrolled(int i2, float f2, int i3) {
                    int i4;
                    if (this.f141061a.f141056e == -1) {
                        c cVar = this.f141061a;
                        cVar.f141056e = cVar.f141058g.getCurrentItem();
                    }
                    int i5 = this.f141061a.f141052a;
                    if (!com.ss.android.ugc.aweme.trending.c.a.a(f2, 0.0f)) {
                        c cVar2 = this.f141061a;
                        if (cVar2.f141056e > i2) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        cVar2.f141052a = i4;
                    }
                    if (i5 != this.f141061a.f141052a) {
                        this.f141061a.f141057f = false;
                    }
                }
            });
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public final void a(View view, float f2) {
        float f3;
        boolean z;
        float f4;
        float f5;
        int itemPosition;
        Aweme c2;
        Aweme c3;
        String str;
        l.d(view, "");
        if (f2 <= 1.0f && f2 >= -1.0f) {
            float f6 = 0.0f;
            if (f2 > 0.0f) {
                f3 = 1.0f - f2;
            } else {
                f3 = f2;
            }
            c cVar = this.f141048d;
            l.d(view, "");
            int i2 = 0;
            if (cVar.f141052a != 1 ? f2 > 0.0f : f2 < 0.0f) {
                z = false;
            } else {
                z = true;
            }
            cVar.f141054c = z;
            ViewOutlineProvider viewOutlineProvider = null;
            if (!cVar.f141057f) {
                com.ss.android.ugc.aweme.feed.adapter.b bVar = (com.ss.android.ugc.aweme.feed.adapter.b) cVar.f141055d.getValue();
                if (!(bVar == null || (itemPosition = bVar.getItemPosition(view)) == -2)) {
                    if (cVar.f141052a == 1) {
                        if (f2 >= 0.0f) {
                            c2 = bVar.c(itemPosition);
                            c3 = bVar.c(itemPosition - 1);
                        } else {
                            c3 = bVar.c(itemPosition);
                            c2 = bVar.c(itemPosition + 1);
                        }
                    } else if (f2 > 0.0f) {
                        c3 = bVar.c(itemPosition);
                        c2 = bVar.c(itemPosition - 1);
                    } else {
                        c2 = bVar.c(itemPosition);
                        c3 = bVar.c(itemPosition + 1);
                    }
                    bVar.getCount();
                    if (c3 != null) {
                        c3.getDesc();
                    }
                    if (c2 != null) {
                        c2.getDesc();
                        if (c3 != null) {
                            str = c3.getTrendingId();
                        } else {
                            str = null;
                        }
                        if (!l.a((Object) str, (Object) c2.getTrendingId())) {
                            i2 = 1;
                        }
                    }
                }
                cVar.f141053b = i2;
            }
            if (this.f141048d.f141052a == 0 || this.f141048d.f141053b == 0) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                return;
            }
            float interpolation = this.f141047c.getInterpolation(Math.abs(f3));
            view.setScaleX(interpolation);
            view.setScaleY(interpolation);
            if (this.f141048d.f141052a == 1) {
                if (this.f141048d.f141054c) {
                    f2 = 1.0f - f2;
                } else {
                    f2 = -f2;
                }
            } else if (this.f141048d.f141054c) {
                f2 += 1.0f;
            }
            float f7 = ((float) this.f141046b) * f2;
            float height = ((float) view.getHeight()) * (1.0f - interpolation);
            if (this.f141048d.f141054c) {
                if (height < ((float) this.f141046b)) {
                    if (this.f141048d.f141052a == 1) {
                        f5 = ((float) this.f141046b) - height;
                    } else {
                        f4 = height - ((float) this.f141046b);
                        f6 = f4 + f7;
                    }
                } else if (this.f141048d.f141052a == 1) {
                    f5 = (((float) this.f141046b) - height) / 2.0f;
                } else {
                    f4 = (height - ((float) this.f141046b)) / 2.0f;
                    f6 = f4 + f7;
                }
                f6 = f5 - f7;
            } else if (!com.ss.android.ugc.aweme.trending.c.a.a(f2, 1.0f)) {
                if (height < ((float) this.f141046b)) {
                    if (this.f141048d.f141052a == 1) {
                        f6 = -f7;
                    } else {
                        f6 = f7;
                    }
                } else if (this.f141048d.f141052a == 1) {
                    f6 = ((height - ((float) this.f141046b)) / 2.0f) - f7;
                } else {
                    f6 = ((((float) this.f141046b) - height) / 2.0f) + f7;
                }
            }
            view.setTranslationY(f6);
            view.getTranslationY();
            if (Build.VERSION.SDK_INT >= 21) {
                l.d(view, "");
                ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                if (outlineProvider instanceof b.C3734a) {
                    viewOutlineProvider = outlineProvider;
                }
                b.C3734a aVar = (b.C3734a) viewOutlineProvider;
                if (aVar == null) {
                    aVar = new b.C3734a();
                    view.setOutlineProvider(aVar);
                    view.setClipToOutline(true);
                } else {
                    view.invalidateOutline();
                }
                aVar.f141050a = Math.abs(f3);
            }
        }
    }

    public a(VerticalViewPager verticalViewPager, TrendingMainViewModel trendingMainViewModel, q qVar) {
        l.d(verticalViewPager, "");
        l.d(trendingMainViewModel, "");
        l.d(qVar, "");
        this.f141048d = new c(verticalViewPager, trendingMainViewModel, qVar);
    }
}
