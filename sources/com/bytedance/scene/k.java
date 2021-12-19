package com.bytedance.scene;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.c.h;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.c.d;
import com.bytedance.scene.d.j;
import com.bytedance.scene.navigation.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class k extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final h<com.bytedance.scene.c.a> f42919a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final h<d> f42920b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f42921c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    final Set<a> f42922d = new HashSet();

    public interface a {
        static {
            Covode.recordClassIndex(26325);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(26324);
    }

    private boolean a(m mVar) {
        j.a();
        if (com.bytedance.scene.d.k.a(getActivity()) && mVar.getLifecycle().a() != i.b.DESTROYED) {
            return true;
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        for (a aVar : new HashSet(this.f42922d)) {
            aVar.a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.f42921c);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.scene.c.a a2 = this.f42919a.a(i2, null);
        if (a2 != null) {
            a2.a(i3, intent);
            this.f42919a.b(i2);
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (this.f42920b.a(i2, null) != null) {
            this.f42920b.b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(m mVar, Intent intent, int i2, com.bytedance.scene.c.a aVar) {
        if (a(mVar)) {
            if (i2 < 0) {
                startActivity(intent);
                return;
            }
            this.f42919a.b(i2, aVar);
            startActivityForResult(intent, i2);
            mVar.getLifecycle().a(new SceneActivityCompatibilityLayerFragment$1(this, mVar, i2));
        }
    }
}
