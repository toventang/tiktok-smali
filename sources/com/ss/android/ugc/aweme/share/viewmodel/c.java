package com.ss.android.ugc.aweme.share.viewmodel;

import android.app.Activity;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.d;
import com.ss.android.ugc.aweme.share.i;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f124419d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<d> f124420a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<i> f124421b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.openshare.a f124422c;

    static {
        Covode.recordClassIndex(81685);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81686);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(com.ss.android.ugc.aweme.openshare.a aVar) {
        l.d(aVar, "");
        this.f124422c = aVar;
    }

    static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ com.ss.android.ugc.aweme.share.l $model;
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, com.ss.android.ugc.aweme.share.l lVar, Activity activity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$model = lVar;
            this.$activity = activity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$model, this.$activity, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01ea A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 499
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.viewmodel.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(String str, Activity activity) {
        l.d(str, "");
        l.d(activity, "");
        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new b(this, new com.ss.android.ugc.aweme.share.l(), activity, null), 3);
    }
}
