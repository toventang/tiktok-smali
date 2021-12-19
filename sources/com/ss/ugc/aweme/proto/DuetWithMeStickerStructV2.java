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

public final class DuetWithMeStickerStructV2 extends Message<DuetWithMeStickerStructV2, Builder> {
    public static final ProtoAdapter<DuetWithMeStickerStructV2> ADAPTER = new ProtoAdapter_DuetWithMeStickerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public List<String> invitedToDuetUserIds;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean micPermissionOn;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String stickerContent;

    public DuetWithMeStickerStructV2() {
    }

    static final class ProtoAdapter_DuetWithMeStickerStructV2 extends ProtoAdapter<DuetWithMeStickerStructV2> {
        static {
            Covode.recordClassIndex(101995);
        }

        public ProtoAdapter_DuetWithMeStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DuetWithMeStickerStructV2.class);
        }

        public final int encodedSize(DuetWithMeStickerStructV2 duetWithMeStickerStructV2) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, duetWithMeStickerStructV2.invitedToDuetUserIds) + ProtoAdapter.BOOL.encodedSizeWithTag(2, duetWithMeStickerStructV2.micPermissionOn) + ProtoAdapter.STRING.encodedSizeWithTag(3, duetWithMeStickerStructV2.stickerContent) + duetWithMeStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DuetWithMeStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.invitedToDuetUserIds.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.micPermissionOn(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.stickerContent(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DuetWithMeStickerStructV2 duetWithMeStickerStructV2) {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, duetWithMeStickerStructV2.invitedToDuetUserIds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, duetWithMeStickerStructV2.micPermissionOn);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, duetWithMeStickerStructV2.stickerContent);
            protoWriter.writeBytes(duetWithMeStickerStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DuetWithMeStickerStructV2, Builder> {
        public List<String> invitedToDuetUserIds = Internal.newMutableList();
        public Boolean micPermissionOn;
        public String stickerContent;

        static {
            Covode.recordClassIndex(101994);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DuetWithMeStickerStructV2 build() {
            return new DuetWithMeStickerStructV2(this.invitedToDuetUserIds, this.micPermissionOn, this.stickerContent, super.buildUnknownFields());
        }

        public final Builder micPermissionOn(Boolean bool) {
            this.micPermissionOn = bool;
            return this;
        }

        public final Builder stickerContent(String str) {
            this.stickerContent = str;
            return this;
        }

        public final Builder invitedToDuetUserIds(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.invitedToDuetUserIds = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101993);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DuetWithMeStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DuetWithMeStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.invitedToDuetUserIds = Internal.copyOf("invitedToDuetUserIds", this.invitedToDuetUserIds);
        builder.micPermissionOn = this.micPermissionOn;
        builder.stickerContent = this.stickerContent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.invitedToDuetUserIds.hashCode()) * 37;
        Boolean bool = this.micPermissionOn;
        int i4 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.stickerContent;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.invitedToDuetUserIds.isEmpty()) {
            sb.append(", invitedToDuetUserIds=").append(this.invitedToDuetUserIds);
        }
        if (this.micPermissionOn != null) {
            sb.append(", micPermissionOn=").append(this.micPermissionOn);
        }
        if (this.stickerContent != null) {
            sb.append(", stickerContent=").append(this.stickerContent);
        }
        return sb.replace(0, 2, "DuetWithMeStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DuetWithMeStickerStructV2)) {
            return false;
        }
        DuetWithMeStickerStructV2 duetWithMeStickerStructV2 = (DuetWithMeStickerStructV2) obj;
        if (!unknownFields().equals(duetWithMeStickerStructV2.unknownFields()) || !this.invitedToDuetUserIds.equals(duetWithMeStickerStructV2.invitedToDuetUserIds) || !Internal.equals(this.micPermissionOn, duetWithMeStickerStructV2.micPermissionOn) || !Internal.equals(this.stickerContent, duetWithMeStickerStructV2.stickerContent)) {
            return false;
        }
        return true;
    }

    public DuetWithMeStickerStructV2(List<String> list, Boolean bool, String str) {
        this(list, bool, str, i.EMPTY);
    }

    public DuetWithMeStickerStructV2(List<String> list, Boolean bool, String str, i iVar) {
        super(ADAPTER, iVar);
        this.invitedToDuetUserIds = Internal.immutableCopyOf("invitedToDuetUserIds", list);
        this.micPermissionOn = bool;
        this.stickerContent = str;
    }
}
