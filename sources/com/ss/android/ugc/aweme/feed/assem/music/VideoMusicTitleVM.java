package com.ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.l;

public final class VideoMusicTitleVM extends FeedBaseViewModel<x> {

    /* renamed from: k  reason: collision with root package name */
    boolean f92283k;

    static {
        Covode.recordClassIndex(58306);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicTitleVM f92284a;

        static {
            Covode.recordClassIndex(58307);
        }

        a(VideoMusicTitleVM videoMusicTitleVM) {
            this.f92284a = videoMusicTitleVM;
        }

        public final void run() {
            this.f92284a.a(AnonymousClass1.f92285a);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicTitleVM f92286a;

        static {
            Covode.recordClassIndex(58309);
        }

        b(VideoMusicTitleVM videoMusicTitleVM) {
            this.f92286a = videoMusicTitleVM;
        }

        public final void run() {
            this.f92286a.a(AnonymousClass1.f92287a);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicTitleVM f92288a;

        static {
            Covode.recordClassIndex(58311);
        }

        c(VideoMusicTitleVM videoMusicTitleVM) {
            this.f92288a = videoMusicTitleVM;
        }

        public final void run() {
            this.f92288a.a(AnonymousClass1.f92289a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new x();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ x a(x xVar, VideoItemParams videoItemParams) {
        Music music;
        boolean z;
        x xVar2 = xVar;
        l.d(xVar2, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        AwemeRawAd awemeRawAd = null;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        Aweme aweme2 = videoItemParams.mAweme;
        if (aweme2 == null || !aweme2.isScheduleVideo()) {
            z = false;
        } else {
            z = true;
        }
        Aweme aweme3 = videoItemParams.mAweme;
        if (aweme3 != null) {
            awemeRawAd = aweme3.getAwemeRawAd();
        }
        return x.a(xVar2, music, z, awemeRawAd, false, false, false, 56);
    }
}
