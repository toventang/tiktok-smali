package com.ss.android.ugc.aweme.friends.invite;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.core.widget.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.c;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class I18nFollowAndInviteUserBtn extends FollowUserBtn {

    /* renamed from: g  reason: collision with root package name */
    public static final a f96899g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f96900a = b();

    static {
        Covode.recordClassIndex(61487);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61488);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void a() {
        if (this.f96900a) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.d3z));
            return;
        }
        super.a();
    }

    public final void d() {
        setVisibility(0);
        this.f96597b.setTextColor(b.c(getContext(), R.color.a9));
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getString(R.string.coh));
        NiceWidthTextView niceWidthTextView2 = this.f96597b;
        l.b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.a9r));
        this.f96598c = 1000;
    }

    public final void e() {
        setVisibility(0);
        this.f96597b.setTextColor(b.c(getContext(), R.color.bx));
        NiceWidthTextView niceWidthTextView = this.f96597b;
        l.b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getString(R.string.coy));
        NiceWidthTextView niceWidthTextView2 = this.f96597b;
        l.b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.azt));
        this.f96598c = 1001;
    }

    public final void setShowMessage(boolean z) {
        this.f96900a = z;
    }

    private final void a(int i2) {
        if (this.f96597b != null) {
            h.a(this.f96597b, i2);
            this.f96597b.setPadding(8, 0, 8, 0);
            this.f96597b.setFontType(d.f33801g);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final int a(TextView textView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.c06));
        arrayList.add(Integer.valueOf((int) R.string.bbg));
        arrayList.add(Integer.valueOf((int) R.string.bzw));
        arrayList.add(Integer.valueOf((int) R.string.bbi));
        arrayList.add(Integer.valueOf((int) R.string.byt));
        int a2 = c.a(textView, arrayList, (int) n.b(getContext(), 64.0f), (int) n.b(getContext(), 120.0f));
        if (a2 > this.f96601f) {
            return a2;
        }
        return this.f96601f;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i2) {
        if (i2 == 1) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.byt));
            Paint paint = new Paint();
            paint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
            if (paint.measureText(getContext().getString(R.string.byt)) >= 110.0f) {
                a(R.style.xw);
                return;
            }
            return;
        }
        super.setFollowButtonTextAndIcon(i2);
        a(R.style.y2);
    }

    public I18nFollowAndInviteUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        a(R.style.y2);
        super.a(i2, i3);
    }
}
