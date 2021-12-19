package com.bytedance.ies.powerpreload.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.c;
import com.bytedance.ies.powerpreload.task.c;
import com.bytedance.ies.powerpreload.task.g;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static g f34477a;

    /* renamed from: b  reason: collision with root package name */
    public static b f34478b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f34479c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20619);
    }

    public static b a() {
        b bVar = f34478b;
        if (bVar == null) {
            l.a("config");
        }
        return bVar;
    }

    public static c c() {
        b bVar = f34478b;
        if (bVar == null) {
            l.a("config");
        }
        return bVar.f34482c;
    }

    public static boolean b() {
        if (!c.a.a()) {
            return false;
        }
        b bVar = f34478b;
        if (bVar == null) {
            l.a("config");
        }
        return bVar.f34481b;
    }

    public static void a(Exception exc) {
        l.c(exc, "");
        if (!b()) {
            exc.printStackTrace();
            return;
        }
        throw exc;
    }
}
