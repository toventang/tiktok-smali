package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.g.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.ss.android.ugc.aweme.tools.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class VEVideoEditView extends VideoEditView {
    private final float U;

    /* renamed from: b  reason: collision with root package name */
    public long f126103b;

    static {
        Covode.recordClassIndex(82812);
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean d() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void f() {
        this.f126109e.x.clear();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void k() {
        super.k();
        t();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void l() {
        super.l();
        t();
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoEditView f126105a;

        static {
            Covode.recordClassIndex(82814);
        }

        b(VEVideoEditView vEVideoEditView) {
            this.f126105a = vEVideoEditView;
        }

        public final void run() {
            this.f126105a.i();
            this.f126105a.j();
        }
    }

    private final void t() {
        post(new b(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getLeftSeekingValue() {
        return (long) ((this.G + ((float) m.f125471d)) * this.w.f125494e);
    }

    private final void s() {
        this.f126112h.setOnTouchListener(null);
        this.f126111g.setOnTouchListener(null);
        this.r.setOnTouchListener(null);
        this.t = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getPlayingPosition() {
        float f2 = this.G;
        RTLLinearLayout rTLLinearLayout = this.r;
        l.b(rTLLinearLayout, "");
        float startX = f2 + rTLLinearLayout.getStartX();
        RTLImageView rTLImageView = this.f126112h;
        l.b(rTLImageView, "");
        return (long) ((startX - rTLImageView.getStartX()) * this.w.f125494e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final long getRightSeekingValue() {
        float f2 = this.G;
        RTLImageView rTLImageView = this.f126111g;
        l.b(rTLImageView, "");
        float startX = f2 + rTLImageView.getStartX();
        RTLImageView rTLImageView2 = this.f126112h;
        l.b(rTLImageView2, "");
        return (long) ((startX - rTLImageView2.getStartX()) * this.w.f125494e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void h() {
        super.h();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f126110f;
        l.b(cutMultiVideoViewModel, "");
        cutMultiVideoViewModel.f125328c.observe(this.f126108d, new a(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void e() {
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar = this.w;
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        List<VideoSegment> k2 = videoEditViewModel.k();
        VideoEditViewModel videoEditViewModel2 = this.f126109e;
        l.b(videoEditViewModel2, "");
        bVar.a(k2, videoEditViewModel2.l());
        b bVar2 = this.D;
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar3 = this.w;
        l.b(bVar3, "");
        bVar2.a(bVar3.f125491b);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void n() {
        super.n();
        if (!this.M && this.v) {
            if (this.f126112h != null) {
                this.f126112h.setImageDrawable(e(true));
            }
            if (this.f126111g != null) {
                this.f126111g.setImageDrawable(e(false));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final e<Long, Long> getMultiVideoPlayBoundary() {
        long j2 = (long) ((this.G + ((float) m.f125471d)) * this.w.f125494e);
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        long a2 = a(j2, videoEditViewModel.l());
        VideoEditViewModel videoEditViewModel2 = this.f126109e;
        l.b(videoEditViewModel2, "");
        return new e<>(Long.valueOf(a2), Long.valueOf(a((long) ((this.G + ((float) m.f125471d) + this.H) * this.w.f125494e), videoEditViewModel2.l())));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void i() {
        View view;
        float f2;
        float f3;
        float startX;
        if (this.o != null) {
            int i2 = 0;
            RecyclerView.ViewHolder f4 = this.z.f(0);
            if (this.J == 1) {
                f4 = this.y.f(0);
            }
            if (f4 != null) {
                view = f4.itemView;
            } else {
                view = null;
            }
            float f5 = 0.0f;
            if (view == null) {
                RTLImageView rTLImageView = this.f126112h;
                l.b(rTLImageView, "");
                startX = rTLImageView.getStartX();
                if (this.v) {
                    f5 = this.U;
                }
            } else {
                int[] iArr = new int[2];
                f4.itemView.getLocationOnScreen(iArr);
                if (iArr[0] < 0) {
                    RTLImageView rTLImageView2 = this.f126112h;
                    l.b(rTLImageView2, "");
                    startX = rTLImageView2.getStartX();
                    if (this.v) {
                        f5 = this.U;
                    }
                } else {
                    RTLImageView rTLImageView3 = this.f126112h;
                    l.b(rTLImageView3, "");
                    float startX2 = rTLImageView3.getStartX() - ((float) iArr[0]);
                    if (this.v) {
                        f2 = this.U;
                    } else {
                        f2 = 0.0f;
                    }
                    float f6 = startX2 + f2;
                    if (f6 >= 0.0f) {
                        f5 = f6;
                    }
                    i2 = iArr[0];
                    f3 = f5;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f3, this.P);
                    layoutParams.topMargin = this.S;
                    layoutParams.leftMargin = i2;
                    int i3 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart(i2);
                    View view2 = this.o;
                    l.b(view2, "");
                    view2.setLayoutParams(layoutParams);
                }
            }
            f3 = startX + f5;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) f3, this.P);
            layoutParams2.topMargin = this.S;
            layoutParams2.leftMargin = i2;
            int i32 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart(i2);
            View view22 = this.o;
            l.b(view22, "");
            view22.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void j() {
        View view;
        float startX;
        float f2;
        if (this.p != null) {
            MVRecycleView mVRecycleView = this.z;
            b bVar = this.E;
            l.b(bVar, "");
            RecyclerView.ViewHolder f3 = mVRecycleView.f(bVar.getItemCount() - 1);
            if (this.J == 1) {
                MVRecycleView mVRecycleView2 = this.y;
                b bVar2 = this.D;
                l.b(bVar2, "");
                f3 = mVRecycleView2.f(bVar2.getItemCount() - 1);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                float f5 = (float) this.f126107c;
                RTLImageView rTLImageView = this.f126111g;
                l.b(rTLImageView, "");
                float startX2 = (f5 - rTLImageView.getStartX()) - ((float) m.f125471d);
                if (this.v) {
                    f2 = this.U;
                } else {
                    f2 = 0.0f;
                }
                startX = startX2 + f2;
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                View view2 = f3.itemView;
                l.b(view2, "");
                iArr[0] = i2 + view2.getWidth();
                float f6 = (float) iArr[0];
                RTLImageView rTLImageView2 = this.f126111g;
                l.b(rTLImageView2, "");
                startX = (f6 - rTLImageView2.getStartX()) - ((float) m.f125471d);
                if (startX < 0.0f) {
                    startX = 0.0f;
                }
                float f7 = (float) this.f126107c;
                RTLImageView rTLImageView3 = this.f126111g;
                l.b(rTLImageView3, "");
                float startX3 = ((f7 - rTLImageView3.getStartX()) - startX) - ((float) m.f125471d);
                if (this.v) {
                    f4 = this.U;
                }
                f4 += startX3;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) startX, this.P);
            layoutParams.topMargin = this.S;
            layoutParams.gravity = 5;
            int i3 = (int) f4;
            layoutParams.rightMargin = i3;
            int i4 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(i3);
            layoutParams.gravity = 8388613;
            View view3 = this.p;
            l.b(view3, "");
            view3.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void m() {
        this.f126109e.a(this.O, this.K);
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar = this.w;
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        VideoSegment videoSegment = videoEditViewModel.k().get(this.K);
        l.b(videoSegment, "");
        bVar.a(videoSegment.a(true), this.O.f125506d);
        VideoEditViewModel videoEditViewModel2 = this.f126109e;
        l.b(videoEditViewModel2, "");
        VideoSegment videoSegment2 = videoEditViewModel2.k().get(this.K);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f126110f;
        l.b(videoSegment2, "");
        cutMultiVideoViewModel.a(videoSegment2.a(true));
        if (this.v) {
            VideoEditViewModel videoEditViewModel3 = this.f126109e;
            videoEditViewModel3.x.put(videoEditViewModel3.w.getValue().getVideoSegmentList().get(this.K).a(true), Integer.valueOf(getOverXScroll()));
            return;
        }
        this.f126109e.a(this.K, getOverXScroll());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void a(VideoSegment videoSegment) {
        l.d(videoSegment, "");
        super.a(videoSegment);
        t();
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEVideoEditView f126104a;

        static {
            Covode.recordClassIndex(82813);
        }

        a(VEVideoEditView vEVideoEditView) {
            this.f126104a = vEVideoEditView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (l2 != null) {
                this.f126104a.f126103b = l2.longValue();
                VEVideoEditView vEVideoEditView = this.f126104a;
                vEVideoEditView.a(vEVideoEditView.f126103b);
            }
        }
    }

    public final void a(long j2) {
        RTLImageView rTLImageView = this.f126112h;
        l.b(rTLImageView, "");
        a((rTLImageView.getStartX() + (((float) j2) / this.w.f125494e)) - this.G, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final boolean a(String str) {
        l.d(str, "");
        if (this.v) {
            return true;
        }
        return super.a(str);
    }

    private final Drawable e(boolean z) {
        int c2 = androidx.core.content.b.c(this.f126108d, R.color.bh);
        int parseColor = Color.parseColor("#FFFFFF");
        float b2 = com.ss.android.ttve.utils.b.b(this.f126108d, 2.0f);
        if (c.a(this.f126108d)) {
            z = !z;
        }
        int i2 = 0;
        int i3 = 1;
        Drawable a2 = com.ss.android.ugc.tools.view.a.a(c2, c2, z ? new float[]{b2, b2, 0.0f, 0.0f, 0.0f, 0.0f, b2, b2} : new float[]{0.0f, 0.0f, b2, b2, b2, b2, 0.0f, 0.0f});
        if (this.v) {
            Drawable[] drawableArr = new Drawable[1];
            do {
                drawableArr[i2] = a2;
                i2++;
            } while (i2 <= 0);
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            if (z) {
                layerDrawable.setLayerInset(0, (int) this.U, 0, 0, 0);
            } else {
                layerDrawable.setLayerInset(0, 0, 0, (int) this.U, 0);
            }
            return layerDrawable;
        }
        Drawable[] drawableArr2 = new Drawable[4];
        int i4 = 0;
        loop1:
        while (true) {
            Drawable drawable = a2;
            while (true) {
                l.b(drawable, "");
                drawableArr2[i4] = drawable;
                i4++;
                if (i4 >= 4) {
                    break loop1;
                } else if (i4 != 0) {
                    drawable = com.ss.android.ugc.tools.view.a.a(parseColor, parseColor, 0, 0);
                }
            }
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        int i5 = (int) (((float) this.Q) / 3.0f);
        while (true) {
            float f2 = ((float) i3) * 2.0f;
            layerDrawable2.setLayerInset(i3, (int) ((((float) m.f125471d) / 3.0f) * (((f2 - 2.0f) / 5.0f) + 1.0f)), i5, (int) ((((float) m.f125471d) / 3.0f) * (((6.0f - f2) / 5.0f) + 1.0f)), i5);
            if (i3 == 3) {
                return layerDrawable2;
            }
            i3++;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void a(e<Integer, Integer> eVar) {
        l.d(eVar, "");
        this.J = 2;
        this.f126109e.a(2);
        F f2 = eVar.f2397a;
        if (f2 == null) {
            l.b();
        }
        this.L = f2.intValue();
        S s = eVar.f2398b;
        if (s == null) {
            l.b();
        }
        this.K = s.intValue();
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        VideoSegment videoSegment = videoEditViewModel.k().get(this.K);
        if (this.O == null) {
            this.O = new d(videoSegment);
        } else {
            this.O.a(videoSegment);
        }
        long j2 = videoSegment.f125478b;
        if (this.v) {
            l.b(videoSegment, "");
            j2 = videoSegment.e() - videoSegment.d();
            if (j2 <= 1000) {
                this.f126112h.setOnTouchListener(this);
                RTLImageView rTLImageView = this.f126112h;
                l.b(rTLImageView, "");
                rTLImageView.setTag("block");
                this.f126111g.setOnTouchListener(this);
                RTLImageView rTLImageView2 = this.f126111g;
                l.b(rTLImageView2, "");
                rTLImageView2.setTag("block");
                this.r.setOnTouchListener(null);
                this.t = true;
                j2 = 1000;
            } else {
                s();
            }
        }
        VideoSegment c2 = this.f126109e.c(this.K);
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar = this.w;
        l.b(videoSegment, "");
        String a2 = videoSegment.a(true);
        l.b(c2, "");
        bVar.a(j2, a2, c2.f(), this.J);
        setEditViewHeight(true);
        MVRecycleView mVRecycleView = this.y;
        l.b(mVRecycleView, "");
        mVRecycleView.setVisibility(8);
        this.D.a();
        MVRecycleView mVRecycleView2 = this.z;
        l.b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        this.z.b(0);
        b bVar2 = this.E;
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar3 = this.w;
        l.b(bVar3, "");
        bVar2.a(bVar3.f125491b, videoSegment);
        int b2 = this.f126109e.b(this.K);
        if (this.v) {
            VideoEditViewModel videoEditViewModel2 = this.f126109e;
            VideoSegment videoSegment2 = videoEditViewModel2.w.getValue().getVideoSegmentList().get(this.K);
            if (videoEditViewModel2.x.containsKey(videoSegment2.a(true))) {
                b2 = videoEditViewModel2.x.get(videoSegment2.a(true)).intValue();
            } else {
                b2 = 0;
            }
            VideoEditViewModel videoEditViewModel3 = this.f126109e;
            if (!videoEditViewModel3.x.containsKey(videoEditViewModel3.w.getValue().getVideoSegmentList().get(this.K).a(true))) {
                b2 = (int) (((float) c2.d()) / this.w.f125494e);
            }
        }
        this.z.a(b2, 0);
        com.ss.android.ugc.aweme.shortvideo.cut.model.c cVar = this.N;
        if (cVar != null) {
            cVar.a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        }
        float a3 = m.a(this.w, c2, b2, this.T);
        a(a3, m.a(this.f126108d, this.w, a3, c2, this.T), 0);
        this.f126109e.a(eVar);
        t();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(List<? extends VideoSegment> list) {
        l.d(list, "");
        this.J = 1;
        this.f126109e.a(1);
        if (this.O != null) {
            this.O.a();
        }
        if (this.N != null) {
            this.N.a();
        }
        for (VideoSegment videoSegment : list) {
            this.w.a(videoSegment.a(true), videoSegment.f());
        }
        this.f126109e.c((List<VideoSegment>) list);
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar = this.w;
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        List<VideoSegment> k2 = videoEditViewModel.k();
        VideoEditViewModel videoEditViewModel2 = this.f126109e;
        l.b(videoEditViewModel2, "");
        bVar.a(k2, videoEditViewModel2.l());
        a((float) this.T, (float) ((this.f126107c - this.T) - m.f125471d), 0);
        MVRecycleView mVRecycleView = this.z;
        l.b(mVRecycleView, "");
        mVRecycleView.setVisibility(8);
        this.E.a();
        MVRecycleView mVRecycleView2 = this.y;
        l.b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        this.y.b(0);
        b bVar2 = this.D;
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar3 = this.w;
        l.b(bVar3, "");
        HashMap<String, Float> hashMap = bVar3.f125491b;
        bVar2.f126150f.addAll(list);
        bVar2.a(hashMap);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(boolean z) {
        this.v = z;
        n();
        if (z) {
            s();
            MVRecycleView mVRecycleView = this.y;
            l.b(mVRecycleView, "");
            mVRecycleView.setVisibility(8);
            return;
        }
        this.f126112h.setOnTouchListener(this);
        RTLImageView rTLImageView = this.f126112h;
        l.b(rTLImageView, "");
        rTLImageView.setTag("startSlide");
        this.f126111g.setOnTouchListener(this);
        RTLImageView rTLImageView2 = this.f126111g;
        l.b(rTLImageView2, "");
        rTLImageView2.setTag("endSlide");
        this.r.setOnTouchListener(this);
        this.t = true;
        MVRecycleView mVRecycleView2 = this.y;
        l.b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        t();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l.d(view, "");
        l.d(motionEvent, "");
        if (this.v) {
            setEnabled(true);
        }
        return super.onTouch(view, motionEvent);
    }

    private final long a(long j2, float f2) {
        VideoEditViewModel videoEditViewModel = this.f126109e;
        l.b(videoEditViewModel, "");
        if (videoEditViewModel.k() != null) {
            VideoEditViewModel videoEditViewModel2 = this.f126109e;
            l.b(videoEditViewModel2, "");
            if (!videoEditViewModel2.k().isEmpty()) {
                VideoEditViewModel videoEditViewModel3 = this.f126109e;
                l.b(videoEditViewModel3, "");
                List<VideoSegment> k2 = videoEditViewModel3.k();
                l.b(k2, "");
                long j3 = 0;
                for (T t : k2) {
                    if (!t.f125485i) {
                        l.b(t, "");
                        float e2 = ((float) (t.e() - t.d())) / (t.f() * f2);
                        float f3 = (float) j2;
                        if (f3 <= e2) {
                            return (long) ((((float) j3) + (f3 * t.f())) * f2);
                        }
                        j3 += t.e() - t.d();
                        j2 = (long) (f3 - e2);
                    }
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final void a(VideoSegment videoSegment, int i2) {
        if (!this.v) {
            setEditViewHeight(false);
            MVRecycleView mVRecycleView = this.y;
            l.b(mVRecycleView, "");
            mVRecycleView.setVisibility(0);
        }
        MVRecycleView mVRecycleView2 = this.z;
        l.b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(8);
        this.E.a();
        if (i2 == 2) {
            this.y.b(0);
            b bVar = this.D;
            com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar2 = this.w;
            l.b(bVar2, "");
            bVar.a(bVar2.f125491b);
            this.f126109e.i();
        } else if (i2 == 3) {
            this.y.b(0);
            b bVar3 = this.D;
            com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar4 = this.w;
            l.b(bVar4, "");
            bVar3.a(videoSegment, bVar4.f125491b);
            this.f126109e.a(videoSegment);
        } else if (i2 == 1) {
            this.f126109e.h();
        }
    }

    private /* synthetic */ VEVideoEditView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VEVideoEditView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.U = com.ss.android.ttve.utils.b.b(context, 6.0f);
        setLoadThumbnailDirectly(true);
    }
}
