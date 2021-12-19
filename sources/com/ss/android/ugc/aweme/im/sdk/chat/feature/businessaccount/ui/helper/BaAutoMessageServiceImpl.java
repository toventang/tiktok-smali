package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.api.AutoMsgSettingApiManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.s;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class BaAutoMessageServiceImpl implements IBaAutoMessageService {

    /* renamed from: a  reason: collision with root package name */
    public bz f100487a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f100488b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f100489c;

    /* renamed from: d  reason: collision with root package name */
    public bz f100490d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a f100491e;

    /* renamed from: f  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> f100492f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public bz f100493g;

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.d(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.c.b.a.d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(false, (h.c.d<? super Boolean>) this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.c.b.a.d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(false, (h.c.d<? super Boolean>) this);
        }
    }

    static {
        Covode.recordClassIndex(64234);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    public final void b() {
        this.f100490d = kotlinx.coroutines.i.a(bs.f159054a, null, null, new g(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    public final void c() {
        this.f100493g = kotlinx.coroutines.i.a(bs.f159054a, null, null, new e(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    public final void a() {
        this.f100487a = kotlinx.coroutines.i.a(bs.f159054a, null, null, new f(this, null), 3);
    }

    public static IBaAutoMessageService d() {
        MethodCollector.i(4692);
        Object a2 = com.ss.android.ugc.b.a(IBaAutoMessageService.class, false);
        if (a2 != null) {
            IBaAutoMessageService iBaAutoMessageService = (IBaAutoMessageService) a2;
            MethodCollector.o(4692);
            return iBaAutoMessageService;
        }
        if (com.ss.android.ugc.b.bx == null) {
            synchronized (IBaAutoMessageService.class) {
                try {
                    if (com.ss.android.ugc.b.bx == null) {
                        com.ss.android.ugc.b.bx = new BaAutoMessageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4692);
                    throw th;
                }
            }
        }
        BaAutoMessageServiceImpl baAutoMessageServiceImpl = (BaAutoMessageServiceImpl) com.ss.android.ugc.b.bx;
        MethodCollector.o(4692);
        return baAutoMessageServiceImpl;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b $keywordMessage;

        static {
            Covode.recordClassIndex(64236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b bVar) {
            super(1);
            this.$keywordMessage = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b bVar) {
            boolean z;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            if (bVar2.f100384a == this.$keywordMessage.f100384a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    public final void a(String str) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str, "");
        AutoMsgSettingApiManager.f100406a.reportOpenDmDialog(str);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new f(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    av a2 = s.a(AutoMsgSettingApiManager.f100406a.getMsgSwitches());
                    this.label = 1;
                    obj = a2.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.this$0.f100487a = null;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.a[] aVarArr = ((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.e) obj).f100400a;
            if (aVarArr != null) {
                for (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.a aVar2 : aVarArr) {
                    int i3 = aVar2.f100389a;
                    if (i3 == 1) {
                        this.this$0.f100488b = aVar2.a();
                    } else if (i3 == 2) {
                        this.this$0.f100489c = aVar2.a();
                    }
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ int $messageType;
        int label;

        static {
            Covode.recordClassIndex(64249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(int i2, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.$messageType = i2;
            this.$enabled = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new n(this.$messageType, this.$enabled, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
            return ((n) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i3 = this.label;
            boolean z = false;
            if (i3 == 0) {
                r.a(obj);
                try {
                    int i4 = this.$messageType;
                    if (this.$enabled) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    av a2 = s.a(AutoMsgSettingApiManager.f100406a.setMsgSwitch(i4, i2));
                    this.label = 1;
                    obj = a2.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                }
            } else if (i3 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((BaseResponse) obj).status_code == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(h.c.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.h
            if (r0 == 0) goto L_0x004f
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h r5 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.h) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r4 = r5.result
            h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x005d
            if (r0 != r2) goto L_0x0055
            java.lang.Object r0 = r5.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r0
            h.r.a(r4)
        L_0x0028:
            boolean r0 = r0.f100489c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            h.r.a(r4)
            kotlinx.coroutines.bz r0 = r6.f100487a
            if (r0 != 0) goto L_0x0042
            r6.a()
            r5.label = r1
            java.lang.Object r4 = r6.b(r5)
            if (r4 != r3) goto L_0x0060
            return r3
        L_0x0042:
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.b(r5)
            if (r0 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r0 = r6
            goto L_0x0028
        L_0x004f:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$h
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            h.r.a(r4)
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.b(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(h.c.d<? super com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.j
            if (r0 == 0) goto L_0x004b
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j r5 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.j) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004b
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r4 = r5.result
            h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r1) goto L_0x0059
            if (r0 != r2) goto L_0x0051
            java.lang.Object r0 = r5.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r0
            h.r.a(r4)
        L_0x0028:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a r0 = r0.f100491e
            return r0
        L_0x002b:
            h.r.a(r4)
            kotlinx.coroutines.bz r0 = r6.f100490d
            if (r0 != 0) goto L_0x003e
            r6.b()
            r5.label = r1
            java.lang.Object r4 = r6.c(r5)
            if (r4 != r3) goto L_0x005c
            return r3
        L_0x003e:
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.b(r5)
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r0 = r6
            goto L_0x0028
        L_0x004b:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$j
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0059:
            h.r.a(r4)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.c(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(h.c.d<? super java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.i
            if (r0 == 0) goto L_0x004b
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i r5 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.i) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004b
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r4 = r5.result
            h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r1) goto L_0x0059
            if (r0 != r2) goto L_0x0051
            java.lang.Object r0 = r5.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r0
            h.r.a(r4)
        L_0x0028:
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> r0 = r0.f100492f
            return r0
        L_0x002b:
            h.r.a(r4)
            kotlinx.coroutines.bz r0 = r6.f100493g
            if (r0 != 0) goto L_0x003e
            r6.c()
            r5.label = r1
            java.lang.Object r4 = r6.d(r5)
            if (r4 != r3) goto L_0x005c
            return r3
        L_0x003e:
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.b(r5)
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r0 = r6
            goto L_0x0028
        L_0x004b:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$i
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x0059:
            h.r.a(r4)
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.d(h.c.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new e(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            boolean z2 = true;
            if (i2 == 0) {
                r.a(obj);
                try {
                    av a2 = s.a(AutoMsgSettingApiManager.f100406a.getAutoReply());
                    this.label = 1;
                    obj = a2.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception unused) {
                    this.this$0.f100493g = null;
                    return z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.b) obj;
            if (bVar.status_code != 0) {
                this.this$0.f100492f = new ArrayList();
                this.this$0.f100493g = null;
                return z.f158842a;
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.c[] cVarArr = bVar.f100391a;
            if (cVarArr != null) {
                if (cVarArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                this.this$0.f100492f = new ArrayList();
                this.this$0.f100493g = null;
                return z.f158842a;
            }
            this.this$0.f100492f = h.l.k.h(h.l.k.e(h.l.k.e(h.a.i.p(cVarArr), AnonymousClass1.f100494a)));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ BaAutoMessageServiceImpl this$0;

        static {
            Covode.recordClassIndex(64242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BaAutoMessageServiceImpl baAutoMessageServiceImpl, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoMessageServiceImpl;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new g(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a aVar;
            h.c.a.a aVar2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            boolean z = true;
            if (i2 == 0) {
                r.a(obj);
                try {
                    av a2 = s.a(AutoMsgSettingApiManager.f100406a.getWelMsgReviewStatus());
                    this.label = 1;
                    obj = a2.a(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } catch (Exception unused) {
                    this.this$0.f100490d = null;
                    this.this$0.f100491e = null;
                    return z.f158842a;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.f fVar = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.f) obj;
            if (fVar.status_code != 0) {
                this.this$0.f100490d = null;
                this.this$0.f100491e = null;
                return z.f158842a;
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.g gVar = fVar.f100401a;
            if (gVar == null) {
                this.this$0.f100491e = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(0L), 0, "");
                return z.f158842a;
            }
            long j2 = gVar.f100402a;
            BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.this$0;
            int i3 = gVar.f100403b;
            if (i3 == 1) {
                if (gVar.f100405d.length() != 0) {
                    z = false;
                }
                if (z) {
                    aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 0, "");
                } else {
                    aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 4, gVar.f100405d);
                }
            } else if (i3 == 2) {
                aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 1, gVar.f100405d);
            } else if (i3 == 3) {
                aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 3, gVar.f100405d);
            } else if (i3 != 4) {
                aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 0, "");
            } else {
                aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(h.c.b.a.b.a(j2), 2, gVar.f100405d, gVar.f100404c);
            }
            baAutoMessageServiceImpl.f100491e = aVar;
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.k
            if (r0 == 0) goto L_0x004f
            r5 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k r5 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.k) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L_0x0013:
            java.lang.Object r4 = r5.result
            h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x005d
            if (r0 != r2) goto L_0x0055
            java.lang.Object r0 = r5.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r0
            h.r.a(r4)
        L_0x0028:
            boolean r0 = r0.f100488b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            h.r.a(r4)
            kotlinx.coroutines.bz r0 = r6.f100487a
            if (r0 != 0) goto L_0x0042
            r6.a()
            r5.label = r1
            java.lang.Object r4 = r6.a(r5)
            if (r4 != r3) goto L_0x0060
            return r3
        L_0x0042:
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.b(r5)
            if (r0 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r0 = r6
            goto L_0x0028
        L_0x004f:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$k
            r5.<init>(r6, r7)
            goto L_0x0013
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L_0x005d:
            h.r.a(r4)
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.a(h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[Catch:{ Exception -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a r8, h.c.d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b r12, h.c.d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.a(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a r9, h.c.d<? super java.lang.Boolean> r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097 A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b r12, h.c.d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.c(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b r8, h.c.d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.b(com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(boolean r6, h.c.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.p
            if (r0 == 0) goto L_0x0048
            r4 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.p) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r1 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0054
            boolean r6 = r4.Z$0
            java.lang.Object r1 = r4.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r1 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r1
            h.r.a(r3)
        L_0x0027:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x004e
            r1.f100488b = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0036:
            h.r.a(r3)
            r4.L$0 = r5
            r4.Z$0 = r6
            r4.label = r2
            java.lang.Object r3 = a(r2, r6, r4)
            if (r3 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r1 = r5
            goto L_0x0027
        L_0x0048:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p r4 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$p
            r4.<init>(r5, r7)
            goto L_0x0013
        L_0x004e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.a(boolean, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(boolean r6, h.c.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.l
            if (r0 == 0) goto L_0x0049
            r4 = r7
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.l) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0049
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r1 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0055
            boolean r6 = r4.Z$0
            java.lang.Object r1 = r4.L$0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl r1 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl) r1
            h.r.a(r3)
        L_0x0027:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x004f
            r1.f100489c = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0036:
            h.r.a(r3)
            r0 = 2
            r4.L$0 = r5
            r4.Z$0 = r6
            r4.label = r2
            java.lang.Object r3 = a(r0, r6, r4)
            if (r3 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r1 = r5
            goto L_0x0027
        L_0x0049:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l r4 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl$l
            r4.<init>(r5, r7)
            goto L_0x0013
        L_0x004f:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl.b(boolean, h.c.d):java.lang.Object");
    }

    private static Object a(int i2, boolean z, h.c.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.a(bf.f159041b, new n(i2, z, null), dVar);
    }
}
