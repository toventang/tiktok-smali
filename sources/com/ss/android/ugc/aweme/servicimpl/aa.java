package com.ss.android.ugc.aweme.servicimpl;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.e;
import com.ss.android.ugc.aweme.canvas.g;
import com.ss.android.ugc.aweme.canvas.i;
import com.ss.android.ugc.aweme.canvas.y;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photo.u;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.servicimpl.z;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.h;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.p;

public final class aa extends com.ss.android.ugc.aweme.ar.a {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f121839a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(79890);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f121842a;

        static {
            Covode.recordClassIndex(79892);
        }

        b(z zVar) {
            this.f121842a = zVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((z.a) this.f121842a).f121978i.invoke(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ z.a $this_run;

        static {
            Covode.recordClassIndex(79893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z.a aVar) {
            super(1);
            this.$this_run = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            this.$this_run.f121978i.invoke(Boolean.valueOf(bool.booleanValue()));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f121840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f121841b;

        static {
            Covode.recordClassIndex(79891);
        }

        a(i iVar, z zVar) {
            this.f121840a = iVar;
            this.f121841b = zVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            y yVar = (y) obj;
            this.f121840a.a();
            l.b(yVar, "");
            CanvasVideoData a2 = g.a(yVar, ((z.a) this.f121841b).f121972c);
            z zVar = this.f121841b;
            aa.a((z.a) zVar, a2, ((z.a) zVar).f121977h, null);
        }
    }

    public static <RETURN_VALUE> RETURN_VALUE a(z<RETURN_VALUE> zVar) {
        com.ss.android.ugc.aweme.canvas.c bVar;
        com.ss.android.ugc.aweme.canvas.f fVar;
        l.d(zVar, "");
        z.a aVar = (z.a) zVar;
        ExtractFramesModel extractFramesModel = aVar.f121976g;
        if (extractFramesModel != null) {
            extractFramesModel.removeLastSegment();
            aVar.f121973d.a(extractFramesModel);
        }
        p<Integer, Integer> b2 = e.b();
        int intValue = b2.component1().intValue();
        int intValue2 = b2.component2().intValue();
        String str = aVar.f121971b;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            bVar = new com.ss.android.ugc.aweme.canvas.z();
        } else {
            bVar = new com.ss.android.ugc.aweme.canvas.b();
        }
        com.ss.android.ugc.aweme.canvas.c cVar = bVar;
        i iVar = new i(false);
        iVar.f69700a = System.currentTimeMillis();
        SingleImageCoverBitmapData singleImageCoverBitmapData = aVar.f121973d.aV;
        Bitmap b3 = h.b(singleImageCoverBitmapData);
        if (b3 != null) {
            iVar.a();
            y yVar = new y();
            yVar.a(aVar.f121971b);
            yVar.a(cVar.a(b3));
            yVar.f69775c = g.a(intValue, intValue2, singleImageCoverBitmapData.getSrcWidth(), singleImageCoverBitmapData.getSrcHeight(), h.a(singleImageCoverBitmapData));
            a(aVar, g.a(yVar, aVar.f121972c), aVar.f121977h, singleImageCoverBitmapData);
            return (RETURN_VALUE) h.z.f158842a;
        }
        fVar.a(str, intValue, intValue2, !aVar.f121975f, new com.ss.android.ugc.aweme.canvas.f(cVar, false).f69677a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(iVar, zVar), new b(zVar));
        return (RETURN_VALUE) h.z.f158842a;
    }

    static void a(z.a aVar, CanvasVideoData canvasVideoData, MediaModel mediaModel, SingleImageCoverBitmapData singleImageCoverBitmapData) {
        new com.ss.android.ugc.aweme.photo.e(new com.ss.android.ugc.aweme.photo.f(new u(aVar.f121970a, aVar.f121973d, !aVar.f121975f, aVar.f121974e, System.currentTimeMillis()), aVar.f121971b, mediaModel, singleImageCoverBitmapData, canvasVideoData, aVar.f121975f, new c(aVar))).a();
    }
}
