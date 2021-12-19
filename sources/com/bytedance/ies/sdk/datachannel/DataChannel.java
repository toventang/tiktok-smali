package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class DataChannel extends BaseDataChannel {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34573e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public m f34574d;

    static {
        Covode.recordClassIndex(20683);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20684);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static DataChannel a(ad adVar, m mVar) {
            l.c(adVar, "");
            l.c(mVar, "");
            ac a2 = adVar.a(DataChannel.class);
            l.a((Object) a2, "");
            DataChannel dataChannel = (DataChannel) a2;
            dataChannel.f34574d = mVar;
            return dataChannel;
        }
    }

    public final DataChannel b(Object obj) {
        l.c(obj, "");
        a(obj);
        return this;
    }

    public final <T extends h<z>> DataChannel c(Class<T> cls) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(z.f158842a);
            }
        } else {
            t tVar = (t) a((Class) cls);
            if (tVar != null) {
                tVar.setValue(z.f158842a);
            }
        }
        return this;
    }

    public final <T extends g<O>, O> O b(Class<T> cls) {
        l.c(cls, "");
        g gVar = (g) a((Class) cls);
        if (gVar != null) {
            return (O) gVar.getValue();
        }
        return null;
    }

    public final <T extends m<O>, O> DataChannel a(Class<T> cls, b<? super O, z> bVar) {
        l.c(cls, "");
        l.c(bVar, "");
        m mVar = this.f34574d;
        if (mVar == null) {
            l.a("lifecycleOwner");
        }
        a(cls, mVar, false, bVar);
        return this;
    }

    public final <T extends m<O>, O> DataChannel b(Class<T> cls, b<? super O, z> bVar) {
        l.c(cls, "");
        l.c(bVar, "");
        m mVar = this.f34574d;
        if (mVar == null) {
            l.a("lifecycleOwner");
        }
        a(cls, mVar, true, bVar);
        return this;
    }

    public final <T extends d<O>, O> DataChannel a(Class<T> cls, O o) {
        l.c(cls, "");
        a aVar = (a) a((Class) cls);
        if (aVar != null) {
            aVar.f34576a = o;
        }
        return this;
    }

    public final <T extends c<O>, O> DataChannel b(Class<T> cls, O o) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            t tVar = (t) a((Class) cls);
            if (tVar != null) {
                tVar.setValue(o);
            }
        }
        return this;
    }

    public final <T extends h<O>, O> DataChannel c(Class<T> cls, O o) {
        l.c(cls, "");
        if (a()) {
            LiveData liveData = (LiveData) a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            t tVar = (t) a((Class) cls);
            if (tVar != null) {
                tVar.setValue(o);
            }
        }
        return this;
    }

    public final <T extends m<O>, O> DataChannel a(m mVar, Class<T> cls, b<? super O, z> bVar) {
        l.c(cls, "");
        l.c(bVar, "");
        if (mVar == null && (mVar = this.f34574d) == null) {
            l.a("lifecycleOwner");
        }
        a(cls, mVar, false, bVar);
        return this;
    }

    public final <T extends m<O>, O> DataChannel b(m mVar, Class<T> cls, b<? super O, z> bVar) {
        l.c(cls, "");
        l.c(bVar, "");
        if (mVar == null && (mVar = this.f34574d) == null) {
            l.a("lifecycleOwner");
        }
        a(cls, mVar, true, bVar);
        return this;
    }

    public final <T extends m<O>, O> DataChannel a(Object obj, Class<T> cls, b<? super O, z> bVar) {
        l.c(obj, "");
        l.c(cls, "");
        l.c(bVar, "");
        a(obj, null, cls, false, bVar);
        return this;
    }

    public final <T extends m<O>, O> DataChannel b(Object obj, Class<T> cls, b<? super O, z> bVar) {
        l.c(obj, "");
        l.c(cls, "");
        l.c(bVar, "");
        a(obj, null, cls, true, bVar);
        return this;
    }

    private final <T extends m<O>, O> void a(Class<T> cls, m mVar, boolean z, b<? super O, z> bVar) {
        m mVar2 = (m) a((Class) cls);
        if (mVar2 != null) {
            mVar2.a(mVar, bVar, z);
        }
    }
}
