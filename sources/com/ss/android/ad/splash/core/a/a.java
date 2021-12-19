package com.ss.android.ad.splash.core.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public abstract class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private long f58297a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58298b;

    static {
        Covode.recordClassIndex(36215);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public a() {
        this((byte) 0);
    }

    private a(byte b2) {
        this.f58298b = true;
        this.f58297a = 500;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f58298b) {
            this.f58298b = false;
            view.postDelayed(new Runnable() {
                /* class com.ss.android.ad.splash.core.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36216);
                }

                public final void run() {
                    a.this.f58298b = true;
                }
            }, this.f58297a);
            a();
        }
    }
}
