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

public final class VideoOption extends Message<VideoOption, Builder> {
    public static final ProtoAdapter<VideoOption> ADAPTER = new ProtoAdapter_VideoOption();
    private static final long serialVersionUID = 0;
    @c(a = "cover_uri")
    public final String cover_uri;
    @c(a = "cover_urls")
    public final List<String> cover_urls;
    @c(a = "urls")
    public final List<String> urls;
    @c(a = "vid")
    public final String vid;

    static final class ProtoAdapter_VideoOption extends ProtoAdapter<VideoOption> {
        static {
            Covode.recordClassIndex(23826);
        }

        public ProtoAdapter_VideoOption() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoOption.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.VideoOption$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.VideoOption redact(com.bytedance.im.core.proto.VideoOption r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.VideoOption$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.VideoOption r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.VideoOption.ProtoAdapter_VideoOption.redact(com.bytedance.im.core.proto.VideoOption):com.bytedance.im.core.proto.VideoOption");
        }

        public final int encodedSize(VideoOption videoOption) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoOption.vid) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoOption.cover_uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(100, videoOption.urls) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, videoOption.cover_urls) + videoOption.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoOption decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.vid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.cover_uri(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 100) {
                    builder.urls.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cover_urls.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoOption videoOption) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoOption.vid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoOption.cover_uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 100, videoOption.urls);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, videoOption.cover_urls);
            protoWriter.writeBytes(videoOption.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23824);
    }

    public static final class Builder extends Message.Builder<VideoOption, Builder> {
        public String cover_uri;
        public List<String> cover_urls = Internal.newMutableList();
        public List<String> urls = Internal.newMutableList();
        public String vid;

        static {
            Covode.recordClassIndex(23825);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoOption build() {
            return new VideoOption(this.vid, this.cover_uri, this.urls, this.cover_urls, super.buildUnknownFields());
        }

        public final Builder cover_uri(String str) {
            this.cover_uri = str;
            return this;
        }

        public final Builder vid(String str) {
            this.vid = str;
            return this;
        }

        public final Builder cover_urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.cover_urls = list;
            return this;
        }

        public final Builder urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.urls = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "VideoOption" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.VideoOption$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoOption, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.vid = this.vid;
        builder.cover_uri = this.cover_uri;
        builder.urls = Internal.copyOf("urls", this.urls);
        builder.cover_urls = Internal.copyOf("cover_urls", this.cover_urls);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public VideoOption(String str, String str2, List<String> list, List<String> list2) {
        this(str, str2, list, list2, i.EMPTY);
    }

    public VideoOption(String str, String str2, List<String> list, List<String> list2, i iVar) {
        super(ADAPTER, iVar);
        this.vid = str;
        this.cover_uri = str2;
        this.urls = Internal.immutableCopyOf("urls", list);
        this.cover_urls = Internal.immutableCopyOf("cover_urls", list2);
    }
}
