package com.ss.android.ugc.aweme.shortvideo.edit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f126994a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(83325);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f126995a;

        static {
            Covode.recordClassIndex(83326);
        }

        a(VideoPublishEditModel videoPublishEditModel) {
            this.f126995a = videoPublishEditModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                if (!TextUtils.isEmpty(this.f126995a.mVideoSegmentsDesc) && this.f126995a.getOriginal() == 1) {
                    String f2 = e.f(dj.f126462e + "data.txt");
                    ar a2 = new ar().a("videoSegmentsDesc", this.f126995a.mVideoSegmentsDesc);
                    a2.a("data txt", f2);
                    a2.a("retake", Boolean.valueOf(this.f126995a.isRetakeVideo()));
                    a2.a("creation id", this.f126995a.creationId);
                    a2.a("from draft", Boolean.valueOf(this.f126995a.mIsFromDraft));
                    a2.a("video list", Integer.valueOf(this.f126995a.getPreviewInfo().getVideoList().size()));
                    q.a("draft_restore_2130_1: " + a2.a().toString());
                }
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (b.a()) {
            try {
                if (videoPublishEditModel.getOriginal() == 1) {
                    ar a2 = new ar().a("videoSegmentsDesc", videoPublishEditModel.mVideoSegmentsDesc);
                    a2.a("retake", Boolean.valueOf(videoPublishEditModel.isRetakeVideo()));
                    a2.a("creation id", videoPublishEditModel.creationId);
                    a2.a("from draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
                    a2.a("video list", Integer.valueOf(videoPublishEditModel.getPreviewInfo().getVideoList().size()));
                    q.a("draft_restore_2130_2: " + a2.a().toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
