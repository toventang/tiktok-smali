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

public final class VideoControlV2 extends Message<VideoControlV2, Builder> {
    public static final ProtoAdapter<VideoControlV2> ADAPTER = new ProtoAdapter_VideoControlV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean allow_download;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Boolean allow_duet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Boolean allow_dynamic_wallpaper;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Boolean allow_music;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean allow_react;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Boolean allow_stitch;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer draft_progress_bar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer prevent_download_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer share_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer show_progress_bar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer timer_status;

    public VideoControlV2() {
    }

    static final class ProtoAdapter_VideoControlV2 extends ProtoAdapter<VideoControlV2> {
        static {
            Covode.recordClassIndex(102268);
        }

        public ProtoAdapter_VideoControlV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoControlV2.class);
        }

        public final int encodedSize(VideoControlV2 videoControlV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, videoControlV2.allow_download) + ProtoAdapter.INT32.encodedSizeWithTag(2, videoControlV2.share_type) + ProtoAdapter.INT32.encodedSizeWithTag(3, videoControlV2.show_progress_bar) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoControlV2.draft_progress_bar) + ProtoAdapter.BOOL.encodedSizeWithTag(5, videoControlV2.allow_duet) + ProtoAdapter.BOOL.encodedSizeWithTag(6, videoControlV2.allow_react) + ProtoAdapter.INT32.encodedSizeWithTag(7, videoControlV2.prevent_download_type) + ProtoAdapter.BOOL.encodedSizeWithTag(8, videoControlV2.allow_dynamic_wallpaper) + ProtoAdapter.INT32.encodedSizeWithTag(9, videoControlV2.timer_status) + ProtoAdapter.BOOL.encodedSizeWithTag(10, videoControlV2.allow_music) + ProtoAdapter.BOOL.encodedSizeWithTag(11, videoControlV2.allow_stitch) + videoControlV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoControlV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.allow_download(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.share_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.show_progress_bar(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.draft_progress_bar(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.allow_duet(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.allow_react(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.prevent_download_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.allow_dynamic_wallpaper(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.timer_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.allow_music(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.allow_stitch(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoControlV2 videoControlV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, videoControlV2.allow_download);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, videoControlV2.share_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, videoControlV2.show_progress_bar);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoControlV2.draft_progress_bar);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, videoControlV2.allow_duet);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, videoControlV2.allow_react);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, videoControlV2.prevent_download_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoControlV2.allow_dynamic_wallpaper);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, videoControlV2.timer_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, videoControlV2.allow_music);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, videoControlV2.allow_stitch);
            protoWriter.writeBytes(videoControlV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102266);
    }

    public static final class Builder extends Message.Builder<VideoControlV2, Builder> {
        public Boolean allow_download;
        public Boolean allow_duet;
        public Boolean allow_dynamic_wallpaper;
        public Boolean allow_music;
        public Boolean allow_react;
        public Boolean allow_stitch;
        public Integer draft_progress_bar;
        public Integer prevent_download_type;
        public Integer share_type;
        public Integer show_progress_bar;
        public Integer timer_status;

        static {
            Covode.recordClassIndex(102267);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoControlV2 build() {
            return new VideoControlV2(this.allow_download, this.share_type, this.show_progress_bar, this.draft_progress_bar, this.allow_duet, this.allow_react, this.prevent_download_type, this.allow_dynamic_wallpaper, this.timer_status, this.allow_music, this.allow_stitch, super.buildUnknownFields());
        }

        public final Builder allow_download(Boolean bool) {
            this.allow_download = bool;
            return this;
        }

        public final Builder allow_duet(Boolean bool) {
            this.allow_duet = bool;
            return this;
        }

        public final Builder allow_dynamic_wallpaper(Boolean bool) {
            this.allow_dynamic_wallpaper = bool;
            return this;
        }

        public final Builder allow_music(Boolean bool) {
            this.allow_music = bool;
            return this;
        }

        public final Builder allow_react(Boolean bool) {
            this.allow_react = bool;
            return this;
        }

        public final Builder allow_stitch(Boolean bool) {
            this.allow_stitch = bool;
            return this;
        }

        public final Builder draft_progress_bar(Integer num) {
            this.draft_progress_bar = num;
            return this;
        }

        public final Builder prevent_download_type(Integer num) {
            this.prevent_download_type = num;
            return this;
        }

        public final Builder share_type(Integer num) {
            this.share_type = num;
            return this;
        }

        public final Builder show_progress_bar(Integer num) {
            this.show_progress_bar = num;
            return this;
        }

        public final Builder timer_status(Integer num) {
            this.timer_status = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoControlV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoControlV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.allow_download = this.allow_download;
        builder.share_type = this.share_type;
        builder.show_progress_bar = this.show_progress_bar;
        builder.draft_progress_bar = this.draft_progress_bar;
        builder.allow_duet = this.allow_duet;
        builder.allow_react = this.allow_react;
        builder.prevent_download_type = this.prevent_download_type;
        builder.allow_dynamic_wallpaper = this.allow_dynamic_wallpaper;
        builder.timer_status = this.timer_status;
        builder.allow_music = this.allow_music;
        builder.allow_stitch = this.allow_stitch;
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
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.allow_download;
        int i13 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 37;
        Integer num = this.share_type;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        Integer num2 = this.show_progress_bar;
        if (num2 != null) {
            i4 = num2.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        Integer num3 = this.draft_progress_bar;
        if (num3 != null) {
            i5 = num3.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        Boolean bool2 = this.allow_duet;
        if (bool2 != null) {
            i6 = bool2.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        Boolean bool3 = this.allow_react;
        if (bool3 != null) {
            i7 = bool3.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        Integer num4 = this.prevent_download_type;
        if (num4 != null) {
            i8 = num4.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        Boolean bool4 = this.allow_dynamic_wallpaper;
        if (bool4 != null) {
            i9 = bool4.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        Integer num5 = this.timer_status;
        if (num5 != null) {
            i10 = num5.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        Boolean bool5 = this.allow_music;
        if (bool5 != null) {
            i11 = bool5.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        Boolean bool6 = this.allow_stitch;
        if (bool6 != null) {
            i13 = bool6.hashCode();
        }
        int i24 = i23 + i13;
        this.hashCode = i24;
        return i24;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.allow_download != null) {
            sb.append(", allow_download=").append(this.allow_download);
        }
        if (this.share_type != null) {
            sb.append(", share_type=").append(this.share_type);
        }
        if (this.show_progress_bar != null) {
            sb.append(", show_progress_bar=").append(this.show_progress_bar);
        }
        if (this.draft_progress_bar != null) {
            sb.append(", draft_progress_bar=").append(this.draft_progress_bar);
        }
        if (this.allow_duet != null) {
            sb.append(", allow_duet=").append(this.allow_duet);
        }
        if (this.allow_react != null) {
            sb.append(", allow_react=").append(this.allow_react);
        }
        if (this.prevent_download_type != null) {
            sb.append(", prevent_download_type=").append(this.prevent_download_type);
        }
        if (this.allow_dynamic_wallpaper != null) {
            sb.append(", allow_dynamic_wallpaper=").append(this.allow_dynamic_wallpaper);
        }
        if (this.timer_status != null) {
            sb.append(", timer_status=").append(this.timer_status);
        }
        if (this.allow_music != null) {
            sb.append(", allow_music=").append(this.allow_music);
        }
        if (this.allow_stitch != null) {
            sb.append(", allow_stitch=").append(this.allow_stitch);
        }
        return sb.replace(0, 2, "VideoControlV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoControlV2)) {
            return false;
        }
        VideoControlV2 videoControlV2 = (VideoControlV2) obj;
        if (!unknownFields().equals(videoControlV2.unknownFields()) || !Internal.equals(this.allow_download, videoControlV2.allow_download) || !Internal.equals(this.share_type, videoControlV2.share_type) || !Internal.equals(this.show_progress_bar, videoControlV2.show_progress_bar) || !Internal.equals(this.draft_progress_bar, videoControlV2.draft_progress_bar) || !Internal.equals(this.allow_duet, videoControlV2.allow_duet) || !Internal.equals(this.allow_react, videoControlV2.allow_react) || !Internal.equals(this.prevent_download_type, videoControlV2.prevent_download_type) || !Internal.equals(this.allow_dynamic_wallpaper, videoControlV2.allow_dynamic_wallpaper) || !Internal.equals(this.timer_status, videoControlV2.timer_status) || !Internal.equals(this.allow_music, videoControlV2.allow_music) || !Internal.equals(this.allow_stitch, videoControlV2.allow_stitch)) {
            return false;
        }
        return true;
    }

    public VideoControlV2(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Integer num4, Boolean bool4, Integer num5, Boolean bool5, Boolean bool6) {
        this(bool, num, num2, num3, bool2, bool3, num4, bool4, num5, bool5, bool6, i.EMPTY);
    }

    public VideoControlV2(Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Integer num4, Boolean bool4, Integer num5, Boolean bool5, Boolean bool6, i iVar) {
        super(ADAPTER, iVar);
        this.allow_download = bool;
        this.share_type = num;
        this.show_progress_bar = num2;
        this.draft_progress_bar = num3;
        this.allow_duet = bool2;
        this.allow_react = bool3;
        this.prevent_download_type = num4;
        this.allow_dynamic_wallpaper = bool4;
        this.timer_status = num5;
        this.allow_music = bool5;
        this.allow_stitch = bool6;
    }
}
