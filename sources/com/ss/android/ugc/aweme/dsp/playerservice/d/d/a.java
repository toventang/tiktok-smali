package com.ss.android.ugc.aweme.dsp.playerservice.d.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a<Element> {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<Element> f83515a = new CopyOnWriteArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.d.a$a  reason: collision with other inner class name */
    public interface AbstractC1974a<Element> {
        static {
            Covode.recordClassIndex(52122);
        }

        void a(Element element);
    }

    static {
        Covode.recordClassIndex(52121);
    }

    public static final class b implements AbstractC1974a<Element> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f83516a;

        static {
            Covode.recordClassIndex(52123);
        }

        b(h.f.a.b bVar) {
            this.f83516a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.d.a.AbstractC1974a
        public final void a(Element element) {
            this.f83516a.invoke(element);
        }
    }

    public final void b(Element element) {
        this.f83515a.remove(element);
    }

    public final void a(h.f.a.b<? super Element, z> bVar) {
        l.d(bVar, "");
        a((AbstractC1974a) new b(bVar));
    }

    private void a(AbstractC1974a<Element> aVar) {
        l.d(aVar, "");
        for (Element element : this.f83515a) {
            try {
                aVar.a(element);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Element element) {
        if (!this.f83515a.contains(element)) {
            this.f83515a.add(element);
        }
    }
}
