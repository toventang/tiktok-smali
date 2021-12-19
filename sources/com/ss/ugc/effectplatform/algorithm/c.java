package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.util.q;
import d.a.a.b;
import d.a.b.c.a;
import d.a.b.c.f;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final f f153452a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final b<String, h> f153453b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f153454c = new a(false);

    /* renamed from: d  reason: collision with root package name */
    public static final c f153455d = new c();

    private c() {
    }

    public static final void a() {
        f fVar = f153452a;
        fVar.f156552a.lock();
        try {
            f153453b.clear();
            f153454c.a(false);
        } finally {
            fVar.f156552a.unlock();
        }
    }

    static {
        Covode.recordClassIndex(102322);
    }

    /* JADX INFO: finally extract failed */
    public static final boolean a(String str) {
        if (q.ANDROID == q.PC || str == null) {
            return false;
        }
        f fVar = f153452a;
        fVar.f156552a.lock();
        try {
            h hVar = f153453b.get(str);
            fVar.f156552a.unlock();
            if (hVar == null) {
                d.a.e.b.a("AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!", null);
                return false;
            }
            g gVar = hVar.f153469a;
            ModelInfo modelInfo = hVar.f153470b;
            if (!l.a((Object) gVar.b(), (Object) modelInfo.getVersion())) {
                d.a.e.b.a("AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + gVar.b() + ", server version: " + modelInfo.getVersion(), null);
                return false;
            } else if (gVar.f153663c) {
                return true;
            } else {
                if (gVar.c() != modelInfo.getType()) {
                    d.a.e.b.a("AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + gVar.c() + ", server size: " + modelInfo.getType(), null);
                    return false;
                } else if (!(!l.a((Object) gVar.d(), (Object) com.ss.ugc.effectplatform.model.algorithm.c.a(modelInfo)))) {
                    return true;
                } else {
                    d.a.e.b.a("AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + gVar.d() + ", server md5: " + com.ss.ugc.effectplatform.model.algorithm.c.a(modelInfo), null);
                    return false;
                }
            }
        } catch (Throwable th) {
            fVar.f156552a.unlock();
            throw th;
        }
    }
}
