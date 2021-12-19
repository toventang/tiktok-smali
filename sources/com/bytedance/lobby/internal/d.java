package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.c.a;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f40245a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, com.bytedance.lobby.auth.d> f40246b = new a();

    static {
        Covode.recordClassIndex(24806);
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(8091);
        if (f40245a == null) {
            synchronized (d.class) {
                try {
                    if (f40245a == null) {
                        f40245a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8091);
                    throw th;
                }
            }
        }
        d dVar = f40245a;
        MethodCollector.o(8091);
        return dVar;
    }

    public final boolean a(String str) {
        com.bytedance.lobby.auth.d b2 = b(str);
        if (b2 == null || !b2.t_()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(com.bytedance.lobby.auth.d dVar) {
        MethodCollector.i(8164);
        this.f40246b.put(dVar.e().f40176b, dVar);
        MethodCollector.o(8164);
    }

    public final synchronized com.bytedance.lobby.auth.d b(String str) {
        MethodCollector.i(8238);
        LobbyCore.tryInitProviderConfig();
        com.bytedance.lobby.auth.d dVar = this.f40246b.get(str);
        if (dVar != null) {
            dVar.f();
            MethodCollector.o(8238);
            return dVar;
        }
        MethodCollector.o(8238);
        return null;
    }

    public static void a(c cVar) {
        Bundle bundle;
        MethodCollector.i(8176);
        if (cVar.f40169d == null) {
            bundle = new Bundle();
        } else {
            bundle = cVar.f40169d;
        }
        bundle.putString("provider_id", cVar.f40167b);
        bundle.putInt("action_type", 1);
        if (cVar.f40168c != null) {
            a a2 = a.a();
            String str = cVar.f40167b;
            com.bytedance.lobby.auth.a aVar = cVar.f40168c;
            synchronized (a2.f40238a) {
                try {
                    e<String, Integer> eVar = new e<>(str, 1);
                    List<com.bytedance.lobby.auth.a> list = a2.f40238a.get(eVar);
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        a2.f40238a.put(eVar, arrayList);
                    } else if (!list.contains(aVar)) {
                        list.add(aVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8176);
                    throw th;
                }
            }
        }
        Intent intent = new Intent(cVar.f40166a, LobbyInvisibleActivity.class);
        intent.putExtras(bundle);
        cVar.f40166a.startActivityForResult(intent, 101);
        MethodCollector.o(8176);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r5 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.String> r5, int r6) {
        /*
            r4 = this;
            boolean r0 = com.bytedance.lobby.a.f40144a
            r3 = 0
            if (r0 == 0) goto L_0x004c
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x003f
        L_0x000d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0014
            r3 = 1
        L_0x0014:
            com.bytedance.lobby.internal.LobbyCore.tryInitProviderConfig()
            java.util.Map<java.lang.String, com.bytedance.lobby.auth.d> r0 = r4.f40246b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r2.next()
            com.bytedance.lobby.auth.d r1 = (com.bytedance.lobby.auth.d) r1
            if (r3 == 0) goto L_0x003b
            com.bytedance.lobby.d r0 = r1.e()
            java.lang.String r0 = r0.f40176b
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0021
        L_0x003b:
            r1.a(r6)
            goto L_0x0021
        L_0x003f:
            r1 = 0
        L_0x0040:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x000d
            r5.get(r1)
            int r1 = r1 + 1
            goto L_0x0040
        L_0x004c:
            if (r5 == 0) goto L_0x0014
            goto L_0x000d
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.d.a(java.util.List, int):void");
    }
}
