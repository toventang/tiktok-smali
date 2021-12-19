package com.bytedance.assem.arch.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.c.h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static final a f25550d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h<q<Integer, Integer, Intent, z>> f25551a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final h<h.f.a.b<int[], z>> f25552b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final Set<h.f.a.a<z>> f25553c = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private HashMap f25554e;

    static {
        Covode.recordClassIndex(14879);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14880);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f25554e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<T> it = this.f25553c.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.f25553c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        q<Integer, Integer, Intent, z> a2 = this.f25551a.a(i2, null);
        if (a2 != null) {
            a2.invoke(Integer.valueOf(i2), Integer.valueOf(i3), intent);
            this.f25551a.b(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.c(strArr, "");
        l.c(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        h.f.a.b<int[], z> a2 = this.f25552b.a(i2, null);
        if (a2 != null) {
            a2.invoke(iArr);
            this.f25552b.b(i2);
        }
    }

    public final void a(m mVar, Intent intent, int i2, Bundle bundle, q<? super Integer, ? super Integer, ? super Intent, z> qVar) {
        l.c(mVar, "");
        l.c(intent, "");
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            e requireActivity = requireActivity();
            l.a((Object) requireActivity, "");
            if (com.bytedance.assem.arch.extensions.m.a(requireActivity, mVar)) {
                if (i2 < 0) {
                    startActivity(intent);
                    return;
                }
                this.f25551a.b(i2, qVar);
                startActivityForResult(intent, i2, bundle);
                mVar.getLifecycle().a(new AssemContainerBridge$startActivityForResult$1(this, mVar, i2));
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on main thread".toString());
    }
}
