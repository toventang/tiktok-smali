package com.ss.android.ugc.aweme.account.login;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.uikit.b.c;
import com.zhiliaoapp.musically.R;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    protected int f63374a;

    /* renamed from: b  reason: collision with root package name */
    protected View f63375b;

    /* renamed from: c  reason: collision with root package name */
    protected View f63376c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f63377d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f63378e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f63379f;

    /* renamed from: g  reason: collision with root package name */
    protected ProgressBar f63380g;

    /* renamed from: h  reason: collision with root package name */
    protected c f63381h;

    static {
        Covode.recordClassIndex(39059);
    }

    /* access modifiers changed from: protected */
    public int a() {
        return R.layout.g2;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            finish();
        }
    }

    public void b() {
        this.f63375b = findViewById(R.id.dqn);
        View findViewById = findViewById(R.id.em8);
        this.f63376c = findViewById;
        if (findViewById != null) {
            this.f63377d = (TextView) findViewById.findViewById(R.id.q9);
            this.f63378e = (TextView) this.f63376c.findViewById(R.id.dno);
            this.f63379f = (TextView) this.f63376c.findViewById(R.id.title);
            this.f63380g = (ProgressBar) this.f63376c.findViewById(R.id.dnl);
        }
        TextView textView = this.f63377d;
        if (textView != null) {
            int i2 = Build.VERSION.SDK_INT;
            Drawable background = textView.getBackground();
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (background != null) {
                background.setAutoMirrored(true);
            }
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setAutoMirrored(true);
                }
            }
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setAutoMirrored(true);
                }
            }
            this.f63377d.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.account.login.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39060);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    b.this.onBackPressed();
                }
            });
        }
        View findViewById2 = findViewById(R.id.egf);
        if (findViewById2 != null && (findViewById2 instanceof c)) {
            this.f63381h = (c) findViewById2;
        }
        c cVar = this.f63381h;
        if (cVar != null) {
            cVar.setOnSwipeListener(new c.a() {
                /* class com.ss.android.ugc.aweme.account.login.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(39061);
                }
            });
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f63379f;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        activityConfiguration(c.f63387a);
        this.f63374a = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(a());
        b();
    }
}
