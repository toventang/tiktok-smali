package com.ss.android.ugc.aweme.external;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import h.f.b.m;
import h.h;
import h.i;

public final class d implements IActivityNameService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f90375a = i.a((h.f.a.a) b.f90377a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f90376b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(56727);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private d() {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getDraftBoxActivity() {
        return DraftBoxActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoEditActivityClass() {
        return VEVideoPublishEditActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoPublishActivityClass() {
        return VideoPublishActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoPublishPreviewActivityClass() {
        return VEVideoPublishPreviewActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordPermissionActivityClass() {
        return VideoRecordPermissionActivity.class;
    }

    static final class b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90377a = new b();

        static {
            Covode.recordClassIndex(56728);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(56726);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordActivityClass() {
        if (g.a().A().a()) {
            return FTCVideoRecordNewActivity.class;
        }
        return VideoRecordNewActivity.class;
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
