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

/* access modifiers changed from: package-private */
public final class StarAtlasLinkStructV2 extends Message<StarAtlasLinkStructV2, Builder> {
    public static final ProtoAdapter<StarAtlasLinkStructV2> ADAPTER = new ProtoAdapter_StarAtlasLinkStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public UrlStructV2 avatar_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String sub_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String web_url;

    static final class ProtoAdapter_StarAtlasLinkStructV2 extends ProtoAdapter<StarAtlasLinkStructV2> {
        static {
            Covode.recordClassIndex(102217);
        }

        public ProtoAdapter_StarAtlasLinkStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StarAtlasLinkStructV2.class);
        }

        public final int encodedSize(StarAtlasLinkStructV2 starAtlasLinkStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, starAtlasLinkStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, starAtlasLinkStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, starAtlasLinkStructV2.sub_title) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, starAtlasLinkStructV2.avatar_icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, starAtlasLinkStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, starAtlasLinkStructV2.open_url) + starAtlasLinkStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StarAtlasLinkStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.sub_title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.avatar_icon(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.web_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.open_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StarAtlasLinkStructV2 starAtlasLinkStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, starAtlasLinkStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, starAtlasLinkStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, starAtlasLinkStructV2.sub_title);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, starAtlasLinkStructV2.avatar_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, starAtlasLinkStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, starAtlasLinkStructV2.open_url);
            protoWriter.writeBytes(starAtlasLinkStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102215);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.StarAtlasLinkStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StarAtlasLinkStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.title = this.title;
        builder.sub_title = this.sub_title;
        builder.avatar_icon = this.avatar_icon;
        builder.web_url = this.web_url;
        builder.open_url = this.open_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<StarAtlasLinkStructV2, Builder> {
        public UrlStructV2 avatar_icon;
        public String id;
        public String open_url;
        public String sub_title;
        public String title;
        public String web_url;

        static {
            Covode.recordClassIndex(102216);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StarAtlasLinkStructV2 build() {
            String str = this.id;
            if (str != null && this.title != null && this.sub_title != null && this.avatar_icon != null) {
                return new StarAtlasLinkStructV2(this.id, this.title, this.sub_title, this.avatar_icon, this.web_url, this.open_url, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.title, "title", this.sub_title, "sub_title", this.avatar_icon, "avatar_icon");
        }

        public final Builder avatar_icon(UrlStructV2 urlStructV2) {
            this.avatar_icon = urlStructV2;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder sub_title(String str) {
            this.sub_title = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.sub_title.hashCode()) * 37) + this.avatar_icon.hashCode()) * 37;
        String str = this.web_url;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str2 = this.open_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=").append(this.id);
        sb.append(", title=").append(this.title);
        sb.append(", sub_title=").append(this.sub_title);
        sb.append(", avatar_icon=").append(this.avatar_icon);
        if (this.web_url != null) {
            sb.append(", web_url=").append(this.web_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=").append(this.open_url);
        }
        return sb.replace(0, 2, "StarAtlasLinkStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StarAtlasLinkStructV2)) {
            return false;
        }
        StarAtlasLinkStructV2 starAtlasLinkStructV2 = (StarAtlasLinkStructV2) obj;
        if (!unknownFields().equals(starAtlasLinkStructV2.unknownFields()) || !this.id.equals(starAtlasLinkStructV2.id) || !this.title.equals(starAtlasLinkStructV2.title) || !this.sub_title.equals(starAtlasLinkStructV2.sub_title) || !this.avatar_icon.equals(starAtlasLinkStructV2.avatar_icon) || !Internal.equals(this.web_url, starAtlasLinkStructV2.web_url) || !Internal.equals(this.open_url, starAtlasLinkStructV2.open_url)) {
            return false;
        }
        return true;
    }

    public StarAtlasLinkStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, String str5) {
        this(str, str2, str3, urlStructV2, str4, str5, i.EMPTY);
    }

    public StarAtlasLinkStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, String str5, i iVar) {
        super(ADAPTER, iVar);
        this.id = str;
        this.title = str2;
        this.sub_title = str3;
        this.avatar_icon = urlStructV2;
        this.web_url = str4;
        this.open_url = str5;
    }
}
