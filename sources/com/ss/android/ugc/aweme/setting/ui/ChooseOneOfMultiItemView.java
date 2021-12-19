package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.input.TuxCheckBox;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class ChooseOneOfMultiItemView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private String f122753g;

    /* renamed from: h  reason: collision with root package name */
    private String f122754h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f122755i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f122756j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f122757k;

    static {
        Covode.recordClassIndex(80579);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View b(int i2) {
        if (this.f122757k == null) {
            this.f122757k = new HashMap();
        }
        View view = (View) this.f122757k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f122757k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String getMDesc() {
        return this.f122754h;
    }

    public final String getMText() {
        return this.f122753g;
    }

    public final boolean getSelect() {
        return this.f122756j;
    }

    public final boolean getShowDiv() {
        return this.f122755i;
    }

    public final void setMDesc(String str) {
        this.f122754h = str;
    }

    public final void setMText(String str) {
        this.f122753g = str;
    }

    public final void setSelect(boolean z) {
        this.f122756j = z;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) b(R.id.bi7);
        l.b(tuxCheckBox, "");
        tuxCheckBox.setChecked(this.f122756j);
    }

    public final void setShowDiv(boolean z) {
        this.f122755i = z;
        if (z) {
            View b2 = b(R.id.an3);
            l.b(b2, "");
            b2.setVisibility(0);
            return;
        }
        View b3 = b(R.id.an3);
        l.b(b3, "");
        b3.setVisibility(8);
    }

    private /* synthetic */ ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f122753g = "";
        this.f122754h = "";
        this.f122755i = true;
        ConstraintLayout.inflate(context, R.layout.ayw, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.xu, R.attr.y6, R.attr.abb, R.attr.abx});
            l.b(obtainStyledAttributes, "");
            this.f122753g = obtainStyledAttributes.getString(1);
            this.f122754h = obtainStyledAttributes.getString(0);
            setShowDiv(obtainStyledAttributes.getBoolean(3, true));
            setSelect(obtainStyledAttributes.getBoolean(2, false));
            obtainStyledAttributes.recycle();
        }
        DmtTextView dmtTextView = (DmtTextView) b(R.id.text);
        l.b(dmtTextView, "");
        dmtTextView.setText(this.f122753g);
        if (TextUtils.isEmpty(this.f122754h)) {
            DmtTextView dmtTextView2 = (DmtTextView) b(R.id.ak7);
            l.b(dmtTextView2, "");
            dmtTextView2.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) b(R.id.ak7);
        l.b(dmtTextView3, "");
        dmtTextView3.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) b(R.id.ak7);
        l.b(dmtTextView4, "");
        dmtTextView4.setText(this.f122754h);
    }
}
