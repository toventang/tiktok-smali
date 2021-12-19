package com.ss.ugc.live.barrage;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.a.a;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a extends CopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a> {
    private AbstractC4097a onChangerListener;

    /* renamed from: com.ss.ugc.live.barrage.a$a  reason: collision with other inner class name */
    public interface AbstractC4097a {
        static {
            Covode.recordClassIndex(102730);
        }

        void a(boolean z, com.ss.ugc.live.barrage.a.a aVar);
    }

    static {
        Covode.recordClassIndex(102729);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(com.ss.ugc.live.barrage.a.a aVar) {
        return super.contains((Object) aVar);
    }

    public final /* bridge */ int indexOf(com.ss.ugc.live.barrage.a.a aVar) {
        return super.indexOf((Object) aVar);
    }

    public final /* bridge */ int lastIndexOf(com.ss.ugc.live.barrage.a.a aVar) {
        return super.lastIndexOf((Object) aVar);
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final com.ss.ugc.live.barrage.a.a remove(int i2) {
        return remove(i2);
    }

    public final void setOnChangeListener(AbstractC4097a aVar) {
        l.c(aVar, "");
        this.onChangerListener = aVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof com.ss.ugc.live.barrage.a.a)) {
            return contains((com.ss.ugc.live.barrage.a.a) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof com.ss.ugc.live.barrage.a.a)) {
            return indexOf((com.ss.ugc.live.barrage.a.a) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof com.ss.ugc.live.barrage.a.a)) {
            return lastIndexOf((com.ss.ugc.live.barrage.a.a) obj);
        }
        return -1;
    }

    public final boolean remove(com.ss.ugc.live.barrage.a.a aVar) {
        boolean remove = super.remove((Object) aVar);
        if (aVar != null) {
            aVar.a(a.AbstractC4098a.C4099a.f154069a);
            AbstractC4097a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(false, aVar);
            }
        }
        return remove;
    }

    /* renamed from: removeAt */
    public final com.ss.ugc.live.barrage.a.a remove(int i2) {
        com.ss.ugc.live.barrage.a.a aVar = (com.ss.ugc.live.barrage.a.a) super.remove(i2);
        if (aVar != null) {
            aVar.a(a.AbstractC4098a.C4099a.f154069a);
            AbstractC4097a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(false, aVar);
            }
        }
        l.a((Object) aVar, "");
        return aVar;
    }

    public final boolean add(com.ss.ugc.live.barrage.a.a aVar) {
        l.c(aVar, "");
        boolean add = super.add((Object) aVar);
        aVar.a(a.AbstractC4098a.d.f154072a);
        AbstractC4097a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.a(true, aVar);
        }
        return add;
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof com.ss.ugc.live.barrage.a.a)) {
            return remove((com.ss.ugc.live.barrage.a.a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.c(collection, "");
        boolean removeAll = super.removeAll(collection);
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            com.ss.ugc.live.barrage.a.a aVar = (com.ss.ugc.live.barrage.a.a) it.next();
            if (aVar != null) {
                aVar.a(a.AbstractC4098a.C4099a.f154069a);
                AbstractC4097a aVar2 = this.onChangerListener;
                if (aVar2 != null) {
                    aVar2.a(false, aVar);
                }
            }
        }
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(Collection<? extends com.ss.ugc.live.barrage.a.a> collection) {
        l.c(collection, "");
        boolean addAll = super.addAll(collection);
        for (com.ss.ugc.live.barrage.a.a aVar : collection) {
            aVar.a(a.AbstractC4098a.d.f154072a);
            AbstractC4097a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(true, aVar);
            }
        }
        return addAll;
    }

    public final void add(int i2, com.ss.ugc.live.barrage.a.a aVar) {
        l.c(aVar, "");
        super.add(i2, (Object) aVar);
        aVar.a(a.AbstractC4098a.d.f154072a);
        AbstractC4097a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.a(true, aVar);
        }
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(int i2, Collection<? extends com.ss.ugc.live.barrage.a.a> collection) {
        l.c(collection, "");
        boolean addAll = super.addAll(i2, collection);
        for (com.ss.ugc.live.barrage.a.a aVar : collection) {
            aVar.a(a.AbstractC4098a.d.f154072a);
            AbstractC4097a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(true, aVar);
            }
        }
        return addAll;
    }
}
