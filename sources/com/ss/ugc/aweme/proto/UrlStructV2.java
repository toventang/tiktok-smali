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

public final class UrlStructV2 extends Message<UrlStructV2, Builder> {
    public static final ProtoAdapter<UrlStructV2> ADAPTER = new ProtoAdapter_UrlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long data_size;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String file_cs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String file_hash;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String player_access_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String url_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public List<String> url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer width;

    public UrlStructV2() {
    }

    static final class ProtoAdapter_UrlStructV2 extends ProtoAdapter<UrlStructV2> {
        static {
            Covode.recordClassIndex(102250);
        }

        public ProtoAdapter_UrlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlStructV2.class);
        }

        public final int encodedSize(UrlStructV2 urlStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, urlStructV2.uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, urlStructV2.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, urlStructV2.width) + ProtoAdapter.INT32.encodedSizeWithTag(4, urlStructV2.height) + ProtoAdapter.STRING.encodedSizeWithTag(5, urlStructV2.url_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, urlStructV2.data_size) + ProtoAdapter.STRING.encodedSizeWithTag(7, urlStructV2.file_hash) + ProtoAdapter.STRING.encodedSizeWithTag(8, urlStructV2.file_cs) + ProtoAdapter.STRING.encodedSizeWithTag(9, urlStructV2.player_access_key) + urlStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UrlStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.width(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.height(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.url_key(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.data_size(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.file_hash(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.file_cs(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.player_access_key(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UrlStructV2 urlStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlStructV2.uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, urlStructV2.url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, urlStructV2.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, urlStructV2.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, urlStructV2.url_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, urlStructV2.data_size);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, urlStructV2.file_hash);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, urlStructV2.file_cs);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, urlStructV2.player_access_key);
            protoWriter.writeBytes(urlStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102248);
    }

    public static final class Builder extends Message.Builder<UrlStructV2, Builder> {
        public Long data_size;
        public String file_cs;
        public String file_hash;
        public Integer height;
        public String player_access_key;
        public String uri;
        public String url_key;
        public List<String> url_list = Internal.newMutableList();
        public Integer width;

        static {
            Covode.recordClassIndex(102249);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UrlStructV2 build() {
            return new UrlStructV2(this.uri, this.url_list, this.width, this.height, this.url_key, this.data_size, this.file_hash, this.file_cs, this.player_access_key, super.buildUnknownFields());
        }

        public final Builder data_size(Long l2) {
            this.data_size = l2;
            return this;
        }

        public final Builder file_cs(String str) {
            this.file_cs = str;
            return this;
        }

        public final Builder file_hash(String str) {
            this.file_hash = str;
            return this;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder player_access_key(String str) {
            this.player_access_key = str;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url_key(String str) {
            this.url_key = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder url_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UrlStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UrlStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uri = this.uri;
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.width = this.width;
        builder.height = this.height;
        builder.url_key = this.url_key;
        builder.data_size = this.data_size;
        builder.file_hash = this.file_hash;
        builder.file_cs = this.file_cs;
        builder.player_access_key = this.player_access_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.uri;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((hashCode + i2) * 37) + this.url_list.hashCode()) * 37;
        Integer num = this.width;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (hashCode2 + i3) * 37;
        Integer num2 = this.height;
        if (num2 != null) {
            i4 = num2.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        String str2 = this.url_key;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        Long l2 = this.data_size;
        if (l2 != null) {
            i6 = l2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        String str3 = this.file_hash;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        String str4 = this.file_cs;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i16 = (i15 + i8) * 37;
        String str5 = this.player_access_key;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        int i17 = i16 + i10;
        this.hashCode = i17;
        return i17;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=").append(this.uri);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=").append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=").append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=").append(this.height);
        }
        if (this.url_key != null) {
            sb.append(", url_key=").append(this.url_key);
        }
        if (this.data_size != null) {
            sb.append(", data_size=").append(this.data_size);
        }
        if (this.file_hash != null) {
            sb.append(", file_hash=").append(this.file_hash);
        }
        if (this.file_cs != null) {
            sb.append(", file_cs=").append(this.file_cs);
        }
        if (this.player_access_key != null) {
            sb.append(", player_access_key=").append(this.player_access_key);
        }
        return sb.replace(0, 2, "UrlStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UrlStructV2)) {
            return false;
        }
        UrlStructV2 urlStructV2 = (UrlStructV2) obj;
        if (!unknownFields().equals(urlStructV2.unknownFields()) || !Internal.equals(this.uri, urlStructV2.uri) || !this.url_list.equals(urlStructV2.url_list) || !Internal.equals(this.width, urlStructV2.width) || !Internal.equals(this.height, urlStructV2.height) || !Internal.equals(this.url_key, urlStructV2.url_key) || !Internal.equals(this.data_size, urlStructV2.data_size) || !Internal.equals(this.file_hash, urlStructV2.file_hash) || !Internal.equals(this.file_cs, urlStructV2.file_cs) || !Internal.equals(this.player_access_key, urlStructV2.player_access_key)) {
            return false;
        }
        return true;
    }

    public UrlStructV2(String str, List<String> list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5) {
        this(str, list, num, num2, str2, l2, str3, str4, str5, i.EMPTY);
    }

    public UrlStructV2(String str, List<String> list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5, i iVar) {
        super(ADAPTER, iVar);
        this.uri = str;
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.data_size = l2;
        this.file_hash = str3;
        this.file_cs = str4;
        this.player_access_key = str5;
    }
}
