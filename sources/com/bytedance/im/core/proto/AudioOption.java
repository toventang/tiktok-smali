package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class AudioOption extends Message<AudioOption, Builder> {
    public static final ProtoAdapter<AudioOption> ADAPTER = new ProtoAdapter_AudioOption();
    private static final long serialVersionUID = 0;
    @c(a = "urls")
    public final List<String> urls;
    @c(a = "vid")
    public final String vid;

    static final class ProtoAdapter_AudioOption extends ProtoAdapter<AudioOption> {
        static {
            Covode.recordClassIndex(23194);
        }

        public ProtoAdapter_AudioOption() {
            super(FieldEncoding.LENGTH_DELIMITED, AudioOption.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.AudioOption$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.AudioOption redact(com.bytedance.im.core.proto.AudioOption r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.AudioOption$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.AudioOption r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.AudioOption.ProtoAdapter_AudioOption.redact(com.bytedance.im.core.proto.AudioOption):com.bytedance.im.core.proto.AudioOption");
        }

        public final int encodedSize(AudioOption audioOption) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, audioOption.vid) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(100, audioOption.urls) + audioOption.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AudioOption decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.vid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 100) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.urls.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AudioOption audioOption) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, audioOption.vid);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 100, audioOption.urls);
            protoWriter.writeBytes(audioOption.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AudioOption, Builder> {
        public List<String> urls = Internal.newMutableList();
        public String vid;

        static {
            Covode.recordClassIndex(23193);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AudioOption build() {
            return new AudioOption(this.vid, this.urls, super.buildUnknownFields());
        }

        public final Builder vid(String str) {
            this.vid = str;
            return this;
        }

        public final Builder urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.urls = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23192);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.AudioOption$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AudioOption, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.vid = this.vid;
        builder.urls = Internal.copyOf("urls", this.urls);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "AudioOption" + h.f38770a.b(this).toString();
    }

    public AudioOption(String str, List<String> list) {
        this(str, list, i.EMPTY);
    }

    public AudioOption(String str, List<String> list, i iVar) {
        super(ADAPTER, iVar);
        this.vid = str;
        this.urls = Internal.immutableCopyOf("urls", list);
    }
}
