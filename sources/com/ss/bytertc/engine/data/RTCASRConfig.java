package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class RTCASRConfig {
    public String accessToken;
    public String appId;
    public ASRAuthorizationType authorizationType;
    public String cluster;
    public String secretKey;
    public String userId;

    static {
        Covode.recordClassIndex(100860);
    }

    public enum ASRAuthorizationType {
        ASR_AUTHORIZATION_TYPE_TOKEN(0),
        ASR_AUTHORIZATION_TYPE_SIGNATURE(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100861);
        }

        private ASRAuthorizationType(int i2) {
            this.value = i2;
        }
    }

    public RTCASRConfig(String str, String str2, String str3, ASRAuthorizationType aSRAuthorizationType, String str4, String str5) {
        this.userId = str;
        this.accessToken = str2;
        this.secretKey = str3;
        this.authorizationType = aSRAuthorizationType;
        this.cluster = str4;
        this.appId = str5;
    }
}
