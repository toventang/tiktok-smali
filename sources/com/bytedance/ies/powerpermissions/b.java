package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.b.a;
import com.bytedance.ies.powerpermissions.c.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends Fragment implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34444d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    f f34445a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f34446b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    m f34447c;

    /* renamed from: e  reason: collision with root package name */
    private int f34448e;

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f34449f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashSet<String> f34450g = new HashSet<>();

    /* renamed from: h  reason: collision with root package name */
    private HashMap f34451h;

    static {
        Covode.recordClassIndex(20585);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20586);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.d
    public final void a() {
        b();
    }

    /* renamed from: com.bytedance.ies.powerpermissions.b$b  reason: collision with other inner class name */
    static final class RunnableC0767b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34453a;

        static {
            Covode.recordClassIndex(20587);
        }

        RunnableC0767b(b bVar) {
            this.f34453a = bVar;
        }

        public final void run() {
            b bVar = this.f34453a;
            bVar.a(bVar.f34446b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f34451h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private final void b() {
        i supportFragmentManager;
        e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.a().a(this).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m mVar = this.f34447c;
        if (mVar != null) {
            mVar.a();
        } else {
            b();
        }
    }

    public final void a(HashSet<String> hashSet) {
        if (hashSet.isEmpty()) {
            a(null, null);
            return;
        }
        Object[] array = hashSet.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        requestPermissions((String[]) array, this.f34448e);
    }

    @Override // com.bytedance.ies.powerpermissions.d
    public final void a(List<String> list) {
        boolean z;
        Context context;
        l.c(list, "");
        com.bytedance.ies.powerpermissions.a.a.a("FakeFragment", "requestPermissions");
        this.f34449f.clear();
        this.f34450g.clear();
        this.f34446b.clear();
        this.f34448e++;
        Iterator<String> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Context context2 = getContext();
            if (context2 != null) {
                l.a((Object) context2, "");
                if (j.a(context2, next)) {
                    this.f34449f.add(next);
                } else if (Build.VERSION.SDK_INT < 23 ? l.a((Object) "android.permission.SYSTEM_ALERT_WINDOW", (Object) next) || l.a((Object) "android.permission.WRITE_SETTINGS", (Object) next) || l.a((Object) "android.permission.MANAGE_EXTERNAL_STORAGE", (Object) next) : l.a((Object) "android.permission.REQUEST_INSTALL_PACKAGES", (Object) next) || l.a((Object) "android.permission.SYSTEM_ALERT_WINDOW", (Object) next) || l.a((Object) "android.permission.ACCESS_NOTIFICATION_POLICY", (Object) next) || l.a((Object) "android.permission.WRITE_SETTINGS", (Object) next) || l.a((Object) "android.permission.MANAGE_EXTERNAL_STORAGE", (Object) next)) {
                    this.f34450g.add(next);
                } else {
                    this.f34446b.add(next);
                }
            }
        }
        e activity = getActivity();
        if (activity != null) {
            l.a((Object) activity, "");
            HashSet<String> hashSet = this.f34450g;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Iterator<String> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                l.a((Object) next2, "");
                com.bytedance.ies.powerpermissions.d.a a2 = a.a(next2);
                if (!(a2 == null || (context = getContext()) == null)) {
                    l.a((Object) context, "");
                    Intent a3 = a2.a(context);
                    if (a3 != null) {
                        startActivityForResult(a3, this.f34448e);
                        z = true;
                    }
                }
            }
            if (!z) {
                a(this.f34446b);
            }
        }
    }

    private final void a(String[] strArr, int[] iArr) {
        if (strArr != null) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr[i2];
                if (iArr != null && iArr[i2] == -1) {
                    a.b(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        e activity = getActivity();
        if (activity != null) {
            if (!this.f34449f.isEmpty()) {
                Iterator<String> it = this.f34449f.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    l.a((Object) next, "");
                    arrayList.add(new com.bytedance.ies.powerpermissions.c.a(next, a.EnumC0768a.GRANTED));
                }
            }
            if (!(strArr == null || iArr == null)) {
                int length2 = strArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    if (iArr[i3] == 0) {
                        arrayList.add(new com.bytedance.ies.powerpermissions.c.a(strArr[i3], a.EnumC0768a.GRANTED));
                    } else {
                        l.a((Object) activity, "");
                        if (j.a((Activity) activity, strArr[i3])) {
                            arrayList.add(new com.bytedance.ies.powerpermissions.c.a(strArr[i3], a.EnumC0768a.DENIED_PERMANENT));
                        } else {
                            arrayList.add(new com.bytedance.ies.powerpermissions.c.a(strArr[i3], a.EnumC0768a.THIS_OPERATION_NOT_PERMITTED));
                        }
                    }
                }
            }
            Iterator<String> it2 = this.f34450g.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                l.a((Object) activity, "");
                l.a((Object) next2, "");
                if (j.a((Context) activity, next2)) {
                    arrayList.add(new com.bytedance.ies.powerpermissions.c.a(next2, a.EnumC0768a.GRANTED));
                } else if (j.a((Activity) activity, next2)) {
                    arrayList.add(new com.bytedance.ies.powerpermissions.c.a(next2, a.EnumC0768a.DENIED_PERMANENT));
                } else {
                    arrayList.add(new com.bytedance.ies.powerpermissions.c.a(next2, a.EnumC0768a.THIS_OPERATION_NOT_PERMITTED));
                }
            }
            f fVar = this.f34445a;
            if (fVar != null) {
                Object[] array = arrayList.toArray(new com.bytedance.ies.powerpermissions.c.a[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                com.bytedance.ies.powerpermissions.c.a[] aVarArr = (com.bytedance.ies.powerpermissions.c.a[]) array;
                fVar.a((com.bytedance.ies.powerpermissions.c.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
            }
            m mVar = this.f34447c;
            if (mVar == null) {
                b();
            } else if (mVar.f34472b.isEmpty()) {
                b();
            } else {
                mVar.a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == this.f34448e) {
            new Handler().postDelayed(new RunnableC0767b(this), 300);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.c(strArr, "");
        l.c(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == this.f34448e && strArr.length != 0 && iArr.length != 0) {
            a(strArr, iArr);
        }
    }
}
