package tiktok.kids.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class AwemeStatusStructV2 extends Message<AwemeStatusStructV2, Builder> {
    public static final ProtoAdapter<AwemeStatusStructV2> ADAPTER = new ProtoAdapter_AwemeStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean is_delete;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean is_private;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean is_prohibited;

    public AwemeStatusStructV2() {
    }

    static final class ProtoAdapter_AwemeStatusStructV2 extends ProtoAdapter<AwemeStatusStructV2> {
        static {
            Covode.recordClassIndex(106731);
        }

        public ProtoAdapter_AwemeStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatusStructV2.class);
        }

        public final int encodedSize(AwemeStatusStructV2 awemeStatusStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatusStructV2.aweme_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeStatusStructV2.is_delete) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeStatusStructV2.is_private) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeStatusStructV2.is_prohibited) + awemeStatusStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStatusStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.is_delete(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.is_private(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_prohibited(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeStatusStructV2 awemeStatusStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatusStructV2.aweme_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeStatusStructV2.is_delete);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeStatusStructV2.is_private);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeStatusStructV2.is_prohibited);
            protoWriter.writeBytes(awemeStatusStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106729);
    }

    public static final class Builder extends Message.Builder<AwemeStatusStructV2, Builder> {
        public String aweme_id;
        public Boolean is_delete;
        public Boolean is_private;
        public Boolean is_prohibited;

        static {
            Covode.recordClassIndex(106730);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStatusStructV2 build() {
            return new AwemeStatusStructV2(this.aweme_id, this.is_delete, this.is_private, this.is_prohibited, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder is_delete(Boolean bool) {
            this.is_delete = bool;
            return this;
        }

        public final Builder is_private(Boolean bool) {
            this.is_private = bool;
            return this;
        }

        public final Builder is_prohibited(Boolean bool) {
            this.is_prohibited = bool;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.AwemeStatusStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStatusStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.is_delete = this.is_delete;
        builder.is_private = this.is_private;
        builder.is_prohibited = this.is_prohibited;
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
        String str = this.aweme_id;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Boolean bool = this.is_delete;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Boolean bool2 = this.is_private;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Boolean bool3 = this.is_prohibited;
        if (bool3 != null) {
            i6 = bool3.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.is_delete != null) {
            sb.append(", is_delete=").append(this.is_delete);
        }
        if (this.is_private != null) {
            sb.append(", is_private=").append(this.is_private);
        }
        if (this.is_prohibited != null) {
            sb.append(", is_prohibited=").append(this.is_prohibited);
        }
        return sb.replace(0, 2, "AwemeStatusStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatusStructV2)) {
            return false;
        }
        AwemeStatusStructV2 awemeStatusStructV2 = (AwemeStatusStructV2) obj;
        if (!unknownFields().equals(awemeStatusStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatusStructV2.aweme_id) || !Internal.equals(this.is_delete, awemeStatusStructV2.is_delete) || !Internal.equals(this.is_private, awemeStatusStructV2.is_private) || !Internal.equals(this.is_prohibited, awemeStatusStructV2.is_prohibited)) {
            return false;
        }
        return true;
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, bool, bool2, bool3, i.EMPTY);
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.is_delete = bool;
        this.is_private = bool2;
        this.is_prohibited = bool3;
    }
}
