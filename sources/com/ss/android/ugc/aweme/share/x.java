package com.ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f124425c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.openshare.a f124426a;

    /* renamed from: b  reason: collision with root package name */
    final Context f124427b;

    static {
        Covode.recordClassIndex(81691);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81692);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static boolean a(String str) {
        if (!cs.a(str)) {
            return false;
        }
        int[] photoInfo = AVExternalServiceImpl.a().abilityService().infoService().photoInfo(str);
        int i2 = photoInfo[0];
        int i3 = photoInfo[1];
        if (i2 * i3 != 0) {
            float f2 = (float) i3;
            float f3 = (float) i2;
            if (f2 > f3 * 2.4f || f3 > f2 * 2.4f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public x(com.ss.android.ugc.aweme.openshare.a aVar, Context context) {
        l.d(aVar, "");
        l.d(context, "");
        this.f124426a = aVar;
        this.f124427b = context;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<String, Long, z> {
        final /* synthetic */ p $checkListener;

        static {
            Covode.recordClassIndex(81693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(2);
            this.$checkListener = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Long l2) {
            l2.longValue();
            l.d(str, "");
            this.$checkListener.a(true);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.m<String, Long, z> {
        final /* synthetic */ p $checkListener;
        final /* synthetic */ int $index;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(81695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(x xVar, p pVar, int i2) {
            super(2);
            this.this$0 = xVar;
            this.$checkListener = pVar;
            this.$index = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Long l2) {
            l2.longValue();
            l.d(str, "");
            p pVar = this.$checkListener;
            boolean z = true;
            if (this.$index != this.this$0.f124426a.f114534b.size() - 1) {
                z = false;
            }
            pVar.a(z);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements r<String, Long, Integer, String, z> {
        final /* synthetic */ p $checkListener;

        static {
            Covode.recordClassIndex(81694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(4);
            this.$checkListener = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(String str, Long l2, Integer num, String str2) {
            l2.longValue();
            int intValue = num.intValue();
            String str3 = str2;
            l.d(str, "");
            l.d(str3, "");
            this.$checkListener.a(intValue, str3);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements r<String, Long, Integer, String, z> {
        final /* synthetic */ p $checkListener;
        final /* synthetic */ z.a $isError;

        static {
            Covode.recordClassIndex(81696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.a aVar, p pVar) {
            super(4);
            this.$isError = aVar;
            this.$checkListener = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(String str, Long l2, Integer num, String str2) {
            l2.longValue();
            int intValue = num.intValue();
            String str3 = str2;
            l.d(str, "");
            l.d(str3, "");
            this.$isError.element = true;
            this.$checkListener.a(intValue, str3);
            return h.z.f158842a;
        }
    }
}
