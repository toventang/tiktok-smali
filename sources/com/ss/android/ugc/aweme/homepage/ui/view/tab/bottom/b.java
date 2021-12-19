package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.a;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

public final class b extends d {

    /* renamed from: h  reason: collision with root package name */
    private boolean f99582h;

    /* renamed from: i  reason: collision with root package name */
    private View f99583i;

    /* renamed from: j  reason: collision with root package name */
    private int f99584j;

    /* renamed from: k  reason: collision with root package name */
    private ProgressBar f99585k;

    /* renamed from: l  reason: collision with root package name */
    private a f99586l;

    static {
        Covode.recordClassIndex(63500);
    }

    private void w() {
        ProgressBar progressBar = this.f99585k;
        if (progressBar != null) {
            progressBar.setProgress(this.f99584j);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a, com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d
    public final void o() {
        if (!this.f99582h) {
            super.o();
        }
        v();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d
    public final View a() {
        if (!this.f99582h) {
            return super.a();
        }
        v();
        return super.a();
    }

    private void v() {
        if (this.f99582h) {
            if (this.f99583i == null) {
                View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.a3k, this, false);
                this.f99583i = a2;
                addView(a2);
                this.f99585k = (ProgressBar) this.f99583i.findViewById(R.id.ahn);
            }
            this.f99583i.setVisibility(0);
            w();
            if (this.f99587c != null) {
                this.f99587c.setVisibility(4);
            }
            if (this.f99588d != null) {
                this.f99588d.setVisibility(4);
            }
            if (this.f99589e != null) {
                this.f99589e.setVisibility(4);
                return;
            }
            return;
        }
        View view = this.f99583i;
        if (view != null) {
            view.setVisibility(8);
        }
        super.o();
        if (this.f99587c != null) {
            this.f99587c.setVisibility(0);
        }
        if (this.f99588d != null) {
            this.f99588d.setVisibility(0);
        }
    }

    public final void setPublishAnim(a aVar) {
        this.f99586l = aVar;
    }

    public final void setProgress(int i2) {
        this.f99584j = i2;
        w();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d
    public final void a(View view, int i2, Callable<View> callable) {
        if (this.f99582h && i2 == 0) {
            i2 = 4;
        }
        super.a(view, i2, callable);
    }

    public b(Context context, String str, boolean z, boolean z2, int i2) {
        super(context, str, z, z2, i2);
    }
}
