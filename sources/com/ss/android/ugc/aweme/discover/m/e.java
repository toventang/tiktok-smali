package com.ss.android.ugc.aweme.discover.m;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public abstract class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private long f81626a;

    /* renamed from: b  reason: collision with root package name */
    private final long f81627b;

    static {
        Covode.recordClassIndex(50720);
    }

    public e(char c2) {
        this((byte) 0);
    }

    public abstract void a();

    private e() {
        this.f81627b = 500;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (System.currentTimeMillis() - this.f81626a >= this.f81627b) {
            this.f81626a = System.currentTimeMillis();
            a();
        }
    }
}
