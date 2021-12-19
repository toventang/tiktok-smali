package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.multipart.Part;
import com.kakao.network.response.ResponseData;
import com.kakao.util.helper.log.Logger;
import java.util.Map;

public class NetworkTask {
    private final INetwork network;

    static {
        Covode.recordClassIndex(34366);
    }

    public NetworkTask() {
        this.network = new KakaoNetworkImpl();
    }

    public NetworkTask(INetwork iNetwork) {
        this.network = iNetwork;
    }

    public ResponseData request(IRequest iRequest) {
        try {
            this.network.create(iRequest.getUrl(), iRequest.getMethod(), iRequest.getBodyEncoding());
            Map<String, String> headers = iRequest.getHeaders();
            Logger.d(headers.toString());
            for (String str : headers.keySet()) {
                if (!str.equalsIgnoreCase("Expect")) {
                    this.network.addHeader(str, headers.get(str));
                } else {
                    throw new IllegalStateException("Expect: 100-Continue not supported");
                }
            }
            Map<String, String> params = iRequest.getParams();
            for (String str2 : params.keySet()) {
                this.network.addParam(str2, params.get(str2));
            }
            for (Part part : iRequest.getMultiPartList()) {
                this.network.addPart(part);
            }
            this.network.configure();
            this.network.connect();
            int statusCode = this.network.getStatusCode();
            Logger.d("++ httpStatus : [%s]", Integer.valueOf(statusCode));
            return new ResponseData(statusCode, this.network.readFully());
        } finally {
            this.network.disconnect();
        }
    }
}
