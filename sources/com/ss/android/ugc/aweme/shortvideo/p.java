package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public bg.a f129529a;

    static {
        Covode.recordClassIndex(85018);
    }

    public abstract void a(Fragment fragment, View view);

    public final void a() {
        this.f129529a.d();
    }

    public final String b() {
        return this.f129529a.a();
    }

    public final int c() {
        return this.f129529a.b();
    }

    public final void a(int i2) {
        bg.a aVar = this.f129529a;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    public final void a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("creation_id", videoPublishEditModel.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", "video");
            hashMap.put("shoot_way", videoPublishEditModel.mShootWay);
            this.f129529a.c().setTag(hashMap);
        }
    }

    protected p(Fragment fragment, View view, int i2, boolean z) {
        a(fragment, view);
    }
}
