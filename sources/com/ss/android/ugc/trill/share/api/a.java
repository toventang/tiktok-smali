package com.ss.android.ugc.trill.share.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.share.n;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class a extends c<b<AutoShare>, n> {
    static {
        Covode.recordClassIndex(99046);
    }

    public a() {
        a(new b<AutoShare>() {
            /* class com.ss.android.ugc.trill.share.api.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99047);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.trill.share.api.a.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99048);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        Object obj3 = objArr[2];
                        String str = (String) objArr[3];
                        String str2 = (String) objArr[4];
                        String str3 = (String) objArr[5];
                        String str4 = (String) objArr[6];
                        String str5 = (String) objArr[7];
                        String str6 = (String) objArr[8];
                        String str7 = (String) objArr[9];
                        HashMap hashMap = new HashMap();
                        hashMap.put("platform_type", obj);
                        hashMap.put("share_url", obj2);
                        hashMap.put("share_message", obj3);
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("fb_access_token", str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("twitter_access_token", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("access_token_secret", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            hashMap.put("youtube_code", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            hashMap.put("item_id", str5);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            hashMap.put("youtube_title", str6);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            hashMap.put("youtube_desc", str7);
                        }
                        return ShareApi.f150608a.autoShare(hashMap).execute().f42630b;
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76396h != null && this.f76396h.mData != null && this.f76397i != null) {
            ((n) this.f76397i).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((n) this.f76397i).b();
        }
    }
}
