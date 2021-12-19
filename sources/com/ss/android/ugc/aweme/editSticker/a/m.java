package com.ss.android.ugc.aweme.editSticker.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class m extends b {

    /* renamed from: l  reason: collision with root package name */
    public LinearLayout f88078l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f88079m;
    public boolean n;

    static final class a implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public static final a f88080a = new a();

        static {
            Covode.recordClassIndex(55370);
        }

        a() {
        }

        public final float getInterpolation(float f2) {
            float f3;
            if (f2 >= 0.0f && f2 <= 0.18f) {
                return f2 * 1.11f;
            }
            if (f2 >= 0.18f && f2 <= 0.36f) {
                return f2 * 1.11f;
            }
            if (f2 >= 0.36f && f2 <= 0.56f) {
                f3 = 0.04f;
            } else if (f2 < 0.56f || f2 > 0.8f) {
                return f2;
            } else {
                f2 *= 0.833f;
                f3 = 0.1336f;
            }
            return f2 + f3;
        }
    }

    static final class b implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f88081a = new b();

        static {
            Covode.recordClassIndex(55371);
        }

        b() {
        }

        public final float getInterpolation(float f2) {
            float f3;
            if (f2 >= 0.0f && f2 <= 0.18f) {
                return f2 * 1.11f;
            }
            if (f2 >= 0.18f && f2 <= 0.36f) {
                return f2 * 1.11f;
            }
            if (f2 >= 0.36f && f2 <= 0.56f) {
                f3 = 0.04f;
            } else if (f2 < 0.56f || f2 > 0.8f) {
                return f2;
            } else {
                f2 *= 0.833f;
                f3 = 0.1336f;
            }
            return f2 + f3;
        }
    }

    static {
        Covode.recordClassIndex(55369);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public View c() {
        LinearLayout a2;
        LinearLayout a3;
        MethodCollector.i(4080);
        LinearLayout d2 = d();
        if (g.a().f88138b.f88147b && this.f88063a && !this.n) {
            if (g.a().f88138b.f88148c) {
                if (this.f88079m) {
                    a3 = a(2131232705, R.string.geq);
                } else {
                    a3 = a(2131232706, R.string.ayf);
                }
                this.f88078l = a3;
                if (a3 != null) {
                    View childAt = a3.getChildAt(0);
                    l.b(childAt, "");
                    com.ss.android.ugc.aweme.editSticker.interact.g gVar = new com.ss.android.ugc.aweme.editSticker.interact.g();
                    if (!gVar.f88167a.getBoolean("read_text_guide_shown_v2", false)) {
                        gVar.f88167a.storeBoolean("read_text_guide_shown_v2", true);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator duration = ObjectAnimator.ofFloat(childAt, View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                        l.b(duration, "");
                        duration.setInterpolator(b.f88081a);
                        animatorSet.play(duration).after(duration.clone()).after(1500);
                        animatorSet.start();
                    }
                }
                LinearLayout linearLayout = this.f88078l;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new c(this));
                }
                d2.addView(this.f88078l);
                d2.addView(e());
            } else {
                if (this.f88079m) {
                    a2 = a(2131230937, R.string.ayg);
                } else {
                    a2 = a(2131230937, R.string.ayf);
                }
                this.f88078l = a2;
                if (a2 != null) {
                    View childAt2 = a2.getChildAt(0);
                    l.b(childAt2, "");
                    com.ss.android.ugc.aweme.editSticker.interact.g gVar2 = new com.ss.android.ugc.aweme.editSticker.interact.g();
                    if (!gVar2.f88167a.getBoolean("read_text_guide_shown", false)) {
                        gVar2.f88167a.storeBoolean("read_text_guide_shown", true);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt2, View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                        l.b(duration2, "");
                        duration2.setInterpolator(a.f88080a);
                        animatorSet2.play(duration2).after(duration2.clone()).after(1500);
                        animatorSet2.start();
                    }
                }
                LinearLayout linearLayout2 = this.f88078l;
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new d(this));
                }
                d2.addView(this.f88078l);
                d2.addView(e());
            }
        }
        LinearLayout a4 = a(2131230938, R.string.axs);
        LinearLayout a5 = a(2131230935, R.string.ayc);
        a4.setOnClickListener(new e(this));
        a5.setOnClickListener(new f(this));
        if (this.f88063a) {
            d2.addView(a4);
            d2.addView(e());
            a(3);
        } else {
            a(2);
        }
        d2.addView(a5);
        MethodCollector.o(4080);
        return d2;
    }

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88082a;

        static {
            Covode.recordClassIndex(55372);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(m mVar) {
            this.f88082a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f88082a.a();
            k kVar = this.f88082a.f88071i;
            if (kVar != null) {
                kVar.d();
            }
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88083a;

        static {
            Covode.recordClassIndex(55373);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(m mVar) {
            this.f88083a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f88083a.a();
            k kVar = this.f88083a.f88071i;
            if (kVar != null) {
                kVar.d();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88084a;

        static {
            Covode.recordClassIndex(55374);
        }

        e(m mVar) {
            this.f88084a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88084a.a();
            k kVar = this.f88084a.f88071i;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88085a;

        static {
            Covode.recordClassIndex(55375);
        }

        f(m mVar) {
            this.f88085a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88085a.a();
            k kVar = this.f88085a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final void a(RectF rectF, int i2, int i3, float f2, boolean z) {
        l.d(rectF, "");
        this.f88079m = z;
        super.a(rectF, i2, i3, f2, z);
    }
}
