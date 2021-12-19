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
import java.util.List;
import k.i;

public final class AutoVideoCaptionStructV2 extends Message<AutoVideoCaptionStructV2, Builder> {
    public static final ProtoAdapter<AutoVideoCaptionStructV2> ADAPTER = new ProtoAdapter_AutoVideoCaptionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String audio_uri;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AutoCaptionTypeV2#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<AutoCaptionTypeV2> auto_captions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long disable;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer location;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UtteranceV2#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<UtteranceV2> utterances;

    public AutoVideoCaptionStructV2() {
    }

    static final class ProtoAdapter_AutoVideoCaptionStructV2 extends ProtoAdapter<AutoVideoCaptionStructV2> {
        static {
            Covode.recordClassIndex(101872);
        }

        public ProtoAdapter_AutoVideoCaptionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AutoVideoCaptionStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AutoVideoCaptionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.location(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.audio_uri(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.utterances.add(UtteranceV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.auto_captions.add(AutoCaptionTypeV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.disable(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final int encodedSize(AutoVideoCaptionStructV2 autoVideoCaptionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, autoVideoCaptionStructV2.location) + ProtoAdapter.STRING.encodedSizeWithTag(2, autoVideoCaptionStructV2.audio_uri) + UtteranceV2.ADAPTER.asRepeated().encodedSizeWithTag(3, autoVideoCaptionStructV2.utterances) + AutoCaptionTypeV2.ADAPTER.asRepeated().encodedSizeWithTag(4, autoVideoCaptionStructV2.auto_captions) + ProtoAdapter.INT64.encodedSizeWithTag(5, autoVideoCaptionStructV2.disable) + autoVideoCaptionStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AutoVideoCaptionStructV2 autoVideoCaptionStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, autoVideoCaptionStructV2.location);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, autoVideoCaptionStructV2.audio_uri);
            UtteranceV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, autoVideoCaptionStructV2.utterances);
            AutoCaptionTypeV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, autoVideoCaptionStructV2.auto_captions);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, autoVideoCaptionStructV2.disable);
            protoWriter.writeBytes(autoVideoCaptionStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101870);
    }

    public static final class Builder extends Message.Builder<AutoVideoCaptionStructV2, Builder> {
        public String audio_uri;
        public List<AutoCaptionTypeV2> auto_captions = Internal.newMutableList();
        public Long disable;
        public Integer location;
        public List<UtteranceV2> utterances = Internal.newMutableList();

        static {
            Covode.recordClassIndex(101871);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AutoVideoCaptionStructV2 build() {
            return new AutoVideoCaptionStructV2(this.location, this.audio_uri, this.utterances, this.auto_captions, this.disable, super.buildUnknownFields());
        }

        public final Builder audio_uri(String str) {
            this.audio_uri = str;
            return this;
        }

        public final Builder disable(Long l2) {
            this.disable = l2;
            return this;
        }

        public final Builder location(Integer num) {
            this.location = num;
            return this;
        }

        public final Builder auto_captions(List<AutoCaptionTypeV2> list) {
            Internal.checkElementsNotNull(list);
            this.auto_captions = list;
            return this;
        }

        public final Builder utterances(List<UtteranceV2> list) {
            Internal.checkElementsNotNull(list);
            this.utterances = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AutoVideoCaptionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AutoVideoCaptionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.location = this.location;
        builder.audio_uri = this.audio_uri;
        builder.utterances = Internal.copyOf("utterances", this.utterances);
        builder.auto_captions = Internal.copyOf("auto_captions", this.auto_captions);
        builder.disable = this.disable;
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
        Integer num = this.location;
        int i5 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.audio_uri;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((((i6 + i3) * 37) + this.utterances.hashCode()) * 37) + this.auto_captions.hashCode()) * 37;
        Long l2 = this.disable;
        if (l2 != null) {
            i5 = l2.hashCode();
        }
        int i7 = hashCode2 + i5;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.location != null) {
            sb.append(", location=").append(this.location);
        }
        if (this.audio_uri != null) {
            sb.append(", audio_uri=").append(this.audio_uri);
        }
        if (!this.utterances.isEmpty()) {
            sb.append(", utterances=").append(this.utterances);
        }
        if (!this.auto_captions.isEmpty()) {
            sb.append(", auto_captions=").append(this.auto_captions);
        }
        if (this.disable != null) {
            sb.append(", disable=").append(this.disable);
        }
        return sb.replace(0, 2, "AutoVideoCaptionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoVideoCaptionStructV2)) {
            return false;
        }
        AutoVideoCaptionStructV2 autoVideoCaptionStructV2 = (AutoVideoCaptionStructV2) obj;
        if (!unknownFields().equals(autoVideoCaptionStructV2.unknownFields()) || !Internal.equals(this.location, autoVideoCaptionStructV2.location) || !Internal.equals(this.audio_uri, autoVideoCaptionStructV2.audio_uri) || !this.utterances.equals(autoVideoCaptionStructV2.utterances) || !this.auto_captions.equals(autoVideoCaptionStructV2.auto_captions) || !Internal.equals(this.disable, autoVideoCaptionStructV2.disable)) {
            return false;
        }
        return true;
    }

    public AutoVideoCaptionStructV2(Integer num, String str, List<UtteranceV2> list, List<AutoCaptionTypeV2> list2, Long l2) {
        this(num, str, list, list2, l2, i.EMPTY);
    }

    public AutoVideoCaptionStructV2(Integer num, String str, List<UtteranceV2> list, List<AutoCaptionTypeV2> list2, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.location = num;
        this.audio_uri = str;
        this.utterances = Internal.immutableCopyOf("utterances", list);
        this.auto_captions = Internal.immutableCopyOf("auto_captions", list2);
        this.disable = l2;
    }
}
