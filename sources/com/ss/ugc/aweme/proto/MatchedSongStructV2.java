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
import java.util.List;
import k.i;

public final class MatchedSongStructV2 extends Message<MatchedSongStructV2, Builder> {
    public static final ProtoAdapter<MatchedSongStructV2> ADAPTER = new ProtoAdapter_MatchedSongStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicChorusInfoStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public MusicChorusInfoStructV2 chorus_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 cover_medium;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String h5_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicPerformerStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public List<MusicPerformerStructV2> performers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;

    public MatchedSongStructV2() {
    }

    static final class ProtoAdapter_MatchedSongStructV2 extends ProtoAdapter<MatchedSongStructV2> {
        static {
            Covode.recordClassIndex(102100);
        }

        public ProtoAdapter_MatchedSongStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MatchedSongStructV2.class);
        }

        public final int encodedSize(MatchedSongStructV2 matchedSongStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, matchedSongStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, matchedSongStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(3, matchedSongStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, matchedSongStructV2.h5_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, matchedSongStructV2.cover_medium) + MusicPerformerStructV2.ADAPTER.asRepeated().encodedSizeWithTag(6, matchedSongStructV2.performers) + MusicChorusInfoStructV2.ADAPTER.encodedSizeWithTag(7, matchedSongStructV2.chorus_info) + matchedSongStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MatchedSongStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.author(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.h5_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.cover_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.performers.add(MusicPerformerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.chorus_info(MusicChorusInfoStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MatchedSongStructV2 matchedSongStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, matchedSongStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, matchedSongStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, matchedSongStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, matchedSongStructV2.h5_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, matchedSongStructV2.cover_medium);
            MusicPerformerStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, matchedSongStructV2.performers);
            MusicChorusInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 7, matchedSongStructV2.chorus_info);
            protoWriter.writeBytes(matchedSongStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102098);
    }

    public static final class Builder extends Message.Builder<MatchedSongStructV2, Builder> {
        public String author;
        public MusicChorusInfoStructV2 chorus_info;
        public UrlStructV2 cover_medium;
        public String h5_url;
        public String id;
        public List<MusicPerformerStructV2> performers = Internal.newMutableList();
        public String title;

        static {
            Covode.recordClassIndex(102099);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MatchedSongStructV2 build() {
            return new MatchedSongStructV2(this.id, this.author, this.title, this.h5_url, this.cover_medium, this.performers, this.chorus_info, super.buildUnknownFields());
        }

        public final Builder author(String str) {
            this.author = str;
            return this;
        }

        public final Builder chorus_info(MusicChorusInfoStructV2 musicChorusInfoStructV2) {
            this.chorus_info = musicChorusInfoStructV2;
            return this;
        }

        public final Builder cover_medium(UrlStructV2 urlStructV2) {
            this.cover_medium = urlStructV2;
            return this;
        }

        public final Builder h5_url(String str) {
            this.h5_url = str;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder performers(List<MusicPerformerStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.performers = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MatchedSongStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MatchedSongStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.author = this.author;
        builder.title = this.title;
        builder.h5_url = this.h5_url;
        builder.cover_medium = this.cover_medium;
        builder.performers = Internal.copyOf("performers", this.performers);
        builder.chorus_info = this.chorus_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int i8 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        String str2 = this.author;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        String str3 = this.title;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        String str4 = this.h5_url;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        UrlStructV2 urlStructV2 = this.cover_medium;
        if (urlStructV2 != null) {
            i6 = urlStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = (((i12 + i6) * 37) + this.performers.hashCode()) * 37;
        MusicChorusInfoStructV2 musicChorusInfoStructV2 = this.chorus_info;
        if (musicChorusInfoStructV2 != null) {
            i8 = musicChorusInfoStructV2.hashCode();
        }
        int i13 = hashCode2 + i8;
        this.hashCode = i13;
        return i13;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.h5_url != null) {
            sb.append(", h5_url=").append(this.h5_url);
        }
        if (this.cover_medium != null) {
            sb.append(", cover_medium=").append(this.cover_medium);
        }
        if (!this.performers.isEmpty()) {
            sb.append(", performers=").append(this.performers);
        }
        if (this.chorus_info != null) {
            sb.append(", chorus_info=").append(this.chorus_info);
        }
        return sb.replace(0, 2, "MatchedSongStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchedSongStructV2)) {
            return false;
        }
        MatchedSongStructV2 matchedSongStructV2 = (MatchedSongStructV2) obj;
        if (!unknownFields().equals(matchedSongStructV2.unknownFields()) || !Internal.equals(this.id, matchedSongStructV2.id) || !Internal.equals(this.author, matchedSongStructV2.author) || !Internal.equals(this.title, matchedSongStructV2.title) || !Internal.equals(this.h5_url, matchedSongStructV2.h5_url) || !Internal.equals(this.cover_medium, matchedSongStructV2.cover_medium) || !this.performers.equals(matchedSongStructV2.performers) || !Internal.equals(this.chorus_info, matchedSongStructV2.chorus_info)) {
            return false;
        }
        return true;
    }

    public MatchedSongStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, List<MusicPerformerStructV2> list, MusicChorusInfoStructV2 musicChorusInfoStructV2) {
        this(str, str2, str3, str4, urlStructV2, list, musicChorusInfoStructV2, i.EMPTY);
    }

    public MatchedSongStructV2(String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, List<MusicPerformerStructV2> list, MusicChorusInfoStructV2 musicChorusInfoStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.id = str;
        this.author = str2;
        this.title = str3;
        this.h5_url = str4;
        this.cover_medium = urlStructV2;
        this.performers = Internal.immutableCopyOf("performers", list);
        this.chorus_info = musicChorusInfoStructV2;
    }
}
