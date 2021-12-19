package com.ss.android.ugc.aweme.pendant;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;

public final class OptimizedLottieAnimationView extends LottieAnimationView implements au {

    /* renamed from: e  reason: collision with root package name */
    private boolean f114576e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f114577f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f114578g;

    /* renamed from: h  reason: collision with root package name */
    private m f114579h;

    static {
        Covode.recordClassIndex(73761);
    }

    public OptimizedLottieAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        if (!this.f114577f) {
            this.f114577f = true;
            boolean g2 = ((LottieAnimationView) this).f5109b.g();
            if (this.f114578g) {
                this.f114576e = g2;
            }
            if (g2) {
                e();
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f114577f) {
            this.f114577f = false;
            if (this.f114576e && this.f114578g) {
                b();
            }
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        m mVar = this.f114579h;
        if (mVar != null) {
            mVar.getLifecycle().a(this);
            return;
        }
        Activity a2 = a(this);
        if (a2 instanceof m) {
            ((m) a2).getLifecycle().a(this);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f114579h;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
        } else {
            Activity a2 = a(this);
            if (a2 instanceof m) {
                ((m) a2).getLifecycle().b(this);
            }
        }
        k.a(this);
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    private static Activity a(View view) {
        Context context = view.getContext();
        l.b(context, "");
        return a(context);
    }

    private static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            l.b(context, "");
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void setComposition(e eVar) {
        l.d(eVar, "");
        super.setComposition(eVar);
        onVisibilityChanged(this, getVisibility());
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void onVisibilityChanged(View view, int i2) {
        l.d(view, "");
        super.onVisibilityChanged(view, i2);
        try {
            getRepeatMode();
            if (isShown()) {
                if (!this.f114578g) {
                    this.f114578g = true;
                    if (!this.f114577f && this.f114576e) {
                        b();
                    }
                }
            } else if (this.f114578g) {
                this.f114578g = false;
                boolean g2 = ((LottieAnimationView) this).f5109b.g();
                if (!this.f114577f) {
                    this.f114576e = g2;
                }
                if (g2) {
                    e();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    private /* synthetic */ OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OptimizedLottieAnimationView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
