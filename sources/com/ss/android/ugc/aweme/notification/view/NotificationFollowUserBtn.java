package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.utils.hu;
import com.zhiliaoapp.musically.R;
import h.m.p;

public class NotificationFollowUserBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    private static final int f113924a = ((int) n.b(d.a(), 12.0f));

    /* renamed from: g  reason: collision with root package name */
    private static final int f113925g = ((int) n.b(d.a(), 4.0f));

    /* renamed from: h  reason: collision with root package name */
    private boolean f113926h;

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void a() {
        setDoubleFollowButtonText(null);
    }

    static {
        Covode.recordClassIndex(73255);
    }

    private void d() {
        if (this.f96597b != null) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            int i2 = f113924a;
            niceWidthTextView.setPadding(i2, 0, i2, 0);
            hu.a(this.f96597b, 10, 14, g.a(getContext()));
            this.f96597b.setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.rebranding.b, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final int a(TextView textView) {
        return g.a(textView.getContext());
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public void setDoubleFollowButtonText(String str) {
        String str2;
        if (!b() || !this.f113926h) {
            super.a();
            return;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (str == null || p.g(str) == null) {
            str2 = getResources().getString(R.string.d3z);
        } else if (createIIMServicebyMonsterPlugin != null) {
            str2 = createIIMServicebyMonsterPlugin.getEntranceButtonText(getContext(), str);
        } else {
            str2 = getResources().getString(R.string.d3z);
        }
        this.f96597b.setText(str2);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public void setFollowButtonTextAndIcon(int i2) {
        if (i2 != 1) {
            super.setFollowButtonTextAndIcon(i2);
        } else if (getResources() != null) {
            this.f96597b.setText(getResources().getText(R.string.byt));
        } else {
            return;
        }
        d();
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        a(i2, i3, null);
    }

    private NotificationFollowUserBtn(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sm});
        this.f113926h = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!this.f113926h && com.ss.android.ugc.aweme.im.service.c.d.b()) {
            this.f113926h = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3, String str) {
        super.a(i2, i3, str);
        d();
        int i4 = f113925g;
        b(i4, i4);
    }
}
