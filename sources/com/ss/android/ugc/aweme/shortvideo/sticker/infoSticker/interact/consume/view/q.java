package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class q extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f130633a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f130634b;

    static {
        Covode.recordClassIndex(85654);
    }

    public final void setSelect(boolean z) {
        if (z) {
            TextView textView = this.f130633a;
            if (textView != null) {
                textView.setTextColor(b.c(getContext(), R.color.c0));
            }
            TextView textView2 = this.f130634b;
            if (textView2 != null) {
                textView2.setTextColor(b.c(getContext(), R.color.c0));
                return;
            }
            return;
        }
        TextView textView3 = this.f130633a;
        if (textView3 != null) {
            textView3.setTextColor(b.c(getContext(), R.color.c2));
        }
        TextView textView4 = this.f130634b;
        if (textView4 != null) {
            textView4.setTextColor(b.c(getContext(), R.color.c2));
        }
    }

    public final void a(String str, long j2) {
        l.d(str, "");
        TextView textView = this.f130634b;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f130633a;
        if (textView2 != null) {
            textView2.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
        }
    }

    public q(Context context, boolean z) {
        super(context);
        View a2;
        TextView textView;
        MethodCollector.i(1619);
        if (z) {
            a2 = a.a(LayoutInflater.from(getContext()), R.layout.bjv, this, false);
        } else {
            a2 = a.a(LayoutInflater.from(getContext()), R.layout.bjx, this, false);
        }
        TextView textView2 = null;
        if (a2 != null) {
            textView = (TextView) a2.findViewById(R.id.exo);
        } else {
            textView = null;
        }
        this.f130633a = textView;
        this.f130634b = a2 != null ? (TextView) a2.findViewById(R.id.f3y) : textView2;
        addView(a2);
        MethodCollector.o(1619);
    }
}
