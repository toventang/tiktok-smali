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

public final class AwemeActivityStructV2 extends Message<AwemeActivityStructV2, Builder> {
    public static final ProtoAdapter<AwemeActivityStructV2> ADAPTER = new ProtoAdapter_AwemeActivityStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String activity_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TextContentStructV2#ADAPTER", tag = 4)
    public TextContentStructV2 content;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ActivityButtonStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public ActivityButtonStructV2 primary_btn;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String schema_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long show_delay_time;

    public AwemeActivityStructV2() {
    }

    static final class ProtoAdapter_AwemeActivityStructV2 extends ProtoAdapter<AwemeActivityStructV2> {
        static {
            Covode.recordClassIndex(101881);
        }

        public ProtoAdapter_AwemeActivityStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeActivityStructV2.class);
        }

        public final int encodedSize(AwemeActivityStructV2 awemeActivityStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeActivityStructV2.activity_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, awemeActivityStructV2.show_delay_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeActivityStructV2.schema_url) + TextContentStructV2.ADAPTER.encodedSizeWithTag(4, awemeActivityStructV2.content) + ActivityButtonStructV2.ADAPTER.encodedSizeWithTag(5, awemeActivityStructV2.primary_btn) + awemeActivityStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeActivityStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.activity_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.show_delay_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.content(TextContentStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.primary_btn(ActivityButtonStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeActivityStructV2 awemeActivityStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeActivityStructV2.activity_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, awemeActivityStructV2.show_delay_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeActivityStructV2.schema_url);
            TextContentStructV2.ADAPTER.encodeWithTag(protoWriter, 4, awemeActivityStructV2.content);
            ActivityButtonStructV2.ADAPTER.encodeWithTag(protoWriter, 5, awemeActivityStructV2.primary_btn);
            protoWriter.writeBytes(awemeActivityStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101879);
    }

    public static final class Builder extends Message.Builder<AwemeActivityStructV2, Builder> {
        public String activity_id;
        public TextContentStructV2 content;
        public ActivityButtonStructV2 primary_btn;
        public String schema_url;
        public Long show_delay_time;

        static {
            Covode.recordClassIndex(101880);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeActivityStructV2 build() {
            return new AwemeActivityStructV2(this.activity_id, this.show_delay_time, this.schema_url, this.content, this.primary_btn, super.buildUnknownFields());
        }

        public final Builder activity_id(String str) {
            this.activity_id = str;
            return this;
        }

        public final Builder content(TextContentStructV2 textContentStructV2) {
            this.content = textContentStructV2;
            return this;
        }

        public final Builder primary_btn(ActivityButtonStructV2 activityButtonStructV2) {
            this.primary_btn = activityButtonStructV2;
            return this;
        }

        public final Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        public final Builder show_delay_time(Long l2) {
            this.show_delay_time = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeActivityStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeActivityStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.activity_id = this.activity_id;
        builder.show_delay_time = this.show_delay_time;
        builder.schema_url = this.schema_url;
        builder.content = this.content;
        builder.primary_btn = this.primary_btn;
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
        String str = this.activity_id;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Long l2 = this.show_delay_time;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str2 = this.schema_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        TextContentStructV2 textContentStructV2 = this.content;
        if (textContentStructV2 != null) {
            i5 = textContentStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        ActivityButtonStructV2 activityButtonStructV2 = this.primary_btn;
        if (activityButtonStructV2 != null) {
            i7 = activityButtonStructV2.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.activity_id != null) {
            sb.append(", activity_id=").append(this.activity_id);
        }
        if (this.show_delay_time != null) {
            sb.append(", show_delay_time=").append(this.show_delay_time);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(this.schema_url);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        if (this.primary_btn != null) {
            sb.append(", primary_btn=").append(this.primary_btn);
        }
        return sb.replace(0, 2, "AwemeActivityStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeActivityStructV2)) {
            return false;
        }
        AwemeActivityStructV2 awemeActivityStructV2 = (AwemeActivityStructV2) obj;
        if (!unknownFields().equals(awemeActivityStructV2.unknownFields()) || !Internal.equals(this.activity_id, awemeActivityStructV2.activity_id) || !Internal.equals(this.show_delay_time, awemeActivityStructV2.show_delay_time) || !Internal.equals(this.schema_url, awemeActivityStructV2.schema_url) || !Internal.equals(this.content, awemeActivityStructV2.content) || !Internal.equals(this.primary_btn, awemeActivityStructV2.primary_btn)) {
            return false;
        }
        return true;
    }

    public AwemeActivityStructV2(String str, Long l2, String str2, TextContentStructV2 textContentStructV2, ActivityButtonStructV2 activityButtonStructV2) {
        this(str, l2, str2, textContentStructV2, activityButtonStructV2, i.EMPTY);
    }

    public AwemeActivityStructV2(String str, Long l2, String str2, TextContentStructV2 textContentStructV2, ActivityButtonStructV2 activityButtonStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.activity_id = str;
        this.show_delay_time = l2;
        this.schema_url = str2;
        this.content = textContentStructV2;
        this.primary_btn = activityButtonStructV2;
    }
}
