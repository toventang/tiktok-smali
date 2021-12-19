package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.utils.hu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VideoTitleFollowBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static final a f94202a = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private int f94203g = 14;

    /* renamed from: h  reason: collision with root package name */
    private int f94204h = 10;

    static {
        Covode.recordClassIndex(59852);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59853);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static /* synthetic */ void a(VideoTitleFollowBtn videoTitleFollowBtn) {
        videoTitleFollowBtn.a(com.ss.android.ugc.aweme.utils.e.a.a(videoTitleFollowBtn.getContext()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoTitleFollowBtn(Context context) {
        super(context);
        l.d(context, "");
        this.f96600e = a(this.f96597b);
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final int a(TextView textView) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return h.g.a.a(TypedValue.applyDimension(1, 88.0f, system.getDisplayMetrics()));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i2) {
        if (i2 != 1) {
            super.setFollowButtonTextAndIcon(i2);
        } else if (getResources() != null) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.byt));
        } else {
            return;
        }
        a(this);
    }

    private void a(int i2) {
        if (this.f96597b != null) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            i.a((View) niceWidthTextView, valueOf, (Integer) null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), (Integer) null, false, 16);
            NiceWidthTextView niceWidthTextView2 = this.f96597b;
            l.b(niceWidthTextView2, "");
            hu.a(niceWidthTextView2, this.f94204h, this.f94203g, i2);
            this.f96597b.setFontType(d.f33801g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoTitleFollowBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        this.f96600e = a(this.f96597b);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        if (i2 == 1 || i2 == 2) {
            this.f96597b.setTextColor(b.c(getContext(), R.color.a9));
            this.f96597b.setBackground(getResources().getDrawable(R.drawable.um));
        }
        a(this);
    }
}
