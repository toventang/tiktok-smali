package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class PropertyItem extends Message<PropertyItem, Builder> {
    public static final ProtoAdapter<PropertyItem> ADAPTER = new ProtoAdapter_PropertyItem();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_UID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "create_time")
    public final Long create_time;
    @c(a = "idempotent_id")
    public final String idempotent_id;
    @c(a = "sec_uid")
    public final String sec_uid;
    @c(a = "uid")
    public final Long uid;
    @c(a = "value")
    public final String value;

    static final class ProtoAdapter_PropertyItem extends ProtoAdapter<PropertyItem> {
        static {
            Covode.recordClassIndex(23694);
        }

        public ProtoAdapter_PropertyItem() {
            super(FieldEncoding.LENGTH_DELIMITED, PropertyItem.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.PropertyItem$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PropertyItem redact(com.bytedance.im.core.proto.PropertyItem r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.PropertyItem$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.PropertyItem r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PropertyItem.ProtoAdapter_PropertyItem.redact(com.bytedance.im.core.proto.PropertyItem):com.bytedance.im.core.proto.PropertyItem");
        }

        public final int encodedSize(PropertyItem propertyItem) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, propertyItem.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, propertyItem.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, propertyItem.create_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, propertyItem.idempotent_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, propertyItem.value) + propertyItem.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItem decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.uid(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.idempotent_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.value(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PropertyItem propertyItem) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, propertyItem.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, propertyItem.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, propertyItem.create_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, propertyItem.idempotent_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, propertyItem.value);
            protoWriter.writeBytes(propertyItem.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PropertyItem, Builder> {
        public Long create_time;
        public String idempotent_id;
        public String sec_uid;
        public Long uid;
        public String value;

        static {
            Covode.recordClassIndex(23693);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PropertyItem build() {
            return new PropertyItem(this.uid, this.sec_uid, this.create_time, this.idempotent_id, this.value, super.buildUnknownFields());
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(Long l2) {
            this.uid = l2;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23692);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PropertyItem" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PropertyItem$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PropertyItem, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.sec_uid = this.sec_uid;
        builder.create_time = this.create_time;
        builder.idempotent_id = this.idempotent_id;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PropertyItem(Long l2, String str, Long l3, String str2, String str3) {
        this(l2, str, l3, str2, str3, i.EMPTY);
    }

    public PropertyItem(Long l2, String str, Long l3, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.uid = l2;
        this.sec_uid = str;
        this.create_time = l3;
        this.idempotent_id = str2;
        this.value = str3;
    }
}
