package tiktok.kids.proto;

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

public final class PlayTokenAuthStructV2 extends Message<PlayTokenAuthStructV2, Builder> {
    public static final ProtoAdapter<PlayTokenAuthStructV2> ADAPTER = new ProtoAdapter_PlayTokenAuthStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String auth;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public List<String> hosts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String tv_token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String vid;

    public PlayTokenAuthStructV2() {
    }

    static final class ProtoAdapter_PlayTokenAuthStructV2 extends ProtoAdapter<PlayTokenAuthStructV2> {
        static {
            Covode.recordClassIndex(106758);
        }

        public ProtoAdapter_PlayTokenAuthStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PlayTokenAuthStructV2.class);
        }

        public final int encodedSize(PlayTokenAuthStructV2 playTokenAuthStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, playTokenAuthStructV2.vid) + ProtoAdapter.STRING.encodedSizeWithTag(2, playTokenAuthStructV2.token) + ProtoAdapter.STRING.encodedSizeWithTag(3, playTokenAuthStructV2.auth) + ProtoAdapter.STRING.encodedSizeWithTag(4, playTokenAuthStructV2.tv_token) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, playTokenAuthStructV2.hosts) + playTokenAuthStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PlayTokenAuthStructV2 decode(ProtoReader protoReader) {
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
                    builder.token(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.auth(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.tv_token(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.hosts.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PlayTokenAuthStructV2 playTokenAuthStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, playTokenAuthStructV2.vid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, playTokenAuthStructV2.token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, playTokenAuthStructV2.auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, playTokenAuthStructV2.tv_token);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, playTokenAuthStructV2.hosts);
            protoWriter.writeBytes(playTokenAuthStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106756);
    }

    public static final class Builder extends Message.Builder<PlayTokenAuthStructV2, Builder> {
        public String auth;
        public List<String> hosts = Internal.newMutableList();
        public String token;
        public String tv_token;
        public String vid;

        static {
            Covode.recordClassIndex(106757);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PlayTokenAuthStructV2 build() {
            return new PlayTokenAuthStructV2(this.vid, this.token, this.auth, this.tv_token, this.hosts, super.buildUnknownFields());
        }

        public final Builder auth(String str) {
            this.auth = str;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }

        public final Builder tv_token(String str) {
            this.tv_token = str;
            return this;
        }

        public final Builder vid(String str) {
            this.vid = str;
            return this;
        }

        public final Builder hosts(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.hosts = list;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.PlayTokenAuthStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PlayTokenAuthStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.vid = this.vid;
        builder.token = this.token;
        builder.auth = this.auth;
        builder.tv_token = this.tv_token;
        builder.hosts = Internal.copyOf("hosts", this.hosts);
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
        String str = this.vid;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str2 = this.token;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str3 = this.auth;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str4 = this.tv_token;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        int hashCode2 = ((i9 + i6) * 37) + this.hosts.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vid != null) {
            sb.append(", vid=").append(this.vid);
        }
        if (this.token != null) {
            sb.append(", token=").append(this.token);
        }
        if (this.auth != null) {
            sb.append(", auth=").append(this.auth);
        }
        if (this.tv_token != null) {
            sb.append(", tv_token=").append(this.tv_token);
        }
        if (!this.hosts.isEmpty()) {
            sb.append(", hosts=").append(this.hosts);
        }
        return sb.replace(0, 2, "PlayTokenAuthStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayTokenAuthStructV2)) {
            return false;
        }
        PlayTokenAuthStructV2 playTokenAuthStructV2 = (PlayTokenAuthStructV2) obj;
        if (!unknownFields().equals(playTokenAuthStructV2.unknownFields()) || !Internal.equals(this.vid, playTokenAuthStructV2.vid) || !Internal.equals(this.token, playTokenAuthStructV2.token) || !Internal.equals(this.auth, playTokenAuthStructV2.auth) || !Internal.equals(this.tv_token, playTokenAuthStructV2.tv_token) || !this.hosts.equals(playTokenAuthStructV2.hosts)) {
            return false;
        }
        return true;
    }

    public PlayTokenAuthStructV2(String str, String str2, String str3, String str4, List<String> list) {
        this(str, str2, str3, str4, list, i.EMPTY);
    }

    public PlayTokenAuthStructV2(String str, String str2, String str3, String str4, List<String> list, i iVar) {
        super(ADAPTER, iVar);
        this.vid = str;
        this.token = str2;
        this.auth = str3;
        this.tv_token = str4;
        this.hosts = Internal.immutableCopyOf("hosts", list);
    }
}
