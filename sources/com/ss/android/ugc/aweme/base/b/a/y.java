package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.api.d.e;

final class y implements e {

    /* renamed from: a  reason: collision with root package name */
    private Context f68036a;

    /* renamed from: b  reason: collision with root package name */
    private Keva f68037b;

    static {
        Covode.recordClassIndex(41906);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void b(String str) {
        this.f68037b.storeString("tutorial_video_msg_id", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void d(String str) {
        this.f68037b.storeString("tutorial_video_icon", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void f(String str) {
        this.f68037b.storeString("tutorial_video_title", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void h(String str) {
        this.f68037b.storeString("tutorial_video_desc", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void j(String str) {
        this.f68037b.storeString("tutorial_video_button", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final void l(String str) {
        this.f68037b.storeString("tutorial_video_deep_link", str);
    }

    public y(Context context) {
        this.f68036a = context;
        this.f68037b = Keva.getRepoFromSp(context, "TutorialVideoPreference", 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String a(String str) {
        return this.f68037b.getString("tutorial_video_msg_id", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String c(String str) {
        return this.f68037b.getString("tutorial_video_icon", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String e(String str) {
        return this.f68037b.getString("tutorial_video_title", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String g(String str) {
        return this.f68037b.getString("tutorial_video_desc", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String i(String str) {
        return this.f68037b.getString("tutorial_video_button", str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.e
    public final String k(String str) {
        return this.f68037b.getString("tutorial_video_deep_link", str);
    }
}
