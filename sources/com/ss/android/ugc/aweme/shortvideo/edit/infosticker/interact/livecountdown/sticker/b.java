package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends g {
    private int q;
    private int r;
    private float s = 28.0f;
    private int t;
    private LiveCDEditStickerView u;
    private float v;
    private float w;

    static {
        Covode.recordClassIndex(83584);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    public final LiveCDEditStickerView getBaseView() {
        return this.u;
    }

    public final float getLastHeight() {
        return this.w;
    }

    public final void s() {
        View view = this.f88218g;
        l.b(view, "");
        this.w = (float) view.getMeasuredHeight();
    }

    public final float r() {
        float f2 = this.w;
        LiveCDEditStickerView liveCDEditStickerView = this.u;
        if (liveCDEditStickerView == null) {
            l.b();
        }
        float height = (f2 - ((float) liveCDEditStickerView.getHeight())) * this.f88213b;
        if (height < 0.0f) {
            return height;
        }
        return height / 2.0f;
    }

    public final void setLastHeight(float f2) {
        this.w = f2;
    }

    public final void a(LiveCDEditStickerView liveCDEditStickerView) {
        MethodCollector.i(7404);
        if (liveCDEditStickerView == null) {
            MethodCollector.o(7404);
            return;
        }
        this.u = liveCDEditStickerView;
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(liveCDEditStickerView);
                MethodCollector.o(7404);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(7404);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(7404);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7512);
        this.f88212a = context;
        this.r = (int) n.b(context, 32.0f);
        int a2 = n.a(context) - this.r;
        this.q = a2;
        this.t = a2;
        this.s = n.b(context, 28.0f);
        this.v = n.b(context, 96.0f);
        LayoutInflater.from(this.f88212a).inflate(R.layout.ai7, this);
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        MethodCollector.o(7512);
    }

    public final void a(CountDownStickerStruct countDownStickerStruct) {
        MethodCollector.i(7498);
        if (this.u == null) {
            Context context = getContext();
            l.b(context, "");
            LiveCDEditStickerView liveCDEditStickerView = new LiveCDEditStickerView(context);
            this.u = liveCDEditStickerView;
            liveCDEditStickerView.setTouchEnable(true);
            LiveCDEditStickerView liveCDEditStickerView2 = this.u;
            if (liveCDEditStickerView2 == null) {
                l.b();
            }
            liveCDEditStickerView2.setEditEnable(false);
            if (countDownStickerStruct != null) {
                LiveCDEditStickerView liveCDEditStickerView3 = this.u;
                if (liveCDEditStickerView3 == null) {
                    l.b();
                }
                liveCDEditStickerView3.a(countDownStickerStruct);
            }
            if (this.u == null) {
                l.b();
            }
        }
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.u);
                MethodCollector.o(7498);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(7498);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(7498);
        throw nullPointerException2;
    }
}
