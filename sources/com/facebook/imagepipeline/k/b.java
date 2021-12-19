package com.facebook.imagepipeline.k;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f48004a;

    static {
        Covode.recordClassIndex(29024);
    }

    public b(c... cVarArr) {
        this.f48004a = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            if (cVar != null) {
                this.f48004a.add(cVar);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final boolean requiresExtraMap(String str) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f48004a.get(i2).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public b(Set<c> set) {
        this.f48004a = new ArrayList(set.size());
        for (c cVar : set) {
            if (cVar != null) {
                this.f48004a.add(cVar);
            }
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestCancellation(String str) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onRequestCancellation(str);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerStart(String str, String str2) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onProducerStart(str, str2);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerEvent(String str, String str2, String str3) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onProducerEvent(str, str2, str3);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestSuccess(com.facebook.imagepipeline.o.b bVar, String str, boolean z) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onRequestSuccess(bVar, str, z);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onUltimateProducerReached(str, str2, z);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.n.an
    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestFailure(com.facebook.imagepipeline.o.b bVar, String str, Throwable th, boolean z) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onRequestFailure(bVar, str, th, z);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.k.c
    public final void onRequestStart(com.facebook.imagepipeline.o.b bVar, Object obj, String str, boolean z) {
        int size = this.f48004a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f48004a.get(i2).onRequestStart(bVar, obj, str, z);
            } catch (Exception e2) {
                a.c("ForwardingRequestListener", "InternalListener exception in onRequestStart", e2);
            }
        }
    }
}
