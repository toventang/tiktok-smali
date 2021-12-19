package com.bytedance.tux.tooltip.a.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f45487a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f45488b;

    static {
        Covode.recordClassIndex(27695);
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public int f45489a;

        /* renamed from: b  reason: collision with root package name */
        public int f45490b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.b<? super ImageView, z> f45491c;

        /* renamed from: d  reason: collision with root package name */
        public int f45492d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f45493e = "";

        /* renamed from: f  reason: collision with root package name */
        public View.OnClickListener f45494f;

        static {
            Covode.recordClassIndex(27696);
        }

        public final void a(CharSequence charSequence) {
            l.c(charSequence, "");
            this.f45493e = charSequence;
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public int f45495a;

        /* renamed from: b  reason: collision with root package name */
        public int f45496b;

        /* renamed from: c  reason: collision with root package name */
        public int f45497c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f45498d = "";

        /* renamed from: e  reason: collision with root package name */
        public int f45499e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View.OnClickListener f45500f;

        static {
            Covode.recordClassIndex(27697);
        }

        public final void a(CharSequence charSequence) {
            l.c(charSequence, "");
            this.f45498d = charSequence;
        }
    }

    public final d a(a aVar) {
        l.c(aVar, "");
        this.f45487a.add(aVar);
        return this;
    }

    public d(Context context) {
        l.c(context, "");
        this.f45488b = context;
    }

    public final d a(b bVar) {
        l.c(bVar, "");
        this.f45487a.add(bVar);
        return this;
    }
}
