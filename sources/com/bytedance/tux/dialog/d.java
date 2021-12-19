package com.bytedance.tux.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;

public final class d extends com.bytedance.tux.dialog.internal.a<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f44843a;

    static {
        Covode.recordClassIndex(27379);
    }

    @Override // com.bytedance.tux.dialog.internal.a
    public final Dialog b() {
        return this.f44843a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.d$d  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1096d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f44854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f44855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f44856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f44857d;

        static {
            Covode.recordClassIndex(27384);
        }

        View$OnClickListenerC1096d(d dVar, e.a aVar, androidx.appcompat.app.c cVar, int i2) {
            this.f44854a = dVar;
            this.f44855b = aVar;
            this.f44856c = cVar;
            this.f44857d = i2;
        }

        public final void onClick(View view) {
            if (!this.f44855b.f44862b) {
                this.f44856c.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f44855b.f44863c;
            if (onClickListener != null) {
                onClickListener.onClick(this.f44854a, this.f44857d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(eVar);
        Integer valueOf;
        int i2;
        com.bytedance.tux.f.d dVar;
        l.c(eVar, "");
        Context context = eVar.o;
        l.c(context, "");
        TypedValue typedValue = new TypedValue();
        com.bytedance.tux.f.d dVar2 = null;
        if (!context.getTheme().resolveAttribute(R.attr.c9, typedValue, true)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(typedValue.data);
        }
        Context context2 = eVar.o;
        if (valueOf != null) {
            i2 = valueOf.intValue();
        } else {
            i2 = 0;
        }
        c.a aVar = new c.a(context2, i2);
        final e.a aVar2 = eVar.f44858a;
        final e.a aVar3 = eVar.f44859b;
        final e.a aVar4 = eVar.f44860c;
        CharSequence charSequence = eVar.f44892h;
        if (charSequence != null) {
            dVar = new com.bytedance.tux.f.d(charSequence);
            dVar.a(this.f44879e.f44904b);
        } else {
            dVar = null;
        }
        CharSequence charSequence2 = eVar.f44893i;
        if (charSequence2 != null) {
            dVar2 = new com.bytedance.tux.f.d(charSequence2);
            dVar2.a(this.f44879e.f44905c);
        }
        aVar.a(dVar);
        aVar.b(dVar2);
        aVar.a(eVar.n);
        if (aVar2 != null) {
            com.bytedance.tux.f.d dVar3 = new com.bytedance.tux.f.d(aVar2.f44861a);
            dVar3.a(this.f44879e.f44908f);
            aVar.a(dVar3, new a(aVar2));
        }
        if (aVar3 != null) {
            com.bytedance.tux.f.d dVar4 = new com.bytedance.tux.f.d(aVar3.f44861a);
            dVar4.a(this.f44879e.f44908f);
            aVar.b(dVar4, new b(aVar3));
        }
        if (aVar4 != null) {
            new com.bytedance.tux.f.d(aVar4.f44861a).a(this.f44879e.f44908f);
            aVar.c(aVar4.f44861a, new c(aVar4));
        }
        androidx.appcompat.app.c a2 = aVar.a();
        l.a((Object) a2, "");
        this.f44843a = a2;
        c();
        a2.setOnShowListener(new DialogInterface.OnShowListener(this) {
            /* class com.bytedance.tux.dialog.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f44844a;

            static {
                Covode.recordClassIndex(27380);
            }

            {
                this.f44844a = r1;
            }

            public final void onShow(DialogInterface dialogInterface) {
                this.f44844a.a(-1, aVar2);
                this.f44844a.a(-2, aVar3);
                this.f44844a.a(-3, aVar4);
                DialogInterface.OnShowListener onShowListener = this.f44844a.f44883i;
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                }
            }
        });
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f44849a;

        static {
            Covode.recordClassIndex(27381);
        }

        a(e.a aVar) {
            this.f44849a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!this.f44849a.f44862b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f44849a.f44863c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f44850a;

        static {
            Covode.recordClassIndex(27382);
        }

        b(e.a aVar) {
            this.f44850a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!this.f44850a.f44862b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f44850a.f44863c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f44853a;

        static {
            Covode.recordClassIndex(27383);
        }

        c(e.a aVar) {
            this.f44853a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!this.f44853a.f44862b) {
                dialogInterface.dismiss();
            }
            DialogInterface.OnClickListener onClickListener = this.f44853a.f44863c;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }

    public final void a(int i2, e.a aVar) {
        Dialog dialog = this.f44843a;
        if (dialog != null) {
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) dialog;
            Button a2 = cVar.a(i2);
            if (a2 != null && aVar != null) {
                a2.setOnClickListener(new View$OnClickListenerC1096d(this, aVar, cVar, i2));
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
