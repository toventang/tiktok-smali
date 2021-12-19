package com.bytedance.android.live.core.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public class StateLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9289a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9290b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, View> f9291c;

    /* renamed from: d  reason: collision with root package name */
    private Map<View, String> f9292d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, a> f9293e;

    /* renamed from: f  reason: collision with root package name */
    private String f9294f;

    /* renamed from: g  reason: collision with root package name */
    private View f9295g;

    /* renamed from: h  reason: collision with root package name */
    private View f9296h;

    /* renamed from: i  reason: collision with root package name */
    private View f9297i;

    /* renamed from: j  reason: collision with root package name */
    private View f9298j;

    /* renamed from: k  reason: collision with root package name */
    private TransitionSet f9299k;

    /* renamed from: l  reason: collision with root package name */
    private TransitionSet f9300l;

    public interface a {
        static {
            Covode.recordClassIndex(4748);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(4747);
    }

    public void setInTransition(TransitionSet transitionSet) {
        this.f9299k = transitionSet;
    }

    public void setOutTransition(TransitionSet transitionSet) {
        this.f9300l = transitionSet;
    }

    public void setContentView(View view) {
        a("CONTENT", view);
    }

    public void setContentViewSrc(int i2) {
        a("CONTENT", i2);
    }

    public void setEmptyView(View view) {
        a("EMPTY", view);
    }

    public void setEmptyViewSrc(int i2) {
        a("EMPTY", i2);
    }

    public void setErrorView(View view) {
        a("ERROR", view);
    }

    public void setErrorViewSrc(int i2) {
        a("ERROR", i2);
    }

    public void setLoadingView(View view) {
        a("LOADING", view);
    }

    public void setLoadingViewSrc(int i2) {
        a("LOADING", i2);
    }

    public void setOfflineView(View view) {
        a("OFFLINE", view);
    }

    public void setOfflineViewSrc(int i2) {
        a("OFFLINE", i2);
    }

    public void onClick(View view) {
        a aVar = this.f9293e.get(this.f9292d.get(view));
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setEmptyClickListener(a aVar) {
        this.f9293e.put("EMPTY", aVar);
        View view = this.f9296h;
        if (view != null) {
            view.setOnClickListener(this);
            this.f9292d.put(this.f9296h, "EMPTY");
        } else if (this.f9291c.containsKey("EMPTY")) {
            this.f9291c.get("EMPTY").setOnClickListener(this);
            this.f9292d.put(this.f9291c.get("EMPTY"), "EMPTY");
        }
    }

    public void setErrorClickListener(a aVar) {
        this.f9293e.put("ERROR", aVar);
        View view = this.f9297i;
        if (view != null) {
            view.setOnClickListener(this);
            this.f9292d.put(this.f9297i, "ERROR");
        } else if (this.f9291c.containsKey("ERROR")) {
            this.f9291c.get("ERROR").setOnClickListener(this);
            this.f9292d.put(this.f9291c.get("ERROR"), "ERROR");
        }
    }

    public void setOfflineClickListener(a aVar) {
        this.f9293e.put("OFFLINE", aVar);
        View view = this.f9298j;
        if (view != null) {
            view.setOnClickListener(this);
            this.f9292d.put(this.f9298j, "OFFLINE");
        } else if (this.f9291c.containsKey("OFFLINE")) {
            this.f9291c.get("OFFLINE").setOnClickListener(this);
            this.f9292d.put(this.f9291c.get("OFFLINE"), "OFFLINE");
        }
    }

    public final void a(String str) {
        if (!str.equals(this.f9294f)) {
            if (this.f9291c.containsKey(this.f9294f)) {
                if (this.f9290b && this.f9300l != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.f9300l).addTarget(this.f9291c.get(this.f9294f)));
                }
                this.f9291c.get(this.f9294f).setVisibility(8);
            }
            if (this.f9291c.containsKey(str)) {
                if (this.f9289a && this.f9299k != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.f9299k).addTarget(this.f9291c.get(str)));
                }
                this.f9291c.get(str).setVisibility(0);
            }
            this.f9294f = str;
        }
    }

    public StateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(String str, View view) {
        this.f9291c.put(str, view);
        view.setVisibility(8);
        if (view.getParent() != this) {
            addView(view);
            if (this.f9293e.containsKey(str)) {
                view.setOnClickListener(this);
            }
        }
    }

    public final void a(String str, int i2) {
        if (i2 == -1) {
            a(str, this.f9295g);
        } else {
            a(str, com.a.a(LayoutInflater.from(getContext()), i2, this, false));
        }
    }

    private StateLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9985);
        this.f9291c = new androidx.c.a();
        this.f9292d = new androidx.c.a();
        this.f9293e = new androidx.c.a();
        this.f9295g = new FrameLayout(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.px, R.attr.sj, R.attr.sk, R.attr.t7, R.attr.t_, R.attr.a3n, R.attr.a6i, R.attr.a6j, R.attr.asp, R.attr.asr}, 0, 0);
        setLoadingViewSrc(obtainStyledAttributes.getResourceId(5, -1));
        setContentViewSrc(obtainStyledAttributes.getResourceId(0, -1));
        setEmptyViewSrc(obtainStyledAttributes.getResourceId(2, -1));
        setErrorViewSrc(obtainStyledAttributes.getResourceId(4, -1));
        setOfflineViewSrc(obtainStyledAttributes.getResourceId(7, -1));
        this.f9296h = findViewById(obtainStyledAttributes.getResourceId(1, 0));
        this.f9297i = findViewById(obtainStyledAttributes.getResourceId(3, 0));
        this.f9298j = findViewById(obtainStyledAttributes.getResourceId(6, 0));
        this.f9289a = obtainStyledAttributes.getBoolean(8, true);
        this.f9290b = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        int i2 = Build.VERSION.SDK_INT;
        this.f9299k = new TransitionSet().addTransition(new Fade(1)).setDuration(300L).setInterpolator((TimeInterpolator) new AccelerateInterpolator());
        this.f9300l = new TransitionSet().addTransition(new Fade(2)).setDuration(300L).setInterpolator((TimeInterpolator) new DecelerateInterpolator());
        MethodCollector.o(9985);
    }
}
