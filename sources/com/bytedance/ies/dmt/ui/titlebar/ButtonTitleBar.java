package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

public class ButtonTitleBar extends a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    private ImageView f33508c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f33509d;

    /* renamed from: e  reason: collision with root package name */
    private a f33510e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f33511f;

    /* renamed from: g  reason: collision with root package name */
    private View f33512g;

    /* renamed from: h  reason: collision with root package name */
    private int f33513h;

    static {
        Covode.recordClassIndex(19990);
    }

    public DmtTextView getEndBtn() {
        return this.f33509d;
    }

    public ImageView getStartBtn() {
        return this.f33508c;
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.f33510e = aVar;
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public void setDividerLineBackground(int i2) {
        this.f33512g.setBackgroundColor(i2);
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public final void a(boolean z) {
        int i2;
        View view = this.f33512g;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d, com.bytedance.ies.dmt.ui.titlebar.a
    public final void a(int i2) {
        int i3;
        ImageView imageView = this.f33508c;
        if (b.a(i2)) {
            i3 = R.drawable.ccg;
        } else {
            i3 = R.drawable.ccf;
        }
        imageView.setImageResource(i3);
    }

    public void onClick(View view) {
        if (this.f33510e == null) {
            return;
        }
        if (view.getId() == R.id.qb) {
            this.f33510e.a(view);
        } else if (view.getId() == R.id.dn8) {
            this.f33510e.b(view);
        }
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ButtonTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        inflate(context, R.layout.bj9, this);
        this.f33508c = (ImageView) findViewById(R.id.qb);
        this.f33530a = (DmtTextView) findViewById(R.id.title);
        this.f33509d = (DmtTextView) findViewById(R.id.dn8);
        this.f33512g = findViewById(R.id.ca6);
        this.f33508c.setOnClickListener(this);
        this.f33509d.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b();
        this.f33508c.setOnTouchListener(bVar);
        this.f33509d.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.so, R.attr.sp, R.attr.sq, R.attr.sr, R.attr.ss, R.attr.st, R.attr.a2f, R.attr.a2j, R.attr.aj7, R.attr.aj9, R.attr.aj_});
            String string = obtainStyledAttributes.getString(8);
            float dimension = obtainStyledAttributes.getDimension(10, n.b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(9, androidx.core.content.b.c(context, R.color.bx));
            this.f33530a.setText(string);
            this.f33530a.setTextSize(0, dimension);
            this.f33530a.setTextColor(color);
            String string2 = obtainStyledAttributes.getString(0);
            int i2 = obtainStyledAttributes.getInt(4, 1);
            float dimension2 = obtainStyledAttributes.getDimension(3, n.b(context, 17.0f));
            int color2 = obtainStyledAttributes.getColor(2, 0);
            this.f33511f = obtainStyledAttributes.getDrawable(1);
            int i3 = obtainStyledAttributes.getInt(5, 0);
            this.f33509d.setText(string2);
            if (i2 == 1) {
                this.f33509d.setTypeface(Typeface.defaultFromStyle(1));
                this.f33509d.setTextColor(androidx.core.content.b.c(context, R.color.bh));
            } else {
                this.f33509d.setTypeface(Typeface.defaultFromStyle(0));
                this.f33509d.setTextColor(androidx.core.content.b.c(context, R.color.bx));
            }
            this.f33509d.setTextSize(0, dimension2);
            if (color2 != 0) {
                this.f33509d.setTextColor(color2);
            }
            Drawable drawable = this.f33511f;
            if (drawable != null) {
                this.f33509d.setBackground(drawable);
            }
            this.f33509d.setVisibility(i3);
            this.f33512g.setVisibility(obtainStyledAttributes.getInt(7, 0));
            int color3 = obtainStyledAttributes.getColor(6, androidx.core.content.b.c(context, R.color.b2));
            this.f33513h = color3;
            this.f33512g.setBackgroundColor(color3);
            obtainStyledAttributes.recycle();
        }
        setColorMode(b.a.f33348a.f33347a);
    }
}
