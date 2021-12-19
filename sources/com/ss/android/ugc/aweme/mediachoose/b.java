package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa;
import com.ss.android.ugc.tools.utils.h;
import dmt.av.video.aj;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.TimeUnit;

public final class b implements IVideoLegalCheckerAndToastService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f109356b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f109357a;

    static {
        Covode.recordClassIndex(70042);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70043);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.b<f, z> {
        final /* synthetic */ h.f.a.a $onSucess;

        static {
            Covode.recordClassIndex(70046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h.f.a.a aVar) {
            super(1);
            this.$onSucess = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            l.d(fVar, "");
            this.$onSucess.invoke();
            return z.f158842a;
        }
    }

    public b(Context context) {
        l.d(context, "");
        this.f109357a = context;
    }

    private static String b(String str) {
        try {
            return h.e(str).extractMetadata(12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.b$b  reason: collision with other inner class name */
    public static final class C2805b extends m implements h.f.a.b<f, z> {
        final /* synthetic */ j $isLegalWaitTask;

        static {
            Covode.recordClassIndex(70044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2805b(j jVar) {
            super(1);
            this.$isLegalWaitTask = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            l.d(fVar, "");
            this.$isLegalWaitTask.a((Object) true);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<f, z> {
        final /* synthetic */ boolean $isShowErrToast$inlined;
        final /* synthetic */ int $maxDuration$inlined;
        final /* synthetic */ int $minDuration$inlined;
        final /* synthetic */ r $onError$inlined;
        final /* synthetic */ h.f.a.m $onSuccess$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(70048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, r rVar, int i2, int i3, h.f.a.m mVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$onError$inlined = rVar;
            this.$minDuration$inlined = i2;
            this.$maxDuration$inlined = i3;
            this.$onSuccess$inlined = mVar;
            this.$isShowErrToast$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            this.$onSuccess$inlined.invoke(fVar2.f109384b, Long.valueOf(fVar2.f109385c));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<f, z> {
        final /* synthetic */ j $isLegalWaitTask;
        final /* synthetic */ boolean $isShowErrToast;
        final /* synthetic */ int $minVideoDuration;
        final /* synthetic */ h.f.a.b $onError;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(70045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, boolean z, int i2, h.f.a.b bVar2, j jVar) {
            super(1);
            this.this$0 = bVar;
            this.$isShowErrToast = z;
            this.$minVideoDuration = i2;
            this.$onError = bVar2;
            this.$isLegalWaitTask = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            if (this.$isShowErrToast) {
                aa.a(this.this$0.f109357a, fVar2.f109387e, this.$minVideoDuration);
            }
            h.f.a.b bVar = this.$onError;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(fVar2.f109387e));
            }
            this.$isLegalWaitTask.a((Object) false);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<f, z> {
        final /* synthetic */ boolean $isShowErrToast;
        final /* synthetic */ int $minVideoDuration;
        final /* synthetic */ h.f.a.b $onError = null;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(70047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, boolean z, int i2) {
            super(1);
            this.this$0 = bVar;
            this.$isShowErrToast = z;
            this.$minVideoDuration = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            if (this.$isShowErrToast) {
                aa.a(this.this$0.f109357a, fVar2.f109387e, this.$minVideoDuration);
            }
            h.f.a.b bVar = this.$onError;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(fVar2.f109387e));
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<f, z> {
        final /* synthetic */ boolean $isShowErrToast$inlined;
        final /* synthetic */ int $maxDuration$inlined;
        final /* synthetic */ int $minDuration$inlined;
        final /* synthetic */ r $onError$inlined;
        final /* synthetic */ h.f.a.m $onSuccess$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(70049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, r rVar, int i2, int i3, h.f.a.m mVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$onError$inlined = rVar;
            this.$minDuration$inlined = i2;
            this.$maxDuration$inlined = i3;
            this.$onSuccess$inlined = mVar;
            this.$isShowErrToast$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            if (this.$isShowErrToast$inlined) {
                aa.a(this.this$0.f109357a, fVar2.f109387e, this.$minDuration$inlined);
            }
            this.$onError$inlined.a(fVar2.f109384b, Long.valueOf(fVar2.f109385c), Integer.valueOf(fVar2.f109387e), fVar2.f109388f);
            return z.f158842a;
        }
    }

    private static MediaModel a(String str) {
        int[] a2 = aj.a(str);
        if (a2 == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f109390b = str;
        mediaModel.f109400l = a2[0];
        mediaModel.f109401m = a2[1];
        mediaModel.f109396h = (long) a2[3];
        mediaModel.f109398j = b(str);
        return mediaModel;
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z) {
        l.d(str, "");
        return isVideoLengthOrTypeSupportedAndShowErrToast(str, z, null);
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, h.f.a.b<? super Integer, z> bVar) {
        l.d(str, "");
        MediaModel a2 = a(str);
        if (a2 != null) {
            return a(this, a2, z, 0, 0, bVar, 12);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(aVar, "");
        MediaModel a2 = a(str);
        if (a2 != null) {
            int a3 = (int) di.a();
            if (i2 <= 0) {
                i2 = 600000;
            }
            new c(this.f109357a).a(a2, (long) a3, (long) i2, new d(aVar), new e(this, z, a3));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, int i3, h.f.a.b<? super Integer, z> bVar) {
        l.d(str, "");
        MediaModel a2 = a(str);
        if (a2 != null) {
            return a(this, a2, z, i2, 0, bVar, 8);
        }
        return false;
    }

    private final boolean a(MediaModel mediaModel, boolean z, int i2, long j2, h.f.a.b<? super Integer, z> bVar) {
        int i3 = i2;
        j jVar = new j();
        int a2 = (int) di.a();
        if (i3 <= 0) {
            i3 = 600000;
        }
        new c(this.f109357a).a(mediaModel, (long) a2, (long) i3, new C2805b(jVar), new c(this, z, a2, bVar, jVar));
        try {
            jVar.f4869a.a(j2, TimeUnit.MILLISECONDS);
            i<TResult> iVar = jVar.f4869a;
            l.b(iVar, "");
            TResult d2 = iVar.d();
            if (d2 != null) {
                return d2.booleanValue();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, int i3, h.f.a.m<? super String, ? super Long, z> mVar, r<? super String, ? super Long, ? super Integer, ? super String, z> rVar) {
        l.d(str, "");
        l.d(mVar, "");
        l.d(rVar, "");
        MediaModel a2 = a(str);
        if (a2 == null) {
            rVar.a("", 0L, -9, "path is null");
        } else {
            new c(this.f109357a).a(a2, (long) i3, (long) i2, new f(this, rVar, i3, i2, mVar, z), new g(this, rVar, i3, i2, mVar, z));
        }
    }

    private static /* synthetic */ boolean a(b bVar, MediaModel mediaModel, boolean z, int i2, long j2, h.f.a.b bVar2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            j2 = 1000;
        }
        return bVar.a(mediaModel, z, i2, j2, bVar2);
    }
}
