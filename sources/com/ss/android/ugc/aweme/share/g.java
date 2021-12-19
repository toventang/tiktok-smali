package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.StringTokenizer;

public class g extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    protected ImageView f123483a = ((ImageView) findViewById(R.id.e0a));

    /* renamed from: b  reason: collision with root package name */
    protected TextView f123484b = ((TextView) findViewById(R.id.e0b));

    /* renamed from: c  reason: collision with root package name */
    protected View f123485c;

    static {
        Covode.recordClassIndex(81080);
    }

    public int getLayoutResource() {
        return R.layout.ly;
    }

    public ImageView getShareImageView() {
        return this.f123483a;
    }

    public TextView getShareTextView() {
        return this.f123484b;
    }

    public void setIcon(int i2) {
        this.f123483a.setImageResource(i2);
    }

    public void setIconAlpha(float f2) {
        this.f123483a.setAlpha(f2);
    }

    public void setText(int i2) {
        this.f123484b.setText(i2);
    }

    public void setTextAlpha(float f2) {
        this.f123484b.setAlpha(f2);
    }

    public void setTextSize(float f2) {
        this.f123484b.setTextSize(f2);
    }

    public void setIcon(Drawable drawable) {
        this.f123483a.setImageDrawable(drawable);
    }

    public void setTextColor(int i2) {
        this.f123484b.setTextColor(getResources().getColor(i2));
    }

    public void setText(String str) {
        int i2;
        TextView textView = this.f123484b;
        if (str.contains(" ")) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        textView.setMaxLines(i2);
        TextView textView2 = this.f123484b;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        sb.append(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() >= 8) {
                sb.append(" \n").append(nextToken);
            } else {
                sb.append(" ").append(nextToken);
            }
        }
        textView2.setText(sb.toString());
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.i(6176);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        View findViewById = findViewById(R.id.w4);
        this.f123485c = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
        MethodCollector.o(6176);
    }
}
