package com.ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

public abstract class bp implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final long f142685a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f142686b;

    /* renamed from: h  reason: collision with root package name */
    public boolean f142687h;

    static {
        Covode.recordClassIndex(93348);
    }

    public abstract void a(View view);

    public bp() {
        this(300);
    }

    public bp(long j2) {
        this.f142687h = true;
        this.f142686b = new Runnable() {
            /* class com.ss.android.ugc.aweme.utils.bp.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93349);
            }

            public final void run() {
                bp.this.f142687h = true;
            }
        };
        this.f142685a = j2;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f142687h) {
            this.f142687h = false;
            view.postDelayed(this.f142686b, this.f142685a);
            a(view);
        }
    }
}
