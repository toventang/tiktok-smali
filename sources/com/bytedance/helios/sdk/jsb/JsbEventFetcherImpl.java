package com.bytedance.helios.sdk.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.k;
import com.bytedance.helios.api.b.l;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.g;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class JsbEventFetcherImpl extends l {
    private final long DELAYED_MILLS = HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills();
    private final long TIMEOUT_MILLS = HeliosEnvImpl.INSTANCE.getCrpConfig().getEventTimeOutMills();
    public final LinkedList<k> mJsbEventList = new LinkedList<>();

    static {
        Covode.recordClassIndex(17999);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JsbEventFetcherImpl f30992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f30993b;

        static {
            Covode.recordClassIndex(18000);
        }

        a(JsbEventFetcherImpl jsbEventFetcherImpl, k kVar) {
            this.f30992a = jsbEventFetcherImpl;
            this.f30993b = kVar;
        }

        public final void run() {
            this.f30992a.removeTimeOutEvents();
            this.f30992a.mJsbEventList.add(this.f30993b);
        }
    }

    public JsbEventFetcherImpl() {
        h.f.b.l.c(this, "");
        o.f30691g = this;
    }

    @Override // com.bytedance.helios.api.b.l
    public final List<k> getJsbEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int size = this.mJsbEventList.size() - 1; size >= 0; size--) {
            k kVar = this.mJsbEventList.get(size);
            h.f.b.l.a((Object) kVar, "");
            k kVar2 = kVar;
            if (currentTimeMillis - kVar2.f30669d > this.TIMEOUT_MILLS + this.DELAYED_MILLS) {
                break;
            }
            arrayList.add(kVar2);
        }
        return arrayList;
    }

    public final k removeTimeOutEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ListIterator<k> listIterator = this.mJsbEventList.listIterator();
        h.f.b.l.a((Object) listIterator, "");
        k kVar = null;
        while (listIterator.hasNext()) {
            kVar = listIterator.next();
            if (currentTimeMillis - kVar.f30669d < this.TIMEOUT_MILLS) {
                break;
            }
            listIterator.remove();
        }
        return kVar;
    }

    @Override // com.bytedance.helios.api.b.l
    public final void addJsbEvent(k kVar) {
        h.f.b.l.c(kVar, "");
        g.b().post(new a(this, kVar));
    }
}
