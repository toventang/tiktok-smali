package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f99548a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f99549b;

    /* renamed from: c  reason: collision with root package name */
    private String f99550c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f99551d;

    static {
        Covode.recordClassIndex(63486);
    }

    public abstract void a(int i2);

    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    public abstract void f();

    /* access modifiers changed from: protected */
    public abstract void g();

    public ImageView getRefreshIcon() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    /* access modifiers changed from: protected */
    public void q() {
    }

    public void setActivated(boolean z) {
    }

    public String getTabType() {
        return this.f99550c;
    }

    public boolean isSelected() {
        return this.f99551d;
    }

    public final void b() {
        setSelected(false);
        if (this.f99548a) {
            d();
        } else {
            c();
        }
    }

    public final void e() {
        setSelected(true);
        if (this.f99548a) {
            g();
        } else {
            f();
        }
    }

    public final void h() {
        if (!this.f99548a) {
            this.f99548a = true;
            i();
        }
    }

    public void setRefreshing(boolean z) {
        this.f99548a = z;
    }

    public void setSelected(boolean z) {
        this.f99551d = z;
    }

    public final void a(String str) {
        int i2;
        if (getRefreshIcon() != null) {
            ImageView refreshIcon = getRefreshIcon();
            Resources resources = getResources();
            if ("HOME".equals(str)) {
                i2 = R.color.a9;
            } else {
                i2 = R.color.bx;
            }
            refreshIcon.setColorFilter(resources.getColor(i2));
        }
    }

    public a(Context context, String str) {
        super(context);
        this.f99550c = str;
    }

    public final void a(boolean z, int i2) {
        if (z) {
            a(i2);
        } else {
            k();
        }
    }
}
