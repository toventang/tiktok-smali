package com.ss.android.ugc.aweme.qrcode.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f119840a;

    /* renamed from: b  reason: collision with root package name */
    Drawable f119841b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f119842c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f119843d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f119844e;

    static {
        Covode.recordClassIndex(77866);
    }

    public final void b() {
        this.f119843d.setVisibility(4);
        this.f119844e.setVisibility(0);
    }

    public final void dismiss() {
        ImageView imageView = this.f119843d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        super.dismiss();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    public final void a() {
        ImageView imageView = this.f119843d;
        if (imageView != null) {
            imageView.clearAnimation();
            ((AnimationDrawable) this.f119843d.getDrawable()).start();
        }
    }

    private a(Context context) {
        super(context, 3);
    }

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        super.setMessage(charSequence);
        if (this.f119842c && (textView = (TextView) findViewById(R.id.clf)) != null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        this.f119840a = charSequence;
    }

    public final void a(Drawable drawable) {
        View findViewById;
        if (this.f119842c && (findViewById = findViewById(R.id.dqe)) != null) {
            findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, b.a(getContext(), (int) R.drawable.b1t)}));
        }
        this.f119841b = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ajf);
        this.f119842c = true;
        this.f119843d = (ImageView) findViewById(R.id.kq);
        this.f119844e = (ImageView) findViewById(R.id.aol);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        getWindow().setAttributes(attributes);
        setMessage(this.f119840a);
        setIndeterminate(false);
        Drawable drawable = this.f119841b;
        if (drawable != null) {
            a(drawable);
        }
    }

    public static a a(Context context, String str) {
        a aVar = new a(context);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            try {
                aVar.show();
            } catch (Exception unused) {
            }
        }
        aVar.setMessage(str);
        aVar.a();
        return aVar;
    }
}
