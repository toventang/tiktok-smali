package com.ss.android.ugc.aweme.im.service.share.b;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f103947a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f103948b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f103949c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f103950d;

    /* renamed from: e  reason: collision with root package name */
    public final MeasureLinearLayout f103951e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f103952f;

    static {
        Covode.recordClassIndex(66583);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, SharePackage sharePackage, ViewGroup viewGroup, ViewGroup viewGroup2, FrameLayout frameLayout, boolean z, MeasureLinearLayout measureLinearLayout, TextView textView) {
        super(activity, sharePackage);
        l.d(activity, "");
        l.d(sharePackage, "");
        l.d(viewGroup, "");
        l.d(viewGroup2, "");
        l.d(frameLayout, "");
        l.d(measureLinearLayout, "");
        l.d(textView, "");
        this.f103947a = viewGroup;
        this.f103948b = viewGroup2;
        this.f103949c = frameLayout;
        this.f103950d = z;
        this.f103951e = measureLinearLayout;
        this.f103952f = textView;
    }
}
