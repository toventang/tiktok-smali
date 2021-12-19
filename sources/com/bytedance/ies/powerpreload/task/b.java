package com.bytedance.ies.powerpreload.task;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.d;
import h.f.b.l;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final g f34547a;

    static {
        Covode.recordClassIndex(20665);
    }

    public final class a extends i.b {
        static {
            Covode.recordClassIndex(20666);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentDestroyed(i iVar, Fragment fragment) {
            Bundle arguments;
            String b2;
            Set<h> a2;
            l.c(iVar, "");
            l.c(fragment, "");
            g gVar = b.this.f34547a;
            String name = fragment.getClass().getName();
            l.a((Object) name, "");
            d b3 = gVar.b(name);
            if (!(b3 == null || !b3.f34517b || (arguments = fragment.getArguments()) == null || (b2 = com.bytedance.ies.powerpreload.a.b(arguments)) == null || (a2 = b.this.f34547a.a(b3)) == null)) {
                for (T t : a2) {
                    f<?> fVar = t.f34565a;
                    if (fVar != null && t.a(null, b2)) {
                        fVar.b();
                    }
                }
            }
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentPreCreated(i iVar, Fragment fragment, Bundle bundle) {
            Bundle arguments;
            String b2;
            l.c(iVar, "");
            l.c(fragment, "");
            g gVar = b.this.f34547a;
            String name = fragment.getClass().getName();
            l.a((Object) name, "");
            d b3 = gVar.b(name);
            if (!(b3 == null || !b3.f34516a || (arguments = fragment.getArguments()) == null || (b2 = com.bytedance.ies.powerpreload.a.b(arguments)) == null)) {
                b3.f34517b = true;
                Set<h> a2 = b.this.f34547a.a(b3);
                if (a2 != null) {
                    for (T t : a2) {
                        f<?> fVar = t.f34565a;
                        if (fVar != null && t.a(null, b2)) {
                            fVar.a(fragment.getActivity());
                            fVar.a(fragment);
                        }
                    }
                }
            }
        }
    }

    public b(g gVar) {
        l.c(gVar, "");
        this.f34547a = gVar;
    }
}
