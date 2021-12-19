package com.bytedance.android.livesdk.function;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.android.livesdk.bl;
import com.bytedance.android.livesdk.chatroom.b.c;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.e.k;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget f17789a;

    static {
        Covode.recordClassIndex(9873);
    }

    b(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f17789a = liveRoomNotifyWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17789a;
        by byVar = (by) obj;
        if (!liveRoomNotifyWidget.isViewValid() || byVar == null) {
            c.INSTANCE.onMessageFinish();
        } else {
            if (bl.f14211a) {
                liveRoomNotifyWidget.a();
            }
            liveRoomNotifyWidget.f17767g = byVar;
            liveRoomNotifyWidget.show();
            if (liveRoomNotifyWidget.getView() != null) {
                liveRoomNotifyWidget.getView().setTranslationX((float) (a.a(liveRoomNotifyWidget.context) ? -liveRoomNotifyWidget.f17763c : liveRoomNotifyWidget.f17763c));
            }
            if (byVar.f19390i == null || byVar.f19390i.f19106b == null || h.a(byVar.f19390i.f19106b.getUrls())) {
                liveRoomNotifyWidget.a(byVar);
            } else {
                liveRoomNotifyWidget.f17761a.setBackgroundResource(0);
                com.bytedance.android.live.core.f.a.h.a(liveRoomNotifyWidget.f17761a, "2131362437", byVar);
                ImageView imageView = liveRoomNotifyWidget.f17761a;
                RoomNotifyMessageExtra.Background background = byVar.f19390i.f19106b;
                LiveRoomNotifyWidget.AnonymousClass3 r3 = new g.a(byVar) {
                    /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ by f17775a;

                    static {
                        Covode.recordClassIndex(9863);
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.g.g.a
                    public final void a() {
                        if ("gift_broadcast".equals(this.f17775a.f19392k)) {
                            LiveRoomNotifyWidget.this.f17761a.post(new k(this));
                            return;
                        }
                        ImageView imageView = LiveRoomNotifyWidget.this.f17761a;
                        c cVar = c.INSTANCE;
                        cVar.getClass();
                        imageView.post(new l(cVar));
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.g.g.a
                    public final void a(Bitmap bitmap) {
                        float f2;
                        NinePatchDrawable ninePatchDrawable;
                        MethodCollector.i(2282);
                        if (!LiveRoomNotifyWidget.this.isViewValid()) {
                            MethodCollector.o(2282);
                            return;
                        }
                        if (y.a() != null) {
                            f2 = y.a().getDisplayMetrics().density / 3.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        Matrix matrix = new Matrix();
                        matrix.postScale(f2, f2);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        if (bitmap.getNinePatchChunk() != null) {
                            byte[] a2 = g.a(bitmap.getNinePatchChunk(), f2);
                            ninePatchDrawable = new NinePatchDrawable(y.a(), createBitmap, a2, g.a(a2), null);
                        } else {
                            ninePatchDrawable = null;
                        }
                        ImageView imageView = LiveRoomNotifyWidget.this.f17761a;
                        if (imageView != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            imageView.setBackground(ninePatchDrawable);
                        }
                        LiveRoomNotifyWidget.this.f17761a.post(new j(this));
                        MethodCollector.o(2282);
                    }

                    {
                        this.f17775a = r2;
                    }
                };
                if (!(background == null || background.getUrls() == null || background.getUrls().size() == 0)) {
                    k.a().e().b(com.facebook.imagepipeline.o.c.a(Uri.parse(background.getUrls().get(0))).a(), null).a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0109: INVOKE  
                          (wrap: com.facebook.d.c<com.facebook.common.h.a<com.facebook.common.g.h>> : 0x00fc: INVOKE  (r2v5 com.facebook.d.c<com.facebook.common.h.a<com.facebook.common.g.h>>) = 
                          (wrap: com.facebook.imagepipeline.e.h : 0x00f7: INVOKE  (r1v6 com.facebook.imagepipeline.e.h) = 
                          (wrap: com.facebook.imagepipeline.e.k : 0x00f3: INVOKE  (r0v37 com.facebook.imagepipeline.e.k) =  type: STATIC call: com.facebook.imagepipeline.e.k.a():com.facebook.imagepipeline.e.k)
                         type: VIRTUAL call: com.facebook.imagepipeline.e.k.e():com.facebook.imagepipeline.e.h)
                          (wrap: com.facebook.imagepipeline.o.b : 0x00ef: INVOKE  (r2v4 com.facebook.imagepipeline.o.b) = 
                          (wrap: com.facebook.imagepipeline.o.c : 0x00eb: INVOKE  (r0v36 com.facebook.imagepipeline.o.c) = 
                          (wrap: android.net.Uri : 0x00e7: INVOKE  (r0v35 android.net.Uri) = 
                          (wrap: java.lang.String : 0x00e1: INVOKE  (r0v33 java.lang.String) = 
                          (wrap: java.util.List<java.lang.String> : 0x00dd: INVOKE  (r0v32 java.util.List<java.lang.String>) = (r1v5 'background' com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra$Background) type: VIRTUAL call: com.bytedance.android.live.base.model.ImageModel.getUrls():java.util.List)
                          (0 int)
                         type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                         type: STATIC call: android.net.Uri.parse(java.lang.String):android.net.Uri)
                         type: STATIC call: com.facebook.imagepipeline.o.c.a(android.net.Uri):com.facebook.imagepipeline.o.c)
                         type: VIRTUAL call: com.facebook.imagepipeline.o.c.a():com.facebook.imagepipeline.o.b)
                          (null java.lang.Object)
                         type: VIRTUAL call: com.facebook.imagepipeline.e.h.b(com.facebook.imagepipeline.o.b, java.lang.Object):com.facebook.d.c)
                          (wrap: com.bytedance.android.livesdk.chatroom.g.g$2 : 0x0102: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.chatroom.g.g$2) = (r5v1 'imageView' android.widget.ImageView), (r3v1 'r3' com.bytedance.android.livesdk.function.LiveRoomNotifyWidget$3) call: com.bytedance.android.livesdk.chatroom.g.g.2.<init>(android.view.View, com.bytedance.android.livesdk.chatroom.g.g$a):void type: CONSTRUCTOR)
                          (wrap: com.facebook.common.b.i : 0x0105: INVOKE  (r0v39 com.facebook.common.b.i) =  type: STATIC call: com.facebook.common.b.i.b():com.facebook.common.b.i)
                         type: INTERFACE call: com.facebook.d.c.a(com.facebook.d.e, java.util.concurrent.Executor):void in method: com.bytedance.android.livesdk.function.b.invoke(java.lang.Object):java.lang.Object, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.chatroom.g.g$2) = (r5v1 'imageView' android.widget.ImageView), (r3v1 'r3' com.bytedance.android.livesdk.function.LiveRoomNotifyWidget$3) call: com.bytedance.android.livesdk.chatroom.g.g.2.<init>(android.view.View, com.bytedance.android.livesdk.chatroom.g.g$a):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.function.b.invoke(java.lang.Object):java.lang.Object, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.g.g, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                    // Method dump skipped, instructions count: 274
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.b.invoke(java.lang.Object):java.lang.Object");
                }
            }
