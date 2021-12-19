package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.b;
import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.u;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class h extends Button {

    /* renamed from: a  reason: collision with root package name */
    final WeakReference<Activity> f155939a;

    /* renamed from: b  reason: collision with root package name */
    volatile TwitterAuthClient f155940b;

    /* renamed from: c  reason: collision with root package name */
    View.OnClickListener f155941c;

    /* renamed from: d  reason: collision with root package name */
    b<u> f155942d;

    static {
        Covode.recordClassIndex(103610);
    }

    public b<u> getCallback() {
        return this.f155942d;
    }

    public TwitterAuthClient getTwitterAuthClient() {
        MethodCollector.i(11792);
        if (this.f155940b == null) {
            synchronized (h.class) {
                try {
                    if (this.f155940b == null) {
                        this.f155940b = new TwitterAuthClient();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11792);
                    throw th;
                }
            }
        }
        TwitterAuthClient twitterAuthClient = this.f155940b;
        MethodCollector.o(11792);
        return twitterAuthClient;
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextThemeWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextThemeWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f155941c = onClickListener;
    }

    class a implements View.OnClickListener {
        static {
            Covode.recordClassIndex(103611);
        }

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
            if (r5.f155919b.a(r4, new com.twitter.sdk.android.core.identity.g(r5.f155921d, r3)) == false) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.identity.h.a.onClick(android.view.View):void");
        }

        /* synthetic */ a(h hVar, byte b2) {
            this();
        }
    }

    public h(Context context) {
        this(context, (byte) 0);
    }

    public void setCallback(b<u> bVar) {
        if (bVar != null) {
            this.f155942d = bVar;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    private h(Context context, byte b2) {
        this(context, (char) 0);
    }

    private h(Context context, char c2) {
        this(context, (AttributeSet) null);
    }

    private h(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
        MethodCollector.i(11633);
        this.f155939a = new WeakReference<>(getActivity());
        this.f155940b = null;
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(2131234899), (Drawable) null, (Drawable) null, (Drawable) null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(2131166195));
        super.setText(R.string.h0a);
        super.setTextColor(resources.getColor(R.color.a2_));
        super.setTextSize(0, (float) resources.getDimensionPixelSize(2131166200));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(2131166197), 0, resources.getDimensionPixelSize(2131166199), 0);
        super.setBackgroundResource(R.drawable.cb3);
        super.setOnClickListener(new a(this, (byte) 0));
        if (Build.VERSION.SDK_INT >= 21) {
            super.setAllCaps(false);
        }
        if (!isInEditMode()) {
            try {
                q.a();
                MethodCollector.o(11633);
                return;
            } catch (IllegalStateException e2) {
                f c2 = k.c();
                e2.getMessage();
                c2.d();
                setEnabled(false);
            }
        }
        MethodCollector.o(11633);
    }
}
