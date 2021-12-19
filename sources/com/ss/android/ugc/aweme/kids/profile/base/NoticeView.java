package com.ss.android.ugc.aweme.kids.profile.base;

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
    RemoteImageView f106756a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f106757b;

    /* renamed from: c  reason: collision with root package name */
    TextView f106758c;

    /* renamed from: d  reason: collision with root package name */
    View f106759d;

    /* renamed from: e  reason: collision with root package name */
    View f106760e;

    /* renamed from: f  reason: collision with root package name */
    private a f106761f;

    /* renamed from: g  reason: collision with root package name */
    private int f106762g;

    public interface a {
        static {
            Covode.recordClassIndex(68245);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(68244);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
    }

    public final TextView getTitleTextView() {
        return this.f106758c;
    }

    public final void setOnInternalClickListener(a aVar) {
        this.f106761f = aVar;
    }

    private void setColorMode(int i2) {
        if (this.f106762g != i2) {
            this.f106762g = i2;
        }
    }

    public final void setCloseImage(int i2) {
        this.f106757b.setImageResource(i2);
    }

    public final void setIconImage(int i2) {
        this.f106756a.setImageResource(i2);
    }

    public final void setNoticeBackgroundColor(int i2) {
        this.f106760e.setBackgroundColor(i2);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f106758c.setText(charSequence);
    }

    public final void setTitleTextColor(int i2) {
        this.f106758c.setTextColor(i2);
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f106757b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f106756a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f106758c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        e.a(this.f106756a, urlModel);
    }

    public final void setTitleText(int i2) {
        this.f106758c.setText(getContext().getResources().getText(i2));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f106761f != null) {
            if (view.getId() == R.id.bve) {
                this.f106761f.b();
            } else if (view.getId() == R.id.emj) {
                this.f106761f.a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NoticeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1944);
        this.f106762g = -1;
        inflate(context, R.layout.adw, this);
        this.f106756a = (RemoteImageView) findViewById(R.id.by0);
        this.f106757b = (ImageView) findViewById(R.id.bve);
        this.f106758c = (TextView) findViewById(R.id.f9l);
        this.f106759d = findViewById(R.id.emj);
        this.f106760e = findViewById(R.id.cwl);
        this.f106757b.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        this.f106759d.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.5f));
        this.f106757b.setOnClickListener(this);
        this.f106759d.setOnClickListener(this);
        setColorMode(b.a.f33348a.f33347a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o5, R.attr.w1, R.attr.a6d, R.attr.aiz, R.attr.aj7, R.attr.aj9});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f106756a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f106757b.setImageDrawable(drawable2);
        }
        this.f106758c.setText(obtainStyledAttributes.getString(4));
        this.f106758c.setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        this.f106760e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.nd)));
        obtainStyledAttributes.recycle();
        MethodCollector.o(1944);
    }
}
