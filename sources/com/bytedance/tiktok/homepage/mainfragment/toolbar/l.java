package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import com.zhiliaoapp.musically.R;

public final class l extends c {

    /* renamed from: a  reason: collision with root package name */
    private final b f44258a;

    static {
        Covode.recordClassIndex(27122);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return 8388629;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        return MusicDspServiceImpl.g().a();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        e activity = this.f44258a.getActivity();
        if (activity == null) {
            return null;
        }
        MusicDspServiceImpl.g().b();
        return ((X2CBaseInflate) f.a(new X2CIconStory())).a(activity, R.layout.a3r);
    }

    public l(b bVar) {
        h.f.b.l.d(bVar, "");
        this.f44258a = bVar;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        h.f.b.l.d(view, "");
        e activity = this.f44258a.getActivity();
        if (activity != null) {
            String g2 = this.f44258a.g();
            h.f.b.l.d(activity, "");
            h.f.b.l.d(g2, "");
            h.f.b.l.d("homepage_music_cover", "");
            MusicDspServiceImpl.g().a(activity, g2, "homepage_music_cover");
        }
    }
}
