package com.bytedance.ies.bullet.ui.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f33128a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f33129b;

    static {
        Covode.recordClassIndex(19791);
    }

    public final View a(int i2) {
        if (this.f33129b == null) {
            this.f33129b = new HashMap();
        }
        View view = (View) this.f33129b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f33129b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final View getTitlebarRootView() {
        return this.f33128a;
    }

    public final void setTitlebarRootView(View view) {
        l.c(view, "");
        this.f33128a = view;
    }

    public final void setBackListener(View.OnClickListener onClickListener) {
        l.c(onClickListener, "");
        ((AutoRTLImageView) a(R.id.bu7)).setOnClickListener(onClickListener);
    }

    public final void setCloseAllListener(View.OnClickListener onClickListener) {
        l.c(onClickListener, "");
        ((AutoRTLImageView) a(R.id.bvf)).setOnClickListener(onClickListener);
    }

    public final void setEnableReFresh(boolean z) {
        int i2;
        Button button = (Button) a(R.id.zd);
        l.a((Object) button, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        button.setVisibility(i2);
    }

    public final void setRefreshListener(View.OnClickListener onClickListener) {
        l.c(onClickListener, "");
        ((Button) a(R.id.zd)).setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(11892);
        View a2 = a.a(LayoutInflater.from(context), R.layout.ma, this, true);
        l.a((Object) a2, "");
        this.f33128a = a2;
        MethodCollector.o(11892);
    }

    public final void setTitleIfMissing(CharSequence charSequence) {
        l.c(charSequence, "");
        TextView textView = (TextView) a(R.id.f9l);
        l.a((Object) textView, "");
        CharSequence text = textView.getText();
        l.a((Object) text, "");
        if (text.length() == 0) {
            TextView textView2 = (TextView) a(R.id.f9l);
            l.a((Object) textView2, "");
            textView2.setText(charSequence);
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
