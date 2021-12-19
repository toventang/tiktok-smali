package com.bytedance.common.jato.a.a;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ArrayMap<String, SharedPreferences> f26763a;

    /* renamed from: b  reason: collision with root package name */
    public static ArrayMap<File, SharedPreferences> f26764b;

    /* renamed from: c  reason: collision with root package name */
    public static ArrayMap<String, File> f26765c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f26766d = true;

    /* renamed from: e  reason: collision with root package name */
    public static Application f26767e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f26768f = false;

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f26769g = false;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f26770h = false;

    /* renamed from: i  reason: collision with root package name */
    public static int f26771i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static Thread f26772j = Looper.getMainLooper().getThread();

    /* renamed from: k  reason: collision with root package name */
    private static ArrayList<b> f26773k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private static LinkedHashSet<b> f26774l = new LinkedHashSet<>();

    static {
        Covode.recordClassIndex(15794);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.a.a.a.a():void");
    }

    public static synchronized void b() {
        IOException e2;
        synchronized (a.class) {
            MethodCollector.i(7392);
            if (f26767e == null) {
                MethodCollector.o(7392);
                return;
            }
            BufferedWriter bufferedWriter = null;
            try {
                HashSet hashSet = new HashSet();
                hashSet.addAll(f26774l);
                hashSet.addAll(f26773k);
                ArrayList arrayList = new ArrayList(hashSet);
                Collections.sort(arrayList);
                File file = new File(f26767e.getFilesDir().toString() + "/jato_preload_sp_list.txt");
                if (!file.isFile()) {
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bufferedWriter2.write(((b) it.next()).toString() + "\n");
                    }
                    bufferedWriter2.close();
                    a(bufferedWriter2);
                    MethodCollector.o(7392);
                } catch (IOException e3) {
                    e2 = e3;
                    bufferedWriter = bufferedWriter2;
                    try {
                        e2.printStackTrace();
                    } finally {
                        a(bufferedWriter);
                        MethodCollector.o(7392);
                    }
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    a(bufferedWriter);
                    MethodCollector.o(7392);
                }
            } catch (IOException e4) {
                e2 = e4;
                e2.printStackTrace();
            } catch (Throwable unused2) {
                a(bufferedWriter);
                MethodCollector.o(7392);
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
