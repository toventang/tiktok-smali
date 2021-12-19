package com.bytedance.android.livesdk.l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.livesdk.widget.k;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f18262a;

    /* renamed from: b  reason: collision with root package name */
    private k f18263b;

    static {
        Covode.recordClassIndex(10294);
    }

    /* renamed from: com.bytedance.android.livesdk.l.a$a  reason: collision with other inner class name */
    public static class C0382a {

        /* renamed from: a  reason: collision with root package name */
        public DialogInterface.OnDismissListener f18264a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f18265b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18266c;

        /* renamed from: d  reason: collision with root package name */
        private Context f18267d;

        /* renamed from: e  reason: collision with root package name */
        private DialogInterface.OnCancelListener f18268e;

        /* renamed from: f  reason: collision with root package name */
        private DialogInterface.OnShowListener f18269f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f18270g;

        static {
            Covode.recordClassIndex(10295);
        }

        public final a a() {
            a aVar = new a(this.f18267d);
            aVar.f18262a = this.f18265b;
            aVar.setOnCancelListener(this.f18268e);
            aVar.setOnDismissListener(this.f18264a);
            aVar.setOnShowListener(this.f18269f);
            aVar.setCancelable(this.f18266c);
            aVar.setCanceledOnTouchOutside(this.f18270g);
            return aVar;
        }

        public C0382a(Context context) {
            this.f18267d = context;
        }
    }

    public a(Context context) {
        super(context, R.style.hp);
    }

    public final void a(CharSequence charSequence) {
        this.f18262a = charSequence;
        k kVar = this.f18263b;
        if (kVar != null) {
            kVar.setMessage(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k kVar = new k(getContext());
        this.f18263b = kVar;
        setContentView(kVar);
        this.f18263b.setMessage(this.f18262a);
    }
}
