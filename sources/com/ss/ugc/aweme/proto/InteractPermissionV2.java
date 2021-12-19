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

public final class InteractPermissionV2 extends Message<InteractPermissionV2, Builder> {
    public static final ProtoAdapter<InteractPermissionV2> ADAPTER = new ProtoAdapter_InteractPermissionV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer duet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer duet_privacy_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer stitch;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer stitch_privacy_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer upvote;

    public InteractPermissionV2() {
    }

    static final class ProtoAdapter_InteractPermissionV2 extends ProtoAdapter<InteractPermissionV2> {
        static {
            Covode.recordClassIndex(102052);
        }

        public ProtoAdapter_InteractPermissionV2() {
            super(FieldEncoding.LENGTH_DELIMITED, InteractPermissionV2.class);
        }

        public final int encodedSize(InteractPermissionV2 interactPermissionV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, interactPermissionV2.duet) + ProtoAdapter.INT32.encodedSizeWithTag(2, interactPermissionV2.stitch) + ProtoAdapter.INT32.encodedSizeWithTag(3, interactPermissionV2.duet_privacy_setting) + ProtoAdapter.INT32.encodedSizeWithTag(4, interactPermissionV2.stitch_privacy_setting) + ProtoAdapter.INT32.encodedSizeWithTag(5, interactPermissionV2.upvote) + interactPermissionV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InteractPermissionV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.duet(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.stitch(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.duet_privacy_setting(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.stitch_privacy_setting(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.upvote(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, InteractPermissionV2 interactPermissionV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, interactPermissionV2.duet);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, interactPermissionV2.stitch);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, interactPermissionV2.duet_privacy_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, interactPermissionV2.stitch_privacy_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, interactPermissionV2.upvote);
            protoWriter.writeBytes(interactPermissionV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102050);
    }

    public static final class Builder extends Message.Builder<InteractPermissionV2, Builder> {
        public Integer duet;
        public Integer duet_privacy_setting;
        public Integer stitch;
        public Integer stitch_privacy_setting;
        public Integer upvote;

        static {
            Covode.recordClassIndex(102051);
        }

        @Override // com.squareup.wire.Message.Builder
        public final InteractPermissionV2 build() {
            return new InteractPermissionV2(this.duet, this.stitch, this.duet_privacy_setting, this.stitch_privacy_setting, this.upvote, super.buildUnknownFields());
        }

        public final Builder duet(Integer num) {
            this.duet = num;
            return this;
        }

        public final Builder duet_privacy_setting(Integer num) {
            this.duet_privacy_setting = num;
            return this;
        }

        public final Builder stitch(Integer num) {
            this.stitch = num;
            return this;
        }

        public final Builder stitch_privacy_setting(Integer num) {
            this.stitch_privacy_setting = num;
            return this;
        }

        public final Builder upvote(Integer num) {
            this.upvote = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.InteractPermissionV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<InteractPermissionV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.duet = this.duet;
        builder.stitch = this.stitch;
        builder.duet_privacy_setting = this.duet_privacy_setting;
        builder.stitch_privacy_setting = this.stitch_privacy_setting;
        builder.upvote = this.upvote;
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
        Integer num = this.duet;
        int i7 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Integer num2 = this.stitch;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Integer num3 = this.duet_privacy_setting;
        if (num3 != null) {
            i4 = num3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        Integer num4 = this.stitch_privacy_setting;
        if (num4 != null) {
            i5 = num4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        Integer num5 = this.upvote;
        if (num5 != null) {
            i7 = num5.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.duet != null) {
            sb.append(", duet=").append(this.duet);
        }
        if (this.stitch != null) {
            sb.append(", stitch=").append(this.stitch);
        }
        if (this.duet_privacy_setting != null) {
            sb.append(", duet_privacy_setting=").append(this.duet_privacy_setting);
        }
        if (this.stitch_privacy_setting != null) {
            sb.append(", stitch_privacy_setting=").append(this.stitch_privacy_setting);
        }
        if (this.upvote != null) {
            sb.append(", upvote=").append(this.upvote);
        }
        return sb.replace(0, 2, "InteractPermissionV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractPermissionV2)) {
            return false;
        }
        InteractPermissionV2 interactPermissionV2 = (InteractPermissionV2) obj;
        if (!unknownFields().equals(interactPermissionV2.unknownFields()) || !Internal.equals(this.duet, interactPermissionV2.duet) || !Internal.equals(this.stitch, interactPermissionV2.stitch) || !Internal.equals(this.duet_privacy_setting, interactPermissionV2.duet_privacy_setting) || !Internal.equals(this.stitch_privacy_setting, interactPermissionV2.stitch_privacy_setting) || !Internal.equals(this.upvote, interactPermissionV2.upvote)) {
            return false;
        }
        return true;
    }

    public InteractPermissionV2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(num, num2, num3, num4, num5, i.EMPTY);
    }

    public InteractPermissionV2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, i iVar) {
        super(ADAPTER, iVar);
        this.duet = num;
        this.stitch = num2;
        this.duet_privacy_setting = num3;
        this.stitch_privacy_setting = num4;
        this.upvote = num5;
    }
}
