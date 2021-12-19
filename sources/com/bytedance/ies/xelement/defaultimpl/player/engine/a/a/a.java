package com.bytedance.ies.xelement.defaultimpl.player.engine.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a<Element> {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<Element> f36836a = new CopyOnWriteArrayList<>();

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0897a<Element> {
        static {
            Covode.recordClassIndex(22110);
        }

        void a(Element element);
    }

    static {
        Covode.recordClassIndex(22109);
    }

    public static final class b implements AbstractC0897a<Element> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f36837a;

        static {
            Covode.recordClassIndex(22111);
        }

        b(h.f.a.b bVar) {
            this.f36837a = bVar;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a.AbstractC0897a
        public final void a(Element element) {
            this.f36837a.invoke(element);
        }
    }

    public final void b(Element element) {
        this.f36836a.remove(element);
    }

    public final void a(Element element) {
        if (!this.f36836a.contains(element)) {
            this.f36836a.add(element);
        }
    }

    public final void a(h.f.a.b<? super Element, z> bVar) {
        l.c(bVar, "");
        b bVar2 = new b(bVar);
        l.c(bVar2, "");
        for (Element element : this.f36836a) {
            try {
                bVar2.a(element);
            } catch (Exception unused) {
            }
        }
    }
}
