package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtImageTextView extends FrameLayout {
    private static final int K = c.f138715c;
    private static final int L = c.f138714b;
    private static final int M = Color.parseColor("#80000000");

    /* renamed from: c  reason: collision with root package name */
    public static final a f138667c = new a((byte) 0);
    private String A;
    private int B;
    private Drawable C;
    private Drawable D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private int I;
    private LinearLayout J;

    /* renamed from: a  reason: collision with root package name */
    public StickerImageView f138668a;

    /* renamed from: b  reason: collision with root package name */
    public AVDmtTextView f138669b;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f138670d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f138671e;

    /* renamed from: f  reason: collision with root package name */
    private View f138672f;

    /* renamed from: g  reason: collision with root package name */
    private View f138673g;

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f138674h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f138675i;

    /* renamed from: j  reason: collision with root package name */
    private int f138676j;

    /* renamed from: k  reason: collision with root package name */
    private int f138677k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f138678l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f138679m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Animation w;
    private boolean x;
    private boolean y;
    private Drawable z;

    public AVDmtImageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90719);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setBackground(this.D);
    }

    static {
        Covode.recordClassIndex(90718);
    }

    public final void setImageViewPadding(int i2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setPadding(i2, i2, i2, i2);
    }

    public final void setImgBackground(int i2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setImageBackground(i2);
    }

    public final void setShowDownloadIcon(boolean z2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setShowDownloadIcon(z2);
    }

    public final void setShowDownloadStateIcon(boolean z2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.a(z2);
    }

    public final void setTextColor(int i2) {
        AVDmtTextView aVDmtTextView = this.f138669b;
        if (aVDmtTextView == null) {
            l.a("dmtTextView");
        }
        aVDmtTextView.setSelectTextColor(i2);
    }

    public final void a(float f2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setAlpha(f2);
    }

    public final void setIconImagePadding(int i2) {
        Context context = getContext();
        l.b(context, "");
        int a2 = (int) r.a(context, (float) i2);
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setPadding(a2, a2, a2, a2);
    }

    public final void a(int i2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.a(i2);
    }

    public final void b(boolean z2) {
        if (z2) {
            ImageView imageView = this.f138671e;
            if (imageView == null) {
                l.a("loadingImageView");
            }
            imageView.clearAnimation();
            ImageView imageView2 = this.f138671e;
            if (imageView2 == null) {
                l.a("loadingImageView");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f138671e;
            if (imageView3 == null) {
                l.a("loadingImageView");
            }
            imageView3.startAnimation(this.w);
            return;
        }
        ImageView imageView4 = this.f138671e;
        if (imageView4 == null) {
            l.a("loadingImageView");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.f138671e;
        if (imageView5 == null) {
            l.a("loadingImageView");
        }
        imageView5.clearAnimation();
    }

    public final void setClickStatusColor(int i2) {
        int i3;
        Drawable a2;
        if (this.f138678l) {
            a2 = com.ss.android.ugc.tools.view.a.a(i2, 0, this.s);
            l.b(a2, "");
        } else {
            if (this.u) {
                i3 = this.n + this.s;
            } else {
                i3 = this.n;
            }
            a2 = com.ss.android.ugc.tools.view.a.a(i2, 0, this.s, i3);
            l.b(a2, "");
        }
        View view = this.f138672f;
        if (view == null) {
            l.a("borderView");
        }
        view.setBackground(a2);
        AVDmtTextView aVDmtTextView = this.f138669b;
        if (aVDmtTextView == null) {
            l.a("dmtTextView");
        }
        aVDmtTextView.setStatusTextColor(i2);
    }

    public final void setEnableUI(boolean z2) {
        StickerImageView stickerImageView = this.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        stickerImageView.setEnableUI(z2);
        AVDmtTextView aVDmtTextView = this.f138669b;
        if (aVDmtTextView == null) {
            l.a("dmtTextView");
        }
        aVDmtTextView.setEnableUI(z2);
        if (z2) {
            ImageView imageView = this.f138675i;
            if (imageView == null) {
                l.a("bottomDotView");
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView2 = this.f138675i;
        if (imageView2 == null) {
            l.a("bottomDotView");
        }
        imageView2.setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f138668a;
            if (stickerImageView == null) {
                l.a("imageView");
            }
            stickerImageView.a(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        int i2;
        if (charSequence != null && charSequence.length() != 0) {
            AVDmtTextView aVDmtTextView = this.f138669b;
            if (aVDmtTextView == null) {
                l.a("dmtTextView");
            }
            int measureText = (int) aVDmtTextView.getPaint().measureText(charSequence, 0, charSequence.length());
            if (this.r) {
                i2 = (int) b.a();
            } else {
                i2 = this.f138676j;
            }
            if (measureText <= i2) {
                AVDmtTextView aVDmtTextView2 = this.f138669b;
                if (aVDmtTextView2 == null) {
                    l.a("dmtTextView");
                }
                aVDmtTextView2.setGravity(17);
            } else if (this.E) {
                AVDmtTextView aVDmtTextView3 = this.f138669b;
                if (aVDmtTextView3 == null) {
                    l.a("dmtTextView");
                }
                aVDmtTextView3.setGravity(8388611);
            } else {
                AVDmtTextView aVDmtTextView4 = this.f138669b;
                if (aVDmtTextView4 == null) {
                    l.a("dmtTextView");
                }
                aVDmtTextView4.setGravity(17);
            }
            LinearLayout linearLayout = this.f138670d;
            if (linearLayout == null) {
                l.a("textLayout");
            }
            linearLayout.setVisibility(0);
            AVDmtTextView aVDmtTextView5 = this.f138669b;
            if (aVDmtTextView5 == null) {
                l.a("dmtTextView");
            }
            aVDmtTextView5.setVisibility(0);
            AVDmtTextView aVDmtTextView6 = this.f138669b;
            if (aVDmtTextView6 == null) {
                l.a("dmtTextView");
            }
            aVDmtTextView6.setText(charSequence);
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StickerImageView stickerImageView = this.f138668a;
            if (stickerImageView == null) {
                l.a("imageView");
            }
            stickerImageView.a(str);
        }
    }

    public final void a(boolean z2) {
        int i2;
        if (this.p) {
            AVDmtTextView aVDmtTextView = this.f138669b;
            if (aVDmtTextView == null) {
                l.a("dmtTextView");
            }
            aVDmtTextView.a(z2);
            AVDmtTextView aVDmtTextView2 = this.f138669b;
            if (aVDmtTextView2 == null) {
                l.a("dmtTextView");
            }
            aVDmtTextView2.setSelected(z2);
        }
        if (this.o) {
            View view = this.f138672f;
            if (view == null) {
                l.a("borderView");
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        if (!z2 || !this.E) {
            AVDmtTextView aVDmtTextView3 = this.f138669b;
            if (aVDmtTextView3 == null) {
                l.a("dmtTextView");
            }
            aVDmtTextView3.setEllipsize(null);
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f138669b;
        if (aVDmtTextView4 == null) {
            l.a("dmtTextView");
        }
        aVDmtTextView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public final void a(Drawable drawable, int i2) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f138668a;
            if (stickerImageView == null) {
                l.a("imageView");
            }
            stickerImageView.a(drawable);
            StickerImageView stickerImageView2 = this.f138668a;
            if (stickerImageView2 == null) {
                l.a("imageView");
            }
            stickerImageView2.setPadding(i2, i2, i2, i2);
        }
    }

    public final void a(String str, Bitmap.Config config) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str) && config != null) {
            StickerImageView stickerImageView = this.f138668a;
            if (stickerImageView == null) {
                l.a("imageView");
            }
            stickerImageView.a(str, config);
        }
    }

    private /* synthetic */ AVDmtImageTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AVDmtImageTextView(android.content.Context r19, android.util.AttributeSet r20, char r21) {
        /*
        // Method dump skipped, instructions count: 1452
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView.<init>(android.content.Context, android.util.AttributeSet, char):void");
    }
}
