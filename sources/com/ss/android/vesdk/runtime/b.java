package com.ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f151426a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f151427b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f151428c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f151429d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f151430e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f151431f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f151432g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f151433h;

    /* renamed from: i  reason: collision with root package name */
    public int f151434i;

    /* renamed from: j  reason: collision with root package name */
    public int f151435j;

    /* renamed from: k  reason: collision with root package name */
    public int f151436k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<String> f151437l = new ArrayList<>();

    static {
        Covode.recordClassIndex(99576);
    }

    public b(String str) {
        this.f151426a = str;
    }

    public final String a(String str) {
        String str2 = f.a(this.f151426a, "concat") + File.separator + str + "_reverse.mp4";
        this.f151437l.add(str2);
        return str2;
    }

    public static boolean a(File file) {
        MethodCollector.i(1934);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1934);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1934);
        return delete;
    }
}
