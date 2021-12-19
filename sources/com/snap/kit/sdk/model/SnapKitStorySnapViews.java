package com.snap.kit.sdk.model;

import com.bytedance.covode.number.Covode;
import com.snap.kit.common.model.DeviceEnvironmentInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class SnapKitStorySnapViews extends Message<SnapKitStorySnapViews, Builder> {
    public static final ProtoAdapter<SnapKitStorySnapViews> ADAPTER = new ProtoAdapter_SnapKitStorySnapViews();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String app_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String client_id;
    @WireField(adapter = "com.snap.kit.common.model.DeviceEnvironmentInfo#ADAPTER", tag = 1)
    public final DeviceEnvironmentInfo device_environment_info;
    @WireField(adapter = "com.snap.kit.sdk.model.SnapKitStorySnapView#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<SnapKitStorySnapView> views;

    static final class ProtoAdapter_SnapKitStorySnapViews extends ProtoAdapter<SnapKitStorySnapViews> {
        static {
            Covode.recordClassIndex(35541);
        }

        public ProtoAdapter_SnapKitStorySnapViews() {
            super(FieldEncoding.LENGTH_DELIMITED, SnapKitStorySnapViews.class);
        }

        public final int encodedSize(SnapKitStorySnapViews snapKitStorySnapViews) {
            return DeviceEnvironmentInfo.ADAPTER.encodedSizeWithTag(1, snapKitStorySnapViews.device_environment_info) + ProtoAdapter.STRING.encodedSizeWithTag(2, snapKitStorySnapViews.client_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, snapKitStorySnapViews.app_id) + SnapKitStorySnapView.ADAPTER.asRepeated().encodedSizeWithTag(4, snapKitStorySnapViews.views) + snapKitStorySnapViews.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snap.kit.sdk.model.SnapKitStorySnapViews$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.sdk.model.SnapKitStorySnapViews redact(com.snap.kit.sdk.model.SnapKitStorySnapViews r4) {
            /*
                r3 = this;
                com.snap.kit.sdk.model.SnapKitStorySnapViews$Builder r2 = r4.newBuilder()
                com.snap.kit.common.model.DeviceEnvironmentInfo r0 = r2.device_environment_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snap.kit.common.model.DeviceEnvironmentInfo> r1 = com.snap.kit.common.model.DeviceEnvironmentInfo.ADAPTER
                com.snap.kit.common.model.DeviceEnvironmentInfo r0 = r2.device_environment_info
                java.lang.Object r0 = r1.redact(r0)
                com.snap.kit.common.model.DeviceEnvironmentInfo r0 = (com.snap.kit.common.model.DeviceEnvironmentInfo) r0
                r2.device_environment_info = r0
            L_0x0014:
                java.util.List<com.snap.kit.sdk.model.SnapKitStorySnapView> r1 = r2.views
                com.squareup.wire.ProtoAdapter<com.snap.kit.sdk.model.SnapKitStorySnapView> r0 = com.snap.kit.sdk.model.SnapKitStorySnapView.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.snap.kit.sdk.model.SnapKitStorySnapViews r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.sdk.model.SnapKitStorySnapViews.ProtoAdapter_SnapKitStorySnapViews.redact(com.snap.kit.sdk.model.SnapKitStorySnapViews):com.snap.kit.sdk.model.SnapKitStorySnapViews");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SnapKitStorySnapViews decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.device_environment_info(DeviceEnvironmentInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.client_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.app_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.views.add(SnapKitStorySnapView.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SnapKitStorySnapViews snapKitStorySnapViews) {
            DeviceEnvironmentInfo.ADAPTER.encodeWithTag(protoWriter, 1, snapKitStorySnapViews.device_environment_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, snapKitStorySnapViews.client_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, snapKitStorySnapViews.app_id);
            SnapKitStorySnapView.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, snapKitStorySnapViews.views);
            protoWriter.writeBytes(snapKitStorySnapViews.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35539);
    }

    public static final class Builder extends Message.Builder<SnapKitStorySnapViews, Builder> {
        public String app_id;
        public String client_id;
        public DeviceEnvironmentInfo device_environment_info;
        public List<SnapKitStorySnapView> views = Internal.newMutableList();

        static {
            Covode.recordClassIndex(35540);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SnapKitStorySnapViews build() {
            return new SnapKitStorySnapViews(this.device_environment_info, this.client_id, this.app_id, this.views, super.buildUnknownFields());
        }

        public final Builder app_id(String str) {
            this.app_id = str;
            return this;
        }

        public final Builder client_id(String str) {
            this.client_id = str;
            return this;
        }

        public final Builder device_environment_info(DeviceEnvironmentInfo deviceEnvironmentInfo) {
            this.device_environment_info = deviceEnvironmentInfo;
            return this;
        }

        public final Builder views(List<SnapKitStorySnapView> list) {
            Internal.checkElementsNotNull(list);
            this.views = list;
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
        int hashCode = unknownFields().hashCode() * 37;
        DeviceEnvironmentInfo deviceEnvironmentInfo = this.device_environment_info;
        int i5 = 0;
        if (deviceEnvironmentInfo != null) {
            i2 = deviceEnvironmentInfo.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.client_id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str2 = this.app_id;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int hashCode2 = ((i7 + i5) * 37) + this.views.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    /* Return type fixed from 'com.snap.kit.sdk.model.SnapKitStorySnapViews$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SnapKitStorySnapViews, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.device_environment_info = this.device_environment_info;
        builder.client_id = this.client_id;
        builder.app_id = this.app_id;
        builder.views = Internal.copyOf("views", this.views);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.device_environment_info != null) {
            sb.append(", device_environment_info=").append(this.device_environment_info);
        }
        if (this.client_id != null) {
            sb.append(", client_id=").append(this.client_id);
        }
        if (this.app_id != null) {
            sb.append(", app_id=").append(this.app_id);
        }
        if (!this.views.isEmpty()) {
            sb.append(", views=").append(this.views);
        }
        return sb.replace(0, 2, "SnapKitStorySnapViews{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SnapKitStorySnapViews)) {
            return false;
        }
        SnapKitStorySnapViews snapKitStorySnapViews = (SnapKitStorySnapViews) obj;
        if (!unknownFields().equals(snapKitStorySnapViews.unknownFields()) || !Internal.equals(this.device_environment_info, snapKitStorySnapViews.device_environment_info) || !Internal.equals(this.client_id, snapKitStorySnapViews.client_id) || !Internal.equals(this.app_id, snapKitStorySnapViews.app_id) || !this.views.equals(snapKitStorySnapViews.views)) {
            return false;
        }
        return true;
    }

    public SnapKitStorySnapViews(DeviceEnvironmentInfo deviceEnvironmentInfo, String str, String str2, List<SnapKitStorySnapView> list) {
        this(deviceEnvironmentInfo, str, str2, list, i.EMPTY);
    }

    public SnapKitStorySnapViews(DeviceEnvironmentInfo deviceEnvironmentInfo, String str, String str2, List<SnapKitStorySnapView> list, i iVar) {
        super(ADAPTER, iVar);
        this.device_environment_info = deviceEnvironmentInfo;
        this.client_id = str;
        this.app_id = str2;
        this.views = Internal.immutableCopyOf("views", list);
    }
}
