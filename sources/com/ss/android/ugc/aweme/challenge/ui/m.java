package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.f.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f70169a;

    /* renamed from: b  reason: collision with root package name */
    private final SpannableString f70170b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f70171c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f70172d;

    /* renamed from: e  reason: collision with root package name */
    private final View f70173e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f70174f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableString f70175g;

    /* renamed from: h  reason: collision with root package name */
    private final Challenge f70176h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f70177i;

    static {
        Covode.recordClassIndex(43293);
    }

    public m(TextView textView, SpannableString spannableString, TextView textView2, ImageView imageView, View view, ViewGroup viewGroup, SpannableString spannableString2, Challenge challenge, boolean z) {
        this.f70169a = textView;
        this.f70170b = spannableString;
        this.f70171c = textView2;
        this.f70172d = imageView;
        this.f70173e = view;
        this.f70174f = viewGroup;
        this.f70175g = spannableString2;
        this.f70176h = challenge;
        this.f70177i = z;
    }

    public final void run() {
        TextView textView = this.f70169a;
        SpannableString spannableString = this.f70170b;
        TextView textView2 = this.f70171c;
        ImageView imageView = this.f70172d;
        ViewGroup viewGroup = this.f70174f;
        SpannableString spannableString2 = this.f70175g;
        Challenge challenge = this.f70176h;
        boolean z = this.f70177i;
        if (textView.getHeight() == a.a(textView, spannableString).f69951b.intValue()) {
            textView.setText(spannableString);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new n(imageView));
        imageView.setOnClickListener(new o(imageView, viewGroup, textView, spannableString2, challenge, z, spannableString, textView2));
    }
}
