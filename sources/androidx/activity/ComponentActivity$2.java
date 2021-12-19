package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

class ComponentActivity$2 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f808a;

    static {
        Covode.recordClassIndex(214);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        Window window;
        View peekDecorView;
        if (aVar == i.a.ON_STOP && (window = this.f808a.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}
