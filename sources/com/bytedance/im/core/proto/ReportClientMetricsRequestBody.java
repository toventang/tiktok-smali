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

public final class ReportClientMetricsRequestBody extends Message<ReportClientMetricsRequestBody, Builder> {
    public static final ProtoAdapter<ReportClientMetricsRequestBody> ADAPTER = new ProtoAdapter_ReportClientMetricsRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "report_metrics_list")
    public final List<ClientMetric> report_metrics_list;

    static final class ProtoAdapter_ReportClientMetricsRequestBody extends ProtoAdapter<ReportClientMetricsRequestBody> {
        static {
            Covode.recordClassIndex(23719);
        }

        public ProtoAdapter_ReportClientMetricsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportClientMetricsRequestBody.class);
        }

        public final int encodedSize(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            return ClientMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, reportClientMetricsRequestBody.report_metrics_list) + reportClientMetricsRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ReportClientMetricsRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ReportClientMetricsRequestBody redact(com.bytedance.im.core.proto.ReportClientMetricsRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ReportClientMetricsRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ClientMetric> r1 = r2.report_metrics_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ClientMetric> r0 = com.bytedance.im.core.proto.ClientMetric.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ReportClientMetricsRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ReportClientMetricsRequestBody.ProtoAdapter_ReportClientMetricsRequestBody.redact(com.bytedance.im.core.proto.ReportClientMetricsRequestBody):com.bytedance.im.core.proto.ReportClientMetricsRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReportClientMetricsRequestBody decode(ProtoReader protoReader) {
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
                    builder.report_metrics_list.add(ClientMetric.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            ClientMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reportClientMetricsRequestBody.report_metrics_list);
            protoWriter.writeBytes(reportClientMetricsRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ReportClientMetricsRequestBody, Builder> {
        public List<ClientMetric> report_metrics_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23718);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReportClientMetricsRequestBody build() {
            return new ReportClientMetricsRequestBody(this.report_metrics_list, super.buildUnknownFields());
        }

        public final Builder report_metrics_list(List<ClientMetric> list) {
            Internal.checkElementsNotNull(list);
            this.report_metrics_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23717);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ReportClientMetricsRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ReportClientMetricsRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.report_metrics_list = Internal.copyOf("report_metrics_list", this.report_metrics_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReportClientMetricsRequestBody" + h.f38770a.b(this).toString();
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list) {
        this(list, i.EMPTY);
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list, i iVar) {
        super(ADAPTER, iVar);
        this.report_metrics_list = Internal.immutableCopyOf("report_metrics_list", list);
    }
}
