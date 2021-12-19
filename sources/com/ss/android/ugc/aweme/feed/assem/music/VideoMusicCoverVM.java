package com.ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.l;

public final class VideoMusicCoverVM extends FeedBaseViewModel<m> {

    /* renamed from: k  reason: collision with root package name */
    boolean f92276k;

    static {
        Covode.recordClassIndex(58299);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicCoverVM f92277a;

        static {
            Covode.recordClassIndex(58300);
        }

        a(VideoMusicCoverVM videoMusicCoverVM) {
            this.f92277a = videoMusicCoverVM;
        }

        public final void run() {
            this.f92277a.a(AnonymousClass1.f92278a);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicCoverVM f92279a;

        static {
            Covode.recordClassIndex(58302);
        }

        b(VideoMusicCoverVM videoMusicCoverVM) {
            this.f92279a = videoMusicCoverVM;
        }

        public final void run() {
            this.f92279a.a(AnonymousClass1.f92280a);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoMusicCoverVM f92281a;

        static {
            Covode.recordClassIndex(58304);
        }

        c(VideoMusicCoverVM videoMusicCoverVM) {
            this.f92281a = videoMusicCoverVM;
        }

        public final void run() {
            this.f92281a.a(AnonymousClass1.f92282a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new m();
    }

    static boolean h() {
        return com.bytedance.ies.abmock.b.a().a(true, "anim_opt", false);
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
    public final /* synthetic */ m a(m mVar, VideoItemParams videoItemParams) {
        Music music;
        boolean z;
        m mVar2 = mVar;
        l.d(mVar2, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
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
        return m.a(mVar2, music, z, false, false, false, false, 60);
    }
}
