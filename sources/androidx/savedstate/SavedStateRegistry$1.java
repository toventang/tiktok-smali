package androidx.savedstate;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public class SavedStateRegistry$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f4369a;

    static {
        Covode.recordClassIndex(1685);
    }

    public SavedStateRegistry$1(a aVar) {
        this.f4369a = aVar;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            this.f4369a.f4373d = true;
        } else if (aVar == i.a.ON_STOP) {
            this.f4369a.f4373d = false;
        }
    }
}
