package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

/* access modifiers changed from: package-private */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f54616a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f54617b;

    static {
        Covode.recordClassIndex(33888);
    }

    static class a implements d<k> {
        static {
            Covode.recordClassIndex(33889);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d6  */
        @Override // com.google.firebase.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r6, com.google.firebase.a.e r7) {
            /*
            // Method dump skipped, instructions count: 281
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k.a.a(java.lang.Object, java.lang.Object):void");
        }
    }

    static final class c implements d<b> {
        static {
            Covode.recordClassIndex(33891);
        }

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.google.firebase.a.b
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            eVar.a("messaging_client_event", ((b) obj).f54618a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f54618a;

        static {
            Covode.recordClassIndex(33890);
        }

        b(k kVar) {
            this.f54618a = (k) r.a(kVar);
        }
    }

    k(String str, Intent intent) {
        this.f54616a = r.a(str, (Object) "evenType must be non-null");
        this.f54617b = (Intent) r.a(intent, "intent must be non-null");
    }
}
