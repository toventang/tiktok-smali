package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.i;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.am;
import androidx.appcompat.widget.v;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    v f956a;

    /* renamed from: b  reason: collision with root package name */
    boolean f957b;

    /* renamed from: c  reason: collision with root package name */
    public Window.Callback f958c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f959d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f960e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Object> f961f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f962g = new Runnable() {
        /* class androidx.appcompat.app.j.AnonymousClass1 */

        static {
            Covode.recordClassIndex(278);
        }

        public final void run() {
            h hVar;
            j jVar = j.this;
            Menu k2 = jVar.k();
            if (k2 instanceof h) {
                hVar = (h) k2;
                if (hVar != null) {
                    hVar.e();
                }
            } else {
                hVar = null;
            }
            try {
                k2.clear();
                if (!jVar.f958c.onCreatePanelMenu(0, k2) || !jVar.f958c.onPreparePanel(0, null, k2)) {
                    k2.clear();
                }
            } finally {
                if (hVar != null) {
                    hVar.f();
                }
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.c f963h;

    static {
        Covode.recordClassIndex(277);
    }

    @Override // androidx.appcompat.app.a
    public final void b(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public final void a() {
        a(0, 8);
    }

    @Override // androidx.appcompat.app.a
    public final int b() {
        return this.f956a.m();
    }

    @Override // androidx.appcompat.app.a
    public final void c() {
        this.f956a.e(8);
    }

    @Override // androidx.appcompat.app.a
    public final Context d() {
        return this.f956a.b();
    }

    @Override // androidx.appcompat.app.a
    public final boolean f() {
        return this.f956a.i();
    }

    @Override // androidx.appcompat.app.a
    public final boolean g() {
        return this.f956a.j();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public final void j() {
        this.f956a.a().removeCallbacks(this.f962g);
    }

    @Override // androidx.appcompat.app.a
    public final boolean h() {
        this.f956a.a().removeCallbacks(this.f962g);
        androidx.core.h.v.a(this.f956a.a(), this.f962g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final boolean i() {
        if (!this.f956a.c()) {
            return false;
        }
        this.f956a.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Menu k() {
        if (!this.f959d) {
            this.f956a.a(new a(), new b());
            this.f959d = true;
        }
        return this.f956a.o();
    }

    @Override // androidx.appcompat.app.a
    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    /* access modifiers changed from: package-private */
    public final class a implements o.a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f967b;

        static {
            Covode.recordClassIndex(280);
        }

        a() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final boolean a(h hVar) {
            if (j.this.f958c == null) {
                return false;
            }
            j.this.f958c.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final void a(h hVar, boolean z) {
            if (!this.f967b) {
                this.f967b = true;
                j.this.f956a.l();
                if (j.this.f958c != null) {
                    j.this.f958c.onPanelClosed(108, hVar);
                }
                this.f967b = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class b implements h.a {
        static {
            Covode.recordClassIndex(281);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(h hVar, MenuItem menuItem) {
            return false;
        }

        b() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void a(h hVar) {
            if (j.this.f958c == null) {
                return;
            }
            if (j.this.f956a.g()) {
                j.this.f958c.onPanelClosed(108, hVar);
            } else if (j.this.f958c.onPreparePanel(0, null, hVar)) {
                j.this.f958c.onMenuOpened(108, hVar);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void a(float f2) {
        androidx.core.h.v.a(this.f956a.a(), f2);
    }

    class c extends i {
        static {
            Covode.recordClassIndex(282);
        }

        @Override // androidx.appcompat.view.i
        public final View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(j.this.f956a.b());
            }
            return super.onCreatePanelView(i2);
        }

        public c(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.i
        public final boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (onPreparePanel && !j.this.f957b) {
                j.this.f956a.k();
                j.this.f957b = true;
            }
            return onPreparePanel;
        }
    }

    @Override // androidx.appcompat.app.a
    public final void d(boolean z) {
        if (z != this.f960e) {
            this.f960e = z;
            int size = this.f961f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f961f.get(i2);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public final void a(int i2) {
        this.f956a.d(i2);
    }

    @Override // androidx.appcompat.app.a
    public final void a(CharSequence charSequence) {
        this.f956a.a(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public final void a(boolean z) {
        int i2;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        a(i2, 4);
    }

    @Override // androidx.appcompat.app.a
    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            f();
        }
        return true;
    }

    private void a(int i2, int i3) {
        this.f956a.c((i2 & i3) | ((i3 ^ -1) & this.f956a.m()));
    }

    @Override // androidx.appcompat.app.a
    public final boolean a(int i2, KeyEvent keyEvent) {
        int i3;
        Menu k2 = k();
        if (k2 == null) {
            return false;
        }
        if (keyEvent != null) {
            i3 = keyEvent.getDeviceId();
        } else {
            i3 = -1;
        }
        int keyboardType = KeyCharacterMap.load(i3).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        k2.setQwertyMode(z);
        return k2.performShortcut(i2, keyEvent, 0);
    }

    j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        AnonymousClass2 r2 = new Toolbar.c() {
            /* class androidx.appcompat.app.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(279);
            }

            @Override // androidx.appcompat.widget.Toolbar.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return j.this.f958c.onMenuItemSelected(0, menuItem);
            }
        };
        this.f963h = r2;
        this.f956a = new am(toolbar, false);
        c cVar = new c(callback);
        this.f958c = cVar;
        this.f956a.a(cVar);
        toolbar.setOnMenuItemClickListener(r2);
        this.f956a.a(charSequence);
    }
}
