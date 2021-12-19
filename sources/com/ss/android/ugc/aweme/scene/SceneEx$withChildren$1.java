package com.ss.android.ugc.aweme.scene;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.au;
import h.u;
import java.util.ArrayList;

public final class SceneEx$withChildren$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f120832a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h.f.a.b f120833b;

    static {
        Covode.recordClassIndex(78724);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            oActivityCreated();
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void oActivityCreated() {
        ArrayList<u> arrayList = new ArrayList();
        this.f120833b.invoke(arrayList);
        for (u uVar : arrayList) {
            this.f120832a.a(((Number) uVar.getFirst()).intValue(), (j) uVar.getSecond(), (String) uVar.getThird());
        }
    }
}
