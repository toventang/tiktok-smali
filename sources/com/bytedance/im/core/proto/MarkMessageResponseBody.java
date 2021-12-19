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

public final class MarkMessageResponseBody extends Message<MarkMessageResponseBody, Builder> {
    public static final ProtoAdapter<MarkMessageResponseBody> ADAPTER = new ProtoAdapter_MarkMessageResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final StatusCode DEFAULT_STATUS = StatusCode.OK;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "server_message_id")
    public final Long server_message_id;
    @c(a = "status")
    public final StatusCode status;

    static final class ProtoAdapter_MarkMessageResponseBody extends ProtoAdapter<MarkMessageResponseBody> {
        static {
            Covode.recordClassIndex(23555);
        }

        public ProtoAdapter_MarkMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMessageResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkMessageResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkMessageResponseBody redact(com.bytedance.im.core.proto.MarkMessageResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMessageResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMessageResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkMessageResponseBody.ProtoAdapter_MarkMessageResponseBody.redact(com.bytedance.im.core.proto.MarkMessageResponseBody):com.bytedance.im.core.proto.MarkMessageResponseBody");
        }

        public final int encodedSize(MarkMessageResponseBody markMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, markMessageResponseBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, markMessageResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, markMessageResponseBody.check_message) + StatusCode.ADAPTER.encodedSizeWithTag(4, markMessageResponseBody.status) + markMessageResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMessageResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.status(StatusCode.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkMessageResponseBody markMessageResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markMessageResponseBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, markMessageResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, markMessageResponseBody.check_message);
            StatusCode.ADAPTER.encodeWithTag(protoWriter, 4, markMessageResponseBody.status);
            protoWriter.writeBytes(markMessageResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MarkMessageResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Long server_message_id;
        public StatusCode status;

        static {
            Covode.recordClassIndex(23554);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMessageResponseBody build() {
            return new MarkMessageResponseBody(this.server_message_id, this.check_code, this.check_message, this.status, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder server_message_id(Long l2) {
            this.server_message_id = l2;
            return this;
        }

        public final Builder status(StatusCode statusCode) {
            this.status = statusCode;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23553);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMessageResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMessageResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMessageResponseBody" + h.f38770a.b(this).toString();
    }

    public MarkMessageResponseBody(Long l2, Long l3, String str, StatusCode statusCode) {
        this(l2, l3, str, statusCode, i.EMPTY);
    }

    public MarkMessageResponseBody(Long l2, Long l3, String str, StatusCode statusCode, i iVar) {
        super(ADAPTER, iVar);
        this.server_message_id = l2;
        this.check_code = l3;
        this.check_message = str;
        this.status = statusCode;
    }
}
