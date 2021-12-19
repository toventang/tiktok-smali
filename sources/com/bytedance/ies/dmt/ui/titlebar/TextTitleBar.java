package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

public class TextTitleBar extends a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public DmtTextView f33520c;

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f33521d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f33522e;

    /* renamed from: f  reason: collision with root package name */
    public View f33523f;

    /* renamed from: g  reason: collision with root package name */
    private a f33524g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f33525h;

    /* renamed from: i  reason: collision with root package name */
    private TuxIconView f33526i;

    /* renamed from: j  reason: collision with root package name */
    private int f33527j;

    static {
        Covode.recordClassIndex(19992);
    }

    public ImageView getBackBtn() {
        return this.f33525h;
    }

    public DmtTextView getEndText() {
        return this.f33521d;
    }

    public DmtTextView getStartText() {
        return this.f33520c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        final int a2 = n.a(getContext());
        post(new Runnable() {
            /* class com.bytedance.ies.dmt.ui.titlebar.TextTitleBar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(19993);
            }

            public final void run() {
                TextTitleBar.this.f33530a.setMaxWidth((int) Math.max((float) (((a2 / 2) - Math.max(TextTitleBar.this.f33520c.getWidth(), TextTitleBar.this.f33521d.getWidth())) * 2), n.b(TextTitleBar.this.getContext(), 112.0f)));
            }
        });
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.f33524g = aVar;
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public void setDividerLineBackground(int i2) {
        this.f33523f.setBackgroundColor(i2);
    }

    public void setEndBtnClickListener(View.OnClickListener onClickListener) {
        this.f33526i.setOnClickListener(onClickListener);
    }

    public void setEndBtnImageResource(int i2) {
        this.f33526i.setIconRes(i2);
    }

    public void setEndText(int i2) {
        this.f33521d.setText(i2);
    }

    public void setEndTextColor(int i2) {
        this.f33521d.setTextColor(i2);
    }

    public void setEndTextSize(float f2) {
        this.f33521d.setTextSize(f2);
    }

    public void setLineBackground(int i2) {
        this.f33523f.setBackgroundColor(i2);
    }

    public void setStartText(int i2) {
        this.f33520c.setText(i2);
    }

    public void setStartTextColor(int i2) {
        this.f33520c.setTextColor(i2);
    }

    public void setStartTextSize(float f2) {
        this.f33520c.setTextSize(f2);
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public final void a(boolean z) {
        int i2;
        View view = this.f33523f;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public void setEndBtnVisibility(int i2) {
        if (i2 == 0) {
            this.f33526i.setVisibility(i2);
            this.f33521d.setVisibility(8);
        }
    }

    public void setEndText(CharSequence charSequence) {
        this.f33521d.setText(charSequence);
    }

    public void setStartText(CharSequence charSequence) {
        this.f33520c.setText(charSequence);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d, com.bytedance.ies.dmt.ui.titlebar.a
    public final void a(int i2) {
        int i3;
        ImageView imageView = this.f33525h;
        if (b.a(i2)) {
            i3 = R.drawable.ccg;
        } else {
            i3 = 2131234949;
        }
        imageView.setImageResource(i3);
    }

    public void setUseBackIcon(boolean z) {
        int i2;
        if (this.f33522e != z) {
            this.f33522e = z;
            ImageView imageView = this.f33525h;
            int i3 = 0;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            DmtTextView dmtTextView = this.f33520c;
            if (this.f33522e) {
                i3 = 8;
            }
            dmtTextView.setVisibility(i3);
        }
    }

    public void onClick(View view) {
        if (this.f33524g == null) {
            return;
        }
        if (view.getId() == R.id.qb || view.getId() == R.id.ejo) {
            this.f33524g.a(view);
        } else if (view.getId() == R.id.ejw) {
            this.f33524g.b(view);
        }
    }

    public TextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TextTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        inflate(context, R.layout.bka, this);
        this.f33520c = (DmtTextView) findViewById(R.id.ejo);
        this.f33530a = (DmtTextView) findViewById(R.id.title);
        this.f33521d = (DmtTextView) findViewById(R.id.ejw);
        this.f33525h = (ImageView) findViewById(R.id.qb);
        this.f33526i = (TuxIconView) findViewById(R.id.awj);
        this.f33523f = findViewById(R.id.ca6);
        this.f33525h.setOnClickListener(this);
        this.f33520c.setOnClickListener(this);
        this.f33521d.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b();
        this.f33525h.setOnTouchListener(bVar);
        this.f33520c.setOnTouchListener(bVar);
        this.f33521d.setOnTouchListener(bVar);
        this.f33526i.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ss, R.attr.sy, R.attr.sz, R.attr.t0, R.attr.t1, R.attr.a2f, R.attr.a2j, R.attr.afb, R.attr.afc, R.attr.afd, R.attr.aj7, R.attr.aj9, R.attr.aj_, R.attr.asm});
            String string = obtainStyledAttributes.getString(10);
            float dimension = obtainStyledAttributes.getDimension(12, n.b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(11, androidx.core.content.b.c(context, R.color.bx));
            this.f33530a.setText(string);
            this.f33530a.setTextSize(0, dimension);
            this.f33530a.setTextColor(color);
            boolean z = obtainStyledAttributes.getBoolean(13, false);
            this.f33522e = z;
            if (z) {
                this.f33525h.setVisibility(0);
                this.f33520c.setVisibility(8);
            } else {
                String string2 = obtainStyledAttributes.getString(7);
                float dimension2 = obtainStyledAttributes.getDimension(9, n.b(context, 15.0f));
                int color2 = obtainStyledAttributes.getColor(8, androidx.core.content.b.c(context, R.color.bx));
                this.f33525h.setVisibility(8);
                this.f33520c.setVisibility(0);
                this.f33520c.setText(string2);
                this.f33520c.setTextSize(0, dimension2);
                this.f33520c.setTextColor(color2);
            }
            String string3 = obtainStyledAttributes.getString(1);
            float dimension3 = obtainStyledAttributes.getDimension(3, n.b(context, 15.0f));
            int color3 = obtainStyledAttributes.getColor(2, androidx.core.content.b.c(context, R.color.bx));
            int i2 = obtainStyledAttributes.getInt(4, 0);
            this.f33521d.setText(string3);
            this.f33521d.setTextSize(0, dimension3);
            this.f33521d.setTextColor(color3);
            this.f33521d.setVisibility(i2);
            if (obtainStyledAttributes.getInt(0, 1) == 1) {
                this.f33521d.setFontWeight(2);
                this.f33521d.setTextColor(androidx.core.content.b.c(context, R.color.bh));
            } else {
                this.f33521d.setFontWeight(1);
                this.f33521d.setTextColor(androidx.core.content.b.c(context, R.color.bx));
            }
            this.f33523f.setVisibility(obtainStyledAttributes.getInt(6, 0));
            int color4 = obtainStyledAttributes.getColor(5, androidx.core.content.b.c(context, R.color.b2));
            this.f33527j = color4;
            this.f33523f.setBackgroundColor(color4);
            obtainStyledAttributes.recycle();
        }
        setColorMode(b.a.f33348a.f33347a);
    }
}
