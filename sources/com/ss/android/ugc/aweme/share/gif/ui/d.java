package com.ss.android.ugc.aweme.share.gif.ui;

import android.content.Intent;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.io.FileOutputStream;

final /* synthetic */ class d implements IAVTransformService.ITransformCallback {

    /* renamed from: a  reason: collision with root package name */
    private final VideoShare2GifEditActivity f123543a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.view.d f123544b;

    static {
        Covode.recordClassIndex(81104);
    }

    d(VideoShare2GifEditActivity videoShare2GifEditActivity, com.ss.android.ugc.aweme.shortvideo.view.d dVar) {
        this.f123543a = videoShare2GifEditActivity;
        this.f123544b = dVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
    public final void finish(Object obj) {
        MethodCollector.i(10194);
        VideoShare2GifEditActivity videoShare2GifEditActivity = this.f123543a;
        com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f123544b;
        videoShare2GifEditActivity.f123531a = true;
        dVar.dismiss();
        if (((Boolean) obj).booleanValue()) {
            File file = new File(videoShare2GifEditActivity.f123532b.f123492e);
            l.d(file, "");
            l.d(videoShare2GifEditActivity, "");
            try {
                ParcelFileDescriptor openFileDescriptor = com.bytedance.ies.ugc.appcontext.d.a().getContentResolver().openFileDescriptor(e.a(videoShare2GifEditActivity, file.getName(), "image/gif", Environment.DIRECTORY_PICTURES + "/tiktok/"), "w");
                if (openFileDescriptor != null) {
                    c.b.d.a(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                }
            } catch (Throwable unused) {
            }
            VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f123532b;
            Intent intent = new Intent(videoShare2GifEditActivity, VideoShare2GifPreviewActivity.class);
            intent.putExtra("extra_data", videoShare2GifEditContext);
            videoShare2GifEditActivity.startActivityForResult(intent, 1);
            MethodCollector.o(10194);
            return;
        }
        videoShare2GifEditActivity.f123532b.f123492e = null;
        new a(videoShare2GifEditActivity).a(videoShare2GifEditActivity.getString(R.string.c4b)).a();
        MethodCollector.o(10194);
    }
}
