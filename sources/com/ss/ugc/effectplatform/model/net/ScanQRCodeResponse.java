package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ScanQRCodeResponse extends h<DataNode> {
    private DataNode data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102517);
    }

    public ScanQRCodeResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ScanQRCodeResponse copy$default(ScanQRCodeResponse scanQRCodeResponse, DataNode dataNode, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            dataNode = scanQRCodeResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = scanQRCodeResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = scanQRCodeResponse.status_code;
        }
        return scanQRCodeResponse.copy(dataNode, str, i2);
    }

    public final DataNode component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ScanQRCodeResponse copy(DataNode dataNode, String str, int i2) {
        return new ScanQRCodeResponse(dataNode, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanQRCodeResponse)) {
            return false;
        }
        ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) obj;
        return l.a(this.data, scanQRCodeResponse.data) && l.a(this.message, scanQRCodeResponse.message) && this.status_code == scanQRCodeResponse.status_code;
    }

    public final int hashCode() {
        DataNode dataNode = this.data;
        int i2 = 0;
        int hashCode = (dataNode != null ? dataNode.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "ScanQRCodeResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public static final class DataNode {
        private PlatformEffect effect;
        private List<String> url_prefix;

        static {
            Covode.recordClassIndex(102518);
        }

        public DataNode() {
            this(null, null, 3, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse$DataNode */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataNode copy$default(DataNode dataNode, PlatformEffect platformEffect, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                platformEffect = dataNode.effect;
            }
            if ((i2 & 2) != 0) {
                list = dataNode.url_prefix;
            }
            return dataNode.copy(platformEffect, list);
        }

        public final PlatformEffect component1() {
            return this.effect;
        }

        public final List<String> component2() {
            return this.url_prefix;
        }

        public final DataNode copy(PlatformEffect platformEffect, List<String> list) {
            return new DataNode(platformEffect, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataNode)) {
                return false;
            }
            DataNode dataNode = (DataNode) obj;
            return l.a(this.effect, dataNode.effect) && l.a(this.url_prefix, dataNode.url_prefix);
        }

        public final int hashCode() {
            PlatformEffect platformEffect = this.effect;
            int i2 = 0;
            int hashCode = (platformEffect != null ? platformEffect.hashCode() : 0) * 31;
            List<String> list = this.url_prefix;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "DataNode(effect=" + this.effect + ", url_prefix=" + this.url_prefix + ")";
        }

        public final PlatformEffect getEffect() {
            return this.effect;
        }

        public final List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public final void setEffect(PlatformEffect platformEffect) {
            this.effect = platformEffect;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public DataNode(PlatformEffect platformEffect, List<String> list) {
            this.effect = platformEffect;
            this.url_prefix = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataNode(PlatformEffect platformEffect, List list, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : platformEffect, (i2 & 2) != 0 ? null : list);
        }
    }

    public final DataNode getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final DataNode getResponseData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final boolean checkValue() {
        DataNode dataNode = this.data;
        if (dataNode == null || dataNode.getEffect() == null) {
            return false;
        }
        return true;
    }

    public final void setData(DataNode dataNode) {
        this.data = dataNode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public ScanQRCodeResponse(DataNode dataNode, String str, int i2) {
        this.data = dataNode;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScanQRCodeResponse(DataNode dataNode, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : dataNode, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
