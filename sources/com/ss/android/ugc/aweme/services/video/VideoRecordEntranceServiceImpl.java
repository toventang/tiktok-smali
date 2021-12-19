package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.i;

public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion(null);
    public static final h INSTANCE$delegate = i.a((a) VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79870);
        }

        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return (VideoRecordEntranceServiceImpl) VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private VideoRecordEntranceServiceImpl() {
    }

    static {
        Covode.recordClassIndex(79869);
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(g gVar) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startChangeBanMusicEditActivity(Context context, Intent intent) {
        l.d(context, "");
        com.ss.android.ugc.aweme.shortvideo.r.a.a().c(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Activity activity, Intent intent) {
        c.H.a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(activity, intent));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        l.d(activity, "");
        if (TextUtils.isEmpty(f.a(intent, "shoot_way"))) {
            intent.putExtra("shoot_way", "super_entrance");
        }
        intent.putExtra("translation_type", 3);
        f.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Context context, Intent intent) {
        c.H.a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(context, intent));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startChoosePhotoActivity(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        l.d(activity, "");
        l.d(photoMvAnchorConfig, "");
        c.H.a(new VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1(activity, intent, photoMvAnchorConfig));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        l.d(context, "");
        l.d(intent, "");
        c.H.a(new VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(context, intent, z, z2, z3));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public final void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        l.d(activity, "");
        l.d(intent, "");
        c.H.a(new VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(activity, intent, z, z2, z3));
    }
}
