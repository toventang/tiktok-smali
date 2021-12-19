package com.ss.android.ttve.nativePort;

import android.content.Context;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.runtime.g;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile f f61343a = f.NOT_LOAD;

    /* renamed from: b  reason: collision with root package name */
    public static final String f61344b = d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public static AbstractC1335d f61345c = null;

    /* renamed from: d  reason: collision with root package name */
    public static c f61346d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Context f61347e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f61348f = false;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f61349g;

    /* renamed from: h  reason: collision with root package name */
    private static AbstractC1335d f61350h = new b();

    /* renamed from: i  reason: collision with root package name */
    private static c f61351i = new a();

    /* renamed from: j  reason: collision with root package name */
    private static ArrayList<e> f61352j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private static List<String> f61353k = EffectSDKBuildConfig.getEffectLibs();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f61354l = false;

    public static class a implements c {
        static {
            Covode.recordClassIndex(37764);
        }

        @Override // com.ss.android.ttve.nativePort.d.c
        public final void a(String[] strArr) {
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(37766);
        }

        void a(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.d$d  reason: collision with other inner class name */
    public interface AbstractC1335d {
        static {
            Covode.recordClassIndex(37767);
        }

        boolean a(List<String> list);
    }

    public static synchronized void b() {
        synchronized (d.class) {
            MethodCollector.i(142);
            a();
            MethodCollector.o(142);
        }
    }

    public static synchronized void c() {
        synchronized (d.class) {
            MethodCollector.i(143);
            a();
            MethodCollector.o(143);
        }
    }

    public static synchronized void d() {
        synchronized (d.class) {
            MethodCollector.i(144);
            a();
            MethodCollector.o(144);
        }
    }

    public enum f {
        NOT_LOAD,
        LOADING,
        LOADED;

        static {
            Covode.recordClassIndex(37769);
        }
    }

    static {
        Covode.recordClassIndex(37763);
    }

    private static List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("x264");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("fdk-aac");
        arrayList.addAll(FFmpegLibLoaderWrapper.a());
        arrayList.add("yuv");
        arrayList.add("bytenn");
        arrayList.add("audioeffect");
        for (String str : f61353k) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        arrayList.add("lens");
        arrayList.add("ttvesdk");
        arrayList.add("bytebench");
        return arrayList;
    }

    public static synchronized void a() {
        synchronized (d.class) {
            MethodCollector.i(140);
            if (!f61349g) {
                if (f61343a != f.LOADED) {
                    List<String> e2 = e();
                    String[] strArr = new String[e2.size()];
                    for (int i2 = 0; i2 < e2.size(); i2++) {
                        if (!e2.get(i2).contentEquals("c++_shared") && !e2.get(i2).contentEquals("ttboringssl") && !e2.get(i2).contentEquals("ttcrypto")) {
                            strArr[i2] = "lib" + e2.get(i2) + ".so";
                        }
                    }
                    f61343a = f.LOADING;
                    AbstractC1335d dVar = f61345c;
                    if (dVar != null) {
                        if (!dVar.a(e2)) {
                            f61343a = f.NOT_LOAD;
                            MethodCollector.o(140);
                            return;
                        }
                    } else if (!f61350h.a(e2)) {
                        f61343a = f.NOT_LOAD;
                        MethodCollector.o(140);
                        return;
                    }
                    f61343a = f.LOADED;
                    c cVar = f61346d;
                    if (cVar != null) {
                        cVar.a(strArr);
                    }
                }
                MethodCollector.o(140);
                return;
            }
            a("ttvesdk");
            MethodCollector.o(140);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f61355a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f61356b;

        static {
            Covode.recordClassIndex(37768);
        }

        public e(String str) {
            this.f61355a = str;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            MethodCollector.i(138);
            f61347e = context;
            MethodCollector.o(138);
        }
    }

    public static class b implements AbstractC1335d {
        static {
            Covode.recordClassIndex(37765);
        }

        @Override // com.ss.android.ttve.nativePort.d.AbstractC1335d
        public final boolean a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                com.ss.android.ttve.log.a.a(3, "Start loadLibrary ".concat(String.valueOf(str)));
                if (!g.a(str, d.f61347e)) {
                    return false;
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            return true;
        }
    }

    private static void a(String str) {
        if (f61352j.size() <= 0) {
            List<String> e2 = e();
            Collections.reverse(e2);
            for (String str2 : e2) {
                f61352j.add(new e(str2));
            }
        }
        LinkedList linkedList = new LinkedList();
        Iterator<e> it = f61352j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e next = it.next();
            if (str == next.f61355a) {
                if (!next.f61356b) {
                    next.f61356b = true;
                    linkedList.add(next.f61355a);
                } else {
                    return;
                }
            }
        }
        while (it.hasNext()) {
            e next2 = it.next();
            if (next2.f61356b) {
                break;
            }
            next2.f61356b = true;
            linkedList.add(next2.f61355a);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            strArr[i2] = "lib" + ((String) linkedList.get(i2)) + ".so";
        }
        f61343a = f.LOADING;
        AbstractC1335d dVar = f61345c;
        if (dVar != null) {
            if (!dVar.a(linkedList)) {
                f61343a = f.NOT_LOAD;
                return;
            }
        } else if (!f61350h.a(linkedList)) {
            f61343a = f.NOT_LOAD;
            return;
        }
        f61343a = f.LOADED;
        c cVar = f61346d;
        if (cVar != null) {
            cVar.a(strArr);
        }
    }
}
