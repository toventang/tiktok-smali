package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class DescendantStructV2 extends Message<DescendantStructV2, Builder> {
    public static final ProtoAdapter<DescendantStructV2> ADAPTER = new ProtoAdapter_DescendantStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String notify_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public List<String> platforms;

    public DescendantStructV2() {
    }

    static final class ProtoAdapter_DescendantStructV2 extends ProtoAdapter<DescendantStructV2> {
        static {
            Covode.recordClassIndex(101983);
        }

        public ProtoAdapter_DescendantStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DescendantStructV2.class);
        }

        public final int encodedSize(DescendantStructV2 descendantStructV2) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, descendantStructV2.platforms) + ProtoAdapter.STRING.encodedSizeWithTag(2, descendantStructV2.notify_msg) + descendantStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DescendantStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.platforms.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.notify_msg(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DescendantStructV2 descendantStructV2) {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, descendantStructV2.platforms);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, descendantStructV2.notify_msg);
            protoWriter.writeBytes(descendantStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DescendantStructV2, Builder> {
        public String notify_msg;
        public List<String> platforms = Internal.newMutableList();

        static {
            Covode.recordClassIndex(101982);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DescendantStructV2 build() {
            return new DescendantStructV2(this.platforms, this.notify_msg, super.buildUnknownFields());
        }

        public final Builder notify_msg(String str) {
            this.notify_msg = str;
            return this;
        }

        public final Builder platforms(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.platforms = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101981);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DescendantStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DescendantStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.platforms = Internal.copyOf("platforms", this.platforms);
        builder.notify_msg = this.notify_msg;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.platforms.hashCode()) * 37;
        String str = this.notify_msg;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.platforms.isEmpty()) {
            sb.append(", platforms=").append(this.platforms);
        }
        if (this.notify_msg != null) {
            sb.append(", notify_msg=").append(this.notify_msg);
        }
        return sb.replace(0, 2, "DescendantStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescendantStructV2)) {
            return false;
        }
        DescendantStructV2 descendantStructV2 = (DescendantStructV2) obj;
        if (!unknownFields().equals(descendantStructV2.unknownFields()) || !this.platforms.equals(descendantStructV2.platforms) || !Internal.equals(this.notify_msg, descendantStructV2.notify_msg)) {
            return false;
        }
        return true;
    }

    public DescendantStructV2(List<String> list, String str) {
        this(list, str, i.EMPTY);
    }

    public DescendantStructV2(List<String> list, String str, i iVar) {
        super(ADAPTER, iVar);
        this.platforms = Internal.immutableCopyOf("platforms", list);
        this.notify_msg = str;
    }
}
