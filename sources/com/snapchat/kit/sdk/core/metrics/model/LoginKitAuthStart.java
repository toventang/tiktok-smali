package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class LoginKitAuthStart extends Message<LoginKitAuthStart, Builder> {
    public static final ProtoAdapter<LoginKitAuthStart> ADAPTER = new ProtoAdapter_LoginKitAuthStart();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String features_requested_string_list;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase#ADAPTER", tag = 1)
    public final LoginKitEventBase log_kit_event_base;

    static final class ProtoAdapter_LoginKitAuthStart extends ProtoAdapter<LoginKitAuthStart> {
        static {
            Covode.recordClassIndex(35720);
        }

        public ProtoAdapter_LoginKitAuthStart() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitAuthStart.class);
        }

        public final int encodedSize(LoginKitAuthStart loginKitAuthStart) {
            return LoginKitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitAuthStart.log_kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, loginKitAuthStart.features_requested_string_list) + loginKitAuthStart.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = r2.log_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = r2.log_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase) r0
                r2.log_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart.ProtoAdapter_LoginKitAuthStart.redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart):com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LoginKitAuthStart decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.log_kit_event_base(LoginKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.features_requested_string_list(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LoginKitAuthStart loginKitAuthStart) {
            LoginKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitAuthStart.log_kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, loginKitAuthStart.features_requested_string_list);
            protoWriter.writeBytes(loginKitAuthStart.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LoginKitAuthStart, Builder> {
        public String features_requested_string_list;
        public LoginKitEventBase log_kit_event_base;

        static {
            Covode.recordClassIndex(35719);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LoginKitAuthStart build() {
            return new LoginKitAuthStart(this.log_kit_event_base, this.features_requested_string_list, super.buildUnknownFields());
        }

        public final Builder features_requested_string_list(String str) {
            this.features_requested_string_list = str;
            return this;
        }

        public final Builder log_kit_event_base(LoginKitEventBase loginKitEventBase) {
            this.log_kit_event_base = loginKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35718);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LoginKitAuthStart, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.log_kit_event_base = this.log_kit_event_base;
        builder.features_requested_string_list = this.features_requested_string_list;
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
        LoginKitEventBase loginKitEventBase = this.log_kit_event_base;
        int i4 = 0;
        if (loginKitEventBase != null) {
            i2 = loginKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.features_requested_string_list;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.log_kit_event_base != null) {
            sb.append(", log_kit_event_base=").append(this.log_kit_event_base);
        }
        if (this.features_requested_string_list != null) {
            sb.append(", features_requested_string_list=").append(this.features_requested_string_list);
        }
        return sb.replace(0, 2, "LoginKitAuthStart{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthStart)) {
            return false;
        }
        LoginKitAuthStart loginKitAuthStart = (LoginKitAuthStart) obj;
        if (!unknownFields().equals(loginKitAuthStart.unknownFields()) || !Internal.equals(this.log_kit_event_base, loginKitAuthStart.log_kit_event_base) || !Internal.equals(this.features_requested_string_list, loginKitAuthStart.features_requested_string_list)) {
            return false;
        }
        return true;
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase, String str) {
        this(loginKitEventBase, str, i.EMPTY);
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase, String str, i iVar) {
        super(ADAPTER, iVar);
        this.log_kit_event_base = loginKitEventBase;
        this.features_requested_string_list = str;
    }
}
