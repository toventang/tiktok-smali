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

public final class HotsearchSprintStructV2 extends Message<HotsearchSprintStructV2, Builder> {
    public static final ProtoAdapter<HotsearchSprintStructV2> ADAPTER = new ProtoAdapter_HotsearchSprintStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.SimpleUserStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<SimpleUserStructV2> followers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer sprint;

    public HotsearchSprintStructV2() {
    }

    static final class ProtoAdapter_HotsearchSprintStructV2 extends ProtoAdapter<HotsearchSprintStructV2> {
        static {
            Covode.recordClassIndex(102034);
        }

        public ProtoAdapter_HotsearchSprintStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HotsearchSprintStructV2.class);
        }

        public final int encodedSize(HotsearchSprintStructV2 hotsearchSprintStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, hotsearchSprintStructV2.sprint) + SimpleUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, hotsearchSprintStructV2.followers) + hotsearchSprintStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final HotsearchSprintStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.sprint(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.followers.add(SimpleUserStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, HotsearchSprintStructV2 hotsearchSprintStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hotsearchSprintStructV2.sprint);
            SimpleUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, hotsearchSprintStructV2.followers);
            protoWriter.writeBytes(hotsearchSprintStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<HotsearchSprintStructV2, Builder> {
        public List<SimpleUserStructV2> followers = Internal.newMutableList();
        public Integer sprint;

        static {
            Covode.recordClassIndex(102033);
        }

        @Override // com.squareup.wire.Message.Builder
        public final HotsearchSprintStructV2 build() {
            return new HotsearchSprintStructV2(this.sprint, this.followers, super.buildUnknownFields());
        }

        public final Builder sprint(Integer num) {
            this.sprint = num;
            return this;
        }

        public final Builder followers(List<SimpleUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.followers = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102032);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.HotsearchSprintStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<HotsearchSprintStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sprint = this.sprint;
        builder.followers = Internal.copyOf("followers", this.followers);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.sprint;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = ((hashCode + i2) * 37) + this.followers.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sprint != null) {
            sb.append(", sprint=").append(this.sprint);
        }
        if (!this.followers.isEmpty()) {
            sb.append(", followers=").append(this.followers);
        }
        return sb.replace(0, 2, "HotsearchSprintStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotsearchSprintStructV2)) {
            return false;
        }
        HotsearchSprintStructV2 hotsearchSprintStructV2 = (HotsearchSprintStructV2) obj;
        if (!unknownFields().equals(hotsearchSprintStructV2.unknownFields()) || !Internal.equals(this.sprint, hotsearchSprintStructV2.sprint) || !this.followers.equals(hotsearchSprintStructV2.followers)) {
            return false;
        }
        return true;
    }

    public HotsearchSprintStructV2(Integer num, List<SimpleUserStructV2> list) {
        this(num, list, i.EMPTY);
    }

    public HotsearchSprintStructV2(Integer num, List<SimpleUserStructV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.sprint = num;
        this.followers = Internal.immutableCopyOf("followers", list);
    }
}
