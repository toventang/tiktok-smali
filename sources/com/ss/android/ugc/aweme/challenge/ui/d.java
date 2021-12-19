package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.f.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f70125a;

    /* renamed from: b  reason: collision with root package name */
    private final SpannableString f70126b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f70127c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f70128d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f70129e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70130f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableString f70131g;

    static {
        Covode.recordClassIndex(43249);
    }

    public d(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f70125a = textView;
        this.f70126b = spannableString;
        this.f70127c = imageView;
        this.f70128d = textView2;
        this.f70129e = viewGroup;
        this.f70130f = z;
        this.f70131g = spannableString2;
    }

    public final void run() {
        TextView textView = this.f70125a;
        SpannableString spannableString = this.f70126b;
        ImageView imageView = this.f70127c;
        TextView textView2 = this.f70128d;
        ViewGroup viewGroup = this.f70129e;
        boolean z = this.f70130f;
        SpannableString spannableString2 = this.f70131g;
        int height = textView.getHeight();
        int intValue = a.a(textView, spannableString).f69951b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new e(imageView));
        imageView.setOnClickListener(new f(imageView, viewGroup, textView, intValue, height, z, spannableString2, spannableString, textView2));
    }
}
