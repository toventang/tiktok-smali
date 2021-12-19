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

public final class MixStatisStructV2 extends Message<MixStatisStructV2, Builder> {
    public static final ProtoAdapter<MixStatisStructV2> ADAPTER = new ProtoAdapter_MixStatisStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long collect_vv;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long current_episode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long has_updated_episode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long play_vv;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long updated_to_episode;

    public MixStatisStructV2() {
    }

    static final class ProtoAdapter_MixStatisStructV2 extends ProtoAdapter<MixStatisStructV2> {
        static {
            Covode.recordClassIndex(102112);
        }

        public ProtoAdapter_MixStatisStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MixStatisStructV2.class);
        }

        public final int encodedSize(MixStatisStructV2 mixStatisStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, mixStatisStructV2.play_vv) + ProtoAdapter.INT64.encodedSizeWithTag(2, mixStatisStructV2.collect_vv) + ProtoAdapter.INT64.encodedSizeWithTag(3, mixStatisStructV2.current_episode) + ProtoAdapter.INT64.encodedSizeWithTag(4, mixStatisStructV2.updated_to_episode) + ProtoAdapter.INT64.encodedSizeWithTag(5, mixStatisStructV2.has_updated_episode) + mixStatisStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MixStatisStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.play_vv(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.collect_vv(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.current_episode(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.updated_to_episode(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_updated_episode(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MixStatisStructV2 mixStatisStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, mixStatisStructV2.play_vv);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mixStatisStructV2.collect_vv);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mixStatisStructV2.current_episode);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mixStatisStructV2.updated_to_episode);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, mixStatisStructV2.has_updated_episode);
            protoWriter.writeBytes(mixStatisStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102110);
    }

    public static final class Builder extends Message.Builder<MixStatisStructV2, Builder> {
        public Long collect_vv;
        public Long current_episode;
        public Long has_updated_episode;
        public Long play_vv;
        public Long updated_to_episode;

        static {
            Covode.recordClassIndex(102111);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MixStatisStructV2 build() {
            return new MixStatisStructV2(this.play_vv, this.collect_vv, this.current_episode, this.updated_to_episode, this.has_updated_episode, super.buildUnknownFields());
        }

        public final Builder collect_vv(Long l2) {
            this.collect_vv = l2;
            return this;
        }

        public final Builder current_episode(Long l2) {
            this.current_episode = l2;
            return this;
        }

        public final Builder has_updated_episode(Long l2) {
            this.has_updated_episode = l2;
            return this;
        }

        public final Builder play_vv(Long l2) {
            this.play_vv = l2;
            return this;
        }

        public final Builder updated_to_episode(Long l2) {
            this.updated_to_episode = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MixStatisStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MixStatisStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.play_vv = this.play_vv;
        builder.collect_vv = this.collect_vv;
        builder.current_episode = this.current_episode;
        builder.updated_to_episode = this.updated_to_episode;
        builder.has_updated_episode = this.has_updated_episode;
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
        Long l2 = this.play_vv;
        int i7 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Long l3 = this.collect_vv;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Long l4 = this.current_episode;
        if (l4 != null) {
            i4 = l4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        Long l5 = this.updated_to_episode;
        if (l5 != null) {
            i5 = l5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        Long l6 = this.has_updated_episode;
        if (l6 != null) {
            i7 = l6.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.play_vv != null) {
            sb.append(", play_vv=").append(this.play_vv);
        }
        if (this.collect_vv != null) {
            sb.append(", collect_vv=").append(this.collect_vv);
        }
        if (this.current_episode != null) {
            sb.append(", current_episode=").append(this.current_episode);
        }
        if (this.updated_to_episode != null) {
            sb.append(", updated_to_episode=").append(this.updated_to_episode);
        }
        if (this.has_updated_episode != null) {
            sb.append(", has_updated_episode=").append(this.has_updated_episode);
        }
        return sb.replace(0, 2, "MixStatisStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixStatisStructV2)) {
            return false;
        }
        MixStatisStructV2 mixStatisStructV2 = (MixStatisStructV2) obj;
        if (!unknownFields().equals(mixStatisStructV2.unknownFields()) || !Internal.equals(this.play_vv, mixStatisStructV2.play_vv) || !Internal.equals(this.collect_vv, mixStatisStructV2.collect_vv) || !Internal.equals(this.current_episode, mixStatisStructV2.current_episode) || !Internal.equals(this.updated_to_episode, mixStatisStructV2.updated_to_episode) || !Internal.equals(this.has_updated_episode, mixStatisStructV2.has_updated_episode)) {
            return false;
        }
        return true;
    }

    public MixStatisStructV2(Long l2, Long l3, Long l4, Long l5, Long l6) {
        this(l2, l3, l4, l5, l6, i.EMPTY);
    }

    public MixStatisStructV2(Long l2, Long l3, Long l4, Long l5, Long l6, i iVar) {
        super(ADAPTER, iVar);
        this.play_vv = l2;
        this.collect_vv = l3;
        this.current_episode = l4;
        this.updated_to_episode = l5;
        this.has_updated_episode = l6;
    }
}
