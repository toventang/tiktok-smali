package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.a;
import com.ss.android.ugc.aweme.sticker.data.d;
import com.ss.android.ugc.aweme.utils.gb;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132538a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f132539b;

    /* renamed from: c  reason: collision with root package name */
    private final int f132540c;

    /* renamed from: d  reason: collision with root package name */
    private final float f132541d;

    /* renamed from: e  reason: collision with root package name */
    private final d f132542e;

    /* renamed from: f  reason: collision with root package name */
    private final int f132543f;

    /* renamed from: g  reason: collision with root package name */
    private final float f132544g;

    /* renamed from: h  reason: collision with root package name */
    private final int f132545h;

    /* renamed from: i  reason: collision with root package name */
    private final float f132546i;

    /* renamed from: j  reason: collision with root package name */
    private final float f132547j;

    static {
        Covode.recordClassIndex(86746);
    }

    f(ChooseCoverActivity chooseCoverActivity, TextView textView, int i2, float f2, d dVar, int i3, float f3, int i4, float f4, float f5) {
        this.f132538a = chooseCoverActivity;
        this.f132539b = textView;
        this.f132540c = i2;
        this.f132541d = f2;
        this.f132542e = dVar;
        this.f132543f = i3;
        this.f132544g = f3;
        this.f132545h = i4;
        this.f132546i = f4;
        this.f132547j = f5;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f132538a;
        TextView textView = this.f132539b;
        int i2 = this.f132540c;
        float f2 = this.f132541d;
        d dVar = this.f132542e;
        int i3 = this.f132543f;
        float f3 = this.f132544g;
        int i4 = this.f132545h;
        float f4 = this.f132546i;
        float f5 = this.f132547j;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        textView.setPivotX(0.0f);
        textView.setMaxWidth(com.ss.android.ugc.gamora.editor.subtitle.d.v);
        if (gb.a()) {
            layoutParams.rightMargin = (int) (((float) (i2 + chooseCoverActivity.f132506g.getLeft())) + f2);
        } else {
            layoutParams.leftMargin = (int) (((float) (i2 + chooseCoverActivity.f132506g.getLeft())) + f2);
        }
        if (dVar.getLocation() == a.LEFT_TOP.getValue()) {
            layoutParams.gravity = 48;
            layoutParams.topMargin = (int) (((float) i3) + f3);
            textView.setPivotY(0.0f);
        } else {
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) (((float) ((((ViewGroup) textView.getParent()).getHeight() - i3) - i4)) + f4);
            textView.setPivotY((float) textView.getHeight());
        }
        textView.setScaleX(f5);
        textView.setScaleY(f5);
        chooseCoverActivity.f132504e.w.a(new i(chooseCoverActivity, textView));
    }
}
