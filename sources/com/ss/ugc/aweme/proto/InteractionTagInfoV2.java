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

public final class InteractionTagInfoV2 extends Message<InteractionTagInfoV2, Builder> {
    public static final ProtoAdapter<InteractionTagInfoV2> ADAPTER = new ProtoAdapter_InteractionTagInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer interest_level;
    @WireField(adapter = "com.ss.ugc.aweme.proto.InteractionTagUserInfoV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<InteractionTagUserInfoV2> tagged_users;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String video_label_text;

    public InteractionTagInfoV2() {
    }

    static final class ProtoAdapter_InteractionTagInfoV2 extends ProtoAdapter<InteractionTagInfoV2> {
        static {
            Covode.recordClassIndex(102058);
        }

        public ProtoAdapter_InteractionTagInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, InteractionTagInfoV2.class);
        }

        public final int encodedSize(InteractionTagInfoV2 interactionTagInfoV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, interactionTagInfoV2.interest_level) + ProtoAdapter.STRING.encodedSizeWithTag(2, interactionTagInfoV2.video_label_text) + InteractionTagUserInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(3, interactionTagInfoV2.tagged_users) + interactionTagInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InteractionTagInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.interest_level(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.video_label_text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.tagged_users.add(InteractionTagUserInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InteractionTagInfoV2 interactionTagInfoV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, interactionTagInfoV2.interest_level);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, interactionTagInfoV2.video_label_text);
            InteractionTagUserInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, interactionTagInfoV2.tagged_users);
            protoWriter.writeBytes(interactionTagInfoV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102056);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.InteractionTagInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InteractionTagInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.interest_level = this.interest_level;
        builder.video_label_text = this.video_label_text;
        builder.tagged_users = Internal.copyOf("tagged_users", this.tagged_users);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<InteractionTagInfoV2, Builder> {
        public Integer interest_level;
        public List<InteractionTagUserInfoV2> tagged_users = Internal.newMutableList();
        public String video_label_text;

        static {
            Covode.recordClassIndex(102057);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InteractionTagInfoV2 build() {
            Integer num = this.interest_level;
            if (num != null && this.video_label_text != null) {
                return new InteractionTagInfoV2(this.interest_level, this.video_label_text, this.tagged_users, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "interest_level", this.video_label_text, "video_label_text");
        }

        public final Builder interest_level(Integer num) {
            this.interest_level = num;
            return this;
        }

        public final Builder video_label_text(String str) {
            this.video_label_text = str;
            return this;
        }

        public final Builder tagged_users(List<InteractionTagUserInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.tagged_users = list;
            return this;
        }
    }

    public final int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.interest_level.hashCode()) * 37) + this.video_label_text.hashCode()) * 37) + this.tagged_users.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", interest_level=").append(this.interest_level);
        sb.append(", video_label_text=").append(this.video_label_text);
        if (!this.tagged_users.isEmpty()) {
            sb.append(", tagged_users=").append(this.tagged_users);
        }
        return sb.replace(0, 2, "InteractionTagInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractionTagInfoV2)) {
            return false;
        }
        InteractionTagInfoV2 interactionTagInfoV2 = (InteractionTagInfoV2) obj;
        if (!unknownFields().equals(interactionTagInfoV2.unknownFields()) || !this.interest_level.equals(interactionTagInfoV2.interest_level) || !this.video_label_text.equals(interactionTagInfoV2.video_label_text) || !this.tagged_users.equals(interactionTagInfoV2.tagged_users)) {
            return false;
        }
        return true;
    }

    public InteractionTagInfoV2(Integer num, String str, List<InteractionTagUserInfoV2> list) {
        this(num, str, list, i.EMPTY);
    }

    public InteractionTagInfoV2(Integer num, String str, List<InteractionTagUserInfoV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.interest_level = num;
        this.video_label_text = str;
        this.tagged_users = Internal.immutableCopyOf("tagged_users", list);
    }
}
