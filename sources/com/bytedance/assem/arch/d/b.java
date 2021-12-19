package com.bytedance.assem.arch.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import androidx.lifecycle.i;
import com.bytedance.assem.arch.core.l;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.h;
import h.i;
import h.m;

public abstract class b extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final h f25608l = i.a(m.NONE, c.f25614a);

    /* renamed from: m  reason: collision with root package name */
    public static final h f25609m = i.a(m.NONE, C0538b.f25613a);
    public static final a n = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public int f25610i;

    /* renamed from: j  reason: collision with root package name */
    public l f25611j = l.SYNC;

    /* renamed from: k  reason: collision with root package name */
    public View f25612k;

    public static final class a {
        static {
            Covode.recordClassIndex(14901);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.assem.arch.d.b$b  reason: collision with other inner class name */
    static final class C0538b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0538b f25613a = new C0538b();

        static {
            Covode.recordClassIndex(14902);
        }

        C0538b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            try {
                System.out.println(ab.a(com.a.b.a.class));
                return true;
            } catch (ClassNotFoundException e2) {
                k kVar = j.f25647b;
                if (kVar == null) {
                    return false;
                }
                kVar.a("Could not find AndInflater", e2);
                return false;
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25614a = new c();

        static {
            Covode.recordClassIndex(14903);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            try {
                System.out.print(ab.a(androidx.b.a.a.class));
                return true;
            } catch (ClassNotFoundException e2) {
                k kVar = j.f25647b;
                if (kVar == null) {
                    return false;
                }
                kVar.a("Could not find AsyncLayoutInflater", e2);
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(14900);
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void t() {
        View view;
        if (this.f25610i != 0) {
            View view2 = bx_().f25530c;
            if (view2 != null) {
                view = view2.findViewById(this.f25610i);
            } else {
                view = null;
            }
            if (view == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (view instanceof ViewGroup) {
                int i2 = c.f25617a[this.f25611j.ordinal()];
                if (i2 == 1) {
                    Context ar_ = ar_();
                    if (ar_ != null) {
                        new androidx.b.a.a(ar_).a(R.layout.a3t, (ViewGroup) view, new d(this, view));
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (i2 == 2) {
                    Context ar_2 = ar_();
                    if (ar_2 != null) {
                        View a2 = com.a.b.a.a(ar_2, R.layout.a3t);
                        if (a2 != null) {
                            ((ViewGroup) view).addView(a2);
                            this.f25612k = a2;
                            a(view);
                            b(a2);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (i2 == 3) {
                    Context ar_3 = ar_();
                    if (ar_3 != null) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        View a3 = com.a.a(LayoutInflater.from(ar_3), R.layout.a3t, viewGroup, false);
                        if (a3 != null) {
                            viewGroup.addView(a3);
                            this.f25612k = a3;
                            a(view);
                            b(a3);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("container must be a ViewGroup.".toString());
            }
        } else {
            throw new IllegalStateException("slotLayoutId must be assigned.".toString());
        }
    }

    static final class d implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f25615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f25616b;

        static {
            Covode.recordClassIndex(14904);
        }

        d(b bVar, View view) {
            this.f25615a = bVar;
            this.f25616b = view;
        }

        @Override // androidx.b.a.a.d
        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
            MethodCollector.i(2900);
            h.f.b.l.c(view, "");
            if (this.f25615a.f25546d.a() == i.b.DESTROYED) {
                MethodCollector.o(2900);
                return;
            }
            ((ViewGroup) this.f25616b).addView(view);
            b bVar = this.f25615a;
            h.f.b.l.c(view, "");
            bVar.f25612k = view;
            this.f25615a.a(this.f25616b);
            this.f25615a.b(view);
            MethodCollector.o(2900);
        }
    }
}
