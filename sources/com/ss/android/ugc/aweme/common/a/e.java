package com.ss.android.ugc.aweme.common.a;

import android.graphics.drawable.Animatable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.f.a.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.performance.i;

public abstract class e<T> extends RecyclerView.ViewHolder implements g {

    /* renamed from: m  reason: collision with root package name */
    public T f76353m;
    public SmartImageView n;
    protected boolean o;
    public boolean p = true;

    static {
        Covode.recordClassIndex(47122);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final boolean aZ_() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void ak_() {
        this.n.c();
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void am_() {
        this.n.b();
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void al_() {
        SmartImageView smartImageView = this.n;
        if (smartImageView != null && smartImageView.getController() != null && this.n.getController().i() != null) {
            Animatable i2 = this.n.getController().i();
            if (i2 instanceof a) {
                ((a) i2).a();
            }
        }
    }

    public final boolean C() {
        boolean z;
        if (i.a()) {
            return false;
        }
        this.itemView.getContext();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = f();
        }
        if (!j.f107226e || com.ss.android.ugc.aweme.framework.c.a.a(this.itemView.getContext())) {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover", z)) {
                return true;
            }
        }
        return false;
    }

    public e(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public void b(boolean z) {
        this.n.setAttached(z);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void a(boolean z) {
        this.n.setUserVisibleHint(z);
    }

    public void a(T t, int i2) {
        this.n.setUserVisibleHint(false);
    }

    public static void a(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.width != i2 || marginLayoutParams.height != i3) {
            marginLayoutParams.width = i2;
            marginLayoutParams.height = i3;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
