package com.ss.android.ugc.aweme.bullet.module.base.a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public PopupWindow f69422a;

    /* renamed from: b  reason: collision with root package name */
    public View f69423b;

    /* renamed from: c  reason: collision with root package name */
    public View f69424c;

    /* renamed from: d  reason: collision with root package name */
    public View f69425d;

    /* renamed from: e  reason: collision with root package name */
    public List<Integer> f69426e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f69427f;

    static {
        Covode.recordClassIndex(42804);
    }

    public final PopupWindow a(View.OnClickListener onClickListener) {
        if (this.f69422a == null) {
            View a2 = a.a(LayoutInflater.from(this.f69427f), R.layout.v4, null, false);
            this.f69423b = a2.findViewById(R.id.dk5);
            this.f69424c = a2.findViewById(R.id.af9);
            this.f69425d = a2.findViewById(R.id.czk);
            this.f69423b.setOnClickListener(onClickListener);
            this.f69424c.setOnClickListener(onClickListener);
            this.f69425d.setOnClickListener(onClickListener);
            PopupWindow popupWindow = new PopupWindow(a2, -2, -2, true);
            this.f69422a = popupWindow;
            popupWindow.setTouchable(true);
            this.f69422a.setAnimationStyle(R.style.w7);
            this.f69422a.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f69422a;
    }

    public c(Activity activity, View.OnClickListener onClickListener) {
        this.f69427f = activity;
        a(onClickListener);
    }
}
