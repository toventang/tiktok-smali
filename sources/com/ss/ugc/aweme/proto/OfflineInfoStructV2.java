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

public final class OfflineInfoStructV2 extends Message<OfflineInfoStructV2, Builder> {
    public static final ProtoAdapter<OfflineInfoStructV2> ADAPTER = new ProtoAdapter_OfflineInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer offline_info_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String text;

    public OfflineInfoStructV2() {
    }

    static final class ProtoAdapter_OfflineInfoStructV2 extends ProtoAdapter<OfflineInfoStructV2> {
        static {
            Covode.recordClassIndex(102148);
        }

        public ProtoAdapter_OfflineInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OfflineInfoStructV2.class);
        }

        public final int encodedSize(OfflineInfoStructV2 offlineInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, offlineInfoStructV2.offline_info_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, offlineInfoStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(3, offlineInfoStructV2.action) + offlineInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final OfflineInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.offline_info_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.action(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, OfflineInfoStructV2 offlineInfoStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, offlineInfoStructV2.offline_info_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, offlineInfoStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, offlineInfoStructV2.action);
            protoWriter.writeBytes(offlineInfoStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<OfflineInfoStructV2, Builder> {
        public String action;
        public Integer offline_info_type;
        public String text;

        static {
            Covode.recordClassIndex(102147);
        }

        @Override // com.squareup.wire.Message.Builder
        public final OfflineInfoStructV2 build() {
            return new OfflineInfoStructV2(this.offline_info_type, this.text, this.action, super.buildUnknownFields());
        }

        public final Builder action(String str) {
            this.action = str;
            return this;
        }

        public final Builder offline_info_type(Integer num) {
            this.offline_info_type = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102146);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.OfflineInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<OfflineInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.offline_info_type = this.offline_info_type;
        builder.text = this.text;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.offline_info_type;
        int i5 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.text;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str2 = this.action;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.offline_info_type != null) {
            sb.append(", offline_info_type=").append(this.offline_info_type);
        }
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        if (this.action != null) {
            sb.append(", action=").append(this.action);
        }
        return sb.replace(0, 2, "OfflineInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineInfoStructV2)) {
            return false;
        }
        OfflineInfoStructV2 offlineInfoStructV2 = (OfflineInfoStructV2) obj;
        if (!unknownFields().equals(offlineInfoStructV2.unknownFields()) || !Internal.equals(this.offline_info_type, offlineInfoStructV2.offline_info_type) || !Internal.equals(this.text, offlineInfoStructV2.text) || !Internal.equals(this.action, offlineInfoStructV2.action)) {
            return false;
        }
        return true;
    }

    public OfflineInfoStructV2(Integer num, String str, String str2) {
        this(num, str, str2, i.EMPTY);
    }

    public OfflineInfoStructV2(Integer num, String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.offline_info_type = num;
        this.text = str;
        this.action = str2;
    }
}
