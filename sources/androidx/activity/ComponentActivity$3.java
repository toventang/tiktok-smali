package androidx.activity;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

class ComponentActivity$3 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f809a;

    static {
        Covode.recordClassIndex(215);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY && !this.f809a.isChangingConfigurations()) {
            this.f809a.getViewModelStore().a();
        }
    }
}
