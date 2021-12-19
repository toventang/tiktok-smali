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

public final class PropertyItemList extends Message<PropertyItemList, Builder> {
    public static final ProtoAdapter<PropertyItemList> ADAPTER = new ProtoAdapter_PropertyItemList();
    private static final long serialVersionUID = 0;
    @c(a = "Items")
    public final List<PropertyItem> Items;

    static final class ProtoAdapter_PropertyItemList extends ProtoAdapter<PropertyItemList> {
        static {
            Covode.recordClassIndex(23697);
        }

        public ProtoAdapter_PropertyItemList() {
            super(FieldEncoding.LENGTH_DELIMITED, PropertyItemList.class);
        }

        public final int encodedSize(PropertyItemList propertyItemList) {
            return PropertyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, propertyItemList.Items) + propertyItemList.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.PropertyItemList$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PropertyItemList redact(com.bytedance.im.core.proto.PropertyItemList r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PropertyItemList$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.PropertyItem> r1 = r2.Items
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.PropertyItem> r0 = com.bytedance.im.core.proto.PropertyItem.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PropertyItemList r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PropertyItemList.ProtoAdapter_PropertyItemList.redact(com.bytedance.im.core.proto.PropertyItemList):com.bytedance.im.core.proto.PropertyItemList");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PropertyItemList decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.Items.add(PropertyItem.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PropertyItemList propertyItemList) {
            PropertyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, propertyItemList.Items);
            protoWriter.writeBytes(propertyItemList.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PropertyItemList, Builder> {
        public List<PropertyItem> Items = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23696);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PropertyItemList build() {
            return new PropertyItemList(this.Items, super.buildUnknownFields());
        }

        public final Builder Items(List<PropertyItem> list) {
            Internal.checkElementsNotNull(list);
            this.Items = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23695);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PropertyItemList$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PropertyItemList, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.Items = Internal.copyOf("Items", this.Items);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PropertyItemList" + h.f38770a.b(this).toString();
    }

    public PropertyItemList(List<PropertyItem> list) {
        this(list, i.EMPTY);
    }

    public PropertyItemList(List<PropertyItem> list, i iVar) {
        super(ADAPTER, iVar);
        this.Items = Internal.immutableCopyOf("Items", list);
    }
}
