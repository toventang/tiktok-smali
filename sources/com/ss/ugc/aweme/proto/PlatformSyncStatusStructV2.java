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

public final class PlatformSyncStatusStructV2 extends Message<PlatformSyncStatusStructV2, Builder> {
    public static final ProtoAdapter<PlatformSyncStatusStructV2> ADAPTER = new ProtoAdapter_PlatformSyncStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean full_synced;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String platform_name;

    public PlatformSyncStatusStructV2() {
    }

    static final class ProtoAdapter_PlatformSyncStatusStructV2 extends ProtoAdapter<PlatformSyncStatusStructV2> {
        static {
            Covode.recordClassIndex(102160);
        }

        public ProtoAdapter_PlatformSyncStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PlatformSyncStatusStructV2.class);
        }

        public final int encodedSize(PlatformSyncStatusStructV2 platformSyncStatusStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, platformSyncStatusStructV2.platform_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, platformSyncStatusStructV2.nickname) + ProtoAdapter.BOOL.encodedSizeWithTag(3, platformSyncStatusStructV2.full_synced) + platformSyncStatusStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PlatformSyncStatusStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.platform_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.full_synced(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PlatformSyncStatusStructV2 platformSyncStatusStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, platformSyncStatusStructV2.platform_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, platformSyncStatusStructV2.nickname);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, platformSyncStatusStructV2.full_synced);
            protoWriter.writeBytes(platformSyncStatusStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PlatformSyncStatusStructV2, Builder> {
        public Boolean full_synced;
        public String nickname;
        public String platform_name;

        static {
            Covode.recordClassIndex(102159);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PlatformSyncStatusStructV2 build() {
            return new PlatformSyncStatusStructV2(this.platform_name, this.nickname, this.full_synced, super.buildUnknownFields());
        }

        public final Builder full_synced(Boolean bool) {
            this.full_synced = bool;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder platform_name(String str) {
            this.platform_name = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102158);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PlatformSyncStatusStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.platform_name = this.platform_name;
        builder.nickname = this.nickname;
        builder.full_synced = this.full_synced;
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
        String str = this.platform_name;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.nickname;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Boolean bool = this.full_synced;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.platform_name != null) {
            sb.append(", platform_name=").append(this.platform_name);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.full_synced != null) {
            sb.append(", full_synced=").append(this.full_synced);
        }
        return sb.replace(0, 2, "PlatformSyncStatusStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlatformSyncStatusStructV2)) {
            return false;
        }
        PlatformSyncStatusStructV2 platformSyncStatusStructV2 = (PlatformSyncStatusStructV2) obj;
        if (!unknownFields().equals(platformSyncStatusStructV2.unknownFields()) || !Internal.equals(this.platform_name, platformSyncStatusStructV2.platform_name) || !Internal.equals(this.nickname, platformSyncStatusStructV2.nickname) || !Internal.equals(this.full_synced, platformSyncStatusStructV2.full_synced)) {
            return false;
        }
        return true;
    }

    public PlatformSyncStatusStructV2(String str, String str2, Boolean bool) {
        this(str, str2, bool, i.EMPTY);
    }

    public PlatformSyncStatusStructV2(String str, String str2, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.platform_name = str;
        this.nickname = str2;
        this.full_synced = bool;
    }
}
