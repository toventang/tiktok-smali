package com.ss.android.ugc.aweme.feed.background;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(58769);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.a$a  reason: collision with other inner class name */
    public static final class C2254a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92664a;

        static {
            Covode.recordClassIndex(58770);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getAlbumName() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final long getDuration() {
            return -1;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getLocalPath() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getPlayUrl() {
            return "";
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getId() {
            String aid = this.f92664a.getAid();
            l.b(aid, "");
            return aid;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final PlayModel getPlayModel() {
            return new PlayModel(null, null, null, 7, null);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getSongName() {
            String desc = this.f92664a.getDesc();
            if (desc == null) {
                return "";
            }
            return desc;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getArtistName() {
            String str;
            User author = this.f92664a.getAuthor();
            if (author == null || ("@" + author.getUniqueId()) == null) {
                return "";
            }
            return str;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
        public final String getCoverUrl() {
            UrlModel avatarMedium;
            List<String> urlList;
            String str;
            User author = this.f92664a.getAuthor();
            if (author == null || (avatarMedium = author.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null || (str = (String) n.g((List) urlList)) == null) {
                return "";
            }
            return str;
        }

        C2254a(Aweme aweme) {
            this.f92664a = aweme;
        }
    }

    public static final f a(Aweme aweme) {
        l.d(aweme, "");
        return new C2254a(aweme);
    }

    public static final boolean b(Aweme aweme) {
        l.d(aweme, "");
        if (aweme.isLive() || aweme.isAd()) {
            return true;
        }
        return false;
    }
}
