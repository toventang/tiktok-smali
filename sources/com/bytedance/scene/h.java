package com.bytedance.scene;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.navigation.d;
import com.bytedance.scene.t;
import java.util.Objects;

public abstract class h extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public d f42888a;

    /* renamed from: b  reason: collision with root package name */
    public final q<d> f42889b = new q<>();

    /* renamed from: c  reason: collision with root package name */
    private l f42890c;

    /* renamed from: d  reason: collision with root package name */
    private t.a f42891d = new t.a() {
        /* class com.bytedance.scene.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26316);
        }

        @Override // com.bytedance.scene.t.a
        public final t a() {
            return t.f43033a.a();
        }
    };

    static {
        Covode.recordClassIndex(26315);
    }

    public d getNavigationScene() {
        return this.f42888a;
    }

    public final void a() {
        Objects.requireNonNull(this.f42888a, "NavigationScene is null");
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    this.f42888a.f42953a = this.f42890c;
                    this.f42889b.a(activity, this, this.f42888a, this.f42891d, false, null);
                    return;
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        throw new IllegalStateException("cant find Activity attached to this View");
    }

    public void setNavigationScene(d dVar) {
        this.f42888a = dVar;
    }

    public void setRootSceneComponentFactory(l lVar) {
        this.f42890c = lVar;
    }

    public void setRootScopeFactory(t.a aVar) {
        this.f42891d = aVar;
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
    }
}
