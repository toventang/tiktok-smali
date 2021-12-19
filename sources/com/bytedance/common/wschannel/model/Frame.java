package com.bytedance.common.wschannel.model;

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

public final class Frame extends Message<Frame, Builder> {
    public static final ProtoAdapter<Frame> ADAPTER = new ProtoAdapter_Frame();
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_METHOD = 0;
    public static final i DEFAULT_PAYLOAD = i.EMPTY;
    public static final Long DEFAULT_SEQID = 0L;
    public static final Integer DEFAULT_SERVICE = 0;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.article.wschannel.model.Frame$ExtendedEntry#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final List<ExtendedEntry> headers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long logid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer method;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final i payload;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final String payload_encoding;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final String payload_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long seqid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer service;

    public static final class ExtendedEntry extends Message<ExtendedEntry, Builder> {
        public static final ProtoAdapter<ExtendedEntry> ADAPTER = new ProtoAdapter_ExtendedEntry();
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public final String key;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
        public final String value;

        static final class ProtoAdapter_ExtendedEntry extends ProtoAdapter<ExtendedEntry> {
            static {
                Covode.recordClassIndex(16062);
            }

            public ProtoAdapter_ExtendedEntry() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtendedEntry.class);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.common.wschannel.model.Frame$ExtendedEntry$Builder, com.squareup.wire.Message$Builder] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.bytedance.common.wschannel.model.Frame.ExtendedEntry redact(com.bytedance.common.wschannel.model.Frame.ExtendedEntry r2) {
                /*
                    r1 = this;
                    com.bytedance.common.wschannel.model.Frame$ExtendedEntry$Builder r0 = r2.newBuilder()
                    r0.clearUnknownFields()
                    com.bytedance.common.wschannel.model.Frame$ExtendedEntry r0 = r0.build()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.model.Frame.ExtendedEntry.ProtoAdapter_ExtendedEntry.redact(com.bytedance.common.wschannel.model.Frame$ExtendedEntry):com.bytedance.common.wschannel.model.Frame$ExtendedEntry");
            }

            public final int encodedSize(ExtendedEntry extendedEntry) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, extendedEntry.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, extendedEntry.value) + extendedEntry.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final ExtendedEntry decode(ProtoReader protoReader) {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag == 1) {
                        builder.key(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        builder.value(ProtoAdapter.STRING.decode(protoReader));
                    } else {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    }
                }
            }

            public final void encode(ProtoWriter protoWriter, ExtendedEntry extendedEntry) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extendedEntry.key);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extendedEntry.value);
                protoWriter.writeBytes(extendedEntry.unknownFields());
            }
        }

        static {
            Covode.recordClassIndex(16060);
        }

        /* Return type fixed from 'com.bytedance.common.wschannel.model.Frame$ExtendedEntry$Builder' to match base method */
        @Override // com.squareup.wire.Message
        public final Message.Builder<ExtendedEntry, Builder> newBuilder() {
            Builder builder = new Builder();
            builder.key = this.key;
            builder.value = this.value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public static final class Builder extends Message.Builder<ExtendedEntry, Builder> {
            public String key;
            public String value;

            static {
                Covode.recordClassIndex(16061);
            }

            @Override // com.squareup.wire.Message.Builder
            public final ExtendedEntry build() {
                String str = this.key;
                if (str != null && this.value != null) {
                    return new ExtendedEntry(this.key, this.value, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key", this.value, "value");
            }

            public final Builder key(String str) {
                this.key = str;
                return this;
            }

            public final Builder value(String str) {
                this.value = str;
                return this;
            }
        }

        public final int hashCode() {
            int i2 = this.hashCode;
            if (i2 != 0) {
                return i2;
            }
            int hashCode = (((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", key=").append(this.key);
            sb.append(", value=").append(this.value);
            return sb.replace(0, 2, "ExtendedEntry{").append('}').toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExtendedEntry)) {
                return false;
            }
            ExtendedEntry extendedEntry = (ExtendedEntry) obj;
            if (!unknownFields().equals(extendedEntry.unknownFields()) || !this.key.equals(extendedEntry.key) || !this.value.equals(extendedEntry.value)) {
                return false;
            }
            return true;
        }

        public ExtendedEntry(String str, String str2) {
            this(str, str2, i.EMPTY);
        }

        public ExtendedEntry(String str, String str2, i iVar) {
            super(ADAPTER, iVar);
            this.key = str;
            this.value = str2;
        }
    }

    static final class ProtoAdapter_Frame extends ProtoAdapter<Frame> {
        static {
            Covode.recordClassIndex(16063);
        }

        public ProtoAdapter_Frame() {
            super(FieldEncoding.LENGTH_DELIMITED, Frame.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.common.wschannel.model.Frame$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.common.wschannel.model.Frame redact(com.bytedance.common.wschannel.model.Frame r4) {
            /*
                r3 = this;
                com.bytedance.common.wschannel.model.Frame$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.common.wschannel.model.Frame$ExtendedEntry> r1 = r2.headers
                com.squareup.wire.ProtoAdapter<com.bytedance.common.wschannel.model.Frame$ExtendedEntry> r0 = com.bytedance.common.wschannel.model.Frame.ExtendedEntry.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.common.wschannel.model.Frame r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.model.Frame.ProtoAdapter_Frame.redact(com.bytedance.common.wschannel.model.Frame):com.bytedance.common.wschannel.model.Frame");
        }

        public final int encodedSize(Frame frame) {
            return ProtoAdapter.UINT64.encodedSizeWithTag(1, frame.seqid) + ProtoAdapter.UINT64.encodedSizeWithTag(2, frame.logid) + ProtoAdapter.INT32.encodedSizeWithTag(3, frame.service) + ProtoAdapter.INT32.encodedSizeWithTag(4, frame.method) + ExtendedEntry.ADAPTER.asRepeated().encodedSizeWithTag(5, frame.headers) + ProtoAdapter.STRING.encodedSizeWithTag(6, frame.payload_encoding) + ProtoAdapter.STRING.encodedSizeWithTag(7, frame.payload_type) + ProtoAdapter.BYTES.encodedSizeWithTag(8, frame.payload) + frame.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Frame decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.seqid(ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.logid(ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.service(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.method(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.headers.add(ExtendedEntry.ADAPTER.decode(protoReader));
                } else if (nextTag == 6) {
                    builder.payload_encoding(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 7) {
                    builder.payload_type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 8) {
                    builder.payload(ProtoAdapter.BYTES.decode(protoReader));
                } else {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Frame frame) {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, frame.seqid);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, frame.logid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, frame.service);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, frame.method);
            ExtendedEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frame.headers);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, frame.payload_encoding);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, frame.payload_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, frame.payload);
            protoWriter.writeBytes(frame.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(16058);
    }

    /* Return type fixed from 'com.bytedance.common.wschannel.model.Frame$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Frame, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.seqid = this.seqid;
        builder.logid = this.logid;
        builder.service = this.service;
        builder.method = this.method;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.payload_encoding = this.payload_encoding;
        builder.payload_type = this.payload_type;
        builder.payload = this.payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<Frame, Builder> {
        public List<ExtendedEntry> headers = Internal.newMutableList();
        public Long logid;
        public Integer method;
        public i payload;
        public String payload_encoding;
        public String payload_type;
        public Long seqid;
        public Integer service;

        static {
            Covode.recordClassIndex(16059);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Frame build() {
            Long l2 = this.seqid;
            if (l2 != null && this.logid != null && this.service != null && this.method != null) {
                return new Frame(this.seqid, this.logid, this.service, this.method, this.headers, this.payload_encoding, this.payload_type, this.payload, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "seqid", this.logid, "logid", this.service, "service", this.method, "method");
        }

        public final Builder logid(Long l2) {
            this.logid = l2;
            return this;
        }

        public final Builder method(Integer num) {
            this.method = num;
            return this;
        }

        public final Builder payload(i iVar) {
            this.payload = iVar;
            return this;
        }

        public final Builder payload_encoding(String str) {
            this.payload_encoding = str;
            return this;
        }

        public final Builder payload_type(String str) {
            this.payload_type = str;
            return this;
        }

        public final Builder seqid(Long l2) {
            this.seqid = l2;
            return this;
        }

        public final Builder service(Integer num) {
            this.service = num;
            return this;
        }

        public final Builder headers(List<ExtendedEntry> list) {
            Internal.checkElementsNotNull(list);
            this.headers = list;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((((((((((unknownFields().hashCode() * 37) + this.seqid.hashCode()) * 37) + this.logid.hashCode()) * 37) + this.service.hashCode()) * 37) + this.method.hashCode()) * 37) + this.headers.hashCode()) * 37;
        String str = this.payload_encoding;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.payload_type;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        i iVar = this.payload;
        if (iVar != null) {
            i5 = iVar.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", seqid=").append(this.seqid);
        sb.append(", logid=").append(this.logid);
        sb.append(", service=").append(this.service);
        sb.append(", method=").append(this.method);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=").append(this.headers);
        }
        if (this.payload_encoding != null) {
            sb.append(", payload_encoding=").append(this.payload_encoding);
        }
        if (this.payload_type != null) {
            sb.append(", payload_type=").append(this.payload_type);
        }
        if (this.payload != null) {
            sb.append(", payload=").append(this.payload);
        }
        return sb.replace(0, 2, "Frame{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        if (!unknownFields().equals(frame.unknownFields()) || !this.seqid.equals(frame.seqid) || !this.logid.equals(frame.logid) || !this.service.equals(frame.service) || !this.method.equals(frame.method) || !this.headers.equals(frame.headers) || !Internal.equals(this.payload_encoding, frame.payload_encoding) || !Internal.equals(this.payload_type, frame.payload_type) || !Internal.equals(this.payload, frame.payload)) {
            return false;
        }
        return true;
    }

    public Frame(Long l2, Long l3, Integer num, Integer num2, List<ExtendedEntry> list, String str, String str2, i iVar) {
        this(l2, l3, num, num2, list, str, str2, iVar, i.EMPTY);
    }

    public Frame(Long l2, Long l3, Integer num, Integer num2, List<ExtendedEntry> list, String str, String str2, i iVar, i iVar2) {
        super(ADAPTER, iVar2);
        this.seqid = l2;
        this.logid = l3;
        this.service = num;
        this.method = num2;
        this.headers = Internal.immutableCopyOf("headers", list);
        this.payload_encoding = str;
        this.payload_type = str2;
        this.payload = iVar;
    }
}
