package com.bytedance.tux.icon;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;
import h.j.h;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f45108a;

    /* renamed from: b  reason: collision with root package name */
    public int f45109b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f45110c;

    /* renamed from: d  reason: collision with root package name */
    public float f45111d;

    /* renamed from: e  reason: collision with root package name */
    public float f45112e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.tux.c.b f45113f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.tux.c.b f45114g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f45115h;

    static {
        Covode.recordClassIndex(27519);
    }

    public final void a(Integer num) {
        this.f45113f = c(num);
    }

    public final void b(Integer num) {
        this.f45114g = c(num);
    }

    public b(TextView textView) {
        l.c(textView, "");
        this.f45115h = textView;
    }

    public final void a(com.bytedance.tux.c.b bVar) {
        Integer num = this.f45110c;
        if (num != null) {
            int intValue = num.intValue();
            if (bVar != null) {
                bVar.c(intValue);
            }
        }
    }

    public final void a(boolean z) {
        com.bytedance.tux.c.b bVar = this.f45113f;
        if (bVar != null) {
            bVar.a(z);
        }
        com.bytedance.tux.c.b bVar2 = this.f45114g;
        if (bVar2 != null) {
            bVar2.a(z);
        }
    }

    private final com.bytedance.tux.c.b c(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (num.intValue() <= 0) {
            return null;
        }
        Context context = this.f45115h.getContext();
        l.a((Object) context, "");
        return new com.bytedance.tux.c.b(context, num.intValue());
    }

    public final void a(int i2) {
        int i3;
        int i4;
        com.bytedance.tux.c.b bVar;
        com.bytedance.tux.c.b bVar2;
        int i5;
        TextView textView = this.f45115h;
        a(this.f45113f);
        a(this.f45114g);
        float width = ((((float) textView.getWidth()) - textView.getPaint().measureText(textView.getText().toString())) - ((float) textView.getPaddingLeft())) - ((float) textView.getPaddingRight());
        if (textView.getCompoundDrawablePadding() != i2) {
            textView.setCompoundDrawablePadding(i2);
        }
        if (this.f45113f != null) {
            i3 = this.f45109b + i2;
        } else {
            i3 = 0;
        }
        if (this.f45114g != null) {
            i4 = this.f45109b + i2;
        } else {
            i4 = 0;
        }
        float b2 = h.b((width - ((float) i3)) - ((float) i4), 0.0f) / 2.0f;
        if (i.a(textView)) {
            bVar = this.f45114g;
            bVar2 = this.f45113f;
        } else {
            bVar = this.f45113f;
            bVar2 = this.f45114g;
        }
        int a2 = a.a(b2);
        if (bVar == null || !bVar.c()) {
            i5 = a2;
        } else {
            i5 = -a2;
        }
        if (bVar2 == null || !bVar2.c()) {
            a2 = -a2;
        }
        if (bVar != null) {
            bVar.setBounds(i5, 0, this.f45109b + i5, this.f45108a);
        }
        if (bVar2 != null) {
            bVar2.setBounds(a2, 0, this.f45109b + a2, this.f45108a);
        }
        textView.setCompoundDrawables(bVar, null, bVar2, null);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        Context context = this.f45115h.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap8, R.attr.ap_, R.attr.apa, R.attr.apl, R.attr.apn, R.attr.arl}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId < 0) {
            resourceId = obtainStyledAttributes.getResourceId(3, -1);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        this.f45111d = obtainStyledAttributes.getDimension(4, -1.0f);
        this.f45112e = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f45110c = Integer.valueOf(obtainStyledAttributes.getColor(5, 0));
        }
        obtainStyledAttributes.recycle();
        if (resourceId > 0) {
            l.a((Object) context, "");
            this.f45113f = new com.bytedance.tux.c.b(context, resourceId);
        }
        if (resourceId2 > 0) {
            l.a((Object) context, "");
            this.f45114g = new com.bytedance.tux.c.b(context, resourceId2);
        }
    }
}
