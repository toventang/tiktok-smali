package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.video.e;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f135784a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(88753);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dt f135785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.model.a f135786b;

        static {
            Covode.recordClassIndex(88754);
        }

        public a(dt dtVar, com.ss.android.ugc.aweme.sticker.model.a aVar) {
            this.f135785a = dtVar;
            this.f135786b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.sticker.model.a backgroundVideo;
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.f135785a) {
                if (!(timeSpeedModelExtension == null || (backgroundVideo = timeSpeedModelExtension.getBackgroundVideo()) == null || !(!l.a(backgroundVideo, this.f135786b)))) {
                    c.a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                }
            }
            return z.f158842a;
        }
    }

    public static final String a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.uniqueVideoSessionDir(dj.f126466i);
        } else {
            str = null;
        }
        return l.a(str, (Object) File.separator);
    }

    public static final void a(String str, String str2) {
        try {
            e.c(str);
            e.c(str2);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.df.e.a("Delete BGV failed, videoPath: " + str + " audioPath: " + str2 + " error: " + e2.getMessage());
        }
    }
}
