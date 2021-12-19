package com.bytedance.android.livesdk.service.animation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.f;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class ComboEffectAnimationView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21182b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f21183a;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f21184c;

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21189a = new d();

        static {
            Covode.recordClassIndex(12510);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f21190a = new e();

        static {
            Covode.recordClassIndex(12511);
        }

        e() {
        }

        @Override // f.a.d.a
        public final void a() {
        }
    }

    static {
        Covode.recordClassIndex(12505);
    }

    public ComboEffectAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12506);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCombo() {
        return this.f21183a;
    }

    public final f.a.b.b getDisposable() {
        return this.f21184c;
    }

    public static final class b implements com.facebook.fresco.animation.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboEffectAnimationView f21185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HSAnimImageView f21186b;

        static {
            Covode.recordClassIndex(12507);
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar) {
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void c(com.facebook.fresco.animation.c.a aVar) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f21187a;

            static {
                Covode.recordClassIndex(12508);
            }

            a(b bVar) {
                this.f21187a = bVar;
            }

            public final void run() {
                this.f21187a.f21185a.removeView(this.f21187a.f21186b);
            }
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void b(com.facebook.fresco.animation.c.a aVar) {
            if (this.f21185a.indexOfChild(this.f21186b) >= 0) {
                this.f21185a.post(new a(this));
            }
        }

        b(ComboEffectAnimationView comboEffectAnimationView, HSAnimImageView hSAnimImageView) {
            this.f21185a = comboEffectAnimationView;
            this.f21186b = hSAnimImageView;
        }
    }

    public final void a() {
        f.a.b.b bVar = this.f21184c;
        if (bVar != null) {
            bVar.dispose();
        }
        removeAllViews();
    }

    public final void setCombo(int i2) {
        this.f21183a = i2;
    }

    public final void setDisposable(f.a.b.b bVar) {
        this.f21184c = bVar;
    }

    public final void a(int i2) {
        this.f21183a = i2;
        if (i2 == 0) {
            f.a.b.b bVar = this.f21184c;
            if (bVar != null) {
                bVar.dispose();
            }
        } else if (i2 == 1) {
            a(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        } else if (i2 == 1315) {
            a(1000L);
        }
    }

    private final void a(long j2) {
        f.a.b.b bVar = this.f21184c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f21184c = com.bytedance.android.livesdk.utils.b.b.a(j2, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), d.f21189a, e.f21190a);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboEffectAnimationView f21188a;

        static {
            Covode.recordClassIndex(12509);
        }

        c(ComboEffectAnimationView comboEffectAnimationView) {
            this.f21188a = comboEffectAnimationView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ComboEffectAnimationView comboEffectAnimationView = this.f21188a;
            int i2 = comboEffectAnimationView.f21183a;
            String str = "ttlive_gift_combo_effect_level4.webp";
            if (i2 > 0) {
                if (66 >= i2) {
                    str = "ttlive_gift_combo_effect_level1.webp";
                } else if (67 <= i2 && 188 >= i2) {
                    str = "ttlive_gift_combo_effect_level2.webp";
                } else if (189 <= i2 && 520 >= i2) {
                    str = "ttlive_gift_combo_effect_level3.webp";
                }
            }
            HSAnimImageView hSAnimImageView = new HSAnimImageView(comboEffectAnimationView.getContext());
            hSAnimImageView.setLayoutParams(new FrameLayout.LayoutParams((int) ap.a(comboEffectAnimationView.getContext(), 125.0f), (int) ap.a(comboEffectAnimationView.getContext(), 125.0f)));
            comboEffectAnimationView.addView(hSAnimImageView);
            HSAnimImageView a2 = hSAnimImageView.a(HSAnimImageView.f9268i.a("tiktok_live_basic_resource", str));
            a2.f9271c = true;
            a2.a(new b(comboEffectAnimationView, hSAnimImageView)).a();
        }
    }

    private /* synthetic */ ComboEffectAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboEffectAnimationView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9905);
        MethodCollector.o(9905);
    }
}
