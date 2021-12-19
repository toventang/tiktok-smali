package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public SmartCircleImageView f127270a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f127271b;

    /* renamed from: c  reason: collision with root package name */
    public TuxCheckBox f127272c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f127273d;

    static {
        Covode.recordClassIndex(83475);
    }

    public final SmartCircleImageView getAvatar() {
        SmartCircleImageView smartCircleImageView = this.f127270a;
        if (smartCircleImageView == null) {
            l.a("avatar");
        }
        return smartCircleImageView;
    }

    public final TuxCheckBox getCheckBox() {
        TuxCheckBox tuxCheckBox = this.f127272c;
        if (tuxCheckBox == null) {
            l.a("checkBox");
        }
        return tuxCheckBox;
    }

    public final FrameLayout getCheckLayout() {
        FrameLayout frameLayout = this.f127273d;
        if (frameLayout == null) {
            l.a("checkLayout");
        }
        return frameLayout;
    }

    public final TuxTextView getUserName() {
        TuxTextView tuxTextView = this.f127271b;
        if (tuxTextView == null) {
            l.a("userName");
        }
        return tuxTextView;
    }

    public final void setAvatar(SmartCircleImageView smartCircleImageView) {
        l.d(smartCircleImageView, "");
        this.f127270a = smartCircleImageView;
    }

    public final void setCheckBox(TuxCheckBox tuxCheckBox) {
        l.d(tuxCheckBox, "");
        this.f127272c = tuxCheckBox;
    }

    public final void setCheckLayout(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        this.f127273d = frameLayout;
    }

    public final void setUserName(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f127271b = tuxTextView;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3879);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.e6, this, true);
        View findViewById = a2.findViewById(R.id.ar3);
        l.b(findViewById, "");
        this.f127270a = (SmartCircleImageView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ar6);
        l.b(findViewById2, "");
        this.f127271b = (TuxTextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.ar5);
        l.b(findViewById3, "");
        this.f127272c = (TuxCheckBox) findViewById3;
        View findViewById4 = a2.findViewById(R.id.ar4);
        l.b(findViewById4, "");
        this.f127273d = (FrameLayout) findViewById4;
        MethodCollector.o(3879);
    }
}
