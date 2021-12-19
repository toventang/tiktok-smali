package com.ss.android.ugc.aweme.share.gif.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.metrics.ag;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.l;
import com.ss.android.ugc.tiktok.security.a.a;
import java.io.File;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoShare2GifPreviewActivity f123550a;

    /* renamed from: b  reason: collision with root package name */
    private final b f123551b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123552c;

    static {
        Covode.recordClassIndex(81109);
    }

    i(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, b bVar, String str) {
        this.f123550a = videoShare2GifPreviewActivity;
        this.f123551b = bVar;
        this.f123552c = str;
    }

    public final void onClick(View view) {
        Uri fromFile;
        ClickAgent.onClick(view);
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f123550a;
        b bVar = this.f123551b;
        String str = this.f123552c;
        r.a("share_as_gif", new s().a("group_id", videoShare2GifPreviewActivity.f123538d.f123489b).a("author_id", videoShare2GifPreviewActivity.f123538d.p).a("enter_from", videoShare2GifPreviewActivity.f123538d.q).a("log_pb", videoShare2GifPreviewActivity.f123538d.r).a("platform", bVar.a()).a());
        ag agVar = new ag();
        agVar.f109478a = videoShare2GifPreviewActivity.f123538d.f123489b;
        agVar.f109479b = videoShare2GifPreviewActivity.f123538d.p;
        ag a2 = agVar.a(videoShare2GifPreviewActivity.f123538d.q);
        a2.f109480c = bVar.a();
        a2.Z = "gif_form";
        a2.f();
        File file = new File(videoShare2GifPreviewActivity.f123538d.f123492e);
        if (Build.VERSION.SDK_INT >= 24) {
            fromFile = FileProvider.getUriForFile(videoShare2GifPreviewActivity, videoShare2GifPreviewActivity.getPackageName() + ".fileprovider", file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        if (TextUtils.equals(str, "facebook")) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.setClassName(videoShare2GifPreviewActivity.getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
            intent.putExtra("android.intent.extra.STREAM", fromFile);
            Intent createChooser = Intent.createChooser(Intent.createChooser(intent, ""), "");
            a.a(createChooser, videoShare2GifPreviewActivity);
            videoShare2GifPreviewActivity.startActivity(createChooser);
        } else {
            bVar.a(new l(fromFile, videoShare2GifPreviewActivity.f123538d.f123492e), (Context) videoShare2GifPreviewActivity);
        }
        videoShare2GifPreviewActivity.f123539e = true;
    }
}
