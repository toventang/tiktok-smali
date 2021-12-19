package com.bytedance.android.livesdk.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f21772a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f21773b;

    static {
        Covode.recordClassIndex(12831);
    }

    private View a(int i2) {
        if (this.f21773b == null) {
            this.f21773b = new HashMap();
        }
        View view = (View) this.f21773b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f21773b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final c a() {
        if (a(R.id.chq) != null) {
            ImageView imageView = (ImageView) a(R.id.chq);
            l.b(imageView, "");
            imageView.setVisibility(0);
            ((ImageView) a(R.id.chq)).setImageResource(2131234680);
        } else {
            ImageView imageView2 = (ImageView) a(R.id.chq);
            l.b(imageView2, "");
            imageView2.setVisibility(8);
        }
        return this;
    }

    public final c a(String str) {
        if (a(R.id.chr) != null) {
            LiveTextView liveTextView = (LiveTextView) a(R.id.chr);
            l.b(liveTextView, "");
            liveTextView.setText(str);
        }
        return this;
    }

    public final c b(String str) {
        LiveTextView liveTextView = (LiveTextView) a(R.id.cht);
        l.b(liveTextView, "");
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.cht);
        l.b(liveTextView2, "");
        liveTextView2.setVisibility(0);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(11256);
        a.a(LayoutInflater.from(getContext()), R.layout.bcf, this, true);
        this.f21772a = (TextView) findViewById(R.id.chs);
        MethodCollector.o(11256);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
