package com.ss.android.ugc.tools.view.e;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f150085a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnClickListener f150086b;

    /* renamed from: c  reason: collision with root package name */
    public DialogInterface.OnClickListener f150087c;

    /* renamed from: d  reason: collision with root package name */
    private Context f150088d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f150089e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f150090f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f150091g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f150092h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f150093i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f150094j;

    /* renamed from: k  reason: collision with root package name */
    private View f150095k;

    /* renamed from: l  reason: collision with root package name */
    private View f150096l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout f150097m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;

    static {
        Covode.recordClassIndex(98804);
    }

    /* renamed from: com.ss.android.ugc.tools.view.e.a$a  reason: collision with other inner class name */
    public static class C4048a {

        /* renamed from: a  reason: collision with root package name */
        public String f150100a;

        /* renamed from: b  reason: collision with root package name */
        public String f150101b;

        /* renamed from: c  reason: collision with root package name */
        public String f150102c;

        /* renamed from: d  reason: collision with root package name */
        public String f150103d;

        /* renamed from: e  reason: collision with root package name */
        public int f150104e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnClickListener f150105f;

        /* renamed from: g  reason: collision with root package name */
        public DialogInterface.OnClickListener f150106g;

        /* renamed from: h  reason: collision with root package name */
        public Context f150107h;

        /* renamed from: i  reason: collision with root package name */
        public View f150108i;

        static {
            Covode.recordClassIndex(98807);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public C4048a(Context context) {
            this.f150107h = context;
        }

        public final C4048a a(int i2) {
            this.f150100a = this.f150107h.getString(i2);
            return this;
        }

        public final C4048a a(DialogInterface.OnClickListener onClickListener) {
            this.f150103d = this.f150107h.getString(R.string.a9e);
            this.f150106g = onClickListener;
            return this;
        }

        public final C4048a a(int i2, DialogInterface.OnClickListener onClickListener) {
            this.f150102c = this.f150107h.getString(i2);
            this.f150105f = onClickListener;
            return this;
        }
    }

    public final Dialog a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f150088d);
        if (!TextUtils.isEmpty(this.n)) {
            builder.setTitle(this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            builder.setMessage(this.o);
        }
        builder.setPositiveButton(this.p, new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.tools.view.e.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98805);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.a(dialogInterface);
                if (a.this.f150086b != null) {
                    a.this.f150086b.onClick(dialogInterface, i2);
                }
            }
        });
        if (!TextUtils.isEmpty(this.q)) {
            builder.setNegativeButton(this.q, new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.tools.view.e.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(98806);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    a.a(dialogInterface);
                    if (a.this.f150087c != null) {
                        a.this.f150087c.onClick(dialogInterface, i2);
                    }
                }
            });
        }
        AlertDialog create = builder.create();
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }

    public static void a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    private a(C4048a aVar) {
        MethodCollector.i(7189);
        this.f150088d = aVar.f150107h;
        this.r = aVar.f150104e;
        this.n = aVar.f150100a;
        this.o = aVar.f150101b;
        this.q = aVar.f150103d;
        this.p = aVar.f150102c;
        this.f150086b = aVar.f150105f;
        this.f150087c = aVar.f150106g;
        this.f150096l = aVar.f150108i;
        View inflate = LayoutInflater.from(this.f150088d).inflate(R.layout.b4a, (ViewGroup) null);
        this.f150095k = inflate;
        this.f150089e = (TextView) inflate.findViewById(R.id.f9l);
        this.f150090f = (TextView) this.f150095k.findViewById(R.id.exf);
        this.f150094j = (ImageView) this.f150095k.findViewById(R.id.bhv);
        this.f150091g = (TextView) this.f150095k.findViewById(R.id.f1p);
        this.f150092h = (TextView) this.f150095k.findViewById(R.id.f67);
        this.f150093i = (TextView) this.f150095k.findViewById(R.id.f1y);
        this.f150085a = (RelativeLayout) this.f150095k.findViewById(R.id.dqr);
        this.f150097m = (RelativeLayout) this.f150095k.findViewById(R.id.dod);
        MethodCollector.o(7189);
    }

    /* synthetic */ a(C4048a aVar, byte b2) {
        this(aVar);
    }
}
