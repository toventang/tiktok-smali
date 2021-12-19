package com.bytedance.tux.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.internal.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends b<e, d> {

    /* renamed from: a  reason: collision with root package name */
    public a f44858a;

    /* renamed from: b  reason: collision with root package name */
    public a f44859b;

    /* renamed from: c  reason: collision with root package name */
    public a f44860c;

    static {
        Covode.recordClassIndex(27388);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f44861a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f44862b;

        /* renamed from: c  reason: collision with root package name */
        public final DialogInterface.OnClickListener f44863c;

        static {
            Covode.recordClassIndex(27389);
        }

        private /* synthetic */ a() {
            this(null, false, null);
        }

        public a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            this.f44861a = charSequence;
            this.f44862b = z;
            this.f44863c = onClickListener;
        }
    }

    public final d a() {
        return new d(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        l.c(context, "");
    }

    public final e a(DialogInterface.OnClickListener onClickListener) {
        return b(this.o.getText(R.string.a9e), false, onClickListener);
    }

    public final e a(int i2, DialogInterface.OnClickListener onClickListener) {
        return a(this.o.getText(i2), false, onClickListener);
    }

    public final e a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f44860c = new a(charSequence, false, onClickListener);
        return this;
    }

    /* access modifiers changed from: private */
    public e b(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
        this.f44859b = new a(charSequence, false, onClickListener);
        return this;
    }

    public final e a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
        this.f44858a = new a(charSequence, z, onClickListener);
        return this;
    }
}
