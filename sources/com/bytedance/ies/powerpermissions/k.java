package com.bytedance.ies.powerpermissions;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import h.a.n;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class k implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34462c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<e> f34463a;

    /* renamed from: b  reason: collision with root package name */
    PrivacyCert f34464b;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f34465d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private final m f34466e = new m();

    static {
        Covode.recordClassIndex(20612);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20613);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final c a(e eVar) {
        l.c(eVar, "");
        this.f34466e.a(eVar);
        return this;
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final c a(String... strArr) {
        l.c(strArr, "");
        n.a((Collection) this.f34465d, (Object[]) strArr);
        h hVar = new h();
        hVar.a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.f34466e.a(hVar);
        return this;
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final void a(f fVar) {
        l.c(fVar, "");
        WeakReference<e> weakReference = this.f34463a;
        if (weakReference != null) {
            e eVar = weakReference.get();
            if (eVar != null && !eVar.isFinishing()) {
                int i2 = Build.VERSION.SDK_INT;
                if (!eVar.isDestroyed() && (!this.f34465d.isEmpty() || !this.f34466e.f34472b.isEmpty())) {
                    Iterator<String> it = this.f34465d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!j.a((Context) eVar, it.next())) {
                                break;
                            }
                        } else if (this.f34466e.f34474d) {
                            com.bytedance.ies.powerpermissions.a.a.a("PowerPermissions", "all granted");
                            ArrayList arrayList = new ArrayList();
                            for (String str : this.f34465d) {
                                arrayList.add(new com.bytedance.ies.powerpermissions.c.a(str, a.EnumC0768a.GRANTED));
                            }
                            Object[] array = arrayList.toArray(new com.bytedance.ies.powerpermissions.c.a[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            com.bytedance.ies.powerpermissions.c.a[] aVarArr = (com.bytedance.ies.powerpermissions.c.a[]) array;
                            fVar.a((com.bytedance.ies.powerpermissions.c.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                            return;
                        }
                    }
                    if (eVar.getSupportFragmentManager().a("PermissionFragment") == null) {
                        b bVar = new b();
                        b bVar2 = bVar;
                        l.c(fVar, "");
                        bVar2.f34445a = fVar;
                        m mVar = this.f34466e;
                        l.c(mVar, "");
                        bVar2.f34447c = mVar;
                        m mVar2 = this.f34466e;
                        l.c(bVar, "");
                        mVar2.f34473c = new WeakReference<>(bVar);
                        PrivacyCert privacyCert = this.f34464b;
                        if (privacyCert != null) {
                            m mVar3 = this.f34466e;
                            l.c(privacyCert, "");
                            mVar3.f34475e = privacyCert;
                        }
                        m mVar4 = this.f34466e;
                        List<String> list = this.f34465d;
                        l.c(list, "");
                        mVar4.f34471a.addAll(list);
                        eVar.getSupportFragmentManager().a().a(bVar, "PermissionFragment").c();
                        com.bytedance.ies.powerpermissions.a.a.a("PowerPermissions", "try to request permissions");
                        return;
                    }
                    return;
                }
            }
            l.c("PowerPermissions", "");
            l.c("return directly", "");
            return;
        }
        com.bytedance.ies.powerpermissions.a.a.a("PowerPermissions", "activity is null");
    }
}
