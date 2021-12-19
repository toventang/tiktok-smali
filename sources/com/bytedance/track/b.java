package com.bytedance.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.g;
import com.bytedance.provider.h;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public interface b<T extends h> extends h {
    static {
        Covode.recordClassIndex(27208);
    }

    T makeCopy();

    public static final class a {
        static {
            Covode.recordClassIndex(27209);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.track.b$a$a  reason: collision with other inner class name */
        public static final class C1087a extends m implements h.f.a.b<h, h> {
            final /* synthetic */ h $data$inlined;

            static {
                Covode.recordClassIndex(27210);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1087a(h hVar) {
                super(1);
                this.$data$inlined = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h invoke(h hVar) {
                l.c(hVar, "");
                return this.$data$inlined;
            }
        }

        public static <T extends h> void a(b<T> bVar, h.f.a.a<? extends T> aVar) {
            l.c(aVar, "");
            CopyOnWriteArraySet<com.bytedance.provider.b<?>> copyOnWriteArraySet = g.f42000d.get(bVar.getSourceId());
            if (!(copyOnWriteArraySet instanceof Set)) {
                copyOnWriteArraySet = null;
            }
            CopyOnWriteArraySet<com.bytedance.provider.b<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
            if (copyOnWriteArraySet2 != null) {
                h hVar = (h) aVar.invoke();
                Iterator<T> it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    it.next().a(new C1087a(hVar));
                }
            }
        }
    }
}
