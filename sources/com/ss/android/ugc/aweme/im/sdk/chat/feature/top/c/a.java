package com.ss.android.ugc.aweme.im.sdk.chat.feature.top.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.b;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final String f101081a = "DmSafetyNotice";

    /* renamed from: b  reason: collision with root package name */
    public static final a f101082b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final am f101083c = an.a(bf.f159041b);

    private a() {
    }

    static {
        Covode.recordClassIndex(64668);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.c.a$a  reason: collision with other inner class name */
    public static final class C2512a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $noticeCode;
        final /* synthetic */ int $operation;
        int label;

        static {
            Covode.recordClassIndex(64669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2512a(String str, int i2, String str2, d dVar) {
            super(2, dVar);
            this.$noticeCode = str;
            this.$operation = i2;
            this.$conversationId = str2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2512a(this.$noticeCode, this.$operation, this.$conversationId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2512a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                av<BaseResponse> acknowledgeNoticeRead = b.a().acknowledgeNoticeRead(this.$noticeCode, TopChatNoticeSourceType.DM_CHAT.getType(), this.$operation, this.$conversationId);
                this.label = 1;
                if (acknowledgeNoticeRead.a(this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                try {
                    r.a(obj);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.a(a.f101081a, e2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    public static final void a(String str, String str2, int i2) {
        l.d(str, "");
        bz unused = i.a(f101083c, null, null, new C2512a(str, i2, str2, null), 3);
    }
}
