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

public final class BatchUnmarkMessageResponseBody extends Message<BatchUnmarkMessageResponseBody, Builder> {
    public static final ProtoAdapter<BatchUnmarkMessageResponseBody> ADAPTER = new ProtoAdapter_BatchUnmarkMessageResponseBody();
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

    static final class ProtoAdapter_BatchUnmarkMessageResponseBody extends ProtoAdapter<BatchUnmarkMessageResponseBody> {
        static {
            Covode.recordClassIndex(23217);
        }

        public ProtoAdapter_BatchUnmarkMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchUnmarkMessageResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody redact(com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody.ProtoAdapter_BatchUnmarkMessageResponseBody.redact(com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody):com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody");
        }

        public final int encodedSize(BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, batchUnmarkMessageResponseBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, batchUnmarkMessageResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, batchUnmarkMessageResponseBody.check_message) + StatusCode.ADAPTER.encodedSizeWithTag(4, batchUnmarkMessageResponseBody.status) + batchUnmarkMessageResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUnmarkMessageResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, batchUnmarkMessageResponseBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, batchUnmarkMessageResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, batchUnmarkMessageResponseBody.check_message);
            StatusCode.ADAPTER.encodeWithTag(protoWriter, 4, batchUnmarkMessageResponseBody.status);
            protoWriter.writeBytes(batchUnmarkMessageResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchUnmarkMessageResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Long server_message_id;
        public StatusCode status;

        static {
            Covode.recordClassIndex(23216);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchUnmarkMessageResponseBody build() {
            return new BatchUnmarkMessageResponseBody(this.server_message_id, this.check_code, this.check_message, this.status, super.buildUnknownFields());
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
        Covode.recordClassIndex(23215);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchUnmarkMessageResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchUnmarkMessageResponseBody, Builder> newBuilder() {
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
        return "BatchUnmarkMessageResponseBody" + h.f38770a.b(this).toString();
    }

    public BatchUnmarkMessageResponseBody(Long l2, Long l3, String str, StatusCode statusCode) {
        this(l2, l3, str, statusCode, i.EMPTY);
    }

    public BatchUnmarkMessageResponseBody(Long l2, Long l3, String str, StatusCode statusCode, i iVar) {
        super(ADAPTER, iVar);
        this.server_message_id = l2;
        this.check_code = l3;
        this.check_message = str;
        this.status = statusCode;
    }
}
