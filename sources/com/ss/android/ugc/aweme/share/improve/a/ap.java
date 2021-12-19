package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.improve.c.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ap implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Music f123642a;

    static {
        Covode.recordClassIndex(81162);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fcs;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "report_music";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_flag;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    public ap(Music music) {
        l.d(music, "");
        this.f123642a = music;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        String ownerId;
        l.d(context, "");
        l.d(sharePackage, "");
        if (TextUtils.isEmpty(this.f123642a.getOwnerId())) {
            ownerId = "0";
        } else {
            ownerId = this.f123642a.getOwnerId();
        }
        a.a().a(b.a(context), new Uri.Builder().appendQueryParameter("report_type", "music").appendQueryParameter("object_id", this.f123642a.getMid()).appendQueryParameter("owner_id", ownerId));
        a.a().a("", "music", "", this.f123642a.getMid(), this.f123642a.getOwnerId(), "", "click_share_button");
    }
}
