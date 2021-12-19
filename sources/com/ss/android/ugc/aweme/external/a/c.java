package com.ss.android.ugc.aweme.external.a;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.external.a.e;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.g;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.services.video.ImVideoCompileService;
import com.ss.android.ugc.aweme.shortvideo.festival.o;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.watermark.d;
import com.ss.android.ugc.aweme.watermark.q;
import com.ss.android.ugc.aweme.watermark.r;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class c implements IAVProcessService {
    static {
        Covode.recordClassIndex(56658);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $onFail;

        static {
            Covode.recordClassIndex(56662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.b bVar) {
            super(0);
            this.$onFail = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$onFail.invoke(new Throwable());
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVProcessService.IProcessCallback $callback;

        static {
            Covode.recordClassIndex(56664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(IAVProcessService.IProcessCallback iProcessCallback) {
            super(0);
            this.$callback = iProcessCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVProcessService.IProcessCallback iProcessCallback = this.$callback;
            if (iProcessCallback != null) {
                iProcessCallback.finish(-1);
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.c$c  reason: collision with other inner class name */
    static final class C2171c extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVProcessService.IProcessCallback $callback;
        final /* synthetic */ String $inputPath;
        final /* synthetic */ String $outputPath;

        static {
            Covode.recordClassIndex(56663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2171c(IAVProcessService.IProcessCallback iProcessCallback, String str, String str2) {
            super(0);
            this.$callback = iProcessCallback;
            this.$inputPath = str;
            this.$outputPath = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVProcessService.IProcessCallback iProcessCallback = this.$callback;
            if (iProcessCallback != null) {
                iProcessCallback.finish(Integer.valueOf(VEUtils.extractVideo(this.$inputPath, this.$outputPath)));
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVProcessService.CompileParam $compileParam;
        final /* synthetic */ h.f.a.b $onFail;
        final /* synthetic */ h.f.a.b $onSuccess;

        static {
            Covode.recordClassIndex(56659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IAVProcessService.CompileParam compileParam, h.f.a.b bVar, h.f.a.b bVar2) {
            super(0);
            this.$compileParam = compileParam;
            this.$onSuccess = bVar;
            this.$onFail = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ImVideoCompileService.Companion.getInstance().compileImVideo(this.$compileParam).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f(this) {
                /* class com.ss.android.ugc.aweme.external.a.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f90289a;

                static {
                    Covode.recordClassIndex(56660);
                }

                {
                    this.f90289a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    h.f.a.b bVar = this.f90289a.$onSuccess;
                    l.b(obj, "");
                    bVar.invoke(obj);
                }
            }, new f(this) {
                /* class com.ss.android.ugc.aweme.external.a.c.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f90290a;

                static {
                    Covode.recordClassIndex(56661);
                }

                {
                    this.f90290a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    h.f.a.b bVar = this.f90290a.$onFail;
                    l.b(obj, "");
                    bVar.invoke(obj);
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final int[] getVideoFileInfo(String str) {
        int[] b2 = com.ss.android.ugc.aweme.shortvideo.af.b.b(str);
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compileVideo(IAVProcessService.CompileParam compileParam, h.f.a.b<? super IAVProcessService.CompileResult, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.d(compileParam, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new a(compileParam, bVar, bVar2));
        a2.f90299a = new b(bVar2);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void muteVideo(String str, String str2, IAVProcessService.IProcessCallback<Integer> iProcessCallback) {
        l.d(str, "");
        l.d(str2, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new C2171c(iProcessCallback, str, str2));
        a2.f90299a = new d(iProcessCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compressPhoto(String str, Integer num, Integer num2, IAVProcessService.IProcessCallback<String> iProcessCallback) {
        PhotoContext a2;
        String str2;
        String str3;
        l.d(str, "");
        bj.b("PhotoServiceMonitor===> enter compressPhoto " + System.currentTimeMillis());
        if (num == null || num2 == null) {
            a2 = g.a(str, new com.ss.android.ugc.aweme.photo.b(), 1080, 1920);
        } else {
            a2 = g.a(str, new com.ss.android.ugc.aweme.photo.b(), num.intValue(), num2.intValue());
        }
        bj.b("PhotoServiceMonitor===> return compressPhoto " + System.currentTimeMillis());
        if (iProcessCallback != null) {
            if (a2 == null || (str3 = a2.mPhotoLocalPath) == null) {
                str2 = null;
            } else {
                str2 = str3.toString();
            }
            iProcessCallback.finish(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        q[] qVarArr;
        MethodCollector.i(8458);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (iProcessCallback != null) {
            List<com.ss.android.ugc.aweme.shortvideo.festival.m> a2 = o.a(str4);
            int i2 = 0;
            if (h.a(a2)) {
                TypedArray obtainTypedArray = com.ss.android.ugc.aweme.port.in.c.f115622a.getResources().obtainTypedArray(R.array.b1);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < length) {
                    q qVar = new q();
                    iArr[i3] = obtainTypedArray.getResourceId(i3, i2);
                    qVar.a(str, BitmapFactory.decodeResource(com.ss.android.ugc.aweme.port.in.c.f115622a.getResources(), iArr[i3], null), z);
                    arrayList.add(qVar);
                    i3++;
                    i2 = 0;
                }
                obtainTypedArray.recycle();
                qVarArr = (q[]) arrayList.toArray(new q[arrayList.size()]);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < a2.size(); i4++) {
                    q qVar2 = new q();
                    qVar2.a(str, BitmapFactory.decodeFile(a2.get(i4).f128509b), z);
                    arrayList2.add(qVar2);
                }
                qVarArr = (q[]) arrayList2.toArray(new q[arrayList2.size()]);
            }
            String[] a3 = r.a(qVarArr, str2, str3);
            l.b(a3, "");
            iProcessCallback.finish(a3);
            MethodCollector.o(8458);
            return;
        }
        MethodCollector.o(8458);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(int i2, int i3, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        if (iProcessCallback != null) {
            String[] a2 = com.ss.android.ugc.aweme.watermark.e.a(com.ss.android.ugc.aweme.watermark.e.a(i2, i3, str, z, z2, z3, new d.a().a(str4).a()), str2, str3);
            l.b(a2, "");
            iProcessCallback.finish(a2);
        }
    }
}
