package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.x.c.c;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import h.f.b.l;
import java.util.ArrayList;

public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f135783a;

    static {
        Covode.recordClassIndex(88752);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    public b(Activity activity) {
        this.f135783a = activity;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        ArrayList parcelableArrayListExtra;
        ShortVideoContext shortVideoContext;
        long j2;
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
        l.d(intent, "");
        if (i3 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) != null && !parcelableArrayListExtra.isEmpty() && !c.a(((MediaModel) parcelableArrayListExtra.get(0)).f109390b)) {
            com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.b();
            Intent intent2 = new Intent();
            intent2.putExtra("file_path", ((MediaModel) parcelableArrayListExtra.get(0)).f109390b);
            intent2.putExtra("from_background_video", true);
            if (shortVideoContext.f124757b.t) {
                j2 = g.a().l().getMaxDurationResolver().getMaxShootingDuration();
            } else {
                j2 = 15000;
            }
            intent2.putExtra("background_video_max_length", j2);
            intent2.putExtra("enter_method", shortVideoContext.y);
            Workspace workspace = shortVideoContext.f124757b.f124713h;
            if (workspace != null) {
                backgroundVideoCompileConfigure = a.a(workspace);
            } else {
                backgroundVideoCompileConfigure = null;
            }
            intent2.putExtra("background_video_compile_configure", backgroundVideoCompileConfigure);
            Activity activity = this.f135783a;
            if (activity != null) {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a((Context) activity, intent2, i2);
            }
        }
    }
}
