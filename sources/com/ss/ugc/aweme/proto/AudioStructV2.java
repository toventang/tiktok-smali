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

public final class AudioStructV2 extends Message<AudioStructV2, Builder> {
    public static final ProtoAdapter<AudioStructV2> ADAPTER = new ProtoAdapter_AudioStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long CdnUrlExpired;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TtsAudioStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<TtsAudioStructV2> TtsInfos;

    public AudioStructV2() {
    }

    static final class ProtoAdapter_AudioStructV2 extends ProtoAdapter<AudioStructV2> {
        static {
            Covode.recordClassIndex(101866);
        }

        public ProtoAdapter_AudioStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AudioStructV2.class);
        }

        public final int encodedSize(AudioStructV2 audioStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, audioStructV2.CdnUrlExpired) + TtsAudioStructV2.ADAPTER.asRepeated().encodedSizeWithTag(2, audioStructV2.TtsInfos) + audioStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AudioStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.CdnUrlExpired(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.TtsInfos.add(TtsAudioStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AudioStructV2 audioStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, audioStructV2.CdnUrlExpired);
            TtsAudioStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, audioStructV2.TtsInfos);
            protoWriter.writeBytes(audioStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AudioStructV2, Builder> {
        public Long CdnUrlExpired;
        public List<TtsAudioStructV2> TtsInfos = Internal.newMutableList();

        static {
            Covode.recordClassIndex(101865);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AudioStructV2 build() {
            return new AudioStructV2(this.CdnUrlExpired, this.TtsInfos, super.buildUnknownFields());
        }

        public final Builder CdnUrlExpired(Long l2) {
            this.CdnUrlExpired = l2;
            return this;
        }

        public final Builder TtsInfos(List<TtsAudioStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.TtsInfos = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101864);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AudioStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AudioStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.CdnUrlExpired = this.CdnUrlExpired;
        builder.TtsInfos = Internal.copyOf("TtsInfos", this.TtsInfos);
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
        Long l2 = this.CdnUrlExpired;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = ((hashCode + i2) * 37) + this.TtsInfos.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.CdnUrlExpired != null) {
            sb.append(", CdnUrlExpired=").append(this.CdnUrlExpired);
        }
        if (!this.TtsInfos.isEmpty()) {
            sb.append(", TtsInfos=").append(this.TtsInfos);
        }
        return sb.replace(0, 2, "AudioStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStructV2)) {
            return false;
        }
        AudioStructV2 audioStructV2 = (AudioStructV2) obj;
        if (!unknownFields().equals(audioStructV2.unknownFields()) || !Internal.equals(this.CdnUrlExpired, audioStructV2.CdnUrlExpired) || !this.TtsInfos.equals(audioStructV2.TtsInfos)) {
            return false;
        }
        return true;
    }

    public AudioStructV2(Long l2, List<TtsAudioStructV2> list) {
        this(l2, list, i.EMPTY);
    }

    public AudioStructV2(Long l2, List<TtsAudioStructV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.CdnUrlExpired = l2;
        this.TtsInfos = Internal.immutableCopyOf("TtsInfos", list);
    }
}
