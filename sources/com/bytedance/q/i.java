package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class i implements b, Serializable {
    public Map<String, Object> mBundleData;
    private int mIndex;
    protected f mInterceptorFactory;
    private List<h> mPipes;
    private d mPreInterceptor;

    static {
        Covode.recordClassIndex(25901);
    }

    @Override // com.bytedance.q.b
    public final Object a() {
        this.mIndex = 0;
        this.mPreInterceptor = null;
        return a((Object) null);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends Exception {
        static {
            Covode.recordClassIndex(25902);
        }

        a(Throwable th) {
            super(th);
        }
    }

    @Override // com.bytedance.q.b
    public final Object a(String str) {
        return this.mBundleData.get(str);
    }

    private d c(Class cls) {
        d dVar = this.mPreInterceptor;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f42370d;
        }
        return dVar;
    }

    @Override // com.bytedance.q.b
    public final Object a(Class cls) {
        d c2 = c(cls);
        if (c2 != null) {
            return c2.f42371e;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bytedance.q.b
    public final Object b(Class cls) {
        d c2 = c(cls);
        if (c2 != null) {
            return c2.f42372f;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.q.b
    public final Object a(Object obj) {
        d dVar = this.mPreInterceptor;
        if (dVar != null) {
            dVar.f42372f = obj;
            d dVar2 = this.mPreInterceptor;
            if (dVar2.f42373g != null) {
                dVar2.f42373g.b(dVar2.f42374h, dVar2);
            }
        }
        if (this.mIndex >= this.mPipes.size()) {
            return obj;
        }
        h hVar = this.mPipes.get(this.mIndex);
        Class<? extends d> cls = hVar.f42376a;
        d dVar3 = (d) this.mInterceptorFactory.a(cls);
        if (dVar3 != null) {
            com.bytedance.q.b.a aVar = hVar.f42377b;
            i iVar = new i(this.mPipes, this.mIndex + 1, this.mInterceptorFactory, dVar3);
            iVar.mBundleData = this.mBundleData;
            d dVar4 = this.mPreInterceptor;
            Object[] objArr = hVar.f42378c;
            dVar3.f42374h = new m(iVar);
            dVar3.f42370d = dVar4;
            dVar3.f42371e = obj;
            dVar3.f42373g = aVar;
            if (dVar3.f42370d != null) {
                dVar3.f42375i = dVar3.f42370d.f42375i;
            } else {
                dVar3.f42375i = d.f42369c.getAndIncrement();
                if (dVar3.f42375i < 0) {
                    throw new RuntimeException("Pipeline ID use up!");
                }
            }
            dVar3.a(objArr);
            if (dVar3.f42373g != null) {
                dVar3.f42373g.a(dVar3.f42374h, dVar3);
            }
            try {
                Object a2 = dVar3.a(iVar, obj);
                if (dVar3.f42373g != null) {
                    dVar3.f42373g.c(dVar3.f42374h, dVar3);
                }
                return a2;
            } catch (a e2) {
                Throwable cause = e2.getCause();
                if (dVar3.f42373g != null) {
                    dVar3.f42373g.b(dVar3.f42374h, dVar3, cause);
                }
                throw e2;
            } catch (Throwable th) {
                if (dVar3.f42373g != null) {
                    dVar3.f42373g.a(dVar3.f42374h, dVar3, th);
                }
                throw new a(th);
            }
        } else {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
    }

    @Override // com.bytedance.q.b
    public final void a(String str, Object obj) {
        this.mBundleData.put(str, obj);
    }

    i(List<h> list, int i2, f fVar, d dVar) {
        HashMap hashMap = new HashMap();
        this.mBundleData = hashMap;
        this.mPipes = list;
        this.mIndex = i2;
        this.mInterceptorFactory = fVar;
        this.mPreInterceptor = dVar;
        hashMap.put("req_type", 1);
        this.mBundleData.put("sync_task_id", 0);
    }
}
