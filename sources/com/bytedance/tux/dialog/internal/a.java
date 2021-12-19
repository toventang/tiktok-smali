package com.bytedance.tux.dialog.internal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.f;
import com.bytedance.tux.dialog.internal.b;
import com.bytedance.tux.dialog.internal.d;
import h.c.d;
import h.f.b.l;
import h.q;

public abstract class a<T extends b<T, ?>> implements DialogInterface {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f44877a;

    /* renamed from: b  reason: collision with root package name */
    private d<Object> f44878b;

    /* renamed from: e  reason: collision with root package name */
    public final d f44879e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f44880f;

    /* renamed from: g  reason: collision with root package name */
    public final DialogInterface.OnDismissListener f44881g;

    /* renamed from: h  reason: collision with root package name */
    public final DialogInterface.OnCancelListener f44882h;

    /* renamed from: i  reason: collision with root package name */
    public final DialogInterface.OnShowListener f44883i;

    /* renamed from: j  reason: collision with root package name */
    public Object f44884j;

    static {
        Covode.recordClassIndex(27400);
    }

    public abstract Dialog b();

    public void cancel() {
        b().cancel();
    }

    public void dismiss() {
        a(null);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Window window;
        b().setOnDismissListener(new DialogInterface$OnDismissListenerC1097a(this));
        b().setOnCancelListener(new b(this));
        if (this.f44883i != null) {
            b().setOnShowListener(new c(this));
        }
        f.a aVar = this.f44877a;
        if (aVar != null && (window = b().getWindow()) != null) {
            Window.Callback callback = window.getCallback();
            l.a((Object) callback, "");
            f fVar = new f(callback);
            fVar.f44875a = aVar;
            window.setCallback(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.internal.a$a  reason: collision with other inner class name */
    public static final class DialogInterface$OnDismissListenerC1097a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44885a;

        static {
            Covode.recordClassIndex(27401);
        }

        DialogInterface$OnDismissListenerC1097a(a aVar) {
            this.f44885a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = this.f44885a.f44881g;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this.f44885a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44886a;

        static {
            Covode.recordClassIndex(27402);
        }

        b(a aVar) {
            this.f44886a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = this.f44886a.f44882h;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this.f44886a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44887a;

        static {
            Covode.recordClassIndex(27403);
        }

        c(a aVar) {
            this.f44887a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f44887a.f44883i.onShow(this.f44887a);
        }
    }

    public final void a(Object obj) {
        this.f44884j = obj;
        try {
            b().dismiss();
        } catch (Exception unused) {
            d<Object> dVar = this.f44878b;
            if (dVar != null) {
                dVar.resumeWith(q.m223constructorimpl(null));
            }
        }
    }

    public a(T t) {
        l.c(t, "");
        this.f44879e = d.a.a(t.o);
        this.f44880f = t.o;
        this.f44877a = t.f44897m;
        this.f44881g = t.f44894j;
        this.f44882h = t.f44895k;
        this.f44883i = t.f44896l;
    }
}
