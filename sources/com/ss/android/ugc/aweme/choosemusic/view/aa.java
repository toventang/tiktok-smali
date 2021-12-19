package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aa extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Context f70781a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f70782b;

    static {
        Covode.recordClassIndex(43625);
    }

    public final void a() {
        Resources resources;
        Context context = this.f70781a;
        if (context != null && (resources = context.getResources()) != null) {
            setTextColor(resources.getColor(R.color.bx));
        }
    }

    public final void setTextColor(int i2) {
        TuxTextView tuxTextView = this.f70782b;
        if (tuxTextView == null) {
            l.a("textView");
        }
        tuxTextView.setTextColor(i2);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.f70782b;
            if (tuxTextView == null) {
                l.a("textView");
            }
            tuxTextView.setText(str);
        }
    }

    public aa(Context context) {
        super(context, null, 0);
        MethodCollector.i(3091);
        this.f70781a = context;
        View findViewById = a.a(LayoutInflater.from(context), R.layout.aac, this, true).findViewById(R.id.dwb);
        l.b(findViewById, "");
        this.f70782b = (TuxTextView) findViewById;
        MethodCollector.o(3091);
    }
}
