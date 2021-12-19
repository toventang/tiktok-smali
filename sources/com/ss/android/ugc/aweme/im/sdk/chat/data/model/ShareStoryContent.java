package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.story.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ShareStoryContent extends ShareAwemeContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "expired_at")
    private Long expireAt = 0L;
    @c(a = "source_type")
    private Integer sourceType = 0;
    private String storyCollectionId = "";

    static {
        Covode.recordClassIndex(64076);
    }

    public static final ShareStoryContent fromAweme(Aweme aweme) {
        return Companion.fromAweme(aweme);
    }

    public static final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final boolean isStory(BaseContent baseContent) {
        return Companion.isStory(baseContent);
    }

    public static final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
        return Companion.isStoryExpired(shareStoryContent);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent
    public final boolean showQuoteHint() {
        return true;
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64077);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final boolean isStory(BaseContent baseContent) {
            l.d(baseContent, "");
            return baseContent instanceof ShareStoryContent;
        }

        private final int getAweType(Integer num) {
            if (num != null && num.intValue() == 1) {
                return 0;
            }
            return 1;
        }

        public final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
            l.d(shareStoryContent, "");
            Long expireAt = shareStoryContent.getExpireAt();
            if (expireAt == null || expireAt.longValue() >= System.currentTimeMillis()) {
                return false;
            }
            return true;
        }

        public final ShareStoryContent fromAweme(Aweme aweme) {
            UrlModel urlModel;
            UrlModel urlModel2;
            float f2;
            long j2;
            String nickname;
            String str = "";
            l.d(aweme, str);
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            shareStoryContent.user = aweme.getAuthorUid();
            shareStoryContent.secUid = aweme.getSecAuthorUid();
            shareStoryContent.itemId = aweme.getAid();
            shareStoryContent.setStoryCollectionId(a.b(aweme));
            Video video = aweme.getVideo();
            if (video == null || (urlModel = video.getCover()) == null) {
                urlModel = new UrlModel();
            }
            shareStoryContent.coverUrl = urlModel;
            User author = aweme.getAuthor();
            if (author == null || (urlModel2 = author.getAvatarThumb()) == null) {
                urlModel2 = new UrlModel();
            }
            shareStoryContent.contentThumb = urlModel2;
            User author2 = aweme.getAuthor();
            if (!(author2 == null || (nickname = author2.getNickname()) == null)) {
                str = nickname;
            }
            shareStoryContent.contentName = str;
            Video video2 = aweme.getVideo();
            float f3 = 0.0f;
            if (video2 != null) {
                f2 = (float) video2.getWidth();
            } else {
                f2 = 0.0f;
            }
            shareStoryContent.width = f2;
            Video video3 = aweme.getVideo();
            if (video3 != null) {
                f3 = (float) video3.getHeight();
            }
            shareStoryContent.height = f3;
            shareStoryContent.title = aweme.getDesc();
            Story story = aweme.getStory();
            if (story != null) {
                j2 = story.getExpiredAt();
            } else {
                j2 = 0;
            }
            shareStoryContent.setExpireAt(Long.valueOf(j2));
            shareStoryContent.setSourceType(1);
            shareStoryContent.awemeType = 40;
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            return shareStoryContent;
        }

        public final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            Bundle bundle = sharePackage.f124595i;
            shareStoryContent.user = bundle.getString("uid_for_share");
            shareStoryContent.secUid = bundle.getString("sec_user_id");
            shareStoryContent.itemId = bundle.getString("item_id_string");
            Serializable serializable = bundle.getSerializable("video_cover");
            UrlModel urlModel = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStoryContent.coverUrl = (UrlModel) serializable;
            Serializable serializable2 = bundle.getSerializable("thumb_for_share");
            if (serializable2 instanceof UrlModel) {
                urlModel = serializable2;
            }
            shareStoryContent.contentThumb = urlModel;
            shareStoryContent.contentName = bundle.getString("author_name");
            shareStoryContent.width = (float) bundle.getInt("aweme_width");
            shareStoryContent.height = (float) bundle.getInt("aweme_height");
            shareStoryContent.title = bundle.getString("desc");
            shareStoryContent.setExpireAt(Long.valueOf(bundle.getLong("expired_at", 0)));
            shareStoryContent.setSourceType(Integer.valueOf(bundle.getInt("source_type", 0)));
            shareStoryContent.awemeType = 40;
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            return shareStoryContent;
        }
    }

    public final Long getExpireAt() {
        return this.expireAt;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final String getStoryCollectionId() {
        return this.storyCollectionId;
    }

    public ShareStoryContent() {
        this.awemeType = 40;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        long j2;
        SharePackage a2 = PureDataSharePackage.a.a("story_video");
        Bundle bundle = a2.f124595i;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putString("author_name", this.contentName);
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putSerializable("thumb_for_share", this.contentThumb);
        bundle.putString("desc", this.title);
        Long l2 = this.expireAt;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        bundle.putLong("expired_at", j2);
        bundle.putInt("source_type", 3);
        bundle.putInt("aweme_height", (int) this.height);
        bundle.putInt("aweme_width", (int) this.width);
        bundle.putInt("aweme_type", this.type);
        return a2;
    }

    public final void setExpireAt(Long l2) {
        this.expireAt = l2;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }

    public final void setStoryCollectionId(String str) {
        l.d(str, "");
        this.storyCollectionId = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        l.d(context, "");
        String string = context.getResources().getString(R.string.ch3);
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        if (!com.ss.android.ugc.aweme.story.g.f137757a.a()) {
            return super.wrapMsgHint(z, z2, str);
        }
        Context a2 = d.a();
        if (z || z2) {
            str2 = a2.getString(R.string.hfv);
        } else {
            str2 = a2.getString(R.string.hfu);
        }
        ShareAwemeContent.awemeMsgHint = str2;
        return str2;
    }
}
