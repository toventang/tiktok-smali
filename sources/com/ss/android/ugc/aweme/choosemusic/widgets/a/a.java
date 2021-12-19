package com.ss.android.ugc.aweme.choosemusic.widgets.a;

import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.base.utils.m;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f71063a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f71064b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71065c;

    static {
        Covode.recordClassIndex(43743);
    }

    public static a a(View.OnClickListener onClickListener) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        return new a(onClickListener, z);
    }

    public final void onClick(final View view) {
        ClickAgent.onClick(view);
        if (!this.f71065c) {
            this.f71064b.onClick(view);
        } else if (!this.f71063a) {
            this.f71063a = true;
            m.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.choosemusic.widgets.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43744);
                }

                public final void run() {
                    a.this.f71064b.onClick(view);
                    a.this.f71063a = false;
                }
            }, (long) h.a(d.a().getResources()));
        }
    }

    private a(View.OnClickListener onClickListener, boolean z) {
        this.f71064b = onClickListener;
        this.f71065c = z;
    }
}
