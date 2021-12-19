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

public final class UnReadCountReportRequestBody extends Message<UnReadCountReportRequestBody, Builder> {
    public static final ProtoAdapter<UnReadCountReportRequestBody> ADAPTER = new ProtoAdapter_UnReadCountReportRequestBody();
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conv_unread_count")
    public final List<ConvCountReport> conv_unread_count;
    @c(a = "total_unread_count")
    public final Long total_unread_count;

    static final class ProtoAdapter_UnReadCountReportRequestBody extends ProtoAdapter<UnReadCountReportRequestBody> {
        static {
            Covode.recordClassIndex(23794);
        }

        public ProtoAdapter_UnReadCountReportRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UnReadCountReportRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.UnReadCountReportRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UnReadCountReportRequestBody redact(com.bytedance.im.core.proto.UnReadCountReportRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.UnReadCountReportRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConvCountReport> r1 = r2.conv_unread_count
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConvCountReport> r0 = com.bytedance.im.core.proto.ConvCountReport.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.UnReadCountReportRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UnReadCountReportRequestBody.ProtoAdapter_UnReadCountReportRequestBody.redact(com.bytedance.im.core.proto.UnReadCountReportRequestBody):com.bytedance.im.core.proto.UnReadCountReportRequestBody");
        }

        public final int encodedSize(UnReadCountReportRequestBody unReadCountReportRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, unReadCountReportRequestBody.total_unread_count) + ConvCountReport.ADAPTER.asRepeated().encodedSizeWithTag(2, unReadCountReportRequestBody.conv_unread_count) + unReadCountReportRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UnReadCountReportRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.total_unread_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conv_unread_count.add(ConvCountReport.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UnReadCountReportRequestBody unReadCountReportRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, unReadCountReportRequestBody.total_unread_count);
            ConvCountReport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, unReadCountReportRequestBody.conv_unread_count);
            protoWriter.writeBytes(unReadCountReportRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UnReadCountReportRequestBody, Builder> {
        public List<ConvCountReport> conv_unread_count = Internal.newMutableList();
        public Long total_unread_count;

        static {
            Covode.recordClassIndex(23793);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UnReadCountReportRequestBody build() {
            return new UnReadCountReportRequestBody(this.total_unread_count, this.conv_unread_count, super.buildUnknownFields());
        }

        public final Builder total_unread_count(Long l2) {
            this.total_unread_count = l2;
            return this;
        }

        public final Builder conv_unread_count(List<ConvCountReport> list) {
            Internal.checkElementsNotNull(list);
            this.conv_unread_count = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23792);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UnReadCountReportRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UnReadCountReportRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.total_unread_count = this.total_unread_count;
        builder.conv_unread_count = Internal.copyOf("conv_unread_count", this.conv_unread_count);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UnReadCountReportRequestBody" + h.f38770a.b(this).toString();
    }

    public UnReadCountReportRequestBody(Long l2, List<ConvCountReport> list) {
        this(l2, list, i.EMPTY);
    }

    public UnReadCountReportRequestBody(Long l2, List<ConvCountReport> list, i iVar) {
        super(ADAPTER, iVar);
        this.total_unread_count = l2;
        this.conv_unread_count = Internal.immutableCopyOf("conv_unread_count", list);
    }
}
