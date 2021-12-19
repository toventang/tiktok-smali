package com.bytedance.android.live.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    List<View> f12912a;

    /* renamed from: b  reason: collision with root package name */
    int f12913b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12914c;

    static {
        Covode.recordClassIndex(7166);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f12915a;

        /* renamed from: b  reason: collision with root package name */
        public View f12916b;

        /* renamed from: c  reason: collision with root package name */
        public View f12917c;

        /* renamed from: d  reason: collision with root package name */
        public View f12918d;

        static {
            Covode.recordClassIndex(7167);
        }

        private LiveLoadingView b() {
            return new LiveLoadingView(this.f12915a);
        }

        private a a() {
            this.f12916b = c(R.string.gs3);
            return this;
        }

        public a(Context context) {
            if (context != null) {
                this.f12915a = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        public static a a(Context context) {
            return new a(context).b(R.string.glw).a().a(R.string.gm3, null);
        }

        private View c(int i2) {
            MethodCollector.i(11935);
            TextView textView = (TextView) LayoutInflater.from(this.f12915a).inflate(R.layout.bcd, (ViewGroup) null);
            textView.setText(i2);
            MethodCollector.o(11935);
            return textView;
        }

        public final a b(int i2) {
            MethodCollector.i(11773);
            TextView textView = (TextView) LayoutInflater.from(this.f12915a).inflate(R.layout.bce, (ViewGroup) null);
            textView.setText(i2);
            this.f12917c = textView;
            MethodCollector.o(11773);
            return this;
        }

        public final a a(int i2) {
            LiveLoadingView b2 = b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i2;
            layoutParams.width = i2;
            layoutParams.gravity = 17;
            b2.setLayoutParams(layoutParams);
            this.f12916b = b2;
            return this;
        }

        public final a a(int i2, View.OnClickListener onClickListener) {
            View c2 = c(i2);
            c2.setOnClickListener(onClickListener);
            this.f12918d = c2;
            return this;
        }
    }

    public final void a() {
        int i2 = this.f12913b;
        if (i2 != -1) {
            this.f12912a.get(i2).setVisibility(4);
            this.f12913b = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    public void setStatus(int i2) {
        int i3 = this.f12913b;
        if (i3 != i2) {
            if (i3 >= 0) {
                this.f12912a.get(i3).setVisibility(4);
            }
            if (this.f12912a.get(i2) != null) {
                this.f12912a.get(i2).setVisibility(0);
                this.f12913b = i2;
                com.bytedance.android.live.core.c.a.a(3, this.f12914c, "setStatus    ".concat(String.valueOf(i2)));
            }
        }
    }

    public void setBuilder(a aVar) {
        MethodCollector.i(11939);
        if (aVar == null) {
            aVar = a.a(getContext());
        }
        this.f12912a.clear();
        this.f12912a.add(aVar.f12916b);
        this.f12912a.add(aVar.f12917c);
        this.f12912a.add(aVar.f12918d);
        removeAllViews();
        for (int i2 = 0; i2 < this.f12912a.size(); i2++) {
            View view = this.f12912a.get(i2);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
        MethodCollector.o(11939);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadingStatusView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(11937);
        this.f12914c = LoadingStatusView.class.getSimpleName();
        this.f12912a = new ArrayList(3);
        this.f12913b = -1;
        setBuilder(null);
        MethodCollector.o(11937);
    }
}
