package com.bytedance.ies.dmt.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

public class NormalTitleBar extends a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    private ImageView f33514c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f33515d;

    /* renamed from: e  reason: collision with root package name */
    private a f33516e;

    /* renamed from: f  reason: collision with root package name */
    private View f33517f;

    /* renamed from: g  reason: collision with root package name */
    private int f33518g;

    /* renamed from: h  reason: collision with root package name */
    private DmtTextView f33519h;

    static {
        Covode.recordClassIndex(19991);
    }

    public ImageView getEndBtn() {
        return this.f33515d;
    }

    public ImageView getStartBtn() {
        return this.f33514c;
    }

    public void setOnTitleBarClickListener(a aVar) {
        this.f33516e = aVar;
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public void setDividerLineBackground(int i2) {
        this.f33517f.setBackgroundColor(i2);
    }

    public void setEndBtnIcon(int i2) {
        this.f33515d.setImageResource(i2);
    }

    public void setStartBtnIcon(int i2) {
        this.f33514c.setImageResource(i2);
    }

    public void setStartTextSize(float f2) {
        this.f33519h.setTextSize(0, f2);
    }

    @Override // com.bytedance.ies.dmt.ui.titlebar.a
    public final void a(boolean z) {
        int i2;
        View view = this.f33517f;
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
        ImageView imageView = this.f33514c;
        if (b.a(i2)) {
            i3 = R.drawable.ccg;
        } else {
            i3 = R.drawable.ccf;
        }
        imageView.setImageResource(i3);
    }

    public void setStartText(String str) {
        this.f33514c.setVisibility(8);
        this.f33519h.setVisibility(0);
        this.f33519h.setText(str);
    }

    public void onClick(View view) {
        if (this.f33516e == null) {
            return;
        }
        if (view.getId() == R.id.qb || view.getId() == R.id.ejo) {
            this.f33516e.a(view);
        } else if (view.getId() == R.id.dn8) {
            this.f33516e.b(view);
        }
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NormalTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        int i2;
        inflate(context, R.layout.bjo, this);
        this.f33514c = (ImageView) findViewById(R.id.qb);
        this.f33530a = (DmtTextView) findViewById(R.id.title);
        this.f33515d = (ImageView) findViewById(R.id.dn8);
        this.f33517f = findViewById(R.id.ca6);
        this.f33519h = (DmtTextView) findViewById(R.id.ejo);
        this.f33514c.setOnClickListener(this);
        this.f33515d.setOnClickListener(this);
        this.f33519h.setOnClickListener(this);
        com.bytedance.ies.dmt.ui.widget.b bVar = new com.bytedance.ies.dmt.ui.widget.b();
        this.f33514c.setOnTouchListener(bVar);
        this.f33515d.setOnTouchListener(bVar);
        this.f33519h.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.su, R.attr.a2f, R.attr.a2j, R.attr.aj7, R.attr.aj9, R.attr.aj_});
            String string = obtainStyledAttributes.getString(3);
            float dimension = obtainStyledAttributes.getDimension(5, n.b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(4, androidx.core.content.b.c(context, R.color.bx));
            this.f33530a.setText(string);
            this.f33530a.setTextSize(0, dimension);
            this.f33530a.setTextColor(color);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId != -1) {
                this.f33515d.setImageResource(resourceId);
            }
            this.f33517f.setVisibility(obtainStyledAttributes.getInt(2, 0));
            Resources resources = getResources();
            if (b.b(null)) {
                i2 = R.color.b2;
            } else {
                i2 = R.color.a0;
            }
            int color2 = obtainStyledAttributes.getColor(1, resources.getColor(i2));
            this.f33518g = color2;
            this.f33517f.setBackgroundColor(color2);
            obtainStyledAttributes.recycle();
        }
        setColorMode(b.a.f33348a.f33347a);
    }
}
