package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public final class XUploadImageMethodParamModel extends a {
    public static final a Companion = new a((byte) 0);
    private final String filePath;
    private n header;
    private n params;
    private final String url;

    static {
        Covode.recordClassIndex(21725);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21726);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final n getHeader() {
        return this.header;
    }

    public final n getParams() {
        return this.params;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setHeader(n nVar) {
        this.header = nVar;
    }

    public final void setParams(n nVar) {
        this.params = nVar;
    }

    public static final XUploadImageMethodParamModel convert(n nVar) {
        boolean z;
        l.c(nVar, "");
        String str = i.a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = i.a(nVar, "filePath", "");
        if (str2.length() == 0) {
            return null;
        }
        n b2 = i.b(nVar, "params");
        n b3 = i.b(nVar, "header");
        XUploadImageMethodParamModel xUploadImageMethodParamModel = new XUploadImageMethodParamModel(str, str2);
        if (b2 != null) {
            xUploadImageMethodParamModel.setParams(b2);
        }
        if (b3 != null) {
            xUploadImageMethodParamModel.setHeader(b3);
        }
        return xUploadImageMethodParamModel;
    }

    public XUploadImageMethodParamModel(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.url = str;
        this.filePath = str2;
    }
}
