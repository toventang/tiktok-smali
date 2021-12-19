package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.ext.list.o;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ListState<T, P extends o> implements af {
    private final b isEmpty;
    private final List<T> list;
    private final a<List<T>> loadMore;
    private final P payload;
    private final a<List<T>> refresh;

    static {
        Covode.recordClassIndex(24214);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.arch.ext.list.ListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListState copy$default(ListState listState, o oVar, List list2, a aVar, a aVar2, b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            oVar = listState.payload;
        }
        if ((i2 & 2) != 0) {
            list2 = listState.list;
        }
        if ((i2 & 4) != 0) {
            aVar = listState.refresh;
        }
        if ((i2 & 8) != 0) {
            aVar2 = listState.loadMore;
        }
        if ((i2 & 16) != 0) {
            bVar = listState.isEmpty;
        }
        return listState.copy(oVar, list2, aVar, aVar2, bVar);
    }

    public final P component1() {
        return this.payload;
    }

    public final List<T> component2() {
        return this.list;
    }

    public final a<List<T>> component3() {
        return this.refresh;
    }

    public final a<List<T>> component4() {
        return this.loadMore;
    }

    public final b component5() {
        return this.isEmpty;
    }

    public final ListState<T, P> copy(P p, List<? extends T> list2, a<? extends List<? extends T>> aVar, a<? extends List<? extends T>> aVar2, b bVar) {
        l.c(p, "");
        l.c(list2, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(bVar, "");
        return new ListState<>(p, list2, aVar, aVar2, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListState)) {
            return false;
        }
        ListState listState = (ListState) obj;
        return l.a(this.payload, listState.payload) && l.a(this.list, listState.list) && l.a(this.refresh, listState.refresh) && l.a(this.loadMore, listState.loadMore) && l.a(this.isEmpty, listState.isEmpty);
    }

    public final int hashCode() {
        P p = this.payload;
        int i2 = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        List<T> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        a<List<T>> aVar = this.refresh;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<List<T>> aVar2 = this.loadMore;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        b bVar = this.isEmpty;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ListState(payload=" + this.payload + ", list=" + this.list + ", refresh=" + this.refresh + ", loadMore=" + this.loadMore + ", isEmpty=" + this.isEmpty + ")";
    }

    public final List<T> getList() {
        return this.list;
    }

    public final a<List<T>> getLoadMore() {
        return this.loadMore;
    }

    public final P getPayload() {
        return this.payload;
    }

    public final a<List<T>> getRefresh() {
        return this.refresh;
    }

    public final b isEmpty() {
        return this.isEmpty;
    }

    public final b getHasMore() {
        return this.payload.f39459a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.jedi.arch.a<? extends java.util.List<? extends T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.a<? extends java.util.List<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ListState(P p, List<? extends T> list2, a<? extends List<? extends T>> aVar, a<? extends List<? extends T>> aVar2, b bVar) {
        l.c(p, "");
        l.c(list2, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(bVar, "");
        this.payload = p;
        this.list = list2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.isEmpty = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListState(o oVar, List list2, a aVar, a aVar2, b bVar, int i2, g gVar) {
        this(oVar, (i2 & 2) != 0 ? z.INSTANCE : list2, (i2 & 4) != 0 ? aq.f39400a : aVar, (i2 & 8) != 0 ? aq.f39400a : aVar2, (i2 & 16) != 0 ? new b(false) : bVar);
    }
}
