package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f54625a;

    /* renamed from: b  reason: collision with root package name */
    final String f54626b;

    /* renamed from: c  reason: collision with root package name */
    final String f54627c;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f54628d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f54629e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54630f = false;

    static {
        Covode.recordClassIndex(33898);
    }

    public final String a() {
        String peek;
        MethodCollector.i(6215);
        synchronized (this.f54628d) {
            try {
                peek = this.f54628d.peek();
            } finally {
                MethodCollector.o(6215);
            }
        }
        return peek;
    }

    public final boolean a(Object obj) {
        boolean remove;
        MethodCollector.i(6146);
        synchronized (this.f54628d) {
            try {
                remove = this.f54628d.remove(obj);
                if (remove && !this.f54630f) {
                    this.f54629e.execute(new s(this));
                }
            } finally {
                MethodCollector.o(6146);
            }
        }
        return remove;
    }

    private r(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f54625a = sharedPreferences;
        this.f54626b = str;
        this.f54627c = str2;
        this.f54629e = executor;
    }

    static r a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        MethodCollector.i(5848);
        r rVar = new r(sharedPreferences, str, str2, executor);
        synchronized (rVar.f54628d) {
            try {
                rVar.f54628d.clear();
                String string = rVar.f54625a.getString(rVar.f54626b, "");
                if (!TextUtils.isEmpty(string) && string.contains(rVar.f54627c)) {
                    String[] split = string.split(rVar.f54627c, -1);
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            rVar.f54628d.add(str3);
                        }
                    }
                }
            } finally {
                MethodCollector.o(5848);
            }
        }
        return rVar;
    }
}
