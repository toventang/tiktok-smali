package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Context f105723a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f105724b;

    static {
        Covode.recordClassIndex(67697);
    }

    public final void a() {
        Resources resources;
        Context context = this.f105723a;
        if (context != null && (resources = context.getResources()) != null) {
            setTextColor(resources.getColor(R.color.bx));
        }
    }

    public final void setTextColor(int i2) {
        TextView textView = this.f105724b;
        if (textView == null) {
            l.a("textView");
        }
        textView.setTextColor(i2);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f105724b;
            if (textView == null) {
                l.a("textView");
            }
            textView.setText(str);
        }
    }

    public p(Context context) {
        super(context, null, 0);
        MethodCollector.i(12763);
        this.f105723a = context;
        View findViewById = a.a(LayoutInflater.from(context), R.layout.aac, this, true).findViewById(R.id.dwb);
        l.b(findViewById, "");
        this.f105724b = (TextView) findViewById;
        MethodCollector.o(12763);
    }
}
