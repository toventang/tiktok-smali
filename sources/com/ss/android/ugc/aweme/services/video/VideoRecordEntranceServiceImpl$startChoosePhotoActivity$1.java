package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;

public final class VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1 implements bb.a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ PhotoMvAnchorConfig $photoMvAnchorConfig;

    static {
        Covode.recordClassIndex(79873);
    }

    public final void onCancel() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.bb.a
    public final void onSuccess() {
        Activity activity = this.$context;
        Intent intent = this.$intent;
        PhotoMvAnchorConfig photoMvAnchorConfig = this.$photoMvAnchorConfig;
        f.a(intent);
        ShortVideoContext a2 = dn.a(intent, activity);
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setCreationId(a2.q);
        aVETParameter.setShootWay(a2.r);
        a2.E = aVETParameter;
        a2.aS = new PhotoMvConfig(photoMvAnchorConfig.getSlideshowMvId(), photoMvAnchorConfig.getTemplateType());
        bk.a(activity, new bk.a(activity, photoMvAnchorConfig, a2) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f132288a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PhotoMvAnchorConfig f132289b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ShortVideoContext f132290c;

            static {
                Covode.recordClassIndex(86643);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk.a
            public final void b() {
                d.a(this.f132288a, (int) R.string.doy).b();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk.a
            public final void a() {
                if (this.f132288a != null) {
                    Bundle bundle = new Bundle();
                    c.a(this.f132288a, as.a());
                    bundle.putInt("key_support_flag", 2);
                    bundle.putInt("key_photo_select_min_count", 1);
                    bundle.putInt("key_photo_select_max_count", 35);
                    bundle.putSerializable("key_music_model", this.f132289b.getMusicModel());
                    bundle.putInt("key_choose_scene", 9);
                    bundle.putParcelable("key_short_video_context", this.f132290c);
                    cr.a().a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(this.f132289b.getMusicModel()));
                    MvChoosePhotoActivity.a.a(this.f132288a, bundle, 1);
                }
            }

            {
                this.f132288a = r1;
                this.f132289b = r2;
                this.f132290c = r3;
            }
        });
    }

    VideoRecordEntranceServiceImpl$startChoosePhotoActivity$1(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        this.$context = activity;
        this.$intent = intent;
        this.$photoMvAnchorConfig = photoMvAnchorConfig;
    }
}
