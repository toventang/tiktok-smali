package com.ss.android.ugc.aweme.editSticker.text.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.text.a.a;
import com.ss.android.ugc.aweme.editSticker.text.a.b;
import com.ss.android.ugc.aweme.editSticker.text.a.c;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;

public final class f extends FrameLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    c f88655a;

    /* renamed from: b  reason: collision with root package name */
    private MaskBlurLightTextView f88656b;

    /* renamed from: c  reason: collision with root package name */
    private View f88657c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f88658d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f88659e;

    /* renamed from: f  reason: collision with root package name */
    private a f88660f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f88661g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f88662h;

    static {
        Covode.recordClassIndex(55785);
    }

    public final void setBackground(Drawable drawable) {
    }

    public final c getFontData() {
        return this.f88655a;
    }

    public final boolean a() {
        c cVar = this.f88655a;
        if (cVar == null || !cVar.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f88655a != null) {
            Typeface b2 = b.a().b(this.f88655a.f88297e);
            if (b2 != null) {
                this.f88656b.setTypeface(b2);
            }
            if (this.f88655a.a()) {
                this.f88656b.setMaskBlurColor(-6400);
            }
        }
    }

    public final void b() {
        c cVar = this.f88655a;
        if (cVar != null) {
            int i2 = cVar.f88300h;
            if (i2 == 1) {
                this.f88658d.setVisibility(4);
            } else if (i2 == 2) {
                this.f88658d.setVisibility(0);
                ObjectAnimator objectAnimator = this.f88659e;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                this.f88659e = null;
                this.f88658d.setRotation(0.0f);
                this.f88658d.setImageDrawable(androidx.core.content.b.a(getContext(), 2131232487));
            } else if (i2 == 3) {
                this.f88658d.setVisibility(0);
                this.f88658d.setImageDrawable(androidx.core.content.b.a(getContext(), 2131232700));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f88658d, "rotation", 0.0f, 360.0f);
                this.f88659e = ofFloat;
                ofFloat.setDuration(800L);
                this.f88659e.setRepeatMode(1);
                this.f88659e.setRepeatCount(-1);
                this.f88659e.start();
            }
        }
    }

    public final void setDownloadCallback(a aVar) {
        this.f88660f = aVar;
    }

    public f(Context context) {
        this(context, (byte) 0);
    }

    public final void setBackground(int i2) {
        Drawable drawable;
        if (i2 != 1) {
            drawable = this.f88662h;
        } else {
            drawable = this.f88661g;
        }
        this.f88657c.setBackground(drawable);
    }

    /* access modifiers changed from: package-private */
    public final void setFontData(c cVar) {
        if (cVar != null) {
            this.f88655a = cVar;
            if (!TextUtils.isEmpty(cVar.f88294b)) {
                this.f88656b.setText(this.f88655a.f88294b);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a.a
    public final void a(boolean z) {
        c cVar = this.f88655a;
        if (cVar != null) {
            cVar.f88300h = 2;
            b();
        }
        a aVar = this.f88660f;
        if (aVar != null) {
            aVar.a(z);
        }
        if (z) {
            d.e().a(getContext(), getContext().getResources().getString(R.string.c0m));
        }
    }

    private f(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(5999);
        View inflate = LayoutInflater.from(context).inflate(R.layout.zh, this);
        this.f88656b = (MaskBlurLightTextView) inflate.findViewById(R.id.emw);
        this.f88658d = (ImageView) inflate.findViewById(R.id.e_k);
        this.f88657c = inflate.findViewById(R.id.fai);
        int a2 = (int) r.a(getContext(), 4.0f);
        this.f88661g = com.ss.android.ugc.tools.view.a.a(-1, 16777215, (int) r.a(getContext(), 2.0f), a2);
        this.f88662h = com.ss.android.ugc.tools.view.a.a(889192447, 16777215, 1, a2);
        MethodCollector.o(5999);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a.a
    public final void a(c cVar, boolean z, boolean z2) {
        b();
        if (this.f88655a.b()) {
            a aVar = this.f88660f;
            if (aVar != null) {
                c cVar2 = this.f88655a;
                aVar.a(cVar2, cVar2.b(), z2);
            }
            c();
        } else if (z2) {
            d.e().a(getContext(), getContext().getResources().getString(R.string.c0m));
        }
    }
}
