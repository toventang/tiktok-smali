package com.ss.android.ugc.aweme.bx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.aj;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.d;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.publish.ac;
import com.ss.android.ugc.aweme.shortvideo.r.b;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.c;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.UUID;

public final class a implements b {
    static {
        Covode.recordClassIndex(42916);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final boolean a(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        return c.a(intent).a(context);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Context context, Intent intent, int i2, h.f.a.a<z> aVar) {
        List<? extends MediaModel> a2;
        l.d(context, "");
        l.d(intent, "");
        l.d(context, "");
        l.d(intent, "");
        VECutVideoActivity.a.C3268a aVar2 = new VECutVideoActivity.a.C3268a(context, intent, i2, aVar);
        if (!aj.a() || !(context instanceof e)) {
            aVar2.a();
            return;
        }
        if (intent.hasExtra("open_sdk_import_media_list")) {
            a2 = intent.getParcelableArrayListExtra("open_sdk_import_media_list");
        } else {
            MediaModel a3 = ad.a(VECutVideoActivity.a.a(intent, "file_path"));
            if (a3 != null) {
                a2 = n.a(a3);
            }
            aVar2.a();
        }
        if (a2 != null && !a2.isEmpty()) {
            g.a().L().a((e) context, a2, new VECutVideoActivity.a.b(context, a2, intent, aVar, aVar2));
            return;
        }
        aVar2.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final Intent a(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
        return MvChoosePhotoActivity.a.a(activity, bundle, 2, 1001);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void b(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        com.ss.android.ugc.tools.d.a.c.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void c(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        f.c((Context) activity, intent);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void e(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        VEVideoPublishEditActivity.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        intent.setClass(activity, VideoRecordPermissionActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void c(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        VEVideoPublishEditActivity.a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void d(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        f.c((Context) activity, intent);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent, 1002);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void b(Context context, Intent intent) {
        Class<?> cls;
        l.d(context, "");
        l.d(intent, "");
        if (!g.a().A().a()) {
            d.a();
            ac.a();
            g.a().o().a();
            g.a().o().p().a();
            cls = VideoPublishActivity.class;
        } else {
            cls = FTCVideoPublishActivity.class;
        }
        intent.setClass(context, cls);
        com.ss.android.ugc.tools.d.a.c.a(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, Intent intent, int i2) {
        l.d(activity, "");
        l.d(intent, "");
        d.a();
        ac.a();
        g.a().o().a();
        g.a().o().p().a();
        intent.setClass(activity, VideoPublishActivity.class);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent, i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, Intent intent, boolean z) {
        l.d(activity, "");
        l.d(intent, "");
        g.a().c().a(z);
        intent.setClass(activity, DraftBoxActivity.class);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, StitchParams stitchParams, String str) {
        l.d(activity, "");
        l.d(stitchParams, "");
        l.d(activity, "");
        l.d(stitchParams, "");
        Intent intent = new Intent();
        intent.setClass(activity, StitchTrimmingActivity.class);
        intent.putExtra("stitch_params", (Parcelable) stitchParams);
        if (str == null) {
            str = UUID.randomUUID().toString();
            l.b(str, "");
        }
        intent.putExtra("creation_id", str);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Context context, Intent intent, int i2) {
        l.d(context, "");
        l.d(intent, "");
        VECutVideoActivity.a.a(context, intent, i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, Bundle bundle, int i2, int i3) {
        l.d(activity, "");
        l.d(bundle, "");
        l.d(activity, "");
        l.d(bundle, "");
        activity.startActivityForResult(MvChoosePhotoActivity.a.a(activity, bundle, i2, i3), i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.r.b
    public final void a(Activity activity, MediaModel mediaModel, Effect effect, ShortVideoCommonParams shortVideoCommonParams) {
        l.d(activity, "");
        l.d(mediaModel, "");
        l.d(activity, "");
        l.d(mediaModel, "");
        h e2 = k.a().e();
        l.b(e2, "");
        e2.f47836a.a(CustomStickerPreviewActivity.a.C2668a.f104667a);
        Intent intent = new Intent();
        intent.setClass(activity, CustomStickerPreviewActivity.class);
        intent.putExtra("preview_sticker_params", mediaModel);
        if (!(effect instanceof Parcelable)) {
            effect = null;
        }
        intent.putExtra("custom_sticker", (Parcelable) effect);
        intent.putExtra("shoot_way", shortVideoCommonParams.shootWay);
        intent.putExtra("content_source", shortVideoCommonParams.contentSource);
        intent.putExtra("content_type", shortVideoCommonParams.contentType);
        intent.putExtra("creation_id", shortVideoCommonParams.creationId);
        activity.startActivityForResult(intent, 10004);
    }
}
