package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class MatchInfoStructV2 extends Message<MatchInfoStructV2, Builder> {
    public static final ProtoAdapter<MatchInfoStructV2> ADAPTER = new ProtoAdapter_MatchInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer begin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String query;

    public MatchInfoStructV2() {
    }

    static final class ProtoAdapter_MatchInfoStructV2 extends ProtoAdapter<MatchInfoStructV2> {
        static {
            Covode.recordClassIndex(102091);
        }

        public ProtoAdapter_MatchInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MatchInfoStructV2.class);
        }

        public final int encodedSize(MatchInfoStructV2 matchInfoStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, matchInfoStructV2.query) + ProtoAdapter.STRING.encodedSizeWithTag(2, matchInfoStructV2.link) + ProtoAdapter.INT32.encodedSizeWithTag(3, matchInfoStructV2.begin) + ProtoAdapter.INT32.encodedSizeWithTag(4, matchInfoStructV2.end) + matchInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MatchInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.query(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.link(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.begin(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.end(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MatchInfoStructV2 matchInfoStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, matchInfoStructV2.query);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, matchInfoStructV2.link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, matchInfoStructV2.begin);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, matchInfoStructV2.end);
            protoWriter.writeBytes(matchInfoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102089);
    }

    public static final class Builder extends Message.Builder<MatchInfoStructV2, Builder> {
        public Integer begin;
        public Integer end;
        public String link;
        public String query;

        static {
            Covode.recordClassIndex(102090);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MatchInfoStructV2 build() {
            return new MatchInfoStructV2(this.query, this.link, this.begin, this.end, super.buildUnknownFields());
        }

        public final Builder begin(Integer num) {
            this.begin = num;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder query(String str) {
            this.query = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MatchInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MatchInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.query = this.query;
        builder.link = this.link;
        builder.begin = this.begin;
        builder.end = this.end;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.query;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str2 = this.link;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Integer num = this.begin;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Integer num2 = this.end;
        if (num2 != null) {
            i6 = num2.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=").append(this.query);
        }
        if (this.link != null) {
            sb.append(", link=").append(this.link);
        }
        if (this.begin != null) {
            sb.append(", begin=").append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=").append(this.end);
        }
        return sb.replace(0, 2, "MatchInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchInfoStructV2)) {
            return false;
        }
        MatchInfoStructV2 matchInfoStructV2 = (MatchInfoStructV2) obj;
        if (!unknownFields().equals(matchInfoStructV2.unknownFields()) || !Internal.equals(this.query, matchInfoStructV2.query) || !Internal.equals(this.link, matchInfoStructV2.link) || !Internal.equals(this.begin, matchInfoStructV2.begin) || !Internal.equals(this.end, matchInfoStructV2.end)) {
            return false;
        }
        return true;
    }

    public MatchInfoStructV2(String str, String str2, Integer num, Integer num2) {
        this(str, str2, num, num2, i.EMPTY);
    }

    public MatchInfoStructV2(String str, String str2, Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.query = str;
        this.link = str2;
        this.begin = num;
        this.end = num2;
    }
}
