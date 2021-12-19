package com.ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    View f78572a;

    /* renamed from: b  reason: collision with root package name */
    TextView f78573b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f78574c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f78575d;

    static {
        Covode.recordClassIndex(48792);
    }

    public u(Context context) {
        l.d(context, "");
        MethodCollector.i(12927);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aip, (ViewGroup) null);
        this.f78573b = (TextView) inflate.findViewById(R.id.exf);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dp0);
        this.f78575d = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.cbu);
        }
        this.f78572a = inflate;
        MethodCollector.o(12927);
    }
}
