package com.ss.android.ugc.aweme.share.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.d;
import com.ss.android.ugc.aweme.openshare.Share;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f124413f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final String f124414a = "aweme.share";

    /* renamed from: b  reason: collision with root package name */
    public final t<Share.Response> f124415b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<d> f124416c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f124417d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.openshare.a f124418e;

    static {
        Covode.recordClassIndex(81681);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81682);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(com.ss.android.ugc.aweme.openshare.a aVar) {
        l.d(aVar, "");
        this.f124418e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b$b  reason: collision with other inner class name */
    public static final class C3245b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Context $appContext;
        final /* synthetic */ com.ss.android.ugc.aweme.share.l $model;
        final /* synthetic */ Share.Request $passRequest;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(81683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3245b(b bVar, Share.Request request, com.ss.android.ugc.aweme.share.l lVar, Activity activity, Context context, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$passRequest = request;
            this.$model = lVar;
            this.$activity = activity;
            this.$appContext = context;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C3245b(this.this$0, this.$passRequest, this.$model, this.$activity, this.$appContext, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C3245b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x02ad A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b9  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x008f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x029a  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
            // Method dump skipped, instructions count: 748
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.viewmodel.b.C3245b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static Share.Response a(int i2, String str, Share.Request request) {
        Share.Response response = new Share.Response();
        response.errorCode = com.ss.android.ugc.aweme.ab.a.a(i2);
        response.errorMsg = str;
        response.subErrorCode = i2;
        response.state = request.mState;
        return response;
    }

    public final void a(String str, Share.Request request, Activity activity, Context context) {
        l.d(str, "");
        l.d(request, "");
        l.d(activity, "");
        l.d(context, "");
        bz unused = i.a(an.a(bf.f159041b), null, null, new C3245b(this, request, new com.ss.android.ugc.aweme.share.l(), activity, context, null), 3);
    }
}
