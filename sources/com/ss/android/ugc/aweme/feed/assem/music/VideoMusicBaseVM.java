package com.ss.android.ugc.aweme.feed.assem.music;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class VideoMusicBaseVM extends FeedBaseViewModel<a> {
    static {
        Covode.recordClassIndex(58297);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new a();
    }

    public final void i() {
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            a(new a(videoItemParams, this));
        }
    }

    public final boolean h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
            Music music = aweme.getMusic();
            User author = aweme.getAuthor();
            if (!aweme.isLawCriticalCountry() || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) {
                return false;
            }
            return true;
        }
        return false;
    }

    static final class a extends m implements b<a, a> {
        final /* synthetic */ VideoItemParams $param;
        final /* synthetic */ VideoMusicBaseVM this$0;

        static {
            Covode.recordClassIndex(58298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoItemParams videoItemParams, VideoMusicBaseVM videoMusicBaseVM) {
            super(1);
            this.$param = videoItemParams;
            this.this$0 = videoMusicBaseVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return this.this$0.a((j) aVar2, this.$param);
        }
    }

    private static com.ss.android.ugc.aweme.commercialize.d.b a(int i2) {
        if (i2 == R.id.crb || i2 == R.id.crd) {
            return com.ss.android.ugc.aweme.commercialize.d.b.TITLE;
        }
        if (i2 == R.id.cpt) {
            return com.ss.android.ugc.aweme.commercialize.d.b.ICON;
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (android.text.TextUtils.equals(r1, r0.getOwnerId()) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r18, int r19) {
        /*
        // Method dump skipped, instructions count: 1051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM.a(android.content.Context, int):void");
    }
}
