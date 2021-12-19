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

public final class MatchedPGCSoundStructV2 extends Message<MatchedPGCSoundStructV2, Builder> {
    public static final ProtoAdapter<MatchedPGCSoundStructV2> ADAPTER = new ProtoAdapter_MatchedPGCSoundStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String mixed_author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String mixed_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;

    public MatchedPGCSoundStructV2() {
    }

    static final class ProtoAdapter_MatchedPGCSoundStructV2 extends ProtoAdapter<MatchedPGCSoundStructV2> {
        static {
            Covode.recordClassIndex(102097);
        }

        public ProtoAdapter_MatchedPGCSoundStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MatchedPGCSoundStructV2.class);
        }

        public final int encodedSize(MatchedPGCSoundStructV2 matchedPGCSoundStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, matchedPGCSoundStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, matchedPGCSoundStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(3, matchedPGCSoundStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, matchedPGCSoundStructV2.mixed_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, matchedPGCSoundStructV2.mixed_author) + matchedPGCSoundStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MatchedPGCSoundStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.author(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.mixed_title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.mixed_author(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MatchedPGCSoundStructV2 matchedPGCSoundStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, matchedPGCSoundStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, matchedPGCSoundStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, matchedPGCSoundStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, matchedPGCSoundStructV2.mixed_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, matchedPGCSoundStructV2.mixed_author);
            protoWriter.writeBytes(matchedPGCSoundStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102095);
    }

    public static final class Builder extends Message.Builder<MatchedPGCSoundStructV2, Builder> {
        public String author;
        public Long id;
        public String mixed_author;
        public String mixed_title;
        public String title;

        static {
            Covode.recordClassIndex(102096);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MatchedPGCSoundStructV2 build() {
            return new MatchedPGCSoundStructV2(this.id, this.author, this.title, this.mixed_title, this.mixed_author, super.buildUnknownFields());
        }

        public final Builder author(String str) {
            this.author = str;
            return this;
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder mixed_author(String str) {
            this.mixed_author = str;
            return this;
        }

        public final Builder mixed_title(String str) {
            this.mixed_title = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MatchedPGCSoundStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MatchedPGCSoundStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.author = this.author;
        builder.title = this.title;
        builder.mixed_title = this.mixed_title;
        builder.mixed_author = this.mixed_author;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.id;
        int i7 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str = this.author;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        String str3 = this.mixed_title;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        String str4 = this.mixed_author;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
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
        if (this.mixed_title != null) {
            sb.append(", mixed_title=").append(this.mixed_title);
        }
        if (this.mixed_author != null) {
            sb.append(", mixed_author=").append(this.mixed_author);
        }
        return sb.replace(0, 2, "MatchedPGCSoundStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchedPGCSoundStructV2)) {
            return false;
        }
        MatchedPGCSoundStructV2 matchedPGCSoundStructV2 = (MatchedPGCSoundStructV2) obj;
        if (!unknownFields().equals(matchedPGCSoundStructV2.unknownFields()) || !Internal.equals(this.id, matchedPGCSoundStructV2.id) || !Internal.equals(this.author, matchedPGCSoundStructV2.author) || !Internal.equals(this.title, matchedPGCSoundStructV2.title) || !Internal.equals(this.mixed_title, matchedPGCSoundStructV2.mixed_title) || !Internal.equals(this.mixed_author, matchedPGCSoundStructV2.mixed_author)) {
            return false;
        }
        return true;
    }

    public MatchedPGCSoundStructV2(Long l2, String str, String str2, String str3, String str4) {
        this(l2, str, str2, str3, str4, i.EMPTY);
    }

    public MatchedPGCSoundStructV2(Long l2, String str, String str2, String str3, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.author = str;
        this.title = str2;
        this.mixed_title = str3;
        this.mixed_author = str4;
    }
}
