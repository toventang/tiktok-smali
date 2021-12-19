package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;

public final class NoticeView extends LinearLayout implements View.OnClickListener, d {

    /* renamed from: a  reason: collision with root package name */
    RemoteImageView f82140a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f82141b;

    /* renamed from: c  reason: collision with root package name */
    TextView f82142c;

    /* renamed from: d  reason: collision with root package name */
    View f82143d;

    /* renamed from: e  reason: collision with root package name */
    View f82144e;

    /* renamed from: f  reason: collision with root package name */
    private a f82145f;

    /* renamed from: g  reason: collision with root package name */
    private int f82146g;

    public interface a {
        static {
            Covode.recordClassIndex(51121);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(51120);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
    }

    public final TextView getTitleTextView() {
        return this.f82142c;
    }

    public final void setOnInternalClickListener(a aVar) {
        this.f82145f = aVar;
    }

    private void setColorMode(int i2) {
        if (this.f82146g != i2) {
            this.f82146g = i2;
        }
    }

    public final void setCloseImage(int i2) {
        this.f82141b.setImageResource(i2);
    }

    public final void setIconImage(int i2) {
        this.f82140a.setImageResource(i2);
    }

    public final void setNoticeBackgroundColor(int i2) {
        this.f82144e.setBackgroundColor(i2);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f82142c.setText(charSequence);
    }

    public final void setTitleTextColor(int i2) {
        this.f82142c.setTextColor(i2);
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f82141b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f82140a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f82142c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        e.a(this.f82140a, urlModel);
    }

    public final void setTitleText(int i2) {
        this.f82142c.setText(getContext().getResources().getText(i2));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f82145f != null) {
            if (view.getId() == R.id.bve) {
                this.f82145f.b();
            } else if (view.getId() == R.id.emj) {
                this.f82145f.a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NoticeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1315);
        this.f82146g = -1;
        inflate(context, R.layout.ajg, this);
        this.f82140a = (RemoteImageView) findViewById(R.id.by0);
        this.f82141b = (ImageView) findViewById(R.id.bve);
        this.f82142c = (TextView) findViewById(R.id.f9l);
        this.f82143d = findViewById(R.id.emj);
        this.f82144e = findViewById(R.id.cwl);
        this.f82141b.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        this.f82143d.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        this.f82141b.setOnClickListener(this);
        this.f82143d.setOnClickListener(this);
        setColorMode(b.a.f33348a.f33347a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o5, R.attr.w1, R.attr.a6d, R.attr.aiz, R.attr.aj7, R.attr.aj9});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f82140a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f82141b.setImageDrawable(drawable2);
        }
        this.f82142c.setText(obtainStyledAttributes.getString(4));
        this.f82142c.setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        this.f82144e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.nd)));
        obtainStyledAttributes.recycle();
        MethodCollector.o(1315);
    }
}
