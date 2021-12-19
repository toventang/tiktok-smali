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

public final class LoginKitAuthComplete extends Message<LoginKitAuthComplete, Builder> {
    public static final ProtoAdapter<LoginKitAuthComplete> ADAPTER = new ProtoAdapter_LoginKitAuthComplete();
    public static final Boolean DEFAULT_IS_SUCCESS = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_success;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase#ADAPTER", tag = 1)
    public final LoginKitEventBase log_kit_event_base;

    static final class ProtoAdapter_LoginKitAuthComplete extends ProtoAdapter<LoginKitAuthComplete> {
        static {
            Covode.recordClassIndex(35717);
        }

        public ProtoAdapter_LoginKitAuthComplete() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitAuthComplete.class);
        }

        public final int encodedSize(LoginKitAuthComplete loginKitAuthComplete) {
            return LoginKitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitAuthComplete.log_kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, loginKitAuthComplete.is_success) + loginKitAuthComplete.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = r2.log_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = r2.log_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase) r0
                r2.log_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete.ProtoAdapter_LoginKitAuthComplete.redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete):com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LoginKitAuthComplete decode(ProtoReader protoReader) {
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
                    builder.is_success(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LoginKitAuthComplete loginKitAuthComplete) {
            LoginKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitAuthComplete.log_kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, loginKitAuthComplete.is_success);
            protoWriter.writeBytes(loginKitAuthComplete.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LoginKitAuthComplete, Builder> {
        public Boolean is_success;
        public LoginKitEventBase log_kit_event_base;

        static {
            Covode.recordClassIndex(35716);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LoginKitAuthComplete build() {
            return new LoginKitAuthComplete(this.log_kit_event_base, this.is_success, super.buildUnknownFields());
        }

        public final Builder is_success(Boolean bool) {
            this.is_success = bool;
            return this;
        }

        public final Builder log_kit_event_base(LoginKitEventBase loginKitEventBase) {
            this.log_kit_event_base = loginKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35715);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LoginKitAuthComplete, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.log_kit_event_base = this.log_kit_event_base;
        builder.is_success = this.is_success;
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
        Boolean bool = this.is_success;
        if (bool != null) {
            i4 = bool.hashCode();
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
        if (this.is_success != null) {
            sb.append(", is_success=").append(this.is_success);
        }
        return sb.replace(0, 2, "LoginKitAuthComplete{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthComplete)) {
            return false;
        }
        LoginKitAuthComplete loginKitAuthComplete = (LoginKitAuthComplete) obj;
        if (!unknownFields().equals(loginKitAuthComplete.unknownFields()) || !Internal.equals(this.log_kit_event_base, loginKitAuthComplete.log_kit_event_base) || !Internal.equals(this.is_success, loginKitAuthComplete.is_success)) {
            return false;
        }
        return true;
    }

    public LoginKitAuthComplete(LoginKitEventBase loginKitEventBase, Boolean bool) {
        this(loginKitEventBase, bool, i.EMPTY);
    }

    public LoginKitAuthComplete(LoginKitEventBase loginKitEventBase, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.log_kit_event_base = loginKitEventBase;
        this.is_success = bool;
    }
}
