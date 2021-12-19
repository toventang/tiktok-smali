package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.f;
import com.bytedance.scene.navigation.d;

final class g implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f42798a;

    /* renamed from: b  reason: collision with root package name */
    public final f f42799b;

    /* renamed from: c  reason: collision with root package name */
    private final d f42800c;

    /* renamed from: d  reason: collision with root package name */
    private final u f42801d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f42802e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f42803f;

    static {
        Covode.recordClassIndex(26280);
    }

    @Override // com.bytedance.scene.n
    public final boolean a() {
        if (this.f42803f || !this.f42800c.E()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.n
    public final void b() {
        if (!this.f42803f) {
            this.f42803f = true;
            final View view = this.f42800c.n;
            FragmentManager fragmentManager = this.f42798a.getFragmentManager();
            FragmentTransaction remove = fragmentManager.beginTransaction().remove(this.f42799b).remove(this.f42801d);
            if (this.f42802e.booleanValue()) {
                this.f42799b.f42796a = new f.a() {
                    /* class com.bytedance.scene.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26281);
                    }

                    @Override // com.bytedance.scene.f.a
                    public final void a() {
                        e.b(g.this.f42798a, g.this.f42799b.getTag());
                        View view = view;
                        if (view != null) {
                            k.a(view);
                        }
                    }
                };
                k.a(fragmentManager, remove, true);
                return;
            }
            k.a(fragmentManager, remove, false);
            e.b(this.f42798a, this.f42799b.getTag());
            if (view != null) {
                k.a(view);
            }
        }
    }

    g(Activity activity, d dVar, f fVar, u uVar, boolean z) {
        this.f42798a = activity;
        this.f42800c = dVar;
        this.f42799b = fVar;
        this.f42801d = uVar;
        this.f42802e = Boolean.valueOf(z);
    }
}
