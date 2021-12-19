package com.ss.android.ugc.aweme.following.ui.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.common.rebranding.c;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class I18nFollowUserBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96607a = new a((byte) 0);

    static {
        Covode.recordClassIndex(61241);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61242);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void c() {
        super.c();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final ViewGroup.LayoutParams getButtonLayoutParams() {
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        ViewGroup.LayoutParams layoutParams = niceWidthTextView.getLayoutParams();
        l.b(layoutParams, "");
        return layoutParams;
    }

    public final void d() {
        ViewGroup.LayoutParams buttonLayoutParams = getButtonLayoutParams();
        buttonLayoutParams.height = n.a(28.0d);
        buttonLayoutParams.width = n.a(80.0d);
        setButtonLayoutParams(buttonLayoutParams);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = buttonLayoutParams.height;
        layoutParams.width = buttonLayoutParams.width;
        setLayoutParams(layoutParams);
    }

    private final void a(int i2) {
        if (this.f96597b != null) {
            h.a(this.f96597b, i2);
            this.f96597b.setPadding(8, 0, 8, 0);
            this.f96597b.setFontType(d.f33801g);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        this.f96601f = layoutParams.width;
        Class<?> cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        com.bytedance.ies.dmt.ui.common.rebranding.a.a(cls, new a.C0729a(a(niceWidthTextView)));
        NiceWidthTextView niceWidthTextView2 = this.f96597b;
        l.b(niceWidthTextView2, "");
        niceWidthTextView2.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final int a(TextView textView) {
        l.d(textView, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.c06));
        arrayList.add(Integer.valueOf((int) R.string.bbg));
        arrayList.add(Integer.valueOf((int) R.string.bzw));
        arrayList.add(Integer.valueOf((int) R.string.bbi));
        arrayList.add(Integer.valueOf((int) R.string.byt));
        int a2 = c.a(textView, arrayList, (int) com.bytedance.common.utility.n.b(getContext(), 80.0f), (int) com.bytedance.common.utility.n.b(getContext(), 120.0f));
        if (this.f96601f <= 0 || a2 < this.f96601f) {
            return a2;
        }
        return this.f96601f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i2) {
        if (i2 == 1) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.byt));
            Paint paint = new Paint();
            paint.setTypeface(b.a().a(d.f33801g));
            if (paint.measureText(getContext().getString(R.string.byt)) >= 110.0f) {
                a(R.style.xw);
                return;
            }
            return;
        }
        super.setFollowButtonTextAndIcon(i2);
        a(R.style.y2);
    }

    public I18nFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        a(R.style.y2);
        super.a(i2, i3);
    }
}
