package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.a.a.a;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;

public class az extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    ImageView f131438a;

    /* renamed from: b  reason: collision with root package name */
    TextView f131439b;

    /* renamed from: c  reason: collision with root package name */
    TextView f131440c;

    /* renamed from: d  reason: collision with root package name */
    TextView f131441d;

    /* renamed from: e  reason: collision with root package name */
    View f131442e;

    /* renamed from: f  reason: collision with root package name */
    TextView f131443f;

    /* renamed from: g  reason: collision with root package name */
    protected View f131444g;

    /* renamed from: h  reason: collision with root package name */
    protected ImageView f131445h;

    /* renamed from: i  reason: collision with root package name */
    protected FrameLayout f131446i;

    /* renamed from: j  reason: collision with root package name */
    protected SmartImageView f131447j;

    /* renamed from: k  reason: collision with root package name */
    protected TextView f131448k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f131449l;

    /* renamed from: m  reason: collision with root package name */
    private RemoteImageView f131450m;

    static {
        Covode.recordClassIndex(86105);
    }

    public int getPointColor() {
        return -1;
    }

    public ImageView getIconRight() {
        return this.f131445h;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f131450m;
    }

    public void setEnable(boolean z) {
        this.f131449l = z;
    }

    public az(Context context) {
        this(context, (byte) 0);
    }

    public void setDrawableLeft(int i2) {
        this.f131450m.setImageResource(i2);
    }

    public void setDrawableRight(int i2) {
        this.f131445h.setImageResource(i2);
    }

    public void setRightIconListener(View.OnClickListener onClickListener) {
        this.f131446i.setOnClickListener(onClickListener);
    }

    public void setSubtitle(int i2) {
        this.f131443f.setText(i2);
    }

    public void setSubtitleAlpha(float f2) {
        this.f131443f.setAlpha(f2);
    }

    public void setTitle(int i2) {
        this.f131439b.setText(i2);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f131439b.setText(spannableString);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f131450m.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f131445h.setImageDrawable(drawable);
    }

    public final void setSubTitleTextColor(int i2) {
        this.f131443f.setTextColor(b.c(getContext(), i2));
    }

    public void setSubtitle(String str) {
        this.f131443f.setText(str);
    }

    public void setTitle(String str) {
        this.f131439b.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f131439b.setSingleLine(true);
        } else {
            this.f131439b.setSingleLine(false);
        }
        this.f131439b.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleLeftMargin(double d2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f131443f.getLayoutParams();
        layoutParams.leftMargin = n.a(d2);
        this.f131443f.setLayoutParams(layoutParams);
        this.f131443f.setSingleLine();
        this.f131443f.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i2) {
        this.f131443f.setSingleLine();
        this.f131443f.setEllipsize(TextUtils.TruncateAt.END);
        this.f131443f.setMaxWidth(i2);
    }

    public void setTagText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f131440c.setVisibility(0);
            this.f131440c.setText(str);
            this.f131442e.setVisibility(0);
            return;
        }
        this.f131440c.setVisibility(8);
        this.f131442e.setVisibility(8);
    }

    public void setTextHighlight(boolean z) {
        int c2;
        if (z) {
            c2 = b.c(getContext(), R.color.bx);
        } else {
            c2 = b.c(getContext(), R.color.nr);
        }
        this.f131439b.setTextColor(c2);
        this.f131443f.setTextColor(c2);
    }

    private az(Context context, byte b2) {
        this(context, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private az(Context context, char c2) {
        super(context, null, 0);
        Drawable drawable = null;
        boolean z = false;
        MethodCollector.i(2280);
        this.f131449l = true;
        this.f131444g = LayoutInflater.from(context).inflate(R.layout.aao, this);
        this.f131450m = (RemoteImageView) findViewById(R.id.d9n);
        this.f131439b = (TextView) findViewById(R.id.d9l);
        this.f131440c = (TextView) findViewById(R.id.d9t);
        this.f131442e = findViewById(R.id.d9j);
        this.f131443f = (TextView) findViewById(R.id.d9s);
        this.f131438a = (ImageView) findViewById(R.id.d9m);
        this.f131445h = (ImageView) findViewById(R.id.bj9);
        this.f131447j = (SmartImageView) findViewById(R.id.dd9);
        this.f131441d = (TextView) findViewById(R.id.d9q);
        this.f131448k = (TextView) findViewById(R.id.dd_);
        this.f131446i = (FrameLayout) findViewById(R.id.dn_);
        z = getPointColor() == -1 ? true : z;
        Drawable b2 = a.b(context, 2131232405);
        ImageView imageView = this.f131438a;
        if (z) {
            drawable = b2;
        } else {
            int pointColor = getPointColor();
            if (b2 != null) {
                drawable = b2.mutate();
                drawable.setColorFilter(new PorterDuffColorFilter(pointColor, PorterDuff.Mode.SRC_IN));
            }
        }
        imageView.setImageDrawable(drawable);
        MethodCollector.o(2280);
    }
}
