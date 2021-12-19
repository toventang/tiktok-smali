package com.ss.android.ugc.aweme.shoutouts;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f133175a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(87088);
    }

    public static String a() {
        return g.a().g().c().c("shoutout");
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133176a = new a();

        static {
            Covode.recordClassIndex(87089);
        }

        a() {
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event in publish preview page");
        }
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mShoutOutsData == null) {
            return false;
        }
        return l.a((Object) videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), (Object) d.MODE_SEND);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(androidx.appcompat.app.d r13, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, dmt.av.video.z r15, androidx.lifecycle.n r16, android.view.SurfaceView r17) {
        /*
        // Method dump skipped, instructions count: 704
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.f.a(androidx.appcompat.app.d, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, dmt.av.video.z, androidx.lifecycle.n, android.view.SurfaceView):void");
    }
}
