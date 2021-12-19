package com.ss.android.ugc.aweme.im.sdk.chat.data.e;

import android.text.TextUtils;
import android.view.View;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupAnnouncementContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bj;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bk;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bl;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public class b extends Enum<b> {
    public static final b BIG_EMOJI_RECEIVE;
    public static final b BIG_EMOJI_SEND;
    public static final b CARD;
    public static final b COMMENT_RECEIVE;
    public static final b COMMENT_SEND;
    public static final f Companion = new f((byte) 0);
    public static final b DEFAULT_RECEIVE;
    public static final b DEFAULT_SEND;
    public static final b GROUP_ANNOUNCEMENT_RECEIVE;
    public static final b GROUP_ANNOUNCEMENT_SEND;
    public static final b GROUP_GREETING_MSG;
    public static final b GROUP_INVITE_RECEIVE;
    public static final b GROUP_INVITE_SEND;
    public static final b GROUP_SYSTEM_MSG;
    public static final b LOAD_MORE;
    public static final b NOTICE_DANGER_WARNNING_TOP;
    public static final b PUSH_NOTIFICATION_GUIDE;
    public static final b SAY_HELLO;
    public static final b SHARE_AWEME_RECEIVE;
    public static final b SHARE_AWEME_SEND;
    public static final b SHARE_CHALLENGE_MULTI_RECEIVE;
    public static final b SHARE_CHALLENGE_MULTI_SEND;
    public static final b SHARE_CHALLENGE_SIMPLE_RECEIVE;
    public static final b SHARE_CHALLENGE_SIMPLE_SEND;
    public static final b SHARE_COMPILATION_MULTI_RECEIVE;
    public static final b SHARE_COMPILATION_MULTI_SEND;
    public static final b SHARE_COMPILATION_SIMPLE_RECEIVE;
    public static final b SHARE_COMPILATION_SIMPLE_SEND;
    public static final b SHARE_LIVE_EVENT_RECEIVE;
    public static final b SHARE_LIVE_EVENT_SEND;
    public static final b SHARE_LIVE_RECEIVE;
    public static final b SHARE_LIVE_SEND;
    public static final b SHARE_MUSIC_MULTI_RECEIVE;
    public static final b SHARE_MUSIC_MULTI_SEND;
    public static final b SHARE_MUSIC_SIMPLE_RECEIVE;
    public static final b SHARE_MUSIC_SIMPLE_SEND;
    public static final b SHARE_QNA_MULTI_RECEIVE;
    public static final b SHARE_QNA_MULTI_SEND;
    public static final b SHARE_QNA_SIMPLE_RECEIVE;
    public static final b SHARE_QNA_SIMPLE_SEND;
    public static final b SHARE_SEARCH_RECEIVE;
    public static final b SHARE_SEARCH_SEND;
    public static final b SHARE_STICKER_MULTI_RECEIVE;
    public static final b SHARE_STICKER_MULTI_SEND;
    public static final b SHARE_STICKER_SIMPLE_RECEIVE;
    public static final b SHARE_STICKER_SIMPLE_SEND;
    public static final b SHARE_STORY_RECEIVE;
    public static final b SHARE_STORY_SEND;
    public static final b SHARE_USER_MULTI_RECEIVE;
    public static final b SHARE_USER_MULTI_SEND;
    public static final b SHARE_USER_SIMPLE_RECEIVE;
    public static final b SHARE_USER_SIMPLE_SEND;
    public static final b SHARE_WEB_FROM_THIRD_RECEIVE;
    public static final b SHARE_WEB_FROM_THIRD_SEND;
    public static final b SHARE_WEB_RECEIVE;
    public static final b SHARE_WEB_SEND;
    public static final b SYSTEM_RECEIVE;
    public static final b TEXT_BIG_EMOJI_RECEIVE;
    public static final b TEXT_BIG_EMOJI_SEND;
    public static final b TEXT_RECEIVE;
    public static final b TEXT_SEND;
    public static final b VIDEO_UPDATE_TIPS;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ b[] f100322a;
    public static final Map<Integer, b> lookupMap;
    private final int itemLayoutId;
    private final Class<? extends BaseContent> messageContentClazz;
    private final int viewType;

    public static final BaseContent content(int i2, String str, boolean z2, long j2) {
        return Companion.a(i2, str, z2, j2);
    }

    public static final BaseContent content(com.bytedance.im.core.d.ai aiVar) {
        return f.b(aiVar);
    }

    public static final <T extends BaseContent> T content(com.bytedance.im.core.d.ai aiVar, b bVar) {
        return (T) f.a(aiVar, bVar);
    }

    public static final b valueOf(com.bytedance.im.core.d.ai aiVar) {
        return f.a(aiVar);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f100322a.clone();
    }

    static final class a extends b {
        private final int itemLayoutId = R.layout.a5e;
        private final Class<EmojiContent> messageContentClazz = EmojiContent.class;

        static {
            Covode.recordClassIndex(63957);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<EmojiContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 7, null);
        }
    }

    static final class aa extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareCompilationContent> messageContentClazz = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63958);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aa(String str) {
            super(str, 38, null);
        }
    }

    static final class ab extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareCompilationContent> messageContentClazz = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(63959);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ab(String str) {
            super(str, 39, null);
        }
    }

    static final class ac extends b {
        private final int itemLayoutId = R.layout.a5v;
        private final Class<ShareLiveEventContent> messageContentClazz = ShareLiveEventContent.class;

        static {
            Covode.recordClassIndex(63960);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareLiveEventContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ac(String str) {
            super(str, 21, null);
        }
    }

    static final class ad extends b {
        private final int itemLayoutId = R.layout.a5w;
        private final Class<ShareLiveEventContent> messageContentClazz = ShareLiveEventContent.class;

        static {
            Covode.recordClassIndex(63961);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareLiveEventContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(String str) {
            super(str, 20, null);
        }
    }

    static final class ae extends b {
        private final int itemLayoutId = R.layout.a5y;
        private final Class<ShareLiveContent> messageContentClazz = ShareLiveContent.class;

        static {
            Covode.recordClassIndex(63962);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareLiveContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ae(String str) {
            super(str, 35, null);
        }
    }

    static final class af extends b {
        private final int itemLayoutId = R.layout.a5z;
        private final Class<ShareLiveContent> messageContentClazz = ShareLiveContent.class;

        static {
            Covode.recordClassIndex(63963);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareLiveContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        af(String str) {
            super(str, 34, null);
        }
    }

    static final class ag extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareMusicContent> messageContentClazz = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63964);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ag(String str) {
            super(str, 17, null);
        }
    }

    static final class ah extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareMusicContent> messageContentClazz = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63965);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ah(String str) {
            super(str, 16, null);
        }
    }

    static final class ai extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareMusicContent> messageContentClazz = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63966);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ai(String str) {
            super(str, 19, null);
        }
    }

    static final class aj extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareMusicContent> messageContentClazz = ShareMusicContent.class;

        static {
            Covode.recordClassIndex(63967);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareMusicContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aj(String str) {
            super(str, 18, null);
        }
    }

    static final class ak extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareQnAContent> messageContentClazz = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63968);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ak(String str) {
            super(str, 56, null);
        }
    }

    static final class al extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareQnAContent> messageContentClazz = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63969);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        al(String str) {
            super(str, 55, null);
        }
    }

    static final class am extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareQnAContent> messageContentClazz = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63970);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        am(String str) {
            super(str, 58, null);
        }
    }

    static final class an extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareQnAContent> messageContentClazz = ShareQnAContent.class;

        static {
            Covode.recordClassIndex(63971);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareQnAContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        an(String str) {
            super(str, 57, null);
        }
    }

    static final class ao extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareSearchContent> messageContentClazz = ShareSearchContent.class;

        static {
            Covode.recordClassIndex(63972);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareSearchContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ao(String str) {
            super(str, 23, null);
        }
    }

    static final class ap extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareSearchContent> messageContentClazz = ShareSearchContent.class;

        static {
            Covode.recordClassIndex(63973);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareSearchContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ap(String str) {
            super(str, 22, null);
        }
    }

    static final class aq extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareStickerContent> messageContentClazz = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63974);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aq(String str) {
            super(str, 40, null);
        }
    }

    static final class ar extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareStickerContent> messageContentClazz = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63975);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ar(String str) {
            super(str, 41, null);
        }
    }

    static final class as extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareStickerContent> messageContentClazz = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63976);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        as(String str) {
            super(str, 42, null);
        }
    }

    static final class at extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareStickerContent> messageContentClazz = ShareStickerContent.class;

        static {
            Covode.recordClassIndex(63977);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStickerContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        at(String str) {
            super(str, 43, null);
        }
    }

    static final class au extends b {
        private final int itemLayoutId = R.layout.a67;
        private final Class<ShareStoryContent> messageContentClazz = ShareStoryContent.class;

        static {
            Covode.recordClassIndex(63978);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStoryContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        au(String str) {
            super(str, 5, null);
        }
    }

    static final class av extends b {
        private final int itemLayoutId = R.layout.a68;
        private final Class<ShareStoryContent> messageContentClazz = ShareStoryContent.class;

        static {
            Covode.recordClassIndex(63979);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareStoryContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        av(String str) {
            super(str, 6, null);
        }
    }

    static final class aw extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareUserContent> messageContentClazz = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63980);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aw(String str) {
            super(str, 29, null);
        }
    }

    static final class ax extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareUserContent> messageContentClazz = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63981);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ax(String str) {
            super(str, 28, null);
        }
    }

    static final class ay extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareUserContent> messageContentClazz = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63982);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ay(String str) {
            super(str, 31, null);
        }
    }

    static final class az extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareUserContent> messageContentClazz = ShareUserContent.class;

        static {
            Covode.recordClassIndex(63983);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareUserContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        az(String str) {
            super(str, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.e.b$b  reason: collision with other inner class name */
    static final class C2465b extends b {
        private final int itemLayoutId = R.layout.a5f;
        private final Class<EmojiContent> messageContentClazz = EmojiContent.class;

        static {
            Covode.recordClassIndex(63984);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<EmojiContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2465b(String str) {
            super(str, 8, null);
        }
    }

    static final class ba extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareWebContent> messageContentClazz = ShareWebContent.class;

        static {
            Covode.recordClassIndex(63985);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareWebContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ba(String str) {
            super(str, 33, null);
        }
    }

    static final class bb extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareWebContent> messageContentClazz = ShareWebContent.class;

        static {
            Covode.recordClassIndex(63986);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareWebContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bb(String str) {
            super(str, 32, null);
        }
    }

    static final class bc extends b {
        private final int itemLayoutId = R.layout.a6_;
        private final Class<SystemContent> messageContentClazz = SystemContent.class;

        static {
            Covode.recordClassIndex(63987);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<SystemContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bc(String str) {
            super(str, 0, null);
        }
    }

    static final class bd extends b {
        private final int itemLayoutId = R.layout.a6a;
        private final Class<TextContent> messageContentClazz = TextContent.class;

        static {
            Covode.recordClassIndex(63988);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<TextContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bd(String str) {
            super(str, 51, null);
        }
    }

    static final class be extends b {
        private final int itemLayoutId = R.layout.a6b;
        private final Class<TextContent> messageContentClazz = TextContent.class;

        static {
            Covode.recordClassIndex(63989);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<TextContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        be(String str) {
            super(str, 50, null);
        }
    }

    static final class bf extends b {
        private final int itemLayoutId = R.layout.a6c;
        private final Class<TextContent> messageContentClazz = TextContent.class;

        static {
            Covode.recordClassIndex(63990);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<TextContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bf(String str) {
            super(str, 1, null);
        }
    }

    static final class bg extends b {
        private final int itemLayoutId = R.layout.a6d;
        private final Class<TextContent> messageContentClazz = TextContent.class;

        static {
            Covode.recordClassIndex(63991);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<TextContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bg(String str) {
            super(str, 2, null);
        }
    }

    static final class bh extends b {
        private final int itemLayoutId = R.layout.a6f;
        private final Class<VideoUpdateTipsContent> messageContentClazz = VideoUpdateTipsContent.class;

        static {
            Covode.recordClassIndex(63992);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<VideoUpdateTipsContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bh(String str) {
            super(str, 14, null);
        }
    }

    static final class c extends b {
        private final int itemLayoutId = R.layout.a69;
        private final Class<SystemCardContent> messageContentClazz = SystemCardContent.class;

        static {
            Covode.recordClassIndex(63993);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<SystemCardContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(String str) {
            super(str, 52, null);
        }
    }

    static final class d extends b {
        private final int itemLayoutId = R.layout.a5g;
        private final Class<CommentContent> messageContentClazz = CommentContent.class;

        static {
            Covode.recordClassIndex(63994);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<CommentContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(String str) {
            super(str, 9, null);
        }
    }

    static final class e extends b {
        private final int itemLayoutId = R.layout.a5h;
        private final Class<CommentContent> messageContentClazz = CommentContent.class;

        static {
            Covode.recordClassIndex(63995);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<CommentContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(String str) {
            super(str, 10, null);
        }
    }

    public static final class f {
        static {
            Covode.recordClassIndex(63996);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }

        private static boolean a(Integer num) {
            if (num == null || num.intValue() < 3) {
                return true;
            }
            return false;
        }

        public static BaseContent b(com.bytedance.im.core.d.ai aiVar) {
            h.f.b.l.d(aiVar, "");
            return a(aiVar, a(aiVar));
        }

        public static String a(boolean z) {
            String string;
            if (z) {
                string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cgh);
            } else if (!z) {
                string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cgg);
            } else {
                throw new h.n();
            }
            h.f.b.l.b(string, "");
            String string2 = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cef);
            h.f.b.l.b(string2, "");
            return string + ' ' + string2;
        }

        public static b a(com.bytedance.im.core.d.ai aiVar) {
            List<UrlModel> coverUrl;
            List<UrlModel> awemeCoverList;
            List<UrlModel> awemeCoverList2;
            List<UrlModel> awemeCoverList3;
            List<UrlModel> awemeCoverList4;
            List<UrlModel> awemeCoverList5;
            h.f.b.l.d(aiVar, "");
            if (!TextUtils.isEmpty(aiVar.getContent()) && !aiVar.isRecalled()) {
                int msgType = aiVar.getMsgType();
                if (msgType != 1) {
                    if (msgType != 5) {
                        Integer num = null;
                        if (msgType == 19) {
                            ShareChallengeContent shareChallengeContent = (ShareChallengeContent) a(aiVar, b.SHARE_CHALLENGE_MULTI_RECEIVE);
                            if (!(shareChallengeContent == null || (coverUrl = shareChallengeContent.getCoverUrl()) == null)) {
                                num = Integer.valueOf(coverUrl.size());
                            }
                            if (a(num)) {
                                if (aiVar.isSelf()) {
                                    return b.SHARE_CHALLENGE_SIMPLE_SEND;
                                }
                                return b.SHARE_CHALLENGE_SIMPLE_RECEIVE;
                            } else if (aiVar.isSelf()) {
                                return b.SHARE_CHALLENGE_MULTI_SEND;
                            } else {
                                return b.SHARE_CHALLENGE_MULTI_RECEIVE;
                            }
                        } else if (msgType != 33) {
                            if (msgType != 40) {
                                if (msgType != 1021) {
                                    if (msgType != 1025) {
                                        if (msgType != 1036) {
                                            if (msgType == 7) {
                                                TextContent textContent = (TextContent) a(aiVar, b.TEXT_RECEIVE);
                                                if (textContent != null && aiVar.getReferenceInfo() == null && com.ss.android.ugc.aweme.emoji.sysemoji.n.e()) {
                                                    com.bytedance.ies.ugc.appcontext.d.a();
                                                    if (com.ss.android.ugc.aweme.im.sdk.relations.b.a.b(textContent.getText())) {
                                                        if (aiVar.isSelf()) {
                                                            return b.TEXT_BIG_EMOJI_SEND;
                                                        }
                                                        return b.TEXT_BIG_EMOJI_RECEIVE;
                                                    }
                                                }
                                                if (aiVar.isSelf()) {
                                                    return b.TEXT_SEND;
                                                }
                                                return b.TEXT_RECEIVE;
                                            } else if (msgType != 8) {
                                                if (msgType == 9) {
                                                    return b.LOAD_MORE;
                                                }
                                                if (msgType == 14) {
                                                    return b.VIDEO_UPDATE_TIPS;
                                                }
                                                if (msgType == 15) {
                                                    return b.SAY_HELLO;
                                                }
                                                if (msgType != 21) {
                                                    if (msgType == 22) {
                                                        ShareMusicContent shareMusicContent = (ShareMusicContent) a(aiVar, b.SHARE_MUSIC_MULTI_RECEIVE);
                                                        if (!(shareMusicContent == null || (awemeCoverList2 = shareMusicContent.getAwemeCoverList()) == null)) {
                                                            num = Integer.valueOf(awemeCoverList2.size());
                                                        }
                                                        if (a(num)) {
                                                            if (aiVar.isSelf()) {
                                                                return b.SHARE_MUSIC_SIMPLE_SEND;
                                                            }
                                                            return b.SHARE_MUSIC_SIMPLE_RECEIVE;
                                                        } else if (aiVar.isSelf()) {
                                                            return b.SHARE_MUSIC_MULTI_SEND;
                                                        } else {
                                                            return b.SHARE_MUSIC_MULTI_RECEIVE;
                                                        }
                                                    } else if (msgType == 25) {
                                                        ShareUserContent shareUserContent = (ShareUserContent) a(aiVar, b.SHARE_USER_MULTI_RECEIVE);
                                                        if (!(shareUserContent == null || (awemeCoverList3 = shareUserContent.getAwemeCoverList()) == null)) {
                                                            num = Integer.valueOf(awemeCoverList3.size());
                                                        }
                                                        if (a(num)) {
                                                            if (aiVar.isSelf()) {
                                                                return b.SHARE_USER_SIMPLE_SEND;
                                                            }
                                                            return b.SHARE_USER_SIMPLE_RECEIVE;
                                                        } else if (aiVar.isSelf()) {
                                                            return b.SHARE_USER_MULTI_SEND;
                                                        } else {
                                                            return b.SHARE_USER_MULTI_RECEIVE;
                                                        }
                                                    } else if (msgType != 26) {
                                                        if (msgType == 71) {
                                                            ShareCompilationContent shareCompilationContent = (ShareCompilationContent) a(aiVar, b.SHARE_COMPILATION_MULTI_RECEIVE);
                                                            if (!(shareCompilationContent == null || (awemeCoverList4 = shareCompilationContent.getAwemeCoverList()) == null)) {
                                                                num = Integer.valueOf(awemeCoverList4.size());
                                                            }
                                                            if (a(num)) {
                                                                if (aiVar.isSelf()) {
                                                                    return b.SHARE_COMPILATION_SIMPLE_SEND;
                                                                }
                                                                return b.SHARE_COMPILATION_SIMPLE_RECEIVE;
                                                            } else if (aiVar.isSelf()) {
                                                                return b.SHARE_COMPILATION_MULTI_SEND;
                                                            } else {
                                                                return b.SHARE_COMPILATION_MULTI_RECEIVE;
                                                            }
                                                        } else if (msgType != 72) {
                                                            switch (msgType) {
                                                                case 1004:
                                                                    if (aiVar.isSelf()) {
                                                                        return b.GROUP_ANNOUNCEMENT_SEND;
                                                                    }
                                                                    return b.GROUP_ANNOUNCEMENT_RECEIVE;
                                                                case 1005:
                                                                    return b.PUSH_NOTIFICATION_GUIDE;
                                                                case 1006:
                                                                    break;
                                                                default:
                                                                    switch (msgType) {
                                                                        case 1030:
                                                                            return b.GROUP_GREETING_MSG;
                                                                        case 1031:
                                                                            return b.GROUP_SYSTEM_MSG;
                                                                        case 1032:
                                                                            return b.CARD;
                                                                        case 1033:
                                                                            if (aiVar.isSelf()) {
                                                                                return b.GROUP_INVITE_SEND;
                                                                            }
                                                                            return b.GROUP_INVITE_RECEIVE;
                                                                        case 1034:
                                                                            if (aiVar.isSelf()) {
                                                                                return b.SHARE_LIVE_EVENT_SEND;
                                                                            }
                                                                            return b.SHARE_LIVE_EVENT_RECEIVE;
                                                                        default:
                                                                            if (aiVar.isSelf()) {
                                                                                return b.DEFAULT_SEND;
                                                                            }
                                                                            return b.DEFAULT_RECEIVE;
                                                                    }
                                                            }
                                                        } else {
                                                            ShareStickerContent shareStickerContent = (ShareStickerContent) a(aiVar, b.SHARE_STICKER_SIMPLE_SEND);
                                                            if (!(shareStickerContent == null || (awemeCoverList5 = shareStickerContent.getAwemeCoverList()) == null)) {
                                                                num = Integer.valueOf(awemeCoverList5.size());
                                                            }
                                                            if (a(num)) {
                                                                if (aiVar.isSelf()) {
                                                                    return b.SHARE_STICKER_SIMPLE_SEND;
                                                                }
                                                                return b.SHARE_STICKER_SIMPLE_RECEIVE;
                                                            } else if (aiVar.isSelf()) {
                                                                return b.SHARE_STICKER_MULTI_SEND;
                                                            } else {
                                                                return b.SHARE_STICKER_MULTI_RECEIVE;
                                                            }
                                                        }
                                                    } else if (aiVar.isSelf()) {
                                                        return b.SHARE_WEB_SEND;
                                                    } else {
                                                        return b.SHARE_WEB_RECEIVE;
                                                    }
                                                } else if (aiVar.isSelf()) {
                                                    return b.SHARE_LIVE_SEND;
                                                } else {
                                                    return b.SHARE_LIVE_RECEIVE;
                                                }
                                            } else if (aiVar.isSelf()) {
                                                return b.SHARE_AWEME_SEND;
                                            } else {
                                                return b.SHARE_AWEME_RECEIVE;
                                            }
                                        } else if (aiVar.isSelf()) {
                                            return b.SHARE_SEARCH_SEND;
                                        } else {
                                            return b.SHARE_SEARCH_RECEIVE;
                                        }
                                    } else if (aiVar.isSelf()) {
                                        return b.SHARE_STORY_SEND;
                                    } else {
                                        return b.SHARE_STORY_RECEIVE;
                                    }
                                } else if (aiVar.isSelf()) {
                                    return b.SHARE_LIVE_SEND;
                                } else {
                                    return b.SHARE_LIVE_RECEIVE;
                                }
                            } else if (aiVar.isSelf()) {
                                return b.COMMENT_SEND;
                            } else {
                                return b.COMMENT_RECEIVE;
                            }
                        } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.d.a()) {
                            ShareQnAContent shareQnAContent = (ShareQnAContent) a(aiVar, b.SHARE_QNA_MULTI_RECEIVE);
                            if (!(shareQnAContent == null || (awemeCoverList = shareQnAContent.getAwemeCoverList()) == null)) {
                                num = Integer.valueOf(awemeCoverList.size());
                            }
                            if (a(num)) {
                                if (aiVar.isSelf()) {
                                    return b.SHARE_QNA_SIMPLE_SEND;
                                }
                                return b.SHARE_QNA_SIMPLE_RECEIVE;
                            } else if (aiVar.isSelf()) {
                                return b.SHARE_QNA_MULTI_SEND;
                            } else {
                                return b.SHARE_QNA_MULTI_RECEIVE;
                            }
                        } else if (aiVar.isSelf()) {
                            return b.DEFAULT_SEND;
                        } else {
                            return b.DEFAULT_RECEIVE;
                        }
                    } else if (aiVar.isSelf()) {
                        return b.BIG_EMOJI_SEND;
                    } else {
                        return b.BIG_EMOJI_RECEIVE;
                    }
                }
                return b.SYSTEM_RECEIVE;
            } else if (aiVar.isSelf()) {
                return b.DEFAULT_SEND;
            } else {
                return b.DEFAULT_RECEIVE;
            }
        }

        public static <T extends BaseContent> T a(com.bytedance.im.core.d.ai aiVar, b bVar) {
            h.f.b.l.d(aiVar, "");
            h.f.b.l.d(bVar, "");
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.c.a()) {
                Object localCache = aiVar.getLocalCache(1);
                if (!(localCache instanceof BaseContent)) {
                    localCache = null;
                }
                T t = (T) ((BaseContent) localCache);
                if (t != null) {
                    return t;
                }
            }
            T t2 = (T) bVar.parse(aiVar);
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.c.a()) {
                aiVar.putLocalCache(1, t2);
            }
            if (!(t2 instanceof BaseContent)) {
                return null;
            }
            return t2;
        }

        public final BaseContent a(int i2, String str, boolean z, long j2) {
            if (str == null || str.length() == 0) {
                com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", "Content of stranger message is empty");
                return new TextContent(null, false, 3, null);
            }
            com.bytedance.im.core.d.ai aiVar = new com.bytedance.im.core.d.ai();
            Map<String, String> ext = aiVar.getExt();
            h.f.b.l.b(ext, "");
            ext.put("s:is_recalled", String.valueOf(z));
            aiVar.setContent(str);
            aiVar.setMsgType(i2);
            aiVar.setSender(j2);
            return b(aiVar);
        }
    }

    static final class g extends b {
        private final int itemLayoutId = b.TEXT_RECEIVE.getItemLayoutId();
        private final Class<? extends BaseContent> messageContentClazz = b.TEXT_RECEIVE.getMessageContentClazz();

        static {
            Covode.recordClassIndex(63997);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final String getMsgHint(BaseContent baseContent) {
            h.f.b.l.d(baseContent, "");
            return f.a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(String str) {
            super(str, 12, null);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final BaseContent parse(com.bytedance.im.core.d.ai aiVar) {
            h.f.b.l.d(aiVar, "");
            return new TextContent(f.a(false), true);
        }
    }

    static final class h extends b {
        private final int itemLayoutId = b.TEXT_SEND.getItemLayoutId();
        private final Class<? extends BaseContent> messageContentClazz = b.TEXT_SEND.getMessageContentClazz();

        static {
            Covode.recordClassIndex(63998);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<? extends BaseContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final String getMsgHint(BaseContent baseContent) {
            h.f.b.l.d(baseContent, "");
            return f.a(true);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final BaseContent parse(com.bytedance.im.core.d.ai aiVar) {
            h.f.b.l.d(aiVar, "");
            return new TextContent(f.a(true), true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(String str) {
            super(str, 13, null);
        }
    }

    static final class i extends b {
        private final int itemLayoutId = R.layout.a5k;
        private final Class<GroupAnnouncementContent> messageContentClazz = GroupAnnouncementContent.class;

        static {
            Covode.recordClassIndex(63999);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupAnnouncementContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(String str) {
            super(str, 44, null);
        }
    }

    static final class j extends b {
        private final int itemLayoutId = R.layout.a5l;
        private final Class<GroupAnnouncementContent> messageContentClazz = GroupAnnouncementContent.class;

        static {
            Covode.recordClassIndex(64000);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupAnnouncementContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(String str) {
            super(str, 45, null);
        }
    }

    static final class k extends b {
        private final int itemLayoutId = R.layout.a5n;
        private final Class<GroupGreetingContent> messageContentClazz = GroupGreetingContent.class;

        static {
            Covode.recordClassIndex(64001);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupGreetingContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(String str) {
            super(str, 53, null);
        }
    }

    static final class l extends b {
        private final int itemLayoutId = R.layout.a5o;
        private final Class<GroupInviteCardContent> messageContentClazz = GroupInviteCardContent.class;

        static {
            Covode.recordClassIndex(64002);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupInviteCardContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(String str) {
            super(str, 60, null);
        }
    }

    static final class m extends b {
        private final int itemLayoutId = R.layout.a5p;
        private final Class<GroupInviteCardContent> messageContentClazz = GroupInviteCardContent.class;

        static {
            Covode.recordClassIndex(64003);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupInviteCardContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(String str) {
            super(str, 59, null);
        }
    }

    static final class n extends b {
        private final int itemLayoutId = R.layout.a6_;
        private final Class<GroupSystemContent> messageContentClazz = GroupSystemContent.class;

        static {
            Covode.recordClassIndex(64004);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<GroupSystemContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(String str) {
            super(str, 54, null);
        }
    }

    static final class o extends b {
        private final int itemLayoutId = R.layout.a5c;

        static {
            Covode.recordClassIndex(64005);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final String getMsgHint(BaseContent baseContent) {
            h.f.b.l.d(baseContent, "");
            return "";
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(String str) {
            super(str, 11, null);
        }
    }

    static final class p extends b {
        private final int itemLayoutId = R.layout.a6e;
        private final Class<SystemContent> messageContentClazz = SystemContent.class;

        static {
            Covode.recordClassIndex(64006);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<SystemContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(String str) {
            super(str, 47, null);
        }
    }

    static final class q extends b {
        private final int itemLayoutId = R.layout.a5q;
        private final Class<TextContent> messageContentClazz = TextContent.class;

        static {
            Covode.recordClassIndex(64007);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<TextContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(String str) {
            super(str, 46, null);
        }
    }

    static final class r extends b {
        private final int itemLayoutId = R.layout.a5r;
        private final Class<SayHelloContent> messageContentClazz = SayHelloContent.class;

        static {
            Covode.recordClassIndex(64008);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<SayHelloContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(String str) {
            super(str, 15, null);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final BaseContent parse(com.bytedance.im.core.d.ai aiVar) {
            h.f.b.l.d(aiVar, "");
            BaseContent parse = b.super.parse(aiVar);
            if (!(parse instanceof SayHelloContent)) {
                parse = null;
            }
            SayHelloContent sayHelloContent = (SayHelloContent) parse;
            if (sayHelloContent == null) {
                return null;
            }
            String string = com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.cho);
            h.f.b.l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{sayHelloContent.nickname}, 1));
            h.f.b.l.b(a2, "");
            sayHelloContent.setMsgHint(a2);
            sayHelloContent.optimise();
            return sayHelloContent;
        }
    }

    static final class s extends b {
        private final int itemLayoutId = R.layout.a67;
        private final Class<ShareAwemeContent> messageContentClazz = ShareAwemeContent.class;

        static {
            Covode.recordClassIndex(64009);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareAwemeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(String str) {
            super(str, 3, null);
        }
    }

    static final class t extends b {
        private final int itemLayoutId = R.layout.a68;
        private final Class<ShareAwemeContent> messageContentClazz = ShareAwemeContent.class;

        static {
            Covode.recordClassIndex(64010);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareAwemeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(String str) {
            super(str, 4, null);
        }
    }

    static final class u extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareChallengeContent> messageContentClazz = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(64011);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(String str) {
            super(str, 25, null);
        }
    }

    static final class v extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareChallengeContent> messageContentClazz = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(64012);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(String str) {
            super(str, 24, null);
        }
    }

    static final class w extends b {
        private final int itemLayoutId = R.layout.a65;
        private final Class<ShareChallengeContent> messageContentClazz = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(64013);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(String str) {
            super(str, 27, null);
        }
    }

    static final class x extends b {
        private final int itemLayoutId = R.layout.a66;
        private final Class<ShareChallengeContent> messageContentClazz = ShareChallengeContent.class;

        static {
            Covode.recordClassIndex(64014);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareChallengeContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        x(String str) {
            super(str, 26, null);
        }
    }

    static final class y extends b {
        private final int itemLayoutId = R.layout.a61;
        private final Class<ShareCompilationContent> messageContentClazz = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(64015);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(String str) {
            super(str, 36, null);
        }
    }

    static final class z extends b {
        private final int itemLayoutId = R.layout.a62;
        private final Class<ShareCompilationContent> messageContentClazz = ShareCompilationContent.class;

        static {
            Covode.recordClassIndex(64016);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.e.b
        public final Class<ShareCompilationContent> getMessageContentClazz() {
            return this.messageContentClazz;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        z(String str) {
            super(str, 37, null);
        }
    }

    public int getItemLayoutId() {
        return this.itemLayoutId;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return this.messageContentClazz;
    }

    public final int getViewType() {
        return this.viewType;
    }

    static {
        Covode.recordClassIndex(63956);
        bc bcVar = new bc("SYSTEM_RECEIVE");
        SYSTEM_RECEIVE = bcVar;
        bf bfVar = new bf("TEXT_RECEIVE");
        TEXT_RECEIVE = bfVar;
        bg bgVar = new bg("TEXT_SEND");
        TEXT_SEND = bgVar;
        s sVar = new s("SHARE_AWEME_RECEIVE");
        SHARE_AWEME_RECEIVE = sVar;
        t tVar = new t("SHARE_AWEME_SEND");
        SHARE_AWEME_SEND = tVar;
        au auVar = new au("SHARE_STORY_RECEIVE");
        SHARE_STORY_RECEIVE = auVar;
        av avVar = new av("SHARE_STORY_SEND");
        SHARE_STORY_SEND = avVar;
        a aVar = new a("BIG_EMOJI_RECEIVE");
        BIG_EMOJI_RECEIVE = aVar;
        C2465b bVar = new C2465b("BIG_EMOJI_SEND");
        BIG_EMOJI_SEND = bVar;
        d dVar = new d("COMMENT_RECEIVE");
        COMMENT_RECEIVE = dVar;
        e eVar = new e("COMMENT_SEND");
        COMMENT_SEND = eVar;
        o oVar = new o("LOAD_MORE");
        LOAD_MORE = oVar;
        g gVar = new g("DEFAULT_RECEIVE");
        DEFAULT_RECEIVE = gVar;
        h hVar = new h("DEFAULT_SEND");
        DEFAULT_SEND = hVar;
        bh bhVar = new bh("VIDEO_UPDATE_TIPS");
        VIDEO_UPDATE_TIPS = bhVar;
        r rVar = new r("SAY_HELLO");
        SAY_HELLO = rVar;
        ah ahVar = new ah("SHARE_MUSIC_MULTI_SEND");
        SHARE_MUSIC_MULTI_SEND = ahVar;
        ag agVar = new ag("SHARE_MUSIC_MULTI_RECEIVE");
        SHARE_MUSIC_MULTI_RECEIVE = agVar;
        aj ajVar = new aj("SHARE_MUSIC_SIMPLE_SEND");
        SHARE_MUSIC_SIMPLE_SEND = ajVar;
        ai aiVar = new ai("SHARE_MUSIC_SIMPLE_RECEIVE");
        SHARE_MUSIC_SIMPLE_RECEIVE = aiVar;
        ad adVar = new ad("SHARE_LIVE_EVENT_SEND");
        SHARE_LIVE_EVENT_SEND = adVar;
        ac acVar = new ac("SHARE_LIVE_EVENT_RECEIVE");
        SHARE_LIVE_EVENT_RECEIVE = acVar;
        ap apVar = new ap("SHARE_SEARCH_SEND");
        SHARE_SEARCH_SEND = apVar;
        ao aoVar = new ao("SHARE_SEARCH_RECEIVE");
        SHARE_SEARCH_RECEIVE = aoVar;
        v vVar = new v("SHARE_CHALLENGE_MULTI_SEND");
        SHARE_CHALLENGE_MULTI_SEND = vVar;
        u uVar = new u("SHARE_CHALLENGE_MULTI_RECEIVE");
        SHARE_CHALLENGE_MULTI_RECEIVE = uVar;
        x xVar = new x("SHARE_CHALLENGE_SIMPLE_SEND");
        SHARE_CHALLENGE_SIMPLE_SEND = xVar;
        w wVar = new w("SHARE_CHALLENGE_SIMPLE_RECEIVE");
        SHARE_CHALLENGE_SIMPLE_RECEIVE = wVar;
        ax axVar = new ax("SHARE_USER_MULTI_SEND");
        SHARE_USER_MULTI_SEND = axVar;
        aw awVar = new aw("SHARE_USER_MULTI_RECEIVE");
        SHARE_USER_MULTI_RECEIVE = awVar;
        az azVar = new az("SHARE_USER_SIMPLE_SEND");
        SHARE_USER_SIMPLE_SEND = azVar;
        ay ayVar = new ay("SHARE_USER_SIMPLE_RECEIVE");
        SHARE_USER_SIMPLE_RECEIVE = ayVar;
        bb bbVar = new bb("SHARE_WEB_SEND");
        SHARE_WEB_SEND = bbVar;
        ba baVar = new ba("SHARE_WEB_RECEIVE");
        SHARE_WEB_RECEIVE = baVar;
        af afVar = new af("SHARE_LIVE_SEND");
        SHARE_LIVE_SEND = afVar;
        ae aeVar = new ae("SHARE_LIVE_RECEIVE");
        SHARE_LIVE_RECEIVE = aeVar;
        y yVar = new y("SHARE_COMPILATION_MULTI_RECEIVE");
        SHARE_COMPILATION_MULTI_RECEIVE = yVar;
        z zVar = new z("SHARE_COMPILATION_MULTI_SEND");
        SHARE_COMPILATION_MULTI_SEND = zVar;
        aa aaVar = new aa("SHARE_COMPILATION_SIMPLE_RECEIVE");
        SHARE_COMPILATION_SIMPLE_RECEIVE = aaVar;
        ab abVar = new ab("SHARE_COMPILATION_SIMPLE_SEND");
        SHARE_COMPILATION_SIMPLE_SEND = abVar;
        aq aqVar = new aq("SHARE_STICKER_MULTI_RECEIVE");
        SHARE_STICKER_MULTI_RECEIVE = aqVar;
        ar arVar = new ar("SHARE_STICKER_MULTI_SEND");
        SHARE_STICKER_MULTI_SEND = arVar;
        as asVar = new as("SHARE_STICKER_SIMPLE_RECEIVE");
        SHARE_STICKER_SIMPLE_RECEIVE = asVar;
        at atVar = new at("SHARE_STICKER_SIMPLE_SEND");
        SHARE_STICKER_SIMPLE_SEND = atVar;
        i iVar = new i("GROUP_ANNOUNCEMENT_RECEIVE");
        GROUP_ANNOUNCEMENT_RECEIVE = iVar;
        j jVar = new j("GROUP_ANNOUNCEMENT_SEND");
        GROUP_ANNOUNCEMENT_SEND = jVar;
        q qVar = new q("PUSH_NOTIFICATION_GUIDE");
        PUSH_NOTIFICATION_GUIDE = qVar;
        p pVar = new p("NOTICE_DANGER_WARNNING_TOP");
        NOTICE_DANGER_WARNNING_TOP = pVar;
        b bVar2 = new b("SHARE_WEB_FROM_THIRD_SEND", 48);
        SHARE_WEB_FROM_THIRD_SEND = bVar2;
        b bVar3 = new b("SHARE_WEB_FROM_THIRD_RECEIVE", 49);
        SHARE_WEB_FROM_THIRD_RECEIVE = bVar3;
        be beVar = new be("TEXT_BIG_EMOJI_SEND");
        TEXT_BIG_EMOJI_SEND = beVar;
        bd bdVar = new bd("TEXT_BIG_EMOJI_RECEIVE");
        TEXT_BIG_EMOJI_RECEIVE = bdVar;
        c cVar = new c("CARD");
        CARD = cVar;
        k kVar = new k("GROUP_GREETING_MSG");
        GROUP_GREETING_MSG = kVar;
        n nVar = new n("GROUP_SYSTEM_MSG");
        GROUP_SYSTEM_MSG = nVar;
        al alVar = new al("SHARE_QNA_MULTI_SEND");
        SHARE_QNA_MULTI_SEND = alVar;
        ak akVar = new ak("SHARE_QNA_MULTI_RECEIVE");
        SHARE_QNA_MULTI_RECEIVE = akVar;
        an anVar = new an("SHARE_QNA_SIMPLE_SEND");
        SHARE_QNA_SIMPLE_SEND = anVar;
        am amVar = new am("SHARE_QNA_SIMPLE_RECEIVE");
        SHARE_QNA_SIMPLE_RECEIVE = amVar;
        m mVar = new m("GROUP_INVITE_SEND");
        GROUP_INVITE_SEND = mVar;
        l lVar = new l("GROUP_INVITE_RECEIVE");
        GROUP_INVITE_RECEIVE = lVar;
        f100322a = new b[]{bcVar, bfVar, bgVar, sVar, tVar, auVar, avVar, aVar, bVar, dVar, eVar, oVar, gVar, hVar, bhVar, rVar, ahVar, agVar, ajVar, aiVar, adVar, acVar, apVar, aoVar, vVar, uVar, xVar, wVar, axVar, awVar, azVar, ayVar, bbVar, baVar, afVar, aeVar, yVar, zVar, aaVar, abVar, aqVar, arVar, asVar, atVar, iVar, jVar, qVar, pVar, bVar2, bVar3, beVar, bdVar, cVar, kVar, nVar, alVar, akVar, anVar, amVar, mVar, lVar};
        b[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.h.b(h.a.ag.a(values.length), 16));
        for (b bVar4 : values) {
            linkedHashMap.put(Integer.valueOf(bVar4.viewType), bVar4);
        }
        lookupMap = linkedHashMap;
    }

    public String getMsgHint(BaseContent baseContent) {
        h.f.b.l.d(baseContent, "");
        String msgHint = baseContent.getMsgHint();
        if (msgHint == null) {
            return "";
        }
        return msgHint;
    }

    public static final b valueOf(int i2) {
        b bVar = lookupMap.get(Integer.valueOf(i2));
        if (bVar == null) {
            return DEFAULT_RECEIVE;
        }
        return bVar;
    }

    public BaseContent parse(com.bytedance.im.core.d.ai aiVar) {
        BaseContent baseContent;
        h.f.b.l.d(aiVar, "");
        String content = aiVar.getContent();
        try {
            baseContent = (BaseContent) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j.a(content, getMessageContentClazz());
            if (baseContent != null) {
                return baseContent;
            }
            try {
                com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", "MessageViewType parse: itemType:" + this.viewType + " messageStr:" + aiVar);
                com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", "MessageViewType parse: itemType:" + this.viewType + " contentStr:" + content);
                baseContent = (BaseContent) getMessageContentClazz().newInstance();
                return baseContent;
            } catch (IllegalAccessException e2) {
                com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", e2);
                return baseContent;
            } catch (InstantiationException e3) {
                com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", e3);
                return baseContent;
            }
        } catch (Exception e4) {
            com.ss.android.ugc.aweme.im.service.m.a.a("MessageViewType", e4);
            baseContent = null;
        }
    }

    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<?> getViewHolder(View view) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(this, "");
        h.f.b.l.d(view, "");
        switch (com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.a.f101326a[ordinal()]) {
            case 1:
            case 2:
                return new bk(view, this);
            case 3:
            case 4:
                return new bj(view, this);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.s(view);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.v(view, this);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.q(view);
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return new bi(view, this);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new bk(view, this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return new bj(view, this);
            case ABRConfig.ABR_SELECT_SCENE:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.k(view);
            case 15:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.j(view, this);
            case 16:
                return new bl(view, this);
            case 17:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.h(view, this);
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i(view, this);
            case 19:
                return new com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d(view, this);
            case com.ss.android.ugc.playerkit.model.v.U:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.al(view, this);
            case 21:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.am(view, this);
            case 22:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.an(view, this);
            case 23:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ao(view, this);
            case 24:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ap(view, this);
            case 25:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.aq(view, this);
            case 26:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ar(view, this);
            case 27:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.as(view, this);
            case 28:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ae(view, this);
            case 29:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.af(view, this);
            case 30:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.z(view, this);
            case 31:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.w(view, this);
            case 32:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.y(view, this);
            case 33:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.x(view, this);
            case 34:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ba(view, this);
            case 35:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bb(view, this);
            case 36:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bc(view, this);
            case 37:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bd(view, this);
            case 38:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.be(view, this);
            case 39:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bf(view, this);
            case 40:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.at(view, this);
            case 41:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.au(view, this);
            case 42:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ag(view);
            case 43:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.aj(view, this);
            case BuildConfig.VERSION_CODE:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ad(view, this);
            case 45:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.aa(view, this);
            case 46:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ac(view, this);
            case 47:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ab(view, this);
            case 48:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.az(view, this);
            case 49:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.aw(view, this);
            case 50:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ay(view, this);
            case 51:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ax(view, this);
            case 52:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.m(view, this);
            case 53:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.l(view, this);
            case 54:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.r(view, this);
            case 55:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bh(view, this);
            case 56:
                return new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.d(view, this);
            case 57:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.o(view, this);
            case 58:
                return new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.n(view, this);
            default:
                return new bk(view, this);
        }
    }

    private b(String str, int i2) {
        this.viewType = ordinal();
        this.itemLayoutId = R.layout.a6c;
        this.messageContentClazz = TextContent.class;
    }

    public /* synthetic */ b(String str, int i2, h.f.b.g gVar) {
        this(str, i2);
    }
}
