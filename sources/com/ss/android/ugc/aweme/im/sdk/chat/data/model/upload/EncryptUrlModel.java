package com.ss.android.ugc.aweme.im.sdk.chat.data.model.upload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p;
import com.ss.android.ugc.aweme.im.service.model.i;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptUrlModel extends UrlModel {
    @c(a = "md5")
    String md5;
    @c(a = "oid")
    String oid;
    @c(a = "skey")
    String skey;

    static {
        Covode.recordClassIndex(64096);
    }

    public String getMd5() {
        return this.md5;
    }

    public String getOid() {
        return this.oid;
    }

    public String getSkey() {
        return this.skey;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setSkey(String str) {
        this.skey = str;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptUrlModel)) {
            return false;
        }
        EncryptUrlModel encryptUrlModel = (EncryptUrlModel) obj;
        if (!TextUtils.equals(this.oid, encryptUrlModel.oid) || !TextUtils.equals(this.skey, encryptUrlModel.skey) || !TextUtils.equals(this.md5, encryptUrlModel.md5)) {
            return false;
        }
        return true;
    }

    public static UrlModel convert(EncryptUrlModel encryptUrlModel) {
        p.a.C2569a aVar;
        String str = null;
        if (encryptUrlModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        String str2 = encryptUrlModel.oid;
        String str3 = encryptUrlModel.skey;
        l.d(str2, "");
        l.d(str3, "");
        i iMSetting = b.b().getIMSetting();
        l.b(iMSetting, "");
        List<String> list = iMSetting.f103908e;
        if (list == null || list.size() <= 0) {
            String[] strArr = p.f102431a;
            aVar = new p.a.C2569a(n.b(Arrays.copyOf(strArr, strArr.length)), str2, str3);
        } else {
            if (list.size() < 3) {
                int size = 3 - list.size();
                int i2 = 0;
                while (i2 < p.f102431a.length && i2 < size) {
                    list.add(p.f102431a[i2]);
                    i2++;
                }
            }
            aVar = new p.a.C2569a(list, str2, str3);
        }
        ArrayList arrayList = new ArrayList();
        String a2 = aVar.a();
        if (aVar.f102438a != null) {
            List<String> list2 = aVar.f102438a;
            if (list2 == null) {
                l.b();
            }
            if (list2.size() > 0) {
                List<String> list3 = aVar.f102438a;
                if (list3 == null) {
                    l.b();
                }
                int size2 = list3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    StringBuilder sb = new StringBuilder();
                    List<String> list4 = aVar.f102438a;
                    if (list4 == null) {
                        l.b();
                    }
                    arrayList.add(sb.append(list4.get(i3)).append(a2).toString());
                }
            }
        }
        urlModel.setUrlList(arrayList);
        String a3 = aVar.a();
        if (aVar.f102438a != null) {
            List<String> list5 = aVar.f102438a;
            if (list5 == null) {
                l.b();
            }
            if (list5.size() > 0) {
                StringBuilder sb2 = new StringBuilder();
                List<String> list6 = aVar.f102438a;
                if (list6 == null) {
                    l.b();
                }
                str = sb2.append(list6.get(0)).append(a3).toString();
            }
        }
        urlModel.setUri(str);
        return urlModel;
    }
}
