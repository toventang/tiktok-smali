package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.gson.p;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.n;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ImApi f102469a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f102470b = new a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.a$a  reason: collision with other inner class name */
    public interface AbstractC2574a {
        static {
            Covode.recordClassIndex(65612);
        }

        void a();

        void a(Object obj);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(null, null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((String) null, (String) null, this);
        }
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f102471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f102472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f102473c;

        static {
            Covode.recordClassIndex(65613);
        }

        b(CharSequence charSequence, String str, int i2) {
            this.f102471a = charSequence;
            this.f102472b = str;
            this.f102473c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return a.f102469a.block(this.f102471a.toString(), this.f102472b, this.f102473c).get();
            } catch (ExecutionException e2) {
                l.d(e2, "");
                Throwable cause = e2.getCause();
                if (cause instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    throw ((RuntimeException) cause);
                } else if (!(cause instanceof p)) {
                    Objects.requireNonNull(cause, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                    throw ((Exception) cause);
                } else {
                    throw new com.ss.android.ugc.aweme.base.api.a.a.c(cause);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(65611);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102220b).create(ImApi.class);
        l.b(create, "");
        f102469a = (ImApi) create;
    }

    public static n<BlockResponse> a(String str, String str2, int i2) {
        n<BlockResponse> a2 = f102469a.blockUser(str, str2, i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, h.c.d<? super com.ss.android.ugc.aweme.im.service.model.IMUser> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.im.sdk.common.data.api.a.d
            if (r0 == 0) goto L_0x003e
            r4 = r8
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d r4 = (com.ss.android.ugc.aweme.im.sdk.common.data.api.a.d) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003e
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0044
            h.r.a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse r3 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
            return r0
        L_0x002c:
            h.r.a(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a
            kotlinx.coroutines.av r0 = r0.fetchUserSelf(r6, r7)
            r4.label = r1
            java.lang.Object r3 = r0.a(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003e:
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d r4 = new com.ss.android.ugc.aweme.im.sdk.common.data.api.a$d
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.api.a.a(java.lang.String, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, h.c.d<? super com.ss.android.ugc.aweme.im.service.model.IMUser> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.im.sdk.common.data.api.a.c
            if (r0 == 0) goto L_0x003e
            r4 = r8
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c r4 = (com.ss.android.ugc.aweme.im.sdk.common.data.api.a.c) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003e
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0044
            h.r.a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse r3 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
            return r0
        L_0x002c:
            h.r.a(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a
            kotlinx.coroutines.av r0 = r0.fetchUserOther(r6, r7)
            r4.label = r1
            java.lang.Object r3 = r0.a(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003e:
            com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c r4 = new com.ss.android.ugc.aweme.im.sdk.common.data.api.a$c
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.api.a.b(java.lang.String, java.lang.String, h.c.d):java.lang.Object");
    }

    public static final void a(Handler handler, CharSequence charSequence, String str, int i2, int i3) {
        l.d(charSequence, "");
        com.ss.android.ugc.aweme.base.n.a().a(handler, new b(charSequence, str, i2), i3);
    }
}
