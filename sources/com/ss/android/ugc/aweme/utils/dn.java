package com.ss.android.ugc.aweme.utils;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.c.d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.h;
import java.util.ArrayList;
import java.util.List;

public final class dn {

    public interface b {
        static {
            Covode.recordClassIndex(93441);
        }
    }

    static {
        Covode.recordClassIndex(93439);
    }

    public static class a implements d<f> {

        /* renamed from: a  reason: collision with root package name */
        private ImageModel f142827a;

        /* renamed from: b  reason: collision with root package name */
        private b f142828b = null;

        static {
            Covode.recordClassIndex(93440);
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        public a(ImageModel imageModel, b bVar) {
            this.f142827a = imageModel;
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            if (this.f142828b != null) {
                new RuntimeException(th);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            List<String> urls;
            f fVar2 = fVar;
            Cdo.f142829a.a(this.f142827a);
            if (fVar2 != null) {
                fVar2.getWidth();
                fVar2.getHeight();
            }
            if (this.f142827a != null) {
                Cdo doVar = Cdo.f142829a;
                ImageModel imageModel = this.f142827a;
                if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty())) {
                    doVar.f142830b.execute(new Runnable(urls) {
                        /* class com.ss.android.ugc.aweme.utils.Cdo.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ List f142833a;

                        static {
                            Covode.recordClassIndex(93443);
                        }

                        public final void run(
/*
[30] Method generation error in method: com.ss.android.ugc.aweme.utils.do.1.run():void, file: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.ss.android.ugc.aweme.utils.do.1.run():void, class status: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:266)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:132)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:337)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        
*/

                        {
                            /*
                                r0 = this;
                                com.ss.android.ugc.aweme.utils.Cdo.this = r1
                                r0.f142833a = r2
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Cdo.AnonymousClass1.<init>(com.ss.android.ugc.aweme.utils.do, java.util.List):void");
                        }
                    });
                }
                this.f142827a.setLoaded(true);
            }
        }
    }

    public static void a(SimpleDraweeView simpleDraweeView, ImageModel imageModel) {
        com.facebook.imagepipeline.common.d dVar;
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            int measuredWidth = simpleDraweeView.getMeasuredWidth();
            int measuredHeight = simpleDraweeView.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                dVar = null;
            } else {
                dVar = new com.facebook.imagepipeline.common.d(measuredWidth, measuredHeight);
            }
            com.facebook.imagepipeline.o.b[] a2 = a(imageModel, dVar, null);
            if (a2 != null && a2.length != 0) {
                e b2 = c.b();
                b2.f47325m = simpleDraweeView.getController();
                com.facebook.drawee.c.b a3 = b2.a(a2);
                a3.f47319g = new a(imageModel, null);
                simpleDraweeView.setController(a3.e());
            }
        }
    }

    private static com.facebook.imagepipeline.o.b[] a(ImageModel imageModel, com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.o.d dVar2) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        ArrayList arrayList = new ArrayList();
        h hVar = new h();
        for (String str : imageModel.getUrls()) {
            if (!m.a(str)) {
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                if (dVar != null) {
                    a2.f48447d = dVar;
                }
                hVar.a(a2);
                arrayList.add(a2.a());
            }
        }
        if (arrayList.size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        return (com.facebook.imagepipeline.o.b[]) arrayList.toArray(new com.facebook.imagepipeline.o.b[arrayList.size()]);
    }
}
