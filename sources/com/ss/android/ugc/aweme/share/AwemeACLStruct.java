package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.Serializable;

public final class AwemeACLStruct {

    /* renamed from: a  reason: collision with root package name */
    public static final AwemeACLStruct f123241a = new AwemeACLStruct();

    /* renamed from: b  reason: collision with root package name */
    private static final h f123242b = i.a((h.f.a.a) a.f123243a);

    public static final ACLCommonStruct a() {
        return (ACLCommonStruct) f123242b.getValue();
    }

    public static final class ACLCommonStruct implements Serializable {
        private int code;
        private String extra = "";
        private int showType = 2;
        private String toastMsg = "";

        static {
            Covode.recordClassIndex(80941);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final String toString() {
            return "code = " + this.code + ", showType = " + this.showType + ", toastMsg = " + this.toastMsg + " extra = " + this.extra;
        }

        public final void setCode(int i2) {
            this.code = i2;
        }

        public final void setShowType(int i2) {
            this.showType = i2;
        }

        public final void setExtra(String str) {
            l.d(str, "");
            this.extra = str;
        }

        public final void setToastMsg(String str) {
            l.d(str, "");
            this.toastMsg = str;
        }
    }

    public static final class ServerExtra implements Serializable {
        private Integer aa = 0;
        private Boolean aac = true;
        private Integer aad = 0;
        private Boolean aas = false;
        private Boolean ad = false;
        private Boolean ap = false;
        private Boolean arw = false;
        private Boolean asa = false;
        private Integer asd = 0;
        private Boolean asr = false;
        private Integer avp = 0;
        private Integer sd = 0;
        private Boolean ss = false;

        static {
            Covode.recordClassIndex(80942);
        }

        public final Integer getAa() {
            return this.aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAd() {
            return this.ad;
        }

        public final Boolean getAp() {
            return this.ap;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.sd;
        }

        public final Boolean getSs() {
            return this.ss;
        }

        public final void setAa(Integer num) {
            this.aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAd(Boolean bool) {
            this.ad = bool;
        }

        public final void setAp(Boolean bool) {
            this.ap = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.sd = num;
        }

        public final void setSs(Boolean bool) {
            this.ss = bool;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean bool;
            Integer num;
            Integer num2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Integer num3;
            Boolean bool5;
            Integer num4;
            l.d(aweme, "");
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Boolean bool6 = null;
            if (author != null) {
                bool = Boolean.valueOf(author.isSecret());
            } else {
                bool = null;
            }
            serverExtra.aas = bool;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                num = Integer.valueOf(author2.getDownloadSetting());
            } else {
                num = null;
            }
            serverExtra.aad = num;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num2 = null;
            }
            serverExtra.avp = num2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                bool2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                bool2 = null;
            }
            serverExtra.arw = bool2;
            serverExtra.aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                bool3 = Boolean.valueOf(awemeControl.canShare());
            } else {
                bool3 = null;
            }
            serverExtra.aac = bool3;
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                bool4 = Boolean.valueOf(status.isReviewed());
            } else {
                bool4 = null;
            }
            serverExtra.asr = bool4;
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            aj<Integer> r = sVar.r();
            if (r != null) {
                num3 = r.c();
            } else {
                num3 = null;
            }
            serverExtra.sd = num3;
            serverExtra.ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null) {
                bool5 = Boolean.valueOf(status2.isAllowShare());
            } else {
                bool5 = null;
            }
            serverExtra.asa = bool5;
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null) {
                num4 = Integer.valueOf(status3.getDownloadStatus());
            } else {
                num4 = null;
            }
            serverExtra.asd = num4;
            VideoControl videoControl2 = aweme.getVideoControl();
            if (videoControl2 != null) {
                bool6 = videoControl2.allowDownload;
            }
            serverExtra.ad = bool6;
            return serverExtra;
        }
    }

    private AwemeACLStruct() {
    }

    static final class a extends m implements h.f.a.a<ACLCommonStruct> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f123243a = new a();

        static {
            Covode.recordClassIndex(80943);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ACLCommonStruct invoke() {
            return new ACLCommonStruct();
        }
    }

    static {
        Covode.recordClassIndex(80940);
    }

    public final String toString() {
        return "ACLCommonStruct = [" + a() + ']';
    }
}
