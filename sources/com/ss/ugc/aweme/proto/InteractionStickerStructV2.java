package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class InteractionStickerStructV2 extends Message<InteractionStickerStructV2, Builder> {
    public static final ProtoAdapter<InteractionStickerStructV2> ADAPTER = new ProtoAdapter_InteractionStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String attr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AutoVideoCaptionStructV2#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public AutoVideoCaptionStructV2 auto_video_caption_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LiveCountdownStickerStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public LiveCountdownStickerStructV2 countdown_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DuetWithMeStickerStructV2#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public DuetWithMeStickerStructV2 duet_with_me;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HashTagStickerStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public HashTagStickerStructV2 hashtag_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer index;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MentionStickerStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public MentionStickerStructV2 mention_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.QuestionStickerStructV2#ADAPTER", tag = ABRConfig.ABR_SELECT_SCENE)
    public QuestionStickerStructV2 question_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String text_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String track_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VoteStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public VoteStructV2 vote_info;

    public InteractionStickerStructV2() {
    }

    static final class ProtoAdapter_InteractionStickerStructV2 extends ProtoAdapter<InteractionStickerStructV2> {
        static {
            Covode.recordClassIndex(102055);
        }

        public ProtoAdapter_InteractionStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, InteractionStickerStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InteractionStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.index(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 4:
                            builder.track_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.attr(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.vote_info(VoteStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.text_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.mention_info(MentionStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.hashtag_info(HashTagStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.countdown_info(LiveCountdownStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.auto_video_caption_info(AutoVideoCaptionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.duet_with_me(DuetWithMeStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.question_info(QuestionStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(InteractionStickerStructV2 interactionStickerStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, interactionStickerStructV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(2, interactionStickerStructV2.index) + ProtoAdapter.STRING.encodedSizeWithTag(4, interactionStickerStructV2.track_info) + ProtoAdapter.STRING.encodedSizeWithTag(5, interactionStickerStructV2.attr) + VoteStructV2.ADAPTER.encodedSizeWithTag(6, interactionStickerStructV2.vote_info) + ProtoAdapter.STRING.encodedSizeWithTag(7, interactionStickerStructV2.text_info) + MentionStickerStructV2.ADAPTER.encodedSizeWithTag(8, interactionStickerStructV2.mention_info) + HashTagStickerStructV2.ADAPTER.encodedSizeWithTag(9, interactionStickerStructV2.hashtag_info) + LiveCountdownStickerStructV2.ADAPTER.encodedSizeWithTag(10, interactionStickerStructV2.countdown_info) + AutoVideoCaptionStructV2.ADAPTER.encodedSizeWithTag(11, interactionStickerStructV2.auto_video_caption_info) + DuetWithMeStickerStructV2.ADAPTER.encodedSizeWithTag(12, interactionStickerStructV2.duet_with_me) + QuestionStickerStructV2.ADAPTER.encodedSizeWithTag(14, interactionStickerStructV2.question_info) + interactionStickerStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, InteractionStickerStructV2 interactionStickerStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, interactionStickerStructV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, interactionStickerStructV2.index);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, interactionStickerStructV2.track_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, interactionStickerStructV2.attr);
            VoteStructV2.ADAPTER.encodeWithTag(protoWriter, 6, interactionStickerStructV2.vote_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, interactionStickerStructV2.text_info);
            MentionStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 8, interactionStickerStructV2.mention_info);
            HashTagStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 9, interactionStickerStructV2.hashtag_info);
            LiveCountdownStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 10, interactionStickerStructV2.countdown_info);
            AutoVideoCaptionStructV2.ADAPTER.encodeWithTag(protoWriter, 11, interactionStickerStructV2.auto_video_caption_info);
            DuetWithMeStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 12, interactionStickerStructV2.duet_with_me);
            QuestionStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 14, interactionStickerStructV2.question_info);
            protoWriter.writeBytes(interactionStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102053);
    }

    public static final class Builder extends Message.Builder<InteractionStickerStructV2, Builder> {
        public String attr;
        public AutoVideoCaptionStructV2 auto_video_caption_info;
        public LiveCountdownStickerStructV2 countdown_info;
        public DuetWithMeStickerStructV2 duet_with_me;
        public HashTagStickerStructV2 hashtag_info;
        public Integer index;
        public MentionStickerStructV2 mention_info;
        public QuestionStickerStructV2 question_info;
        public String text_info;
        public String track_info;
        public Integer type;
        public VoteStructV2 vote_info;

        static {
            Covode.recordClassIndex(102054);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InteractionStickerStructV2 build() {
            return new InteractionStickerStructV2(this.type, this.index, this.track_info, this.attr, this.vote_info, this.text_info, this.mention_info, this.hashtag_info, this.countdown_info, this.auto_video_caption_info, this.duet_with_me, this.question_info, super.buildUnknownFields());
        }

        public final Builder attr(String str) {
            this.attr = str;
            return this;
        }

        public final Builder auto_video_caption_info(AutoVideoCaptionStructV2 autoVideoCaptionStructV2) {
            this.auto_video_caption_info = autoVideoCaptionStructV2;
            return this;
        }

        public final Builder countdown_info(LiveCountdownStickerStructV2 liveCountdownStickerStructV2) {
            this.countdown_info = liveCountdownStickerStructV2;
            return this;
        }

        public final Builder duet_with_me(DuetWithMeStickerStructV2 duetWithMeStickerStructV2) {
            this.duet_with_me = duetWithMeStickerStructV2;
            return this;
        }

        public final Builder hashtag_info(HashTagStickerStructV2 hashTagStickerStructV2) {
            this.hashtag_info = hashTagStickerStructV2;
            return this;
        }

        public final Builder index(Integer num) {
            this.index = num;
            return this;
        }

        public final Builder mention_info(MentionStickerStructV2 mentionStickerStructV2) {
            this.mention_info = mentionStickerStructV2;
            return this;
        }

        public final Builder question_info(QuestionStickerStructV2 questionStickerStructV2) {
            this.question_info = questionStickerStructV2;
            return this;
        }

        public final Builder text_info(String str) {
            this.text_info = str;
            return this;
        }

        public final Builder track_info(String str) {
            this.track_info = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder vote_info(VoteStructV2 voteStructV2) {
            this.vote_info = voteStructV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.InteractionStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InteractionStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.index = this.index;
        builder.track_info = this.track_info;
        builder.attr = this.attr;
        builder.vote_info = this.vote_info;
        builder.text_info = this.text_info;
        builder.mention_info = this.mention_info;
        builder.hashtag_info = this.hashtag_info;
        builder.countdown_info = this.countdown_info;
        builder.auto_video_caption_info = this.auto_video_caption_info;
        builder.duet_with_me = this.duet_with_me;
        builder.question_info = this.question_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.type;
        int i14 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (hashCode + i2) * 37;
        Integer num2 = this.index;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 37;
        String str = this.track_info;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 37;
        String str2 = this.attr;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 37;
        VoteStructV2 voteStructV2 = this.vote_info;
        if (voteStructV2 != null) {
            i6 = voteStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        String str3 = this.text_info;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        MentionStickerStructV2 mentionStickerStructV2 = this.mention_info;
        if (mentionStickerStructV2 != null) {
            i8 = mentionStickerStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        HashTagStickerStructV2 hashTagStickerStructV2 = this.hashtag_info;
        if (hashTagStickerStructV2 != null) {
            i9 = hashTagStickerStructV2.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 37;
        LiveCountdownStickerStructV2 liveCountdownStickerStructV2 = this.countdown_info;
        if (liveCountdownStickerStructV2 != null) {
            i10 = liveCountdownStickerStructV2.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        AutoVideoCaptionStructV2 autoVideoCaptionStructV2 = this.auto_video_caption_info;
        if (autoVideoCaptionStructV2 != null) {
            i11 = autoVideoCaptionStructV2.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 37;
        DuetWithMeStickerStructV2 duetWithMeStickerStructV2 = this.duet_with_me;
        if (duetWithMeStickerStructV2 != null) {
            i12 = duetWithMeStickerStructV2.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 37;
        QuestionStickerStructV2 questionStickerStructV2 = this.question_info;
        if (questionStickerStructV2 != null) {
            i14 = questionStickerStructV2.hashCode();
        }
        int i26 = i25 + i14;
        this.hashCode = i26;
        return i26;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.index != null) {
            sb.append(", index=").append(this.index);
        }
        if (this.track_info != null) {
            sb.append(", track_info=").append(this.track_info);
        }
        if (this.attr != null) {
            sb.append(", attr=").append(this.attr);
        }
        if (this.vote_info != null) {
            sb.append(", vote_info=").append(this.vote_info);
        }
        if (this.text_info != null) {
            sb.append(", text_info=").append(this.text_info);
        }
        if (this.mention_info != null) {
            sb.append(", mention_info=").append(this.mention_info);
        }
        if (this.hashtag_info != null) {
            sb.append(", hashtag_info=").append(this.hashtag_info);
        }
        if (this.countdown_info != null) {
            sb.append(", countdown_info=").append(this.countdown_info);
        }
        if (this.auto_video_caption_info != null) {
            sb.append(", auto_video_caption_info=").append(this.auto_video_caption_info);
        }
        if (this.duet_with_me != null) {
            sb.append(", duet_with_me=").append(this.duet_with_me);
        }
        if (this.question_info != null) {
            sb.append(", question_info=").append(this.question_info);
        }
        return sb.replace(0, 2, "InteractionStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractionStickerStructV2)) {
            return false;
        }
        InteractionStickerStructV2 interactionStickerStructV2 = (InteractionStickerStructV2) obj;
        if (!unknownFields().equals(interactionStickerStructV2.unknownFields()) || !Internal.equals(this.type, interactionStickerStructV2.type) || !Internal.equals(this.index, interactionStickerStructV2.index) || !Internal.equals(this.track_info, interactionStickerStructV2.track_info) || !Internal.equals(this.attr, interactionStickerStructV2.attr) || !Internal.equals(this.vote_info, interactionStickerStructV2.vote_info) || !Internal.equals(this.text_info, interactionStickerStructV2.text_info) || !Internal.equals(this.mention_info, interactionStickerStructV2.mention_info) || !Internal.equals(this.hashtag_info, interactionStickerStructV2.hashtag_info) || !Internal.equals(this.countdown_info, interactionStickerStructV2.countdown_info) || !Internal.equals(this.auto_video_caption_info, interactionStickerStructV2.auto_video_caption_info) || !Internal.equals(this.duet_with_me, interactionStickerStructV2.duet_with_me) || !Internal.equals(this.question_info, interactionStickerStructV2.question_info)) {
            return false;
        }
        return true;
    }

    public InteractionStickerStructV2(Integer num, Integer num2, String str, String str2, VoteStructV2 voteStructV2, String str3, MentionStickerStructV2 mentionStickerStructV2, HashTagStickerStructV2 hashTagStickerStructV2, LiveCountdownStickerStructV2 liveCountdownStickerStructV2, AutoVideoCaptionStructV2 autoVideoCaptionStructV2, DuetWithMeStickerStructV2 duetWithMeStickerStructV2, QuestionStickerStructV2 questionStickerStructV2) {
        this(num, num2, str, str2, voteStructV2, str3, mentionStickerStructV2, hashTagStickerStructV2, liveCountdownStickerStructV2, autoVideoCaptionStructV2, duetWithMeStickerStructV2, questionStickerStructV2, i.EMPTY);
    }

    public InteractionStickerStructV2(Integer num, Integer num2, String str, String str2, VoteStructV2 voteStructV2, String str3, MentionStickerStructV2 mentionStickerStructV2, HashTagStickerStructV2 hashTagStickerStructV2, LiveCountdownStickerStructV2 liveCountdownStickerStructV2, AutoVideoCaptionStructV2 autoVideoCaptionStructV2, DuetWithMeStickerStructV2 duetWithMeStickerStructV2, QuestionStickerStructV2 questionStickerStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.type = num;
        this.index = num2;
        this.track_info = str;
        this.attr = str2;
        this.vote_info = voteStructV2;
        this.text_info = str3;
        this.mention_info = mentionStickerStructV2;
        this.hashtag_info = hashTagStickerStructV2;
        this.countdown_info = liveCountdownStickerStructV2;
        this.auto_video_caption_info = autoVideoCaptionStructV2;
        this.duet_with_me = duetWithMeStickerStructV2;
        this.question_info = questionStickerStructV2;
    }
}
