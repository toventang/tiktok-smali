package com.ss.android.ugc.aweme.views;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public abstract class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final long f144606a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f144607b;

    /* renamed from: f  reason: collision with root package name */
    boolean f144608f;

    static {
        Covode.recordClassIndex(94623);
    }

    public abstract void a(View view);

    public d() {
        this(300);
    }

    public d(long j2) {
        this.f144608f = true;
        this.f144607b = new e(this);
        this.f144606a = j2;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f144608f) {
            this.f144608f = false;
            view.postDelayed(this.f144607b, this.f144606a);
            a(view);
        }
    }
}
