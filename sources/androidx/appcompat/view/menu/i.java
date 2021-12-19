package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.o;
import com.bytedance.covode.number.Covode;

final class i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, o.a {

    /* renamed from: a  reason: collision with root package name */
    h f1224a;

    /* renamed from: b  reason: collision with root package name */
    c f1225b;

    /* renamed from: c  reason: collision with root package name */
    f f1226c;

    /* renamed from: d  reason: collision with root package name */
    public o.a f1227d;

    static {
        Covode.recordClassIndex(342);
    }

    public i(h hVar) {
        this.f1224a = hVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final boolean a(h hVar) {
        o.a aVar = this.f1227d;
        if (aVar != null) {
            return aVar.a(hVar);
        }
        return false;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1226c.a(this.f1224a, true);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final void a(h hVar, boolean z) {
        c cVar;
        if ((z || hVar == this.f1224a) && (cVar = this.f1225b) != null) {
            cVar.dismiss();
        }
        o.a aVar = this.f1227d;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f1224a.a((j) this.f1226c.c().getItem(i2), (o) null, 0);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1225b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1225b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1224a.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1224a.performShortcut(i2, keyEvent, 0);
    }
}
