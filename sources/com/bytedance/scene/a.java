package com.bytedance.scene;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.j;
import com.bytedance.scene.d.k;
import com.bytedance.scene.k;

public final class a {
    static {
        Covode.recordClassIndex(26212);
    }

    public static boolean a(Activity activity, m mVar) {
        if (k.a(activity) && mVar.getLifecycle().a() != i.b.DESTROYED) {
            return false;
        }
        return true;
    }

    public static void a(Activity activity, m mVar, Intent intent, com.bytedance.scene.c.a aVar) {
        j.a();
        if (!a(activity, mVar)) {
            k kVar = (k) activity.getFragmentManager().findFragmentByTag(k.class.getName());
            if (kVar == null) {
                kVar = new k();
                k.a(activity.getFragmentManager(), activity.getFragmentManager().beginTransaction().add(kVar, k.class.getName()), false);
            }
            if (kVar.isAdded()) {
                kVar.a(mVar, intent, 1001, aVar);
                return;
            }
            kVar.f42922d.add(new k.a(kVar, activity, mVar, intent, 1001, aVar) {
                /* class com.bytedance.scene.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f42657a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Activity f42658b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ m f42659c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Intent f42660d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f42661e = 1001;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ com.bytedance.scene.c.a f42662f;

                static {
                    Covode.recordClassIndex(26213);
                }

                @Override // com.bytedance.scene.k.a
                public final void a() {
                    this.f42657a.f42922d.remove(this);
                    if (!a.a(this.f42658b, this.f42659c)) {
                        this.f42657a.a(this.f42659c, this.f42660d, this.f42661e, this.f42662f);
                    }
                }

                {
                    this.f42657a = r2;
                    this.f42658b = r3;
                    this.f42659c = r4;
                    this.f42660d = r5;
                    this.f42662f = r7;
                }
            });
        }
    }
}
