package com.ss.android.ugc.gamora.editor.toolbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class EditProcessBarView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f146969a;

    /* renamed from: b  reason: collision with root package name */
    public ProgressBar f146970b;

    /* renamed from: c  reason: collision with root package name */
    public ProgressBar f146971c;

    /* renamed from: d  reason: collision with root package name */
    final ValueAnimator f146972d;

    /* renamed from: e  reason: collision with root package name */
    private int f146973e;

    static {
        Covode.recordClassIndex(96798);
    }

    public EditProcessBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getTotalPage() {
        return this.f146973e;
    }

    public final ProgressBar getProcessBarView1() {
        ProgressBar progressBar = this.f146969a;
        if (progressBar == null) {
            l.a("processBarView1");
        }
        return progressBar;
    }

    public final ProgressBar getProcessBarView2() {
        ProgressBar progressBar = this.f146970b;
        if (progressBar == null) {
            l.a("processBarView2");
        }
        return progressBar;
    }

    public final ProgressBar getProcessBarView3() {
        ProgressBar progressBar = this.f146971c;
        if (progressBar == null) {
            l.a("processBarView3");
        }
        return progressBar;
    }

    public final void setTotalPage(int i2) {
        this.f146973e = i2;
    }

    public final void setProcessBarView1(ProgressBar progressBar) {
        l.d(progressBar, "");
        this.f146969a = progressBar;
    }

    public final void setProcessBarView2(ProgressBar progressBar) {
        l.d(progressBar, "");
        this.f146970b = progressBar;
    }

    public final void setProcessBarView3(ProgressBar progressBar) {
        l.d(progressBar, "");
        this.f146971c = progressBar;
    }

    private /* synthetic */ EditProcessBarView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EditProcessBarView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3634);
        this.f146973e = 2;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        l.b(ofInt, "");
        this.f146972d = ofInt;
        MethodCollector.o(3634);
    }
}
