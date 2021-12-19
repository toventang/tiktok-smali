package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.c;
import com.zhiliaoapp.musically.R;

public abstract class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f33687a;

    /* renamed from: e  reason: collision with root package name */
    protected String f33688e;

    /* renamed from: f  reason: collision with root package name */
    protected View f33689f;

    /* renamed from: g  reason: collision with root package name */
    protected RelativeLayout f33690g;

    /* renamed from: h  reason: collision with root package name */
    protected FrameLayout f33691h;

    /* renamed from: i  reason: collision with root package name */
    protected ViewGroup f33692i;

    /* renamed from: j  reason: collision with root package name */
    protected FrameLayout f33693j;

    /* renamed from: k  reason: collision with root package name */
    protected TextView f33694k;

    /* renamed from: l  reason: collision with root package name */
    protected TextView f33695l;

    /* renamed from: m  reason: collision with root package name */
    protected View f33696m;
    protected ImageView n;
    protected AbstractC0735a o;
    protected int p;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.a$a  reason: collision with other inner class name */
    public interface AbstractC0735a {
        static {
            Covode.recordClassIndex(20040);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(20038);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    public abstract int getRightLayoutId();

    public TextView getTxtRight() {
        return null;
    }

    public FrameLayout getDecorLayout() {
        return this.f33693j;
    }

    public void setRightTxt(String str) {
        this.f33688e = str;
    }

    public void setStartText(String str) {
        this.f33694k.setText(str);
    }

    public void setOnSettingItemClickListener(AbstractC0735a aVar) {
        this.o = aVar;
        this.f33690g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ies.dmt.ui.widget.setting.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(20039);
            }

            public final void onClick(View view) {
                if (a.this.o != null) {
                    a.this.o.a();
                }
            }
        });
    }

    public void setRightLayoutVisibility(int i2) {
        ((ViewGroup) findViewById(R.id.dnf)).setVisibility(i2);
    }

    public void setSubText(String str) {
        this.f33695l.setVisibility(0);
        this.f33695l.setText(str);
    }

    public void setStartIcon(int i2) {
        if (getContext() != null && getContext().getResources() != null) {
            this.n.setImageResource(i2);
        }
    }

    public void setStartTextColor(int i2) {
        if (getContext() != null) {
            this.f33694k.setTextColor(b.c(getContext(), i2));
        }
    }

    public void setSubTextColor(int i2) {
        if (getContext() != null) {
            this.f33695l.setTextColor(b.c(getContext(), i2));
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        View inflate = View.inflate(context, R.layout.bi1, this);
        this.f33689f = inflate;
        this.f33690g = (RelativeLayout) inflate.findViewById(R.id.dqk);
        this.f33694k = (TextView) this.f33689f.findViewById(R.id.f1u);
        this.f33695l = (TextView) this.f33689f.findViewById(R.id.f1t);
        this.f33692i = (ViewGroup) this.f33689f.findViewById(R.id.dp8);
        this.f33693j = (FrameLayout) this.f33689f.findViewById(R.id.b5q);
        this.n = (ImageView) this.f33689f.findViewById(R.id.byk);
        this.f33696m = this.f33689f.findViewById(R.id.fbk);
        this.f33691h = (FrameLayout) findViewById(R.id.dna);
        int rightLayoutId = getRightLayoutId();
        if (rightLayoutId != 0) {
            com.a.a(LayoutInflater.from(context), rightLayoutId, this.f33691h, true);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
        new StringBuilder("getBaseStyle() called with: context = [").append(context).append("], attrs = [").append(attributeSet).append("]");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sx, R.attr.sy, R.attr.vl, R.attr.xl, R.attr.af9, R.attr.afa, R.attr.afb, R.attr.aft, R.attr.afu, R.attr.ai_, R.attr.aih});
        this.f33690g.setBackground(c.c(context));
        this.f33694k.setText(obtainStyledAttributes.getString(6));
        this.f33694k.setTextColor(obtainStyledAttributes.getColor(9, c.a(context)));
        String string = obtainStyledAttributes.getString(5);
        int i3 = 8;
        if (!TextUtils.isEmpty(string)) {
            this.f33695l.setText(string);
            this.f33694k.setMaxLines(1);
            this.f33690g.getLayoutParams().height = (int) n.b(getContext(), 70.0f);
        } else {
            this.f33695l.setVisibility(8);
        }
        int color = obtainStyledAttributes.getColor(7, c.b(context));
        this.p = color;
        this.f33695l.setTextColor(color);
        if (obtainStyledAttributes.hasValue(4)) {
            this.n.setImageResource(obtainStyledAttributes.getResourceId(4, -1));
        } else {
            this.n.setVisibility(8);
            int b2 = (int) n.b(context, 16.0f);
            int i4 = Build.VERSION.SDK_INT;
            ((ViewGroup.MarginLayoutParams) this.f33692i.getLayoutParams()).setMarginStart(b2);
        }
        if (!obtainStyledAttributes.getBoolean(3, false)) {
            this.f33696m.setVisibility(8);
        }
        this.f33696m.setBackgroundColor(b.c(context, R.color.b2));
        this.f33688e = obtainStyledAttributes.getString(1);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        this.f33687a = z;
        setRightLayoutVisibility(!z ? 0 : i3);
        obtainStyledAttributes.recycle();
        a(context, attributeSet);
    }
}
