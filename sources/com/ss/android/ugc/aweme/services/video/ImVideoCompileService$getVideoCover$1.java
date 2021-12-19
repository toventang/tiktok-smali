package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class ImVideoCompileService$getVideoCover$1<T> implements w {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ String $videoFilePath;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(79861);
    }

    ImVideoCompileService$getVideoCover$1(ImVideoCompileService imVideoCompileService, String str, int i2, int i3) {
        this.this$0 = imVideoCompileService;
        this.$videoFilePath = str;
        this.$maxWidth = i2;
        this.$maxHeight = i3;
    }

    @Override // f.a.w
    public final void subscribe(final v<String> vVar) {
        l.d(vVar, "");
        VEUtils.getVideoFrames(this.$videoFilePath, new int[]{0}, new ad(this) {
            /* class com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoCover$1.AnonymousClass1 */
            final /* synthetic */ ImVideoCompileService$getVideoCover$1 this$0;

            static {
                Covode.recordClassIndex(79862);
            }

            {
                this.this$0 = r1;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.vesdk.ad
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                MethodCollector.i(10261);
                l.d(byteBuffer, "");
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                this.this$0.this$0.scaleBitmap(createBitmap, this.this$0.$maxWidth, this.this$0.$maxHeight);
                String str = this.this$0.$videoFilePath + "_video_cover";
                this.this$0.this$0.saveBitmapToLocal(createBitmap, str);
                ImVideoCompileService imVideoCompileService = this.this$0.this$0;
                v vVar = vVar;
                l.b(vVar, "");
                imVideoCompileService.safeOnSingleNext(vVar, str);
                MethodCollector.o(10261);
                return false;
            }
        });
    }
}
