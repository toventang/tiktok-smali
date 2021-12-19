package com.bytedance.ies.powerlist.proxy;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f34432a = i.a((h.f.a.a) c.f34433a);

    static {
        Covode.recordClassIndex(20567);
    }

    public final CopyOnWriteArrayList<ListVMProxy<?, ?>> a() {
        return (CopyOnWriteArrayList) this.f34432a.getValue();
    }

    static final class c extends m implements h.f.a.a<CopyOnWriteArrayList<ListVMProxy<?, ?>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34433a = new c();

        static {
            Covode.recordClassIndex(20570);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<ListVMProxy<?, ?>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.proxy.b$b  reason: collision with other inner class name */
    public static final class C0765b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ ListVMProxy $innerProxy;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0765b(b bVar, ListVMProxy listVMProxy) {
            super(0);
            this.this$0 = bVar;
            this.$innerProxy = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.a().indexOf(this.$innerProxy));
        }
    }

    public static final class a extends m implements h.f.a.b<com.bytedance.ies.powerlist.b.a, z> {
        final /* synthetic */ ListVMProxy $innerProxy;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, ListVMProxy listVMProxy) {
            super(1);
            this.this$0 = bVar;
            this.$innerProxy = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.powerlist.b.a aVar) {
            int indexOf;
            if (aVar != null && (indexOf = this.this$0.a().indexOf(this.$innerProxy)) >= 0) {
                ListVMProxy listVMProxy = this.$innerProxy;
                l.c(aVar, "");
                com.bytedance.tiktok.proxy.b<R, ITEM> bVar = listVMProxy.f34423c;
                if (bVar != null) {
                    bVar.a(indexOf, aVar);
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, int i3) {
        ListVMProxy[] listVMProxyArr = new ListVMProxy[i3];
        Arrays.fill(listVMProxyArr, (Object) null);
        if (a().size() >= i2) {
            a().addAll(i2, h.a.i.j(listVMProxyArr));
        }
    }

    public final void b(int i2, int i3) {
        if (a().size() > i2) {
            List<ListVMProxy<?, ?>> subList = a().subList(i2, h.j.h.c(i3 + i2, a().size()));
            l.a((Object) subList, "");
            int size = subList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ListVMProxy<?, ?> remove = a().remove(i2);
                if (remove != null) {
                    remove.d();
                }
            }
        }
    }
}
