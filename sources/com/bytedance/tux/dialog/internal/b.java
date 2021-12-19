package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.f;
import com.bytedance.tux.dialog.internal.b;
import h.f.b.l;
import h.w;
import h.z;

public abstract class b<T extends b<T, U>, U> {

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f44892h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f44893i;

    /* renamed from: j  reason: collision with root package name */
    public DialogInterface.OnDismissListener f44894j;

    /* renamed from: k  reason: collision with root package name */
    public DialogInterface.OnCancelListener f44895k;

    /* renamed from: l  reason: collision with root package name */
    public DialogInterface.OnShowListener f44896l;

    /* renamed from: m  reason: collision with root package name */
    public f.a f44897m;
    public boolean n = true;
    public final Context o;

    static {
        Covode.recordClassIndex(27408);
    }

    public final T a(boolean z) {
        this.n = z;
        return this;
    }

    public T b(CharSequence charSequence) {
        this.f44892h = charSequence;
        return this;
    }

    public T d(CharSequence charSequence) {
        this.f44893i = charSequence;
        return this;
    }

    static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f44898a;

        static {
            Covode.recordClassIndex(27409);
        }

        a(h.f.a.b bVar) {
            this.f44898a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            h.f.a.b bVar = this.f44898a;
            if (dialogInterface != null) {
                bVar.invoke(dialogInterface);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.tux.dialog.internal.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnShowListenerC1098b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f44899a;

        static {
            Covode.recordClassIndex(27410);
        }

        DialogInterface$OnShowListenerC1098b(h.f.a.b bVar) {
            this.f44899a = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            h.f.a.b bVar = this.f44899a;
            if (dialogInterface != null) {
                bVar.invoke(dialogInterface);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public b(Context context) {
        l.c(context, "");
        this.o = context;
    }

    public final T a(int i2) {
        b(this.o.getString(i2));
        return this;
    }

    public final T b(int i2) {
        d(this.o.getString(i2));
        return this;
    }

    public final T a(f.a aVar) {
        l.c(aVar, "");
        this.f44897m = aVar;
        return this;
    }

    public final T b(h.f.a.b<? super com.bytedance.tux.dialog.a, z> bVar) {
        l.c(bVar, "");
        this.f44896l = new DialogInterface$OnShowListenerC1098b(bVar);
        return this;
    }

    public final T a(h.f.a.b<? super com.bytedance.tux.dialog.a, z> bVar) {
        l.c(bVar, "");
        this.f44894j = new a(bVar);
        return this;
    }
}
