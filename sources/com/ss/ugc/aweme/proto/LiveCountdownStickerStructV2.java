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

public final class LiveCountdownStickerStructV2 extends Message<LiveCountdownStickerStructV2, Builder> {
    public static final ProtoAdapter<LiveCountdownStickerStructV2> ADAPTER = new ProtoAdapter_LiveCountdownStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean is_subscribed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long subscribe_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String text_already_ended;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String text_already_subscribed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String text_to_be_subscribed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;

    public LiveCountdownStickerStructV2() {
    }

    static final class ProtoAdapter_LiveCountdownStickerStructV2 extends ProtoAdapter<LiveCountdownStickerStructV2> {
        static {
            Covode.recordClassIndex(102076);
        }

        public ProtoAdapter_LiveCountdownStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveCountdownStickerStructV2.class);
        }

        public final int encodedSize(LiveCountdownStickerStructV2 liveCountdownStickerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, liveCountdownStickerStructV2.title) + ProtoAdapter.INT64.encodedSizeWithTag(2, liveCountdownStickerStructV2.end_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, liveCountdownStickerStructV2.subscribe_count) + ProtoAdapter.BOOL.encodedSizeWithTag(4, liveCountdownStickerStructV2.is_subscribed) + ProtoAdapter.STRING.encodedSizeWithTag(5, liveCountdownStickerStructV2.text_to_be_subscribed) + ProtoAdapter.STRING.encodedSizeWithTag(6, liveCountdownStickerStructV2.text_already_subscribed) + ProtoAdapter.STRING.encodedSizeWithTag(7, liveCountdownStickerStructV2.text_already_ended) + liveCountdownStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LiveCountdownStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.subscribe_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.is_subscribed(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.text_to_be_subscribed(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.text_already_subscribed(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.text_already_ended(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, LiveCountdownStickerStructV2 liveCountdownStickerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, liveCountdownStickerStructV2.title);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, liveCountdownStickerStructV2.end_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, liveCountdownStickerStructV2.subscribe_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, liveCountdownStickerStructV2.is_subscribed);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, liveCountdownStickerStructV2.text_to_be_subscribed);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, liveCountdownStickerStructV2.text_already_subscribed);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, liveCountdownStickerStructV2.text_already_ended);
            protoWriter.writeBytes(liveCountdownStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102074);
    }

    public static final class Builder extends Message.Builder<LiveCountdownStickerStructV2, Builder> {
        public Long end_time;
        public Boolean is_subscribed;
        public Long subscribe_count;
        public String text_already_ended;
        public String text_already_subscribed;
        public String text_to_be_subscribed;
        public String title;

        static {
            Covode.recordClassIndex(102075);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LiveCountdownStickerStructV2 build() {
            return new LiveCountdownStickerStructV2(this.title, this.end_time, this.subscribe_count, this.is_subscribed, this.text_to_be_subscribed, this.text_already_subscribed, this.text_already_ended, super.buildUnknownFields());
        }

        public final Builder end_time(Long l2) {
            this.end_time = l2;
            return this;
        }

        public final Builder is_subscribed(Boolean bool) {
            this.is_subscribed = bool;
            return this;
        }

        public final Builder subscribe_count(Long l2) {
            this.subscribe_count = l2;
            return this;
        }

        public final Builder text_already_ended(String str) {
            this.text_already_ended = str;
            return this;
        }

        public final Builder text_already_subscribed(String str) {
            this.text_already_subscribed = str;
            return this;
        }

        public final Builder text_to_be_subscribed(String str) {
            this.text_to_be_subscribed = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LiveCountdownStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LiveCountdownStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.end_time = this.end_time;
        builder.subscribe_count = this.subscribe_count;
        builder.is_subscribed = this.is_subscribed;
        builder.text_to_be_subscribed = this.text_to_be_subscribed;
        builder.text_already_subscribed = this.text_already_subscribed;
        builder.text_already_ended = this.text_already_ended;
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int i9 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        Long l2 = this.end_time;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        Long l3 = this.subscribe_count;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        Boolean bool = this.is_subscribed;
        if (bool != null) {
            i5 = bool.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        String str2 = this.text_to_be_subscribed;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        String str3 = this.text_already_subscribed;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        String str4 = this.text_already_ended;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        int i16 = i15 + i9;
        this.hashCode = i16;
        return i16;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (this.subscribe_count != null) {
            sb.append(", subscribe_count=").append(this.subscribe_count);
        }
        if (this.is_subscribed != null) {
            sb.append(", is_subscribed=").append(this.is_subscribed);
        }
        if (this.text_to_be_subscribed != null) {
            sb.append(", text_to_be_subscribed=").append(this.text_to_be_subscribed);
        }
        if (this.text_already_subscribed != null) {
            sb.append(", text_already_subscribed=").append(this.text_already_subscribed);
        }
        if (this.text_already_ended != null) {
            sb.append(", text_already_ended=").append(this.text_already_ended);
        }
        return sb.replace(0, 2, "LiveCountdownStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCountdownStickerStructV2)) {
            return false;
        }
        LiveCountdownStickerStructV2 liveCountdownStickerStructV2 = (LiveCountdownStickerStructV2) obj;
        if (!unknownFields().equals(liveCountdownStickerStructV2.unknownFields()) || !Internal.equals(this.title, liveCountdownStickerStructV2.title) || !Internal.equals(this.end_time, liveCountdownStickerStructV2.end_time) || !Internal.equals(this.subscribe_count, liveCountdownStickerStructV2.subscribe_count) || !Internal.equals(this.is_subscribed, liveCountdownStickerStructV2.is_subscribed) || !Internal.equals(this.text_to_be_subscribed, liveCountdownStickerStructV2.text_to_be_subscribed) || !Internal.equals(this.text_already_subscribed, liveCountdownStickerStructV2.text_already_subscribed) || !Internal.equals(this.text_already_ended, liveCountdownStickerStructV2.text_already_ended)) {
            return false;
        }
        return true;
    }

    public LiveCountdownStickerStructV2(String str, Long l2, Long l3, Boolean bool, String str2, String str3, String str4) {
        this(str, l2, l3, bool, str2, str3, str4, i.EMPTY);
    }

    public LiveCountdownStickerStructV2(String str, Long l2, Long l3, Boolean bool, String str2, String str3, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.title = str;
        this.end_time = l2;
        this.subscribe_count = l3;
        this.is_subscribed = bool;
        this.text_to_be_subscribed = str2;
        this.text_already_subscribed = str3;
        this.text_already_ended = str4;
    }
}
