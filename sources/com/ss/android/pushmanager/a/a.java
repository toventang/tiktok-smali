package com.ss.android.pushmanager.a;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f60093a = 20;

    /* renamed from: b  reason: collision with root package name */
    private final TreeMap<C1306a, C1306a> f60094b = new TreeMap<>(new Comparator<C1306a>() {
        /* class com.ss.android.pushmanager.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37130);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1306a aVar, C1306a aVar2) {
            C1306a aVar3 = aVar;
            C1306a aVar4 = aVar2;
            if (aVar3 == null) {
                return 1;
            }
            if (aVar4 == null) {
                return -1;
            }
            if (aVar3.equals(aVar4)) {
                return 0;
            }
            if (aVar3.f60097b > aVar4.f60097b) {
                return 1;
            }
            return -1;
        }
    });

    static {
        Covode.recordClassIndex(37129);
    }

    /* renamed from: com.ss.android.pushmanager.a.a$a  reason: collision with other inner class name */
    public class C1306a {

        /* renamed from: a  reason: collision with root package name */
        public Long f60096a;

        /* renamed from: b  reason: collision with root package name */
        public long f60097b;

        static {
            Covode.recordClassIndex(37131);
        }

        public final int hashCode() {
            return this.f60096a.hashCode();
        }

        public final String toString() {
            return String.valueOf(this.f60096a) + "|" + String.valueOf(this.f60097b);
        }

        public C1306a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1306a) || obj == null) {
                return super.equals(obj);
            }
            return this.f60096a.equals(((C1306a) obj).f60096a);
        }
    }

    public final synchronized String a() {
        String str;
        MethodCollector.i(8750);
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            Set<Map.Entry<C1306a, C1306a>> entrySet = this.f60094b.entrySet();
            int i2 = 0;
            for (Map.Entry<C1306a, C1306a> entry : entrySet) {
                C1306a value = entry.getValue();
                if (value != null) {
                    if (i2 != entrySet.size() - 1) {
                        sb.append(value.toString()).append("@");
                    } else {
                        sb.append(value.toString());
                    }
                    i2++;
                }
            }
            str = sb.toString();
            Logger.debug();
        } catch (Throwable unused) {
        }
        MethodCollector.o(8750);
        return str;
    }

    public final synchronized boolean a(C1306a aVar) {
        MethodCollector.i(8467);
        if (aVar == null) {
            MethodCollector.o(8467);
            return false;
        }
        boolean containsKey = this.f60094b.containsKey(aVar);
        Logger.debug();
        MethodCollector.o(8467);
        return containsKey;
    }

    public final synchronized C1306a b(C1306a aVar) {
        C1306a aVar2;
        Exception e2;
        MethodCollector.i(8470);
        try {
            aVar2 = this.f60094b.get(aVar);
            try {
                Logger.debug();
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar2 = null;
            e2.printStackTrace();
            MethodCollector.o(8470);
            return aVar2;
        }
        MethodCollector.o(8470);
        return aVar2;
    }

    public final synchronized void c(C1306a aVar) {
        MethodCollector.i(8480);
        try {
            Logger.debug();
            if (Logger.debug()) {
                a();
            }
            if (this.f60094b.size() >= this.f60093a && !a(aVar)) {
                Logger.debug();
                TreeMap<C1306a, C1306a> treeMap = this.f60094b;
                treeMap.remove(treeMap.firstKey());
            }
            if (a(aVar)) {
                Logger.debug();
                this.f60094b.remove(aVar);
            }
            this.f60094b.put(aVar, aVar);
            if (Logger.debug()) {
                a();
            }
            Logger.debug();
            MethodCollector.o(8480);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(8480);
        }
    }

    public final synchronized void a(String str) {
        String[] split;
        MethodCollector.i(8758);
        if (m.a(str)) {
            MethodCollector.o(8758);
            return;
        }
        Logger.debug();
        try {
            this.f60094b.clear();
            String[] split2 = str.split("@");
            if (split2 != null) {
                for (String str2 : split2) {
                    C1306a aVar = new C1306a();
                    if (!(str2 == null || (split = str2.split("\\|")) == null || split.length != 2)) {
                        aVar.f60096a = Long.valueOf(split[0]);
                        aVar.f60097b = Long.valueOf(split[1]).longValue();
                    }
                    c(aVar);
                }
            }
            MethodCollector.o(8758);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(8758);
        }
    }
}
