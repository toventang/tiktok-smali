package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import f.a.w;
import java.io.File;

final /* synthetic */ class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final t f14787a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f14788b;

    static {
        Covode.recordClassIndex(8197);
    }

    v(t tVar, Uri uri) {
        this.f14787a = tVar;
        this.f14788b = uri;
    }

    @Override // f.a.w
    public final void subscribe(f.a.v vVar) {
        String str;
        t tVar = this.f14787a;
        Uri uri = this.f14788b;
        try {
            Context context = tVar.f14744c.getContext();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, uri);
            str = "";
            if (BitmapUtils.saveBitmapToSD(mediaMetadataRetriever.getFrameAtTime(), tVar.f14742a, "firstFrame.temp")) {
                try {
                    str = tVar.f14742a + File.separator + "firstFrame.temp";
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        vVar.a(str);
    }
}
