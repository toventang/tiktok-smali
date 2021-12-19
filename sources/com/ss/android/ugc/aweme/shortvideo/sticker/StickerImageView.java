package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.c.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StickerImageView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public CircleDraweeView f130207a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f130208b;

    /* renamed from: c  reason: collision with root package name */
    public AVCircleProgressView f130209c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f130210d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f130211e;

    /* renamed from: f  reason: collision with root package name */
    private SmartImageView f130212f;

    /* renamed from: g  reason: collision with root package name */
    private View f130213g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f130214h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f130215i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f130216j;

    static {
        Covode.recordClassIndex(85408);
    }

    public StickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f130210d = z;
    }

    public final void a(int i2) {
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            a.a(smartImageView, i2);
            return;
        }
        CircleDraweeView circleDraweeView = this.f130207a;
        if (circleDraweeView == null) {
            l.a("iconImageView");
        }
        a.a(circleDraweeView, i2);
    }

    public final void setImageBackground(int i2) {
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            smartImageView.setBackgroundResource(i2);
            return;
        }
        CircleDraweeView circleDraweeView = this.f130207a;
        if (circleDraweeView == null) {
            l.a("iconImageView");
        }
        circleDraweeView.setBackgroundResource(i2);
    }

    public final void setImageHierarchy(com.facebook.drawee.f.a aVar) {
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            smartImageView.setHierarchy(aVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f130207a;
        if (circleDraweeView == null) {
            l.a("iconImageView");
        }
        circleDraweeView.setHierarchy(aVar);
    }

    public final void a(Drawable drawable) {
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            smartImageView.setImageDrawable(drawable);
            return;
        }
        CircleDraweeView circleDraweeView = this.f130207a;
        if (circleDraweeView == null) {
            l.a("iconImageView");
        }
        circleDraweeView.setImageDrawable(drawable);
    }

    public final void setIconImageViewScaleType(q.b bVar) {
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) smartImageView.getHierarchy();
            l.b(aVar, "");
            aVar.a(bVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f130207a;
        if (circleDraweeView == null) {
            l.a("iconImageView");
        }
        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) circleDraweeView.getHierarchy();
        l.b(aVar2, "");
        aVar2.a(bVar);
    }

    public final void a(String str) {
        if (!this.f130211e) {
            CircleDraweeView circleDraweeView = this.f130207a;
            if (circleDraweeView == null) {
                l.a("iconImageView");
            }
            a.a(circleDraweeView, str, -1, -1);
        } else if (str != null) {
            v a2 = r.a(str);
            e.a aVar = new e.a();
            aVar.f39827a = true;
            e a3 = aVar.a();
            l.b(a3, "");
            a2.w = a3;
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            a2.E = smartImageView;
            a2.c();
        }
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.f130211e) {
                SmartImageView smartImageView = this.f130212f;
                if (smartImageView == null) {
                    l.a("smartImageView");
                }
                smartImageView.clearColorFilter();
                return;
            }
            CircleDraweeView circleDraweeView = this.f130207a;
            if (circleDraweeView == null) {
                l.a("iconImageView");
            }
            circleDraweeView.clearColorFilter();
        } else if (this.f130211e) {
            SmartImageView smartImageView2 = this.f130212f;
            if (smartImageView2 == null) {
                l.a("smartImageView");
            }
            smartImageView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        } else {
            CircleDraweeView circleDraweeView2 = this.f130207a;
            if (circleDraweeView2 == null) {
                l.a("iconImageView");
            }
            circleDraweeView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        }
    }

    public final void a(boolean z) {
        int i2;
        ImageView imageView = this.f130208b;
        if (imageView == null) {
            l.a("downloadImg");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public final void a(String str, Bitmap.Config config) {
        if (!this.f130211e) {
            CircleDraweeView circleDraweeView = this.f130207a;
            if (circleDraweeView == null) {
                l.a("iconImageView");
            }
            b.a(circleDraweeView, str, config);
        } else if (str != null) {
            v a2 = r.a(str);
            a2.f39907c = true;
            v a3 = a2.a();
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            a3.E = smartImageView;
            a3.c();
        }
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int i2;
        MethodCollector.i(5950);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            this.f130214h = obtainStyledAttributes.getDrawable(29);
            obtainStyledAttributes.recycle();
        }
        if (this.f130215i) {
            i2 = R.layout.aed;
        } else if (this.f130216j) {
            i2 = R.layout.aec;
        } else {
            i2 = R.layout.aeb;
        }
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        l.b(inflate, "");
        this.f130213g = inflate;
        if (inflate == null) {
            l.a("mRootView");
        }
        View findViewById = inflate.findViewById(R.id.bnf);
        l.b(findViewById, "");
        this.f130207a = (CircleDraweeView) findViewById;
        View view = this.f130213g;
        if (view == null) {
            l.a("mRootView");
        }
        View findViewById2 = view.findViewById(R.id.e4o);
        l.b(findViewById2, "");
        this.f130212f = (SmartImageView) findViewById2;
        com.facebook.drawee.f.a a2 = new com.facebook.drawee.f.b(getResources()).a();
        a2.a(1, this.f130214h);
        a2.a(5, this.f130214h);
        if (this.f130211e) {
            SmartImageView smartImageView = this.f130212f;
            if (smartImageView == null) {
                l.a("smartImageView");
            }
            smartImageView.setVisibility(0);
            CircleDraweeView circleDraweeView = this.f130207a;
            if (circleDraweeView == null) {
                l.a("iconImageView");
            }
            circleDraweeView.setVisibility(8);
            SmartImageView smartImageView2 = this.f130212f;
            if (smartImageView2 == null) {
                l.a("smartImageView");
            }
            smartImageView2.setHierarchy(a2);
        } else {
            SmartImageView smartImageView3 = this.f130212f;
            if (smartImageView3 == null) {
                l.a("smartImageView");
            }
            smartImageView3.setVisibility(8);
            CircleDraweeView circleDraweeView2 = this.f130207a;
            if (circleDraweeView2 == null) {
                l.a("iconImageView");
            }
            circleDraweeView2.setVisibility(0);
            CircleDraweeView circleDraweeView3 = this.f130207a;
            if (circleDraweeView3 == null) {
                l.a("iconImageView");
            }
            circleDraweeView3.setHierarchy(a2);
        }
        View view2 = this.f130213g;
        if (view2 == null) {
            l.a("mRootView");
        }
        View findViewById3 = view2.findViewById(R.id.bnh);
        l.b(findViewById3, "");
        this.f130208b = (ImageView) findViewById3;
        View view3 = this.f130213g;
        if (view3 == null) {
            l.a("mRootView");
        }
        View findViewById4 = view3.findViewById(R.id.byw);
        l.b(findViewById4, "");
        AVCircleProgressView aVCircleProgressView = (AVCircleProgressView) findViewById4;
        this.f130209c = aVCircleProgressView;
        if (aVCircleProgressView == null) {
            l.a("progressView");
        }
        aVCircleProgressView.setBgCircleColor(androidx.core.content.b.c(getContext(), R.color.bo));
        AVCircleProgressView aVCircleProgressView2 = this.f130209c;
        if (aVCircleProgressView2 == null) {
            l.a("progressView");
        }
        aVCircleProgressView2.setProgressColor(-1);
        AVCircleProgressView aVCircleProgressView3 = this.f130209c;
        if (aVCircleProgressView3 == null) {
            l.a("progressView");
        }
        aVCircleProgressView3.setMaxProgress(100);
        AVCircleProgressView aVCircleProgressView4 = this.f130209c;
        if (aVCircleProgressView4 == null) {
            l.a("progressView");
        }
        aVCircleProgressView4.setCircleWidth((int) com.ss.android.ugc.tools.utils.r.a(context, 2.0f));
        AVCircleProgressView aVCircleProgressView5 = this.f130209c;
        if (aVCircleProgressView5 == null) {
            l.a("progressView");
        }
        aVCircleProgressView5.setBgCircleWidth((int) com.ss.android.ugc.tools.utils.r.a(context, 3.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view4 = this.f130213g;
        if (view4 == null) {
            l.a("mRootView");
        }
        view4.setLayoutParams(layoutParams);
        View view5 = this.f130213g;
        if (view5 == null) {
            l.a("mRootView");
        }
        addView(view5);
        MethodCollector.o(5950);
    }

    private /* synthetic */ StickerImageView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, false, false, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(5988);
        this.f130215i = z;
        this.f130216j = z2;
        this.f130211e = z3;
        a(context, attributeSet);
        MethodCollector.o(5988);
    }
}
