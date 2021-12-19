package com.ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.f.a;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f128479a;

    /* renamed from: b  reason: collision with root package name */
    private final SpannableString f128480b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f128481c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f128482d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f128483e;

    /* renamed from: f  reason: collision with root package name */
    private final SpannableString f128484f;

    static {
        Covode.recordClassIndex(84247);
    }

    b(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        this.f128479a = textView;
        this.f128480b = spannableString;
        this.f128481c = imageView;
        this.f128482d = textView2;
        this.f128483e = viewGroup;
        this.f128484f = spannableString2;
    }

    public final void run() {
        TextView textView = this.f128479a;
        SpannableString spannableString = this.f128480b;
        ImageView imageView = this.f128481c;
        TextView textView2 = this.f128482d;
        ViewGroup viewGroup = this.f128483e;
        SpannableString spannableString2 = this.f128484f;
        int height = textView.getHeight();
        int intValue = a.a(textView, spannableString).f69951b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new c(imageView));
        imageView.setOnClickListener(new d(imageView, viewGroup, textView, intValue, height, spannableString2, spannableString, textView2));
    }
}
