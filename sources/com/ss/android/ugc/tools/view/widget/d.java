package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static q<Integer> f150417a;

    /* renamed from: b  reason: collision with root package name */
    public static a f150418b;

    /* renamed from: c  reason: collision with root package name */
    private int f150419c;

    /* renamed from: d  reason: collision with root package name */
    private int f150420d;

    /* renamed from: e  reason: collision with root package name */
    private int f150421e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f150422f;

    /* renamed from: g  reason: collision with root package name */
    private String f150423g;

    /* renamed from: h  reason: collision with root package name */
    private Context f150424h;

    public interface a {
        static {
            Covode.recordClassIndex(98918);
        }

        void a(Context context, String str, int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(98917);
    }

    public static int a() {
        q<Integer> qVar = f150417a;
        if (qVar == null) {
            return 1;
        }
        return qVar.b().intValue();
    }

    public final void b() {
        try {
            if (this.f150424h != null && !TextUtils.isEmpty(this.f150423g) && g.a().O()) {
                a(this.f150424h, this.f150423g, this.f150419c, this.f150422f, this.f150420d, this.f150421e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static d a(Context context, int i2) {
        return a(context, i2, a());
    }

    public static d b(Context context, int i2) {
        return a(context, context.getString(i2), 1, a());
    }

    public static d c(Context context, int i2) {
        return b(context, context.getString(i2), 1, a());
    }

    public static d a(Context context, String str) {
        return a(context, str, 1, a());
    }

    public static d b(Context context, String str, int i2) {
        return b(context, str, i2, a());
    }

    private static d a(Context context, int i2, int i3) {
        return new d(context, context.getString(i2), 1, 2, i3);
    }

    public static d a(Context context, String str, int i2) {
        return a(context, str, i2, a());
    }

    private static d b(Context context, String str, int i2, int i3) {
        return new d(context, str, i2, 3, i3);
    }

    private static d a(Context context, String str, int i2, int i3) {
        return new d(context, str, i2, 2, i3);
    }

    public d(Context context, String str, int i2, int i3, int i4) {
        this.f150423g = str;
        this.f150419c = i2;
        this.f150422f = i3;
        this.f150424h = context;
        this.f150420d = i4;
    }

    private static void a(Context context, String str, int i2, int i3, int i4, int i5) {
        a aVar = f150418b;
        if (aVar != null) {
            aVar.a(context, str, i2, i4, i5);
            return;
        }
        l.d(context, "");
        l.d(str, "");
        if (g.a().y().b().booleanValue()) {
            n.a(context, 0, str);
        } else if (i3 == 1) {
            e a2 = e.a(context);
            a2.f150429d = i4;
            a2.a(i5);
            if (a2.a()) {
                a2.f150427b.setBackgroundColor(b.c(a2.f150426a, R.color.un));
            } else {
                a2.f150427b.setBackgroundResource(R.drawable.bmo);
            }
            a2.f150428c.setImageResource(2131233970);
            a2.a(str, i2);
        } else if (i3 == 2) {
            e a3 = e.a(context);
            a3.f150429d = i4;
            a3.a(i5);
            if (a3.a()) {
                a3.f150427b.setBackgroundColor(b.c(a3.f150426a, R.color.um));
            } else {
                a3.f150427b.setBackgroundResource(R.drawable.bmn);
            }
            a3.f150428c.setImageResource(2131233971);
            a3.a(str, i2);
        } else if (i3 == 3) {
            e a4 = e.a(context);
            a4.f150429d = i4;
            a4.a(i5);
            if (a4.a()) {
                a4.f150427b.setBackgroundColor(b.c(a4.f150426a, R.color.c7));
            } else {
                a4.f150427b.setBackgroundResource(R.drawable.bmm);
            }
            a4.f150428c.setVisibility(8);
            a4.a(str, i2);
        }
    }
}
