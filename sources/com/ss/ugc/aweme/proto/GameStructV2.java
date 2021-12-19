package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class GameStructV2 extends Message<GameStructV2, Builder> {
    public static final ProtoAdapter<GameStructV2> ADAPTER = new ProtoAdapter_GameStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer game_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer game_type;

    public GameStructV2() {
    }

    static final class ProtoAdapter_GameStructV2 extends ProtoAdapter<GameStructV2> {
        static {
            Covode.recordClassIndex(102016);
        }

        public ProtoAdapter_GameStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, GameStructV2.class);
        }

        public final int encodedSize(GameStructV2 gameStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, gameStructV2.game_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, gameStructV2.game_score) + gameStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GameStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.game_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.game_score(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GameStructV2 gameStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, gameStructV2.game_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, gameStructV2.game_score);
            protoWriter.writeBytes(gameStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GameStructV2, Builder> {
        public Integer game_score;
        public Integer game_type;

        static {
            Covode.recordClassIndex(102015);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GameStructV2 build() {
            return new GameStructV2(this.game_type, this.game_score, super.buildUnknownFields());
        }

        public final Builder game_score(Integer num) {
            this.game_score = num;
            return this;
        }

        public final Builder game_type(Integer num) {
            this.game_type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102014);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.GameStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GameStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.game_type = this.game_type;
        builder.game_score = this.game_score;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.game_type;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num2 = this.game_score;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.game_type != null) {
            sb.append(", game_type=").append(this.game_type);
        }
        if (this.game_score != null) {
            sb.append(", game_score=").append(this.game_score);
        }
        return sb.replace(0, 2, "GameStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameStructV2)) {
            return false;
        }
        GameStructV2 gameStructV2 = (GameStructV2) obj;
        if (!unknownFields().equals(gameStructV2.unknownFields()) || !Internal.equals(this.game_type, gameStructV2.game_type) || !Internal.equals(this.game_score, gameStructV2.game_score)) {
            return false;
        }
        return true;
    }

    public GameStructV2(Integer num, Integer num2) {
        this(num, num2, i.EMPTY);
    }

    public GameStructV2(Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.game_type = num;
        this.game_score = num2;
    }
}
