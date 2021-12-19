package com.bytedance.storagehandler;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.v.b;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StorageFilter {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f44106a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile List<b> f44107b;

    public static native void configStack(int i2, boolean z);

    public static native void init(String str);

    public static native void test();

    static {
        Covode.recordClassIndex(26968);
        ByteHook.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("storagehandlerlib", false, (Context) null);
        m.a(uptimeMillis, "storagehandlerlib");
    }

    private static boolean onDelete(String str) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        for (b bVar : list) {
            if (!(bVar == null || bVar.a(str))) {
                return false;
            }
        }
        return true;
    }

    private static boolean onMkdir(String str) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onOpen(String str) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    public static void a(b bVar) {
        MethodCollector.i(8600);
        ArrayList arrayList = new ArrayList();
        synchronized (f44106a) {
            try {
                if (f44107b != null) {
                    for (b bVar2 : f44107b) {
                        arrayList.add(bVar2);
                    }
                }
                arrayList.add(bVar);
                f44107b = arrayList;
            } finally {
                MethodCollector.o(8600);
            }
        }
    }

    private static boolean onDeleteNative(String str, String str2) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        for (b bVar : list) {
            if (!(bVar == null || bVar.a(str, str2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean onMkdirNative(String str, String str2) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onMkfifoNative(String str, String str2) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onOpenNative(String str, String str2) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onLinkNative(String str, String str2, String str3) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static boolean onRenameNative(String str, String str2, String str3) {
        List<b> list = f44107b;
        if (list == null) {
            return true;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    private static void onIntercepted(String str, String str2, String str3, int i2, int i3) {
        boolean z;
        List<b> list = f44107b;
        if (list != null) {
            for (b bVar : list) {
                if (bVar != null) {
                    b.a aVar = b.a.values()[i2];
                    if (i3 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.a(str, str3, aVar, z);
                }
            }
        }
    }
}
