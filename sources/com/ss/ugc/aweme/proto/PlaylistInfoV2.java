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

public final class PlaylistInfoV2 extends Message<PlaylistInfoV2, Builder> {
    public static final ProtoAdapter<PlaylistInfoV2> ADAPTER = new ProtoAdapter_PlaylistInfoV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Boolean is_default_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long item_total;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String mix_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String name_in_review;

    public PlaylistInfoV2() {
    }

    static final class ProtoAdapter_PlaylistInfoV2 extends ProtoAdapter<PlaylistInfoV2> {
        static {
            Covode.recordClassIndex(102166);
        }

        public ProtoAdapter_PlaylistInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PlaylistInfoV2.class);
        }

        public final int encodedSize(PlaylistInfoV2 playlistInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, playlistInfoV2.mix_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, playlistInfoV2.name) + ProtoAdapter.INT32.encodedSizeWithTag(3, playlistInfoV2.index) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, playlistInfoV2.icon) + ProtoAdapter.INT64.encodedSizeWithTag(5, playlistInfoV2.item_total) + ProtoAdapter.STRING.encodedSizeWithTag(6, playlistInfoV2.name_in_review) + ProtoAdapter.BOOL.encodedSizeWithTag(7, playlistInfoV2.is_default_name) + playlistInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PlaylistInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mix_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.index(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.item_total(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.name_in_review(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.is_default_name(ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PlaylistInfoV2 playlistInfoV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, playlistInfoV2.mix_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, playlistInfoV2.name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, playlistInfoV2.index);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, playlistInfoV2.icon);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, playlistInfoV2.item_total);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, playlistInfoV2.name_in_review);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, playlistInfoV2.is_default_name);
            protoWriter.writeBytes(playlistInfoV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102164);
    }

    public static final class Builder extends Message.Builder<PlaylistInfoV2, Builder> {
        public UrlStructV2 icon;
        public Integer index;
        public Boolean is_default_name;
        public Long item_total;
        public String mix_id;
        public String name;
        public String name_in_review;

        static {
            Covode.recordClassIndex(102165);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PlaylistInfoV2 build() {
            return new PlaylistInfoV2(this.mix_id, this.name, this.index, this.icon, this.item_total, this.name_in_review, this.is_default_name, super.buildUnknownFields());
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder index(Integer num) {
            this.index = num;
            return this;
        }

        public final Builder is_default_name(Boolean bool) {
            this.is_default_name = bool;
            return this;
        }

        public final Builder item_total(Long l2) {
            this.item_total = l2;
            return this;
        }

        public final Builder mix_id(String str) {
            this.mix_id = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder name_in_review(String str) {
            this.name_in_review = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.PlaylistInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PlaylistInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.mix_id = this.mix_id;
        builder.name = this.name;
        builder.index = this.index;
        builder.icon = this.icon;
        builder.item_total = this.item_total;
        builder.name_in_review = this.name_in_review;
        builder.is_default_name = this.is_default_name;
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
        String str = this.mix_id;
        int i9 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        String str2 = this.name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        Integer num = this.index;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        Long l2 = this.item_total;
        if (l2 != null) {
            i6 = l2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        String str3 = this.name_in_review;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        Boolean bool = this.is_default_name;
        if (bool != null) {
            i9 = bool.hashCode();
        }
        int i16 = i15 + i9;
        this.hashCode = i16;
        return i16;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mix_id != null) {
            sb.append(", mix_id=").append(this.mix_id);
        }
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.index != null) {
            sb.append(", index=").append(this.index);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.item_total != null) {
            sb.append(", item_total=").append(this.item_total);
        }
        if (this.name_in_review != null) {
            sb.append(", name_in_review=").append(this.name_in_review);
        }
        if (this.is_default_name != null) {
            sb.append(", is_default_name=").append(this.is_default_name);
        }
        return sb.replace(0, 2, "PlaylistInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaylistInfoV2)) {
            return false;
        }
        PlaylistInfoV2 playlistInfoV2 = (PlaylistInfoV2) obj;
        if (!unknownFields().equals(playlistInfoV2.unknownFields()) || !Internal.equals(this.mix_id, playlistInfoV2.mix_id) || !Internal.equals(this.name, playlistInfoV2.name) || !Internal.equals(this.index, playlistInfoV2.index) || !Internal.equals(this.icon, playlistInfoV2.icon) || !Internal.equals(this.item_total, playlistInfoV2.item_total) || !Internal.equals(this.name_in_review, playlistInfoV2.name_in_review) || !Internal.equals(this.is_default_name, playlistInfoV2.is_default_name)) {
            return false;
        }
        return true;
    }

    public PlaylistInfoV2(String str, String str2, Integer num, UrlStructV2 urlStructV2, Long l2, String str3, Boolean bool) {
        this(str, str2, num, urlStructV2, l2, str3, bool, i.EMPTY);
    }

    public PlaylistInfoV2(String str, String str2, Integer num, UrlStructV2 urlStructV2, Long l2, String str3, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.mix_id = str;
        this.name = str2;
        this.index = num;
        this.icon = urlStructV2;
        this.item_total = l2;
        this.name_in_review = str3;
        this.is_default_name = bool;
    }
}
