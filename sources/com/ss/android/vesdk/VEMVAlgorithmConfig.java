package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VEMVAlgorithmConfig {
    public AlgorithmInfo[] infos;

    static {
        Covode.recordClassIndex(99184);
    }

    public enum MV_REESULT_IN_TYPE {
        MV_REESULT_IN_TYPE_IMAGE,
        MV_REESULT_IN_TYPE_VIDEO,
        MV_REESULT_IN_TYPE_JSON;

        static {
            Covode.recordClassIndex(99187);
        }
    }

    public enum MV_REESULT_OUT_TYPE {
        MV_REESULT_OUT_TYPE_IMAGE,
        MV_REESULT_OUT_TYPE_VIDEO,
        MV_REESULT_OUT_TYPE_IMAGE_AND_JSON,
        MV_REESULT_OUT_TYPE_VIDEO_AND_JSON,
        MV_REESULT_OUT_TYPE_JSON,
        MV_REESULT_OUT_TYPE_INVALID;

        static {
            Covode.recordClassIndex(99188);
        }
    }

    public class AlgorithmInfo {
        public AlgorithmItem[] items;
        public String photoPath;

        static {
            Covode.recordClassIndex(99185);
        }

        public AlgorithmInfo() {
        }

        public class AlgorithmItem {
            public String algorithmName;
            public String algorithmParamJson;
            public boolean isNeedServerExecute;
            public MV_REESULT_OUT_TYPE result_out_type;

            static {
                Covode.recordClassIndex(99186);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z) {
                this(algorithmInfo, str, z, null);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z, String str2) {
                this(str, z, str2, -1);
            }

            public AlgorithmItem(String str, boolean z, String str2, int i2) {
                this.algorithmName = str;
                this.isNeedServerExecute = z;
                this.algorithmParamJson = str2;
                if (i2 == 0) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE;
                } else if (i2 == 1) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO;
                } else if (i2 == 2) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON;
                } else if (i2 == 3) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON;
                } else if (i2 == 4) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_JSON;
                } else {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_INVALID;
                }
            }
        }
    }
}
