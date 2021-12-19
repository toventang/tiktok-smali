package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class DataChannelGlobal extends BaseDataChannel {

    /* renamed from: d  reason: collision with root package name */
    public static final DataChannelGlobal f34575d = new DataChannelGlobal();

    private DataChannelGlobal() {
    }

    static {
        Covode.recordClassIndex(20685);
    }

    @Override // com.bytedance.ies.sdk.datachannel.BaseDataChannel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f34569b.clear();
        this.f34570c.clear();
    }

    public final void b(Object obj) {
        l.c(obj, "");
        a(obj);
    }

    public final <T extends j<O>, O> void c(Class<T> cls) {
        l.c(cls, "");
        this.f34569b.remove(cls);
    }

    public final <T extends k<O>, O> O b(Class<T> cls) {
        l.c(cls, "");
        k kVar = (k) a((Class) cls);
        if (kVar != null) {
            return (O) kVar.getValue();
        }
        return null;
    }

    public final <T extends l<z>> void d(Class<T> cls) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(z.f158842a);
                return;
            }
            return;
        }
        t tVar = (t) a((Class) cls);
        if (tVar != null) {
            tVar.setValue(z.f158842a);
        }
    }

    public final <T extends j<O>, O> void a(Class<T> cls, O o) {
        l.c(cls, "");
        a aVar = (a) a((Class) cls);
        if (aVar != null) {
            aVar.f34576a = o;
        }
    }

    public final <T extends i<O>, O> void b(Class<T> cls, O o) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        t tVar = (t) a((Class) cls);
        if (tVar != null) {
            tVar.setValue(o);
        }
    }

    public final <T extends l<O>, O> void c(Class<T> cls, O o) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        t tVar = (t) a((Class) cls);
        if (tVar != null) {
            tVar.setValue(o);
        }
    }

    public final <T extends m<O>, O> void a(Object obj, Class<T> cls, b<? super O, z> bVar) {
        l.c(obj, "");
        l.c(cls, "");
        l.c(bVar, "");
        a(obj, null, cls, false, bVar);
    }

    public final <T extends m<O>, O> void a(Object obj, m mVar, Class<T> cls, b<? super O, z> bVar) {
        l.c(obj, "");
        l.c(mVar, "");
        l.c(cls, "");
        l.c(bVar, "");
        a(obj, mVar, cls, false, bVar);
    }
}
