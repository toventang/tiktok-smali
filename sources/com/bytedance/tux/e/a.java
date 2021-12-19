package com.bytedance.tux.e;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.immersionbar.b;
import com.bytedance.immersionbar.e;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1099a f44922b = new C1099a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f44923a;

    /* renamed from: c  reason: collision with root package name */
    private final Context f44924c;

    static {
        Covode.recordClassIndex(27417);
    }

    /* renamed from: com.bytedance.tux.e.a$a  reason: collision with other inner class name */
    public static final class C1099a {
        static {
            Covode.recordClassIndex(27418);
        }

        private C1099a() {
        }

        public /* synthetic */ C1099a(byte b2) {
            this();
        }

        public static a a(Fragment fragment) {
            l.c(fragment, "");
            e a2 = e.a(fragment);
            Context context = fragment.getContext();
            l.a((Object) a2, "");
            return new a(context, a2, (byte) 0);
        }

        public static a a(d dVar) {
            l.c(dVar, "");
            e a2 = e.a(dVar);
            Context context = dVar.getContext();
            l.a((Object) a2, "");
            return new a(context, a2, (byte) 0);
        }

        public static a a(androidx.fragment.app.e eVar) {
            l.c(eVar, "");
            e a2 = e.a(eVar);
            l.a((Object) a2, "");
            return new a(eVar, a2, (byte) 0);
        }

        public static a a(androidx.fragment.app.e eVar, Dialog dialog) {
            l.c(eVar, "");
            l.c(dialog, "");
            e a2 = e.a(eVar, dialog);
            l.a((Object) a2, "");
            return new a(eVar, a2, (byte) 0);
        }

        public static a a(androidx.fragment.app.e eVar, Window window) {
            l.c(eVar, "");
            l.c(window, "");
            e a2 = e.a(eVar, window);
            l.a((Object) a2, "");
            return new a(eVar, a2, (byte) 0);
        }
    }

    public final a a() {
        this.f44923a.a();
        return this;
    }

    public final a b() {
        this.f44923a.b();
        return this;
    }

    public final a c() {
        this.f44923a.c();
        return this;
    }

    public final a d(int i2) {
        this.f44923a.c(i2);
        return this;
    }

    public final a e(int i2) {
        this.f44923a.d(i2);
        return this;
    }

    public final a a(int i2) {
        this.f44923a.a(i2);
        return this;
    }

    public final a b(int i2) {
        this.f44923a.b(i2);
        return this;
    }

    public final a c(boolean z) {
        this.f44923a.c(z);
        return this;
    }

    public final a a(boolean z) {
        this.f44923a.a(z);
        return this;
    }

    public final a b(boolean z) {
        this.f44923a.b(z);
        return this;
    }

    public final a c(int i2) {
        Integer a2;
        Context context = this.f44924c;
        if (!(context == null || (a2 = com.bytedance.tux.h.d.a(context, i2)) == null)) {
            this.f44923a.b(a2.intValue());
        }
        return this;
    }

    public final a f(int i2) {
        Integer a2;
        Context context = this.f44924c;
        if (!(context == null || (a2 = com.bytedance.tux.h.d.a(context, i2)) == null)) {
            this.f44923a.d(a2.intValue());
        }
        return this;
    }

    private a(Context context, e eVar) {
        this.f44924c = context;
        this.f44923a = eVar;
    }

    public final a a(boolean z, boolean z2) {
        b bVar;
        if (z) {
            if (z2) {
                bVar = b.FLAG_HIDE_BAR;
            } else {
                bVar = b.FLAG_HIDE_NAVIGATION_BAR;
            }
        } else if (z2) {
            bVar = b.FLAG_HIDE_STATUS_BAR;
        } else {
            bVar = b.FLAG_SHOW_BAR;
        }
        this.f44923a.a(bVar);
        return this;
    }

    public /* synthetic */ a(Context context, e eVar, byte b2) {
        this(context, eVar);
    }
}
