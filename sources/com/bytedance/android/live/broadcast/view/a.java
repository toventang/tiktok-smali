package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f8677a;

    static {
        Covode.recordClassIndex(4445);
    }

    private View a(int i2) {
        if (this.f8677a == null) {
            this.f8677a = new HashMap();
        }
        View view = (View) this.f8677a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f8677a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void setArrowVisibility(int i2) {
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) a(R.id.lk);
        l.b(liveAutoRtlImageView, "");
        liveAutoRtlImageView.setVisibility(i2);
    }

    public final void setNotifyText(CharSequence charSequence) {
        l.d(charSequence, "");
        LiveTextView liveTextView = (LiveTextView) a(R.id.cya);
        l.b(liveTextView, "");
        liveTextView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(6070);
        p.a((ViewGroup) this, (int) R.layout.bdg, true);
        LiveTextView liveTextView = (LiveTextView) a(R.id.cya);
        liveTextView.setMovementMethod(LinkMovementMethod.getInstance());
        liveTextView.setHighlightColor(0);
        MethodCollector.o(6070);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
