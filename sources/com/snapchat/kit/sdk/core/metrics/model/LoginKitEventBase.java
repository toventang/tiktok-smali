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

public final class LoginKitEventBase extends Message<LoginKitEventBase, Builder> {
    public static final ProtoAdapter<LoginKitEventBase> ADAPTER = new ProtoAdapter_LoginKitEventBase();
    public static final Boolean DEFAULT_IS_FOR_FIREBASE_AUTHENTICATION = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_for_firebase_authentication;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;

    static final class ProtoAdapter_LoginKitEventBase extends ProtoAdapter<LoginKitEventBase> {
        static {
            Covode.recordClassIndex(35723);
        }

        public ProtoAdapter_LoginKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitEventBase.class);
        }

        public final int encodedSize(LoginKitEventBase loginKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitEventBase.kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, loginKitEventBase.is_for_firebase_authentication) + loginKitEventBase.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.KitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.KitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.KitEventBase) r0
                r2.kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.ProtoAdapter_LoginKitEventBase.redact(com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase):com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LoginKitEventBase decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.kit_event_base(KitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_for_firebase_authentication(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LoginKitEventBase loginKitEventBase) {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitEventBase.kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, loginKitEventBase.is_for_firebase_authentication);
            protoWriter.writeBytes(loginKitEventBase.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LoginKitEventBase, Builder> {
        public Boolean is_for_firebase_authentication;
        public KitEventBase kit_event_base;

        static {
            Covode.recordClassIndex(35722);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LoginKitEventBase build() {
            return new LoginKitEventBase(this.kit_event_base, this.is_for_firebase_authentication, super.buildUnknownFields());
        }

        public final Builder is_for_firebase_authentication(Boolean bool) {
            this.is_for_firebase_authentication = bool;
            return this;
        }

        public final Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35721);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LoginKitEventBase, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.is_for_firebase_authentication = this.is_for_firebase_authentication;
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
        KitEventBase kitEventBase = this.kit_event_base;
        int i4 = 0;
        if (kitEventBase != null) {
            i2 = kitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Boolean bool = this.is_for_firebase_authentication;
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
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=").append(this.kit_event_base);
        }
        if (this.is_for_firebase_authentication != null) {
            sb.append(", is_for_firebase_authentication=").append(this.is_for_firebase_authentication);
        }
        return sb.replace(0, 2, "LoginKitEventBase{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitEventBase)) {
            return false;
        }
        LoginKitEventBase loginKitEventBase = (LoginKitEventBase) obj;
        if (!unknownFields().equals(loginKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, loginKitEventBase.kit_event_base) || !Internal.equals(this.is_for_firebase_authentication, loginKitEventBase.is_for_firebase_authentication)) {
            return false;
        }
        return true;
    }

    public LoginKitEventBase(KitEventBase kitEventBase, Boolean bool) {
        this(kitEventBase, bool, i.EMPTY);
    }

    public LoginKitEventBase(KitEventBase kitEventBase, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.kit_event_base = kitEventBase;
        this.is_for_firebase_authentication = bool;
    }
}
