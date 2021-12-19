package com.bytedance.immersionbar;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class ImmersionBar$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f38879a;

    static {
        Covode.recordClassIndex(23838);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            handleDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void handleDestroy() {
        e eVar = this.f38879a;
        Iterator<Map.Entry<String, e>> it = e.f38899a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, e> next = it.next();
            if (next.getKey().contains(eVar.f38902c) || next.getKey().equals(eVar.f38902c)) {
                it.remove();
            }
        }
        eVar.f38903d = false;
    }

    ImmersionBar$1(e eVar) {
        this.f38879a = eVar;
    }
}
