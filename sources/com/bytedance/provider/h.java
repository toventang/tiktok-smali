package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public interface h {
    static {
        Covode.recordClassIndex(25684);
    }

    String getSourceId();

    public static final class a {
        static {
            Covode.recordClassIndex(25685);
        }

        /* renamed from: com.bytedance.provider.h$a$a  reason: collision with other inner class name */
        static final class C1031a extends m implements b<h, h> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(25686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1031a(h hVar) {
                super(1);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h invoke(h hVar) {
                l.c(hVar, "");
                return this.this$0;
            }
        }

        public static void a(h hVar, h.f.a.a<z> aVar) {
            l.c(aVar, "");
            CopyOnWriteArraySet<b<?>> copyOnWriteArraySet = g.f42000d.get(hVar.getSourceId());
            if (!(copyOnWriteArraySet instanceof Set)) {
                copyOnWriteArraySet = null;
            }
            CopyOnWriteArraySet<b<?>> copyOnWriteArraySet2 = copyOnWriteArraySet;
            if (copyOnWriteArraySet2 != null) {
                aVar.invoke();
                Iterator<T> it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    it.next().a(new C1031a(hVar));
                }
            }
        }
    }
}
