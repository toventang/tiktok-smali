package com.ss.android.ugc.aweme.scheduler;

import android.os.Bundle;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.video.e;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class a {
    static {
        Covode.recordClassIndex(78735);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.a$a  reason: collision with other inner class name */
    public static final class CallableC3125a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f120849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120850b;

        static {
            Covode.recordClassIndex(78736);
        }

        CallableC3125a(Object obj, String str) {
            this.f120849a = obj;
            this.f120850b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (((VideoPublishEditModel) this.f120849a).isMvThemeVideoType()) {
                str = ((VideoPublishEditModel) this.f120849a).mvCreateVideoData.videoCoverImgPath;
            } else {
                str = ((VideoPublishEditModel) this.f120849a).multiEditVideoRecordData.coverImagePath;
            }
            e.c(str, this.f120850b);
            return null;
        }
    }

    public static final q a(Bundle bundle) {
        String uuid;
        l.d(bundle, "");
        String string = bundle.getString("shoot_way", "");
        boolean z = bundle.getBoolean("publish_retry", false);
        boolean z2 = bundle.getBoolean("review_video_fast_publish", false);
        boolean z3 = bundle.getBoolean("shoutouts_video_fast_publish", false);
        int i2 = bundle.getInt("publish_permission", -1);
        if (bundle.containsKey("extra_video_publish_args")) {
            Serializable serializable = bundle.getSerializable("extra_video_publish_args");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            int i3 = bundle.getInt("pre_publish_type", 0);
            boolean z4 = videoPublishEditModel instanceof VideoPublishEditModel;
            if (z4) {
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                String str = videoPublishEditModel2.creationId;
                if (str == null || str.length() == 0) {
                    h.c("VideoPublishEditModel NullCreationId shootWay:" + videoPublishEditModel.mShootWay);
                    videoPublishEditModel2.creationId = UUID.randomUUID().toString();
                }
                uuid = videoPublishEditModel2.creationId;
            } else {
                h.c("Error editModel");
                g.a().o().h().a("publish data converter", new IllegalArgumentException("Edit model type not supported yet, actual=" + videoPublishEditModel.getClass().getSimpleName()));
                uuid = UUID.randomUUID().toString();
            }
            l.b(string, "");
            l.b(uuid, "");
            l.d(videoPublishEditModel, "");
            List a2 = n.a("");
            if (z4) {
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                if (videoPublishEditModel3.isMvThemeVideoType() || videoPublishEditModel3.isMultiVideoEdit()) {
                    String a3 = v.a.a();
                    a2 = n.a(a3);
                    i.b(new CallableC3125a(videoPublishEditModel, a3), i.f4824a);
                } else {
                    String validVideoCoverPath = videoPublishEditModel3.getValidVideoCoverPath();
                    if (validVideoCoverPath != null) {
                        a2 = n.a(validVideoCoverPath);
                    }
                }
            }
            return new q(string, uuid, i3, z, z2, z3, i2, a2, videoPublishEditModel, bundle.getBoolean("publish_story_mode", false));
        }
        throw new AssertionError("publish service not supported this publish");
    }
}
