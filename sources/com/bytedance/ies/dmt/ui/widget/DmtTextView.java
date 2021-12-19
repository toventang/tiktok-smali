package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.b;
import com.bytedance.ies.dmt.ui.widget.util.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class DmtTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    private b f33606a;

    static {
        Covode.recordClassIndex(20021);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public String toString() {
        return super.toString() + ", text: " + ((Object) getText());
    }

    public void setFontDefinition(int i2) {
        e.b(this, i2);
    }

    public void setFontSize(int i2) {
        e.a(this, i2);
    }

    public void setFontWeight(int i2) {
        e.c(this, i2);
    }

    public DmtTextView(Context context) {
        this(context, null);
    }

    public void setFontType(String str) {
        com.bytedance.ies.dmt.ui.widget.util.b.a().a(this, str);
    }

    public void a(AttributeSet attributeSet) {
        com.bytedance.ies.dmt.ui.widget.util.b.a().a(this, attributeSet);
        l.d(this, "");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aky});
        l.b(obtainStyledAttributes, "");
        e.b(this, obtainStyledAttributes.getInt(0, 0));
        b bVar = new b(getContext(), attributeSet);
        this.f33606a = bVar;
        l.d(this, "");
        CharSequence text = getText();
        if (bVar.f33385a != 0) {
            setText(bVar.a(text));
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        try {
            super.onVisibilityChanged(view, i2);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        b bVar = this.f33606a;
        if (bVar == null) {
            super.setText(charSequence, bufferType);
        } else {
            super.setText(bVar.a(charSequence), bufferType);
        }
    }

    public DmtTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }
}
