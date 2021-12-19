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

public final class CommerceConfigDataV2 extends Message<CommerceConfigDataV2, Builder> {
    public static final ProtoAdapter<CommerceConfigDataV2> ADAPTER = new ProtoAdapter_CommerceConfigDataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ItemLikeEggDataV2#ADAPTER", tag = 3)
    public ItemLikeEggDataV2 item_like_egg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer priority;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;

    public CommerceConfigDataV2() {
    }

    static final class ProtoAdapter_CommerceConfigDataV2 extends ProtoAdapter<CommerceConfigDataV2> {
        static {
            Covode.recordClassIndex(101965);
        }

        public ProtoAdapter_CommerceConfigDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceConfigDataV2.class);
        }

        public final int encodedSize(CommerceConfigDataV2 commerceConfigDataV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceConfigDataV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(2, commerceConfigDataV2.priority) + ItemLikeEggDataV2.ADAPTER.encodedSizeWithTag(3, commerceConfigDataV2.item_like_egg) + ProtoAdapter.STRING.encodedSizeWithTag(5, commerceConfigDataV2.data) + commerceConfigDataV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommerceConfigDataV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.priority(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.item_like_egg(ItemLikeEggDataV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.data(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceConfigDataV2 commerceConfigDataV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceConfigDataV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, commerceConfigDataV2.priority);
            ItemLikeEggDataV2.ADAPTER.encodeWithTag(protoWriter, 3, commerceConfigDataV2.item_like_egg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commerceConfigDataV2.data);
            protoWriter.writeBytes(commerceConfigDataV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101963);
    }

    public static final class Builder extends Message.Builder<CommerceConfigDataV2, Builder> {
        public String data;
        public ItemLikeEggDataV2 item_like_egg;
        public Integer priority;
        public Integer type;

        static {
            Covode.recordClassIndex(101964);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommerceConfigDataV2 build() {
            return new CommerceConfigDataV2(this.type, this.priority, this.item_like_egg, this.data, super.buildUnknownFields());
        }

        public final Builder data(String str) {
            this.data = str;
            return this;
        }

        public final Builder item_like_egg(ItemLikeEggDataV2 itemLikeEggDataV2) {
            this.item_like_egg = itemLikeEggDataV2;
            return this;
        }

        public final Builder priority(Integer num) {
            this.priority = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommerceConfigDataV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommerceConfigDataV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.priority = this.priority;
        builder.item_like_egg = this.item_like_egg;
        builder.data = this.data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.type;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Integer num2 = this.priority;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        ItemLikeEggDataV2 itemLikeEggDataV2 = this.item_like_egg;
        if (itemLikeEggDataV2 != null) {
            i4 = itemLikeEggDataV2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str = this.data;
        if (str != null) {
            i6 = str.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.priority != null) {
            sb.append(", priority=").append(this.priority);
        }
        if (this.item_like_egg != null) {
            sb.append(", item_like_egg=").append(this.item_like_egg);
        }
        if (this.data != null) {
            sb.append(", data=").append(this.data);
        }
        return sb.replace(0, 2, "CommerceConfigDataV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceConfigDataV2)) {
            return false;
        }
        CommerceConfigDataV2 commerceConfigDataV2 = (CommerceConfigDataV2) obj;
        if (!unknownFields().equals(commerceConfigDataV2.unknownFields()) || !Internal.equals(this.type, commerceConfigDataV2.type) || !Internal.equals(this.priority, commerceConfigDataV2.priority) || !Internal.equals(this.item_like_egg, commerceConfigDataV2.item_like_egg) || !Internal.equals(this.data, commerceConfigDataV2.data)) {
            return false;
        }
        return true;
    }

    public CommerceConfigDataV2(Integer num, Integer num2, ItemLikeEggDataV2 itemLikeEggDataV2, String str) {
        this(num, num2, itemLikeEggDataV2, str, i.EMPTY);
    }

    public CommerceConfigDataV2(Integer num, Integer num2, ItemLikeEggDataV2 itemLikeEggDataV2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.type = num;
        this.priority = num2;
        this.item_like_egg = itemLikeEggDataV2;
        this.data = str;
    }
}
