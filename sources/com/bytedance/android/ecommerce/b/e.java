package com.bytedance.android.ecommerce.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.c.d;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.n;
import java.util.HashMap;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public int f7017a = 10001;

    static {
        Covode.recordClassIndex(3360);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.getInfoByOcr";
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return b.a.PUBLIC;
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, final b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        super.a(nVar, bVar, eVar);
        String a2 = a.a(nVar, "merchant_user_id");
        String a3 = a.a(nVar, "nonce");
        String a4 = a.a(nVar, "merchant_id");
        if (TextUtils.isEmpty(a4)) {
            a.a(0, 101, "merchantId is empty!", bVar);
        } else if (TextUtils.isEmpty(a2)) {
            a.a(0, 101, "merchantUserId is empty!", bVar);
        } else if (TextUtils.isEmpty(a3)) {
            a.a(0, 101, "nonce is empty!", bVar);
        } else {
            c.f7063a.d().q = a3;
            final Handler handler = new Handler(Looper.myLooper(), new Handler.Callback() {
                /* class com.bytedance.android.ecommerce.b.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3361);
                }

                public final boolean handleMessage(Message message) {
                    if (message.what == e.this.f7017a) {
                        try {
                            Bundle data = message.getData();
                            int i2 = data.getInt("code");
                            int i3 = data.getInt("detailCode");
                            String string = data.getString("msg");
                            com.bytedance.android.ecommerce.a.b.b bVar = (com.bytedance.android.ecommerce.a.b.b) message.obj;
                            if (bVar == null) {
                                i3 = 108;
                                i2 = 0;
                            } else if (i2 == 1) {
                                byte[] a2 = bVar.a();
                                HashMap hashMap = new HashMap();
                                hashMap.put("number_corners", a2);
                                hashMap.put("number", bVar.f6918h);
                                b.AbstractC0814b bVar2 = bVar;
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("code", Integer.valueOf(i2));
                                hashMap2.put("detail_code", Integer.valueOf(i3));
                                hashMap2.put("message", string);
                                hashMap2.put("data", hashMap);
                                bVar2.a(hashMap2);
                                return false;
                            }
                            a.a(i2, i3, string, bVar);
                        } catch (Throwable unused) {
                        }
                    }
                    return false;
                }
            });
            Thread.currentThread();
            c.f7063a.k().a(a4, a2, a3, new d() {
                /* class com.bytedance.android.ecommerce.b.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3362);
                }

                @Override // com.bytedance.android.ecommerce.c.d
                public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
                    Message message = new Message();
                    message.what = e.this.f7017a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("code", i2);
                    bundle.putInt("detailCode", i3);
                    bundle.putString("msg", str);
                    message.setData(bundle);
                    message.obj = bVar;
                    handler.sendMessage(message);
                }
            });
        }
    }
}
