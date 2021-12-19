package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public SmartCircleImageView f127300a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f127301b;

    /* renamed from: c  reason: collision with root package name */
    public TuxTextView f127302c;

    /* renamed from: d  reason: collision with root package name */
    public TuxCheckBox f127303d;

    /* renamed from: e  reason: collision with root package name */
    public View f127304e;

    static {
        Covode.recordClassIndex(83483);
    }

    public final void a() {
        View view = this.f127304e;
        if (view == null) {
            l.a("containerView");
        }
        view.setAlpha(0.3f);
    }

    public final void b() {
        View view = this.f127304e;
        if (view == null) {
            l.a("containerView");
        }
        view.setAlpha(1.0f);
    }

    public final SmartCircleImageView getAvatar() {
        SmartCircleImageView smartCircleImageView = this.f127300a;
        if (smartCircleImageView == null) {
            l.a("avatar");
        }
        return smartCircleImageView;
    }

    public final TuxCheckBox getCheckBox() {
        TuxCheckBox tuxCheckBox = this.f127303d;
        if (tuxCheckBox == null) {
            l.a("checkBox");
        }
        return tuxCheckBox;
    }

    public final View getContainerView() {
        View view = this.f127304e;
        if (view == null) {
            l.a("containerView");
        }
        return view;
    }

    public final TuxTextView getNickName() {
        TuxTextView tuxTextView = this.f127302c;
        if (tuxTextView == null) {
            l.a("nickName");
        }
        return tuxTextView;
    }

    public final TuxTextView getUserName() {
        TuxTextView tuxTextView = this.f127301b;
        if (tuxTextView == null) {
            l.a("userName");
        }
        return tuxTextView;
    }

    public final void setAvatar(SmartCircleImageView smartCircleImageView) {
        l.d(smartCircleImageView, "");
        this.f127300a = smartCircleImageView;
    }

    public final void setCheckBox(TuxCheckBox tuxCheckBox) {
        l.d(tuxCheckBox, "");
        this.f127303d = tuxCheckBox;
    }

    public final void setContainerView(View view) {
        l.d(view, "");
        this.f127304e = view;
    }

    public final void setNickName(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f127302c = tuxTextView;
    }

    public final void setUserName(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f127301b = tuxTextView;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3818);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View a2 = a.a(LayoutInflater.from(getContext()), R.layout.e8, this, true);
        l.b(a2, "");
        this.f127304e = a2;
        if (a2 == null) {
            l.a("containerView");
        }
        View findViewById = a2.findViewById(R.id.aqx);
        l.b(findViewById, "");
        this.f127300a = (SmartCircleImageView) findViewById;
        View view = this.f127304e;
        if (view == null) {
            l.a("containerView");
        }
        View findViewById2 = view.findViewById(R.id.aqz);
        l.b(findViewById2, "");
        this.f127301b = (TuxTextView) findViewById2;
        View view2 = this.f127304e;
        if (view2 == null) {
            l.a("containerView");
        }
        View findViewById3 = view2.findViewById(R.id.aqy);
        l.b(findViewById3, "");
        this.f127302c = (TuxTextView) findViewById3;
        View view3 = this.f127304e;
        if (view3 == null) {
            l.a("containerView");
        }
        View findViewById4 = view3.findViewById(R.id.aqw);
        l.b(findViewById4, "");
        this.f127303d = (TuxCheckBox) findViewById4;
        MethodCollector.o(3818);
    }
}
