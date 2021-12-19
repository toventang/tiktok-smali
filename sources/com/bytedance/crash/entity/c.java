package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.i;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentLinkedQueue<i> f27559a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f27560b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentHashMap<Integer, i> f27561c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(16186);
    }

    public static JSONArray a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<i> it = f27559a.iterator();
        while (true) {
            if (it.hasNext()) {
                i next = it.next();
                if (next != null && next.a(obj)) {
                    jSONArray.put(next.a(CrashType.JAVA));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    public static JSONArray b(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<i> it = f27559a.iterator();
        while (true) {
            if (it.hasNext()) {
                i next = it.next();
                if (next != null && next.a(obj)) {
                    jSONArray.put(next.b(CrashType.JAVA));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    public static String c(Object obj) {
        if (obj == f27560b) {
            return d.a(m.a());
        }
        Iterator<i> it = f27559a.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (next != null && next.a(obj)) {
                return next.b();
            }
        }
        return null;
    }
}
