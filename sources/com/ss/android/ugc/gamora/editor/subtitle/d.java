package com.ss.android.ugc.gamora.editor.subtitle;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.e.a.b;
import androidx.e.a.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.tools.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends g {
    public static final float q;
    public static final int r = ((int) n.b(com.ss.android.ugc.aweme.df.b.a(), 200.0f));
    public static final int s;
    public static final int t;
    public static final float u;
    public static final int v;
    public static final float w = n.b(com.ss.android.ugc.aweme.df.b.a(), 76.0f);
    public static final a x = new a((byte) 0);
    private boolean A;
    private final androidx.e.a.d B;
    private b C;
    private boolean D;
    private VideoPublishEditModel E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private float K;
    private final ViewGroup L;
    private final TextView y;
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(96792);
        }

        void a(int i2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean g() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean h() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96791);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final VideoPublishEditModel getPublishEditModel() {
        return this.E;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean d() {
        if (this.y.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final com.ss.android.ugc.aweme.editSticker.a.b a() {
        boolean z2;
        g.a aVar = new g.a();
        if (this.D || !com.ss.android.ugc.aweme.shortvideo.subtitle.a.a.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new com.ss.android.ugc.aweme.shortvideo.sticker.a.a(this, aVar, z2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void c() {
        boolean z2;
        VideoPublishEditModel videoPublishEditModel = this.E;
        if (videoPublishEditModel != null) {
            if ((videoPublishEditModel.hasOriginalAudio() || videoPublishEditModel.hasRecord()) && (videoPublishEditModel.hasRecord() || videoPublishEditModel.voiceVolume != 0.0f)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 != this.D) {
                this.D = z2;
                this.p = a();
            }
            l.d(videoPublishEditModel, "");
            r.a("click_subtitle_menu", bl.d(videoPublishEditModel).f149193a);
        }
        super.c();
    }

    static {
        Covode.recordClassIndex(96789);
        float b2 = n.b(com.ss.android.ugc.aweme.df.b.a(), 44.0f);
        q = b2;
        s = (int) (b2 + ((float) com.ss.android.ugc.aweme.df.n.a()));
        int b3 = (int) n.b(com.ss.android.ugc.aweme.df.b.a(), 16.0f);
        t = b3;
        float b4 = n.b(com.ss.android.ugc.aweme.df.b.a(), 56.0f);
        u = b4;
        v = (int) Math.min(n.b(com.ss.android.ugc.aweme.df.b.a(), 320.0f), ((float) (com.ss.android.ugc.aweme.df.n.b(com.ss.android.ugc.aweme.df.b.a()) - b3)) - b4);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final PointF[] getFourAnglePoint() {
        View view = this.f88218g;
        l.b(view, "");
        float measuredWidth = (float) view.getMeasuredWidth();
        View view2 = this.f88218g;
        l.b(view2, "");
        float measuredHeight = (float) view2.getMeasuredHeight();
        View view3 = this.f88218g;
        l.b(view3, "");
        float x2 = view3.getX();
        View view4 = this.f88218g;
        l.b(view4, "");
        float y2 = view4.getY();
        float f2 = measuredWidth + x2;
        float f3 = y2 + measuredHeight;
        return new PointF[]{new PointF(x2, y2), new PointF(f2, y2), new PointF(x2, f3), new PointF(f2, f3)};
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void j() {
        float abs = Math.abs(this.H - this.F);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        l.b(viewConfiguration, "");
        if (abs < ((float) viewConfiguration.getScaledTouchSlop())) {
            float abs2 = Math.abs(this.I - this.G);
            ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
            l.b(viewConfiguration2, "");
            if (abs2 < ((float) viewConfiguration2.getScaledTouchSlop())) {
                l();
                m();
            }
        }
    }

    public final void setOnCaptionStickerListener(b bVar) {
        this.C = bVar;
    }

    public final void setPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.E = videoPublishEditModel;
    }

    public final void setCaption(String str) {
        if (str == null || str.length() == 0) {
            this.y.setVisibility(4);
            return;
        }
        this.y.setVisibility(0);
        this.y.setText(str);
    }

    public final void setCaptionLocation(int i2) {
        this.y.setTranslationY(0.0f);
        if (i2 == com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue()) {
            setCaptionAlignMode(true);
        } else {
            setCaptionAlignMode(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean a(MotionEvent motionEvent) {
        float f2;
        float f3 = 0.0f;
        if (motionEvent != null) {
            f2 = motionEvent.getX();
        } else {
            f2 = 0.0f;
        }
        this.F = f2;
        if (motionEvent != null) {
            f3 = motionEvent.getY();
        }
        this.G = f3;
        b();
        this.f88217f.a();
        return super.a(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean b(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (motionEvent != null) {
            f2 = motionEvent.getX();
        } else {
            f2 = 0.0f;
        }
        this.H = f2;
        if (motionEvent != null) {
            f3 = motionEvent.getY();
        } else {
            f3 = 0.0f;
        }
        this.I = f3;
        b();
        this.f88217f.a();
        boolean b2 = super.b(motionEvent);
        View view = this.f88218g;
        l.b(view, "");
        if (view.getTranslationY() != 0.0f) {
            this.B.a();
        }
        return b2;
    }

    private final void setCaptionAlignMode(boolean z2) {
        com.ss.android.ugc.aweme.sticker.data.a aVar;
        if (z2) {
            ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            this.y.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.y.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 48;
            this.y.setLayoutParams(layoutParams4);
        }
        this.A = z2;
        b bVar = this.C;
        if (bVar != null) {
            if (z2) {
                aVar = com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM;
            } else {
                aVar = com.ss.android.ugc.aweme.sticker.data.a.LEFT_TOP;
            }
            bVar.a(aVar.getValue());
        }
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(4377);
        int a2 = com.ss.android.ugc.aweme.df.n.a(context);
        int i2 = s;
        int i3 = r;
        this.z = (a2 - i2) - i3;
        this.A = true;
        this.K = 1.0f;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ahz, this);
        if (inflate != null) {
            this.L = (ViewGroup) inflate;
            View findViewById = inflate.findViewById(R.id.ewm);
            l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.y = textView;
            this.f88217f = (StickerHelpBoxView) inflate.findViewById(R.id.eb3);
            this.f88217f.setHelpBoxColor(0);
            this.f88218g = textView;
            androidx.e.a.d dVar = new androidx.e.a.d(textView, androidx.e.a.d.f2717b, (byte) 0);
            e eVar = dVar.x;
            l.b(eVar, "");
            eVar.a(300.0f);
            e eVar2 = dVar.x;
            l.b(eVar2, "");
            eVar2.b(0.86f);
            this.B = dVar;
            dVar.a(new b.AbstractC0041b(this) {
                /* class com.ss.android.ugc.gamora.editor.subtitle.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f146962a;

                static {
                    Covode.recordClassIndex(96790);
                }

                {
                    this.f146962a = r1;
                }

                @Override // androidx.e.a.b.AbstractC0041b
                public final void a() {
                    this.f146962a.b();
                }
            });
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = i2;
                layoutParams2.bottomMargin = i3;
                layoutParams2.gravity = 8388611;
                MethodCollector.o(4377);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            MethodCollector.o(4377);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(4377);
        throw nullPointerException2;
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i4 = t;
        if (i2 < 0) {
            i4 -= i2;
        }
        this.J = i4;
        int i5 = (int) (u - ((float) i2));
        if (c.a(getContext())) {
            layoutParams2.rightMargin = i4;
            layoutParams2.leftMargin = i5;
        } else {
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
        }
        int i6 = s;
        if (i3 < 0) {
            i6 -= i3;
        }
        layoutParams2.topMargin = i6;
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int i7 = ((ViewGroup) parent).getLayoutParams().height;
        layoutParams2.bottomMargin = (i7 - com.ss.android.ugc.aweme.sticker.view.a.a(getContext())) + com.ss.android.ugc.aweme.sticker.view.a.getTbMargin();
        this.z = (i7 - layoutParams2.topMargin) - layoutParams2.bottomMargin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(float r7, float r8, java.lang.Boolean r9) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.subtitle.d.a(float, float, java.lang.Boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
