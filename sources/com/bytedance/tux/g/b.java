package com.bytedance.tux.g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45061b = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static int f45062f;

    /* renamed from: a  reason: collision with root package name */
    c f45063a = new c();

    /* renamed from: c  reason: collision with root package name */
    private Context f45064c;

    /* renamed from: d  reason: collision with root package name */
    private View f45065d;

    /* renamed from: e  reason: collision with root package name */
    private e f45066e;

    static {
        Covode.recordClassIndex(27493);
    }

    static final class a {
        static {
            Covode.recordClassIndex(27494);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final b a() {
        this.f45063a.f45074h = true;
        int i2 = f45062f + 1;
        f45062f = i2;
        if (i2 >= Integer.MAX_VALUE) {
            f45062f = 1;
        }
        this.f45063a.f45075i = f45062f;
        return this;
    }

    public final void b() {
        Context context = this.f45064c;
        View view = this.f45065d;
        CharSequence charSequence = this.f45063a.f45068b;
        if (context != null && view != null && charSequence != null && charSequence.length() > 0) {
            e eVar = new e(context, view, this.f45063a);
            eVar.b();
            if (this.f45063a.f45074h) {
                d.a(eVar);
            }
            this.f45066e = eVar;
        }
    }

    public final b a(long j2) {
        this.f45063a.f45071e = j2;
        return this;
    }

    public final b a(int i2) {
        Context context = this.f45064c;
        if (context == null) {
            return this;
        }
        this.f45064c = new d(context, i2);
        return this;
    }

    public final b b(int i2) {
        this.f45063a.f45069c = Integer.valueOf(i2);
        return this;
    }

    public final b c(int i2) {
        this.f45063a.f45070d = Integer.valueOf(i2);
        return this;
    }

    public final b d(int i2) {
        Integer num;
        c cVar = this.f45063a;
        Context context = this.f45064c;
        if (context != null) {
            num = com.bytedance.tux.h.d.a(context, i2);
        } else {
            num = null;
        }
        cVar.f45070d = num;
        return this;
    }

    public final b e(int i2) {
        String str;
        c cVar = this.f45063a;
        Context context = this.f45064c;
        if (context != null) {
            str = context.getString(i2);
        } else {
            str = null;
        }
        cVar.f45068b = str;
        return this;
    }

    public b(Activity activity) {
        View view;
        l.c(activity, "");
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.f45065d = view;
        this.f45064c = activity;
    }

    public b(Dialog dialog) {
        View view;
        l.c(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.f45065d = view;
        this.f45064c = dialog.getContext();
    }

    public final b a(CharSequence charSequence) {
        this.f45063a.f45068b = charSequence;
        return this;
    }

    public b(View view) {
        l.c(view, "");
        this.f45065d = view;
        this.f45064c = view.getContext();
    }

    public b(Fragment fragment) {
        View view;
        l.c(fragment, "");
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.f45065d = view;
        this.f45064c = fragment.getContext();
    }
}
