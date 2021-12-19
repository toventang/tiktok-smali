package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class AvatarImageWithLive extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private SmartAvatarBorderView f91450a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f91451b;

    static {
        Covode.recordClassIndex(57538);
    }

    public SmartAvatarBorderView getAvatarImageView() {
        return this.f91450a;
    }

    private RelativeLayout.LayoutParams getAvatarLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private String a() {
        try {
            return LiveOuterService.s().d().r().a(this.f91451b.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean b() {
        try {
            return LiveOuterService.s().d().s().a();
        } catch (Exception unused) {
            return false;
        }
    }

    private void c() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "homepage_hot");
            if ("LIVE".equals(a())) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_english", str);
            LiveOuterService.s().d().r().a("livesdk_live_show_language", hashMap);
        } catch (Exception unused) {
        }
    }

    private RelativeLayout.LayoutParams getLiveLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a(29), a(12));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        layoutParams.topMargin = a(1);
        return layoutParams;
    }

    public AvatarImageWithLive(Context context) {
        this(context, null);
    }

    public void setBorderColor(int i2) {
        SmartAvatarBorderView smartAvatarBorderView = this.f91450a;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setBorderColor(i2);
        }
    }

    private int a(int i2) {
        return (int) n.b(getContext(), (float) i2);
    }

    public final void a(boolean z) {
        if (!z) {
            this.f91451b.setVisibility(8);
            LivePerformanceManager.getInstance().resetInitValue();
            return;
        }
        this.f91451b.setVisibility(0);
        try {
            if (b()) {
                b(true);
                this.f91451b.setBackgroundResource(2131233158);
            } else {
                b(false);
                this.f91451b.setBackgroundResource(2131231738);
            }
        } catch (Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
        h.a(b.f92648a);
    }

    private void b(boolean z) {
        if (z) {
            this.f91451b.setText(a());
            this.f91451b.setTextColor(-1);
            this.f91451b.setMaxLines(1);
            this.f91451b.setEllipsize(TextUtils.TruncateAt.END);
            this.f91451b.setPadding(a(2), 0, a(2), 0);
            this.f91451b.setGravity(17);
            androidx.core.widget.h.b(this.f91451b, 1);
            androidx.core.widget.h.a(this.f91451b, 6, 9, 1, 2);
            c();
            return;
        }
        androidx.core.widget.h.b(this.f91451b, 0);
        this.f91451b.setText("");
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AvatarImageWithLive(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(5460);
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(getContext());
        this.f91450a = smartAvatarBorderView;
        ((a) smartAvatarBorderView.getHierarchy()).a(R.color.f159926j, q.b.f47442h);
        addView(this.f91450a, getAvatarLayoutParams());
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f91451b = appCompatTextView;
        appCompatTextView.setVisibility(8);
        addView(this.f91451b, getLiveLayoutParams());
        MethodCollector.o(5460);
    }
}
