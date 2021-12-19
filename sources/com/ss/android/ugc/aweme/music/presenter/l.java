package com.ss.android.ugc.aweme.music.presenter;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.e;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.i.d;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.q;
import com.ss.android.ugc.aweme.network.a.f;
import com.ss.android.ugc.aweme.utils.fs;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class l<V extends q> extends c<b<MusicDetail>, V> {

    /* renamed from: a  reason: collision with root package name */
    public String f111595a;

    /* renamed from: b  reason: collision with root package name */
    public String f111596b;

    /* renamed from: c  reason: collision with root package name */
    public Long f111597c = 0L;

    /* renamed from: d  reason: collision with root package name */
    public String f111598d = "";

    /* renamed from: e  reason: collision with root package name */
    public Long f111599e = 0L;

    static {
        Covode.recordClassIndex(71712);
    }

    public l() {
        a(new b<MusicDetail>() {
            /* class com.ss.android.ugc.aweme.music.presenter.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71713);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                return objArr != null;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                boolean z;
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length > 0 && TextUtils.isEmpty((String) objArr[0])) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String stackTraceString = Log.getStackTraceString(new Throwable());
                        if (stackTraceString.length() > 1024) {
                            stackTraceString = stackTraceString.substring(0, 1024);
                        }
                        jSONObject.put("error_stack", stackTraceString);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    o.a("music_id_empty", jSONObject);
                }
                if (objArr.length >= 4) {
                    z = ((Boolean) objArr[3]).booleanValue();
                } else {
                    z = false;
                }
                MusicDetail a2 = d.a((String) objArr[0], objArr[1].toString());
                if (a2 == null || z) {
                    n.f68155a.a(this.mHandler, new Callable() {
                        /* class com.ss.android.ugc.aweme.music.presenter.l.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(71714);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            l.this.f111597c = Long.valueOf(SystemClock.elapsedRealtime());
                            l.this.f111595a = (String) objArr[0];
                            if (objArr[1] != null) {
                                l.this.f111596b = objArr[1].toString();
                            }
                            Object[] objArr = objArr;
                            if (objArr.length <= 2 || ((Integer) objArr[2]).intValue() != 1) {
                                Object[] objArr2 = objArr;
                                String str = (String) objArr2[0];
                                int intValue = ((Integer) objArr2[1]).intValue();
                                MusicDetailApi.DetailApi detailApi = MusicDetailApi.f111099a;
                                if (str != null) {
                                    str = str.trim();
                                }
                                return detailApi.queryMusic(str, intValue).get();
                            }
                            Object[] objArr3 = objArr;
                            return MusicDetailApi.f111099a.queryPartnerMusic((String) objArr3[0], (String) objArr3[1]).get();
                        }
                    }, 0);
                } else {
                    handleData(a2);
                    l.this.c();
                }
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void c() {
        String str;
        if (!(this.f76397i == null || this.f76396h == null)) {
            ((q) this.f76397i).a((MusicDetail) this.f76396h.mData);
        }
        String str2 = this.f111595a;
        if (str2 != null && (str = this.f111596b) != null) {
            T t = this.f76396h.mData;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(t, "");
            d.f111507a.a(str2 + '&' + str, new d.b(t, System.currentTimeMillis()));
            fs.a(this.f111598d, "MusicDetail", this.f111599e.longValue(), this.f111597c.longValue(), SystemClock.elapsedRealtime(), f.a(), m.f111603a);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((q) this.f76397i).a(exc);
        }
        String str = this.f111598d;
        if (str != null) {
            e.a(str);
        }
    }
}
