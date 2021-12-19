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

public final class FileOption extends Message<FileOption, Builder> {
    public static final ProtoAdapter<FileOption> ADAPTER = new ProtoAdapter_FileOption();
    private static final long serialVersionUID = 0;
    @c(a = "urls")
    public final List<String> urls;

    static final class ProtoAdapter_FileOption extends ProtoAdapter<FileOption> {
        static {
            Covode.recordClassIndex(23392);
        }

        public ProtoAdapter_FileOption() {
            super(FieldEncoding.LENGTH_DELIMITED, FileOption.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.FileOption$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.FileOption redact(com.bytedance.im.core.proto.FileOption r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.FileOption$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.FileOption r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.FileOption.ProtoAdapter_FileOption.redact(com.bytedance.im.core.proto.FileOption):com.bytedance.im.core.proto.FileOption");
        }

        public final int encodedSize(FileOption fileOption) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(100, fileOption.urls) + fileOption.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FileOption decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 100) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.urls.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, FileOption fileOption) {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 100, fileOption.urls);
            protoWriter.writeBytes(fileOption.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<FileOption, Builder> {
        public List<String> urls = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23391);
        }

        @Override // com.squareup.wire.Message.Builder
        public final FileOption build() {
            return new FileOption(this.urls, super.buildUnknownFields());
        }

        public final Builder urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.urls = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23390);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.FileOption$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<FileOption, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.urls = Internal.copyOf("urls", this.urls);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "FileOption" + h.f38770a.b(this).toString();
    }

    public FileOption(List<String> list) {
        this(list, i.EMPTY);
    }

    public FileOption(List<String> list, i iVar) {
        super(ADAPTER, iVar);
        this.urls = Internal.immutableCopyOf("urls", list);
    }
}
