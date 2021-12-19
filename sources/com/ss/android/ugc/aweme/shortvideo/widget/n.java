package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class n extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private TextView f132942g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f132943h;

    static {
        Covode.recordClassIndex(86952);
    }

    public final TextView getTextView() {
        return this.f132942g;
    }

    public final CharSequence getTagText() {
        return this.f132943h.getText();
    }

    public final void b() {
        this.f132942g.setPadding((int) com.bytedance.common.utility.n.b(getContext(), 12.0f), (int) com.bytedance.common.utility.n.b(getContext(), 6.0f), (int) com.bytedance.common.utility.n.b(getContext(), 12.0f), (int) com.bytedance.common.utility.n.b(getContext(), 6.0f));
    }

    public n(Context context) {
        this(context, (byte) 0);
    }

    public final void setTabSelected(boolean z) {
        this.f132942g.setSelected(z);
    }

    public final void setTextColor(int i2) {
        this.f132942g.setTextColor(i2);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f132942g.setText(str);
        }
    }

    private n(Context context, byte b2) {
        this(context, (char) 0);
    }

    private n(Context context, char c2) {
        super(context, null, 0);
        View a2 = a.a(LayoutInflater.from(getContext()), R.layout.b3l, this, true);
        this.f132942g = (TextView) a2.findViewById(R.id.ehc);
        this.f132943h = (TextView) a2.findViewById(R.id.ehb);
    }
}
