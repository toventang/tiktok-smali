package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import f.a.d.f;
import java.io.File;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final StickerImageUploader f8649a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerImageUploader.c f8650b;

    static {
        Covode.recordClassIndex(4425);
    }

    k(StickerImageUploader stickerImageUploader, StickerImageUploader.c cVar) {
        this.f8649a = stickerImageUploader;
        this.f8650b = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f8649a;
        StickerImageUploader.c cVar = this.f8650b;
        File file = (File) obj;
        if (file == null) {
            a.a(6, "StickerImageUploader", "compress file fail->" + cVar.f8609b);
            stickerImageUploader.f8603c = false;
            stickerImageUploader.a();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("image/jpeg", file));
        stickerImageUploader.f8601a = ((StickerImageUploader.UploadStickerImageApi) e.a().a(StickerImageUploader.UploadStickerImageApi.class)).upload(multipartTypedOutput, cVar.f8610c, cVar.f8611d).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new m(stickerImageUploader, cVar), new n(stickerImageUploader, cVar));
    }
}
