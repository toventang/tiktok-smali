package com.ss.android.ugc.aweme.geofencing;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.a.a.a;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.zhiliaoapp.musically.R;

public class PublishSettingItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f98999a;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f99000d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f99001e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f99002f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f99003g;

    /* renamed from: h  reason: collision with root package name */
    protected View f99004h;

    /* renamed from: i  reason: collision with root package name */
    protected ImageView f99005i;

    /* renamed from: j  reason: collision with root package name */
    protected SmartImageView f99006j;

    /* renamed from: k  reason: collision with root package name */
    protected TextView f99007k;

    /* renamed from: l  reason: collision with root package name */
    protected TextView f99008l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f99009m;

    static {
        Covode.recordClassIndex(62951);
    }

    public int getPointColor() {
        return -1;
    }

    public TextView getBottomHintTextView() {
        return this.f99008l;
    }

    public ImageView getIconRight() {
        return this.f99005i;
    }

    public RemoteImageView getLeftDrawableView() {
        return this.f98999a;
    }

    public final void c() {
        this.f98999a.setVisibility(8);
    }

    public void setEnable(boolean z) {
        this.f99009m = z;
    }

    public void setBottomHintText(int i2) {
        this.f99008l.setText(i2);
    }

    public void setBottomHintTextVisibility(int i2) {
        this.f99008l.setVisibility(i2);
    }

    public void setDrawableLeft(int i2) {
        this.f98999a.setImageResource(i2);
    }

    public void setDrawableRight(int i2) {
        this.f99005i.setImageResource(i2);
    }

    public void setSubtitle(int i2) {
        this.f99003g.setText(i2);
    }

    public void setSubtitleAlpha(float f2) {
        this.f99003g.setAlpha(f2);
    }

    public void setTitle(int i2) {
        this.f99001e.setText(i2);
    }

    public void setTitleSpannable(SpannableString spannableString) {
        this.f99001e.setText(spannableString);
    }

    public final void a(boolean z) {
        int i2;
        ImageView imageView = this.f99000d;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public void setBottomHintText(String str) {
        this.f99008l.setText(str);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f98999a.setImageDrawable(drawable);
    }

    public void setDrawableRight(Drawable drawable) {
        this.f99005i.setImageDrawable(drawable);
    }

    public final void setSubTitleTextColor(int i2) {
        this.f99003g.setTextColor(b.c(getContext(), i2));
    }

    public void setSubtitle(String str) {
        this.f99003g.setText(str);
    }

    public void setTitle(String str) {
        this.f99001e.setText(str);
    }

    public void setSingleLine(boolean z) {
        if (z) {
            this.f99001e.setSingleLine(true);
        } else {
            this.f99001e.setSingleLine(false);
        }
        this.f99001e.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleLeftMargin(double d2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f99003g.getLayoutParams();
        layoutParams.leftMargin = n.a(d2);
        this.f99003g.setLayoutParams(layoutParams);
        this.f99003g.setSingleLine();
        this.f99003g.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setSubtitleMaxWidth(int i2) {
        this.f99003g.setSingleLine();
        this.f99003g.setEllipsize(TextUtils.TruncateAt.END);
        this.f99003g.setMaxWidth(i2);
    }

    public PublishSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PublishSettingItem(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        boolean z = false;
        MethodCollector.i(11770);
        this.f99009m = true;
        this.f99004h = LayoutInflater.from(context).inflate(R.layout.f365do, this);
        this.f98999a = (RemoteImageView) findViewById(R.id.d9n);
        this.f99001e = (TextView) findViewById(R.id.d9l);
        this.f99003g = (TextView) findViewById(R.id.d9s);
        this.f99000d = (ImageView) findViewById(R.id.d9m);
        this.f99005i = (ImageView) findViewById(R.id.bj9);
        this.f99006j = (SmartImageView) findViewById(R.id.dd9);
        this.f99002f = (TextView) findViewById(R.id.d9q);
        this.f99007k = (TextView) findViewById(R.id.dd_);
        this.f99008l = (TextView) findViewById(R.id.vm);
        z = getPointColor() == -1 ? true : z;
        Drawable b3 = a.b(context, 2131232405);
        ImageView imageView = this.f99000d;
        if (!z) {
            int pointColor = getPointColor();
            if (b3 == null) {
                b3 = null;
            } else {
                b3 = b3.mutate();
                b3.setColorFilter(new PorterDuffColorFilter(pointColor, PorterDuff.Mode.SRC_IN));
            }
        }
        imageView.setImageDrawable(b3);
        MethodCollector.o(11770);
    }
}
